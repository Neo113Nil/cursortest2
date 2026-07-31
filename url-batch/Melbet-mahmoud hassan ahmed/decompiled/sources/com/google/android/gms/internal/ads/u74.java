package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class u74 implements Comparator<u64>, Parcelable {
    public static final Parcelable.Creator<u74> CREATOR = new s44();

    /* renamed from: f, reason: collision with root package name */
    private final u64[] f12678f;

    /* renamed from: g, reason: collision with root package name */
    private int f12679g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12680h;

    u74(Parcel parcel) {
        this.f12680h = parcel.readString();
        u64[] u64VarArr = (u64[]) n13.c((u64[]) parcel.createTypedArray(u64.CREATOR));
        this.f12678f = u64VarArr;
        int length = u64VarArr.length;
    }

    private u74(String str, boolean z6, u64... u64VarArr) {
        this.f12680h = str;
        u64VarArr = z6 ? (u64[]) u64VarArr.clone() : u64VarArr;
        this.f12678f = u64VarArr;
        int length = u64VarArr.length;
        Arrays.sort(u64VarArr, this);
    }

    public u74(String str, u64... u64VarArr) {
        this(null, true, u64VarArr);
    }

    public u74(List<u64> list) {
        this(null, false, (u64[]) list.toArray(new u64[0]));
    }

    public final u74 a(String str) {
        return n13.p(this.f12680h, str) ? this : new u74(str, false, this.f12678f);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(u64 u64Var, u64 u64Var2) {
        u64 u64Var3 = u64Var;
        u64 u64Var4 = u64Var2;
        UUID uuid = nz3.f9405a;
        return uuid.equals(u64Var3.f12670g) ? !uuid.equals(u64Var4.f12670g) ? 1 : 0 : u64Var3.f12670g.compareTo(u64Var4.f12670g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u74.class == obj.getClass()) {
            u74 u74Var = (u74) obj;
            if (n13.p(this.f12680h, u74Var.f12680h) && Arrays.equals(this.f12678f, u74Var.f12678f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f12679g;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f12680h;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f12678f);
        this.f12679g = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f12680h);
        parcel.writeTypedArray(this.f12678f, 0);
    }
}
