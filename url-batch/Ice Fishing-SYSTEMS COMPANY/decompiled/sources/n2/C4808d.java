package n2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.BinderC3994u8;
import f3.C4509h;
import q2.U;
import q2.V;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4808d extends P2.a {
    public static final Parcelable.Creator<C4808d> CREATOR = new C4509h(3);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39637n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39638u;

    /* renamed from: v, reason: collision with root package name */
    public final IBinder f39639v;

    public C4808d(boolean z8, IBinder iBinder, IBinder iBinder2) {
        V v6;
        this.f39637n = z8;
        if (iBinder != null) {
            int i = BinderC3994u8.f34545u;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            v6 = queryLocalInterface instanceof V ? (V) queryLocalInterface : new U(iBinder);
        } else {
            v6 = null;
        }
        this.f39638u = v6;
        this.f39639v = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f39637n ? 1 : 0);
        V v6 = this.f39638u;
        S0.f.s(parcel, 2, v6 == null ? null : v6.asBinder());
        S0.f.s(parcel, 3, this.f39639v);
        S0.f.C(parcel, B8);
    }
}
