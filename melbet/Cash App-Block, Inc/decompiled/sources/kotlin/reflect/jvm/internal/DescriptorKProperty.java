package kotlin.reflect.jvm.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.crypto.tink.subtle.Hkdf;
import com.google.maps.android.compose.InputHandlerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.types.DescriptorKType;
import kotlin.text.MatcherMatchResult;
import kotlin.text.UStringsKt;

/* loaded from: classes3.dex */
public abstract class DescriptorKProperty extends DescriptorKCallable implements ReflectKProperty {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(DescriptorKProperty.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};
    public static final ReflectProperties$Val$1 Companion = new ReflectProperties$Val$1();
    public static final Object EXTENSION_PROPERTY_DELEGATE = new Object();
    public final KDeclarationContainerImpl container;
    public final ReflectProperties$LazySoftVal descriptor$delegate;
    public final Lazy javaField$delegate;
    public final String name;
    public final Object rawBoundReceiver;
    public final String signature;

    /* loaded from: classes9.dex */
    public abstract class Accessor extends DescriptorKCallable implements KFunction, KProperty.Accessor {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Accessor() {
            super(KCallableOverriddenStorage.EMPTY);
            KCallableOverriddenStorage kCallableOverriddenStorage = KCallableOverriddenStorage.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final KDeclarationContainerImpl getContainer() {
            return getProperty().container;
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final Caller getDefaultCaller() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
        public abstract PropertyAccessorDescriptor getDescriptor();

        public abstract DescriptorKProperty getProperty();

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final Object getRawBoundReceiver() {
            return getProperty().rawBoundReceiver;
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isExternal() {
            return getDescriptor().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isInfix() {
            return getDescriptor().isInfix();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isInline() {
            return getDescriptor().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isOperator() {
            return getDescriptor().isOperator();
        }

        @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
        public final boolean isSuspend() {
            return getDescriptor().isSuspend();
        }
    }

    public DescriptorKProperty(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kCallableOverriddenStorage);
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        final int i = 0;
        this.javaField$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$$Lambda$0
            public final DescriptorKProperty arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class<?> enclosingClass;
                int i2 = i;
                DescriptorKProperty descriptorKProperty = this.arg$0;
                switch (i2) {
                    case 0:
                        ClassId classId = RuntimeTypeMapper.JAVA_LANG_VOID;
                        PropertyDescriptor descriptor = descriptorKProperty.getDescriptor();
                        KDeclarationContainerImpl kDeclarationContainerImpl2 = descriptorKProperty.container;
                        Hkdf mapPropertySignature = RuntimeTypeMapper.mapPropertySignature(descriptor);
                        if (!(mapPropertySignature instanceof JvmPropertySignature$KotlinProperty)) {
                            if (mapPropertySignature instanceof JvmPropertySignature$JavaField) {
                                return ((JvmPropertySignature$JavaField) mapPropertySignature).getField();
                            }
                            if ((mapPropertySignature instanceof JvmPropertySignature$JavaMethodProperty) || (mapPropertySignature instanceof JvmPropertySignature$MappedKotlinProperty)) {
                                return null;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JvmPropertySignature$KotlinProperty jvmPropertySignature$KotlinProperty = (JvmPropertySignature$KotlinProperty) mapPropertySignature;
                        PropertyDescriptor descriptor2 = jvmPropertySignature$KotlinProperty.getDescriptor();
                        JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, jvmPropertySignature$KotlinProperty.getProto(), jvmPropertySignature$KotlinProperty.getNameResolver(), jvmPropertySignature$KotlinProperty.getTypeTable(), false, 8, null);
                        if (jvmFieldSignature$default == null) {
                            return null;
                        }
                        if (DescriptorsJvmAbiUtil.isPropertyWithBackingFieldInOuterClass(descriptor2) || JvmProtoBufUtil.isMovedFromInterfaceCompanion(jvmPropertySignature$KotlinProperty.getProto())) {
                            enclosingClass = kDeclarationContainerImpl2.getJClass().getEnclosingClass();
                        } else {
                            DeclarationDescriptor containingDeclaration = descriptor2.getContainingDeclaration();
                            enclosingClass = containingDeclaration instanceof ClassDescriptor ? UtilKt.toJavaClass((ClassDescriptor) containingDeclaration) : kDeclarationContainerImpl2.getJClass();
                        }
                        if (enclosingClass == null) {
                            return null;
                        }
                        try {
                            return enclosingClass.getDeclaredField(jvmFieldSignature$default.getName());
                        } catch (NoSuchFieldException unused) {
                            return null;
                        }
                    default:
                        KDeclarationContainerImpl kDeclarationContainerImpl3 = descriptorKProperty.container;
                        String str3 = descriptorKProperty.name;
                        String str4 = descriptorKProperty.signature;
                        kDeclarationContainerImpl3.getClass();
                        str3.getClass();
                        str4.getClass();
                        MatcherMatchResult matchEntire = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE.matchEntire(str4);
                        if (matchEntire != null) {
                            String str5 = (String) ((MatcherMatchResult) UStringsKt.getDestructured(matchEntire).getMatch()).getGroupValues().get(1);
                            PropertyDescriptor localPropertyDescriptor = kDeclarationContainerImpl3.getLocalPropertyDescriptor(Integer.parseInt(str5));
                            if (localPropertyDescriptor != null) {
                                return localPropertyDescriptor;
                            }
                            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Local property #", str5, " not found in ");
                            m3m.append(kDeclarationContainerImpl3.getJClass());
                            throw new KotlinReflectionInternalError(m3m.toString());
                        }
                        Name identifier = Name.identifier(str3);
                        identifier.getClass();
                        Collection properties = kDeclarationContainerImpl3.getProperties(identifier);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : properties) {
                            if (Intrinsics.areEqual(RuntimeTypeMapper.mapPropertySignature((PropertyDescriptor) obj2).asString(), str4)) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Property '", str3, "' (JVM signature: ", str4, ") not resolved in ");
                            m.append(kDeclarationContainerImpl3);
                            throw new KotlinReflectionInternalError(m.toString());
                        }
                        if (arrayList.size() == 1) {
                            return (PropertyDescriptor) CollectionsKt.single((List) arrayList);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            DescriptorVisibility visibility = ((PropertyDescriptor) next).getVisibility();
                            Object obj3 = linkedHashMap.get(visibility);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(visibility, obj3);
                            }
                            ((List) obj3).add(next);
                        }
                        TreeMap treeMap = new TreeMap(new CovariantOverrideComparator(3));
                        treeMap.putAll(linkedHashMap);
                        Collection values = treeMap.values();
                        values.getClass();
                        List list = (List) CollectionsKt.last(values);
                        if (list.size() == 1) {
                            return (PropertyDescriptor) CollectionsKt.first(list);
                        }
                        Name identifier2 = Name.identifier(str3);
                        identifier2.getClass();
                        String joinToString$default = CollectionsKt.joinToString$default(kDeclarationContainerImpl3.getProperties(identifier2), "\n", null, null, 0, null, UtilKt$$Lambda$0.INSTANCE$12, 30);
                        StringBuilder m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Property '", str3, "' (JVM signature: ", str4, ") not resolved in ");
                        m2.append(kDeclarationContainerImpl3);
                        m2.append(':');
                        m2.append(joinToString$default.length() == 0 ? " no members found" : "\n".concat(joinToString$default));
                        throw new KotlinReflectionInternalError(m2.toString());
                }
            }
        });
        final int i2 = 1;
        this.descriptor$delegate = TuplesKt.lazySoft(propertyDescriptor, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$$Lambda$0
            public final DescriptorKProperty arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class<?> enclosingClass;
                int i22 = i2;
                DescriptorKProperty descriptorKProperty = this.arg$0;
                switch (i22) {
                    case 0:
                        ClassId classId = RuntimeTypeMapper.JAVA_LANG_VOID;
                        PropertyDescriptor descriptor = descriptorKProperty.getDescriptor();
                        KDeclarationContainerImpl kDeclarationContainerImpl2 = descriptorKProperty.container;
                        Hkdf mapPropertySignature = RuntimeTypeMapper.mapPropertySignature(descriptor);
                        if (!(mapPropertySignature instanceof JvmPropertySignature$KotlinProperty)) {
                            if (mapPropertySignature instanceof JvmPropertySignature$JavaField) {
                                return ((JvmPropertySignature$JavaField) mapPropertySignature).getField();
                            }
                            if ((mapPropertySignature instanceof JvmPropertySignature$JavaMethodProperty) || (mapPropertySignature instanceof JvmPropertySignature$MappedKotlinProperty)) {
                                return null;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JvmPropertySignature$KotlinProperty jvmPropertySignature$KotlinProperty = (JvmPropertySignature$KotlinProperty) mapPropertySignature;
                        PropertyDescriptor descriptor2 = jvmPropertySignature$KotlinProperty.getDescriptor();
                        JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, jvmPropertySignature$KotlinProperty.getProto(), jvmPropertySignature$KotlinProperty.getNameResolver(), jvmPropertySignature$KotlinProperty.getTypeTable(), false, 8, null);
                        if (jvmFieldSignature$default == null) {
                            return null;
                        }
                        if (DescriptorsJvmAbiUtil.isPropertyWithBackingFieldInOuterClass(descriptor2) || JvmProtoBufUtil.isMovedFromInterfaceCompanion(jvmPropertySignature$KotlinProperty.getProto())) {
                            enclosingClass = kDeclarationContainerImpl2.getJClass().getEnclosingClass();
                        } else {
                            DeclarationDescriptor containingDeclaration = descriptor2.getContainingDeclaration();
                            enclosingClass = containingDeclaration instanceof ClassDescriptor ? UtilKt.toJavaClass((ClassDescriptor) containingDeclaration) : kDeclarationContainerImpl2.getJClass();
                        }
                        if (enclosingClass == null) {
                            return null;
                        }
                        try {
                            return enclosingClass.getDeclaredField(jvmFieldSignature$default.getName());
                        } catch (NoSuchFieldException unused) {
                            return null;
                        }
                    default:
                        KDeclarationContainerImpl kDeclarationContainerImpl3 = descriptorKProperty.container;
                        String str3 = descriptorKProperty.name;
                        String str4 = descriptorKProperty.signature;
                        kDeclarationContainerImpl3.getClass();
                        str3.getClass();
                        str4.getClass();
                        MatcherMatchResult matchEntire = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE.matchEntire(str4);
                        if (matchEntire != null) {
                            String str5 = (String) ((MatcherMatchResult) UStringsKt.getDestructured(matchEntire).getMatch()).getGroupValues().get(1);
                            PropertyDescriptor localPropertyDescriptor = kDeclarationContainerImpl3.getLocalPropertyDescriptor(Integer.parseInt(str5));
                            if (localPropertyDescriptor != null) {
                                return localPropertyDescriptor;
                            }
                            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Local property #", str5, " not found in ");
                            m3m.append(kDeclarationContainerImpl3.getJClass());
                            throw new KotlinReflectionInternalError(m3m.toString());
                        }
                        Name identifier = Name.identifier(str3);
                        identifier.getClass();
                        Collection properties = kDeclarationContainerImpl3.getProperties(identifier);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : properties) {
                            if (Intrinsics.areEqual(RuntimeTypeMapper.mapPropertySignature((PropertyDescriptor) obj2).asString(), str4)) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Property '", str3, "' (JVM signature: ", str4, ") not resolved in ");
                            m.append(kDeclarationContainerImpl3);
                            throw new KotlinReflectionInternalError(m.toString());
                        }
                        if (arrayList.size() == 1) {
                            return (PropertyDescriptor) CollectionsKt.single((List) arrayList);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            DescriptorVisibility visibility = ((PropertyDescriptor) next).getVisibility();
                            Object obj3 = linkedHashMap.get(visibility);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(visibility, obj3);
                            }
                            ((List) obj3).add(next);
                        }
                        TreeMap treeMap = new TreeMap(new CovariantOverrideComparator(3));
                        treeMap.putAll(linkedHashMap);
                        Collection values = treeMap.values();
                        values.getClass();
                        List list = (List) CollectionsKt.last(values);
                        if (list.size() == 1) {
                            return (PropertyDescriptor) CollectionsKt.first(list);
                        }
                        Name identifier2 = Name.identifier(str3);
                        identifier2.getClass();
                        String joinToString$default = CollectionsKt.joinToString$default(kDeclarationContainerImpl3.getProperties(identifier2), "\n", null, null, 0, null, UtilKt$$Lambda$0.INSTANCE$12, 30);
                        StringBuilder m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Property '", str3, "' (JVM signature: ", str4, ") not resolved in ");
                        m2.append(kDeclarationContainerImpl3);
                        m2.append(':');
                        m2.append(joinToString$default.length() == 0 ? " no members found" : "\n".concat(joinToString$default));
                        throw new KotlinReflectionInternalError(m2.toString());
                }
            }
        });
    }

    public final Member computeDelegateSource() {
        if (!getDescriptor().isDelegated()) {
            return null;
        }
        ClassId classId = RuntimeTypeMapper.JAVA_LANG_VOID;
        Hkdf mapPropertySignature = RuntimeTypeMapper.mapPropertySignature(getDescriptor());
        if (mapPropertySignature instanceof JvmPropertySignature$KotlinProperty) {
            JvmPropertySignature$KotlinProperty jvmPropertySignature$KotlinProperty = (JvmPropertySignature$KotlinProperty) mapPropertySignature;
            if (jvmPropertySignature$KotlinProperty.getSignature().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = jvmPropertySignature$KotlinProperty.getSignature().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return this.container.findMethodBySignature(jvmPropertySignature$KotlinProperty.getNameResolver().getString(delegateMethod.getName()), jvmPropertySignature$KotlinProperty.getNameResolver().getString(delegateMethod.getDesc()));
            }
        }
        return getJavaField();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKType computeReturnType() {
        KotlinType returnType = getDescriptor().getReturnType();
        returnType.getClass();
        return new DescriptorKType(returnType, InputHandlerKt.isLocalDelegated(this) ? null : new ConvertFromJavaKt$$Lambda$4(this, 21));
    }

    public final boolean equals(Object obj) {
        ReflectKProperty asReflectProperty = UtilKt.asReflectProperty(obj);
        return asReflectProperty != null && Intrinsics.areEqual(this.container, asReflectProperty.getContainer()) && Intrinsics.areEqual(this.name, asReflectProperty.getName()) && Intrinsics.areEqual(this.signature, asReflectProperty.getSignature()) && Intrinsics.areEqual(this.rawBoundReceiver, asReflectProperty.getRawBoundReceiver());
    }

    @Override // kotlin.jvm.internal.KotlinGenericDeclaration
    public final GenericDeclaration findJavaDeclaration() {
        return KotlinGenericDeclarationKt.findMethodBySignature(this.container, this.signature);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Caller getCaller() {
        return getGetter().getCaller();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Caller getDefaultCaller() {
        getGetter().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public final PropertyDescriptor getDescriptor() {
        KProperty kProperty = $$delegatedProperties[0];
        Object invoke = this.descriptor$delegate.invoke();
        invoke.getClass();
        return (PropertyDescriptor) invoke;
    }

    @Override // kotlin.reflect.KProperty
    public abstract Getter getGetter();

    @Override // kotlin.reflect.jvm.internal.ReflectKProperty
    public final Field getJavaField() {
        return (Field) this.javaField$delegate.getValue();
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKProperty
    public final String getSignature() {
        return this.signature;
    }

    public final int hashCode() {
        return this.signature.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.container.hashCode() * 31, 31, this.name);
    }

    @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
    public final boolean isSuspend() {
        return false;
    }

    public final String toString() {
        return ReflectionObjectRenderer.renderProperty(this);
    }

    /* loaded from: classes9.dex */
    public abstract class Getter extends Accessor implements KProperty.Getter {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(Getter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};
        public final Lazy caller$delegate;
        public final ReflectProperties$LazySoftVal descriptor$delegate;

        public Getter() {
            final int i = 0;
            this.descriptor$delegate = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$Getter$$Lambda$0
                public final DescriptorKProperty.Getter arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    DescriptorKProperty.Getter getter = this.arg$0;
                    switch (i2) {
                        case 0:
                            PropertyGetterDescriptor getter2 = getter.getProperty().getDescriptor().getGetter();
                            if (getter2 != null) {
                                return getter2;
                            }
                            PropertyGetterDescriptorImpl createDefaultGetter = DescriptorFactory.createDefaultGetter(getter.getProperty().getDescriptor(), Annotations.Companion.getEMPTY());
                            createDefaultGetter.initialize(getter.getProperty().getDescriptor().getType());
                            return createDefaultGetter;
                        default:
                            return DescriptorKPropertyKt.access$computeCallerForAccessor(getter, true);
                    }
                }
            });
            final int i2 = 1;
            this.caller$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$Getter$$Lambda$0
                public final DescriptorKProperty.Getter arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    DescriptorKProperty.Getter getter = this.arg$0;
                    switch (i22) {
                        case 0:
                            PropertyGetterDescriptor getter2 = getter.getProperty().getDescriptor().getGetter();
                            if (getter2 != null) {
                                return getter2;
                            }
                            PropertyGetterDescriptorImpl createDefaultGetter = DescriptorFactory.createDefaultGetter(getter.getProperty().getDescriptor(), Annotations.Companion.getEMPTY());
                            createDefaultGetter.initialize(getter.getProperty().getDescriptor().getType());
                            return createDefaultGetter;
                        default:
                            return DescriptorKPropertyKt.access$computeCallerForAccessor(getter, true);
                    }
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
        public final DescriptorKType computeReturnType() {
            KType returnType = getProperty().getReturnType();
            returnType.getClass();
            return (DescriptorKType) returnType;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Getter) && Intrinsics.areEqual(getProperty(), ((Getter) obj).getProperty());
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final Caller getCaller() {
            return (Caller) this.caller$delegate.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
        public final CallableMemberDescriptor getDescriptor() {
            KProperty kProperty = $$delegatedProperties[0];
            Object invoke = this.descriptor$delegate.invoke();
            invoke.getClass();
            return (PropertyGetterDescriptor) invoke;
        }

        @Override // kotlin.reflect.KCallable
        public final String getName() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("<get-"), getProperty().name, '>');
        }

        public final int hashCode() {
            return getProperty().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
        public final DescriptorKCallable shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
            throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
        }

        public final String toString() {
            return "getter of " + getProperty();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.jvm.internal.DescriptorKCallable
        public final PropertyAccessorDescriptor getDescriptor() {
            KProperty kProperty = $$delegatedProperties[0];
            Object invoke = this.descriptor$delegate.invoke();
            invoke.getClass();
            return (PropertyGetterDescriptor) invoke;
        }
    }

    /* loaded from: classes9.dex */
    public abstract class Setter extends Accessor implements KMutableProperty.Setter {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(Setter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};
        public final Lazy caller$delegate;
        public final ReflectProperties$LazySoftVal descriptor$delegate;

        public Setter() {
            final int i = 0;
            this.descriptor$delegate = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$Setter$$Lambda$0
                public final DescriptorKProperty.Setter arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    DescriptorKProperty.Setter setter = this.arg$0;
                    switch (i2) {
                        case 0:
                            PropertySetterDescriptor setter2 = setter.getProperty().getDescriptor().getSetter();
                            if (setter2 != null) {
                                return setter2;
                            }
                            PropertyDescriptor descriptor = setter.getProperty().getDescriptor();
                            Annotations.Companion companion = Annotations.Companion;
                            PropertySetterDescriptorImpl createDefaultSetter = DescriptorFactory.createDefaultSetter(descriptor, companion.getEMPTY(), companion.getEMPTY());
                            createDefaultSetter.getClass();
                            return createDefaultSetter;
                        default:
                            return DescriptorKPropertyKt.access$computeCallerForAccessor(setter, false);
                    }
                }
            });
            final int i2 = 1;
            this.caller$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty$Setter$$Lambda$0
                public final DescriptorKProperty.Setter arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    DescriptorKProperty.Setter setter = this.arg$0;
                    switch (i22) {
                        case 0:
                            PropertySetterDescriptor setter2 = setter.getProperty().getDescriptor().getSetter();
                            if (setter2 != null) {
                                return setter2;
                            }
                            PropertyDescriptor descriptor = setter.getProperty().getDescriptor();
                            Annotations.Companion companion = Annotations.Companion;
                            PropertySetterDescriptorImpl createDefaultSetter = DescriptorFactory.createDefaultSetter(descriptor, companion.getEMPTY(), companion.getEMPTY());
                            createDefaultSetter.getClass();
                            return createDefaultSetter;
                        default:
                            return DescriptorKPropertyKt.access$computeCallerForAccessor(setter, false);
                    }
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
        public final DescriptorKType computeReturnType() {
            KProperty kProperty = $$delegatedProperties[0];
            Object invoke = this.descriptor$delegate.invoke();
            invoke.getClass();
            SimpleType unitType = DescriptorUtilsKt.getBuiltIns((PropertySetterDescriptor) invoke).getUnitType();
            unitType.getClass();
            return new DescriptorKType(unitType, StandardKTypes$$Lambda$0.INSTANCE$1, false);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Setter) && Intrinsics.areEqual(getProperty(), ((Setter) obj).getProperty());
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final Caller getCaller() {
            return (Caller) this.caller$delegate.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
        public final CallableMemberDescriptor getDescriptor() {
            KProperty kProperty = $$delegatedProperties[0];
            Object invoke = this.descriptor$delegate.invoke();
            invoke.getClass();
            return (PropertySetterDescriptor) invoke;
        }

        @Override // kotlin.reflect.KCallable
        public final String getName() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("<set-"), getProperty().name, '>');
        }

        public final int hashCode() {
            return getProperty().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
        public final DescriptorKCallable shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
            throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
        }

        public final String toString() {
            return "setter of " + getProperty();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.jvm.internal.DescriptorKCallable
        public final PropertyAccessorDescriptor getDescriptor() {
            KProperty kProperty = $$delegatedProperties[0];
            Object invoke = this.descriptor$delegate.invoke();
            invoke.getClass();
            return (PropertySetterDescriptor) invoke;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DescriptorKProperty(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        this(kDeclarationContainerImpl, r3, RuntimeTypeMapper.mapPropertySignature(propertyDescriptor).asString(), propertyDescriptor, CallableReference.NO_RECEIVER, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        String asString = propertyDescriptor.getName().asString();
        asString.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj, KCallableOverriddenStorage.EMPTY);
        str.getClass();
        str2.getClass();
    }
}
