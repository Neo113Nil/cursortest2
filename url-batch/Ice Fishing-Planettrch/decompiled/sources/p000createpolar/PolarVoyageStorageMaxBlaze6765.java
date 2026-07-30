package p000createpolar;

import android.content.res.AssetFileDescriptor;
import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageStorageMaxBlaze6765 implements Callable {
    public final /* synthetic */ Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageStorageMaxBlaze6765(int i, Object obj) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        int i = this.PolarVoyageZipVortexCelestial6185;
        Object obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageColorDrawableSpectraSolarMega2051 polarVoyageColorDrawableSpectraSolarMega2051 = (PolarVoyageColorDrawableSpectraSolarMega2051) obj;
                synchronized (polarVoyageColorDrawableSpectraSolarMega2051) {
                    try {
                        PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364 polarVoyageDigitalInkRecognitionNebulaLegendTitanium8364 = (PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364) polarVoyageColorDrawableSpectraSolarMega2051.PolarVoyageZipVortexCelestial6185.get();
                        ArrayList PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageDigitalInkRecognitionNebulaLegendTitanium8364.PolarVoyageKotlinBetaPulseBeta3653();
                        polarVoyageDigitalInkRecognitionNebulaLegendTitanium8364.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < PolarVoyageKotlinBetaPulseBeta3653.size(); i2++) {
                            PolarVoyageFirestoreSolarOlympian2330 polarVoyageFirestoreSolarOlympian2330 = (PolarVoyageFirestoreSolarOlympian2330) PolarVoyageKotlinBetaPulseBeta3653.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", polarVoyageFirestoreSolarOlympian2330.PolarVoyageZipVortexCelestial6185);
                            jSONObject.put("dates", new JSONArray((Collection) polarVoyageFirestoreSolarOlympian2330.PolarVoyageMotionLayoutTransitionHeroVision4068));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString(Constants.ENCODING);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            case 1:
                PolarVoyageColorDrawableSpectraSolarMega2051 polarVoyageColorDrawableSpectraSolarMega20512 = (PolarVoyageColorDrawableSpectraSolarMega2051) obj;
                synchronized (polarVoyageColorDrawableSpectraSolarMega20512) {
                    ((PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364) polarVoyageColorDrawableSpectraSolarMega20512.PolarVoyageZipVortexCelestial6185.get()).PolarVoyageItemDecorationUltraDeltaEpic7485(((PolarVoyageInsetDrawableEclipseOlympian5852) polarVoyageColorDrawableSpectraSolarMega20512.PolarVoyageKotlinBetaPulseBeta3653.get()).PolarVoyageZipVortexCelestial6185(), System.currentTimeMillis());
                }
                return null;
            default:
                return (AssetFileDescriptor) obj;
        }
    }
}
