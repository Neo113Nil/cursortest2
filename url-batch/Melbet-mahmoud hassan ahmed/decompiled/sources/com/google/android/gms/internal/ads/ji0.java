package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class ji0 extends s3.a {
    public static final Parcelable.Creator<ji0> CREATOR = new ki0();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7126f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f7127g;

    public ji0(boolean z6, List<String> list) {
        this.f7126f = z6;
        this.f7127g = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.c(parcel, 2, this.f7126f);
        s3.c.o(parcel, 3, this.f7127g, false);
        s3.c.b(parcel, a7);
    }
}
