package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* loaded from: classes9.dex */
public final class CompositeAnnotations$$Lambda$1 implements Function1 {
    public static final CompositeAnnotations$$Lambda$1 INSTANCE = new CompositeAnnotations$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Annotations annotations = (Annotations) obj;
        annotations.getClass();
        return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(annotations, 1);
    }
}
