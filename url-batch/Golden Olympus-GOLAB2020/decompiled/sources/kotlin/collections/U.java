package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class U {
    public static Set a(Set builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((X1.h) builder).e();
    }

    public static Set b() {
        return new X1.h();
    }

    public static Set c(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }

    public static TreeSet d(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) C3223m.y0(elements, new TreeSet());
    }
}
