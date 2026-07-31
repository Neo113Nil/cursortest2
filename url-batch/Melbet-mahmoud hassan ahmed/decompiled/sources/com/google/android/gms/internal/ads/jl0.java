package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jl0 extends s3.a {
    public static final Parcelable.Creator<jl0> CREATOR = new kl0();

    /* renamed from: f, reason: collision with root package name */
    public final String f7160f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7161g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7162h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7163i;

    /* renamed from: j, reason: collision with root package name */
    public final List<String> f7164j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7165k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7166l;

    /* renamed from: m, reason: collision with root package name */
    public final List<String> f7167m;

    public jl0(String str, String str2, boolean z6, boolean z7, List<String> list, boolean z8, boolean z9, List<String> list2) {
        this.f7160f = str;
        this.f7161g = str2;
        this.f7162h = z6;
        this.f7163i = z7;
        this.f7164j = list;
        this.f7165k = z8;
        this.f7166l = z9;
        this.f7167m = list2 == null ? new ArrayList<>() : list2;
    }

    public static jl0 c(JSONObject jSONObject) {
        return new jl0(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), a3.a1.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), a3.a1.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 2, this.f7160f, false);
        s3.c.m(parcel, 3, this.f7161g, false);
        s3.c.c(parcel, 4, this.f7162h);
        s3.c.c(parcel, 5, this.f7163i);
        s3.c.o(parcel, 6, this.f7164j, false);
        s3.c.c(parcel, 7, this.f7165k);
        s3.c.c(parcel, 8, this.f7166l);
        s3.c.o(parcel, 9, this.f7167m, false);
        s3.c.b(parcel, a7);
    }
}
