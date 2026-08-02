package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class clz extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(9);
    public final String a;
    public final IBinder b;
    public final boolean c;
    public final boolean d;
    private cqr e;

    public clz(String str, cqr cqrVar, boolean z, boolean z2) {
        this.a = str;
        this.e = cqrVar;
        this.b = cqrVar == null ? null : cqrVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.C(parcel, 2, this.b);
        oy.s(parcel, 3, this.c);
        oy.s(parcel, 4, this.d);
        oy.r(parcel, q);
    }

    public clz(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        this.b = iBinder;
        this.c = z;
        this.d = z2;
    }
}
