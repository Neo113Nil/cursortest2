package z6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c7.a0;
import c7.b0;
import c7.c0;
import c7.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final n f10903a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f10904b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile b0 f10905c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f10906d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f10907e;

    static {
        new n(0, o.G("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new n(1, o.G("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new n(2, o.G("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new n(3, o.G("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f10903a = new n(4, o.G("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f10904b = new n(5, o.G("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f10906d = new Object();
    }

    public static void a() {
        b0 zVar;
        if (f10905c != null) {
            return;
        }
        c0.g(f10907e);
        synchronized (f10906d) {
            try {
                if (f10905c == null) {
                    IBinder b10 = k7.c.c(f10907e, k7.c.f5487d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i3 = a0.f1871e;
                    if (b10 == null) {
                        zVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zVar = queryLocalInterface instanceof b0 ? (b0) queryLocalInterface : new z(b10, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    f10905c = zVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static v b(String str, p pVar, boolean z10, boolean z11) {
        try {
            a();
            c0.g(f10907e);
            try {
                b0 b0Var = f10905c;
                j7.b bVar = new j7.b(f10907e.getPackageManager());
                z zVar = (z) b0Var;
                Parcel F = zVar.F();
                int i3 = o7.h.f7551a;
                boolean z12 = true;
                F.writeInt(1);
                int Z = cf.c.Z(F, 20293);
                cf.c.V(F, 1, str);
                cf.c.S(F, 2, pVar);
                cf.c.Y(F, 3, 4);
                F.writeInt(z10 ? 1 : 0);
                cf.c.Y(F, 4, 4);
                F.writeInt(z11 ? 1 : 0);
                cf.c.a0(F, Z);
                o7.h.b(F, bVar);
                Parcel D = zVar.D(F, 5);
                if (D.readInt() == 0) {
                    z12 = false;
                }
                D.recycle();
                return z12 ? v.f10914d : new u(new q(z10, str, pVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return v.c("module call", e2);
            }
        } catch (k7.a e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return v.c("module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }
}
