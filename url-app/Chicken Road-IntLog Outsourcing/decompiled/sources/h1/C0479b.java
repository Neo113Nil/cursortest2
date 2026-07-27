package h1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC1380a;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479b extends AbstractC1380a {
    public static final Parcelable.Creator<C0479b> CREATOR = new B1.c(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f5773a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5774b;

    public C0479b(String str, int i2) {
        this.f5773a = str;
        this.f5774b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.O(parcel, 1, this.f5773a);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f5774b);
        AbstractC0169a.S(parcel, R5);
    }
}
