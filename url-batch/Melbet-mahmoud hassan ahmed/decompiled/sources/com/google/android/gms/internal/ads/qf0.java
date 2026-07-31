package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qf0 extends s3.a {
    public static final Parcelable.Creator<qf0> CREATOR = new rf0();

    /* renamed from: f, reason: collision with root package name */
    public final int f10670f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10671g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10672h;

    qf0(int i7, int i8, int i9) {
        this.f10670f = i7;
        this.f10671g = i8;
        this.f10672h = i9;
    }

    public static qf0 c(c3.w wVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof qf0)) {
            qf0 qf0Var = (qf0) obj;
            if (qf0Var.f10672h == this.f10672h && qf0Var.f10671g == this.f10671g && qf0Var.f10670f == this.f10670f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f10670f, this.f10671g, this.f10672h});
    }

    public final String toString() {
        int i7 = this.f10670f;
        int i8 = this.f10671g;
        int i9 = this.f10672h;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i7);
        sb.append(".");
        sb.append(i8);
        sb.append(".");
        sb.append(i9);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f10670f);
        s3.c.h(parcel, 2, this.f10671g);
        s3.c.h(parcel, 3, this.f10672h);
        s3.c.b(parcel, a7);
    }
}
