package io.opentelemetry.api.incubator.propagation;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.context.propagation.TextMapGetter;
import io.opentelemetry.context.propagation.TextMapSetter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ExtendedContextPropagators {
    private static final TextMapGetter<Map<String, String>> TEXT_MAP_GETTER = new TextMapGetter<Map<String, String>>() { // from class: io.opentelemetry.api.incubator.propagation.ExtendedContextPropagators.1
        @Override // io.opentelemetry.context.propagation.TextMapGetter
        public Set<String> keys(Map<String, String> map) {
            return map.keySet();
        }

        @Override // io.opentelemetry.context.propagation.TextMapGetter
        @Nullable
        public String get(@Nullable Map<String, String> map, String str) {
            if (map == null) {
                return null;
            }
            return map.get(str);
        }
    };

    private ExtendedContextPropagators() {
    }

    public static Map<String, String> getTextMapPropagationContext(ContextPropagators contextPropagators) {
        HashMap hashMap = new HashMap();
        contextPropagators.getTextMapPropagator().inject(Context.current(), hashMap, new TextMapSetter() { // from class: io.opentelemetry.api.incubator.propagation.ExtendedContextPropagators$$ExternalSyntheticLambda0
            @Override // io.opentelemetry.context.propagation.TextMapSetter
            public final void set(Object obj, String str, String str2) {
                ExtendedContextPropagators.lambda$getTextMapPropagationContext$0((Map) obj, str, str2);
            }
        });
        return Collections.unmodifiableMap(hashMap);
    }

    static /* synthetic */ void lambda$getTextMapPropagationContext$0(Map map, String str, String str2) {
        if (map != null) {
            map.put(str, str2);
        }
    }

    public static Context extractTextMapPropagationContext(Map<String, String> map, ContextPropagators contextPropagators) {
        Context current = Context.current();
        if (map == null) {
            return current;
        }
        return contextPropagators.getTextMapPropagator().extract(current, new CaseInsensitiveMap(map), TEXT_MAP_GETTER);
    }
}
