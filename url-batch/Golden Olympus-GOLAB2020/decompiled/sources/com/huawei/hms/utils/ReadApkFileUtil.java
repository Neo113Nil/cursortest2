package com.huawei.hms.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.support.log.HMSLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class ReadApkFileUtil {
    public static final String EMUI10_PK = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4nUogUyMCmzHhaEb420yvpw9zBs+ETzE9Qm77bGxl1Iml9JEkBkNTsUWOstLgUBajNhV+BAMVBHKMEdzoQbL5kIHkTgUVM65yewd+5+BhrcB9OQ3LHp+0BN6aLKZh71T4WvsvHFhfhQpShuGWkRkSaVGLFTHxX70kpWLzeZ3RtqiEUNIufPR2SFCH6EmecJ+HdkmBOh603IblCpGxwSWse0fDI98wZBEmV88RFaiYEgyiezLlWvXzqIj6I/xuyd5nGAegjH2y3cmoDE6CubecoB1jf4KdgACXgdiQ4Oc63MfLGTor3l6RCqeUk4APAMtyhK83jc72W1sdXMd/sj2wIDAQAB";
    public static final String EMUI11_PK = "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAqq2eRTMYr2JHLtvuZzfgPrgU8oatD4Rar9fOD7E00es2VhtB3vTyaT2BvYPUPA/nbkHRPak3EZX77CfWj9tzLgSHJE8XLk9C+2ESkdrxCDA6z7I8X+cBDnA05OlCJeZFjnUbjYB8SP8M3BttdrvqtVPxTkEJhchC7UXnMLaJ3kQ3ZPjN7ubjYzO4rv7EtEpqr2bX+qjnSLIZZuUXraxqfdBuhGDIYq62dNsqiyrhX1mfvA3+43N4ZIs3BdfSYII8BNFmFxf+gyf1aoq386R2kAjHcrfOOhjAbZh+R1OAGLWPCqi3E9nB8EsZkeoTW/oIP6pJvgL3bnxq+1viT2dmZyipMgcx/3N6FJqkd67j/sPMtPlHJuq8/s0silzs13jAw1WBV6tWHFkLGpkWGs8jp50wQtndtY8cCPl2XPGmdPN72agH+zsHuKqr/HOB2TuzzaO8rKlGIDQlzZcCSHB28nnvOyBVN9xzLkbYiLnHfd6bTwzNPeqjWrTnPwKyH3BPAgMBAAE=";
    public static final String KEY_SIGNATURE = "Signature:";
    public static final String KEY_SIGNATURE2 = "Signature2:";
    public static final String KEY_SIGNATURE3 = "Signature3:";

    /* renamed from: a, reason: collision with root package name */
    private static final String f14481a = "ReadApkFileUtil";

    /* renamed from: c, reason: collision with root package name */
    private static String f14483c;

    /* renamed from: d, reason: collision with root package name */
    private static String f14484d;

    /* renamed from: e, reason: collision with root package name */
    private static String f14485e;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f14482b = Pattern.compile("\\s*|\t|\r|\n");

    /* renamed from: f, reason: collision with root package name */
    private static String f14486f = null;

    /* renamed from: g, reason: collision with root package name */
    private static String f14487g = null;

    private static byte[] a(ZipFile zipFile) {
        return a(zipFile, "META-INF/MANIFEST.MF");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    private static void b(byte[] bArr) {
        Throwable th;
        BufferedReader bufferedReader;
        ?? r22;
        ?? r23;
        BufferedReader bufferedReader2;
        InputStream inputStream;
        if (bArr == null) {
            HMSLog.e(f14481a, "manifest is null！");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader3 = null;
        f14483c = null;
        f14484d = null;
        f14485e = null;
        try {
            r22 = new ByteArrayInputStream(bArr);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader((InputStream) r22, StandardCharsets.UTF_8));
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                r23 = r22;
                IOUtils.closeQuietly((InputStream) r23);
                IOUtils.closeQuietly((Reader) bufferedReader3);
                throw th;
            }
            try {
                String a4 = a(bufferedReader);
                while (a4 != null) {
                    if (a4.length() != 0) {
                        if (a4.startsWith("ApkHash:")) {
                            f14486f = a(a4.substring(a4.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) + 1));
                        }
                        if (a4.startsWith(KEY_SIGNATURE)) {
                            f14483c = a(a4.substring(a4.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) + 1));
                            a4 = a(bufferedReader);
                        } else if (a4.startsWith(KEY_SIGNATURE2)) {
                            f14484d = a(a4.substring(a4.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) + 1));
                            a4 = a(bufferedReader);
                        } else if (a4.startsWith(KEY_SIGNATURE3)) {
                            f14485e = a(a4.substring(a4.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) + 1));
                            a4 = a(bufferedReader);
                        } else {
                            stringBuffer.append(a4);
                            stringBuffer.append("\r\n");
                        }
                    }
                    a4 = a(bufferedReader);
                }
                f14487g = stringBuffer.toString();
                inputStream = r22;
            } catch (Exception unused2) {
                bufferedReader3 = bufferedReader;
                try {
                    HMSLog.e(f14481a, "loadApkCert Exception!");
                    bufferedReader = bufferedReader3;
                    inputStream = r22;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((Reader) bufferedReader);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader3;
                    bufferedReader3 = r22;
                    bufferedReader2 = bufferedReader3;
                    bufferedReader3 = bufferedReader;
                    r23 = bufferedReader2;
                    IOUtils.closeQuietly((InputStream) r23);
                    IOUtils.closeQuietly((Reader) bufferedReader3);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader2 = r22;
                bufferedReader3 = bufferedReader;
                r23 = bufferedReader2;
                IOUtils.closeQuietly((InputStream) r23);
                IOUtils.closeQuietly((Reader) bufferedReader3);
                throw th;
            }
        } catch (Exception unused3) {
            r22 = 0;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            bufferedReader2 = bufferedReader3;
            bufferedReader3 = bufferedReader;
            r23 = bufferedReader2;
            IOUtils.closeQuietly((InputStream) r23);
            IOUtils.closeQuietly((Reader) bufferedReader3);
            throw th;
        }
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly((Reader) bufferedReader);
    }

    public static String bytesToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            int i5 = i4 * 2;
            cArr2[i5] = cArr[(b4 & 255) >>> 4];
            cArr2[i5 + 1] = cArr[b4 & 15];
        }
        return String.valueOf(cArr2);
    }

    private static boolean c() {
        try {
        } catch (Exception e4) {
            HMSLog.i(f14481a, "verifyMDMSignatureV3 MDM verify Exception!:" + e4.getMessage());
        }
        if (a(Base64.decode(EMUI11_PK, 0), a(f14487g, "SHA-384"), b(f14485e), "SHA384withRSA")) {
            HMSLog.i(f14481a, "verifyMDMSignatureV3 verify successful!");
            return true;
        }
        HMSLog.i(f14481a, "verifyMDMSignatureV3 verify failure!");
        return false;
    }

    public static boolean checkSignature() {
        if (f14485e != null) {
            return c();
        }
        if (f14484d != null) {
            return b();
        }
        if (f14483c != null) {
            return a();
        }
        return false;
    }

    public static String getHmsPath(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.huawei.hwid", UserVerificationMethods.USER_VERIFY_PATTERN).sourceDir;
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.e(f14481a, "HMS is not found!");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isCertFound(String str) {
        ZipFile zipFile;
        boolean z4 = false;
        ZipFile zipFile2 = null;
        ZipFile zipFile3 = null;
        ZipFile zipFile4 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            boolean z5 = zipFile.getEntry("META-INF/HUAWEI.CER") != null;
            if (z5) {
                b(a(zipFile, "META-INF/HUAWEI.CER"));
            }
            try {
                zipFile.close();
            } catch (IOException e5) {
                String str2 = f14481a;
                StringBuilder sb = new StringBuilder();
                sb.append("zipFile.close Exception!");
                sb.append(e5.getMessage());
                HMSLog.e(str2, sb.toString());
                zipFile3 = sb;
            }
            z4 = z5;
            zipFile2 = zipFile3;
        } catch (Exception e6) {
            e = e6;
            zipFile4 = zipFile;
            HMSLog.e(f14481a, "isCertFound Exception!" + e.getMessage());
            zipFile2 = zipFile4;
            if (zipFile4 != null) {
                try {
                    zipFile4.close();
                    zipFile2 = zipFile4;
                } catch (IOException e7) {
                    String str3 = f14481a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("zipFile.close Exception!");
                    sb2.append(e7.getMessage());
                    HMSLog.e(str3, sb2.toString());
                    zipFile2 = sb2;
                }
            }
            return z4;
        } catch (Throwable th2) {
            th = th2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e8) {
                    HMSLog.e(f14481a, "zipFile.close Exception!" + e8.getMessage());
                }
            }
            throw th;
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static boolean verifyApkHash(String str) {
        ?? r22;
        ZipFile zipFile;
        String str2 = null;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
                r22 = str2;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            byte[] a4 = a(zipFile);
            ArrayList<String> a5 = a(a4);
            if (a5 != null) {
                a4 = a(a5);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(a4);
            String bytesToString = bytesToString(messageDigest.digest());
            String str3 = f14486f;
            if (str3 != null) {
                if (str3.equals(bytesToString)) {
                    try {
                        zipFile.close();
                        return true;
                    } catch (Exception e5) {
                        HMSLog.i(f14481a, "close stream Exception!" + e5.getMessage());
                        return true;
                    }
                }
            }
            try {
                zipFile.close();
                return false;
            } catch (Exception e6) {
                HMSLog.i(f14481a, "close stream Exception!" + e6.getMessage());
                return false;
            }
        } catch (Exception e7) {
            e = e7;
            zipFile2 = zipFile;
            HMSLog.i(f14481a, "verifyApkHash Exception!" + e.getMessage());
            if (zipFile2 == null) {
                return false;
            }
            try {
                zipFile2.close();
                return false;
            } catch (Exception e8) {
                str2 = f14481a;
                HMSLog.i(str2, "close stream Exception!" + e8.getMessage());
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            r22 = zipFile;
            if (r22 != null) {
                try {
                    r22.close();
                } catch (Exception e9) {
                    HMSLog.i(f14481a, "close stream Exception!" + e9.getMessage());
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static byte[] a(ZipFile zipFile, String str) {
        Throwable th;
        InputStream inputStream;
        Exception e4;
        Throwable th2;
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        ZipEntry entry = zipFile.getEntry(str);
        OutputStream outputStream = null;
        if (entry == null) {
            return null;
        }
        try {
            inputStream = zipFile.getInputStream(entry);
            if (inputStream == null) {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
            } catch (Exception e5) {
                e4 = e5;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                try {
                    HMSLog.i(f14481a, "getManifestBytes Exception!" + e4.getMessage());
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    byteArrayOutputStream4 = byteArrayOutputStream2;
                    bufferedInputStream = bufferedInputStream;
                    byteArrayOutputStream3 = byteArrayOutputStream4;
                    outputStream = byteArrayOutputStream3;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th2;
            }
            try {
                byte[] bArr = new byte[Base64Utils.IO_BUFFER_SIZE];
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                    try {
                        for (int read = bufferedInputStream.read(bArr, 0, Base64Utils.IO_BUFFER_SIZE); read > 0; read = bufferedInputStream.read(bArr, 0, Base64Utils.IO_BUFFER_SIZE)) {
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                        return byteArray;
                    } catch (Exception e6) {
                        e4 = e6;
                        byteArrayOutputStream2 = bufferedOutputStream;
                        HMSLog.i(f14481a, "getManifestBytes Exception!" + e4.getMessage());
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                        return null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        byteArrayOutputStream3 = bufferedOutputStream;
                        outputStream = byteArrayOutputStream3;
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly(outputStream);
                        throw th2;
                    }
                } catch (Exception e7) {
                    e4 = e7;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th6) {
                    th2 = th6;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th2;
                }
            } catch (Exception e8) {
                e4 = e8;
                byteArrayOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                HMSLog.i(f14481a, "getManifestBytes Exception!" + e4.getMessage());
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                return null;
            } catch (Throwable th7) {
                th2 = th7;
                byteArrayOutputStream = null;
                byteArrayOutputStream4 = null;
                bufferedInputStream = bufferedInputStream;
                byteArrayOutputStream3 = byteArrayOutputStream4;
                outputStream = byteArrayOutputStream3;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th2;
            }
        } catch (Exception e9) {
            e4 = e9;
            inputStream = null;
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
        }
    }

    private static ArrayList<String> a(byte[] bArr) {
        if (bArr == null) {
            HMSLog.e(f14481a, "manifest is null！");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
                try {
                    if (a(bufferedReader, arrayList)) {
                        bufferedReader.close();
                        byteArrayInputStream.close();
                        return arrayList;
                    }
                    bufferedReader.close();
                    byteArrayInputStream.close();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            HMSLog.e(f14481a, "getManifestLinesArrary IOException!");
            return null;
        }
    }

    private static boolean b() {
        try {
        } catch (Exception e4) {
            HMSLog.i(f14481a, "verifyMDMSignatureV2 MDM verify Exception!:" + e4.getMessage());
        }
        if (a(Base64.decode(EMUI10_PK, 0), a(f14487g, "SHA-256"), b(f14484d), "SHA256withRSA")) {
            HMSLog.i(f14481a, "verifyMDMSignatureV2 verify successful!");
            return true;
        }
        HMSLog.i(f14481a, "verifyMDMSignatureV2 verify failure!");
        return false;
    }

    private static byte[] b(String str) {
        int i4;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 == 0) {
            i4 = length / 2;
        } else {
            i4 = (length / 2) + 1;
        }
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < length; i5 += 2) {
            int i6 = i5 + 1;
            if (i6 < length) {
                bArr[i5 / 2] = (byte) ((Character.digit(str.charAt(i5), 16) << 4) + Character.digit(str.charAt(i6), 16));
            } else {
                bArr[i5 / 2] = (byte) (Character.digit(str.charAt(i5), 16) << 4);
            }
        }
        return bArr;
    }

    private static byte[] a(ArrayList<String> arrayList) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
        try {
            try {
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String str = arrayList.get(i4);
                    bufferedWriter.write(str, 0, str.length());
                    bufferedWriter.write("\r\n", 0, 2);
                }
                bufferedWriter.flush();
            } catch (Exception e4) {
                HMSLog.i(f14481a, "getManifestBytesbySorted Exception!" + e4.getMessage());
            }
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            throw th;
        }
    }

    private static boolean a(BufferedReader bufferedReader, ArrayList<String> arrayList) {
        String a4 = a(bufferedReader);
        boolean z4 = false;
        while (a4 != null) {
            if (a4.equals("Name: META-INF/HUAWEI.CER")) {
                String a5 = a(bufferedReader);
                while (true) {
                    if (a5 == null) {
                        break;
                    }
                    if (a5.startsWith("Name:")) {
                        a4 = a5;
                        break;
                    }
                    a5 = a(bufferedReader);
                }
                z4 = true;
            }
            if (a4.length() != 0) {
                arrayList.add(a4);
            }
            a4 = a(bufferedReader);
        }
        return z4;
    }

    private static String a(BufferedReader bufferedReader) {
        int read;
        if (bufferedReader == null || (read = bufferedReader.read()) == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder(10);
        while (read != -1) {
            char c4 = (char) read;
            if (c4 == '\n') {
                break;
            }
            if (sb.length() < 4096) {
                sb.append(c4);
                read = bufferedReader.read();
            } else {
                throw new IOException("cert line is too long!");
            }
        }
        String sb2 = sb.toString();
        return (sb2.isEmpty() || !sb2.endsWith("\r")) ? sb2 : sb2.substring(0, sb2.length() - 1);
    }

    private static boolean a() {
        try {
            if (a(b("30820122300d06092a864886f70d01010105000382010f003082010a0282010100a3d269348ac59923f65e8111c337605e29a1d1bc54fa96c1445050dd14d8d63b10f9f0230bb87ef348183660bedcabfdec045e235ed96935799fcdb4af5c97717ff3b0954eaf1b723225b3a00f81cbd67ce6dc5a4c07f7741ad3bf1913a480c6e267ab1740f409edd2dc33c8b718a8e30e56d9a93f321723c1d0c9ea62115f996812ceef186954595e39a19b74245542c407f7dddb1d12e6eedcfc0bd7cd945ef7255ad0fc9e796258e0fb5e52a23013d15033a32b4071b65f3f924ae5c5761e22327b4d2ae60f4158a5eb15565ba079de29b81540f5fbb3be101a95357f367fc661d797074ff3826950029c52223e4594673a24a334cae62d63b838ba3df9770203010001"), a(f14487g, "SHA-256"), b(f14483c), "SHA256withRSA")) {
                HMSLog.i(f14481a, "verifyMDMSignatureV1 verify successful!");
                return true;
            }
            HMSLog.i(f14481a, "verifyMDMSignatureV1 verify failure!");
            return false;
        } catch (Exception e4) {
            HMSLog.i(f14481a, "verifyMDMSignatureV1 MDM verify Exception!:" + e4.getMessage());
            return false;
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr)));
        signature.update(bArr2);
        return signature.verify(bArr3);
    }

    private static byte[] a(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
        return messageDigest.digest();
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        return f14482b.matcher(str).replaceAll("");
    }
}
