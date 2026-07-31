package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class I {
    public static final <K, V> V getOrImplicitDefaultNullable(@NotNull Map<K, ? extends V> map, K k4) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof G) {
            return (V) ((G) map).j(k4);
        }
        V v4 = map.get(k4);
        if (v4 != null || map.containsKey(k4)) {
            return v4;
        }
        throw new NoSuchElementException("Key " + k4 + " is missing in the map.");
    }

    @NotNull
    public static <K, V> Map<K, V> withDefault(@NotNull Map<K, ? extends V> map, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof G ? withDefault(((G) map).i(), defaultValue) : new H(map, defaultValue);
    }

    @NotNull
    public static final <K, V> Map<K, V> withDefaultMutable(@NotNull Map<K, V> map, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof N ? withDefaultMutable(((N) map).i(), defaultValue) : new O(map, defaultValue);
    }
}
