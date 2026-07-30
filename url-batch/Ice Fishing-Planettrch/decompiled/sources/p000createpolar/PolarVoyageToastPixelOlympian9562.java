package p000createpolar;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageToastPixelOlympian9562 implements Map {
    public final Map PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageToastPixelOlympian9562(Map map) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.PolarVoyageItemDecorationUltraDeltaEpic7485.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((PolarVoyagePagingDataTurboElite5231) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485.entrySet(), new PolarVoyageInstrumentationSpeedAlpha6533(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageCameraPixelBlaze2629(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageStrictModeLegendEpic1532(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485.keySet(), new PolarVoyageInstrumentationSpeedAlpha6533(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.values();
    }
}
