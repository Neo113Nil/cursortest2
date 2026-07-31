package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f23 extends s3.a {
    public static final Parcelable.Creator<f23> CREATOR = new g23();

    /* renamed from: f, reason: collision with root package name */
    public final int f4953f;

    /* renamed from: g, reason: collision with root package name */
    private a9 f4954g = null;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f4955h;

    f23(int i7, byte[] bArr) {
        this.f4953f = i7;
        this.f4955h = bArr;
        g();
    }

    private final void g() {
        a9 a9Var = this.f4954g;
        if (a9Var != null || this.f4955h == null) {
            if (a9Var == null || this.f4955h != null) {
                if (a9Var != null && this.f4955h != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (a9Var != null || this.f4955h != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final a9 c() {
        if (this.f4954g == null) {
            try {
                this.f4954g = a9.v0(this.f4955h, mp3.a());
                this.f4955h = null;
            } catch (mq3 | NullPointerException e7) {
                throw new IllegalStateException(e7);
            }
        }
        g();
        return this.f4954g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f4953f);
        byte[] bArr = this.f4955h;
        if (bArr == null) {
            bArr = this.f4954g.d();
        }
        s3.c.e(parcel, 2, bArr, false);
        s3.c.b(parcel, a7);
    }
}
