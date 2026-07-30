package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
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
public final class Status extends PolarVoyageContextPrimeStrikeSpeed7730 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(20);
    public final ConnectionResult PolarVoyageBottomSheetOmegaNeo1907;
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PendingIntent PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final String PolarVoyageStrictModeLegendEpic1532;

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = str;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = pendingIntent;
        this.PolarVoyageBottomSheetOmegaNeo1907 = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 == status.PolarVoyageItemDecorationUltraDeltaEpic7485 && PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageStrictModeLegendEpic1532, status.PolarVoyageStrictModeLegendEpic1532) && PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, status.PolarVoyageRotateAnimationCyberCelestialDelta4768) && PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageBottomSheetOmegaNeo1907, status.PolarVoyageBottomSheetOmegaNeo1907);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.PolarVoyageItemDecorationUltraDeltaEpic7485), this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, this.PolarVoyageBottomSheetOmegaNeo1907});
    }

    public final String toString() {
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = new PolarVoyageResourcesCelestialInferno9280(this);
        String str = this.PolarVoyageStrictModeLegendEpic1532;
        if (str == null) {
            int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            switch (i) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    str = "SUCCESS_CACHE";
                    break;
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("unknown status code: ", i);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                    str = "INVALID_ACCOUNT";
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(str, "statusCode");
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, "resolution");
        return polarVoyageResourcesCelestialInferno9280.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 20293);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 1, 4);
        parcel.writeInt(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 2, this.PolarVoyageStrictModeLegendEpic1532);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageCameraPixelBlaze2629(parcel, 3, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageCameraPixelBlaze2629(parcel, 4, this.PolarVoyageBottomSheetOmegaNeo1907, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }
}
