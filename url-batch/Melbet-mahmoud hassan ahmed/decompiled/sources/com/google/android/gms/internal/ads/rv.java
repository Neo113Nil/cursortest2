package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rv extends s3.a {
    public static final Parcelable.Creator<rv> CREATOR = new sv();

    /* renamed from: f, reason: collision with root package name */
    public final int f11426f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11427g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11428h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11429i;

    public rv(int i7, int i8, String str, long j7) {
        this.f11426f = i7;
        this.f11427g = i8;
        this.f11428h = str;
        this.f11429i = j7;
    }

    public static rv c(JSONObject jSONObject) {
        return new rv(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f11426f);
        s3.c.h(parcel, 2, this.f11427g);
        s3.c.m(parcel, 3, this.f11428h, false);
        s3.c.k(parcel, 4, this.f11429i);
        s3.c.b(parcel, a7);
    }
}
