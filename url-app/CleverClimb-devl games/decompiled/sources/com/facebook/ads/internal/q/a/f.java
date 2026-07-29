package com.facebook.ads.internal.q.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.Signature;
import android.os.Build;
import com.google.android.gms.common.util.AndroidUtilsLight;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5407a = "f";

    public enum a {
        UNKNOWN(0),
        UNROOTED(1),
        ROOTED(2);


        /* renamed from: d, reason: collision with root package name */
        public final int f5411d;

        a(int i) {
            this.f5411d = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[Catch: Throwable -> 0x0020, TryCatch #0 {Throwable -> 0x0020, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x001a, B:14:0x001d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[Catch: Throwable -> 0x0020, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0020, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x001a, B:14:0x001d), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a() {
        boolean z;
        try {
            if (!c() && !b() && !a("su")) {
                z = false;
                return !z ? a.ROOTED : a.UNROOTED;
            }
            z = true;
            if (!z) {
            }
        } catch (Throwable unused) {
            return a.UNKNOWN;
        }
    }

    public static String a(Context context) {
        try {
            return b(context);
        } catch (Exception unused) {
            return null;
        }
    }

    private static PublicKey a(Signature signature) {
        return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    private static boolean a(String str) {
        File[] listFiles;
        for (String str2 : System.getenv("PATH").split(":")) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private static String b(Context context) {
        StringBuilder sb = new StringBuilder();
        for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
            sb.append(h.a(MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1).digest(a(signature).getEncoded())));
            sb.append(";");
        }
        return sb.toString();
    }

    private static boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean c() {
        return new File("/system/app/Superuser.apk").exists();
    }
}
