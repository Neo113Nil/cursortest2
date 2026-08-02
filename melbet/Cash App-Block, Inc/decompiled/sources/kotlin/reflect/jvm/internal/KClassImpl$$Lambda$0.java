package kotlin.reflect.jvm.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class KClassImpl$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final KClassImpl arg$0;

    public /* synthetic */ KClassImpl$$Lambda$0(KClassImpl kClassImpl, int i) {
        this.$r8$classId = i;
        this.arg$0 = kClassImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KotlinClassHeader classHeader;
        ?? arrayList;
        int i = this.$r8$classId;
        KClassImpl kClassImpl = this.arg$0;
        switch (i) {
            case 0:
                return kClassImpl.new Data();
            case 1:
                return KClassImpl.access$getMembers(kClassImpl, kClassImpl.getDescriptor().getDefaultType().getMemberScope(), KClassImpl.MemberBelonginess.DECLARED);
            case 2:
                MemberScope staticScope = kClassImpl.getDescriptor().getStaticScope();
                staticScope.getClass();
                return KClassImpl.access$getMembers(kClassImpl, staticScope, KClassImpl.MemberBelonginess.DECLARED);
            case 3:
                return KClassImpl.access$getMembers(kClassImpl, kClassImpl.getDescriptor().getDefaultType().getMemberScope(), KClassImpl.MemberBelonginess.INHERITED);
            case 4:
                MemberScope staticScope2 = kClassImpl.getDescriptor().getStaticScope();
                staticScope2.getClass();
                return KClassImpl.access$getMembers(kClassImpl, staticScope2, KClassImpl.MemberBelonginess.INHERITED);
            case 5:
                HashSet hashSet = KClassImpl.SPECIAL_JVM_ANNOTATION_NAMES;
                ClassId classId = kClassImpl.getClassId();
                Class<?> cls = kClassImpl.jClass;
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((KClassImpl.Data) kClassImpl.data.getValue()).moduleData$delegate;
                KProperty kProperty = KDeclarationContainerImpl.Data.$$delegatedProperties[0];
                Object invoke = reflectProperties$LazySoftVal.invoke();
                invoke.getClass();
                RuntimeModuleData runtimeModuleData = (RuntimeModuleData) invoke;
                ClassDescriptor deserializeClass = (classId.isLocal() && cls.isAnnotationPresent(Metadata.class)) ? runtimeModuleData.getDeserialization().deserializeClass(classId) : FindClassInModuleKt.findClassAcrossModuleDependencies(runtimeModuleData.getModule(), classId);
                if (deserializeClass != null) {
                    return deserializeClass;
                }
                if (cls.isSynthetic()) {
                    return KClassImpl.createSyntheticClass(classId, runtimeModuleData);
                }
                ReflectKotlinClass create = ReflectKotlinClass.Factory.create(cls);
                KotlinClassHeader.Kind kind = (create == null || (classHeader = create.getClassHeader()) == null) ? null : classHeader.getKind();
                switch (kind != null ? KClassImpl.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()] : -1) {
                    case -1:
                    case 6:
                        f$$ExternalSyntheticLambda0.m$2("Unresolved class: ", cls, " (kind = ", kind);
                        return null;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return KClassImpl.createSyntheticClass(classId, runtimeModuleData);
                    case 5:
                        f$$ExternalSyntheticLambda0.m$2("Unknown class: ", cls, " (kind = ", kind);
                        return null;
                }
            case 6:
                return FakeOverridesKt.computeFakeOverrideMembers(kClassImpl);
            case 7:
                Class cls2 = kClassImpl.jClass;
                Annotation[] annotations = cls2.getAnnotations();
                if (annotations.length != cls2.getDeclaredAnnotations().length) {
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Class cls3 = cls2;
                    do {
                        Annotation[] declaredAnnotations = cls3.getDeclaredAnnotations();
                        for (int length = declaredAnnotations.length - 1; -1 < length; length--) {
                            Annotation annotation = declaredAnnotations[length];
                            if (!KClassImpl.SPECIAL_JVM_ANNOTATION_NAMES.contains(PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation)).getName()) && (cls3 == cls2 || (UtilKt.hasInherited(annotation) && !UtilKt.isRepeatableContainerForNonInheritedAnnotation(annotation)))) {
                                KClass unwrappedAnnotationClass = UtilKt.getUnwrappedAnnotationClass(annotation);
                                Class cls4 = (Class) linkedHashMap.get(unwrappedAnnotationClass);
                                if (cls4 == null) {
                                    linkedHashMap.put(unwrappedAnnotationClass, cls3);
                                }
                                if (cls4 == null || cls4.equals(cls3)) {
                                    arrayList2.add(annotation);
                                }
                            }
                        }
                        cls3 = cls3.getSuperclass();
                    } while (cls3 != null);
                    arrayList = CollectionsKt.reversed(arrayList2);
                } else {
                    arrayList = new ArrayList();
                    for (Annotation annotation2 : annotations) {
                        if (!KClassImpl.SPECIAL_JVM_ANNOTATION_NAMES.contains(PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation2)).getName())) {
                            arrayList.add(annotation2);
                        }
                    }
                }
                return UtilKt.unwrapKotlinRepeatableAnnotations(arrayList);
            case 8:
                Class cls5 = kClassImpl.jClass;
                if (cls5.isAnonymousClass()) {
                    return null;
                }
                ClassId classId2 = kClassImpl.getClassId();
                if (!classId2.isLocal()) {
                    String asString = classId2.getShortClassName().asString();
                    asString.getClass();
                    return asString;
                }
                String simpleName = cls5.getSimpleName();
                Method enclosingMethod = cls5.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return StringsKt.substringAfter(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls5.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return StringsKt.substringAfter('$', simpleName, simpleName);
                }
                return StringsKt.substringAfter(simpleName, enclosingConstructor.getName() + '$', simpleName);
            default:
                if (kClassImpl.jClass.isAnonymousClass()) {
                    return null;
                }
                ClassId classId3 = kClassImpl.getClassId();
                if (classId3.isLocal()) {
                    return null;
                }
                return classId3.asSingleFqName().asString();
        }
    }

    public /* synthetic */ KClassImpl$$Lambda$0(KClassImpl kClassImpl, KClassImpl.Data data, int i) {
        this.$r8$classId = i;
        this.arg$0 = kClassImpl;
    }
}
