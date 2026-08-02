package com.google.android.gms.auth.api.signin;

import C2.b;
import H.h;
import O0.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new h(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f2661a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2662b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2663c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2664d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2665e;
    public final Uri f;

    /* renamed from: g, reason: collision with root package name */
    public String f2666g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2667h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2668i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2669j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2670k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2671l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f2672m = new HashSet();

    public GoogleSignInAccount(int i3, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2661a = i3;
        this.f2662b = str;
        this.f2663c = str2;
        this.f2664d = str3;
        this.f2665e = str4;
        this.f = uri;
        this.f2666g = str5;
        this.f2667h = j3;
        this.f2668i = str6;
        this.f2669j = arrayList;
        this.f2670k = str7;
        this.f2671l = str8;
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
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f2666g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f2668i.equals(this.f2668i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f2669j);
        hashSet.addAll(googleSignInAccount.f2672m);
        HashSet hashSet2 = new HashSet(this.f2669j);
        hashSet2.addAll(this.f2672m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f2668i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2669j);
        hashSet.addAll(this.f2672m);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = b.S(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f2661a);
        b.O(parcel, 2, this.f2662b);
        b.O(parcel, 3, this.f2663c);
        b.O(parcel, 4, this.f2664d);
        b.O(parcel, 5, this.f2665e);
        b.N(parcel, 6, this.f, i3);
        b.O(parcel, 7, this.f2666g);
        b.U(parcel, 8, 8);
        parcel.writeLong(this.f2667h);
        b.O(parcel, 9, this.f2668i);
        b.Q(parcel, 10, this.f2669j);
        b.O(parcel, 11, this.f2670k);
        b.O(parcel, 12, this.f2671l);
        b.T(parcel, S2);
    }
}
