package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.i1;
import defpackage.ll3;
import defpackage.s3;
import defpackage.yk3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends i1 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new s3(28);
    public final int m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final Uri r;
    public String s;
    public final long t;
    public final String u;
    public final List v;
    public final String w;
    public final String x;
    public final HashSet y = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.m = i;
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = uri;
        this.s = str5;
        this.t = j;
        this.u = str6;
        this.v = arrayList;
        this.w = str7;
        this.x = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString(SDKConstants.PARAM_EXPIRATION_TIME));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has(AuthenticationTokenClaims.JSON_KEY_EMAIL) ? jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_EMAIL) : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        ll3.s(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.s = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.u.equals(this.u)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.v);
        hashSet.addAll(googleSignInAccount.y);
        HashSet hashSet2 = new HashSet(this.v);
        hashSet2.addAll(this.y);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.u.hashCode() + 527;
        HashSet hashSet = new HashSet(this.v);
        hashSet.addAll(this.y);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.W(parcel, 2, this.n);
        yk3.W(parcel, 3, this.o);
        yk3.W(parcel, 4, this.p);
        yk3.W(parcel, 5, this.q);
        yk3.V(parcel, 6, this.r, i);
        yk3.W(parcel, 7, this.s);
        yk3.d0(parcel, 8, 8);
        parcel.writeLong(this.t);
        yk3.W(parcel, 9, this.u);
        yk3.Y(parcel, 10, this.v);
        yk3.W(parcel, 11, this.w);
        yk3.W(parcel, 12, this.x);
        yk3.c0(parcel, b0);
    }
}
