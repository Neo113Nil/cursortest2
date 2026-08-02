package d2;

import a2.C0162b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;

/* loaded from: classes.dex */
public final class o extends AbstractC0408a {
    public static final Parcelable.Creator<o> CREATOR = new H.h(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f8286a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f8287b;

    /* renamed from: c, reason: collision with root package name */
    public final C0162b f8288c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8289d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8290e;

    public o(int i4, IBinder iBinder, C0162b c0162b, boolean z, boolean z4) {
        this.f8286a = i4;
        this.f8287b = iBinder;
        this.f8288c = c0162b;
        this.f8289d = z;
        this.f8290e = z4;
    }

    public final boolean equals(Object obj) {
        Object c0382d;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f8288c.equals(oVar.f8288c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f8287b;
        if (iBinder == null) {
            c0382d = null;
        } else {
            int i4 = AbstractBinderC0383a.f8233b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            c0382d = queryLocalInterface instanceof InterfaceC0387e ? (InterfaceC0387e) queryLocalInterface : new C0382D(iBinder);
        }
        IBinder iBinder2 = oVar.f8287b;
        if (iBinder2 != null) {
            int i5 = AbstractBinderC0383a.f8233b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof InterfaceC0387e ? (InterfaceC0387e) queryLocalInterface2 : new C0382D(iBinder2);
        }
        return s.e(c0382d, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        O3.l.G(parcel, 1, 4);
        parcel.writeInt(this.f8286a);
        O3.l.y(parcel, 2, this.f8287b);
        O3.l.z(parcel, 3, this.f8288c, i4);
        O3.l.G(parcel, 4, 4);
        parcel.writeInt(this.f8289d ? 1 : 0);
        O3.l.G(parcel, 5, 4);
        parcel.writeInt(this.f8290e ? 1 : 0);
        O3.l.F(parcel, D3);
    }
}
