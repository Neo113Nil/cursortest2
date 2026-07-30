package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ht1 extends t0 {
    public static final Parcelable.Creator<ht1> CREATOR = new g2(15);
    public final int d;
    public final IBinder e;
    public final fm g;
    public final boolean h;
    public final boolean i;

    public ht1(int i, IBinder iBinder, fm fmVar, boolean z, boolean z2) {
        this.d = i;
        this.e = iBinder;
        this.g = fmVar;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        Object yu1Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht1)) {
            return false;
        }
        ht1 ht1Var = (ht1) obj;
        if (!this.g.equals(ht1Var.g)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            yu1Var = null;
        } else {
            int i = a2.c;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            yu1Var = queryLocalInterface instanceof t60 ? (t60) queryLocalInterface : new yu1(iBinder);
        }
        IBinder iBinder2 = ht1Var.e;
        if (iBinder2 != null) {
            int i2 = a2.c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof t60 ? (t60) queryLocalInterface2 : new yu1(iBinder2);
        }
        return xa0.m(yu1Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        IBinder iBinder = this.e;
        if (iBinder != null) {
            int P2 = y90.P(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            y90.Q(parcel, P2);
        }
        y90.L(parcel, 3, this.g, i);
        y90.R(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        y90.R(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        y90.Q(parcel, P);
    }
}
