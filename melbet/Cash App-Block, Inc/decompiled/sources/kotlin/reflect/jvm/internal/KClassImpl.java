package kotlin.reflect.jvm.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KotlinGenericDeclaration;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class KClassImpl extends KDeclarationContainerImpl implements KotlinGenericDeclaration, KClass, KTypeParameterOwnerImpl, TypeConstructorMarker {
    public static final HashSet SPECIAL_JVM_ANNOTATION_NAMES;
    public final Lazy data;
    public final Class jClass;

    public final class Data extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(Data.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(Data.class, "annotations", "getAnnotations()Ljava/util/List;", 0), new PropertyReference1Impl(Data.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new PropertyReference1Impl(Data.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new PropertyReference1Impl(Data.class, "constructors", "getConstructors()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new PropertyReference1Impl(Data.class, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new PropertyReference1Impl(Data.class, "supertypes", "getSupertypes()Ljava/util/List;", 0), new PropertyReference1Impl(Data.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new PropertyReference1Impl(Data.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "inheritedNonStaticMembers_k1Impl", "getInheritedNonStaticMembers_k1Impl()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "inheritedStaticMembers_k1Impl", "getInheritedStaticMembers_k1Impl()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(Data.class, "fakeOverrideMembers", "getFakeOverrideMembers$kotlin_reflection()Lkotlin/reflect/jvm/internal/FakeOverrideMembers;", 0)};
        public final ReflectProperties$LazySoftVal allMembers$delegate;
        public final ReflectProperties$LazySoftVal allNonStaticMembers$delegate;
        public final ReflectProperties$LazySoftVal allStaticMembers$delegate;
        public final ReflectProperties$LazySoftVal annotations$delegate;
        public final ReflectProperties$LazySoftVal constructors$delegate;
        public final ReflectProperties$LazySoftVal declaredMembers$delegate;
        public final ReflectProperties$LazySoftVal declaredNonStaticMembers$delegate;
        public final ReflectProperties$LazySoftVal declaredStaticMembers$delegate;
        public final ReflectProperties$LazySoftVal descriptor$delegate;
        public final ReflectProperties$LazySoftVal fakeOverrideMembers$delegate;
        public final ReflectProperties$LazySoftVal inheritedNonStaticMembers_k1Impl$delegate;
        public final ReflectProperties$LazySoftVal inheritedStaticMembers_k1Impl$delegate;
        public final Lazy inlineClassUnderlyingType$delegate;
        public final Lazy kmClass$delegate;
        public final Lazy objectInstance$delegate;
        public final ReflectProperties$LazySoftVal qualifiedName$delegate;
        public final ReflectProperties$LazySoftVal simpleName$delegate;
        public final ReflectProperties$LazySoftVal supertypes$delegate;
        public final ReflectProperties$LazySoftVal typeParameterTable$delegate;
        public final ReflectProperties$LazySoftVal typeParameters$delegate;

        public Data() {
            super(KClassImpl.this);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            final int i = 0;
            this.kmClass$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KClassImpl$Data$$Lambda$0(KClassImpl.this, this, i));
            int i2 = 5;
            this.descriptor$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, i2));
            int i3 = 7;
            this.annotations$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, this, i3));
            int i4 = 8;
            this.simpleName$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, this, i4));
            int i5 = 9;
            this.qualifiedName$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, i5));
            this.constructors$delegate = TuplesKt.lazySoft(null, new KClassImpl$Data$$Lambda$0(KClassImpl.this, this, i2));
            int i6 = 6;
            TuplesKt.lazySoft(null, new KClassImpl$Data$$Lambda$0(i6, this, KClassImpl.this));
            this.objectInstance$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KClassImpl$Data$$Lambda$0(i3, this, KClassImpl.this));
            this.typeParameters$delegate = TuplesKt.lazySoft(null, new KClassImpl$Data$$Lambda$0(i4, this, KClassImpl.this));
            this.typeParameterTable$delegate = TuplesKt.lazySoft(null, new KClassImpl$Data$$Lambda$0(i5, this, KClassImpl.this));
            final int i7 = 1;
            this.supertypes$delegate = TuplesKt.lazySoft(null, new KClassImpl$Data$$Lambda$0(KClassImpl.this, this, i7));
            final int i8 = 2;
            TuplesKt.lazySoft(null, new KClassImpl$Data$$Lambda$0(KClassImpl.this, this, i8));
            int i9 = 3;
            this.inlineClassUnderlyingType$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KClassImpl$Data$$Lambda$0(i9, this, KClassImpl.this));
            this.declaredNonStaticMembers$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, i7));
            this.declaredStaticMembers$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, i8));
            this.inheritedNonStaticMembers_k1Impl$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, i9));
            int i10 = 4;
            this.inheritedStaticMembers_k1Impl$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, i10));
            this.allNonStaticMembers$delegate = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$17
                public final KClassImpl.Data arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i11 = i;
                    KClassImpl.Data data = this.arg$0;
                    switch (i11) {
                        case 0:
                            boolean useK1ImplementationForFakeOverrides = data.useK1ImplementationForFakeOverrides();
                            if (useK1ImplementationForFakeOverrides) {
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = data.declaredNonStaticMembers$delegate;
                                KProperty[] kPropertyArr = KClassImpl.Data.$$delegatedProperties;
                                KProperty kProperty = kPropertyArr[10];
                                Object invoke = reflectProperties$LazySoftVal.invoke();
                                invoke.getClass();
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal2 = data.inheritedNonStaticMembers_k1Impl$delegate;
                                KProperty kProperty2 = kPropertyArr[12];
                                Object invoke2 = reflectProperties$LazySoftVal2.invoke();
                                invoke2.getClass();
                                return CollectionsKt.plus((Iterable) invoke2, (Collection) invoke);
                            }
                            if (useK1ImplementationForFakeOverrides) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal3 = data.allMembers$delegate;
                            KProperty kProperty3 = KClassImpl.Data.$$delegatedProperties[17];
                            Object invoke3 = reflectProperties$LazySoftVal3.invoke();
                            invoke3.getClass();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : (Collection) invoke3) {
                                if (!FakeOverridesKt.isStatic((DescriptorKCallable) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            return arrayList;
                        case 1:
                            boolean useK1ImplementationForFakeOverrides2 = data.useK1ImplementationForFakeOverrides();
                            if (useK1ImplementationForFakeOverrides2) {
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal4 = data.declaredStaticMembers$delegate;
                                KProperty[] kPropertyArr2 = KClassImpl.Data.$$delegatedProperties;
                                KProperty kProperty4 = kPropertyArr2[11];
                                Object invoke4 = reflectProperties$LazySoftVal4.invoke();
                                invoke4.getClass();
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal5 = data.inheritedStaticMembers_k1Impl$delegate;
                                KProperty kProperty5 = kPropertyArr2[13];
                                Object invoke5 = reflectProperties$LazySoftVal5.invoke();
                                invoke5.getClass();
                                return CollectionsKt.plus((Iterable) invoke5, (Collection) invoke4);
                            }
                            if (useK1ImplementationForFakeOverrides2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal6 = data.allMembers$delegate;
                            KProperty kProperty6 = KClassImpl.Data.$$delegatedProperties[17];
                            Object invoke6 = reflectProperties$LazySoftVal6.invoke();
                            invoke6.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : (Collection) invoke6) {
                                if (FakeOverridesKt.isStatic((DescriptorKCallable) obj2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            return arrayList2;
                        default:
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal7 = data.declaredNonStaticMembers$delegate;
                            KProperty[] kPropertyArr3 = KClassImpl.Data.$$delegatedProperties;
                            KProperty kProperty7 = kPropertyArr3[10];
                            Object invoke7 = reflectProperties$LazySoftVal7.invoke();
                            invoke7.getClass();
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal8 = data.declaredStaticMembers$delegate;
                            KProperty kProperty8 = kPropertyArr3[11];
                            Object invoke8 = reflectProperties$LazySoftVal8.invoke();
                            invoke8.getClass();
                            return CollectionsKt.plus((Iterable) invoke8, (Collection) invoke7);
                    }
                }
            });
            this.allStaticMembers$delegate = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$17
                public final KClassImpl.Data arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i11 = i7;
                    KClassImpl.Data data = this.arg$0;
                    switch (i11) {
                        case 0:
                            boolean useK1ImplementationForFakeOverrides = data.useK1ImplementationForFakeOverrides();
                            if (useK1ImplementationForFakeOverrides) {
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = data.declaredNonStaticMembers$delegate;
                                KProperty[] kPropertyArr = KClassImpl.Data.$$delegatedProperties;
                                KProperty kProperty = kPropertyArr[10];
                                Object invoke = reflectProperties$LazySoftVal.invoke();
                                invoke.getClass();
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal2 = data.inheritedNonStaticMembers_k1Impl$delegate;
                                KProperty kProperty2 = kPropertyArr[12];
                                Object invoke2 = reflectProperties$LazySoftVal2.invoke();
                                invoke2.getClass();
                                return CollectionsKt.plus((Iterable) invoke2, (Collection) invoke);
                            }
                            if (useK1ImplementationForFakeOverrides) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal3 = data.allMembers$delegate;
                            KProperty kProperty3 = KClassImpl.Data.$$delegatedProperties[17];
                            Object invoke3 = reflectProperties$LazySoftVal3.invoke();
                            invoke3.getClass();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : (Collection) invoke3) {
                                if (!FakeOverridesKt.isStatic((DescriptorKCallable) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            return arrayList;
                        case 1:
                            boolean useK1ImplementationForFakeOverrides2 = data.useK1ImplementationForFakeOverrides();
                            if (useK1ImplementationForFakeOverrides2) {
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal4 = data.declaredStaticMembers$delegate;
                                KProperty[] kPropertyArr2 = KClassImpl.Data.$$delegatedProperties;
                                KProperty kProperty4 = kPropertyArr2[11];
                                Object invoke4 = reflectProperties$LazySoftVal4.invoke();
                                invoke4.getClass();
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal5 = data.inheritedStaticMembers_k1Impl$delegate;
                                KProperty kProperty5 = kPropertyArr2[13];
                                Object invoke5 = reflectProperties$LazySoftVal5.invoke();
                                invoke5.getClass();
                                return CollectionsKt.plus((Iterable) invoke5, (Collection) invoke4);
                            }
                            if (useK1ImplementationForFakeOverrides2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal6 = data.allMembers$delegate;
                            KProperty kProperty6 = KClassImpl.Data.$$delegatedProperties[17];
                            Object invoke6 = reflectProperties$LazySoftVal6.invoke();
                            invoke6.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : (Collection) invoke6) {
                                if (FakeOverridesKt.isStatic((DescriptorKCallable) obj2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            return arrayList2;
                        default:
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal7 = data.declaredNonStaticMembers$delegate;
                            KProperty[] kPropertyArr3 = KClassImpl.Data.$$delegatedProperties;
                            KProperty kProperty7 = kPropertyArr3[10];
                            Object invoke7 = reflectProperties$LazySoftVal7.invoke();
                            invoke7.getClass();
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal8 = data.declaredStaticMembers$delegate;
                            KProperty kProperty8 = kPropertyArr3[11];
                            Object invoke8 = reflectProperties$LazySoftVal8.invoke();
                            invoke8.getClass();
                            return CollectionsKt.plus((Iterable) invoke8, (Collection) invoke7);
                    }
                }
            });
            this.declaredMembers$delegate = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$17
                public final KClassImpl.Data arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i11 = i8;
                    KClassImpl.Data data = this.arg$0;
                    switch (i11) {
                        case 0:
                            boolean useK1ImplementationForFakeOverrides = data.useK1ImplementationForFakeOverrides();
                            if (useK1ImplementationForFakeOverrides) {
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = data.declaredNonStaticMembers$delegate;
                                KProperty[] kPropertyArr = KClassImpl.Data.$$delegatedProperties;
                                KProperty kProperty = kPropertyArr[10];
                                Object invoke = reflectProperties$LazySoftVal.invoke();
                                invoke.getClass();
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal2 = data.inheritedNonStaticMembers_k1Impl$delegate;
                                KProperty kProperty2 = kPropertyArr[12];
                                Object invoke2 = reflectProperties$LazySoftVal2.invoke();
                                invoke2.getClass();
                                return CollectionsKt.plus((Iterable) invoke2, (Collection) invoke);
                            }
                            if (useK1ImplementationForFakeOverrides) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal3 = data.allMembers$delegate;
                            KProperty kProperty3 = KClassImpl.Data.$$delegatedProperties[17];
                            Object invoke3 = reflectProperties$LazySoftVal3.invoke();
                            invoke3.getClass();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : (Collection) invoke3) {
                                if (!FakeOverridesKt.isStatic((DescriptorKCallable) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            return arrayList;
                        case 1:
                            boolean useK1ImplementationForFakeOverrides2 = data.useK1ImplementationForFakeOverrides();
                            if (useK1ImplementationForFakeOverrides2) {
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal4 = data.declaredStaticMembers$delegate;
                                KProperty[] kPropertyArr2 = KClassImpl.Data.$$delegatedProperties;
                                KProperty kProperty4 = kPropertyArr2[11];
                                Object invoke4 = reflectProperties$LazySoftVal4.invoke();
                                invoke4.getClass();
                                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal5 = data.inheritedStaticMembers_k1Impl$delegate;
                                KProperty kProperty5 = kPropertyArr2[13];
                                Object invoke5 = reflectProperties$LazySoftVal5.invoke();
                                invoke5.getClass();
                                return CollectionsKt.plus((Iterable) invoke5, (Collection) invoke4);
                            }
                            if (useK1ImplementationForFakeOverrides2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal6 = data.allMembers$delegate;
                            KProperty kProperty6 = KClassImpl.Data.$$delegatedProperties[17];
                            Object invoke6 = reflectProperties$LazySoftVal6.invoke();
                            invoke6.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : (Collection) invoke6) {
                                if (FakeOverridesKt.isStatic((DescriptorKCallable) obj2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            return arrayList2;
                        default:
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal7 = data.declaredNonStaticMembers$delegate;
                            KProperty[] kPropertyArr3 = KClassImpl.Data.$$delegatedProperties;
                            KProperty kProperty7 = kPropertyArr3[10];
                            Object invoke7 = reflectProperties$LazySoftVal7.invoke();
                            invoke7.getClass();
                            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal8 = data.declaredStaticMembers$delegate;
                            KProperty kProperty8 = kPropertyArr3[11];
                            Object invoke8 = reflectProperties$LazySoftVal8.invoke();
                            invoke8.getClass();
                            return CollectionsKt.plus((Iterable) invoke8, (Collection) invoke7);
                    }
                }
            });
            this.allMembers$delegate = TuplesKt.lazySoft(null, new KClassImpl$Data$$Lambda$0(i10, this, KClassImpl.this));
            this.fakeOverrideMembers$delegate = TuplesKt.lazySoft(null, new KClassImpl$$Lambda$0(KClassImpl.this, i6));
        }

        public final ClassDescriptor getDescriptor() {
            KProperty kProperty = $$delegatedProperties[0];
            Object invoke = this.descriptor$delegate.invoke();
            invoke.getClass();
            return (ClassDescriptor) invoke;
        }

        public final KmClass getKmClass() {
            return (KmClass) this.kmClass$delegate.getValue();
        }

        public final TypeParameterTable getTypeParameterTable$kotlin_reflection() {
            KProperty kProperty = $$delegatedProperties[7];
            Object invoke = this.typeParameterTable$delegate.invoke();
            invoke.getClass();
            return (TypeParameterTable) invoke;
        }

        public final boolean useK1ImplementationForFakeOverrides() {
            if (!SystemPropertiesKt.newFakeOverridesImplementation || SystemPropertiesKt.useK1Implementation) {
                return true;
            }
            ReflectionFactory reflectionFactory = Reflection.factory;
            KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Iterable.class);
            KClassImpl kClassImpl = KClassImpl.this;
            return KClasses.isSubclassOf(kClassImpl, orCreateKotlinClass) || KClasses.isSubclassOf(kClassImpl, reflectionFactory.getOrCreateKotlinClass(Map.class)) || KClasses.isSubclassOf(kClassImpl, reflectionFactory.getOrCreateKotlinClass(CharSequence.class)) || KClasses.isSubclassOf(kClassImpl, reflectionFactory.getOrCreateKotlinClass(Number.class));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes9.dex */
    public final class MemberBelonginess {
        public static final /* synthetic */ MemberBelonginess[] $VALUES;
        public static final MemberBelonginess DECLARED;
        public static final MemberBelonginess INHERITED;

        static {
            MemberBelonginess memberBelonginess = new MemberBelonginess("DECLARED", 0);
            DECLARED = memberBelonginess;
            MemberBelonginess memberBelonginess2 = new MemberBelonginess("INHERITED", 1);
            INHERITED = memberBelonginess2;
            $VALUES = new MemberBelonginess[]{memberBelonginess, memberBelonginess2};
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) $VALUES.clone();
        }

        public final boolean accept(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor.getKind().isReal() == (this == DECLARED);
        }
    }

    /* loaded from: classes9.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Set<ClassId> special_annotations = SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS();
        HashSet hashSet = new HashSet();
        Iterator<T> it = special_annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(((ClassId) it.next()).asSingleFqName().toString());
        }
        SPECIAL_JVM_ANNOTATION_NAMES = hashSet;
    }

    public KClassImpl(Class cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KClassImpl$$Lambda$0(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Collection access$getMembers(KClassImpl kClassImpl, MemberScope memberScope, MemberBelonginess memberBelonginess) {
        DescriptorKCallable descriptorKCallable;
        kClassImpl.getClass();
        KClassImpl$getMembers$visitor$1 kClassImpl$getMembers$visitor$1 = new KClassImpl$getMembers$visitor$1(kClassImpl, 0);
        Collection<DeclarationDescriptor> contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (!Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.INVISIBLE_FAKE) && memberBelonginess.accept(callableMemberDescriptor)) {
                    descriptorKCallable = (DescriptorKCallable) declarationDescriptor.accept(kClassImpl$getMembers$visitor$1, Unit.INSTANCE);
                    if (descriptorKCallable == null) {
                        arrayList.add(descriptorKCallable);
                    }
                }
            }
            descriptorKCallable = null;
            if (descriptorKCallable == null) {
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    public static ClassDescriptorImpl createSyntheticClass(ClassId classId, RuntimeModuleData runtimeModuleData) {
        final ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new EmptyPackageFragmentDescriptor(runtimeModuleData.getModule(), classId.getPackageFqName()), classId.getShortClassName(), Modality.FINAL, ClassKind.CLASS, CollectionsKt__CollectionsJVMKt.listOf(runtimeModuleData.getModule().getBuiltIns().getAny().getDefaultType()), SourceElement.NO_SOURCE, false, runtimeModuleData.getDeserialization().getStorageManager());
        final StorageManager storageManager = runtimeModuleData.getDeserialization().getStorageManager();
        classDescriptorImpl.initialize(new GivenFunctionsMemberScope(classDescriptorImpl, storageManager) { // from class: kotlin.reflect.jvm.internal.KClassImpl$createSyntheticClass$1$1
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
            public final List computeDeclaredFunctions() {
                return EmptyList.INSTANCE;
            }
        }, EmptySet.INSTANCE, null);
        return classDescriptorImpl;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KClassImpl) && PapaEvent.getJavaObjectType(this).equals(PapaEvent.getJavaObjectType((KClass) obj));
    }

    @Override // kotlin.jvm.internal.KotlinGenericDeclaration
    public final GenericDeclaration findJavaDeclaration() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).annotations$delegate;
        KProperty kProperty = Data.$$delegatedProperties[1];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    public final ClassId getClassId() {
        PrimitiveType primitiveType;
        ClassId mapJavaToKotlin;
        ClassId classId = RuntimeTypeMapper.JAVA_LANG_VOID;
        Class cls = this.jClass;
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            primitiveType = componentType.isPrimitive() ? JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType() : null;
            return primitiveType != null ? new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getArrayTypeName()) : ClassId.Companion.topLevel(StandardNames.FqNames.f1524array.toSafe());
        }
        if (cls.equals(Void.TYPE)) {
            return RuntimeTypeMapper.JAVA_LANG_VOID;
        }
        primitiveType = cls.isPrimitive() ? JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getTypeName());
        }
        ClassId classId2 = ReflectClassUtilKt.getClassId(cls);
        return (classId2.isLocal() || (mapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId2.asSingleFqName())) == null) ? classId2 : mapJavaToKotlin;
    }

    public final kotlin.reflect.jvm.internal.impl.km.ClassKind getClassKind$kotlin_reflection() {
        kotlin.reflect.jvm.internal.impl.km.ClassKind kind;
        KmClass kmClass = getKmClass();
        if (kmClass != null && (kind = Attributes.getKind(kmClass)) != null) {
            return kind;
        }
        Class cls = this.jClass;
        return cls.isAnnotation() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS : cls.isInterface() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE : cls.isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_CLASS : cls.getSuperclass().isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_ENTRY : kotlin.reflect.jvm.internal.impl.km.ClassKind.CLASS;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection getConstructorDescriptors() {
        Collection<ClassConstructorDescriptor> constructors = getDescriptor().getConstructors();
        constructors.getClass();
        return constructors;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).constructors$delegate;
        KProperty kProperty = Data.$$delegatedProperties[4];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        return (Collection) invoke;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection getConstructorsMetadata() {
        KmClass kmClass = getKmClass();
        List<KmConstructor> constructors = kmClass != null ? kmClass.getConstructors() : null;
        if (constructors == null) {
            constructors = EmptyList.INSTANCE;
        }
        return constructors;
    }

    public final ClassDescriptor getDescriptor() {
        return ((Data) this.data.getValue()).getDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection getFunctions(Name name) {
        name.getClass();
        MemberScope memberScope = getDescriptor().getDefaultType().getMemberScope();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = memberScope.getContributedFunctions(name, noLookupLocation);
        MemberScope staticScope = getDescriptor().getStaticScope();
        staticScope.getClass();
        return CollectionsKt.plus((Iterable) staticScope.getContributedFunctions(name, noLookupLocation), (Collection) contributedFunctions);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Class getJClass() {
        return this.jClass;
    }

    public final KmClass getKmClass() {
        return ((Data) this.data.getValue()).getKmClass();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final PropertyDescriptor getLocalPropertyDescriptor(int i) {
        ClassDescriptor descriptor = getDescriptor();
        DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) descriptor : null;
        if (deserializedClassDescriptor != null) {
            ProtoBuf.Class classProto = deserializedClassDescriptor.getClassProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.classLocalVariable;
            generatedExtension.getClass();
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(classProto, generatedExtension, i);
            if (property != null) {
                return (PropertyDescriptor) UtilKt.deserializeToDescriptor(this.jClass, new LocalDelegatedPropertyFakeContainerSource(this), property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), KClassImpl$$Lambda$1.INSTANCE);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final KmProperty getLocalPropertyMetadata(int i) {
        List<KmProperty> localDelegatedProperties;
        KmClass kmClass = getKmClass();
        if (kmClass == null || (localDelegatedProperties = JvmExtensionsKt.getLocalDelegatedProperties(kmClass)) == null) {
            return null;
        }
        return (KmProperty) CollectionsKt.getOrNull(i, localDelegatedProperties);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection getProperties(Name name) {
        name.getClass();
        MemberScope memberScope = getDescriptor().getDefaultType().getMemberScope();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection<? extends PropertyDescriptor> contributedVariables = memberScope.getContributedVariables(name, noLookupLocation);
        MemberScope staticScope = getDescriptor().getStaticScope();
        staticScope.getClass();
        return CollectionsKt.plus((Iterable) staticScope.getContributedVariables(name, noLookupLocation), (Collection) contributedVariables);
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).qualifiedName$delegate;
        KProperty kProperty = Data.$$delegatedProperties[3];
        return (String) reflectProperties$LazySoftVal.invoke();
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).simpleName$delegate;
        KProperty kProperty = Data.$$delegatedProperties[2];
        return (String) reflectProperties$LazySoftVal.invoke();
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).supertypes$delegate;
        KProperty kProperty = Data.$$delegatedProperties[8];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).typeParameters$delegate;
        KProperty kProperty = Data.$$delegatedProperties[6];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return PapaEvent.getJavaObjectType(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        KmClass kmClass = getKmClass();
        if (kmClass != null) {
            return Attributes.isInner(kmClass);
        }
        Class cls = this.jClass;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        Class<?> cls = this.jClass;
        Integer functionClassArity = ReflectClassUtilKt.getFunctionClassArity(cls);
        if (functionClassArity != null) {
            return TypeIntrinsics.isFunctionOfArity(functionClassArity.intValue(), obj);
        }
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(cls);
        if (wrapperByPrimitive != null) {
            cls = wrapperByPrimitive;
        }
        return cls.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        KmClass kmClass = getKmClass();
        return kmClass != null && Attributes.isValue(kmClass);
    }

    public final String toString() {
        String str;
        ClassId classId = getClassId();
        FqName packageFqName = classId.getPackageFqName();
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + '.';
        }
        return "class ".concat(str.concat(StringsKt__StringsJVMKt.replace(classId.getRelativeClassName().asString(), '.', '$', false)));
    }
}
