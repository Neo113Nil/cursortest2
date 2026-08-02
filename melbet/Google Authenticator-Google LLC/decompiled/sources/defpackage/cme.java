package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cme {
    public static volatile HashSet a;
    public static volatile HashSet b;
    private static cme e;
    public final Object c;
    public volatile Object d;

    public cme(Looper looper, Object obj, String str) {
        this.c = new ddk(looper, 1);
        oy.au(obj, "Listener must not be null");
        oy.ar(str);
        this.d = new cop(obj, str);
    }

    public static cme a(Context context) {
        cme cmeVar;
        oy.at(context);
        synchronized (cme.class) {
            cmeVar = e;
            if (cmeVar == null) {
                clw.b(context);
                cmeVar = new cme(context);
                e = cmeVar;
            }
        }
        return cmeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: IllegalArgumentException -> 0x00a4, TryCatch #0 {IllegalArgumentException -> 0x00a4, blocks: (B:19:0x002a, B:20:0x002f, B:22:0x0037, B:24:0x003d, B:27:0x0044, B:29:0x0054, B:31:0x0060, B:32:0x0069, B:34:0x006f, B:36:0x007a, B:37:0x0084, B:39:0x008c, B:48:0x009c, B:49:0x00a3, B:50:0x0065, B:51:0x002d), top: B:17:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[Catch: IllegalArgumentException -> 0x00a4, TryCatch #0 {IllegalArgumentException -> 0x00a4, blocks: (B:19:0x002a, B:20:0x002f, B:22:0x0037, B:24:0x003d, B:27:0x0044, B:29:0x0054, B:31:0x0060, B:32:0x0069, B:34:0x006f, B:36:0x007a, B:37:0x0084, B:39:0x008c, B:48:0x009c, B:49:0x00a3, B:50:0x0065, B:51:0x002d), top: B:17:0x0028 }] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final boolean b(PackageInfo packageInfo, boolean z) {
        SigningInfo signingInfo;
        hel helVar;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        if (packageInfo == null) {
            return false;
        }
        if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            hel helVar2 = z ? clv.b : clv.a;
            int i = csj.a;
            signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (!hasMultipleSigners) {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    if (signingCertificateHistory != null) {
                        int i2 = hel.d;
                        heg hegVar = new heg(4);
                        signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                        for (Signature signature : signingCertificateHistory2) {
                            hegVar.h(signature.toByteArray());
                        }
                        helVar = hegVar.g();
                        if (!helVar.isEmpty()) {
                            throw new IllegalArgumentException("Unable to obtain package certificate history.");
                        }
                        hel a2 = helVar.a();
                        int size = a2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            byte[] bArr = (byte[]) a2.get(i3);
                            hjs listIterator = helVar2.listIterator(0);
                            do {
                                int i4 = i3 + 1;
                                if (listIterator.hasNext()) {
                                }
                            } while (!Arrays.equals(bArr, (byte[]) listIterator.next()));
                            return true;
                        }
                        return false;
                    }
                }
            }
            int i5 = hel.d;
            helVar = his.a;
            if (!helVar.isEmpty()) {
            }
        } catch (IllegalArgumentException unused) {
            return (z ? f(packageInfo, clv.c) : f(packageInfo, clv.c[0])) != null;
        }
    }

    private static cqr f(PackageInfo packageInfo, cqr... cqrVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            clt cltVar = new clt(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < cqrVarArr.length; i++) {
                if (cqrVarArr[i].equals(cltVar)) {
                    return cqrVarArr[i];
                }
            }
        }
        return null;
    }

    public final void c() {
        this.d = null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void d(coq coqVar) {
        this.c.execute(new avl((Object) this, (Object) coqVar, 11, (short[]) null));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [bes, java.lang.Object] */
    public final bes e() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    Object obj = ((brn) this.c).a;
                    File cacheDir = ((Context) ((ehn) obj).b).getCacheDir();
                    beu beuVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, (String) ((ehn) obj).a);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        beuVar = new beu(file);
                    }
                    this.d = beuVar;
                }
                if (this.d == null) {
                    this.d = new bet();
                }
            }
        }
        return this.d;
    }

    public cme(Context context) {
        this.c = context.getApplicationContext();
    }

    public cme(brn brnVar) {
        this.c = brnVar;
    }
}
