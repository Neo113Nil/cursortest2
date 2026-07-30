package com.realsil.sdk.core.utility;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class FileUtils {
    public static void copyFile(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void copyFileStream(File file, Uri uri, Context context) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            try {
                fileOutputStream = new FileOutputStream(file);
                if (inputStream != null) {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                    } catch (Exception e8) {
                        e = e8;
                        inputStream2 = inputStream;
                        try {
                            e.printStackTrace();
                            if (inputStream2 != null) {
                            }
                            if (fileOutputStream == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStream2;
                            fileOutputStream2 = fileOutputStream;
                            fileOutputStream = fileOutputStream2;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                fileOutputStream.close();
            } catch (Exception e9) {
                e = e9;
                fileOutputStream = null;
                inputStream2 = inputStream;
                e.printStackTrace();
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (fileOutputStream == null) {
                    fileOutputStream.close();
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                if (inputStream != null) {
                }
                if (fileOutputStream != null) {
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    public static void copyFromAssetsToSdcard(Context context, boolean z7, String str, String str2) {
        copyFromAssetsToSdcard(context.getAssets(), z7, str, str2);
    }

    public static File createDir(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean exists(String str) {
        try {
            return new File(str).exists();
        } catch (Exception e8) {
            ZLogger.e(e8.getMessage());
            return false;
        }
    }

    public static String getFileExtensionFromUrl(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf2 = str.lastIndexOf(35);
        if (lastIndexOf2 > 0) {
            str = str.substring(0, lastIndexOf2);
        }
        int lastIndexOf3 = str.lastIndexOf(63);
        if (lastIndexOf3 > 0) {
            str = str.substring(0, lastIndexOf3);
        }
        int lastIndexOf4 = str.lastIndexOf(47);
        if (lastIndexOf4 >= 0) {
            str = str.substring(lastIndexOf4 + 1);
        }
        return (str.isEmpty() || (lastIndexOf = str.lastIndexOf(46)) < 0) ? "" : str.substring(lastIndexOf + 1);
    }

    public static String getFileExtensionFromUrl2(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf2 = str.lastIndexOf(35);
        ZLogger.d("fragment=" + lastIndexOf2);
        if (lastIndexOf2 > 0) {
            str = str.substring(0, lastIndexOf2);
        }
        int lastIndexOf3 = str.lastIndexOf(63);
        ZLogger.d("query=" + lastIndexOf3);
        if (lastIndexOf3 > 0) {
            str = str.substring(0, lastIndexOf3);
        }
        int lastIndexOf4 = str.lastIndexOf(47);
        if (lastIndexOf4 >= 0) {
            str = str.substring(lastIndexOf4 + 1);
        }
        return (str.isEmpty() || !Pattern.matches("[a-zA-Z_0-9\\+\\.\\-\\(\\)\\%]+", str) || (lastIndexOf = str.lastIndexOf(46)) < 0) ? "" : str.substring(lastIndexOf + 1);
    }

    public static long getFileSize(String str) {
        File file = new File(str);
        if (!file.isDirectory()) {
            return file.length();
        }
        long j8 = 0;
        for (File file2 : file.listFiles()) {
            j8 += getFileSize(file2.getAbsolutePath());
        }
        return j8;
    }

    public static String getSDCardAbsPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static File getSaveFile(String str, String str2) {
        return getSaveFile(str, str2, true);
    }

    public static File getSaveFolder(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getSDCardAbsPath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        File file = new File(sb.toString());
        file.mkdirs();
        return file;
    }

    public static String getSavePath(String str) {
        return getSaveFolder(str).getAbsolutePath();
    }

    public static String getSavePathCompat(String str) {
        return getSaveFolder(str).getAbsolutePath();
    }

    public static String getSuffix(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? "" : getSuffix(file.getName());
    }

    public static int getUrlFileSize(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setDoInput(true);
            int contentLength = httpURLConnection.getContentLength();
            httpURLConnection.disconnect();
            return contentLength;
        } catch (Exception e8) {
            ZLogger.e(e8.toString());
            return 0;
        }
    }

    public static boolean makeDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:6|(2:60|61)|8|9|10|(3:12|13|14)|15|16|(2:26|27)|(1:25)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        com.realsil.sdk.core.logger.ZLogger.w(r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00aa, code lost:
    
        if (r1 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r4.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void copyFile(String str, String str2) {
        FileInputStream fileInputStream;
        File file = new File(str);
        if (!file.exists()) {
            ZLogger.w(str + " not exist");
            return;
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            try {
                ZLogger.e("createNewFile: " + String.valueOf(file2.createNewFile()));
            } catch (IOException e8) {
                ZLogger.e("createFile failed: " + e8.toString());
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e9) {
            e = e9;
            fileInputStream = null;
        }
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (FileNotFoundException e10) {
                    e = e10;
                    ZLogger.e(e.toString());
                    ZLogger.d("copyFile from " + str + " to " + str2);
                    copyFile(fileInputStream, fileOutputStream);
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream == null) {
                    }
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.close();
                return;
            } catch (IOException unused) {
                return;
            }
            ZLogger.d("copyFile from " + str + " to " + str2);
            copyFile(fileInputStream, fileOutputStream);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
            }
            if (fileOutputStream == null) {
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void copyFromAssetsToSdcard(AssetManager assetManager, boolean z7, String str, String str2) {
        Throwable th;
        IOException e8;
        FileNotFoundException e9;
        if (!new File(str2).exists() || z7) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    assetManager = assetManager.open(str);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = assetManager.read(bArr, 0, 1024);
                                if (read < 0) {
                                    break;
                                } else {
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                            }
                            ZLogger.v("source = " + str + ", dest = " + str2);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        } catch (FileNotFoundException e11) {
                            e9 = e11;
                            fileOutputStream = fileOutputStream2;
                            e9.printStackTrace();
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                            }
                            if (assetManager == 0) {
                                return;
                            }
                            assetManager.close();
                        } catch (IOException e13) {
                            e8 = e13;
                            fileOutputStream = fileOutputStream2;
                            e8.printStackTrace();
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                }
                            }
                            if (assetManager == 0) {
                                return;
                            }
                            assetManager.close();
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e15) {
                                    e15.printStackTrace();
                                }
                            }
                            if (assetManager == 0) {
                                throw th;
                            }
                            try {
                                assetManager.close();
                                throw th;
                            } catch (IOException e16) {
                                e16.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException e17) {
                        e9 = e17;
                    } catch (IOException e18) {
                        e8 = e18;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            } catch (FileNotFoundException e19) {
                e9 = e19;
                assetManager = 0;
            } catch (IOException e20) {
                e8 = e20;
                assetManager = 0;
            } catch (Throwable th5) {
                th = th5;
                assetManager = 0;
            }
            try {
                assetManager.close();
            } catch (IOException e21) {
                e21.printStackTrace();
            }
        }
    }

    public static File getSaveFile(String str, String str2, boolean z7) {
        return getSaveFile(getSavePath(str) + File.separator + str2, z7);
    }

    public static String getSuffix(String str) {
        if (TextUtils.isEmpty(str) || str.endsWith(".")) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1).toLowerCase(Locale.US) : "";
    }

    public static File getSaveFile(String str, boolean z7) {
        File file = new File(str);
        try {
            if (!file.exists() && z7) {
                file.createNewFile();
                return file;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return file;
    }
}
