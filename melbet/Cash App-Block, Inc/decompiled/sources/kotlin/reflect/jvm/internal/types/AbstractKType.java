package kotlin.reflect.jvm.internal.types;

import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.ReflectProperties$LazySoftVal;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;

/* loaded from: classes9.dex */
public abstract class AbstractKType implements DefinitelyNotNullTypeMarker, FlexibleTypeMarker, SimpleTypeMarker, TypeArgumentListMarker, KType {
    public final ReflectProperties$LazySoftVal computeJavaType;

    public AbstractKType(Function0 function0) {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = null;
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal2 = function0 instanceof ReflectProperties$LazySoftVal ? (ReflectProperties$LazySoftVal) function0 : null;
        if (reflectProperties$LazySoftVal2 != null) {
            reflectProperties$LazySoftVal = reflectProperties$LazySoftVal2;
        } else if (function0 != null) {
            reflectProperties$LazySoftVal = TuplesKt.lazySoft(null, function0);
        }
        this.computeJavaType = reflectProperties$LazySoftVal;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractKType) && AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(ReflectTypeSystemContext.INSTANCE, this, (KotlinTypeMarker) obj);
    }

    public abstract KType getAbbreviation();

    public abstract KClass getMutableCollectionClass();

    public int hashCode() {
        KClassifier classifier = getClassifier();
        int hashCode = classifier != null ? classifier.hashCode() : 0;
        return Boolean.hashCode(isMarkedNullable()) + ((getArguments().hashCode() + (hashCode * 31)) * 31);
    }

    public abstract boolean isDefinitelyNotNullType();

    public abstract boolean isNothingType();

    public abstract boolean isRawType();

    public abstract boolean isSuspendFunctionType();

    public abstract AbstractKType lowerBoundIfFlexible();

    public abstract AbstractKType makeDefinitelyNotNullAsSpecified(boolean z);

    public abstract AbstractKType makeNullableAsSpecified(boolean z);

    public String toString() {
        return ReflectionObjectRenderer.renderType(this, false);
    }

    public abstract AbstractKType upperBoundIfFlexible();
}
