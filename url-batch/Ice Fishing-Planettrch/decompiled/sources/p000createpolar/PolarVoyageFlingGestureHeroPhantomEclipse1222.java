package p000createpolar;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlingGestureHeroPhantomEclipse1222 implements PolarVoyageNavigationViewPrimeElite2875, PolarVoyageSharedFlowEclipseTitaniumSolar2658 {
    public final Map PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyageScrollViewShadowCyberInferno3272 PolarVoyageBitmapVisionAuroraPixel4705;
    public final boolean PolarVoyageDiffUtilTurboStrike5735;
    public final Map PolarVoyageKotlinBetaPulseBeta3653;
    public final JsonWriter PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final boolean PolarVoyageZipVortexCelestial6185 = true;

    public PolarVoyageFlingGestureHeroPhantomEclipse1222(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, PolarVoyageWithContextPrimeNeoPhantom3689 polarVoyageWithContextPrimeNeoPhantom3689, boolean z) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new JsonWriter(bufferedWriter);
        this.PolarVoyageKotlinBetaPulseBeta3653 = hashMap;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = hashMap2;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageWithContextPrimeNeoPhantom3689;
        this.PolarVoyageDiffUtilTurboStrike5735 = z;
    }

    @Override // p000createpolar.PolarVoyageSharedFlowEclipseTitaniumSolar2658
    public final PolarVoyageSharedFlowEclipseTitaniumSolar2658 PolarVoyageBarcodeScannerInfernoSolarSpark7767(boolean z) {
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068.value(z);
        return this;
    }

    @Override // p000createpolar.PolarVoyageNavigationViewPrimeElite2875
    public final PolarVoyageNavigationViewPrimeElite2875 PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageBitmapPrimeStorm5891 polarVoyageBitmapPrimeStorm5891, Object obj) {
        PolarVoyageTextInputEditTextNebulaHero6651(obj, polarVoyageBitmapPrimeStorm5891.PolarVoyageZipVortexCelestial6185);
        return this;
    }

    public final PolarVoyageFlingGestureHeroPhantomEclipse1222 PolarVoyageDiffUtilTurboStrike5735(Object obj) {
        JsonWriter jsonWriter = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    PolarVoyageDiffUtilTurboStrike5735(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        PolarVoyageTextInputEditTextNebulaHero6651(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new PolarVoyageMapThunderAurora9698(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            PolarVoyageScrollViewShadowCyberInferno3272 polarVoyageScrollViewShadowCyberInferno3272 = (PolarVoyageScrollViewShadowCyberInferno3272) this.PolarVoyageKotlinBetaPulseBeta3653.get(obj.getClass());
            if (polarVoyageScrollViewShadowCyberInferno3272 != null) {
                jsonWriter.beginObject();
                polarVoyageScrollViewShadowCyberInferno3272.PolarVoyageZipVortexCelestial6185(obj, this);
                jsonWriter.endObject();
                return this;
            }
            PolarVoyageNotificationManagerPixelEpic3221 polarVoyageNotificationManagerPixelEpic3221 = (PolarVoyageNotificationManagerPixelEpic3221) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(obj.getClass());
            if (polarVoyageNotificationManagerPixelEpic3221 != null) {
                polarVoyageNotificationManagerPixelEpic3221.PolarVoyageZipVortexCelestial6185(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                PolarVoyageItemDecorationUltraDeltaEpic7485();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageZipVortexCelestial6185(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            PolarVoyageItemDecorationUltraDeltaEpic7485();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                PolarVoyageItemDecorationUltraDeltaEpic7485();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                PolarVoyageDiffUtilTurboStrike5735(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                PolarVoyageDiffUtilTurboStrike5735(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final void PolarVoyageItemDecorationUltraDeltaEpic7485() {
        if (this.PolarVoyageZipVortexCelestial6185) {
            return;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // p000createpolar.PolarVoyageSharedFlowEclipseTitaniumSolar2658
    public final PolarVoyageSharedFlowEclipseTitaniumSolar2658 PolarVoyageKotlinBetaPulseBeta3653(String str) {
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068.value(str);
        return this;
    }

    @Override // p000createpolar.PolarVoyageNavigationViewPrimeElite2875
    public final PolarVoyageNavigationViewPrimeElite2875 PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBitmapPrimeStorm5891 polarVoyageBitmapPrimeStorm5891, long j) {
        String str = polarVoyageBitmapPrimeStorm5891.PolarVoyageZipVortexCelestial6185;
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        JsonWriter jsonWriter = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        jsonWriter.name(str);
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        jsonWriter.value(j);
        return this;
    }

    public final PolarVoyageFlingGestureHeroPhantomEclipse1222 PolarVoyageTextInputEditTextNebulaHero6651(Object obj, String str) {
        boolean z = this.PolarVoyageDiffUtilTurboStrike5735;
        JsonWriter jsonWriter = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (z) {
            if (obj == null) {
                return this;
            }
            PolarVoyageItemDecorationUltraDeltaEpic7485();
            jsonWriter.name(str);
            PolarVoyageDiffUtilTurboStrike5735(obj);
            return this;
        }
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        PolarVoyageDiffUtilTurboStrike5735(obj);
        return this;
    }

    @Override // p000createpolar.PolarVoyageNavigationViewPrimeElite2875
    public final PolarVoyageNavigationViewPrimeElite2875 PolarVoyageZipVortexCelestial6185(PolarVoyageBitmapPrimeStorm5891 polarVoyageBitmapPrimeStorm5891, int i) {
        String str = polarVoyageBitmapPrimeStorm5891.PolarVoyageZipVortexCelestial6185;
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        JsonWriter jsonWriter = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        jsonWriter.name(str);
        PolarVoyageItemDecorationUltraDeltaEpic7485();
        jsonWriter.value(i);
        return this;
    }
}
