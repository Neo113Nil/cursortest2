package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KVariance;

/* loaded from: classes4.dex */
public class v {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public kotlin.reflect.d createKotlinClass(Class cls) {
        return new m(cls);
    }

    public kotlin.reflect.h function(FunctionReference functionReference) {
        return functionReference;
    }

    public kotlin.reflect.d getOrCreateKotlinClass(Class cls) {
        return new m(cls);
    }

    public kotlin.reflect.g getOrCreateKotlinPackage(Class cls, String str) {
        return new t(cls, str);
    }

    public kotlin.reflect.q mutableCollectionType(kotlin.reflect.q qVar) {
        TypeReference typeReference = (TypeReference) qVar;
        return new TypeReference(qVar.getClassifier(), qVar.getArguments(), typeReference.getPlatformTypeUpperBound$kotlin_stdlib(), typeReference.getFlags$kotlin_stdlib() | 2);
    }

    public kotlin.reflect.j mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public kotlin.reflect.k mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public kotlin.reflect.l mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public kotlin.reflect.q nothingType(kotlin.reflect.q qVar) {
        TypeReference typeReference = (TypeReference) qVar;
        return new TypeReference(qVar.getClassifier(), qVar.getArguments(), typeReference.getPlatformTypeUpperBound$kotlin_stdlib(), typeReference.getFlags$kotlin_stdlib() | 4);
    }

    public kotlin.reflect.q platformType(kotlin.reflect.q qVar, kotlin.reflect.q qVar2) {
        return new TypeReference(qVar.getClassifier(), qVar.getArguments(), qVar2, ((TypeReference) qVar).getFlags$kotlin_stdlib());
    }

    public kotlin.reflect.n property0(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public kotlin.reflect.o property1(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public kotlin.reflect.p property2(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((q) lambda);
    }

    public void setUpperBounds(kotlin.reflect.r rVar, List<kotlin.reflect.q> list) {
        ((y) rVar).setUpperBounds(list);
    }

    public kotlin.reflect.q typeOf(kotlin.reflect.f fVar, List<kotlin.reflect.s> list, boolean z7) {
        return new TypeReference(fVar, list, z7);
    }

    public kotlin.reflect.r typeParameter(Object obj, String str, KVariance kVariance, boolean z7) {
        return new y(obj, str, kVariance, z7);
    }

    public kotlin.reflect.d createKotlinClass(Class cls, String str) {
        return new m(cls);
    }

    public kotlin.reflect.d getOrCreateKotlinClass(Class cls, String str) {
        return new m(cls);
    }

    public String renderLambdaToString(q qVar) {
        String obj = qVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(KOTLIN_JVM_FUNCTIONS) ? obj.substring(21) : obj;
    }
}
