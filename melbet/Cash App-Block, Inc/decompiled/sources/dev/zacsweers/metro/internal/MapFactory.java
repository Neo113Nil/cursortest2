package dev.zacsweers.metro.internal;

import dev.zacsweers.metro.Provider;
import java.util.LinkedHashMap;
import java.util.Map;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class MapFactory extends AbstractMapFactory {
    public static final /* synthetic */ int $r8$clinit = 0;

    public final class Builder extends InteractionResult {
        public MapFactory build() {
            return new MapFactory((LinkedHashMap) this.$$delegate_0);
        }

        public void put(String str, Provider provider) {
            provider.getClass();
            put((Object) str, provider);
        }

        public void put$1(Object obj, Provider provider) {
            obj.getClass();
            provider.getClass();
            put(obj, provider);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.contributingMap;
        LinkedHashMap newLinkedHashMapWithExpectedSize = BaseDoubleCheckKt.newLinkedHashMapWithExpectedSize(map.size());
        for (Map.Entry entry : map.entrySet()) {
            newLinkedHashMapWithExpectedSize.put(entry.getKey(), ((Provider) entry.getValue()).invoke());
        }
        return BaseDoubleCheckKt.toUnmodifiableMap(newLinkedHashMapWithExpectedSize);
    }
}
