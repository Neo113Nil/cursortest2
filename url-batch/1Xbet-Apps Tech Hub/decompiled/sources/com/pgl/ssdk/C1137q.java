package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ApkInfo.java */
/* renamed from: com.pgl.ssdk.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1137q {
    private static volatile String a = null;
    private static String b = null;
    private static String c = null;
    private static String d = null;
    private static int e = -1;
    private static long f = 0;
    private static long g = 0;
    private static volatile long h = -1;

    public static void a(File file, boolean z) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                if (TextUtils.isEmpty(a)) {
                    a(a(file));
                    if (z) {
                        a();
                        try {
                            randomAccessFile.close();
                            return;
                        } catch (IOException unused3) {
                            return;
                        }
                    }
                }
                if (TextUtils.isEmpty(c)) {
                    c = a(randomAccessFile);
                }
                if (f == 0) {
                    f = randomAccessFile.length() / 1024;
                }
                if (g == 0) {
                    g = b(file);
                }
            } catch (FileNotFoundException unused4) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 == null) {
                    return;
                }
                randomAccessFile = randomAccessFile2;
                randomAccessFile.close();
            } catch (IOException unused5) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 == null) {
                    return;
                }
                randomAccessFile = randomAccessFile2;
                randomAccessFile.close();
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
            randomAccessFile.close();
        } catch (IOException unused7) {
        }
    }

    public static String b() {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        long j;
        long j2;
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(c) || e == -1) {
            SharedPreferences a2 = L.a(C1141v.b());
            long j3 = -1;
            if (a2 != null) {
                j3 = a2.getLong("mt", -1L);
                str2 = a2.getString("sa", null);
                str3 = a2.getString("sj", null);
                str4 = a2.getString("md5", null);
                j = a2.getLong("as", 0L);
                j2 = a2.getLong("ds", 0L);
                i = a2.getInt("cpc", -1);
                str = a2.getString("ap", null);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                i = 0;
                j = 0;
                j2 = 0;
            }
            String c2 = c();
            if (c2 == null) {
                return null;
            }
            File file = new File(c2);
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, C1141v.b(), c2);
            Integer num = (Integer) objArr[0];
            String str5 = (String) objArr[1];
            long lastModified = file.lastModified();
            if (lastModified != j3 || str2 == null || i == -1) {
                h = lastModified;
                if (str5 != null) {
                    d = str5;
                }
                if (num != null) {
                    e = num.intValue();
                }
                a(file, false);
                a();
            } else {
                a = str2;
                b = str3;
                f = j;
                g = j2;
                c = str4;
                e = i;
                d = str;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put("sign", a);
            }
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("subject", b);
            }
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("md5", c);
            }
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put("path", d);
            }
            long j4 = f;
            if (j4 != 0) {
                jSONObject.put("apkSize", j4);
            }
            long j5 = g;
            if (j5 != 0) {
                jSONObject.put("dexSize", j5);
            }
            int i2 = e;
            if (i2 != -1) {
                jSONObject.put("code", i2);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String c() {
        if (C1141v.b() == null) {
            return null;
        }
        String packageCodePath = C1141v.b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static String d() {
        String str;
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        SharedPreferences a2 = L.a(C1141v.b());
        long j = -1;
        if (a2 != null) {
            j = a2.getLong("mt", -1L);
            str = a2.getString("sa", null);
        } else {
            str = null;
        }
        String c2 = c();
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        File file = new File(c2);
        long lastModified = file.lastModified();
        if (lastModified == j && str != null) {
            a = str;
            return str;
        }
        h = lastModified;
        a(file, true);
        a();
        return a;
    }

    public static void a() {
        SharedPreferences a2 = L.a(C1141v.b());
        if (a2 != null) {
            if (!TextUtils.isEmpty(a)) {
                a2.edit().putString("sa", a).apply();
            }
            if (!TextUtils.isEmpty(c)) {
                a2.edit().putString("md5", c).apply();
            }
            if (!TextUtils.isEmpty(b)) {
                a2.edit().putString("sj", b).apply();
            }
            if (f != 0) {
                a2.edit().putLong("as", f).apply();
            }
            if (g != 0) {
                a2.edit().putLong("ds", g).apply();
            }
            if (h != -1) {
                a2.edit().putLong("mt", h).apply();
            }
            if (e != -1) {
                a2.edit().putInt("cpc", e).apply();
            }
            if (TextUtils.isEmpty(d)) {
                return;
            }
            a2.edit().putString("ap", d).apply();
        }
    }

    public static long b(File file) {
        String format;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i == 0) {
                        format = "classes.dex";
                    } else {
                        format = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i));
                    }
                    ZipEntry entry = zipFile2.getEntry(format);
                    if (entry == null) {
                        break;
                    }
                    try {
                        i2 = (int) (i2 + entry.getSize());
                        i++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j = i2 / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j;
            } catch (IOException unused5) {
                return 0L;
            }
        } catch (ZipException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @DungeonFlag
    private static void a(Certificate certificate) {
        if (certificate != null) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(certificate.getEncoded());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : digest) {
                    sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                a = sb.substring(0, sb.length() - 1);
            } catch (NoSuchAlgorithmException | CertificateEncodingException unused) {
            }
            if (certificate instanceof X509Certificate) {
                b = String.valueOf(((X509Certificate) certificate).getSubjectDN());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:
    
        if (r2 == null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Certificate a(File file) {
        RandomAccessFile randomAccessFile;
        List<Certificate> list;
        CertificateFactory certificateFactory;
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream;
        ArrayList arrayList;
        ZipInputStream zipInputStream2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException unused) {
                list = null;
                if (list != null) {
                }
                try {
                    certificateFactory = CertificateFactory.getInstance("X.509");
                } catch (CertificateException unused2) {
                    certificateFactory = null;
                }
                if (certificateFactory != null) {
                }
                if (list != null) {
                }
                return null;
            }
        } catch (C1125e unused3) {
            randomAccessFile = null;
        } catch (Throwable unused4) {
            randomAccessFile = null;
        }
        try {
            long length = randomAccessFile.length();
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            C1130j c1130j = new C1130j(channel, 0L, length);
            list = C1129i.a(c1130j, AbstractC1123c.a(c1130j));
            try {
                randomAccessFile.close();
            } catch (IOException unused5) {
            }
        } catch (C1125e unused6) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            list = null;
            if (list != null) {
            }
            certificateFactory = CertificateFactory.getInstance("X.509");
            if (certificateFactory != null) {
            }
            if (list != null) {
            }
            return null;
        } catch (Throwable unused7) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            list = null;
            if (list != null) {
            }
            certificateFactory = CertificateFactory.getInstance("X.509");
            if (certificateFactory != null) {
            }
            if (list != null) {
            }
            return null;
        }
        if (list != null || list.isEmpty()) {
            certificateFactory = CertificateFactory.getInstance("X.509");
            if (certificateFactory != null) {
                list = null;
            } else {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        zipInputStream = new ZipInputStream(fileInputStream);
                        try {
                            try {
                                arrayList = new ArrayList();
                                while (true) {
                                    try {
                                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                                        if (nextEntry == null) {
                                            break;
                                        }
                                        String name = nextEntry.getName();
                                        if (name.startsWith("META-INF/")) {
                                            if (!name.endsWith(".RSA") && !name.endsWith(".DSA") && !name.endsWith(".EC")) {
                                                zipInputStream.closeEntry();
                                            } else {
                                                try {
                                                    arrayList.addAll(certificateFactory.generateCertificates(zipInputStream));
                                                } catch (CertificateException unused8) {
                                                }
                                            }
                                        }
                                    } catch (IOException unused9) {
                                        if (zipInputStream != null) {
                                            try {
                                                zipInputStream.close();
                                            } catch (IOException unused10) {
                                            }
                                        }
                                    }
                                }
                                zipInputStream.close();
                                try {
                                    zipInputStream.close();
                                } catch (IOException unused11) {
                                }
                            } catch (Throwable th) {
                                zipInputStream2 = zipInputStream;
                                th = th;
                                if (zipInputStream2 != null) {
                                    try {
                                        zipInputStream2.close();
                                    } catch (IOException unused12) {
                                    }
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    } catch (IOException unused13) {
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused14) {
                            arrayList = null;
                        }
                    } catch (IOException unused15) {
                        zipInputStream = null;
                        arrayList = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException unused16) {
                    zipInputStream = null;
                    fileInputStream = null;
                    arrayList = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
                try {
                    fileInputStream.close();
                } catch (IOException unused17) {
                }
                list = arrayList;
            }
        }
        if (list != null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0".concat(String.valueOf(bigInteger));
            }
            return bigInteger;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
