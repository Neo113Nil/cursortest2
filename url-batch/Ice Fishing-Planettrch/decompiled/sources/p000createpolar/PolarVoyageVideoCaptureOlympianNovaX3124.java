package p000createpolar;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageVideoCaptureOlympianNovaX3124 implements Parcelable.Creator {
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageVideoCaptureOlympianNovaX3124(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
    }

    public static void PolarVoyageZipVortexCelestial6185(PolarVoyageProGuardTurboEpicStorm1952 polarVoyageProGuardTurboEpicStorm1952, Parcel parcel, int i) {
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 20293);
        int i2 = polarVoyageProGuardTurboEpicStorm1952.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = polarVoyageProGuardTurboEpicStorm1952.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = polarVoyageProGuardTurboEpicStorm1952.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 3, 4);
        parcel.writeInt(i4);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 4, polarVoyageProGuardTurboEpicStorm1952.PolarVoyageBottomSheetOmegaNeo1907);
        IBinder iBinder = polarVoyageProGuardTurboEpicStorm1952.PolarVoyageViewRogueMaster4778;
        if (iBinder != null) {
            int PolarVoyageRemoteModelManagerOlympianCelestial91412 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91412);
        }
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageSnackbarGammaEclipse2140(parcel, 6, polarVoyageProGuardTurboEpicStorm1952.PolarVoyageCameraPixelBlaze2629, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageViewRogueMaster4778(parcel, 7, polarVoyageProGuardTurboEpicStorm1952.PolarVoyageDrawableDeltaHyperion5742);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageCameraPixelBlaze2629(parcel, 8, polarVoyageProGuardTurboEpicStorm1952.PolarVoyageSnackbarGammaEclipse2140, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageSnackbarGammaEclipse2140(parcel, 10, polarVoyageProGuardTurboEpicStorm1952.PolarVoyageContentProviderHyperSpark3838, i);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageSnackbarGammaEclipse2140(parcel, 11, polarVoyageProGuardTurboEpicStorm1952.PolarVoyageRemoteModelManagerOlympianCelestial9141, i);
        boolean z = polarVoyageProGuardTurboEpicStorm1952.PolarVoyageNavigationViewHyperHyperHyperion1793;
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = polarVoyageProGuardTurboEpicStorm1952.PolarVoyageAnimatorSetSparkUltraMax8233;
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = polarVoyageProGuardTurboEpicStorm1952.PolarVoyageBitmapMaxTitanTitan7960;
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 15, polarVoyageProGuardTurboEpicStorm1952.PolarVoyageDisplayMetricsVortexDragon9516);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        PendingIntent pendingIntent = null;
        Intent intent = null;
        String str3 = null;
        Account account = null;
        ConnectionResult connectionResult = null;
        Intent intent2 = null;
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                parcel.getClass();
                return new PolarVoyageServiceInfoVortexEpicTurbo8786(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                return new PolarVoyageGraphElitePhantom2858(parcel);
            case 2:
                return new PolarVoyageImageCaptureMasterCelestial7130(parcel);
            case 3:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new PolarVoyageObserverLegendVisionTitan8703((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 4:
                return new ParcelImpl(parcel);
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                return new PolarVoyageProfilerPrimeCyber8385(parcel.readFloat());
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return new PolarVoyageRewardedAdFusionAuroraLegend2061(parcel.readInt());
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                return new PolarVoyageFirebaseModelInterpreterTitaniumShadowEclipse6145(parcel.readLong());
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                        int readInt = parcel.readInt();
                        char c = (char) readInt;
                        if (c == 1) {
                            i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt);
                        } else if (c != 2) {
                            PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt);
                        } else {
                            Parcelable.Creator<PolarVoyageVectorDrawableTurboDragon7124> creator = PolarVoyageVectorDrawableTurboDragon7124.CREATOR;
                            int PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDrawableDeltaHyperion5742(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (PolarVoyageDrawableDeltaHyperion5742 == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + PolarVoyageDrawableDeltaHyperion5742);
                        }
                    }
                    PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
                    return new PolarVoyageMotionLayoutEpicHyper1268(i, arrayList);
                    break;
                }
            case 9:
                int PolarVoyageRemoteModelManagerOlympianCelestial91412 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                int i2 = 0;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial91412) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt2);
                    } else if (c2 == 2) {
                        i2 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt2);
                    } else if (c2 != 3) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt2);
                    } else {
                        intent2 = (Intent) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt2, Intent.CREATOR);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91412);
                return new PolarVoyageStorageTurboLegendUltra4852(i, i2, intent2);
            case 10:
                int PolarVoyageRemoteModelManagerOlympianCelestial91413 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                long j = 0;
                int i3 = 0;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Uri uri = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial91413) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i3 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt3);
                            break;
                        case 2:
                            str4 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt3);
                            break;
                        case 3:
                            str5 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt3);
                            break;
                        case 4:
                            str6 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt3);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                            str7 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt3);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt3, Uri.CREATOR);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                            str8 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt3);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                            PolarVoyageFragmentManagerEpicMax6434.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, readInt3, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            str9 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt3);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int PolarVoyageDrawableDeltaHyperion57422 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDrawableDeltaHyperion5742(parcel, readInt3);
                            int dataPosition2 = parcel.dataPosition();
                            if (PolarVoyageDrawableDeltaHyperion57422 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(dataPosition2 + PolarVoyageDrawableDeltaHyperion57422);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str10 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt3);
                            break;
                        case '\f':
                            str11 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt3);
                            break;
                        default:
                            PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt3);
                            break;
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91413);
                return new GoogleSignInAccount(i3, str4, str5, str6, str7, uri, str8, j, str9, arrayList2, str10, str11);
            case 11:
                int PolarVoyageRemoteModelManagerOlympianCelestial91414 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                ArrayList<String> arrayList3 = null;
                String str12 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial91414) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        int PolarVoyageDrawableDeltaHyperion57423 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDrawableDeltaHyperion5742(parcel, readInt4);
                        int dataPosition3 = parcel.dataPosition();
                        if (PolarVoyageDrawableDeltaHyperion57423 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + PolarVoyageDrawableDeltaHyperion57423);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c3 != 2) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt4);
                    } else {
                        str12 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt4);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91414);
                return new PolarVoyageVectorDrawableCompatNeoElite5805(str12, arrayList3);
            case 12:
                int PolarVoyageRemoteModelManagerOlympianCelestial91415 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                PolarVoyageServiceInfoEpicHeroStrike1910 polarVoyageServiceInfoEpicHeroStrike1910 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial91415) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 1) {
                        i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt5);
                    } else if (c4 == 2) {
                        connectionResult = (ConnectionResult) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt5, ConnectionResult.CREATOR);
                    } else if (c4 != 3) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt5);
                    } else {
                        polarVoyageServiceInfoEpicHeroStrike1910 = (PolarVoyageServiceInfoEpicHeroStrike1910) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt5, PolarVoyageServiceInfoEpicHeroStrike1910.CREATOR);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91415);
                return new PolarVoyageServiceOmegaAurora1402(i, connectionResult, polarVoyageServiceInfoEpicHeroStrike1910);
            case 13:
                int PolarVoyageRemoteModelManagerOlympianCelestial91416 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                long j2 = 0;
                long j3 = 0;
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial91416) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i5 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt6);
                            break;
                        case 2:
                            i6 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt6);
                            break;
                        case 3:
                            i7 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt6);
                            break;
                        case 4:
                            PolarVoyageFragmentManagerEpicMax6434.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, readInt6, 8);
                            j2 = parcel.readLong();
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                            PolarVoyageFragmentManagerEpicMax6434.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, readInt6, 8);
                            j3 = parcel.readLong();
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                            str13 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt6);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                            str14 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt6);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                            i8 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt6);
                            break;
                        case '\t':
                            i4 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt6);
                            break;
                        default:
                            PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt6);
                            break;
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91416);
                return new PolarVoyageVectorDrawableTurboDragon7124(i5, i6, i7, j2, j3, str13, str14, i8, i4);
            case 14:
                int PolarVoyageRemoteModelManagerOlympianCelestial91417 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                int i9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial91417) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt7);
                    } else if (c5 == 2) {
                        account = (Account) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt7, Account.CREATOR);
                    } else if (c5 == 3) {
                        i9 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt7);
                    } else if (c5 != 4) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt7);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt7, GoogleSignInAccount.CREATOR);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91417);
                return new PolarVoyageGradientDrawableFusionCelestial9185(i, account, i9, googleSignInAccount);
            case 15:
                int PolarVoyageRemoteModelManagerOlympianCelestial91418 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                int i10 = 0;
                boolean z = false;
                boolean z2 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial91418) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        i10 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt8);
                    } else if (c6 == 2) {
                        int PolarVoyageDrawableDeltaHyperion57424 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDrawableDeltaHyperion5742(parcel, readInt8);
                        int dataPosition4 = parcel.dataPosition();
                        if (PolarVoyageDrawableDeltaHyperion57424 == 0) {
                            iBinder = null;
                        } else {
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + PolarVoyageDrawableDeltaHyperion57424);
                            iBinder = readStrongBinder;
                        }
                    } else if (c6 == 3) {
                        connectionResult2 = (ConnectionResult) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt8, ConnectionResult.CREATOR);
                    } else if (c6 == 4) {
                        z = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageViewRogueMaster4778(parcel, readInt8);
                    } else if (c6 != 5) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt8);
                    } else {
                        z2 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageViewRogueMaster4778(parcel, readInt8);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91418);
                return new PolarVoyageServiceInfoEpicHeroStrike1910(i10, iBinder, connectionResult2, z, z2);
            case 16:
                int PolarVoyageRemoteModelManagerOlympianCelestial91419 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial91419) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt9);
                    } else if (c7 != 2) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt9);
                    } else {
                        str3 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt9);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial91419);
                return new Scope(str3, i);
            case 17:
                int PolarVoyageRemoteModelManagerOlympianCelestial914110 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial914110) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt10);
                    } else {
                        intent = (Intent) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt10, Intent.CREATOR);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial914110);
                return new PolarVoyageIntentCyberElite6469(intent);
            case 18:
                int PolarVoyageRemoteModelManagerOlympianCelestial914111 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                int i11 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial914111) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        i11 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt11);
                    } else if (c8 == 2) {
                        z3 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageViewRogueMaster4778(parcel, readInt11);
                    } else if (c8 == 3) {
                        z4 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageViewRogueMaster4778(parcel, readInt11);
                    } else if (c8 == 4) {
                        i12 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt11);
                    } else if (c8 != 5) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt11);
                    } else {
                        i13 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt11);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial914111);
                return new PolarVoyageOnTouchListenerLegendPhoenixSpeed7650(i11, z3, z4, i12, i13);
            case 19:
                int PolarVoyageRemoteModelManagerOlympianCelestial914112 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                int i14 = 0;
                String str15 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial914112) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt12);
                    } else if (c9 == 2) {
                        i14 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt12);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt12, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt12);
                    } else {
                        str15 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt12);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial914112);
                return new ConnectionResult(i, i14, pendingIntent, str15);
            case 20:
                int PolarVoyageRemoteModelManagerOlympianCelestial914113 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                PendingIntent pendingIntent2 = null;
                ConnectionResult connectionResult3 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial914113) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt13);
                    } else if (c10 == 2) {
                        str2 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt13);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt13, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt13);
                    } else {
                        connectionResult3 = (ConnectionResult) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt13, ConnectionResult.CREATOR);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial914113);
                return new Status(i, str2, pendingIntent2, connectionResult3);
            case 21:
                return new PolarVoyageLevelListDrawableRogueEclipse2191(parcel.readStrongBinder());
            case 22:
                int PolarVoyageRemoteModelManagerOlympianCelestial914114 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                long j4 = -1;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial914114) {
                    int readInt14 = parcel.readInt();
                    char c11 = (char) readInt14;
                    if (c11 == 1) {
                        str = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt14);
                    } else if (c11 == 2) {
                        i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt14);
                    } else if (c11 != 3) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt14);
                    } else {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, readInt14, 8);
                        j4 = parcel.readLong();
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial914114);
                return new PolarVoyageLevelListDrawablePhoenixEclipse4200(i, j4, str);
            case 23:
                int PolarVoyageRemoteModelManagerOlympianCelestial914115 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                PolarVoyageLevelListDrawablePhoenixEclipse4200[] polarVoyageLevelListDrawablePhoenixEclipse4200Arr = null;
                PolarVoyageColorStateListMaxSolarTitanium6277 polarVoyageColorStateListMaxSolarTitanium6277 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial914115) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        bundle = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageMotionLayoutTransitionHeroVision4068(parcel, readInt15);
                    } else if (c12 == 2) {
                        polarVoyageLevelListDrawablePhoenixEclipse4200Arr = (PolarVoyageLevelListDrawablePhoenixEclipse4200[]) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBitmapVisionAuroraPixel4705(parcel, readInt15, PolarVoyageLevelListDrawablePhoenixEclipse4200.CREATOR);
                    } else if (c12 == 3) {
                        i = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt15);
                    } else if (c12 != 4) {
                        PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt15);
                    } else {
                        polarVoyageColorStateListMaxSolarTitanium6277 = (PolarVoyageColorStateListMaxSolarTitanium6277) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt15, PolarVoyageColorStateListMaxSolarTitanium6277.CREATOR);
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial914115);
                PolarVoyagePushNotificationNovaBlazeElite5553 polarVoyagePushNotificationNovaBlazeElite5553 = new PolarVoyagePushNotificationNovaBlazeElite5553();
                polarVoyagePushNotificationNovaBlazeElite5553.PolarVoyageItemDecorationUltraDeltaEpic7485 = bundle;
                polarVoyagePushNotificationNovaBlazeElite5553.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLevelListDrawablePhoenixEclipse4200Arr;
                polarVoyagePushNotificationNovaBlazeElite5553.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
                polarVoyagePushNotificationNovaBlazeElite5553.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageColorStateListMaxSolarTitanium6277;
                return polarVoyagePushNotificationNovaBlazeElite5553;
            case 24:
                int PolarVoyageRemoteModelManagerOlympianCelestial914116 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                boolean z5 = false;
                boolean z6 = false;
                int i15 = 0;
                PolarVoyageOnTouchListenerLegendPhoenixSpeed7650 polarVoyageOnTouchListenerLegendPhoenixSpeed7650 = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial914116) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            polarVoyageOnTouchListenerLegendPhoenixSpeed7650 = (PolarVoyageOnTouchListenerLegendPhoenixSpeed7650) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt16, PolarVoyageOnTouchListenerLegendPhoenixSpeed7650.CREATOR);
                            break;
                        case 2:
                            z5 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageViewRogueMaster4778(parcel, readInt16);
                            break;
                        case 3:
                            z6 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageViewRogueMaster4778(parcel, readInt16);
                            break;
                        case 4:
                            int PolarVoyageDrawableDeltaHyperion57425 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDrawableDeltaHyperion5742(parcel, readInt16);
                            int dataPosition5 = parcel.dataPosition();
                            if (PolarVoyageDrawableDeltaHyperion57425 != 0) {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition5 + PolarVoyageDrawableDeltaHyperion57425);
                                iArr = createIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                            i15 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt16);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                            int PolarVoyageDrawableDeltaHyperion57426 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDrawableDeltaHyperion5742(parcel, readInt16);
                            int dataPosition6 = parcel.dataPosition();
                            if (PolarVoyageDrawableDeltaHyperion57426 != 0) {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + PolarVoyageDrawableDeltaHyperion57426);
                                iArr2 = createIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt16);
                            break;
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial914116);
                return new PolarVoyageColorStateListMaxSolarTitanium6277(polarVoyageOnTouchListenerLegendPhoenixSpeed7650, z5, z6, iArr, i15, iArr2);
            default:
                int PolarVoyageRemoteModelManagerOlympianCelestial914117 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = PolarVoyageProGuardTurboEpicStorm1952.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                PolarVoyageLevelListDrawablePhoenixEclipse4200[] polarVoyageLevelListDrawablePhoenixEclipse4200Arr2 = PolarVoyageProGuardTurboEpicStorm1952.PolarVoyageMotionLayoutForceEpicAurora7183;
                PolarVoyageLevelListDrawablePhoenixEclipse4200[] polarVoyageLevelListDrawablePhoenixEclipse4200Arr3 = polarVoyageLevelListDrawablePhoenixEclipse4200Arr2;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                boolean z7 = false;
                int i19 = 0;
                boolean z8 = false;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                while (parcel.dataPosition() < PolarVoyageRemoteModelManagerOlympianCelestial914117) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i16 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt17);
                            break;
                        case 2:
                            i17 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt17);
                            break;
                        case 3:
                            i18 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt17);
                            break;
                        case 4:
                            str16 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt17);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                            int PolarVoyageDrawableDeltaHyperion57427 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDrawableDeltaHyperion5742(parcel, readInt17);
                            int dataPosition7 = parcel.dataPosition();
                            if (PolarVoyageDrawableDeltaHyperion57427 != 0) {
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition7 + PolarVoyageDrawableDeltaHyperion57427);
                                iBinder2 = readStrongBinder2;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBitmapVisionAuroraPixel4705(parcel, readInt17, Scope.CREATOR);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle2 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageMotionLayoutTransitionHeroVision4068(parcel, readInt17);
                            break;
                        case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                            account2 = (Account) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageKotlinBetaPulseBeta3653(parcel, readInt17, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            PolarVoyageFragmentManagerEpicMax6434.PolarVoyageSnackbarGammaEclipse2140(parcel, readInt17);
                            break;
                        case '\n':
                            polarVoyageLevelListDrawablePhoenixEclipse4200Arr2 = (PolarVoyageLevelListDrawablePhoenixEclipse4200[]) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBitmapVisionAuroraPixel4705(parcel, readInt17, PolarVoyageLevelListDrawablePhoenixEclipse4200.CREATOR);
                            break;
                        case 11:
                            polarVoyageLevelListDrawablePhoenixEclipse4200Arr3 = (PolarVoyageLevelListDrawablePhoenixEclipse4200[]) PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBitmapVisionAuroraPixel4705(parcel, readInt17, PolarVoyageLevelListDrawablePhoenixEclipse4200.CREATOR);
                            break;
                        case '\f':
                            z7 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageViewRogueMaster4778(parcel, readInt17);
                            break;
                        case '\r':
                            i19 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageCameraPixelBlaze2629(parcel, readInt17);
                            break;
                        case 14:
                            z8 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageViewRogueMaster4778(parcel, readInt17);
                            break;
                        case 15:
                            str17 = PolarVoyageFragmentManagerEpicMax6434.PolarVoyageBarcodeScannerInfernoSolarSpark7767(parcel, readInt17);
                            break;
                    }
                }
                PolarVoyageFragmentManagerEpicMax6434.PolarVoyageDiffUtilTurboStrike5735(parcel, PolarVoyageRemoteModelManagerOlympianCelestial914117);
                return new PolarVoyageProGuardTurboEpicStorm1952(i16, i17, i18, str16, iBinder2, scopeArr, bundle2, account2, polarVoyageLevelListDrawablePhoenixEclipse4200Arr2, polarVoyageLevelListDrawablePhoenixEclipse4200Arr3, z7, i19, z8, str17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new PolarVoyageServiceInfoVortexEpicTurbo8786[i];
            case 1:
                return new PolarVoyageGraphElitePhantom2858[i];
            case 2:
                return new PolarVoyageImageCaptureMasterCelestial7130[i];
            case 3:
                return new PolarVoyageObserverLegendVisionTitan8703[i];
            case 4:
                return new ParcelImpl[i];
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                return new PolarVoyageProfilerPrimeCyber8385[i];
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return new PolarVoyageRewardedAdFusionAuroraLegend2061[i];
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                return new PolarVoyageFirebaseModelInterpreterTitaniumShadowEclipse6145[i];
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                return new PolarVoyageMotionLayoutEpicHyper1268[i];
            case 9:
                return new PolarVoyageStorageTurboLegendUltra4852[i];
            case 10:
                return new GoogleSignInAccount[i];
            case 11:
                return new PolarVoyageVectorDrawableCompatNeoElite5805[i];
            case 12:
                return new PolarVoyageServiceOmegaAurora1402[i];
            case 13:
                return new PolarVoyageVectorDrawableTurboDragon7124[i];
            case 14:
                return new PolarVoyageGradientDrawableFusionCelestial9185[i];
            case 15:
                return new PolarVoyageServiceInfoEpicHeroStrike1910[i];
            case 16:
                return new Scope[i];
            case 17:
                return new PolarVoyageIntentCyberElite6469[i];
            case 18:
                return new PolarVoyageOnTouchListenerLegendPhoenixSpeed7650[i];
            case 19:
                return new ConnectionResult[i];
            case 20:
                return new Status[i];
            case 21:
                return new PolarVoyageLevelListDrawableRogueEclipse2191[i];
            case 22:
                return new PolarVoyageLevelListDrawablePhoenixEclipse4200[i];
            case 23:
                return new PolarVoyagePushNotificationNovaBlazeElite5553[i];
            case 24:
                return new PolarVoyageColorStateListMaxSolarTitanium6277[i];
            default:
                return new PolarVoyageProGuardTurboEpicStorm1952[i];
        }
    }
}
