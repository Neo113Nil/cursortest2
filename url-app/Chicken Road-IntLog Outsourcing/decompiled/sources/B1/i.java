package B1;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import h2.C0482c;
import l.q0;
import o1.u;

/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.a {

    /* renamed from: D, reason: collision with root package name */
    public final String f218D;

    /* renamed from: E, reason: collision with root package name */
    public final B0.i f219E;

    public i(Context context, Looper looper, m1.i iVar, m1.j jVar, q0 q0Var) {
        super(context, looper, 23, q0Var, iVar, jVar);
        C0482c c0482c = new C0482c(2, this);
        this.f218D = "locationServices";
        this.f219E = new B0.i(c0482c);
    }

    public final Location A(String str) {
        l1.d[] i2 = i();
        l1.d dVar = E1.c.f644d;
        boolean z = false;
        int length = i2 != null ? i2.length : 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (!u.j(i2[i3], dVar)) {
                i3++;
            } else if (i3 >= 0) {
                z = true;
            }
        }
        B0.i iVar = this.f219E;
        if (!z) {
            C0482c c0482c = (C0482c) iVar.f153b;
            ((i) c0482c.f5783b).p();
            f j2 = c0482c.j();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(j2.f211f);
            Parcel e3 = j2.e(obtain, 7);
            Location location = (Location) k.a(e3, Location.CREATOR);
            e3.recycle();
            return location;
        }
        C0482c c0482c2 = (C0482c) iVar.f153b;
        ((i) c0482c2.f5783b).p();
        f j6 = c0482c2.j();
        Parcel obtain2 = Parcel.obtain();
        obtain2.writeInterfaceToken(j6.f211f);
        obtain2.writeString(str);
        Parcel e6 = j6.e(obtain2, 80);
        Location location2 = (Location) k.a(e6, Location.CREATOR);
        e6.recycle();
        return location2;
    }

    @Override // m1.InterfaceC1276c
    public final int f() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a, m1.InterfaceC1276c
    public final void l() {
        synchronized (this.f219E) {
            if (a()) {
                try {
                    this.f219E.f();
                    this.f219E.getClass();
                } catch (Exception e3) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e3);
                }
            }
            super.l();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final l1.d[] r() {
        return E1.c.f645e;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f218D);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String v() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean x() {
        return true;
    }
}
