package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes9.dex */
public final class LazyJavaScope$$Lambda$10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final LazyJavaScope arg$0;
    public final JavaField arg$1;
    public final Ref$ObjectRef arg$2;

    public /* synthetic */ LazyJavaScope$$Lambda$10(LazyJavaScope lazyJavaScope, JavaField javaField, Ref$ObjectRef ref$ObjectRef, int i) {
        this.$r8$classId = i;
        this.arg$0 = lazyJavaScope;
        this.arg$1 = javaField;
        this.arg$2 = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.arg$2;
        JavaField javaField = this.arg$1;
        LazyJavaScope lazyJavaScope = this.arg$0;
        switch (i) {
            case 0:
                return lazyJavaScope.c.getStorageManager().createNullableLazyValue(new LazyJavaScope$$Lambda$10(lazyJavaScope, javaField, ref$ObjectRef, 1));
            default:
                return lazyJavaScope.c.getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(javaField, (PropertyDescriptor) ref$ObjectRef.element);
        }
    }
}
