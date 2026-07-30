package p000createpolar;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAnimationAuroraHeroHero7652 {
    public static final PolarVoyageIntentServicePixelMaxElite4283 PolarVoyageZipVortexCelestial6185 = new PolarVoyageIntentServicePixelMaxElite4283(2);
    public static final PolarVoyageAuthTitaniumMasterElite1113 PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageAuthTitaniumMasterElite1113(13);

    public static PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] PolarVoyageKotlinBetaPulseBeta3653(Context context, PolarVoyageInstrumentationMaxLegendBeta6222 polarVoyageInstrumentationMaxLegendBeta6222, String str) {
        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageMotionLayoutTransitionHeroVision4068("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageMotionLayoutTransitionHeroVision4068("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageKotlinBetaPulseBeta3653};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new PolarVoyageProcessCameraProviderDragonEpicCosmos5977(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : Constants.MINIMAL_ERROR_STATUS_CODE, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageDiffUtilTurboStrike5735, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (PolarVoyageProcessCameraProviderDragonEpicCosmos5977[]) arrayList.toArray(new PolarVoyageProcessCameraProviderDragonEpicCosmos5977[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }

    public static ProviderInfo PolarVoyageMotionLayoutTransitionHeroVision4068(PackageManager packageManager, PolarVoyageInstrumentationMaxLegendBeta6222 polarVoyageInstrumentationMaxLegendBeta6222, Resources resources) {
        PolarVoyageAuthTitaniumMasterElite1113 polarVoyageAuthTitaniumMasterElite1113 = PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageIntentServicePixelMaxElite4283 polarVoyageIntentServicePixelMaxElite4283 = PolarVoyageZipVortexCelestial6185;
        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageMotionLayoutTransitionHeroVision4068("FontProvider.getProvider");
        try {
            List list = polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            String str = polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageZipVortexCelestial6185;
            String str2 = polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (list == null) {
                list = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(resources, 0);
            }
            PolarVoyageTextureViewMasterShadow8801 polarVoyageTextureViewMasterShadow8801 = new PolarVoyageTextureViewMasterShadow8801();
            polarVoyageTextureViewMasterShadow8801.PolarVoyageZipVortexCelestial6185 = str;
            polarVoyageTextureViewMasterShadow8801.PolarVoyageMotionLayoutTransitionHeroVision4068 = str2;
            polarVoyageTextureViewMasterShadow8801.PolarVoyageKotlinBetaPulseBeta3653 = list;
            ProviderInfo providerInfo = (ProviderInfo) polarVoyageIntentServicePixelMaxElite4283.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTextureViewMasterShadow8801);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, polarVoyageAuthTitaniumMasterElite1113);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, polarVoyageAuthTitaniumMasterElite1113);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    polarVoyageIntentServicePixelMaxElite4283.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageTextureViewMasterShadow8801, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static PolarVoyageViewModelQuantumDragonPhoenix2767 PolarVoyageZipVortexCelestial6185(Context context, List list) {
        String str;
        Typeface PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageMotionLayoutTransitionHeroVision4068("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                PolarVoyageInstrumentationMaxLegendBeta6222 polarVoyageInstrumentationMaxLegendBeta6222 = (PolarVoyageInstrumentationMaxLegendBeta6222) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageDisplayMetricsQuantumStormEclipse7538.PolarVoyageKotlinBetaPulseBeta3653((str = polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageBitmapVisionAuroraPixel4705))) == null || PolarVoyageDisplayMetricsQuantumStormEclipse7538.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageKotlinBetaPulseBeta3653) == null) {
                    ProviderInfo PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageMotionLayoutTransitionHeroVision4068(context.getPackageManager(), polarVoyageInstrumentationMaxLegendBeta6222, context.getResources());
                    if (PolarVoyageMotionLayoutTransitionHeroVision40682 == null) {
                        return new PolarVoyageViewModelQuantumDragonPhoenix2767(1);
                    }
                    arrayList.add(PolarVoyageKotlinBetaPulseBeta3653(context, polarVoyageInstrumentationMaxLegendBeta6222, PolarVoyageMotionLayoutTransitionHeroVision40682.authority));
                } else {
                    arrayList.add(new PolarVoyageProcessCameraProviderDragonEpicCosmos5977[]{new PolarVoyageProcessCameraProviderDragonEpicCosmos5977(str, polarVoyageInstrumentationMaxLegendBeta6222.PolarVoyageDiffUtilTurboStrike5735)});
                }
            }
            return new PolarVoyageViewModelQuantumDragonPhoenix2767(1, arrayList);
        } finally {
            Trace.endSection();
        }
    }
}
