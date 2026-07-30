package com.google.android.gms.auth.api.signin;

import I1.c;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import t1.u;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC0943a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c(17);

    /* renamed from: d, reason: collision with root package name */
    public final String f4352d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4353e;

    /* renamed from: i, reason: collision with root package name */
    public final String f4354i;

    /* renamed from: l, reason: collision with root package name */
    public final String f4355l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f4356m;

    /* renamed from: n, reason: collision with root package name */
    public String f4357n;

    /* renamed from: o, reason: collision with root package name */
    public final long f4358o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4359p;

    /* renamed from: q, reason: collision with root package name */
    public final List f4360q;

    /* renamed from: r, reason: collision with root package name */
    public final String f4361r;

    /* renamed from: s, reason: collision with root package name */
    public final String f4362s;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f4363t = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f4352d = str;
        this.f4353e = str2;
        this.f4354i = str3;
        this.f4355l = str4;
        this.f4356m = uri;
        this.f4357n = str5;
        this.f4358o = j;
        this.f4359p = str6;
        this.f4360q = arrayList;
        this.f4361r = str7;
        this.f4362s = str8;
    }

    public static GoogleSignInAccount a(String str) {
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
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(1, jSONArray.getString(i2)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        u.c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f4357n = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
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
        if (!googleSignInAccount.f4359p.equals(this.f4359p)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f4360q);
        hashSet.addAll(googleSignInAccount.f4363t);
        HashSet hashSet2 = new HashSet(this.f4360q);
        hashSet2.addAll(this.f4363t);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f4359p.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f4360q);
        hashSet.addAll(this.f4363t);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.K(parcel, 2, this.f4352d);
        AbstractC1053a.K(parcel, 3, this.f4353e);
        AbstractC1053a.K(parcel, 4, this.f4354i);
        AbstractC1053a.K(parcel, 5, this.f4355l);
        AbstractC1053a.J(parcel, 6, this.f4356m, i2);
        AbstractC1053a.K(parcel, 7, this.f4357n);
        AbstractC1053a.P(parcel, 8, 8);
        parcel.writeLong(this.f4358o);
        AbstractC1053a.K(parcel, 9, this.f4359p);
        AbstractC1053a.M(parcel, 10, this.f4360q);
        AbstractC1053a.K(parcel, 11, this.f4361r);
        AbstractC1053a.K(parcel, 12, this.f4362s);
        AbstractC1053a.S(parcel, Q);
    }
}
