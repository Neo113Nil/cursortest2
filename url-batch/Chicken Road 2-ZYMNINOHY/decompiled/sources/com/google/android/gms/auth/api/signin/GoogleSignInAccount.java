package com.google.android.gms.auth.api.signin;

import H.h;
import O3.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e2.AbstractC0408a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC0408a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new h(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f5756a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5757b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5758c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5759d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5760e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f5761f;

    /* renamed from: g, reason: collision with root package name */
    public String f5762g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5763h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5764i;

    /* renamed from: j, reason: collision with root package name */
    public final List f5765j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5766k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5767l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f5768m = new HashSet();

    public GoogleSignInAccount(int i4, String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5756a = i4;
        this.f5757b = str;
        this.f5758c = str2;
        this.f5759d = str3;
        this.f5760e = str4;
        this.f5761f = uri;
        this.f5762g = str5;
        this.f5763h = j4;
        this.f5764i = str6;
        this.f5765j = arrayList;
        this.f5766k = str7;
        this.f5767l = str8;
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
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(1, jSONArray.getString(i4)));
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
        googleSignInAccount.f5762g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f5764i.equals(this.f5764i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f5765j);
        hashSet.addAll(googleSignInAccount.f5768m);
        HashSet hashSet2 = new HashSet(this.f5765j);
        hashSet2.addAll(this.f5768m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f5764i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f5765j);
        hashSet.addAll(this.f5768m);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        l.G(parcel, 1, 4);
        parcel.writeInt(this.f5756a);
        l.A(parcel, 2, this.f5757b);
        l.A(parcel, 3, this.f5758c);
        l.A(parcel, 4, this.f5759d);
        l.A(parcel, 5, this.f5760e);
        l.z(parcel, 6, this.f5761f, i4);
        l.A(parcel, 7, this.f5762g);
        l.G(parcel, 8, 8);
        parcel.writeLong(this.f5763h);
        l.A(parcel, 9, this.f5764i);
        l.C(parcel, 10, this.f5765j);
        l.A(parcel, 11, this.f5766k);
        l.A(parcel, 12, this.f5767l);
        l.F(parcel, D3);
    }
}
