package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes9.dex */
public final class TypeEnhancementInfo {
    public final Map map;

    public TypeEnhancementInfo(Map<Integer, JavaTypeQualifiers> map) {
        map.getClass();
        this.map = map;
    }

    public final TypeEnhancementInfo copyForWarnings() {
        Map map = this.map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), JavaTypeQualifiers.copy$default((JavaTypeQualifiers) entry.getValue(), null, null, false, true, true, 7, null));
        }
        return new TypeEnhancementInfo(linkedHashMap);
    }

    public final Map<Integer, JavaTypeQualifiers> getMap() {
        return this.map;
    }
}
