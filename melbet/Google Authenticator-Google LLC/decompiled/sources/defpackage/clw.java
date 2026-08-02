package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clw {
    static final clu a;
    static final clu b;
    public static Context c;
    public static volatile cqv d;
    private static final Object e;

    static {
        new cln(cqr.e("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new clo(cqr.e("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new clp(cqr.e("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new clq(cqr.e("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new clr(cqr.e("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new cls(cqr.e("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        e = new Object();
    }

    public static cma a(cly clyVar) {
        if (clyVar.a) {
            clyVar.b();
            long j = clyVar.e;
            return new cma(true);
        }
        String str = clyVar.b;
        if (clyVar.a() == 4) {
            new PackageManager.NameNotFoundException();
        }
        clyVar.b();
        clyVar.a();
        return new cma(false);
    }

    static synchronized void b(Context context) {
        synchronized (clw.class) {
            if (c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                c = context.getApplicationContext();
            }
        }
    }

    public static void c() {
        cqv cqvVar;
        if (d != null) {
            return;
        }
        oy.at(c);
        synchronized (e) {
            if (d == null) {
                IBinder c2 = ctg.b(c, ctg.b, "com.google.android.gms.googlecertificates").c();
                if (c2 == null) {
                    cqvVar = null;
                } else {
                    IInterface queryLocalInterface = c2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    cqvVar = queryLocalInterface instanceof cqv ? (cqv) queryLocalInterface : new cqv(c2);
                }
                d = cqvVar;
            }
        }
    }

    @Deprecated
    public static cma d(String str, cqr cqrVar, boolean z, boolean z2) {
        cma cmaVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                c();
                oy.at(c);
                clz clzVar = new clz(str, cqrVar, z, z2);
                try {
                    cqv cqvVar = d;
                    cst cstVar = new cst(c.getPackageManager());
                    Parcel a2 = cqvVar.a();
                    bmt.c(a2, clzVar);
                    bmt.d(a2, cstVar);
                    Parcel b2 = cqvVar.b(5, a2);
                    boolean e2 = bmt.e(b2);
                    b2.recycle();
                    cmaVar = e2 ? cma.a : new cma(false);
                } catch (RemoteException e3) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                    cmaVar = new cma(false);
                }
            } catch (ctc e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                e4.getMessage();
                cmaVar = new cma(false);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return cmaVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
