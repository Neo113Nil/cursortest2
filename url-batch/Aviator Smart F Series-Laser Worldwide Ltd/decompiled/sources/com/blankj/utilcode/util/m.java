package com.blankj.utilcode.util;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public final class m {
    private static final String LINE_SEP = System.getProperty("line.separator");

    static class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return true;
        }
    }

    static class b implements FileFilter {
        b() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isFile();
        }
    }

    static class c implements FileFilter {
        c() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return true;
        }
    }

    public interface d {
        boolean a(File file, File file2);
    }

    private m() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean copy(String str, String str2) {
        return copy(getFileByPath(str), getFileByPath(str2), (d) null);
    }

    private static boolean copyDir(File file, File file2, d dVar) {
        return copyOrMoveDir(file, file2, dVar, false);
    }

    private static boolean copyFile(File file, File file2, d dVar) {
        return copyOrMoveFile(file, file2, dVar, false);
    }

    private static boolean copyOrMoveDir(File file, File file2, d dVar, boolean z7) {
        if (file == null || file2 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        String str = File.separator;
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = file2.getPath() + str;
        if (str2.contains(sb2) || !file.exists() || !file.isDirectory() || !createOrExistsDir(file2)) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file3 : listFiles) {
                File file4 = new File(str2 + file3.getName());
                if (file3.isFile()) {
                    if (!copyOrMoveFile(file3, file4, dVar, z7)) {
                        return false;
                    }
                } else if (file3.isDirectory() && !copyOrMoveDir(file3, file4, dVar, z7)) {
                    return false;
                }
            }
        }
        return !z7 || deleteDir(file);
    }

    private static boolean copyOrMoveFile(File file, File file2, d dVar, boolean z7) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile()) {
            if (file2.exists()) {
                if (dVar != null && !dVar.a(file, file2)) {
                    return true;
                }
                if (!file2.delete()) {
                    return false;
                }
            }
            if (!createOrExistsDir(file2.getParentFile())) {
                return false;
            }
            try {
                if (!c1.writeFileFromIS(file2.getAbsolutePath(), new FileInputStream(file))) {
                    return false;
                }
                if (z7) {
                    if (!deleteFile(file)) {
                        return false;
                    }
                }
                return true;
            } catch (FileNotFoundException e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    public static boolean createFileByDeleteOldFile(String str) {
        return createFileByDeleteOldFile(getFileByPath(str));
    }

    public static boolean createOrExistsDir(String str) {
        return createOrExistsDir(getFileByPath(str));
    }

    public static boolean createOrExistsFile(String str) {
        return createOrExistsFile(getFileByPath(str));
    }

    public static boolean delete(String str) {
        return delete(getFileByPath(str));
    }

    public static boolean deleteAllInDir(String str) {
        return deleteAllInDir(getFileByPath(str));
    }

    private static boolean deleteDir(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !deleteDir(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static boolean deleteFile(File file) {
        return file != null && (!file.exists() || (file.isFile() && file.delete()));
    }

    public static boolean deleteFilesInDir(String str) {
        return deleteFilesInDir(getFileByPath(str));
    }

    public static boolean deleteFilesInDirWithFilter(String str, FileFilter fileFilter) {
        return deleteFilesInDirWithFilter(getFileByPath(str), fileFilter);
    }

    private static long getDirLength(File file) {
        long j8 = 0;
        if (!isDir(file)) {
            return 0L;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                j8 += file2.isDirectory() ? getDirLength(file2) : file2.length();
            }
        }
        return j8;
    }

    public static String getDirName(File file) {
        return file == null ? "" : getDirName(file.getAbsolutePath());
    }

    private static String getDirSize(File file) {
        long dirLength = getDirLength(file);
        return dirLength == -1 ? "" : c1.byte2FitMemorySize(dirLength);
    }

    public static File getFileByPath(String str) {
        if (c1.isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    public static String getFileCharsetSimple(String str) {
        return getFileCharsetSimple(getFileByPath(str));
    }

    public static String getFileExtension(File file) {
        return file == null ? "" : getFileExtension(file.getPath());
    }

    public static long getFileLastModified(String str) {
        return getFileLastModified(getFileByPath(str));
    }

    public static long getFileLength(String str) {
        if (str.matches("[a-zA-z]+://[^\\s]*")) {
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpsURLConnection.connect();
                if (httpsURLConnection.getResponseCode() == 200) {
                    return httpsURLConnection.getContentLength();
                }
                return -1L;
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        return getFileLength(getFileByPath(str));
    }

    public static int getFileLines(String str) {
        return getFileLines(getFileByPath(str));
    }

    public static byte[] getFileMD5(String str) {
        return getFileMD5(getFileByPath(str));
    }

    public static String getFileMD5ToString(String str) {
        return getFileMD5ToString(c1.isSpace(str) ? null : new File(str));
    }

    public static String getFileName(File file) {
        return file == null ? "" : getFileName(file.getAbsolutePath());
    }

    public static String getFileNameNoExtension(File file) {
        return file == null ? "" : getFileNameNoExtension(file.getPath());
    }

    private static String getFileSize(File file) {
        long fileLength = getFileLength(file);
        return fileLength == -1 ? "" : c1.byte2FitMemorySize(fileLength);
    }

    public static long getFsAvailableSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public static long getFsTotalSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public static long getLength(String str) {
        return getLength(getFileByPath(str));
    }

    public static String getSize(String str) {
        return getSize(getFileByPath(str));
    }

    public static boolean isDir(String str) {
        return isDir(getFileByPath(str));
    }

    public static boolean isFile(String str) {
        return isFile(getFileByPath(str));
    }

    public static boolean isFileExists(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return isFileExists(file.getAbsolutePath());
    }

    private static boolean isFileExistsApi29(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = z0.getApp().getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r");
                if (openAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    openAssetFileDescriptor.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (FileNotFoundException unused2) {
            }
        }
        return false;
    }

    public static boolean isUtf8(String str) {
        return isUtf8(getFileByPath(str));
    }

    public static List<File> listFilesInDir(String str) {
        return listFilesInDir(str, (Comparator<File>) null);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter);
    }

    private static List<File> listFilesInDirWithFilterInner(File file, FileFilter fileFilter, boolean z7) {
        ArrayList arrayList = new ArrayList();
        if (!isDir(file)) {
            return arrayList;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (fileFilter.accept(file2)) {
                    arrayList.add(file2);
                }
                if (z7 && file2.isDirectory()) {
                    arrayList.addAll(listFilesInDirWithFilterInner(file2, fileFilter, true));
                }
            }
        }
        return arrayList;
    }

    public static boolean move(String str, String str2) {
        return move(getFileByPath(str), getFileByPath(str2), (d) null);
    }

    public static boolean moveDir(File file, File file2, d dVar) {
        return copyOrMoveDir(file, file2, dVar, true);
    }

    public static boolean moveFile(File file, File file2, d dVar) {
        return copyOrMoveFile(file, file2, dVar, true);
    }

    public static void notifySystemToScan(String str) {
        notifySystemToScan(getFileByPath(str));
    }

    public static boolean rename(String str, String str2) {
        return rename(getFileByPath(str), str2);
    }

    public static boolean copy(String str, String str2, d dVar) {
        return copy(getFileByPath(str), getFileByPath(str2), dVar);
    }

    public static boolean createFileByDeleteOldFile(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean createOrExistsDir(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    public static boolean createOrExistsFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean delete(File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? deleteDir(file) : deleteFile(file);
    }

    public static boolean deleteAllInDir(File file) {
        return deleteFilesInDirWithFilter(file, new a());
    }

    public static boolean deleteFilesInDir(File file) {
        return deleteFilesInDirWithFilter(file, new b());
    }

    public static boolean deleteFilesInDirWithFilter(File file, FileFilter fileFilter) {
        if (file == null || fileFilter == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !deleteDir(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static String getDirName(String str) {
        int lastIndexOf;
        return (c1.isSpace(str) || (lastIndexOf = str.lastIndexOf(File.separator)) == -1) ? "" : str.substring(0, lastIndexOf + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getFileCharsetSimple(File file) {
        int i8;
        BufferedInputStream bufferedInputStream;
        if (file == null) {
            return "";
        }
        if (isUtf8(file)) {
            return cn.hutool.core.util.l.UTF_8;
        }
        ?? r02 = 0;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e8) {
            e = e8;
        }
        try {
            i8 = (bufferedInputStream.read() << 8) + bufferedInputStream.read();
            try {
                bufferedInputStream.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        } catch (IOException e10) {
            e = e10;
            bufferedInputStream2 = bufferedInputStream;
            e.printStackTrace();
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            i8 = 0;
            r02 = 65279;
            if (i8 == 65279) {
            }
        } catch (Throwable th2) {
            th = th2;
            r02 = bufferedInputStream;
            if (r02 != 0) {
                try {
                    r02.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            throw th;
        }
        r02 = 65279;
        return i8 == 65279 ? i8 != 65534 ? cn.hutool.core.util.l.GBK : "Unicode" : "UTF-16BE";
    }

    public static String getFileExtension(String str) {
        if (c1.isSpace(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || str.lastIndexOf(File.separator) >= lastIndexOf) ? "" : str.substring(lastIndexOf + 1);
    }

    public static long getFileLastModified(File file) {
        if (file == null) {
            return -1L;
        }
        return file.lastModified();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x004f -> B:18:0x005e). Please report as a decompilation issue!!! */
    public static int getFileLines(File file) {
        BufferedInputStream bufferedInputStream;
        int i8 = 1;
        ?? r12 = 0;
        BufferedInputStream bufferedInputStream2 = null;
        r12 = 0;
        try {
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
            r12 = r12;
        }
        try {
            byte[] bArr = new byte[1024];
            if (!LINE_SEP.endsWith("\n")) {
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    for (int i9 = 0; i9 < read; i9++) {
                        if (bArr[i9] == 13) {
                            i8++;
                        }
                    }
                }
            } else {
                while (true) {
                    int read2 = bufferedInputStream.read(bArr, 0, 1024);
                    if (read2 == -1) {
                        break;
                    }
                    for (int i10 = 0; i10 < read2; i10++) {
                        if (bArr[i10] == 10) {
                            i8++;
                        }
                    }
                }
            }
            bufferedInputStream.close();
            r12 = bArr;
        } catch (IOException e10) {
            e = e10;
            bufferedInputStream2 = bufferedInputStream;
            e.printStackTrace();
            r12 = bufferedInputStream2;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
                r12 = bufferedInputStream2;
            }
            return i8;
        } catch (Throwable th2) {
            th = th2;
            r12 = bufferedInputStream;
            if (r12 != 0) {
                try {
                    r12.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            throw th;
        }
        return i8;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0030: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:46:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] getFileMD5(File file) {
        InputStream inputStream;
        DigestInputStream digestInputStream;
        InputStream inputStream2 = null;
        try {
            if (file == null) {
                return null;
            }
            try {
                digestInputStream = new DigestInputStream(new FileInputStream(file), MessageDigest.getInstance("MD5"));
                try {
                    while (digestInputStream.read(new byte[262144]) > 0) {
                    }
                    byte[] digest = digestInputStream.getMessageDigest().digest();
                    try {
                        digestInputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return digest;
                } catch (IOException e9) {
                    e = e9;
                    e.printStackTrace();
                    if (digestInputStream != null) {
                        try {
                            digestInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                } catch (NoSuchAlgorithmException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (digestInputStream != null) {
                    }
                    return null;
                }
            } catch (IOException e12) {
                e = e12;
                digestInputStream = null;
                e.printStackTrace();
                if (digestInputStream != null) {
                }
                return null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                digestInputStream = null;
                e.printStackTrace();
                if (digestInputStream != null) {
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
        }
    }

    public static String getFileName(String str) {
        if (c1.isSpace(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static String getFileNameNoExtension(String str) {
        if (c1.isSpace(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        return lastIndexOf2 == -1 ? lastIndexOf == -1 ? str : str.substring(0, lastIndexOf) : (lastIndexOf == -1 || lastIndexOf2 > lastIndexOf) ? str.substring(lastIndexOf2 + 1) : str.substring(lastIndexOf2 + 1, lastIndexOf);
    }

    public static long getLength(File file) {
        if (file == null) {
            return 0L;
        }
        return file.isDirectory() ? getDirLength(file) : getFileLength(file);
    }

    public static String getSize(File file) {
        return file == null ? "" : file.isDirectory() ? getDirSize(file) : getFileSize(file);
    }

    public static boolean isDir(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    public static boolean isFile(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean isUtf8(File file) {
        byte[] bArr;
        BufferedInputStream bufferedInputStream;
        if (file == null) {
            return false;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bArr = new byte[24];
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e8) {
            e = e8;
        }
        try {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                return false;
            }
            byte[] bArr2 = new byte[read];
            System.arraycopy(bArr, 0, bArr2, 0, read);
            boolean z7 = isUtf8(bArr2) == 100;
            try {
                bufferedInputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            return z7;
        } catch (IOException e11) {
            e = e11;
            bufferedInputStream2 = bufferedInputStream;
            e.printStackTrace();
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static List<File> listFilesInDir(File file) {
        return listFilesInDir(file, (Comparator<File>) null);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter) {
        return listFilesInDirWithFilter(file, fileFilter, false, (Comparator<File>) null);
    }

    public static boolean move(String str, String str2, d dVar) {
        return move(getFileByPath(str), getFileByPath(str2), dVar);
    }

    public static void notifySystemToScan(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.parse("file://" + file.getAbsolutePath()));
        z0.getApp().sendBroadcast(intent);
    }

    public static boolean rename(File file, String str) {
        if (file == null || !file.exists() || c1.isSpace(str)) {
            return false;
        }
        if (str.equals(file.getName())) {
            return true;
        }
        File file2 = new File(file.getParent() + File.separator + str);
        return !file2.exists() && file.renameTo(file2);
    }

    public static boolean copy(File file, File file2) {
        return copy(file, file2, (d) null);
    }

    public static String getFileMD5ToString(File file) {
        return c1.bytes2HexString(getFileMD5(file));
    }

    public static boolean isFileExists(String str) {
        File fileByPath = getFileByPath(str);
        if (fileByPath == null) {
            return false;
        }
        if (fileByPath.exists()) {
            return true;
        }
        return isFileExistsApi29(str);
    }

    public static List<File> listFilesInDir(String str, Comparator<File> comparator) {
        return listFilesInDir(getFileByPath(str), false, comparator);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter, Comparator<File> comparator) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, comparator);
    }

    public static boolean move(File file, File file2) {
        return move(file, file2, (d) null);
    }

    public static boolean copy(File file, File file2, d dVar) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return copyDir(file, file2, dVar);
        }
        return copyFile(file, file2, dVar);
    }

    public static List<File> listFilesInDir(File file, Comparator<File> comparator) {
        return listFilesInDir(file, false, comparator);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter, Comparator<File> comparator) {
        return listFilesInDirWithFilter(file, fileFilter, false, comparator);
    }

    public static boolean move(File file, File file2, d dVar) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return moveDir(file, file2, dVar);
        }
        return moveFile(file, file2, dVar);
    }

    public static List<File> listFilesInDir(String str, boolean z7) {
        return listFilesInDir(getFileByPath(str), z7);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter, boolean z7) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, z7);
    }

    public static List<File> listFilesInDir(File file, boolean z7) {
        return listFilesInDir(file, z7, (Comparator<File>) null);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter, boolean z7) {
        return listFilesInDirWithFilter(file, fileFilter, z7, (Comparator<File>) null);
    }

    public static List<File> listFilesInDir(String str, boolean z7, Comparator<File> comparator) {
        return listFilesInDir(getFileByPath(str), z7, comparator);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter, boolean z7, Comparator<File> comparator) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, z7, comparator);
    }

    public static List<File> listFilesInDir(File file, boolean z7, Comparator<File> comparator) {
        return listFilesInDirWithFilter(file, new c(), z7, comparator);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter, boolean z7, Comparator<File> comparator) {
        List<File> listFilesInDirWithFilterInner = listFilesInDirWithFilterInner(file, fileFilter, z7);
        if (comparator != null) {
            Collections.sort(listFilesInDirWithFilterInner, comparator);
        }
        return listFilesInDirWithFilterInner;
    }

    private static long getFileLength(File file) {
        if (isFile(file)) {
            return file.length();
        }
        return -1L;
    }

    private static int isUtf8(byte[] bArr) {
        if (bArr.length > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return 100;
        }
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            int i11 = 0;
            while (i8 < length) {
                byte b8 = bArr[i8];
                if (b8 == -1 || (b8 & (-2)) == -2) {
                    break loop0;
                }
                if (i11 == 0) {
                    if ((b8 & Byte.MAX_VALUE) == b8 && b8 != 0) {
                        i9++;
                    } else if ((b8 & (-64)) == -64) {
                        int i12 = i11;
                        for (int i13 = 0; i13 < 8; i13++) {
                            byte b9 = (byte) (128 >> i13);
                            if ((bArr[i8] & b9) != b9) {
                                break;
                            }
                            i12 = i13;
                        }
                        i10++;
                        i11 = i12;
                    }
                    i8++;
                } else {
                    if (bArr.length - i8 <= i11) {
                        i11 = bArr.length - i8;
                    }
                    boolean z7 = false;
                    for (int i14 = 0; i14 < i11; i14++) {
                        byte b10 = bArr[i8 + i14];
                        if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) != -128) {
                            if ((b10 & Byte.MAX_VALUE) == b10 && bArr[i8] != 0) {
                                i9++;
                            }
                            z7 = true;
                        }
                    }
                    if (z7) {
                        i10--;
                        i8++;
                    } else {
                        i10 += i11;
                        i8 += i11;
                    }
                }
            }
            if (i9 == length) {
                return 100;
            }
            return (int) (((i10 + i9) / length) * 100.0f);
        }
        return 0;
    }
}
