package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: com.baidu.mapsdkplatform.comapi.util.a$a, reason: collision with other inner class name */
    static class C0080a {
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

    public static String a(Context context) {
        String packageName = context.getPackageName();
        return a(context, packageName) + ";" + packageName;
    }

    private static String a(Context context, String str) {
        String str2;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        SigningInfo signingInfo2;
        SigningInfo signingInfo3;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = context.getPackageManager().getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    signingInfo3 = context.getPackageManager().getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                    signatureArr = signingInfo3.getApkContentsSigners();
                } else {
                    signingInfo2 = context.getPackageManager().getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                    signatureArr = signingInfo2.getSigningCertificateHistory();
                }
            } else {
                signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            }
            str2 = a((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray())));
        } catch (Exception e8) {
            e8.printStackTrace();
            str2 = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i8 = 0; i8 < str2.length(); i8++) {
            stringBuffer.append(str2.charAt(i8));
            if (i8 > 0 && i8 % 2 == 1 && i8 < str2.length() - 1) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }

    static String a(X509Certificate x509Certificate) {
        try {
            return C0080a.a(a(x509Certificate.getEncoded()));
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }

    static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
