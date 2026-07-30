package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cb3 extends i1 {
    public static final Parcelable.Creator<cb3> CREATOR = new va3(3);
    public final int m;
    public final IBinder n;
    public final c10 o;
    public final boolean p;
    public final boolean q;

    public cb3(int i, IBinder iBinder, c10 c10Var, boolean z, boolean z2) {
        this.m = i;
        this.n = iBinder;
        this.o = c10Var;
        this.p = z;
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        Object ws3Var;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof cb3)) {
                return false;
            }
            cb3 cb3Var = (cb3) obj;
            if (!this.o.equals(cb3Var.o)) {
                return false;
            }
            Object obj2 = null;
            IBinder iBinder = this.n;
            if (iBinder == null) {
                ws3Var = null;
            } else {
                int i = q2.h;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                ws3Var = queryLocalInterface instanceof nz0 ? (nz0) queryLocalInterface : new ws3(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = cb3Var.n;
            if (iBinder2 != null) {
                int i2 = q2.h;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof nz0 ? (nz0) queryLocalInterface2 : new ws3(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!ll3.C(ws3Var, obj2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.U(parcel, 2, this.n);
        yk3.V(parcel, 3, this.o, i);
        yk3.d0(parcel, 4, 4);
        parcel.writeInt(this.p ? 1 : 0);
        yk3.d0(parcel, 5, 4);
        parcel.writeInt(this.q ? 1 : 0);
        yk3.c0(parcel, b0);
    }
}
