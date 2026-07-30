package com.google.android.gms.auth.api.signin;

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
import p000createpolar.PolarVoyageContextPrimeStrikeSpeed7730;
import p000createpolar.PolarVoyageLayoutInflaterMegaAlpha5562;
import p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961;
import p000createpolar.PolarVoyageRealtimeDatabaseCyberShadowForce7689;
import p000createpolar.PolarVoyageVideoCaptureOlympianNovaX3124;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class GoogleSignInAccount extends PolarVoyageContextPrimeStrikeSpeed7730 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(10);
    public final String PolarVoyageAnimatorSetSparkUltraMax8233;
    public final HashSet PolarVoyageBitmapMaxTitanTitan7960 = new HashSet();
    public final String PolarVoyageBottomSheetOmegaNeo1907;
    public final Uri PolarVoyageCameraPixelBlaze2629;
    public final String PolarVoyageContentProviderHyperSpark3838;
    public String PolarVoyageDrawableDeltaHyperion5742;
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final String PolarVoyageNavigationViewHyperHyperHyperion1793;
    public final List PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public final String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final long PolarVoyageSnackbarGammaEclipse2140;
    public final String PolarVoyageStrictModeLegendEpic1532;
    public final String PolarVoyageViewRogueMaster4778;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = str;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str2;
        this.PolarVoyageBottomSheetOmegaNeo1907 = str3;
        this.PolarVoyageViewRogueMaster4778 = str4;
        this.PolarVoyageCameraPixelBlaze2629 = uri;
        this.PolarVoyageDrawableDeltaHyperion5742 = str5;
        this.PolarVoyageSnackbarGammaEclipse2140 = j;
        this.PolarVoyageContentProviderHyperSpark3838 = str6;
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = arrayList;
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = str7;
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = str8;
    }

    public static GoogleSignInAccount PolarVoyageZipVortexCelestial6185(String str) {
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
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageNavigationViewHyperHyperHyperion1793(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.PolarVoyageDrawableDeltaHyperion5742 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.PolarVoyageContentProviderHyperSpark3838.equals(this.PolarVoyageContentProviderHyperSpark3838)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.PolarVoyageRemoteModelManagerOlympianCelestial9141);
        hashSet.addAll(googleSignInAccount.PolarVoyageBitmapMaxTitanTitan7960);
        HashSet hashSet2 = new HashSet(this.PolarVoyageRemoteModelManagerOlympianCelestial9141);
        hashSet2.addAll(this.PolarVoyageBitmapMaxTitanTitan7960);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageContentProviderHyperSpark3838, 527, 31);
        HashSet hashSet = new HashSet(this.PolarVoyageRemoteModelManagerOlympianCelestial9141);
        hashSet.addAll(this.PolarVoyageBitmapMaxTitanTitan7960);
        return hashSet.hashCode() + PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 20293);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 1, 4);
        parcel.writeInt(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 2, this.PolarVoyageStrictModeLegendEpic1532);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 3, this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 4, this.PolarVoyageBottomSheetOmegaNeo1907);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 5, this.PolarVoyageViewRogueMaster4778);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageCameraPixelBlaze2629(parcel, 6, this.PolarVoyageCameraPixelBlaze2629, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 7, this.PolarVoyageDrawableDeltaHyperion5742);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 8, 8);
        parcel.writeLong(this.PolarVoyageSnackbarGammaEclipse2140);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 9, this.PolarVoyageContentProviderHyperSpark3838);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageContentProviderHyperSpark3838(parcel, 10, this.PolarVoyageRemoteModelManagerOlympianCelestial9141);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 11, this.PolarVoyageNavigationViewHyperHyperHyperion1793);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 12, this.PolarVoyageAnimatorSetSparkUltraMax8233);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }
}
