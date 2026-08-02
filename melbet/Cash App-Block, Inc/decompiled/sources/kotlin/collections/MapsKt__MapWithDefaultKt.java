package kotlin.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public class MapsKt__MapWithDefaultKt {
    public static Map withDefaultMutable(LinkedHashMap linkedHashMap, Perfs$$ExternalSyntheticLambda2 perfs$$ExternalSyntheticLambda2) {
        return new MutableMapWithDefaultImpl(linkedHashMap, perfs$$ExternalSyntheticLambda2);
    }
}
