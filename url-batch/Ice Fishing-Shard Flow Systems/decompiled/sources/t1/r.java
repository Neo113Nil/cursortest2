package t1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class r extends AbstractC0943a {
    public static final Parcelable.Creator<r> CREATOR = new I1.c(28);

    /* renamed from: d, reason: collision with root package name */
    public final int f7989d;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f7990e;

    /* renamed from: i, reason: collision with root package name */
    public final q1.b f7991i;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7992l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7993m;

    public r(int i2, IBinder iBinder, q1.b bVar, boolean z7, boolean z8) {
        this.f7989d = i2;
        this.f7990e = iBinder;
        this.f7991i = bVar;
        this.f7992l = z7;
        this.f7993m = z8;
    }

    public final boolean equals(Object obj) {
        Object c0912i;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f7991i.equals(rVar.f7991i)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f7990e;
        if (iBinder == null) {
            c0912i = null;
        } else {
            int i2 = AbstractBinderC0914a.f7923f;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            c0912i = queryLocalInterface instanceof InterfaceC0919f ? (InterfaceC0919f) queryLocalInterface : new C0912I(iBinder);
        }
        IBinder iBinder2 = rVar.f7990e;
        if (iBinder2 != null) {
            int i5 = AbstractBinderC0914a.f7923f;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof InterfaceC0919f ? (InterfaceC0919f) queryLocalInterface2 : new C0912I(iBinder2);
        }
        return u.i(c0912i, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f7989d);
        IBinder iBinder = this.f7990e;
        if (iBinder != null) {
            int Q4 = AbstractC1053a.Q(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            AbstractC1053a.S(parcel, Q4);
        }
        AbstractC1053a.J(parcel, 3, this.f7991i, i2);
        AbstractC1053a.P(parcel, 4, 4);
        parcel.writeInt(this.f7992l ? 1 : 0);
        AbstractC1053a.P(parcel, 5, 4);
        parcel.writeInt(this.f7993m ? 1 : 0);
        AbstractC1053a.S(parcel, Q);
    }
}
