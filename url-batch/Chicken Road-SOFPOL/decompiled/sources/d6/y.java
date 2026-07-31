package d6;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class y extends a.a {
    public static e6.f E(e6.f fVar) {
        fVar.b();
        fVar.f2533p = true;
        if (fVar.f2529l > 0) {
            return fVar;
        }
        e6.f fVar2 = e6.f.f2521q;
        q6.i.c(fVar2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar2;
    }

    public static int F(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map G(Map map) {
        q6.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return v.f2327d;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        q6.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        q6.i.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
