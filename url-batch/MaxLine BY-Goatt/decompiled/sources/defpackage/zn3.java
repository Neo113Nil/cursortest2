package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class zn3 {
    public static final yf3 a;
    public static final yf3 b;
    public static volatile wb3 c;
    public static final Object d;
    public static Context e;

    static {
        new yf3(0, jk3.J("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new yf3(1, jk3.J("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new yf3(2, jk3.J("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new yf3(3, jk3.J("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kl3 a(String str, ml3 ml3Var, boolean z, boolean z2) {
        try {
            b();
            ll3.v(e);
            try {
                wb3 wb3Var = c;
                st1 st1Var = new st1(e.getPackageManager());
                pb3 pb3Var = (pb3) wb3Var;
                Parcel d2 = pb3Var.d();
                int i = wd3.a;
                d2.writeInt(1);
                int b0 = yk3.b0(d2, 20293);
                yk3.W(d2, 1, str);
                yk3.U(d2, 2, ml3Var);
                yk3.d0(d2, 3, 4);
                d2.writeInt(z ? 1 : 0);
                yk3.d0(d2, 4, 4);
                d2.writeInt(z2 ? 1 : 0);
                yk3.c0(d2, b0);
                wd3.c(d2, st1Var);
                Parcel b2 = pb3Var.b(d2, 5);
                Object[] objArr = b2.readInt() != 0;
                b2.recycle();
                return objArr != false ? kl3.f : new ts3(new kf3(z, str, ml3Var));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new kl3(1, "module call", e2, false);
            }
        } catch (ve0 e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new kl3(1, "module init: ".concat(String.valueOf(e3.getMessage())), e3, false);
        }
    }

    public static void b() {
        wb3 pb3Var;
        if (c != null) {
            return;
        }
        ll3.v(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder b2 = ye0.c(e, ye0.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = ub3.h;
                    if (b2 == null) {
                        pb3Var = null;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        pb3Var = queryLocalInterface instanceof wb3 ? (wb3) queryLocalInterface : new pb3(b2, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    c = pb3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
