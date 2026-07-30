package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.KVariance;

/* loaded from: classes4.dex */
public class u {
    private static final kotlin.reflect.d[] EMPTY_K_CLASS_ARRAY;
    static final String REFLECTION_NOT_AVAILABLE = " (Kotlin reflection is not available)";
    private static final v factory;

    static {
        v vVar = null;
        try {
            vVar = (v) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (vVar == null) {
            vVar = new v();
        }
        factory = vVar;
        EMPTY_K_CLASS_ARRAY = new kotlin.reflect.d[0];
    }

    public static kotlin.reflect.d createKotlinClass(Class cls) {
        return factory.createKotlinClass(cls);
    }

    public static kotlin.reflect.h function(FunctionReference functionReference) {
        return factory.function(functionReference);
    }

    public static kotlin.reflect.d getOrCreateKotlinClass(Class cls) {
        return factory.getOrCreateKotlinClass(cls);
    }

    public static kotlin.reflect.d[] getOrCreateKotlinClasses(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY_K_CLASS_ARRAY;
        }
        kotlin.reflect.d[] dVarArr = new kotlin.reflect.d[length];
        for (int i8 = 0; i8 < length; i8++) {
            dVarArr[i8] = getOrCreateKotlinClass(clsArr[i8]);
        }
        return dVarArr;
    }

    public static kotlin.reflect.g getOrCreateKotlinPackage(Class cls) {
        return factory.getOrCreateKotlinPackage(cls, "");
    }

    public static kotlin.reflect.q mutableCollectionType(kotlin.reflect.q qVar) {
        return factory.mutableCollectionType(qVar);
    }

    public static kotlin.reflect.j mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return factory.mutableProperty0(mutablePropertyReference0);
    }

    public static kotlin.reflect.k mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return factory.mutableProperty1(mutablePropertyReference1);
    }

    public static kotlin.reflect.l mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return factory.mutableProperty2(mutablePropertyReference2);
    }

    public static kotlin.reflect.q nothingType(kotlin.reflect.q qVar) {
        return factory.nothingType(qVar);
    }

    public static kotlin.reflect.q nullableTypeOf(kotlin.reflect.f fVar) {
        return factory.typeOf(fVar, Collections.emptyList(), true);
    }

    public static kotlin.reflect.q platformType(kotlin.reflect.q qVar, kotlin.reflect.q qVar2) {
        return factory.platformType(qVar, qVar2);
    }

    public static kotlin.reflect.n property0(PropertyReference0 propertyReference0) {
        return factory.property0(propertyReference0);
    }

    public static kotlin.reflect.o property1(PropertyReference1 propertyReference1) {
        return factory.property1(propertyReference1);
    }

    public static kotlin.reflect.p property2(PropertyReference2 propertyReference2) {
        return factory.property2(propertyReference2);
    }

    public static String renderLambdaToString(Lambda lambda) {
        return factory.renderLambdaToString(lambda);
    }

    public static void setUpperBounds(kotlin.reflect.r rVar, kotlin.reflect.q qVar) {
        factory.setUpperBounds(rVar, Collections.singletonList(qVar));
    }

    public static kotlin.reflect.q typeOf(kotlin.reflect.f fVar) {
        return factory.typeOf(fVar, Collections.emptyList(), false);
    }

    public static kotlin.reflect.r typeParameter(Object obj, String str, KVariance kVariance, boolean z7) {
        return factory.typeParameter(obj, str, kVariance, z7);
    }

    public static kotlin.reflect.d createKotlinClass(Class cls, String str) {
        return factory.createKotlinClass(cls, str);
    }

    public static kotlin.reflect.d getOrCreateKotlinClass(Class cls, String str) {
        return factory.getOrCreateKotlinClass(cls, str);
    }

    public static kotlin.reflect.g getOrCreateKotlinPackage(Class cls, String str) {
        return factory.getOrCreateKotlinPackage(cls, str);
    }

    public static kotlin.reflect.q nullableTypeOf(Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.emptyList(), true);
    }

    public static String renderLambdaToString(q qVar) {
        return factory.renderLambdaToString(qVar);
    }

    public static void setUpperBounds(kotlin.reflect.r rVar, kotlin.reflect.q... qVarArr) {
        factory.setUpperBounds(rVar, ArraysKt___ArraysKt.toList(qVarArr));
    }

    public static kotlin.reflect.q typeOf(Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.emptyList(), false);
    }

    public static kotlin.reflect.q nullableTypeOf(Class cls, kotlin.reflect.s sVar) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(sVar), true);
    }

    public static kotlin.reflect.q typeOf(Class cls, kotlin.reflect.s sVar) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(sVar), false);
    }

    public static kotlin.reflect.q nullableTypeOf(Class cls, kotlin.reflect.s sVar, kotlin.reflect.s sVar2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(sVar, sVar2), true);
    }

    public static kotlin.reflect.q typeOf(Class cls, kotlin.reflect.s sVar, kotlin.reflect.s sVar2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(sVar, sVar2), false);
    }

    public static kotlin.reflect.q nullableTypeOf(Class cls, kotlin.reflect.s... sVarArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), ArraysKt___ArraysKt.toList(sVarArr), true);
    }

    public static kotlin.reflect.q typeOf(Class cls, kotlin.reflect.s... sVarArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), ArraysKt___ArraysKt.toList(sVarArr), false);
    }
}
