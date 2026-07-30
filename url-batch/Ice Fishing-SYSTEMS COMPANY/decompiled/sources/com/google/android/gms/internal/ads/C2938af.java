package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.af, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2938af extends P2.a {
    public static final Parcelable.Creator<C2938af> CREATOR = new S8(15);

    /* renamed from: n, reason: collision with root package name */
    public final String f29239n;

    /* renamed from: u, reason: collision with root package name */
    public final int f29240u;

    public C2938af(String str, int i) {
        this.f29239n = str;
        this.f29240u = i;
    }

    public static C2938af a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C2938af(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2938af)) {
            return false;
        }
        C2938af c2938af = (C2938af) obj;
        return O2.w.l(this.f29239n, c2938af.f29239n) && O2.w.l(Integer.valueOf(this.f29240u), Integer.valueOf(c2938af.f29240u));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29239n, Integer.valueOf(this.f29240u)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 2, this.f29239n);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f29240u);
        S0.f.C(parcel, B8);
    }
}
