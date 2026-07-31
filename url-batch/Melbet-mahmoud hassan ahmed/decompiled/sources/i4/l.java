package i4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.h0;

/* loaded from: classes.dex */
public final class l extends s3.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: f, reason: collision with root package name */
    final int f17035f;

    /* renamed from: g, reason: collision with root package name */
    private final o3.b f17036g;

    /* renamed from: h, reason: collision with root package name */
    private final h0 f17037h;

    l(int i7, o3.b bVar, h0 h0Var) {
        this.f17035f = i7;
        this.f17036g = bVar;
        this.f17037h = h0Var;
    }

    public final o3.b c() {
        return this.f17036g;
    }

    public final h0 g() {
        return this.f17037h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f17035f);
        s3.c.l(parcel, 2, this.f17036g, i7, false);
        s3.c.l(parcel, 3, this.f17037h, i7, false);
        s3.c.b(parcel, a7);
    }
}
