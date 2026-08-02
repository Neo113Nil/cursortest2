package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.fragment.app.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196b0 implements Parcelable {
    public static final Parcelable.Creator<C0196b0> CREATOR = new H.h(7);

    /* renamed from: a, reason: collision with root package name */
    public String f4818a;

    /* renamed from: b, reason: collision with root package name */
    public int f4819b;

    public C0196b0(String str, int i4) {
        this.f4818a = str;
        this.f4819b = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4818a);
        parcel.writeInt(this.f4819b);
    }
}
