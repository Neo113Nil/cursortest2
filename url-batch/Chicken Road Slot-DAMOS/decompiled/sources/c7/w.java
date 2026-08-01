package c7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends d7.a {
    public static final Parcelable.Creator<w> CREATOR = new p(4);

    /* renamed from: d, reason: collision with root package name */
    public final int f1994d;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f1995e;

    /* renamed from: i, reason: collision with root package name */
    public final z6.b f1996i;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1997r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1998s;

    public w(int i3, IBinder iBinder, z6.b bVar, boolean z10, boolean z11) {
        this.f1994d = i3;
        this.f1995e = iBinder;
        this.f1996i = bVar;
        this.f1997r = z10;
        this.f1998s = z11;
    }

    public final boolean equals(Object obj) {
        Object q0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f1996i.equals(wVar.f1996i)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f1995e;
        if (iBinder == null) {
            q0Var = null;
        } else {
            int i3 = a.f1870e;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            q0Var = queryLocalInterface instanceof j ? (j) queryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = wVar.f1995e;
        if (iBinder2 != null) {
            int i10 = a.f1870e;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof j ? (j) queryLocalInterface2 : new q0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return c0.k(q0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f1994d);
        cf.c.S(parcel, 2, this.f1995e);
        cf.c.U(parcel, 3, this.f1996i, i3);
        cf.c.Y(parcel, 4, 4);
        parcel.writeInt(this.f1997r ? 1 : 0);
        cf.c.Y(parcel, 5, 4);
        parcel.writeInt(this.f1998s ? 1 : 0);
        cf.c.a0(parcel, Z);
    }
}
