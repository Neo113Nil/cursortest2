package U0;

import a.AbstractC0219a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p extends V0.a {
    public static final Parcelable.Creator<p> CREATOR = new I.j(9);

    /* renamed from: f, reason: collision with root package name */
    public final int f2568f;

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2569g;

    /* renamed from: h, reason: collision with root package name */
    public final R0.a f2570h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2571i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2572j;

    public p(int i7, IBinder iBinder, R0.a aVar, boolean z5, boolean z6) {
        this.f2568f = i7;
        this.f2569g = iBinder;
        this.f2570h = aVar;
        this.f2571i = z5;
        this.f2572j = z6;
    }

    public final boolean equals(Object obj) {
        Object d7;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f2570h.equals(pVar.f2570h)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f2569g;
        if (iBinder == null) {
            d7 = null;
        } else {
            int i7 = AbstractBinderC0210a.f2507d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            d7 = queryLocalInterface instanceof f ? (f) queryLocalInterface : new D(iBinder);
        }
        IBinder iBinder2 = pVar.f2569g;
        if (iBinder2 != null) {
            int i8 = AbstractBinderC0210a.f2507d;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof f ? (f) queryLocalInterface2 : new D(iBinder2);
        }
        return t.i(d7, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f2568f);
        IBinder iBinder = this.f2569g;
        if (iBinder != null) {
            int O7 = AbstractC0219a.O(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            AbstractC0219a.Q(parcel, O7);
        }
        AbstractC0219a.I(parcel, 3, this.f2570h, i7);
        AbstractC0219a.R(parcel, 4, 4);
        parcel.writeInt(this.f2571i ? 1 : 0);
        AbstractC0219a.R(parcel, 5, 4);
        parcel.writeInt(this.f2572j ? 1 : 0);
        AbstractC0219a.Q(parcel, O6);
    }
}
