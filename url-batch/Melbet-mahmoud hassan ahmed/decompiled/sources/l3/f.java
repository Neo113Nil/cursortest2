package l3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f extends s3.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: f, reason: collision with root package name */
    private final String f18597f;

    /* renamed from: g, reason: collision with root package name */
    private final int f18598g;

    public f(String str, int i7) {
        this.f18597f = str;
        this.f18598g = i7;
    }

    public final int c() {
        return this.f18598g;
    }

    public final String g() {
        return this.f18597f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f18597f, false);
        s3.c.h(parcel, 2, this.f18598g);
        s3.c.b(parcel, a7);
    }
}
