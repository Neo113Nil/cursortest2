package p000createpolar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageIntentServicePixelMaxElite4283 {
    public static final PolarVoyageAuthTitaniumMasterElite1113 PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageAuthTitaniumMasterElite1113(16);
    public static final PolarVoyageAuthTitaniumMasterElite1113 PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageAuthTitaniumMasterElite1113(17);
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public final Object PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Object PolarVoyageTextInputEditTextNebulaHero6651;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageIntentServicePixelMaxElite4283(int i) {
        this.PolarVoyageZipVortexCelestial6185 = 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        if (i <= 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("maxSize <= 0");
            throw null;
        }
        this.PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyageFCMVisionSolarGamma9599(2);
        this.PolarVoyageTextInputEditTextNebulaHero6651 = new PolarVoyagePreviewDeltaVisionCyber7933(15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PolarVoyageBarcodeScannerInfernoSolarSpark7767(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (((PolarVoyagePreviewDeltaVisionCyber7933) this.PolarVoyageTextInputEditTextNebulaHero6651)) {
            this.PolarVoyageKotlinBetaPulseBeta3653++;
            PolarVoyageFCMVisionSolarGamma9599 polarVoyageFCMVisionSolarGamma9599 = (PolarVoyageFCMVisionSolarGamma9599) this.PolarVoyageDiffUtilTurboStrike5735;
            polarVoyageFCMVisionSolarGamma9599.getClass();
            put = polarVoyageFCMVisionSolarGamma9599.PolarVoyageZipVortexCelestial6185.put(obj, obj2);
            if (put != null) {
                this.PolarVoyageKotlinBetaPulseBeta3653--;
            }
        }
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        while (true) {
            synchronized (((PolarVoyagePreviewDeltaVisionCyber7933) this.PolarVoyageTextInputEditTextNebulaHero6651)) {
                try {
                    if (this.PolarVoyageKotlinBetaPulseBeta3653 < 0 || (((PolarVoyageFCMVisionSolarGamma9599) this.PolarVoyageDiffUtilTurboStrike5735).PolarVoyageZipVortexCelestial6185.isEmpty() && this.PolarVoyageKotlinBetaPulseBeta3653 != 0)) {
                        break;
                    }
                    if (this.PolarVoyageKotlinBetaPulseBeta3653 <= i || ((PolarVoyageFCMVisionSolarGamma9599) this.PolarVoyageDiffUtilTurboStrike5735).PolarVoyageZipVortexCelestial6185.isEmpty()) {
                        break;
                    }
                    Set entrySet = ((PolarVoyageFCMVisionSolarGamma9599) this.PolarVoyageDiffUtilTurboStrike5735).PolarVoyageZipVortexCelestial6185.entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    Object obj3 = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    PolarVoyageFCMVisionSolarGamma9599 polarVoyageFCMVisionSolarGamma95992 = (PolarVoyageFCMVisionSolarGamma9599) this.PolarVoyageDiffUtilTurboStrike5735;
                    polarVoyageFCMVisionSolarGamma95992.getClass();
                    key.getClass();
                    polarVoyageFCMVisionSolarGamma95992.PolarVoyageZipVortexCelestial6185.remove(key);
                    int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
                    value.getClass();
                    this.PolarVoyageKotlinBetaPulseBeta3653 = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public Object PolarVoyageBitmapVisionAuroraPixel4705(Object obj) {
        Object remove;
        synchronized (((PolarVoyagePreviewDeltaVisionCyber7933) this.PolarVoyageTextInputEditTextNebulaHero6651)) {
            PolarVoyageFCMVisionSolarGamma9599 polarVoyageFCMVisionSolarGamma9599 = (PolarVoyageFCMVisionSolarGamma9599) this.PolarVoyageDiffUtilTurboStrike5735;
            polarVoyageFCMVisionSolarGamma9599.getClass();
            remove = polarVoyageFCMVisionSolarGamma9599.PolarVoyageZipVortexCelestial6185.remove(obj);
            if (remove != null) {
                this.PolarVoyageKotlinBetaPulseBeta3653--;
            }
        }
        return remove;
    }

    public float PolarVoyageKotlinBetaPulseBeta3653() {
        ArrayList arrayList = (ArrayList) this.PolarVoyageDiffUtilTurboStrike5735;
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 != 0) {
            Collections.sort(arrayList, PolarVoyageStrictModeLegendEpic1532);
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
        }
        float f = 0.5f * this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            PolarVoyageConstraintSetAlphaDragonMax1547 polarVoyageConstraintSetAlphaDragonMax1547 = (PolarVoyageConstraintSetAlphaDragonMax1547) arrayList.get(i2);
            i += polarVoyageConstraintSetAlphaDragonMax1547.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i >= f) {
                return polarVoyageConstraintSetAlphaDragonMax1547.PolarVoyageKotlinBetaPulseBeta3653;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((PolarVoyageConstraintSetAlphaDragonMax1547) arrayList.get(arrayList.size() - 1)).PolarVoyageKotlinBetaPulseBeta3653;
    }

    public Object PolarVoyageMotionLayoutTransitionHeroVision4068(Object obj) {
        synchronized (((PolarVoyagePreviewDeltaVisionCyber7933) this.PolarVoyageTextInputEditTextNebulaHero6651)) {
            PolarVoyageFCMVisionSolarGamma9599 polarVoyageFCMVisionSolarGamma9599 = (PolarVoyageFCMVisionSolarGamma9599) this.PolarVoyageDiffUtilTurboStrike5735;
            polarVoyageFCMVisionSolarGamma9599.getClass();
            Object obj2 = polarVoyageFCMVisionSolarGamma9599.PolarVoyageZipVortexCelestial6185.get(obj);
            if (obj2 != null) {
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767++;
                return obj2;
            }
            this.PolarVoyageBitmapVisionAuroraPixel4705++;
            return null;
        }
    }

    public void PolarVoyageZipVortexCelestial6185(float f, int i) {
        PolarVoyageConstraintSetAlphaDragonMax1547 polarVoyageConstraintSetAlphaDragonMax1547;
        PolarVoyageConstraintSetAlphaDragonMax1547[] polarVoyageConstraintSetAlphaDragonMax1547Arr = (PolarVoyageConstraintSetAlphaDragonMax1547[]) this.PolarVoyageTextInputEditTextNebulaHero6651;
        ArrayList arrayList = (ArrayList) this.PolarVoyageDiffUtilTurboStrike5735;
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 != 1) {
            Collections.sort(arrayList, PolarVoyageItemDecorationUltraDeltaEpic7485);
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 1;
        }
        int i2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.PolarVoyageBitmapVisionAuroraPixel4705 = i3;
            polarVoyageConstraintSetAlphaDragonMax1547 = polarVoyageConstraintSetAlphaDragonMax1547Arr[i3];
        } else {
            polarVoyageConstraintSetAlphaDragonMax1547 = new PolarVoyageConstraintSetAlphaDragonMax1547();
        }
        int i4 = this.PolarVoyageKotlinBetaPulseBeta3653;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i4 + 1;
        polarVoyageConstraintSetAlphaDragonMax1547.PolarVoyageZipVortexCelestial6185 = i4;
        polarVoyageConstraintSetAlphaDragonMax1547.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        polarVoyageConstraintSetAlphaDragonMax1547.PolarVoyageKotlinBetaPulseBeta3653 = f;
        arrayList.add(polarVoyageConstraintSetAlphaDragonMax1547);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 += i;
        while (true) {
            int i5 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            PolarVoyageConstraintSetAlphaDragonMax1547 polarVoyageConstraintSetAlphaDragonMax15472 = (PolarVoyageConstraintSetAlphaDragonMax1547) arrayList.get(0);
            int i7 = polarVoyageConstraintSetAlphaDragonMax15472.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i7 <= i6) {
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 -= i7;
                arrayList.remove(0);
                int i8 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                if (i8 < 5) {
                    this.PolarVoyageBitmapVisionAuroraPixel4705 = i8 + 1;
                    polarVoyageConstraintSetAlphaDragonMax1547Arr[i8] = polarVoyageConstraintSetAlphaDragonMax15472;
                }
            } else {
                polarVoyageConstraintSetAlphaDragonMax15472.PolarVoyageMotionLayoutTransitionHeroVision4068 = i7 - i6;
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 -= i6;
            }
        }
    }

    public String toString() {
        String str;
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case 1:
                synchronized (((PolarVoyagePreviewDeltaVisionCyber7933) this.PolarVoyageTextInputEditTextNebulaHero6651)) {
                    try {
                        int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        int i2 = this.PolarVoyageBitmapVisionAuroraPixel4705 + i;
                        str = "LruCache[maxSize=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ",hits=" + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + ",misses=" + this.PolarVoyageBitmapVisionAuroraPixel4705 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public PolarVoyageIntentServicePixelMaxElite4283() {
        this.PolarVoyageZipVortexCelestial6185 = 0;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = new PolarVoyageConstraintSetAlphaDragonMax1547[5];
        this.PolarVoyageDiffUtilTurboStrike5735 = new ArrayList();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = -1;
    }
}
