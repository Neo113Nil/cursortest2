package kotlin.reflect.jvm.internal;

import com.google.mlkit.vision.face.FaceDetection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.types.AbstractKType;

/* loaded from: classes3.dex */
public class ReflectionFactoryImpl extends ReflectionFactory {
    public static KDeclarationContainerImpl getOwner(CallableReference callableReference) {
        KDeclarationContainer owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.INSTANCE;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KFunction function(FunctionReference functionReference) {
        KDeclarationContainerImpl owner = getOwner(functionReference);
        String name = functionReference.getName();
        String signature = functionReference.getSignature();
        if (!SystemPropertiesKt.useK1Implementation) {
            if (name.equals("<init>")) {
                if ((owner instanceof KClassImpl) && ((KClassImpl) owner).jClass.getAnnotation(Metadata.class) != null) {
                    signature.getClass();
                    Collection constructorsMetadata = owner.getConstructorsMetadata();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : constructorsMetadata) {
                        if (String.valueOf(JvmExtensionsKt.getSignature((KmConstructor) obj)).equals(signature)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() == 1) {
                        return new KotlinKConstructor(owner, signature, functionReference.getBoundReceiver(), (KmConstructor) CollectionsKt.single((List) arrayList));
                    }
                    String joinToString$default = CollectionsKt.joinToString$default(owner.getConstructorsMetadata(), "\n", null, null, 0, null, UtilKt$$Lambda$0.INSTANCE$15, 30);
                    StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                    sb.append(signature);
                    sb.append(") not resolved in ");
                    sb.append(owner);
                    sb.append(':');
                    sb.append(joinToString$default.length() == 0 ? " no constructors found" : " several matching constructors found:\n".concat(joinToString$default));
                    throw new KotlinReflectionInternalError(sb.toString());
                }
            } else if (owner instanceof KPackageImpl) {
                signature.getClass();
                KPackageImpl kPackageImpl = (KPackageImpl) owner;
                ArrayList functionsMetadata = kPackageImpl.getFunctionsMetadata();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = functionsMetadata.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    KmFunction kmFunction = (KmFunction) next;
                    if (Intrinsics.areEqual(kmFunction.getName(), name) && String.valueOf(JvmExtensionsKt.getSignature(kmFunction)).equals(signature)) {
                        arrayList2.add(next);
                    }
                }
                if (arrayList2.size() == 1) {
                    return new KotlinKNamedFunction(owner, signature, functionReference.getBoundReceiver(), (KmFunction) CollectionsKt.single((List) arrayList2));
                }
                String joinToString$default2 = CollectionsKt.joinToString$default(kPackageImpl.getFunctionsMetadata(), "\n", null, null, 0, null, UtilKt$$Lambda$0.INSTANCE$13, 30);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                m.append(owner);
                m.append(':');
                m.append(joinToString$default2.length() == 0 ? " no members found" : " several matching members found:\n".concat(joinToString$default2));
                throw new KotlinReflectionInternalError(m.toString());
            }
        }
        return new DescriptorKFunction(owner, name, signature, functionReference.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KClass getOrCreateKotlinClass(Class cls) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KDeclarationContainer getOrCreateKotlinPackage(Class cls) {
        ConcurrentHashMapCache concurrentHashMapCache = CachesKt.K_CLASS_CACHE;
        cls.getClass();
        return (KDeclarationContainer) CachesKt.K_PACKAGE_CACHE.get(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType mutableCollectionType(KType kType) {
        return FaceDetection.createMutableCollectionKType(kType);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KMutableProperty0 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        KDeclarationContainerImpl owner = getOwner(mutablePropertyReference0);
        String signature = mutablePropertyReference0.getSignature();
        return !SystemPropertiesKt.useK1Implementation ? new LazyKMutableProperty0(new KClassImpl$Data$$Lambda$23(15, signature, owner, mutablePropertyReference0)) : new DescriptorKMutableProperty0(owner, mutablePropertyReference0.getName(), signature, mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KMutableProperty1 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        KDeclarationContainerImpl owner = getOwner(mutablePropertyReference1);
        String signature = mutablePropertyReference1.getSignature();
        return !SystemPropertiesKt.useK1Implementation ? new LazyKMutableProperty1(new KClassImpl$Data$$Lambda$23(16, owner, mutablePropertyReference1, signature)) : new DescriptorKMutableProperty1(owner, mutablePropertyReference1.getName(), signature, mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty0 property0(PropertyReference0 propertyReference0) {
        KDeclarationContainerImpl owner = getOwner(propertyReference0);
        String signature = propertyReference0.getSignature();
        return !SystemPropertiesKt.useK1Implementation ? new LazyKProperty0(new KClassImpl$Data$$Lambda$23(14, signature, owner, propertyReference0)) : new DescriptorKProperty0(owner, propertyReference0.getName(), signature, propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty1 property1(final PropertyReference1 propertyReference1) {
        final KDeclarationContainerImpl owner = getOwner(propertyReference1);
        final String signature = propertyReference1.getSignature();
        return !SystemPropertiesKt.useK1Implementation ? new LazyKProperty1(new Function0(owner, propertyReference1, signature) { // from class: kotlin.reflect.jvm.internal.ReflectionFactoryImpl$$Lambda$2
            public final KDeclarationContainerImpl arg$0;
            public final PropertyReference1 arg$1;
            public final String arg$2;

            {
                this.arg$0 = owner;
                this.arg$1 = propertyReference1;
                this.arg$2 = signature;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KDeclarationContainerImpl kDeclarationContainerImpl = this.arg$0;
                boolean z = kDeclarationContainerImpl instanceof KPackageImpl;
                PropertyReference1 propertyReference12 = this.arg$1;
                String str = this.arg$2;
                if (!z) {
                    return new DescriptorKProperty1(kDeclarationContainerImpl, propertyReference12.getName(), str, propertyReference12.getBoundReceiver());
                }
                return new KotlinKProperty1(kDeclarationContainerImpl, str, propertyReference12.getBoundReceiver(), kDeclarationContainerImpl.findPropertyMetadata(propertyReference12.getName(), str));
            }
        }) : new DescriptorKProperty1(owner, propertyReference1.getName(), signature, propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty2 property2(PropertyReference2 propertyReference2) {
        return new DescriptorKProperty2(getOwner(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final String renderLambdaToString(FunctionBase functionBase) {
        DescriptorKFunction reflect = ReflectLambdaKt.reflect(functionBase);
        return reflect != null ? ReflectionObjectRenderer.renderLambda(reflect) : super.renderLambdaToString(functionBase);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType typeOf(KClass kClass, List list, boolean z) {
        if (!(kClass instanceof ClassBasedDeclarationContainer)) {
            return KClassifiers.createType(kClass, list, z, Collections.EMPTY_LIST);
        }
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        ConcurrentHashMapCache concurrentHashMapCache = CachesKt.K_CLASS_CACHE;
        jClass.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? (KType) CachesKt.CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.get(jClass) : (KType) CachesKt.CACHE_FOR_BASE_CLASSIFIERS.get(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) CachesKt.CACHE_FOR_GENERIC_CLASSIFIERS.get(jClass);
        Pair pair = new Pair(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            AbstractKType createType = KClassifiers.createType(CachesKt.getOrCreateKotlinClass(jClass), list, z, EmptyList.INSTANCE);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(pair, createType);
            obj = putIfAbsent == null ? createType : putIfAbsent;
        }
        return (KType) obj;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((FunctionBase) lambda);
    }
}
