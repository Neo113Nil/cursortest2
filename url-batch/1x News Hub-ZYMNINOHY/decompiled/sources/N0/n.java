package N0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n extends O0.a {
    public static final Parcelable.Creator<n> CREATOR = new H.h(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f1044a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f1045b;

    /* renamed from: c, reason: collision with root package name */
    public final K0.b f1046c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1047d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1048e;

    public n(int i3, IBinder iBinder, K0.b bVar, boolean z, boolean z2) {
        this.f1044a = i3;
        this.f1045b = iBinder;
        this.f1046c = bVar;
        this.f1047d = z;
        this.f1048e = z2;
    }

    public final boolean equals(Object obj) {
        Object c3;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f1046c.equals(nVar.f1046c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f1045b;
        if (iBinder == null) {
            c3 = null;
        } else {
            int i3 = AbstractBinderC0062a.f996c;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            c3 = queryLocalInterface instanceof e ? (e) queryLocalInterface : new C(iBinder);
        }
        IBinder iBinder2 = nVar.f1045b;
        if (iBinder2 != null) {
            int i4 = AbstractBinderC0062a.f996c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof e ? (e) queryLocalInterface2 : new C(iBinder2);
        }
        return r.e(c3, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f1044a);
        C2.b.M(parcel, 2, this.f1045b);
        C2.b.N(parcel, 3, this.f1046c, i3);
        C2.b.U(parcel, 4, 4);
        parcel.writeInt(this.f1047d ? 1 : 0);
        C2.b.U(parcel, 5, 4);
        parcel.writeInt(this.f1048e ? 1 : 0);
        C2.b.T(parcel, S2);
    }
}
