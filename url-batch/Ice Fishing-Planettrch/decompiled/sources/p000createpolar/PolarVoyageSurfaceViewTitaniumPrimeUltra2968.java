package p000createpolar;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSurfaceViewTitaniumPrimeUltra2968 extends LinkedHashMap {
    public static final PolarVoyageSurfaceViewTitaniumPrimeUltra2968 PolarVoyageStrictModeLegendEpic1532;
    public boolean PolarVoyageItemDecorationUltraDeltaEpic7485 = true;

    static {
        PolarVoyageSurfaceViewTitaniumPrimeUltra2968 polarVoyageSurfaceViewTitaniumPrimeUltra2968 = new PolarVoyageSurfaceViewTitaniumPrimeUltra2968();
        PolarVoyageStrictModeLegendEpic1532 = polarVoyageSurfaceViewTitaniumPrimeUltra2968;
        polarVoyageSurfaceViewTitaniumPrimeUltra2968.PolarVoyageItemDecorationUltraDeltaEpic7485 = false;
    }

    public final PolarVoyageSurfaceViewTitaniumPrimeUltra2968 PolarVoyageMotionLayoutTransitionHeroVision4068() {
        if (isEmpty()) {
            return new PolarVoyageSurfaceViewTitaniumPrimeUltra2968();
        }
        PolarVoyageSurfaceViewTitaniumPrimeUltra2968 polarVoyageSurfaceViewTitaniumPrimeUltra2968 = new PolarVoyageSurfaceViewTitaniumPrimeUltra2968(this);
        polarVoyageSurfaceViewTitaniumPrimeUltra2968.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
        return polarVoyageSurfaceViewTitaniumPrimeUltra2968;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        if (!this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        PolarVoyageZipVortexCelestial6185();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                Charset charset = PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185;
                hashCode = length;
                for (byte b : bArr) {
                    hashCode = (hashCode * 31) + b;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                Charset charset2 = PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185;
                int i3 = length2;
                for (byte b2 : bArr2) {
                    i3 = (i3 * 31) + b2;
                }
                if (i3 != 0) {
                    i2 = i3;
                }
            } else {
                i2 = value.hashCode();
            }
            i += hashCode ^ i2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        PolarVoyageZipVortexCelestial6185();
        Charset charset = PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        PolarVoyageZipVortexCelestial6185();
        for (Object obj : map.keySet()) {
            Charset charset = PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PolarVoyageZipVortexCelestial6185();
        return super.remove(obj);
    }
}
