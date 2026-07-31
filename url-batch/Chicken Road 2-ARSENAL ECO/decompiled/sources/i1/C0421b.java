package i1;

import I.j;
import a.AbstractC0219a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421b extends V0.a {
    public static final Parcelable.Creator<C0421b> CREATOR = new j(16);

    /* renamed from: f, reason: collision with root package name */
    public final int f4421f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4422g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f4423h;

    public C0421b(int i7, int i8, Intent intent) {
        this.f4421f = i7;
        this.f4422g = i8;
        this.f4423h = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f4421f);
        AbstractC0219a.R(parcel, 2, 4);
        parcel.writeInt(this.f4422g);
        AbstractC0219a.I(parcel, 3, this.f4423h, i7);
        AbstractC0219a.Q(parcel, O6);
    }
}
