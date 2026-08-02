package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;

/* loaded from: classes9.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy data;
    public final Class jClass;

    public final class Data extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(Data.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0), new PropertyReference1Impl(Data.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0), new PropertyReference1Impl(Data.class, "members", "getMembers()Ljava/util/Collection;", 0)};
        public final Lazy kmPackages$delegate;
        public final ReflectProperties$LazySoftVal kotlinClass$delegate;
        public final Lazy multifileFacade$delegate;
        public final ReflectProperties$LazySoftVal scope$delegate;

        public Data(KPackageImpl kPackageImpl) {
            super(kPackageImpl);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.kmPackages$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KPackageImpl$Data$$Lambda$0(kPackageImpl, this));
            this.kotlinClass$delegate = TuplesKt.lazySoft(null, new KPackageImpl$$Lambda$0(kPackageImpl, 1));
            this.scope$delegate = TuplesKt.lazySoft(null, new ConvertFromJavaKt$$Lambda$4(this, 23));
            this.multifileFacade$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KPackageImpl$Data$$Lambda$0(this, kPackageImpl, 1));
            TuplesKt.lazySoft(null, new KPackageImpl$Data$$Lambda$0(this, kPackageImpl, 2));
        }
    }

    public KPackageImpl(Class cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KPackageImpl$$Lambda$0(this, 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KPackageImpl) {
            return Intrinsics.areEqual(this.jClass, ((KPackageImpl) obj).jClass);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection getConstructorDescriptors() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection getConstructorsMetadata() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection getFunctions(Name name) {
        name.getClass();
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).scope$delegate;
        KProperty kProperty = Data.$$delegatedProperties[1];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        return ((MemberScope) invoke).getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    public final ArrayList getFunctionsMetadata() {
        List list = (List) ((Data) this.data.getValue()).kmPackages$delegate.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((KmPackage) it.next()).getFunctions(), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Class getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final PropertyDescriptor getLocalPropertyDescriptor(int i) {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).scope$delegate;
        KProperty kProperty = Data.$$delegatedProperties[1];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        MemberScope memberScope = (MemberScope) invoke;
        DeserializedPackageMemberScope deserializedPackageMemberScope = memberScope instanceof DeserializedPackageMemberScope ? (DeserializedPackageMemberScope) memberScope : null;
        if (deserializedPackageMemberScope != null) {
            ProtoBuf.Package proto = deserializedPackageMemberScope.getProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.packageLocalVariable;
            generatedExtension.getClass();
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(proto, generatedExtension, i);
            if (property != null) {
                LocalDelegatedPropertyFakeContainerSource localDelegatedPropertyFakeContainerSource = new LocalDelegatedPropertyFakeContainerSource(this);
                NameResolver nameResolver = deserializedPackageMemberScope.getC().getNameResolver();
                ProtoBuf.TypeTable typeTable = proto.getTypeTable();
                typeTable.getClass();
                return (PropertyDescriptor) UtilKt.deserializeToDescriptor(this.jClass, localDelegatedPropertyFakeContainerSource, property, nameResolver, new TypeTable(typeTable), deserializedPackageMemberScope.getC().getMetadataVersion(), KClassImpl$$Lambda$1.INSTANCE$1);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final KmProperty getLocalPropertyMetadata(int i) {
        List<KmProperty> localDelegatedProperties;
        KmPackage kmPackage = (KmPackage) CollectionsKt.singleOrNull((List) ((Data) this.data.getValue()).kmPackages$delegate.getValue());
        if (kmPackage == null || (localDelegatedProperties = JvmExtensionsKt.getLocalDelegatedProperties(kmPackage)) == null) {
            return null;
        }
        return (KmProperty) CollectionsKt.getOrNull(i, localDelegatedProperties);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Class getMethodOwner() {
        Class cls = (Class) ((Data) this.data.getValue()).multifileFacade$delegate.getValue();
        return cls == null ? this.jClass : cls;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection getProperties(Name name) {
        name.getClass();
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((Data) this.data.getValue()).scope$delegate;
        KProperty kProperty = Data.$$delegatedProperties[1];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        return ((MemberScope) invoke).getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    public final ArrayList getPropertiesMetadata() {
        List list = (List) ((Data) this.data.getValue()).kmPackages$delegate.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((KmPackage) it.next()).getProperties(), arrayList);
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.jClass.hashCode();
    }

    public final String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(this.jClass).asSingleFqName();
    }
}
