package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.g2;
import defpackage.t0;
import defpackage.y90;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends t0 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new g2(10);
    public final int d;
    public final String e;
    public final String g;
    public final String h;
    public final String i;
    public final Uri j;
    public String k;
    public final long l;
    public final String m;
    public final List n;
    public final String o;
    public final String p;
    public final HashSet q = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.d = i;
        this.e = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = uri;
        this.k = str5;
        this.l = j;
        this.m = str6;
        this.n = arrayList;
        this.o = str7;
        this.p = str8;
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
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        y90.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.k = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.m.equals(this.m)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.n);
        hashSet.addAll(googleSignInAccount.q);
        HashSet hashSet2 = new HashSet(this.n);
        hashSet2.addAll(this.q);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.m.hashCode() + 527;
        HashSet hashSet = new HashSet(this.n);
        hashSet.addAll(this.q);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.M(parcel, 2, this.e);
        y90.M(parcel, 3, this.g);
        y90.M(parcel, 4, this.h);
        y90.M(parcel, 5, this.i);
        y90.L(parcel, 6, this.j, i);
        y90.M(parcel, 7, this.k);
        y90.R(parcel, 8, 8);
        parcel.writeLong(this.l);
        y90.M(parcel, 9, this.m);
        y90.O(parcel, 10, this.n);
        y90.M(parcel, 11, this.o);
        y90.M(parcel, 12, this.p);
        y90.Q(parcel, P);
    }
}
