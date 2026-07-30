package p000createpolar;

import android.text.TextUtils;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGuidelineMasterRogue8570 {
    public final Object PolarVoyageKotlinBetaPulseBeta3653;
    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageGuidelineMasterRogue8570(long j, PolarVoyageViewModelQuantumDragonPhoenix2767 polarVoyageViewModelQuantumDragonPhoenix2767) {
        this.PolarVoyageZipVortexCelestial6185 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageViewModelQuantumDragonPhoenix2767;
        PolarVoyageTraceMaxDragonMax4845 polarVoyageTraceMaxDragonMax4845 = new PolarVoyageTraceMaxDragonMax4845();
        polarVoyageTraceMaxDragonMax4845.PolarVoyageBottomSheetOmegaNeo1907 = this;
        polarVoyageTraceMaxDragonMax4845.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new LinkedHashMap(0, 0.75f, true);
        polarVoyageTraceMaxDragonMax4845.PolarVoyageItemDecorationUltraDeltaEpic7485 = j;
        if (j > 0) {
            this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageTraceMaxDragonMax4845;
        } else {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("maxSize <= 0");
            throw null;
        }
    }

    public static PolarVoyageGuidelineMasterRogue8570 PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new PolarVoyageGuidelineMasterRogue8570(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new PolarVoyageGuidelineMasterRogue8570(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public static String PolarVoyageZipVortexCelestial6185(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageChipInfernoVortex9378 polarVoyageChipInfernoVortex9378, PolarVoyageViewPagerStrikeBlaze5840 polarVoyageViewPagerStrikeBlaze5840, Map map, long j) {
        PolarVoyageTraceMaxDragonMax4845 polarVoyageTraceMaxDragonMax4845 = (PolarVoyageTraceMaxDragonMax4845) this.PolarVoyageKotlinBetaPulseBeta3653;
        long j2 = polarVoyageTraceMaxDragonMax4845.PolarVoyageItemDecorationUltraDeltaEpic7485;
        LinkedHashMap linkedHashMap = (LinkedHashMap) polarVoyageTraceMaxDragonMax4845.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (j > j2) {
            Object remove = linkedHashMap.remove(polarVoyageChipInfernoVortex9378);
            if (remove != null) {
                polarVoyageTraceMaxDragonMax4845.PolarVoyageStrictModeLegendEpic1532 = polarVoyageTraceMaxDragonMax4845.PolarVoyageTextInputEditTextNebulaHero6651() - polarVoyageTraceMaxDragonMax4845.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageChipInfernoVortex9378, remove);
                polarVoyageTraceMaxDragonMax4845.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageChipInfernoVortex9378, remove, null);
            }
            ((PolarVoyageViewModelQuantumDragonPhoenix2767) this.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageDiffUtilTurboStrike5735(polarVoyageChipInfernoVortex9378, polarVoyageViewPagerStrikeBlaze5840, map, j);
            return;
        }
        PolarVoyageInputMethodManagerGammaNovaXShadow8516 polarVoyageInputMethodManagerGammaNovaXShadow8516 = new PolarVoyageInputMethodManagerGammaNovaXShadow8516(polarVoyageViewPagerStrikeBlaze5840, map, j);
        Object put = linkedHashMap.put(polarVoyageChipInfernoVortex9378, polarVoyageInputMethodManagerGammaNovaXShadow8516);
        polarVoyageTraceMaxDragonMax4845.PolarVoyageStrictModeLegendEpic1532 = polarVoyageTraceMaxDragonMax4845.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageChipInfernoVortex9378, polarVoyageInputMethodManagerGammaNovaXShadow8516) + polarVoyageTraceMaxDragonMax4845.PolarVoyageTextInputEditTextNebulaHero6651();
        if (put != null) {
            polarVoyageTraceMaxDragonMax4845.PolarVoyageStrictModeLegendEpic1532 = polarVoyageTraceMaxDragonMax4845.PolarVoyageTextInputEditTextNebulaHero6651() - polarVoyageTraceMaxDragonMax4845.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageChipInfernoVortex9378, put);
            polarVoyageTraceMaxDragonMax4845.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageChipInfernoVortex9378, put, polarVoyageInputMethodManagerGammaNovaXShadow8516);
        }
        polarVoyageTraceMaxDragonMax4845.PolarVoyageViewRogueMaster4778(polarVoyageTraceMaxDragonMax4845.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public PolarVoyageGuidelineMasterRogue8570() {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageSharedElementSpectraNeo7351();
        this.PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageSharedElementSpectraNeo7351();
    }

    public PolarVoyageGuidelineMasterRogue8570(String str, String str2, long j) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageKotlinBetaPulseBeta3653 = str2;
        this.PolarVoyageZipVortexCelestial6185 = j;
    }
}
