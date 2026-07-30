package com.baidu.lbsapi.auth;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Locale;

/* loaded from: classes2.dex */
class d {

    static class a {
        public static String a(byte[] bArr) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i8 = 0; i8 < bArr.length; i8++) {
                sb.append(cArr[(bArr[i8] & 240) >> 4]);
                sb.append(cArr[bArr[i8] & 15]);
            }
            return sb.toString();
        }
    }

    static String a() {
        return Locale.getDefault().getLanguage();
    }

    protected static String[] b(Context context) {
        String packageName = context.getPackageName();
        String[] b8 = b(context, packageName);
        if (b8 == null || b8.length <= 0) {
            return null;
        }
        int length = b8.length;
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            strArr[i8] = b8[i8] + ";" + packageName;
            if (b.f4311a) {
                b.a("mcode" + strArr[i8]);
            }
        }
        return strArr;
    }

    protected static String a(Context context) {
        String packageName = context.getPackageName();
        return a(context, packageName) + ";" + packageName;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String[] b(Context context, String str) {
        String[] strArr;
        StringBuilder sb;
        int i8;
        PackageManager packageManager;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        String[] strArr2 = null;
        try {
        } catch (PackageManager.NameNotFoundException e8) {
            e = e8;
            strArr = null;
        } catch (CertificateException e9) {
            e = e9;
            strArr = null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = context.getPackageManager().getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            if (signingInfo != null) {
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                if (signatureArr != null || signatureArr.length <= 0) {
                    strArr = null;
                } else {
                    strArr = new String[signatureArr.length];
                    for (int i9 = 0; i9 < signatureArr.length; i9++) {
                        try {
                            strArr[i9] = a((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[i9].toByteArray())));
                        } catch (PackageManager.NameNotFoundException e10) {
                            e = e10;
                            sb = new StringBuilder();
                            sb.append("getFingerPrint：");
                            sb.append(e.toString());
                            b.a(sb.toString());
                            if (strArr != null) {
                            }
                            return strArr2;
                        } catch (CertificateException e11) {
                            e = e11;
                            sb = new StringBuilder();
                            sb.append("getFingerPrint：");
                            sb.append(e.toString());
                            b.a(sb.toString());
                            if (strArr != null) {
                            }
                            return strArr2;
                        }
                    }
                }
                if (strArr != null && strArr.length > 0) {
                    strArr2 = new String[strArr.length];
                    for (i8 = 0; i8 < strArr.length; i8++) {
                        StringBuffer stringBuffer = new StringBuffer();
                        for (int i10 = 0; i10 < strArr[i8].length(); i10++) {
                            stringBuffer.append(strArr[i8].charAt(i10));
                            if (i10 > 0 && i10 % 2 == 1 && i10 < strArr[i8].length() - 1) {
                                stringBuffer.append(":");
                            }
                        }
                        strArr2[i8] = stringBuffer.toString();
                    }
                }
                return strArr2;
            }
            packageManager = context.getPackageManager();
        } else {
            packageManager = context.getPackageManager();
        }
        signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr != null) {
        }
        strArr = null;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            while (i8 < strArr.length) {
            }
        }
        return strArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0099 A[LOOP:0: B:13:0x0099->B:23:0x00b9, LOOP_START, PHI: r1
      0x0099: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:12:0x0097, B:23:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(Context context, String str) {
        StringBuilder sb;
        String str2;
        PackageManager packageManager;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        SigningInfo signingInfo2;
        SigningInfo signingInfo3;
        try {
        } catch (PackageManager.NameNotFoundException e8) {
            e = e8;
            sb = new StringBuilder();
            sb.append("getFingerPrint：");
            sb.append(e.toString());
            b.a(sb.toString());
            str2 = "";
            StringBuffer stringBuffer = new StringBuffer();
            if (str2 != null) {
            }
            return stringBuffer.toString();
        } catch (CertificateException e9) {
            e = e9;
            sb = new StringBuilder();
            sb.append("getFingerPrint：");
            sb.append(e.toString());
            b.a(sb.toString());
            str2 = "";
            StringBuffer stringBuffer2 = new StringBuffer();
            if (str2 != null) {
            }
            return stringBuffer2.toString();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = context.getPackageManager().getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            if (signingInfo != null) {
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    signingInfo3 = context.getPackageManager().getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                    signatureArr = signingInfo3.getApkContentsSigners();
                } else {
                    signingInfo2 = context.getPackageManager().getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                    signatureArr = signingInfo2.getSigningCertificateHistory();
                }
                str2 = a((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray())));
                StringBuffer stringBuffer22 = new StringBuffer();
                if (str2 != null) {
                    for (int i8 = 0; i8 < str2.length(); i8++) {
                        stringBuffer22.append(str2.charAt(i8));
                        if (i8 > 0 && i8 % 2 == 1 && i8 < str2.length() - 1) {
                            stringBuffer22.append(":");
                        }
                    }
                }
                return stringBuffer22.toString();
            }
            packageManager = context.getPackageManager();
        } else {
            packageManager = context.getPackageManager();
        }
        signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        str2 = a((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray())));
        StringBuffer stringBuffer222 = new StringBuffer();
        if (str2 != null) {
        }
        return stringBuffer222.toString();
    }

    static String a(X509Certificate x509Certificate) {
        try {
            return a.a(a(x509Certificate.getEncoded()));
        } catch (CertificateEncodingException e8) {
            b.a("getFingerprintAs：" + e8.toString());
            return null;
        }
    }

    static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException e8) {
            b.a("generateSHA1：" + e8.toString());
            return null;
        }
    }
}
