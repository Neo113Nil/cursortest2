package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i60 extends u2.h {

    /* renamed from: a, reason: collision with root package name */
    private final h60 f6543a;

    /* renamed from: c, reason: collision with root package name */
    private final o40 f6545c;

    /* renamed from: e, reason: collision with root package name */
    private final u2.c f6547e;

    /* renamed from: b, reason: collision with root package name */
    private final List<u2.d> f6544b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final r2.w f6546d = new r2.w();

    /* renamed from: f, reason: collision with root package name */
    private final List<Object> f6548f = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(3:2|3|(2:5|(6:8|(4:13|(1:15)(1:22)|(3:17|18|19)(1:21)|20)|23|(0)(0)|20|6)))|(3:25|26|(2:28|(5:31|(1:33)(1:40)|(3:35|36|37)(1:39)|38|29)))|42|43|(7:45|46|47|48|(2:50|51)|53|54)|59|46|47|48|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[Catch: RemoteException -> 0x00bc, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00bc, blocks: (B:48:0x00a7, B:50:0x00af), top: B:47:0x00a7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i60(h60 h60Var) {
        o40 o40Var;
        n40 j7;
        n40 n40Var;
        IBinder iBinder;
        this.f6543a = h60Var;
        h40 h40Var = null;
        try {
            List y6 = h60Var.y();
            if (y6 != null) {
                for (Object obj : y6) {
                    if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        n40Var = queryLocalInterface instanceof n40 ? (n40) queryLocalInterface : new l40(iBinder);
                        if (n40Var == null) {
                            this.f6544b.add(new o40(n40Var));
                        }
                    }
                    n40Var = null;
                    if (n40Var == null) {
                    }
                }
            }
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
        try {
            List x6 = this.f6543a.x();
            if (x6 != null) {
                for (Object obj2 : x6) {
                    my s62 = obj2 instanceof IBinder ? ly.s6((IBinder) obj2) : null;
                    if (s62 != null) {
                        this.f6548f.add(new ny(s62));
                    }
                }
            }
        } catch (RemoteException e8) {
            io0.e("", e8);
        }
        try {
            j7 = this.f6543a.j();
        } catch (RemoteException e9) {
            io0.e("", e9);
        }
        if (j7 != null) {
            o40Var = new o40(j7);
            this.f6545c = o40Var;
            if (this.f6543a.h() != null) {
                h40Var = new h40(this.f6543a.h());
            }
            this.f6547e = h40Var;
        }
        o40Var = null;
        this.f6545c = o40Var;
        if (this.f6543a.h() != null) {
        }
        this.f6547e = h40Var;
    }

    @Override // u2.h
    public final String a() {
        try {
            return this.f6543a.m();
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }

    @Override // u2.h
    public final String b() {
        try {
            return this.f6543a.n();
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }

    @Override // u2.h
    public final String c() {
        try {
            return this.f6543a.l();
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }

    @Override // u2.h
    public final String d() {
        try {
            return this.f6543a.r();
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }

    @Override // u2.h
    public final u2.d e() {
        return this.f6545c;
    }

    @Override // u2.h
    public final List<u2.d> f() {
        return this.f6544b;
    }

    @Override // u2.h
    public final String g() {
        try {
            return this.f6543a.p();
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }

    @Override // u2.h
    public final Double h() {
        try {
            double b7 = this.f6543a.b();
            if (b7 == -1.0d) {
                return null;
            }
            return Double.valueOf(b7);
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }

    @Override // u2.h
    public final String i() {
        try {
            return this.f6543a.q();
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }

    @Override // u2.h
    public final r2.w j() {
        try {
            if (this.f6543a.f() != null) {
                this.f6546d.c(this.f6543a.f());
            }
        } catch (RemoteException e7) {
            io0.e("Exception occurred while getting video controller", e7);
        }
        return this.f6546d;
    }

    @Override // u2.h
    public final Object k() {
        try {
            x3.a k7 = this.f6543a.k();
            if (k7 != null) {
                return x3.b.O0(k7);
            }
            return null;
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }
}
