package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z9 extends d7.a implements Comparable {
    public static final Parcelable.Creator<z9> CREATOR = new o6(9);

    /* renamed from: d, reason: collision with root package name */
    public final int f3044d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3045e;

    public z9(int i3, int i10) {
        this.f3044d = i3;
        this.f3045e = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        z9 z9Var = (z9) obj;
        int i3 = z9Var.f3044d;
        int i10 = this.f3044d;
        if (i10 < i3) {
            return -1;
        }
        if (i10 > i3) {
            return 1;
        }
        int i11 = z9Var.f3045e;
        int i12 = this.f3045e;
        if (i12 < i11) {
            return -1;
        }
        return i12 > i11 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.z9) r3).f3044d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r3 = r3.f3045e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i3;
        int i10;
        int i11;
        int i12;
        return (obj instanceof z9) && (i10 = this.f3044d) >= i3 && i10 <= i3 && (i12 = this.f3045e) >= i11 && i12 <= i11;
    }

    public final int hashCode() {
        return (this.f3044d * 31) + this.f3045e;
    }

    public final String toString() {
        int i3 = this.f3044d;
        int length = String.valueOf(i3).length();
        int i10 = this.f3045e;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i10).length() + 1);
        sb2.append("GenericDimension(");
        sb2.append(i3);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f3044d);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f3045e);
        cf.c.a0(parcel, Z);
    }
}
