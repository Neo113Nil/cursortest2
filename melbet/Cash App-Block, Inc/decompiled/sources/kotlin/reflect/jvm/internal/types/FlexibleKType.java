package kotlin.reflect.jvm.internal.types;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* loaded from: classes9.dex */
public final class FlexibleKType extends AbstractKType {
    public final boolean isRawType;
    public final AbstractKType lowerBound;
    public final AbstractKType upperBound;

    public final class Companion {
    }

    public FlexibleKType(AbstractKType abstractKType, AbstractKType abstractKType2, boolean z, Function0 function0) {
        super(function0);
        this.lowerBound = abstractKType;
        this.upperBound = abstractKType2;
        this.isRawType = z;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final KType getAbbreviation() {
        return null;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.lowerBound.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.lowerBound.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.lowerBound.getClassifier();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final KClass getMutableCollectionClass() {
        return this.lowerBound.getMutableCollectionClass();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isDefinitelyNotNullType() {
        return false;
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.lowerBound.isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isNothingType() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isRawType() {
        return this.isRawType;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isSuspendFunctionType() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType lowerBoundIfFlexible() {
        return this.lowerBound;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType makeDefinitelyNotNullAsSpecified(boolean z) {
        AbstractKType makeDefinitelyNotNullAsSpecified = this.lowerBound.makeDefinitelyNotNullAsSpecified(z);
        AbstractKType makeDefinitelyNotNullAsSpecified2 = this.upperBound.makeDefinitelyNotNullAsSpecified(z);
        makeDefinitelyNotNullAsSpecified.getClass();
        makeDefinitelyNotNullAsSpecified2.getClass();
        return makeDefinitelyNotNullAsSpecified.equals(makeDefinitelyNotNullAsSpecified2) ? makeDefinitelyNotNullAsSpecified : new FlexibleKType(makeDefinitelyNotNullAsSpecified, makeDefinitelyNotNullAsSpecified2, this.isRawType, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType makeNullableAsSpecified(boolean z) {
        AbstractKType makeNullableAsSpecified = this.lowerBound.makeNullableAsSpecified(z);
        AbstractKType makeNullableAsSpecified2 = this.upperBound.makeNullableAsSpecified(z);
        makeNullableAsSpecified.getClass();
        makeNullableAsSpecified2.getClass();
        return makeNullableAsSpecified.equals(makeNullableAsSpecified2) ? makeNullableAsSpecified : new FlexibleKType(makeNullableAsSpecified, makeNullableAsSpecified2, this.isRawType, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType upperBoundIfFlexible() {
        return this.upperBound;
    }
}
