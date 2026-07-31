package com.google.android.gms.auth.api.signin;

import I.j;
import U0.t;
import V0.a;
import a.AbstractC0219a;
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

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new j(1);

    /* renamed from: f, reason: collision with root package name */
    public final int f3841f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3842g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3843h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3844i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3845j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f3846k;

    /* renamed from: l, reason: collision with root package name */
    public String f3847l;

    /* renamed from: m, reason: collision with root package name */
    public final long f3848m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3849n;

    /* renamed from: o, reason: collision with root package name */
    public final List f3850o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3851p;

    /* renamed from: q, reason: collision with root package name */
    public final String f3852q;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f3853r = new HashSet();

    public GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, ArrayList arrayList, String str7, String str8) {
        this.f3841f = i7;
        this.f3842g = str;
        this.f3843h = str2;
        this.f3844i = str3;
        this.f3845j = str4;
        this.f3846k = uri;
        this.f3847l = str5;
        this.f3848m = j4;
        this.f3849n = str6;
        this.f3850o = arrayList;
        this.f3851p = str7;
        this.f3852q = str8;
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
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7), 1));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        t.c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f3847l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f3849n.equals(this.f3849n)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f3850o);
        hashSet.addAll(googleSignInAccount.f3853r);
        HashSet hashSet2 = new HashSet(this.f3850o);
        hashSet2.addAll(this.f3853r);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = (this.f3849n.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.f3850o);
        hashSet.addAll(this.f3853r);
        return hashSet.hashCode() + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f3841f);
        AbstractC0219a.J(parcel, 2, this.f3842g);
        AbstractC0219a.J(parcel, 3, this.f3843h);
        AbstractC0219a.J(parcel, 4, this.f3844i);
        AbstractC0219a.J(parcel, 5, this.f3845j);
        AbstractC0219a.I(parcel, 6, this.f3846k, i7);
        AbstractC0219a.J(parcel, 7, this.f3847l);
        AbstractC0219a.R(parcel, 8, 8);
        parcel.writeLong(this.f3848m);
        AbstractC0219a.J(parcel, 9, this.f3849n);
        AbstractC0219a.L(parcel, 10, this.f3850o);
        AbstractC0219a.J(parcel, 11, this.f3851p);
        AbstractC0219a.J(parcel, 12, this.f3852q);
        AbstractC0219a.Q(parcel, O6);
    }
}
