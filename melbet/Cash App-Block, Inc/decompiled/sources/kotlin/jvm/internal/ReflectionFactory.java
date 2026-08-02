package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;

/* loaded from: classes3.dex */
public class ReflectionFactory {
    public KFunction function(FunctionReference functionReference) {
        return functionReference;
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new ClassReference(cls);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls) {
        return new PackageReference(cls);
    }

    public KType mutableCollectionType(KType kType) {
        TypeReference typeReference = (TypeReference) kType;
        return new TypeReference(kType.getClassifier(), kType.getArguments(), typeReference.getPlatformTypeUpperBound$kotlin_stdlib(), typeReference.getFlags$kotlin_stdlib() | 2);
    }

    public KMutableProperty0 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public KMutableProperty1 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public KProperty0 property0(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public KProperty1 property1(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public KProperty2 property2(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public String renderLambdaToString(FunctionBase functionBase) {
        String obj = functionBase.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public KType typeOf(KClass kClass, List list, boolean z) {
        return new TypeReference(kClass, list, z);
    }

    public String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((FunctionBase) lambda);
    }
}
