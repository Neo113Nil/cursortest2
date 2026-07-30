package com.crrepa.x1;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14019a = "WF-FileProcess";

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f14020b = true;

    public static String a(String str) {
        int i8;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            for (byte b8 : messageDigest.digest()) {
                stringBuffer.append(Integer.toString((b8 & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString().toLowerCase();
        } catch (IOException e8) {
            e = e8;
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            throw new RuntimeException(e);
        }
    }

    public static byte[] b(String str) {
        byte[] bArr = new byte[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.ISO_8859_1);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    return bArr;
                }
                byteArrayOutputStream.write(read);
            }
        } catch (FileNotFoundException unused) {
            Log.e(f14019a, str + " doesn't found!");
            return null;
        } catch (IOException e8) {
            Log.e(f14019a, str + " read exception, " + e8.getMessage());
            e8.printStackTrace();
            return bArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        throw new java.lang.SecurityException("zip path have traversal characters path");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.io.InputStream, java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, String str2) {
        Throwable th;
        ?? r72;
        FileInputStream fileInputStream;
        String str3;
        Object obj;
        Object obj2;
        Object obj3;
        FileInputStream fileInputStream2 = null;
        ?? r02 = null;
        FileInputStream fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                str3 = str;
                r02 = str3;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (r02 != null) {
                    throw th;
                }
                try {
                    r02.close();
                    throw th;
                } catch (IOException e9) {
                    e9.printStackTrace();
                    throw th;
                }
            }
            try {
                r72 = new ZipInputStream(fileInputStream);
            } catch (FileNotFoundException e10) {
                e = e10;
                obj3 = null;
            } catch (IOException e11) {
                e = e11;
                obj2 = null;
            } catch (Exception e12) {
                e = e12;
                obj = null;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                }
                if (r02 != null) {
                }
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            r72 = 0;
        } catch (IOException e14) {
            e = e14;
            r72 = 0;
        } catch (Exception e15) {
            e = e15;
            r72 = 0;
        } catch (Throwable th4) {
            th = th4;
            str = null;
            fileInputStream = null;
            str3 = str;
            r02 = str3;
            if (fileInputStream != null) {
            }
            if (r02 != null) {
            }
        }
        try {
            try {
                String canonicalPath = new File(str2).getCanonicalPath();
                while (true) {
                    ZipEntry nextEntry = r72.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (!new File(canonicalPath, name).getCanonicalPath().startsWith(canonicalPath)) {
                            break;
                        }
                        if (nextEntry.isDirectory()) {
                            new File(canonicalPath + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(canonicalPath);
                            String str4 = File.separator;
                            sb.append(str4);
                            sb.append(name);
                            String sb2 = sb.toString();
                            File file = new File(sb2.substring(0, sb2.lastIndexOf(str4)));
                            if (!file.exists()) {
                                Log.w(f14019a, "folder is null, mkdir now");
                                file.mkdirs();
                            }
                            File file2 = new File(canonicalPath + str4 + name);
                            file2.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = r72.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                fileOutputStream.flush();
                            }
                            fileOutputStream.close();
                        }
                    } else {
                        try {
                            fileInputStream.close();
                            break;
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                }
            } catch (FileNotFoundException e17) {
                e = e17;
                obj3 = r72;
                fileInputStream3 = fileInputStream;
                r72 = obj3;
                e.printStackTrace();
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e18) {
                        e18.printStackTrace();
                    }
                }
                if (r72 == 0) {
                    return;
                }
                r72.close();
            } catch (IOException e19) {
                e = e19;
                obj2 = r72;
                fileInputStream4 = fileInputStream;
                r72 = obj2;
                e.printStackTrace();
                if (fileInputStream4 != null) {
                    try {
                        fileInputStream4.close();
                    } catch (IOException e20) {
                        e20.printStackTrace();
                    }
                }
                if (r72 == 0) {
                    return;
                }
                r72.close();
            } catch (Exception e21) {
                e = e21;
                obj = r72;
                fileInputStream2 = fileInputStream;
                r72 = obj;
                e.printStackTrace();
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                }
                if (r72 == 0) {
                    return;
                }
                r72.close();
            } catch (Throwable th5) {
                th = th5;
                str3 = r72;
                r02 = str3;
                if (fileInputStream != null) {
                }
                if (r02 != null) {
                }
            }
            r72.close();
        } catch (IOException e23) {
            e23.printStackTrace();
        }
    }

    public static void a(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (!f14020b && listFiles == null) {
                throw new AssertionError();
            }
            for (File file2 : listFiles) {
                a(file2.getAbsolutePath(), true);
            }
        }
        if (z7) {
            if (file.isDirectory()) {
                File[] listFiles2 = file.listFiles();
                Objects.requireNonNull(listFiles2);
                if (listFiles2.length != 0) {
                    return;
                }
            }
            file.delete();
        }
    }
}
