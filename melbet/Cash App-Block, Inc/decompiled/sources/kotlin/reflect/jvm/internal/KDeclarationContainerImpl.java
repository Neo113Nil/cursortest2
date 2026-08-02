package kotlin.reflect.jvm.internal;

import androidx.compose.runtime.GapPending$keyMap$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import okhttp3.FormBody;

/* loaded from: classes3.dex */
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {
    public static final Regex LOCAL_PROPERTY_SIGNATURE = new Regex("<v#(\\d+)>");

    public abstract class Data {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(Data.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0)};
        public final ReflectProperties$LazySoftVal moduleData$delegate;

        public Data(KDeclarationContainerImpl kDeclarationContainerImpl) {
            this.moduleData$delegate = TuplesKt.lazySoft(null, new GapPending$keyMap$2(kDeclarationContainerImpl, 2));
        }
    }

    public static void addParametersAndMasks(ArrayList arrayList, List list, boolean z, boolean z2) {
        Class cls;
        cls = DefaultConstructorMarker.class;
        if (Intrinsics.areEqual(CollectionsKt.lastOrNull(list), cls)) {
            list = list.subList(0, list.size() - 1);
        }
        int size = z2 ? list.size() - 1 : list.size();
        arrayList.addAll(list);
        int i = (size + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls2 = Integer.TYPE;
            cls2.getClass();
            arrayList.add(cls2);
        }
        arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    public static Method lookupMethod(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class<?> tryLoadClass;
        Method lookupMethod;
        if (z) {
            clsArr[0] = cls;
        }
        Method tryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (tryGetMethod != null) {
            return tryGetMethod;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (lookupMethod = lookupMethod(superclass, str, clsArr, cls2, z)) != null) {
            return lookupMethod;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        for (Class<?> cls3 : interfaces) {
            cls3.getClass();
            Method lookupMethod2 = lookupMethod(cls3, str, clsArr, cls2, z);
            if (lookupMethod2 != null) {
                return lookupMethod2;
            }
            if (z && (tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method tryGetMethod2 = tryGetMethod(tryLoadClass, str, clsArr, cls2);
                if (tryGetMethod2 != null) {
                    return tryGetMethod2;
                }
            }
        }
        return null;
    }

    public static Constructor tryGetConstructor(List list, Class cls) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method tryGetMethod(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.areEqual(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (Intrinsics.areEqual(method.getName(), str) && Intrinsics.areEqual(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final KotlinKProperty0 createLocalProperty(int i, String str) {
        str.getClass();
        KmProperty localPropertyMetadata = getLocalPropertyMetadata(i);
        if (localPropertyMetadata == null) {
            return null;
        }
        if (localPropertyMetadata.getReceiverParameterType() == null) {
            return Attributes.isVar(localPropertyMetadata) ? new KotlinKMutableProperty0(this, str, null, localPropertyMetadata) : new KotlinKProperty0(this, str, null, localPropertyMetadata);
        }
        throw new KotlinReflectionInternalError("Local property " + localPropertyMetadata.getName() + " is an extension, which is not yet supported");
    }

    public final Constructor findDefaultConstructor(String str) {
        str.getClass();
        Class jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        addParametersAndMasks(arrayList, UtilKt.parseAndLoadDescriptor(ReflectClassUtilKt.getSafeClassLoader(getJClass()), str, false).getParameters(), true, false);
        return tryGetConstructor(arrayList, jClass);
    }

    public final Method findDefaultMethod(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getJClass());
        }
        FormBody.Builder parseAndLoadDescriptor = UtilKt.parseAndLoadDescriptor(ReflectClassUtilKt.getSafeClassLoader(getJClass()), str2, true);
        addParametersAndMasks(arrayList, parseAndLoadDescriptor.getParameters(), false, z2);
        Class methodOwner = getMethodOwner();
        String concat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class returnType = parseAndLoadDescriptor.getReturnType();
        returnType.getClass();
        return lookupMethod(methodOwner, concat, clsArr, returnType, z);
    }

    public final Method findMethodBySignature(String str, String str2) {
        Method lookupMethod;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        FormBody.Builder parseAndLoadDescriptor = UtilKt.parseAndLoadDescriptor(ReflectClassUtilKt.getSafeClassLoader(getJClass()), str2, true);
        Class[] clsArr = (Class[]) parseAndLoadDescriptor.getParameters().toArray(new Class[0]);
        Class returnType = parseAndLoadDescriptor.getReturnType();
        returnType.getClass();
        Method lookupMethod2 = lookupMethod(getMethodOwner(), str, clsArr, returnType, false);
        if (lookupMethod2 != null) {
            return lookupMethod2;
        }
        if (!getMethodOwner().isInterface() || (lookupMethod = lookupMethod(Object.class, str, clsArr, returnType, false)) == null) {
            return null;
        }
        return lookupMethod;
    }

    public final KmProperty findPropertyMetadata(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList propertiesMetadata = ((KPackageImpl) this).getPropertiesMetadata();
        ArrayList arrayList = new ArrayList();
        Iterator it = propertiesMetadata.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            KmProperty kmProperty = (KmProperty) next;
            if (Intrinsics.areEqual(kmProperty.getName(), str) && Intrinsics.areEqual(ConvertFromMetadataKt.computeJvmSignature(kmProperty, this), str2)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            m.append(this);
            throw new KotlinReflectionInternalError(m.toString());
        }
        if (arrayList.size() <= 1) {
            return (KmProperty) CollectionsKt.single((List) arrayList);
        }
        StringBuilder m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        m2.append(this);
        throw new KotlinReflectionInternalError(m2.toString());
    }

    public abstract Collection getConstructorDescriptors();

    public abstract Collection getConstructorsMetadata();

    public abstract Collection getFunctions(Name name);

    public abstract PropertyDescriptor getLocalPropertyDescriptor(int i);

    public abstract KmProperty getLocalPropertyMetadata(int i);

    public Class getMethodOwner() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        return wrapperByPrimitive == null ? getJClass() : wrapperByPrimitive;
    }

    public abstract Collection getProperties(Name name);
}
