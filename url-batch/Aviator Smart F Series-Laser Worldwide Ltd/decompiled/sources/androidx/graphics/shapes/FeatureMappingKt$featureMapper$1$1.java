package androidx.graphics.shapes;

import f6.l;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class FeatureMappingKt$featureMapper$1$1 extends Lambda implements l {
    public static final FeatureMappingKt$featureMapper$1$1 INSTANCE = new FeatureMappingKt$featureMapper$1$1();

    FeatureMappingKt$featureMapper$1$1() {
        super(1);
    }

    @Override // f6.l
    public final CharSequence invoke(Pair<Float, Float> it) {
        s.checkNotNullParameter(it, "it");
        return it.getFirst().floatValue() + " -> " + it.getSecond().floatValue();
    }
}
