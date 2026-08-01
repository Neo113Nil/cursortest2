package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c7.c0;
import c7.p;
import cf.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d7.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new p(27);

    /* renamed from: d, reason: collision with root package name */
    public final String f2102d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2103e;

    /* renamed from: i, reason: collision with root package name */
    public final String f2104i;

    /* renamed from: r, reason: collision with root package name */
    public final String f2105r;

    /* renamed from: s, reason: collision with root package name */
    public final Uri f2106s;

    /* renamed from: t, reason: collision with root package name */
    public String f2107t;

    /* renamed from: u, reason: collision with root package name */
    public final long f2108u;

    /* renamed from: v, reason: collision with root package name */
    public final String f2109v;

    /* renamed from: w, reason: collision with root package name */
    public final List f2110w;

    /* renamed from: x, reason: collision with root package name */
    public final String f2111x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2112y;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f2113z = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2102d = str;
        this.f2103e = str2;
        this.f2104i = str3;
        this.f2105r = str4;
        this.f2106s = uri;
        this.f2107t = str5;
        this.f2108u = j;
        this.f2109v = str6;
        this.f2110w = arrayList;
        this.f2111x = str7;
        this.f2112y = str8;
    }

    public static GoogleSignInAccount b(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(1, jSONArray.getString(i3)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        c0.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f2107t = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f2109v.equals(this.f2109v)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f2110w);
        hashSet.addAll(googleSignInAccount.f2113z);
        HashSet hashSet2 = new HashSet(this.f2110w);
        hashSet2.addAll(this.f2113z);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f2109v.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2110w);
        hashSet.addAll(this.f2113z);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = c.Z(parcel, 20293);
        c.V(parcel, 2, this.f2102d);
        c.V(parcel, 3, this.f2103e);
        c.V(parcel, 4, this.f2104i);
        c.V(parcel, 5, this.f2105r);
        c.U(parcel, 6, this.f2106s, i3);
        c.V(parcel, 7, this.f2107t);
        c.Y(parcel, 8, 8);
        parcel.writeLong(this.f2108u);
        c.V(parcel, 9, this.f2109v);
        c.X(parcel, 10, this.f2110w);
        c.V(parcel, 11, this.f2111x);
        c.V(parcel, 12, this.f2112y);
        c.a0(parcel, Z);
    }
}
