package i4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.f0;

/* loaded from: classes.dex */
public final class j extends s3.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: f, reason: collision with root package name */
    final int f17033f;

    /* renamed from: g, reason: collision with root package name */
    final f0 f17034g;

    j(int i7, f0 f0Var) {
        this.f17033f = i7;
        this.f17034g = f0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f17033f);
        s3.c.l(parcel, 2, this.f17034g, i7, false);
        s3.c.b(parcel, a7);
    }
}
