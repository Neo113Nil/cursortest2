package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import com.google.android.play.core.integrity.o;
import com.google.crypto.tink.subtle.X25519;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.MarkerKt;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class KotlinKFunction extends KotlinKCallable implements FunctionBase, Function0, Function1, Function10, Function11, Function12, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function2, Function20, Function21, Function22, Function3, Function4, Function5, Function6, Function7, Function8, Function9, KCallable, ReflectKFunction {
    public final Lazy allParameters$delegate;
    public final Lazy caller$delegate;
    public final KDeclarationContainerImpl container;
    public final Lazy defaultCaller$delegate;
    public final Lazy parameters$delegate;
    public final Object rawBoundReceiver;
    public final String signature;

    public KotlinKFunction(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.signature = str;
        this.rawBoundReceiver = obj;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.allParameters$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKFunction$$Lambda$0
            public final KotlinKFunction arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GenericDeclaration findMethodBySignature;
                CallerImpl createStaticMethodCaller$1;
                GenericDeclaration findDefaultMethod;
                int i2 = i;
                boolean z = false;
                KotlinKFunction kotlinKFunction = this.arg$0;
                switch (i2) {
                    case 0:
                        KotlinKFunction kotlinKFunction2 = this.arg$0;
                        return X25519.computeParameters(kotlinKFunction2, kotlinKFunction2.getContextParameters(), kotlinKFunction2.getExtensionReceiverType(), kotlinKFunction2.getValueParameters(), kotlinKFunction2.getTypeParameterTable(), true);
                    case 1:
                        KotlinKFunction kotlinKFunction3 = this.arg$0;
                        return Room.isBound(kotlinKFunction3) ? X25519.computeParameters(kotlinKFunction3, kotlinKFunction3.getContextParameters(), kotlinKFunction3.getExtensionReceiverType(), kotlinKFunction3.getValueParameters(), kotlinKFunction3.getTypeParameterTable(), false) : kotlinKFunction3.getAllParameters();
                    case 2:
                        boolean isConstructor = Room.isConstructor(kotlinKFunction);
                        KDeclarationContainerImpl kDeclarationContainerImpl2 = kotlinKFunction.container;
                        if (!isConstructor && !(kDeclarationContainerImpl2 instanceof KPackageImpl)) {
                            Path$$ExternalSyntheticBUOutline0.m$3(kotlinKFunction, "Only constructors and top-level functions are supported for now: ");
                            return null;
                        }
                        JvmMethodSignature jvmSignature = kotlinKFunction.getJvmSignature();
                        if (!Room.isConstructor(kotlinKFunction) || ((kDeclarationContainerImpl2 instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl2).isValue())) {
                            findMethodBySignature = kDeclarationContainerImpl2.findMethodBySignature(jvmSignature.getName(), jvmSignature.getDescriptor());
                        } else {
                            if (Room.isAnnotationConstructor(kotlinKFunction)) {
                                Class jClass = kDeclarationContainerImpl2.getJClass();
                                List parameters = kotlinKFunction.getParameters();
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
                                Iterator it = parameters.iterator();
                                while (it.hasNext()) {
                                    String name = ((ReflectKParameter) it.next()).getName();
                                    name.getClass();
                                    arrayList.add(name);
                                }
                                AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.POSITIONAL_CALL;
                                AnnotationConstructorCaller.Origin origin = AnnotationConstructorCaller.Origin.JAVA;
                                return new AnnotationConstructorCaller(jClass, arrayList, callMode);
                            }
                            String descriptor = jvmSignature.getDescriptor();
                            kDeclarationContainerImpl2.getClass();
                            descriptor.getClass();
                            findMethodBySignature = KDeclarationContainerImpl.tryGetConstructor(UtilKt.parseAndLoadDescriptor(ReflectClassUtilKt.getSafeClassLoader(kDeclarationContainerImpl2.getJClass()), descriptor, false).getParameters(), kDeclarationContainerImpl2.getJClass());
                        }
                        if (findMethodBySignature instanceof Constructor) {
                            createStaticMethodCaller$1 = kotlinKFunction.createConstructorCaller((Constructor) findMethodBySignature, false);
                        } else {
                            if (!(findMethodBySignature instanceof Method)) {
                                f$$ExternalSyntheticLambda0.m$1(kotlinKFunction, "Could not compute caller for function: ");
                                return null;
                            }
                            createStaticMethodCaller$1 = kotlinKFunction.createStaticMethodCaller$1((Method) findMethodBySignature, false);
                        }
                        return MarkerKt.createValueClassAwareCallerIfNeeded(EmptyList.INSTANCE, kotlinKFunction, createStaticMethodCaller$1, false);
                    default:
                        boolean isConstructor2 = Room.isConstructor(kotlinKFunction);
                        KDeclarationContainerImpl kDeclarationContainerImpl3 = kotlinKFunction.container;
                        if (!isConstructor2 && !(kDeclarationContainerImpl3 instanceof KPackageImpl)) {
                            Path$$ExternalSyntheticBUOutline0.m$3(kotlinKFunction, "Only constructors and top-level functions are supported for now: ");
                            return null;
                        }
                        JvmMethodSignature jvmSignature2 = kotlinKFunction.getJvmSignature();
                        ArrayList arrayList2 = new ArrayList();
                        if (!Room.isConstructor(kotlinKFunction) || ((kDeclarationContainerImpl3 instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl3).isValue())) {
                            o patchJvmDescriptorByExtraBoxing = GoogleMapKt.patchJvmDescriptorByExtraBoxing(kotlinKFunction, jvmSignature2.getDescriptor());
                            arrayList2.addAll(patchJvmDescriptorByExtraBoxing.b);
                            String name2 = jvmSignature2.getName();
                            String str2 = patchJvmDescriptorByExtraBoxing.a;
                            Member member = kotlinKFunction.getCaller().getMember();
                            member.getClass();
                            boolean z2 = !Modifier.isStatic(member.getModifiers());
                            List allParameters = kotlinKFunction.getAllParameters();
                            if (!(allParameters instanceof Collection) || !allParameters.isEmpty()) {
                                Iterator it2 = allParameters.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((ReflectKParameter) it2.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                            findDefaultMethod = kDeclarationContainerImpl3.findDefaultMethod(name2, str2, z2, z);
                        } else {
                            if (Room.isAnnotationConstructor(kotlinKFunction)) {
                                Class jClass2 = kDeclarationContainerImpl3.getJClass();
                                List parameters2 = kotlinKFunction.getParameters();
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10));
                                Iterator it3 = parameters2.iterator();
                                while (it3.hasNext()) {
                                    String name3 = ((ReflectKParameter) it3.next()).getName();
                                    name3.getClass();
                                    arrayList3.add(name3);
                                }
                                AnnotationConstructorCaller.CallMode callMode2 = AnnotationConstructorCaller.CallMode.CALL_BY_NAME;
                                AnnotationConstructorCaller.Origin origin2 = AnnotationConstructorCaller.Origin.JAVA;
                                return new AnnotationConstructorCaller(jClass2, arrayList3, callMode2);
                            }
                            o patchJvmDescriptorByExtraBoxing2 = GoogleMapKt.patchJvmDescriptorByExtraBoxing(kotlinKFunction, kotlinKFunction.getJvmSignature().getDescriptor());
                            arrayList2.addAll(patchJvmDescriptorByExtraBoxing2.b);
                            findDefaultMethod = kDeclarationContainerImpl3.findDefaultConstructor(patchJvmDescriptorByExtraBoxing2.a);
                        }
                        CallerImpl createConstructorCaller = findDefaultMethod instanceof Constructor ? kotlinKFunction.createConstructorCaller((Constructor) findDefaultMethod, true) : findDefaultMethod instanceof Method ? kotlinKFunction.createStaticMethodCaller$1((Method) findDefaultMethod, kotlinKFunction.getCaller().isBoundInstanceCallWithValueClasses()) : null;
                        if (createConstructorCaller != null) {
                            return MarkerKt.createValueClassAwareCallerIfNeeded(arrayList2, kotlinKFunction, createConstructorCaller, true);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.parameters$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKFunction$$Lambda$0
            public final KotlinKFunction arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GenericDeclaration findMethodBySignature;
                CallerImpl createStaticMethodCaller$1;
                GenericDeclaration findDefaultMethod;
                int i22 = i2;
                boolean z = false;
                KotlinKFunction kotlinKFunction = this.arg$0;
                switch (i22) {
                    case 0:
                        KotlinKFunction kotlinKFunction2 = this.arg$0;
                        return X25519.computeParameters(kotlinKFunction2, kotlinKFunction2.getContextParameters(), kotlinKFunction2.getExtensionReceiverType(), kotlinKFunction2.getValueParameters(), kotlinKFunction2.getTypeParameterTable(), true);
                    case 1:
                        KotlinKFunction kotlinKFunction3 = this.arg$0;
                        return Room.isBound(kotlinKFunction3) ? X25519.computeParameters(kotlinKFunction3, kotlinKFunction3.getContextParameters(), kotlinKFunction3.getExtensionReceiverType(), kotlinKFunction3.getValueParameters(), kotlinKFunction3.getTypeParameterTable(), false) : kotlinKFunction3.getAllParameters();
                    case 2:
                        boolean isConstructor = Room.isConstructor(kotlinKFunction);
                        KDeclarationContainerImpl kDeclarationContainerImpl2 = kotlinKFunction.container;
                        if (!isConstructor && !(kDeclarationContainerImpl2 instanceof KPackageImpl)) {
                            Path$$ExternalSyntheticBUOutline0.m$3(kotlinKFunction, "Only constructors and top-level functions are supported for now: ");
                            return null;
                        }
                        JvmMethodSignature jvmSignature = kotlinKFunction.getJvmSignature();
                        if (!Room.isConstructor(kotlinKFunction) || ((kDeclarationContainerImpl2 instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl2).isValue())) {
                            findMethodBySignature = kDeclarationContainerImpl2.findMethodBySignature(jvmSignature.getName(), jvmSignature.getDescriptor());
                        } else {
                            if (Room.isAnnotationConstructor(kotlinKFunction)) {
                                Class jClass = kDeclarationContainerImpl2.getJClass();
                                List parameters = kotlinKFunction.getParameters();
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
                                Iterator it = parameters.iterator();
                                while (it.hasNext()) {
                                    String name = ((ReflectKParameter) it.next()).getName();
                                    name.getClass();
                                    arrayList.add(name);
                                }
                                AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.POSITIONAL_CALL;
                                AnnotationConstructorCaller.Origin origin = AnnotationConstructorCaller.Origin.JAVA;
                                return new AnnotationConstructorCaller(jClass, arrayList, callMode);
                            }
                            String descriptor = jvmSignature.getDescriptor();
                            kDeclarationContainerImpl2.getClass();
                            descriptor.getClass();
                            findMethodBySignature = KDeclarationContainerImpl.tryGetConstructor(UtilKt.parseAndLoadDescriptor(ReflectClassUtilKt.getSafeClassLoader(kDeclarationContainerImpl2.getJClass()), descriptor, false).getParameters(), kDeclarationContainerImpl2.getJClass());
                        }
                        if (findMethodBySignature instanceof Constructor) {
                            createStaticMethodCaller$1 = kotlinKFunction.createConstructorCaller((Constructor) findMethodBySignature, false);
                        } else {
                            if (!(findMethodBySignature instanceof Method)) {
                                f$$ExternalSyntheticLambda0.m$1(kotlinKFunction, "Could not compute caller for function: ");
                                return null;
                            }
                            createStaticMethodCaller$1 = kotlinKFunction.createStaticMethodCaller$1((Method) findMethodBySignature, false);
                        }
                        return MarkerKt.createValueClassAwareCallerIfNeeded(EmptyList.INSTANCE, kotlinKFunction, createStaticMethodCaller$1, false);
                    default:
                        boolean isConstructor2 = Room.isConstructor(kotlinKFunction);
                        KDeclarationContainerImpl kDeclarationContainerImpl3 = kotlinKFunction.container;
                        if (!isConstructor2 && !(kDeclarationContainerImpl3 instanceof KPackageImpl)) {
                            Path$$ExternalSyntheticBUOutline0.m$3(kotlinKFunction, "Only constructors and top-level functions are supported for now: ");
                            return null;
                        }
                        JvmMethodSignature jvmSignature2 = kotlinKFunction.getJvmSignature();
                        ArrayList arrayList2 = new ArrayList();
                        if (!Room.isConstructor(kotlinKFunction) || ((kDeclarationContainerImpl3 instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl3).isValue())) {
                            o patchJvmDescriptorByExtraBoxing = GoogleMapKt.patchJvmDescriptorByExtraBoxing(kotlinKFunction, jvmSignature2.getDescriptor());
                            arrayList2.addAll(patchJvmDescriptorByExtraBoxing.b);
                            String name2 = jvmSignature2.getName();
                            String str2 = patchJvmDescriptorByExtraBoxing.a;
                            Member member = kotlinKFunction.getCaller().getMember();
                            member.getClass();
                            boolean z2 = !Modifier.isStatic(member.getModifiers());
                            List allParameters = kotlinKFunction.getAllParameters();
                            if (!(allParameters instanceof Collection) || !allParameters.isEmpty()) {
                                Iterator it2 = allParameters.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((ReflectKParameter) it2.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                            findDefaultMethod = kDeclarationContainerImpl3.findDefaultMethod(name2, str2, z2, z);
                        } else {
                            if (Room.isAnnotationConstructor(kotlinKFunction)) {
                                Class jClass2 = kDeclarationContainerImpl3.getJClass();
                                List parameters2 = kotlinKFunction.getParameters();
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10));
                                Iterator it3 = parameters2.iterator();
                                while (it3.hasNext()) {
                                    String name3 = ((ReflectKParameter) it3.next()).getName();
                                    name3.getClass();
                                    arrayList3.add(name3);
                                }
                                AnnotationConstructorCaller.CallMode callMode2 = AnnotationConstructorCaller.CallMode.CALL_BY_NAME;
                                AnnotationConstructorCaller.Origin origin2 = AnnotationConstructorCaller.Origin.JAVA;
                                return new AnnotationConstructorCaller(jClass2, arrayList3, callMode2);
                            }
                            o patchJvmDescriptorByExtraBoxing2 = GoogleMapKt.patchJvmDescriptorByExtraBoxing(kotlinKFunction, kotlinKFunction.getJvmSignature().getDescriptor());
                            arrayList2.addAll(patchJvmDescriptorByExtraBoxing2.b);
                            findDefaultMethod = kDeclarationContainerImpl3.findDefaultConstructor(patchJvmDescriptorByExtraBoxing2.a);
                        }
                        CallerImpl createConstructorCaller = findDefaultMethod instanceof Constructor ? kotlinKFunction.createConstructorCaller((Constructor) findDefaultMethod, true) : findDefaultMethod instanceof Method ? kotlinKFunction.createStaticMethodCaller$1((Method) findDefaultMethod, kotlinKFunction.getCaller().isBoundInstanceCallWithValueClasses()) : null;
                        if (createConstructorCaller != null) {
                            return MarkerKt.createValueClassAwareCallerIfNeeded(arrayList2, kotlinKFunction, createConstructorCaller, true);
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.caller$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKFunction$$Lambda$0
            public final KotlinKFunction arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GenericDeclaration findMethodBySignature;
                CallerImpl createStaticMethodCaller$1;
                GenericDeclaration findDefaultMethod;
                int i22 = i3;
                boolean z = false;
                KotlinKFunction kotlinKFunction = this.arg$0;
                switch (i22) {
                    case 0:
                        KotlinKFunction kotlinKFunction2 = this.arg$0;
                        return X25519.computeParameters(kotlinKFunction2, kotlinKFunction2.getContextParameters(), kotlinKFunction2.getExtensionReceiverType(), kotlinKFunction2.getValueParameters(), kotlinKFunction2.getTypeParameterTable(), true);
                    case 1:
                        KotlinKFunction kotlinKFunction3 = this.arg$0;
                        return Room.isBound(kotlinKFunction3) ? X25519.computeParameters(kotlinKFunction3, kotlinKFunction3.getContextParameters(), kotlinKFunction3.getExtensionReceiverType(), kotlinKFunction3.getValueParameters(), kotlinKFunction3.getTypeParameterTable(), false) : kotlinKFunction3.getAllParameters();
                    case 2:
                        boolean isConstructor = Room.isConstructor(kotlinKFunction);
                        KDeclarationContainerImpl kDeclarationContainerImpl2 = kotlinKFunction.container;
                        if (!isConstructor && !(kDeclarationContainerImpl2 instanceof KPackageImpl)) {
                            Path$$ExternalSyntheticBUOutline0.m$3(kotlinKFunction, "Only constructors and top-level functions are supported for now: ");
                            return null;
                        }
                        JvmMethodSignature jvmSignature = kotlinKFunction.getJvmSignature();
                        if (!Room.isConstructor(kotlinKFunction) || ((kDeclarationContainerImpl2 instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl2).isValue())) {
                            findMethodBySignature = kDeclarationContainerImpl2.findMethodBySignature(jvmSignature.getName(), jvmSignature.getDescriptor());
                        } else {
                            if (Room.isAnnotationConstructor(kotlinKFunction)) {
                                Class jClass = kDeclarationContainerImpl2.getJClass();
                                List parameters = kotlinKFunction.getParameters();
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
                                Iterator it = parameters.iterator();
                                while (it.hasNext()) {
                                    String name = ((ReflectKParameter) it.next()).getName();
                                    name.getClass();
                                    arrayList.add(name);
                                }
                                AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.POSITIONAL_CALL;
                                AnnotationConstructorCaller.Origin origin = AnnotationConstructorCaller.Origin.JAVA;
                                return new AnnotationConstructorCaller(jClass, arrayList, callMode);
                            }
                            String descriptor = jvmSignature.getDescriptor();
                            kDeclarationContainerImpl2.getClass();
                            descriptor.getClass();
                            findMethodBySignature = KDeclarationContainerImpl.tryGetConstructor(UtilKt.parseAndLoadDescriptor(ReflectClassUtilKt.getSafeClassLoader(kDeclarationContainerImpl2.getJClass()), descriptor, false).getParameters(), kDeclarationContainerImpl2.getJClass());
                        }
                        if (findMethodBySignature instanceof Constructor) {
                            createStaticMethodCaller$1 = kotlinKFunction.createConstructorCaller((Constructor) findMethodBySignature, false);
                        } else {
                            if (!(findMethodBySignature instanceof Method)) {
                                f$$ExternalSyntheticLambda0.m$1(kotlinKFunction, "Could not compute caller for function: ");
                                return null;
                            }
                            createStaticMethodCaller$1 = kotlinKFunction.createStaticMethodCaller$1((Method) findMethodBySignature, false);
                        }
                        return MarkerKt.createValueClassAwareCallerIfNeeded(EmptyList.INSTANCE, kotlinKFunction, createStaticMethodCaller$1, false);
                    default:
                        boolean isConstructor2 = Room.isConstructor(kotlinKFunction);
                        KDeclarationContainerImpl kDeclarationContainerImpl3 = kotlinKFunction.container;
                        if (!isConstructor2 && !(kDeclarationContainerImpl3 instanceof KPackageImpl)) {
                            Path$$ExternalSyntheticBUOutline0.m$3(kotlinKFunction, "Only constructors and top-level functions are supported for now: ");
                            return null;
                        }
                        JvmMethodSignature jvmSignature2 = kotlinKFunction.getJvmSignature();
                        ArrayList arrayList2 = new ArrayList();
                        if (!Room.isConstructor(kotlinKFunction) || ((kDeclarationContainerImpl3 instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl3).isValue())) {
                            o patchJvmDescriptorByExtraBoxing = GoogleMapKt.patchJvmDescriptorByExtraBoxing(kotlinKFunction, jvmSignature2.getDescriptor());
                            arrayList2.addAll(patchJvmDescriptorByExtraBoxing.b);
                            String name2 = jvmSignature2.getName();
                            String str2 = patchJvmDescriptorByExtraBoxing.a;
                            Member member = kotlinKFunction.getCaller().getMember();
                            member.getClass();
                            boolean z2 = !Modifier.isStatic(member.getModifiers());
                            List allParameters = kotlinKFunction.getAllParameters();
                            if (!(allParameters instanceof Collection) || !allParameters.isEmpty()) {
                                Iterator it2 = allParameters.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((ReflectKParameter) it2.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                            findDefaultMethod = kDeclarationContainerImpl3.findDefaultMethod(name2, str2, z2, z);
                        } else {
                            if (Room.isAnnotationConstructor(kotlinKFunction)) {
                                Class jClass2 = kDeclarationContainerImpl3.getJClass();
                                List parameters2 = kotlinKFunction.getParameters();
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10));
                                Iterator it3 = parameters2.iterator();
                                while (it3.hasNext()) {
                                    String name3 = ((ReflectKParameter) it3.next()).getName();
                                    name3.getClass();
                                    arrayList3.add(name3);
                                }
                                AnnotationConstructorCaller.CallMode callMode2 = AnnotationConstructorCaller.CallMode.CALL_BY_NAME;
                                AnnotationConstructorCaller.Origin origin2 = AnnotationConstructorCaller.Origin.JAVA;
                                return new AnnotationConstructorCaller(jClass2, arrayList3, callMode2);
                            }
                            o patchJvmDescriptorByExtraBoxing2 = GoogleMapKt.patchJvmDescriptorByExtraBoxing(kotlinKFunction, kotlinKFunction.getJvmSignature().getDescriptor());
                            arrayList2.addAll(patchJvmDescriptorByExtraBoxing2.b);
                            findDefaultMethod = kDeclarationContainerImpl3.findDefaultConstructor(patchJvmDescriptorByExtraBoxing2.a);
                        }
                        CallerImpl createConstructorCaller = findDefaultMethod instanceof Constructor ? kotlinKFunction.createConstructorCaller((Constructor) findDefaultMethod, true) : findDefaultMethod instanceof Method ? kotlinKFunction.createStaticMethodCaller$1((Method) findDefaultMethod, kotlinKFunction.getCaller().isBoundInstanceCallWithValueClasses()) : null;
                        if (createConstructorCaller != null) {
                            return MarkerKt.createValueClassAwareCallerIfNeeded(arrayList2, kotlinKFunction, createConstructorCaller, true);
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.defaultCaller$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKFunction$$Lambda$0
            public final KotlinKFunction arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GenericDeclaration findMethodBySignature;
                CallerImpl createStaticMethodCaller$1;
                GenericDeclaration findDefaultMethod;
                int i22 = i4;
                boolean z = false;
                KotlinKFunction kotlinKFunction = this.arg$0;
                switch (i22) {
                    case 0:
                        KotlinKFunction kotlinKFunction2 = this.arg$0;
                        return X25519.computeParameters(kotlinKFunction2, kotlinKFunction2.getContextParameters(), kotlinKFunction2.getExtensionReceiverType(), kotlinKFunction2.getValueParameters(), kotlinKFunction2.getTypeParameterTable(), true);
                    case 1:
                        KotlinKFunction kotlinKFunction3 = this.arg$0;
                        return Room.isBound(kotlinKFunction3) ? X25519.computeParameters(kotlinKFunction3, kotlinKFunction3.getContextParameters(), kotlinKFunction3.getExtensionReceiverType(), kotlinKFunction3.getValueParameters(), kotlinKFunction3.getTypeParameterTable(), false) : kotlinKFunction3.getAllParameters();
                    case 2:
                        boolean isConstructor = Room.isConstructor(kotlinKFunction);
                        KDeclarationContainerImpl kDeclarationContainerImpl2 = kotlinKFunction.container;
                        if (!isConstructor && !(kDeclarationContainerImpl2 instanceof KPackageImpl)) {
                            Path$$ExternalSyntheticBUOutline0.m$3(kotlinKFunction, "Only constructors and top-level functions are supported for now: ");
                            return null;
                        }
                        JvmMethodSignature jvmSignature = kotlinKFunction.getJvmSignature();
                        if (!Room.isConstructor(kotlinKFunction) || ((kDeclarationContainerImpl2 instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl2).isValue())) {
                            findMethodBySignature = kDeclarationContainerImpl2.findMethodBySignature(jvmSignature.getName(), jvmSignature.getDescriptor());
                        } else {
                            if (Room.isAnnotationConstructor(kotlinKFunction)) {
                                Class jClass = kDeclarationContainerImpl2.getJClass();
                                List parameters = kotlinKFunction.getParameters();
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
                                Iterator it = parameters.iterator();
                                while (it.hasNext()) {
                                    String name = ((ReflectKParameter) it.next()).getName();
                                    name.getClass();
                                    arrayList.add(name);
                                }
                                AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.POSITIONAL_CALL;
                                AnnotationConstructorCaller.Origin origin = AnnotationConstructorCaller.Origin.JAVA;
                                return new AnnotationConstructorCaller(jClass, arrayList, callMode);
                            }
                            String descriptor = jvmSignature.getDescriptor();
                            kDeclarationContainerImpl2.getClass();
                            descriptor.getClass();
                            findMethodBySignature = KDeclarationContainerImpl.tryGetConstructor(UtilKt.parseAndLoadDescriptor(ReflectClassUtilKt.getSafeClassLoader(kDeclarationContainerImpl2.getJClass()), descriptor, false).getParameters(), kDeclarationContainerImpl2.getJClass());
                        }
                        if (findMethodBySignature instanceof Constructor) {
                            createStaticMethodCaller$1 = kotlinKFunction.createConstructorCaller((Constructor) findMethodBySignature, false);
                        } else {
                            if (!(findMethodBySignature instanceof Method)) {
                                f$$ExternalSyntheticLambda0.m$1(kotlinKFunction, "Could not compute caller for function: ");
                                return null;
                            }
                            createStaticMethodCaller$1 = kotlinKFunction.createStaticMethodCaller$1((Method) findMethodBySignature, false);
                        }
                        return MarkerKt.createValueClassAwareCallerIfNeeded(EmptyList.INSTANCE, kotlinKFunction, createStaticMethodCaller$1, false);
                    default:
                        boolean isConstructor2 = Room.isConstructor(kotlinKFunction);
                        KDeclarationContainerImpl kDeclarationContainerImpl3 = kotlinKFunction.container;
                        if (!isConstructor2 && !(kDeclarationContainerImpl3 instanceof KPackageImpl)) {
                            Path$$ExternalSyntheticBUOutline0.m$3(kotlinKFunction, "Only constructors and top-level functions are supported for now: ");
                            return null;
                        }
                        JvmMethodSignature jvmSignature2 = kotlinKFunction.getJvmSignature();
                        ArrayList arrayList2 = new ArrayList();
                        if (!Room.isConstructor(kotlinKFunction) || ((kDeclarationContainerImpl3 instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl3).isValue())) {
                            o patchJvmDescriptorByExtraBoxing = GoogleMapKt.patchJvmDescriptorByExtraBoxing(kotlinKFunction, jvmSignature2.getDescriptor());
                            arrayList2.addAll(patchJvmDescriptorByExtraBoxing.b);
                            String name2 = jvmSignature2.getName();
                            String str2 = patchJvmDescriptorByExtraBoxing.a;
                            Member member = kotlinKFunction.getCaller().getMember();
                            member.getClass();
                            boolean z2 = !Modifier.isStatic(member.getModifiers());
                            List allParameters = kotlinKFunction.getAllParameters();
                            if (!(allParameters instanceof Collection) || !allParameters.isEmpty()) {
                                Iterator it2 = allParameters.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((ReflectKParameter) it2.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                            findDefaultMethod = kDeclarationContainerImpl3.findDefaultMethod(name2, str2, z2, z);
                        } else {
                            if (Room.isAnnotationConstructor(kotlinKFunction)) {
                                Class jClass2 = kDeclarationContainerImpl3.getJClass();
                                List parameters2 = kotlinKFunction.getParameters();
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10));
                                Iterator it3 = parameters2.iterator();
                                while (it3.hasNext()) {
                                    String name3 = ((ReflectKParameter) it3.next()).getName();
                                    name3.getClass();
                                    arrayList3.add(name3);
                                }
                                AnnotationConstructorCaller.CallMode callMode2 = AnnotationConstructorCaller.CallMode.CALL_BY_NAME;
                                AnnotationConstructorCaller.Origin origin2 = AnnotationConstructorCaller.Origin.JAVA;
                                return new AnnotationConstructorCaller(jClass2, arrayList3, callMode2);
                            }
                            o patchJvmDescriptorByExtraBoxing2 = GoogleMapKt.patchJvmDescriptorByExtraBoxing(kotlinKFunction, kotlinKFunction.getJvmSignature().getDescriptor());
                            arrayList2.addAll(patchJvmDescriptorByExtraBoxing2.b);
                            findDefaultMethod = kDeclarationContainerImpl3.findDefaultConstructor(patchJvmDescriptorByExtraBoxing2.a);
                        }
                        CallerImpl createConstructorCaller = findDefaultMethod instanceof Constructor ? kotlinKFunction.createConstructorCaller((Constructor) findDefaultMethod, true) : findDefaultMethod instanceof Method ? kotlinKFunction.createStaticMethodCaller$1((Method) findDefaultMethod, kotlinKFunction.getCaller().isBoundInstanceCallWithValueClasses()) : null;
                        if (createConstructorCaller != null) {
                            return MarkerKt.createValueClassAwareCallerIfNeeded(arrayList2, kotlinKFunction, createConstructorCaller, true);
                        }
                        return null;
                }
            }
        });
    }

    public final CallerImpl createConstructorCaller(Constructor constructor, boolean z) {
        if (!z && (this instanceof KotlinKConstructor)) {
            KotlinKConstructor kotlinKConstructor = (KotlinKConstructor) this;
            if (kotlinKConstructor.getVisibility() != KVisibility.PRIVATE) {
                List parameters = kotlinKConstructor.getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        KClass jvmErasure = KTypesJvm.getJvmErasure(((ReflectKParameter) it.next()).getType());
                        if (jvmErasure.isValue() && !jvmErasure.equals(Reflection.factory.getOrCreateKotlinClass(Result.class))) {
                            return Room.isBound(this) ? new CallerImpl.BoundConstructor(constructor, Room.getBoundReceiver(this), 1) : new CallerImpl.Constructor(constructor, 1);
                        }
                    }
                }
            }
        }
        return Room.isBound(this) ? new CallerImpl.BoundConstructor(constructor, Room.getBoundReceiver(this), 0) : new CallerImpl.Constructor(constructor, 0);
    }

    public final CallerImpl.Method createStaticMethodCaller$1(Method method, boolean z) {
        if (!Room.isBound(this)) {
            return new CallerImpl.Method.Static(6, 0, method, false);
        }
        if (this.container instanceof KPackageImpl) {
            return new CallerImpl.Method.BoundStatic(method, z, Room.getBoundReceiver(this));
        }
        Path$$ExternalSyntheticBUOutline0.m$3(this, "Only top-level functions are supported for now: ");
        return null;
    }

    public final boolean equals(Object obj) {
        ReflectKFunction reflectKFunction;
        FqName fqName = UtilKt.JVM_STATIC;
        if (obj instanceof ReflectKFunction) {
            reflectKFunction = (ReflectKFunction) obj;
        } else {
            if (obj instanceof FunctionReference) {
                KCallable compute = ((FunctionReference) obj).compute();
                if (compute instanceof ReflectKFunction) {
                    reflectKFunction = (ReflectKFunction) compute;
                }
            }
            reflectKFunction = null;
        }
        return reflectKFunction != null && Intrinsics.areEqual(this.container, reflectKFunction.getContainer()) && Intrinsics.areEqual(getName(), reflectKFunction.getName()) && Intrinsics.areEqual(this.signature, reflectKFunction.getSignature()) && Intrinsics.areEqual(this.rawBoundReceiver, reflectKFunction.getRawBoundReceiver());
    }

    @Override // kotlin.jvm.internal.KotlinGenericDeclaration
    public final GenericDeclaration findJavaDeclaration() {
        return KotlinGenericDeclarationKt.findMethodBySignature(this.container, this.signature);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final List getAllParameters() {
        return (List) this.allParameters$delegate.getValue();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        Member member = getCaller().getMember();
        AnnotatedElement annotatedElement = member instanceof AnnotatedElement ? (AnnotatedElement) member : null;
        if (annotatedElement == null) {
            return EmptyList.INSTANCE;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return UtilKt.unwrapKotlinRepeatableAnnotations(ArraysKt___ArraysKt.toList(annotations));
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        Caller caller = getCaller();
        caller.getClass();
        return caller.getParameterTypes().size();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Caller getCaller() {
        return (Caller) this.caller$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    public abstract List getContextParameters();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Caller getDefaultCaller() {
        return (Caller) this.defaultCaller$delegate.getValue();
    }

    public abstract KmType getExtensionReceiverType();

    public abstract JvmMethodSignature getJvmSignature();

    @Override // kotlin.reflect.KCallable
    public final List getParameters() {
        return (List) this.parameters$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKFunction
    public final String getSignature() {
        return this.signature;
    }

    public abstract TypeParameterTable getTypeParameterTable();

    @Override // kotlin.reflect.KCallable
    public final List getTypeParameters() {
        return getTypeParameterTable().ownTypeParameters;
    }

    public abstract List getValueParameters();

    public final int hashCode() {
        return this.signature.hashCode() + ((getName().hashCode() + (this.container.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    public final String toString() {
        return ReflectionObjectRenderer.renderFunction(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, serializable);
    }

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, serializable);
    }

    @Override // kotlin.jvm.functions.Function15
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Serializable serializable) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, serializable);
    }
}
