package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class yj0 extends s3.a {
    public static final Parcelable.Creator<yj0> CREATOR = new zj0();

    /* renamed from: f, reason: collision with root package name */
    public final String f14705f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14706g;

    public yj0(String str, int i7) {
        this.f14705f = str;
        this.f14706g = i7;
    }

    public static yj0 c(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new yj0(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof yj0)) {
            yj0 yj0Var = (yj0) obj;
            if (r3.n.a(this.f14705f, yj0Var.f14705f) && r3.n.a(Integer.valueOf(this.f14706g), Integer.valueOf(yj0Var.f14706g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r3.n.b(this.f14705f, Integer.valueOf(this.f14706g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 2, this.f14705f, false);
        s3.c.h(parcel, 3, this.f14706g);
        s3.c.b(parcel, a7);
    }
}
