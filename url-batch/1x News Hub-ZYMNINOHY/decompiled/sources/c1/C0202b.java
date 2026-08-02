package c1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202b extends O0.a {
    public static final Parcelable.Creator<C0202b> CREATOR = new android.support.v4.media.session.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2621b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f2622c;

    public C0202b(int i3, int i4, Intent intent) {
        this.f2620a = i3;
        this.f2621b = i4;
        this.f2622c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f2620a);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(this.f2621b);
        C2.b.N(parcel, 3, this.f2622c, i3);
        C2.b.T(parcel, S2);
    }
}
