package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes9.dex */
public final class PossiblyInnerType {
    public final List arguments;
    public final ClassifierDescriptorWithTypeParameters classifierDescriptor;
    public final PossiblyInnerType outerType;

    public PossiblyInnerType(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, List<? extends TypeProjection> list, PossiblyInnerType possiblyInnerType) {
        classifierDescriptorWithTypeParameters.getClass();
        list.getClass();
        this.classifierDescriptor = classifierDescriptorWithTypeParameters;
        this.arguments = list;
        this.outerType = possiblyInnerType;
    }

    public final List<TypeProjection> getArguments() {
        return this.arguments;
    }

    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.classifierDescriptor;
    }

    public final PossiblyInnerType getOuterType() {
        return this.outerType;
    }
}
