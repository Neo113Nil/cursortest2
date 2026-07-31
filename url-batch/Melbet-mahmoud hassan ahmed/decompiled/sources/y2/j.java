package y2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends s3.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23413f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23414g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23415h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f23416i;

    /* renamed from: j, reason: collision with root package name */
    public final float f23417j;

    /* renamed from: k, reason: collision with root package name */
    public final int f23418k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23419l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23420m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f23421n;

    j(boolean z6, boolean z7, String str, boolean z8, float f7, int i7, boolean z9, boolean z10, boolean z11) {
        this.f23413f = z6;
        this.f23414g = z7;
        this.f23415h = str;
        this.f23416i = z8;
        this.f23417j = f7;
        this.f23418k = i7;
        this.f23419l = z9;
        this.f23420m = z10;
        this.f23421n = z11;
    }

    public j(boolean z6, boolean z7, boolean z8, float f7, int i7, boolean z9, boolean z10, boolean z11) {
        this(z6, z7, null, z8, f7, -1, z9, z10, z11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.c(parcel, 2, this.f23413f);
        s3.c.c(parcel, 3, this.f23414g);
        s3.c.m(parcel, 4, this.f23415h, false);
        s3.c.c(parcel, 5, this.f23416i);
        s3.c.f(parcel, 6, this.f23417j);
        s3.c.h(parcel, 7, this.f23418k);
        s3.c.c(parcel, 8, this.f23419l);
        s3.c.c(parcel, 9, this.f23420m);
        s3.c.c(parcel, 10, this.f23421n);
        s3.c.b(parcel, a7);
    }
}
