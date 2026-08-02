package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes.dex */
public class SetsKt__SetsJVMKt {
    public static SetBuilder build(SetBuilder setBuilder) {
        setBuilder.backing.build();
        return setBuilder.size() > 0 ? setBuilder : SetBuilder.Empty;
    }

    public static Set setOf(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }
}
