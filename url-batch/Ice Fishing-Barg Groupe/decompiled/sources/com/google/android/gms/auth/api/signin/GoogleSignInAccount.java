package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.BUo4iHFctTZi;
import defpackage.POWyO8hTM6YC;
import defpackage.ki0;
import defpackage.u9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends POWyO8hTM6YC implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new BUo4iHFctTZi(8);
    public final List BRwzKIf41E4i;
    public final HashSet EcgxDIVH5in8 = new HashSet();
    public final String OPXfSBeufaJ8;
    public final long QrzZRwfaDlRX;
    public final String RfyTYNmI9Srp;
    public final String XL4ISE6Oc65B;
    public final Uri cpQdD2nAriOS;
    public final String dgRBjINgWbAK;
    public final String gPXPFXrUH4XX;
    public String r3s1LDPKFs1S;
    public final int rtx2ld2ELZv4;
    public final String wdg6QnbFHrFF;
    public final String x50lh2ztY7Y5;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = str;
        this.wdg6QnbFHrFF = str2;
        this.dgRBjINgWbAK = str3;
        this.x50lh2ztY7Y5 = str4;
        this.cpQdD2nAriOS = uri;
        this.r3s1LDPKFs1S = str5;
        this.QrzZRwfaDlRX = j;
        this.gPXPFXrUH4XX = str6;
        this.BRwzKIf41E4i = arrayList;
        this.XL4ISE6Oc65B = str7;
        this.RfyTYNmI9Srp = str8;
    }

    public static GoogleSignInAccount PxuCJdSBwIXG(String str) {
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
            hashSet.add(new Scope(jSONArray.getString(i), 1));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            u9.XL4ISE6Oc65B("Given String is empty or null");
            return null;
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.r3s1LDPKFs1S = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.gPXPFXrUH4XX.equals(this.gPXPFXrUH4XX)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.BRwzKIf41E4i);
        hashSet.addAll(googleSignInAccount.EcgxDIVH5in8);
        HashSet hashSet2 = new HashSet(this.BRwzKIf41E4i);
        hashSet2.addAll(this.EcgxDIVH5in8);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.gPXPFXrUH4XX.hashCode() + 527;
        HashSet hashSet = new HashSet(this.BRwzKIf41E4i);
        hashSet.addAll(this.EcgxDIVH5in8);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.KUoIVIumpKat(parcel, 2, this.OPXfSBeufaJ8);
        ki0.KUoIVIumpKat(parcel, 3, this.wdg6QnbFHrFF);
        ki0.KUoIVIumpKat(parcel, 4, this.dgRBjINgWbAK);
        ki0.KUoIVIumpKat(parcel, 5, this.x50lh2ztY7Y5);
        ki0.yQRudnv4La6p(parcel, 6, this.cpQdD2nAriOS, i);
        ki0.KUoIVIumpKat(parcel, 7, this.r3s1LDPKFs1S);
        ki0.JTxCbbCwomzt(parcel, 8, 8);
        parcel.writeLong(this.QrzZRwfaDlRX);
        ki0.KUoIVIumpKat(parcel, 9, this.gPXPFXrUH4XX);
        ki0.jJwa0q7P5wHq(parcel, 10, this.BRwzKIf41E4i);
        ki0.KUoIVIumpKat(parcel, 11, this.XL4ISE6Oc65B);
        ki0.KUoIVIumpKat(parcel, 12, this.RfyTYNmI9Srp);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
