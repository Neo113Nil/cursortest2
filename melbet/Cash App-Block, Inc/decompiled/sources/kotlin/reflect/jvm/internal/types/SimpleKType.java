package kotlin.reflect.jvm.internal.types;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class SimpleKType extends AbstractKType {
    public final KType abbreviation;
    public final List annotations;
    public final List arguments;
    public final KClassifier classifier;
    public final boolean isDefinitelyNotNullType;
    public final boolean isMarkedNullable;
    public final boolean isNothingType;
    public final boolean isSuspendFunctionType;
    public final KClass mutableCollectionClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleKType(KClassifier kClassifier, List list, boolean z, List list2, KType kType, boolean z2, boolean z3, boolean z4, KClass kClass, Function0 function0) {
        super(function0);
        kClassifier.getClass();
        list.getClass();
        list2.getClass();
        this.classifier = kClassifier;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.annotations = list2;
        this.abbreviation = kType;
        this.isDefinitelyNotNullType = z2;
        this.isNothingType = z3;
        this.isSuspendFunctionType = z4;
        this.mutableCollectionClass = kClass;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final KType getAbbreviation() {
        return this.abbreviation;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final KClass getMutableCollectionClass() {
        return this.mutableCollectionClass;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isDefinitelyNotNullType() {
        return this.isDefinitelyNotNullType;
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isNothingType() {
        return this.isNothingType;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isRawType() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isSuspendFunctionType() {
        return this.isSuspendFunctionType;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType lowerBoundIfFlexible() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType makeDefinitelyNotNullAsSpecified(boolean z) {
        return new SimpleKType(this.classifier, this.arguments, this.isMarkedNullable && !z, this.annotations, this.abbreviation, z, this.isNothingType, this.isSuspendFunctionType, this.mutableCollectionClass, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType makeNullableAsSpecified(boolean z) {
        KClassifier kClassifier = this.classifier;
        boolean z2 = kClassifier instanceof KClass;
        KClassifier kClassifier2 = kClassifier;
        if (z2) {
            KClass kClass = (KClass) kClassifier;
            if (z) {
                kClassifier2 = Reflection.factory.getOrCreateKotlinClass(PapaEvent.getJavaObjectType(kClass));
            } else {
                Class javaPrimitiveType = PapaEvent.getJavaPrimitiveType(kClass);
                kClassifier2 = kClass;
                if (javaPrimitiveType != null) {
                    kClassifier2 = Reflection.factory.getOrCreateKotlinClass(javaPrimitiveType);
                }
            }
        }
        return new SimpleKType(kClassifier2, this.arguments, z, this.annotations, this.abbreviation, false, this.isNothingType, this.isSuspendFunctionType, this.mutableCollectionClass, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType upperBoundIfFlexible() {
        return null;
    }
}
