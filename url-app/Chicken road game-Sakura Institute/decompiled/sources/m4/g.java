package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends n4.a {
    public static final Parcelable.Creator<g> CREATOR = new d4.a(9);

    /* renamed from: f, reason: collision with root package name */
    public final int f6366f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6367g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6368h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6369i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6370j;

    public g(int i7, int i8, int i9, boolean z8, boolean z9) {
        this.f6366f = i7;
        this.f6367g = z8;
        this.f6368h = z9;
        this.f6369i = i8;
        this.f6370j = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = a8.m.R(parcel, 20293);
        a8.m.T(parcel, 1, 4);
        parcel.writeInt(this.f6366f);
        a8.m.T(parcel, 2, 4);
        parcel.writeInt(this.f6367g ? 1 : 0);
        a8.m.T(parcel, 3, 4);
        parcel.writeInt(this.f6368h ? 1 : 0);
        a8.m.T(parcel, 4, 4);
        parcel.writeInt(this.f6369i);
        a8.m.T(parcel, 5, 4);
        parcel.writeInt(this.f6370j);
        a8.m.S(parcel, R);
    }
}
