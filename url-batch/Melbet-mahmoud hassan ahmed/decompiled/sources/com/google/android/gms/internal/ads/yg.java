package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class yg implements Comparator<xg>, Parcelable {
    public static final Parcelable.Creator<yg> CREATOR = new vg();

    /* renamed from: f, reason: collision with root package name */
    private final xg[] f14674f;

    /* renamed from: g, reason: collision with root package name */
    private int f14675g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14676h;

    yg(Parcel parcel) {
        xg[] xgVarArr = (xg[]) parcel.createTypedArray(xg.CREATOR);
        this.f14674f = xgVarArr;
        this.f14676h = xgVarArr.length;
    }

    public yg(List<xg> list) {
        this(false, (xg[]) list.toArray(new xg[list.size()]));
    }

    private yg(boolean z6, xg... xgVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        xgVarArr = z6 ? (xg[]) xgVarArr.clone() : xgVarArr;
        Arrays.sort(xgVarArr, this);
        int i7 = 1;
        while (true) {
            int length = xgVarArr.length;
            if (i7 >= length) {
                this.f14674f = xgVarArr;
                this.f14676h = length;
                return;
            }
            uuid = xgVarArr[i7 - 1].f14195g;
            uuid2 = xgVarArr[i7].f14195g;
            if (uuid.equals(uuid2)) {
                uuid3 = xgVarArr[i7].f14195g;
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(uuid3)));
            }
            i7++;
        }
    }

    public yg(xg... xgVarArr) {
        this(true, xgVarArr);
    }

    public final xg a(int i7) {
        return this.f14674f[i7];
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(xg xgVar, xg xgVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        xg xgVar3 = xgVar;
        xg xgVar4 = xgVar2;
        UUID uuid5 = he.f6195b;
        uuid = xgVar3.f14195g;
        if (uuid5.equals(uuid)) {
            uuid4 = xgVar4.f14195g;
            return !uuid5.equals(uuid4) ? 1 : 0;
        }
        uuid2 = xgVar3.f14195g;
        uuid3 = xgVar4.f14195g;
        return uuid2.compareTo(uuid3);
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
        if (obj == null || yg.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f14674f, ((yg) obj).f14674f);
    }

    public final int hashCode() {
        int i7 = this.f14675g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f14674f);
        this.f14675g = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeTypedArray(this.f14674f, 0);
    }
}
