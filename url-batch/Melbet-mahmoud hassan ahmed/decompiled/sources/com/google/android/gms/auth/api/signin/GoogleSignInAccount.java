package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import r3.o;
import s3.c;
import v3.d;
import v3.g;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends s3.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    @RecentlyNonNull
    public static d f2442s = g.d();

    /* renamed from: f, reason: collision with root package name */
    final int f2443f;

    /* renamed from: g, reason: collision with root package name */
    private String f2444g;

    /* renamed from: h, reason: collision with root package name */
    private String f2445h;

    /* renamed from: i, reason: collision with root package name */
    private String f2446i;

    /* renamed from: j, reason: collision with root package name */
    private String f2447j;

    /* renamed from: k, reason: collision with root package name */
    private Uri f2448k;

    /* renamed from: l, reason: collision with root package name */
    private String f2449l;

    /* renamed from: m, reason: collision with root package name */
    private long f2450m;

    /* renamed from: n, reason: collision with root package name */
    private String f2451n;

    /* renamed from: o, reason: collision with root package name */
    List<Scope> f2452o;

    /* renamed from: p, reason: collision with root package name */
    private String f2453p;

    /* renamed from: q, reason: collision with root package name */
    private String f2454q;

    /* renamed from: r, reason: collision with root package name */
    private Set<Scope> f2455r = new HashSet();

    GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j7, String str6, List<Scope> list, String str7, String str8) {
        this.f2443f = i7;
        this.f2444g = str;
        this.f2445h = str2;
        this.f2446i = str3;
        this.f2447j = str4;
        this.f2448k = uri;
        this.f2449l = str5;
        this.f2450m = j7;
        this.f2451n = str6;
        this.f2452o = list;
        this.f2453p = str7;
        this.f2454q = str8;
    }

    @RecentlyNullable
    public static GoogleSignInAccount p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        GoogleSignInAccount q7 = q(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        q7.f2449l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return q7;
    }

    @RecentlyNonNull
    public static GoogleSignInAccount q(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l7, @RecentlyNonNull String str7, @RecentlyNonNull Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l7.longValue(), o.f(str7), new ArrayList((Collection) o.i(set)), str5, str6);
    }

    @RecentlyNullable
    public Account c() {
        String str = this.f2446i;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f2451n.equals(this.f2451n) && googleSignInAccount.n().equals(n());
    }

    @RecentlyNullable
    public String g() {
        return this.f2447j;
    }

    @RecentlyNullable
    public String h() {
        return this.f2446i;
    }

    public int hashCode() {
        return ((this.f2451n.hashCode() + 527) * 31) + n().hashCode();
    }

    @RecentlyNullable
    public String i() {
        return this.f2454q;
    }

    @RecentlyNullable
    public String j() {
        return this.f2453p;
    }

    @RecentlyNullable
    public String k() {
        return this.f2444g;
    }

    @RecentlyNullable
    public String l() {
        return this.f2445h;
    }

    @RecentlyNullable
    public Uri m() {
        return this.f2448k;
    }

    public Set<Scope> n() {
        HashSet hashSet = new HashSet(this.f2452o);
        hashSet.addAll(this.f2455r);
        return hashSet;
    }

    @RecentlyNullable
    public String o() {
        return this.f2449l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = c.a(parcel);
        c.h(parcel, 1, this.f2443f);
        c.m(parcel, 2, k(), false);
        c.m(parcel, 3, l(), false);
        c.m(parcel, 4, h(), false);
        c.m(parcel, 5, g(), false);
        c.l(parcel, 6, m(), i7, false);
        c.m(parcel, 7, o(), false);
        c.k(parcel, 8, this.f2450m);
        c.m(parcel, 9, this.f2451n, false);
        c.q(parcel, 10, this.f2452o, false);
        c.m(parcel, 11, j(), false);
        c.m(parcel, 12, i(), false);
        c.b(parcel, a7);
    }
}
