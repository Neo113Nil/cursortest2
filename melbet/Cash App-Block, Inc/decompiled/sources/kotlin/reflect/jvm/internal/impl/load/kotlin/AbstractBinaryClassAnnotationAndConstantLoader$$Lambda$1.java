package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final class AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1 implements Function2 {
    public static final AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1 INSTANCE = new AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1(0);
    public static final AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1 INSTANCE$1 = new AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AnnotationsContainerWithConstants annotationsContainerWithConstants = (AnnotationsContainerWithConstants) obj;
        MemberSignature memberSignature = (MemberSignature) obj2;
        switch (this.$r8$classId) {
            case 0:
                int i = AbstractBinaryClassAnnotationAndConstantLoader.$r8$clinit;
                annotationsContainerWithConstants.getClass();
                memberSignature.getClass();
                return annotationsContainerWithConstants.getAnnotationParametersDefaultValues().get(memberSignature);
            default:
                int i2 = AbstractBinaryClassAnnotationAndConstantLoader.$r8$clinit;
                annotationsContainerWithConstants.getClass();
                memberSignature.getClass();
                return annotationsContainerWithConstants.getPropertyConstants().get(memberSignature);
        }
    }
}
