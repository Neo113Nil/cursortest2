package com.liulishuo.filedownloader.util;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import cn.hutool.core.util.l;
import com.google.common.net.HttpHeaders;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class f {
    private static final String FILEDOWNLOADER_PREFIX = "FileDownloader";
    private static final String INTERNAL_DOCUMENT_NAME = "filedownloader";
    private static final String OLD_FILE_CONVERTED_FILE_NAME = ".old_file_converted";
    private static String defaultSaveRootPath = null;
    private static Boolean filenameConverted = null;
    private static Boolean isDownloaderProcess = null;
    private static int minProgressStep = 65536;
    private static long minProgressTime = 2000;
    private static final Pattern CONTENT_DISPOSITION_WITH_ASTERISK_PATTERN = Pattern.compile("attachment;\\s*filename\\*\\s*=\\s*\"*([^\"]*)'\\S*'([^\"]*)\"*");
    private static final Pattern CONTENT_DISPOSITION_WITHOUT_ASTERISK_PATTERN = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"*([^\"\\n]*)\"*");

    public static boolean checkPermission(String str) {
        return c.getAppContext().checkCallingOrSelfPermission(str) == 0;
    }

    public static long convertContentLengthString(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static String[] convertHeaderString(String str) {
        String[] split = str.split("\n");
        String[] strArr = new String[split.length * 2];
        for (int i8 = 0; i8 < split.length; i8++) {
            String[] split2 = split[i8].split(": ");
            int i9 = i8 * 2;
            strArr[i9] = split2[0];
            strArr[i9 + 1] = split2[1];
        }
        return strArr;
    }

    public static com.liulishuo.filedownloader.stream.a createOutputStream(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("found invalid internal destination path, empty");
        }
        if (!isFilenameValid(str)) {
            throw new RuntimeException(formatString("found invalid internal destination filename %s", str));
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            throw new RuntimeException(formatString("found invalid internal destination path[%s], & path is directory[%B]", str, Boolean.valueOf(file.isDirectory())));
        }
        if (file.exists() || file.createNewFile()) {
            return com.liulishuo.filedownloader.download.b.getImpl().createOutputStream(file);
        }
        throw new IOException(formatString("create new file error  %s", file.getAbsolutePath()));
    }

    public static String defaultUserAgent() {
        return formatString("FileDownloader/%s", "1.7.7");
    }

    public static void deleteTargetFile(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void deleteTaskFiles(String str, String str2) {
        deleteTempFile(str2);
        deleteTargetFile(str);
    }

    public static void deleteTempFile(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static long findContentLength(int i8, com.liulishuo.filedownloader.connection.b bVar) {
        long convertContentLengthString = convertContentLengthString(bVar.getResponseHeaderField("Content-Length"));
        String responseHeaderField = bVar.getResponseHeaderField(HttpHeaders.TRANSFER_ENCODING);
        if (convertContentLengthString < 0) {
            convertContentLengthString = -1;
            if (responseHeaderField == null || !responseHeaderField.equals("chunked")) {
                if (!e.getImpl().httpLenient) {
                    throw new FileDownloadGiveUpRetryException("can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties");
                }
                if (d.NEED_LOG) {
                    d.d(f.class, "%d response header is not legal but HTTP lenient is true, so handle as the case of transfer encoding chunk", Integer.valueOf(i8));
                }
            }
        }
        return convertContentLengthString;
    }

    public static long findContentLengthFromContentRange(com.liulishuo.filedownloader.connection.b bVar) {
        long parseContentLengthFromContentRange = parseContentLengthFromContentRange(getContentRangeHeader(bVar));
        if (parseContentLengthFromContentRange < 0) {
            return -1L;
        }
        return parseContentLengthFromContentRange;
    }

    public static String findEtag(int i8, com.liulishuo.filedownloader.connection.b bVar) {
        if (bVar == null) {
            throw new RuntimeException("connection is null when findEtag");
        }
        String responseHeaderField = bVar.getResponseHeaderField("Etag");
        if (d.NEED_LOG) {
            d.d(f.class, "etag find %s for task(%d)", responseHeaderField, Integer.valueOf(i8));
        }
        return responseHeaderField;
    }

    static String findFileNameFromUrl(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                String path = new URL(str).getPath();
                String substring = path.substring(path.lastIndexOf(47) + 1);
                if (substring.isEmpty()) {
                    return null;
                }
                return substring;
            } catch (MalformedURLException unused) {
            }
        }
        return null;
    }

    public static String findFilename(com.liulishuo.filedownloader.connection.b bVar, String str) {
        String parseContentDisposition = parseContentDisposition(bVar.getResponseHeaderField("Content-Disposition"));
        if (TextUtils.isEmpty(parseContentDisposition)) {
            parseContentDisposition = findFileNameFromUrl(str);
        }
        if (TextUtils.isEmpty(parseContentDisposition)) {
            return generateFileName(str);
        }
        if (parseContentDisposition.contains("../")) {
            throw new FileDownloadSecurityException(formatString("The filename [%s] from the response is not allowable, because it contains '../', which can raise the directory traversal vulnerability", parseContentDisposition));
        }
        return parseContentDisposition;
    }

    public static long findInstanceLengthForTrial(com.liulishuo.filedownloader.connection.b bVar) {
        long findInstanceLengthFromContentRange = findInstanceLengthFromContentRange(bVar);
        if (findInstanceLengthFromContentRange < 0) {
            d.w(f.class, "don't get instance length fromContent-Range header", new Object[0]);
            findInstanceLengthFromContentRange = -1;
        }
        if (findInstanceLengthFromContentRange == 0 && e.getImpl().trialConnectionHeadMethod) {
            return -1L;
        }
        return findInstanceLengthFromContentRange;
    }

    public static long findInstanceLengthFromContentRange(com.liulishuo.filedownloader.connection.b bVar) {
        return parseContentRangeFoInstanceLength(getContentRangeHeader(bVar));
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static String generateFileName(String str) {
        return md5(str);
    }

    public static String generateFilePath(String str, String str2) {
        if (str2 == null) {
            throw new IllegalStateException("can't generate real path, the file name is null");
        }
        if (str != null) {
            return formatString("%s%s%s", str, File.separator, str2);
        }
        throw new IllegalStateException("can't generate real path, the directory is null");
    }

    public static int generateId(String str, String str2) {
        return com.liulishuo.filedownloader.download.b.getImpl().getIdGeneratorInstance().generateId(str, str2, false);
    }

    private static String getContentRangeHeader(com.liulishuo.filedownloader.connection.b bVar) {
        return bVar.getResponseHeaderField("Content-Range");
    }

    public static File getConvertedMarkedFile(Context context) {
        return new File(context.getFilesDir().getAbsolutePath() + File.separator + "filedownloader", OLD_FILE_CONVERTED_FILE_NAME);
    }

    public static String getDefaultSaveFilePath(String str) {
        return generateFilePath(getDefaultSaveRootPath(), generateFileName(str));
    }

    public static String getDefaultSaveRootPath() {
        return !TextUtils.isEmpty(defaultSaveRootPath) ? defaultSaveRootPath : (c.getAppContext().getExternalCacheDir() == null || !Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageDirectory().getFreeSpace() <= 0) ? c.getAppContext().getCacheDir().getAbsolutePath() : c.getAppContext().getExternalCacheDir().getAbsolutePath();
    }

    public static long getFreeSpaceBytes(String str) {
        return new StatFs(str).getAvailableBytes();
    }

    public static int getMinProgressStep() {
        return minProgressStep;
    }

    public static long getMinProgressTime() {
        return minProgressTime;
    }

    public static String getParent(String str) {
        int length = str.length();
        char c8 = File.separatorChar;
        int i8 = (c8 == '\\' && length > 2 && str.charAt(1) == ':') ? 2 : 0;
        int lastIndexOf = str.lastIndexOf(c8);
        int i9 = (lastIndexOf != -1 || i8 <= 0) ? lastIndexOf : 2;
        if (i9 == -1 || str.charAt(length - 1) == c8) {
            return null;
        }
        return (str.indexOf(c8) == i9 && str.charAt(i8) == c8) ? str.substring(0, i9 + 1) : str.substring(0, i9);
    }

    public static String getStack() {
        return getStack(true);
    }

    public static String getTargetFilePath(String str, boolean z7, String str2) {
        if (str == null) {
            return null;
        }
        if (!z7) {
            return str;
        }
        if (str2 == null) {
            return null;
        }
        return generateFilePath(str, str2);
    }

    public static String getTempPath(String str) {
        return formatString("%s.temp", str);
    }

    public static String getThreadPoolName(String str) {
        return "FileDownloader-" + str;
    }

    public static boolean isAcceptRange(int i8, com.liulishuo.filedownloader.connection.b bVar) {
        if (i8 == 206 || i8 == 1) {
            return true;
        }
        return "bytes".equals(bVar.getResponseHeaderField(HttpHeaders.ACCEPT_RANGES));
    }

    private static boolean isAppOnForeground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isInteractive()) {
            return false;
        }
        String packageName = context.getApplicationContext().getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBreakpointAvailable(int i8, FileDownloadModel fileDownloadModel) {
        return isBreakpointAvailable(i8, fileDownloadModel, null);
    }

    public static boolean isDownloaderProcess(Context context) {
        boolean z7;
        Boolean bool = isDownloaderProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!e.getImpl().processNonSeparate) {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z7 = false;
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == myPid) {
                            z7 = next.processName.endsWith(":filedownloader");
                            break;
                        }
                    }
                } else {
                    d.w(f.class, "The running app process info list from ActivityManager is null or empty, maybe current App is not running.", new Object[0]);
                    return false;
                }
            } else {
                d.w(f.class, "fail to get the activity manager!", new Object[0]);
                return false;
            }
        } else {
            z7 = true;
        }
        Boolean valueOf = Boolean.valueOf(z7);
        isDownloaderProcess = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean isFilenameConverted(Context context) {
        if (filenameConverted == null) {
            filenameConverted = Boolean.valueOf(getConvertedMarkedFile(context).exists());
        }
        return filenameConverted.booleanValue();
    }

    public static boolean isFilenameValid(String str) {
        return true;
    }

    public static boolean isNeedSync(long j8, long j9) {
        return j8 > ((long) getMinProgressStep()) && j9 > getMinProgressTime();
    }

    public static boolean isNetworkNotOnWifiType() {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.getAppContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            d.w(f.class, "failed to get connectivity manager!", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static void markConverted(Context context) {
        File convertedMarkedFile = getConvertedMarkedFile(context);
        try {
            convertedMarkedFile.getParentFile().mkdirs();
            convertedMarkedFile.createNewFile();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static String md5(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(l.UTF_8));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b8 : digest) {
                int i8 = b8 & 255;
                if (i8 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i8));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new RuntimeException("Huh, MD5 should be supported?", e9);
        }
    }

    public static boolean needMakeServiceForeground(Context context) {
        return Build.VERSION.SDK_INT >= 26 && !isAppOnForeground(context);
    }

    public static String parseContentDisposition(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        try {
            matcher = CONTENT_DISPOSITION_WITH_ASTERISK_PATTERN.matcher(str);
        } catch (UnsupportedEncodingException | IllegalStateException unused) {
        }
        if (matcher.find()) {
            return URLDecoder.decode(matcher.group(2), matcher.group(1));
        }
        Matcher matcher2 = CONTENT_DISPOSITION_WITHOUT_ASTERISK_PATTERN.matcher(str);
        if (matcher2.find()) {
            return matcher2.group(1);
        }
        return null;
    }

    public static long parseContentLengthFromContentRange(String str) {
        if (str != null && str.length() != 0) {
            try {
                Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
                if (matcher.find()) {
                    return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                }
            } catch (Exception e8) {
                d.e(f.class, e8, "parse content length from content range error", new Object[0]);
            }
        }
        return -1L;
    }

    public static long parseContentRangeFoInstanceLength(String str) {
        if (str == null) {
            return -1L;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException unused) {
                d.w(f.class, "parse instance length failed with %s", str);
            }
        }
        return -1L;
    }

    public static void setDefaultSaveRootPath(String str) {
        defaultSaveRootPath = str;
    }

    public static void setMinProgressStep(int i8) {
        if (!isDownloaderProcess(c.getAppContext())) {
            throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'.");
        }
        minProgressStep = i8;
    }

    public static void setMinProgressTime(long j8) {
        if (!isDownloaderProcess(c.getAppContext())) {
            throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'.");
        }
        minProgressTime = j8;
    }

    public static String getStack(boolean z7) {
        return getStack(new Throwable().getStackTrace(), z7);
    }

    public static boolean isBreakpointAvailable(int i8, FileDownloadModel fileDownloadModel, Boolean bool) {
        if (fileDownloadModel == null) {
            if (d.NEED_LOG) {
                d.d(f.class, "can't continue %d model == null", Integer.valueOf(i8));
            }
            return false;
        }
        if (fileDownloadModel.getTempFilePath() != null) {
            return isBreakpointAvailable(i8, fileDownloadModel, fileDownloadModel.getTempFilePath(), bool);
        }
        if (d.NEED_LOG) {
            d.d(f.class, "can't continue %d temp path == null", Integer.valueOf(i8));
        }
        return false;
    }

    public static int generateId(String str, String str2, boolean z7) {
        return com.liulishuo.filedownloader.download.b.getImpl().getIdGeneratorInstance().generateId(str, str2, z7);
    }

    public static String getStack(StackTraceElement[] stackTraceElementArr, boolean z7) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 4) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 3; i8 < stackTraceElementArr.length; i8++) {
            if (stackTraceElementArr[i8].getClassName().contains("com.liulishuo.filedownloader")) {
                sb.append("[");
                sb.append(stackTraceElementArr[i8].getClassName().substring(28));
                sb.append(":");
                sb.append(stackTraceElementArr[i8].getMethodName());
                if (z7) {
                    sb.append("(");
                    sb.append(stackTraceElementArr[i8].getLineNumber());
                    sb.append(")]");
                } else {
                    sb.append("]");
                }
            }
        }
        return sb.toString();
    }

    public static boolean isBreakpointAvailable(int i8, FileDownloadModel fileDownloadModel, String str, Boolean bool) {
        if (str == null) {
            if (d.NEED_LOG) {
                d.d(f.class, "can't continue %d path = null", Integer.valueOf(i8));
            }
        } else {
            File file = new File(str);
            boolean exists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (exists && !isDirectory) {
                long length = file.length();
                long soFar = fileDownloadModel.getSoFar();
                if (fileDownloadModel.getConnectionCount() <= 1 && soFar == 0) {
                    if (d.NEED_LOG) {
                        d.d(f.class, "can't continue %d the downloaded-record is zero.", Integer.valueOf(i8));
                    }
                } else {
                    long total = fileDownloadModel.getTotal();
                    if (length >= soFar && (total == -1 || (length <= total && soFar < total))) {
                        if (bool == null || bool.booleanValue() || total != length) {
                            return true;
                        }
                        if (d.NEED_LOG) {
                            d.d(f.class, "can't continue %d, because of the output stream doesn't support seek, but the task has already pre-allocated, so we only can download it from the very beginning.", Integer.valueOf(i8));
                        }
                    } else if (d.NEED_LOG) {
                        d.d(f.class, "can't continue %d dirty data fileLength[%d] sofar[%d] total[%d]", Integer.valueOf(i8), Long.valueOf(length), Long.valueOf(soFar), Long.valueOf(total));
                    }
                }
            } else if (d.NEED_LOG) {
                d.d(f.class, "can't continue %d file not suit, exists[%B], directory[%B]", Integer.valueOf(i8), Boolean.valueOf(exists), Boolean.valueOf(isDirectory));
            }
        }
        return false;
    }
}
