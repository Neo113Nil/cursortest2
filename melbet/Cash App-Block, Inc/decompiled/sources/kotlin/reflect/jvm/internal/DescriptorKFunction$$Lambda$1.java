package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import com.google.android.play.core.integrity.o;
import com.google.crypto.tink.subtle.Bytes;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.MarkerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KCallables;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class DescriptorKFunction$$Lambda$1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final DescriptorKFunction arg$0;

    public /* synthetic */ DescriptorKFunction$$Lambda$1(DescriptorKFunction descriptorKFunction, int i) {
        this.$r8$classId = i;
        this.arg$0 = descriptorKFunction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        CallerImpl createStaticMethodCaller;
        CallerImpl boundJvmStaticInObject;
        GenericDeclaration genericDeclaration;
        CallerImpl callerImpl;
        Object obj2;
        ReflectKFunction reflectKFunction;
        int i = this.$r8$classId;
        DescriptorKFunction descriptorKFunction = this.arg$0;
        switch (i) {
            case 0:
                ClassId classId = RuntimeTypeMapper.JAVA_LANG_VOID;
                FunctionDescriptor descriptor = descriptorKFunction.getDescriptor();
                KDeclarationContainerImpl kDeclarationContainerImpl = descriptorKFunction.container;
                Bytes mapSignature = RuntimeTypeMapper.mapSignature(descriptor);
                if (mapSignature instanceof JvmFunctionSignature$KotlinConstructor) {
                    if (Room.isAnnotationConstructor(descriptorKFunction)) {
                        Class jClass = kDeclarationContainerImpl.getJClass();
                        List parameters = descriptorKFunction.getParameters();
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
                    String desc = ((JvmFunctionSignature$KotlinConstructor) mapSignature).signature.getDesc();
                    kDeclarationContainerImpl.getClass();
                    desc.getClass();
                    obj = KDeclarationContainerImpl.tryGetConstructor(UtilKt.parseAndLoadDescriptor(ReflectClassUtilKt.getSafeClassLoader(kDeclarationContainerImpl.getJClass()), desc, false).getParameters(), kDeclarationContainerImpl.getJClass());
                } else if (mapSignature instanceof JvmFunctionSignature$KotlinFunction) {
                    JvmMemberSignature.Method method = ((JvmFunctionSignature$KotlinFunction) mapSignature).signature;
                    obj = kDeclarationContainerImpl.findMethodBySignature(method.getName(), method.getDesc());
                } else if (mapSignature instanceof JvmFunctionSignature$JavaMethod) {
                    obj = ((JvmFunctionSignature$JavaMethod) mapSignature).method;
                } else {
                    if (!(mapSignature instanceof JvmFunctionSignature$JavaConstructor)) {
                        if (!(mapSignature instanceof JvmFunctionSignature$FakeJavaAnnotationConstructor)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        List list = ((JvmFunctionSignature$FakeJavaAnnotationConstructor) mapSignature).methods;
                        Class jClass2 = kDeclarationContainerImpl.getJClass();
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new AnnotationConstructorCaller(jClass2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, list);
                    }
                    obj = ((JvmFunctionSignature$JavaConstructor) mapSignature).constructor;
                    obj.getClass();
                }
                if (obj instanceof Constructor) {
                    createStaticMethodCaller = descriptorKFunction.createConstructorCaller((Constructor) obj, descriptorKFunction.getDescriptor(), false);
                } else {
                    if (!(obj instanceof Method)) {
                        throw new KotlinReflectionInternalError("Could not compute caller for function: " + descriptorKFunction.getDescriptor() + " (member = " + obj + ')');
                    }
                    Method method2 = (Method) obj;
                    if (!Modifier.isStatic(method2.getModifiers())) {
                        boundJvmStaticInObject = Room.isBound(descriptorKFunction) ? new CallerImpl.Method.BoundInstance(method2, Room.getBoundReceiver(descriptorKFunction)) : new CallerImpl.Method.Static(6, 1, method2, false);
                    } else if (descriptorKFunction.getDescriptor().getAnnotations().mo4143findAnnotation(UtilKt.JVM_STATIC) == null) {
                        createStaticMethodCaller = descriptorKFunction.createStaticMethodCaller(method2, false);
                    } else if (Room.isBound(descriptorKFunction)) {
                        boundJvmStaticInObject = new CallerImpl.Method.BoundJvmStaticInObject(method2, false, 4);
                    } else {
                        createStaticMethodCaller = new CallerImpl.Method.Static(4, 2, method2, true);
                    }
                    createStaticMethodCaller = boundJvmStaticInObject;
                }
                return MarkerKt.createValueClassAwareCallerIfNeeded(EmptyList.INSTANCE, descriptorKFunction, createStaticMethodCaller, false);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                ClassId classId2 = RuntimeTypeMapper.JAVA_LANG_VOID;
                FunctionDescriptor descriptor2 = descriptorKFunction.getDescriptor();
                KDeclarationContainerImpl kDeclarationContainerImpl2 = descriptorKFunction.container;
                Bytes mapSignature2 = RuntimeTypeMapper.mapSignature(descriptor2);
                if (mapSignature2 instanceof JvmFunctionSignature$KotlinFunction) {
                    ArrayList valueParameters = KCallables.getValueParameters(descriptorKFunction);
                    if (!valueParameters.isEmpty()) {
                        Iterator it3 = valueParameters.iterator();
                        while (it3.hasNext()) {
                            ReflectKParameter reflectKParameter = (ReflectKParameter) it3.next();
                            if (reflectKParameter == null) {
                                reflectKParameter = null;
                            }
                            if (reflectKParameter != null && reflectKParameter.getDeclaresDefaultValue()) {
                                reflectKFunction = null;
                                if (reflectKFunction != null) {
                                    String substringBefore$default = StringsKt.substringBefore$default(reflectKFunction.getSignature(), '(');
                                    o patchJvmDescriptorByExtraBoxing = GoogleMapKt.patchJvmDescriptorByExtraBoxing(reflectKFunction, reflectKFunction.getSignature().substring(substringBefore$default.length()));
                                    arrayList3.addAll(patchJvmDescriptorByExtraBoxing.b);
                                    genericDeclaration = kDeclarationContainerImpl2.findDefaultMethod(substringBefore$default, patchJvmDescriptorByExtraBoxing.a, true, descriptorKFunction.getDescriptor().getExtensionReceiverParameter() != null);
                                } else {
                                    JvmMemberSignature.Method method3 = ((JvmFunctionSignature$KotlinFunction) mapSignature2).signature;
                                    o patchJvmDescriptorByExtraBoxing2 = GoogleMapKt.patchJvmDescriptorByExtraBoxing(descriptorKFunction, method3.getDesc());
                                    arrayList3.addAll(patchJvmDescriptorByExtraBoxing2.b);
                                    String name2 = method3.getName();
                                    String str = patchJvmDescriptorByExtraBoxing2.a;
                                    descriptorKFunction.getCaller().getMember().getClass();
                                    genericDeclaration = kDeclarationContainerImpl2.findDefaultMethod(name2, str, !Modifier.isStatic(r9.getModifiers()), descriptorKFunction.getDescriptor().getExtensionReceiverParameter() != null);
                                }
                            }
                        }
                    }
                    KClass kClass = kDeclarationContainerImpl2 instanceof KClass ? (KClass) kDeclarationContainerImpl2 : null;
                    if (kClass != null && kClass.isValue()) {
                        Member member = descriptorKFunction.getCaller().getMember();
                        member.getClass();
                        if (Modifier.isStatic(member.getModifiers())) {
                            Collection<? extends FunctionDescriptor> overriddenDescriptors = descriptorKFunction.getDescriptor().getOverriddenDescriptors();
                            overriddenDescriptors.getClass();
                            Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
                            for (FunctionDescriptor functionDescriptor : collection) {
                                DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
                                containingDeclaration.getClass();
                                Class javaClass = UtilKt.toJavaClass((ClassDescriptor) containingDeclaration);
                                if (javaClass == null) {
                                    f$$ExternalSyntheticLambda0.m$1(descriptorKFunction, "Unknown container class for overridden function: ");
                                    return null;
                                }
                                arrayList4.add(new DescriptorKFunction((KClassImpl) Reflection.factory.getOrCreateKotlinClass(javaClass), functionDescriptor));
                            }
                            Iterator it4 = arrayList4.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj2 = it4.next();
                                    ArrayList valueParameters2 = KCallables.getValueParameters((ReflectKFunction) obj2);
                                    if (!valueParameters2.isEmpty()) {
                                        Iterator it5 = valueParameters2.iterator();
                                        while (it5.hasNext()) {
                                            ReflectKParameter reflectKParameter2 = (ReflectKParameter) it5.next();
                                            if (reflectKParameter2 == null) {
                                                reflectKParameter2 = null;
                                            }
                                            if (reflectKParameter2 == null || !reflectKParameter2.getDeclaresDefaultValue()) {
                                            }
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            reflectKFunction = (ReflectKFunction) obj2;
                            if (reflectKFunction != null) {
                            }
                        }
                    }
                    reflectKFunction = null;
                    if (reflectKFunction != null) {
                    }
                } else if (mapSignature2 instanceof JvmFunctionSignature$KotlinConstructor) {
                    if (Room.isAnnotationConstructor(descriptorKFunction)) {
                        Class jClass3 = kDeclarationContainerImpl2.getJClass();
                        List parameters2 = descriptorKFunction.getParameters();
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10));
                        Iterator it6 = parameters2.iterator();
                        while (it6.hasNext()) {
                            String name3 = ((ReflectKParameter) it6.next()).getName();
                            name3.getClass();
                            arrayList5.add(name3);
                        }
                        AnnotationConstructorCaller.CallMode callMode2 = AnnotationConstructorCaller.CallMode.CALL_BY_NAME;
                        AnnotationConstructorCaller.Origin origin2 = AnnotationConstructorCaller.Origin.JAVA;
                        return new AnnotationConstructorCaller(jClass3, arrayList5, callMode2);
                    }
                    o patchJvmDescriptorByExtraBoxing3 = GoogleMapKt.patchJvmDescriptorByExtraBoxing(descriptorKFunction, ((JvmFunctionSignature$KotlinConstructor) mapSignature2).signature.getDesc());
                    arrayList3.addAll(patchJvmDescriptorByExtraBoxing3.b);
                    genericDeclaration = kDeclarationContainerImpl2.findDefaultConstructor(patchJvmDescriptorByExtraBoxing3.a);
                } else {
                    if (mapSignature2 instanceof JvmFunctionSignature$FakeJavaAnnotationConstructor) {
                        List list3 = ((JvmFunctionSignature$FakeJavaAnnotationConstructor) mapSignature2).methods;
                        Class jClass4 = kDeclarationContainerImpl2.getJClass();
                        List list4 = list3;
                        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        Iterator it7 = list4.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((Method) it7.next()).getName());
                        }
                        return new AnnotationConstructorCaller(jClass4, arrayList6, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, list3);
                    }
                    genericDeclaration = null;
                }
                if (genericDeclaration instanceof Constructor) {
                    callerImpl = descriptorKFunction.createConstructorCaller((Constructor) genericDeclaration, descriptorKFunction.getDescriptor(), true);
                } else if (genericDeclaration instanceof Method) {
                    if (descriptorKFunction.getDescriptor().getAnnotations().mo4143findAnnotation(UtilKt.JVM_STATIC) != null) {
                        DeclarationDescriptor containingDeclaration2 = descriptorKFunction.getDescriptor().getContainingDeclaration();
                        containingDeclaration2.getClass();
                        if (!((ClassDescriptor) containingDeclaration2).isCompanionObject()) {
                            Method method4 = (Method) genericDeclaration;
                            callerImpl = Room.isBound(descriptorKFunction) ? new CallerImpl.Method.BoundJvmStaticInObject(method4, false, 4) : new CallerImpl.Method.Static(4, 2, method4, true);
                        }
                    }
                    callerImpl = descriptorKFunction.createStaticMethodCaller((Method) genericDeclaration, descriptorKFunction.getCaller().isBoundInstanceCallWithValueClasses());
                } else {
                    callerImpl = null;
                }
                if (callerImpl != null) {
                    return MarkerKt.createValueClassAwareCallerIfNeeded(arrayList3, descriptorKFunction, callerImpl, true);
                }
                return null;
            default:
                Type extractContinuationArgument = GoogleMapKt.extractContinuationArgument(descriptorKFunction);
                return extractContinuationArgument == null ? descriptorKFunction.getCaller().getReturnType() : extractContinuationArgument;
        }
    }
}
