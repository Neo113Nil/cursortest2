package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import p000createpolar.PolarVoyageContextPrimeStrikeSpeed7730;
import p000createpolar.PolarVoyageDigitalInkRecognitionCelestialPixel7898;
import p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961;
import p000createpolar.PolarVoyageResourcesCelestialInferno9280;
import p000createpolar.PolarVoyageTransformNeoTitanium1654;
import p000createpolar.PolarVoyageVibratorInfernoPhoenixFusion4401;
import p000createpolar.PolarVoyageVideoCaptureOlympianNovaX3124;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class ConnectionResult extends PolarVoyageContextPrimeStrikeSpeed7730 {
    public static final int SUCCESS = 0;
    public final String PolarVoyageBottomSheetOmegaNeo1907;
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PendingIntent PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;
    public static final ConnectionResult PolarVoyageViewRogueMaster4778 = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(19);

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = i2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = pendingIntent;
        this.PolarVoyageBottomSheetOmegaNeo1907 = str;
    }

    public static String PolarVoyageZipVortexCelestial6185(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "UNKNOWN";
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("UNKNOWN_ERROR_CODE(", i, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.PolarVoyageStrictModeLegendEpic1532 == connectionResult.PolarVoyageStrictModeLegendEpic1532 && PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, connectionResult.PolarVoyageRotateAnimationCyberCelestialDelta4768) && PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageBottomSheetOmegaNeo1907, connectionResult.PolarVoyageBottomSheetOmegaNeo1907);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.PolarVoyageStrictModeLegendEpic1532), this.PolarVoyageRotateAnimationCyberCelestialDelta4768, this.PolarVoyageBottomSheetOmegaNeo1907});
    }

    public final String toString() {
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = new PolarVoyageResourcesCelestialInferno9280(this);
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(PolarVoyageZipVortexCelestial6185(this.PolarVoyageStrictModeLegendEpic1532), "statusCode");
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, "resolution");
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageBottomSheetOmegaNeo1907, "message");
        return polarVoyageResourcesCelestialInferno9280.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 20293);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 1, 4);
        parcel.writeInt(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 2, 4);
        parcel.writeInt(this.PolarVoyageStrictModeLegendEpic1532);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageCameraPixelBlaze2629(parcel, 3, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 4, this.PolarVoyageBottomSheetOmegaNeo1907);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    public ConnectionResult(int i) {
        this(1, i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
