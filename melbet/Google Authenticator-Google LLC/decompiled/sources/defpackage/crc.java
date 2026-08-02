package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crc extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(4);
    final int a;
    final IBinder b;
    public final clg c;
    public final boolean d;
    public final boolean e;

    public crc(int i, IBinder iBinder, clg clgVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = clgVar;
        this.d = z;
        this.e = z2;
    }

    public final cqp a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof cqp ? (cqp) queryLocalInterface : new cqp(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crc)) {
            return false;
        }
        crc crcVar = (crc) obj;
        return this.c.equals(crcVar.c) && Objects.equals(a(), crcVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.C(parcel, 2, this.b);
        oy.H(parcel, 3, this.c, i);
        oy.s(parcel, 4, this.d);
        oy.s(parcel, 5, this.e);
        oy.r(parcel, q);
    }
}
