package com.google.android.gms.auth.api.signin;

import B1.c;
import a.AbstractC0169a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.HashSet;
import o1.u;
import org.json.JSONArray;
import org.json.JSONObject;
import p1.AbstractC1380a;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC1380a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f4956a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4957b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4958c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4959d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4960e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f4961f;

    /* renamed from: g, reason: collision with root package name */
    public String f4962g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4963h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4964i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4965j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4966k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4967l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f4968m = new HashSet();

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, ArrayList arrayList, String str7, String str8) {
        this.f4956a = i2;
        this.f4957b = str;
        this.f4958c = str2;
        this.f4959d = str3;
        this.f4960e = str4;
        this.f4961f = uri;
        this.f4962g = str5;
        this.f4963h = j2;
        this.f4964i = str6;
        this.f4965j = arrayList;
        this.f4966k = str7;
        this.f4967l = str8;
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
        String optString2 = jSONObject.optString(OutcomeConstants.OUTCOME_ID);
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        u.c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f4962g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (googleSignInAccount.f4964i.equals(this.f4964i)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f4965j);
            hashSet.addAll(googleSignInAccount.f4968m);
            HashSet hashSet2 = new HashSet(this.f4965j);
            hashSet2.addAll(this.f4968m);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4964i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f4965j);
        hashSet.addAll(this.f4968m);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f4956a);
        AbstractC0169a.O(parcel, 2, this.f4957b);
        AbstractC0169a.O(parcel, 3, this.f4958c);
        AbstractC0169a.O(parcel, 4, this.f4959d);
        AbstractC0169a.O(parcel, 5, this.f4960e);
        AbstractC0169a.N(parcel, 6, this.f4961f, i2);
        AbstractC0169a.O(parcel, 7, this.f4962g);
        AbstractC0169a.T(parcel, 8, 8);
        parcel.writeLong(this.f4963h);
        AbstractC0169a.O(parcel, 9, this.f4964i);
        AbstractC0169a.Q(parcel, 10, this.f4965j);
        AbstractC0169a.O(parcel, 11, this.f4966k);
        AbstractC0169a.O(parcel, 12, this.f4967l);
        AbstractC0169a.S(parcel, R5);
    }
}
