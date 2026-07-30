package p000createpolar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageServiceVisionUltraNova5701 {
    public static final int PolarVoyageZipVortexCelestial6185;

    static {
        AtomicBoolean atomicBoolean = PolarVoyageVideoCaptureCelestialLegend8331.PolarVoyageZipVortexCelestial6185;
        PolarVoyageZipVortexCelestial6185 = 12451000;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int PolarVoyageMotionLayoutTransitionHeroVision4068(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        Bundle bundle;
        AtomicBoolean atomicBoolean = PolarVoyageVideoCaptureCelestialLegend8331.PolarVoyageZipVortexCelestial6185;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !PolarVoyageVideoCaptureCelestialLegend8331.PolarVoyageMotionLayoutTransitionHeroVision4068.get()) {
            synchronized (PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDrawableDeltaHyperion5742) {
                try {
                    if (!PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageSnackbarGammaEclipse2140) {
                        PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageSnackbarGammaEclipse2140 = true;
                        try {
                            bundle = PolarVoyageAnimationSetPhantomOlympianShadow8476.PolarVoyageZipVortexCelestial6185(context).PolarVoyageItemDecorationUltraDeltaEpic7485.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageContentProviderHyperSpark3838 = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i2 = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageContentProviderHyperSpark3838;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (i2 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + PolarVoyageZipVortexCelestial6185 + " but found " + i2 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        int i3 = 0;
        if (!PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDisplayMetricsVortexDragon9516(context)) {
            if (PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageAnimatorSetSparkUltraMax8233 == null) {
                PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageAnimatorSetSparkUltraMax8233 = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageAnimatorSetSparkUltraMax8233.booleanValue()) {
                z = true;
                if (i >= 0) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                    return 0;
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i4 = 9;
                if (z) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    synchronized (PolarVoyageDelayNovaRogueBeta9839.class) {
                        if (PolarVoyageDelayNovaRogueBeta9839.PolarVoyageStrictModeLegendEpic1532 == null) {
                            PolarVoyageZipHyperionSpectra3384 polarVoyageZipHyperionSpectra3384 = PolarVoyageLayerDrawableFusionAuroraMega3404.PolarVoyageZipVortexCelestial6185;
                            synchronized (PolarVoyageLayerDrawableFusionAuroraMega3404.class) {
                                if (PolarVoyageLayerDrawableFusionAuroraMega3404.PolarVoyageKotlinBetaPulseBeta3653 == null) {
                                    PolarVoyageLayerDrawableFusionAuroraMega3404.PolarVoyageKotlinBetaPulseBeta3653 = context.getApplicationContext();
                                } else {
                                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
                            PolarVoyageDelayNovaRogueBeta9839 polarVoyageDelayNovaRogueBeta9839 = new PolarVoyageDelayNovaRogueBeta9839(i3);
                            context.getApplicationContext();
                            PolarVoyageDelayNovaRogueBeta9839.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDelayNovaRogueBeta9839;
                        }
                    }
                    if (PolarVoyageDelayNovaRogueBeta9839.PolarVoyageBitmapMaxTitanTitan7960(packageInfo2)) {
                        if (z) {
                            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(packageInfo);
                            if (!PolarVoyageDelayNovaRogueBeta9839.PolarVoyageBitmapMaxTitanTitan7960(packageInfo)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i5 = packageInfo2.versionCode;
                            if ((i5 == -1 ? -1 : i5 / 1000) < (i != -1 ? i / 1000 : -1)) {
                                Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + i5);
                                i4 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                        i4 = 1;
                                        if (i4 != 18) {
                                        }
                                        if (z2) {
                                        }
                                    }
                                }
                                i4 = !applicationInfo.enabled ? 3 : 0;
                            }
                        } else {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                }
                if (i4 != 18) {
                    if (i4 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused4) {
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return i4;
                }
                return 18;
            }
        }
        z = false;
        if (i >= 0) {
        }
    }

    public Intent PolarVoyageZipVortexCelestial6185(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDisplayMetricsVortexDragon9516(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(PolarVoyageZipVortexCelestial6185);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                PolarVoyageViewPagerMegaAurora4578 PolarVoyageZipVortexCelestial61852 = PolarVoyageAnimationSetPhantomOlympianShadow8476.PolarVoyageZipVortexCelestial6185(context);
                sb.append(PolarVoyageZipVortexCelestial61852.PolarVoyageItemDecorationUltraDeltaEpic7485.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }
}
