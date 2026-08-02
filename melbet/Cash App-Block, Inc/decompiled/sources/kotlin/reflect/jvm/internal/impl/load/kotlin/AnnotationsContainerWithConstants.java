package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;

/* loaded from: classes9.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {
    public final Map annotationParametersDefaultValues;
    public final Map memberAnnotations;
    public final Map propertyConstants;

    public AnnotationsContainerWithConstants(Map<MemberSignature, ? extends List<? extends A>> map, Map<MemberSignature, ? extends C> map2, Map<MemberSignature, ? extends C> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.memberAnnotations = map;
        this.propertyConstants = map2;
        this.annotationParametersDefaultValues = map3;
    }

    public final Map<MemberSignature, C> getAnnotationParametersDefaultValues() {
        return this.annotationParametersDefaultValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    public Map<MemberSignature, List<A>> getMemberAnnotations() {
        return this.memberAnnotations;
    }

    public final Map<MemberSignature, C> getPropertyConstants() {
        return this.propertyConstants;
    }
}
