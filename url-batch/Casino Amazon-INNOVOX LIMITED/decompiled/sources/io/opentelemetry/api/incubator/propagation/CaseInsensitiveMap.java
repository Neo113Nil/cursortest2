package io.opentelemetry.api.incubator.propagation;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
class CaseInsensitiveMap extends HashMap<String, String> {
    private static final long serialVersionUID = -4202518750189126871L;

    CaseInsensitiveMap() {
    }

    CaseInsensitiveMap(Map<String, String> map) {
        if (map != null) {
            putAll(map);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(String str, String str2) {
        return (String) super.put((CaseInsensitiveMap) getKeyLowerCase(str), str2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends String, ? extends String> map) {
        map.forEach(new BiConsumer() { // from class: io.opentelemetry.api.incubator.propagation.CaseInsensitiveMap$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CaseInsensitiveMap.this.put((String) obj, (String) obj2);
            }
        });
    }

    private static String getKeyLowerCase(String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public String get(Object obj) {
        return (String) super.get((Object) getKeyLowerCase((String) obj));
    }
}
