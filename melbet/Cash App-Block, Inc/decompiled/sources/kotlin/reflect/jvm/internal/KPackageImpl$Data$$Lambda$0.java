package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class KPackageImpl$Data$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final KPackageImpl arg$0;
    public final KPackageImpl.Data arg$1;

    public KPackageImpl$Data$$Lambda$0(KPackageImpl kPackageImpl, KPackageImpl.Data data) {
        this.$r8$classId = 0;
        this.arg$0 = kPackageImpl;
        this.arg$1 = data;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec A[LOOP:2: B:26:0x0083->B:40:0x00ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        KotlinClassHeader classHeader;
        String jvmMethodSignature;
        ReflectKProperty kotlinKMutablePropertyN;
        int i = this.$r8$classId;
        KPackageImpl kPackageImpl = this.arg$0;
        KPackageImpl.Data data = this.arg$1;
        switch (i) {
            case 0:
                Class cls = kPackageImpl.jClass;
                if (!SystemPropertiesKt.loadMetadataDirectly) {
                    ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = data.scope$delegate;
                    KProperty kProperty = KPackageImpl.Data.$$delegatedProperties[1];
                    Object invoke = reflectProperties$LazySoftVal.invoke();
                    invoke.getClass();
                    MemberScope memberScope = (MemberScope) invoke;
                    List<MemberScope> listOf = memberScope instanceof DeserializedPackageMemberScope ? CollectionsKt__CollectionsJVMKt.listOf(memberScope) : memberScope instanceof ChainedMemberScope ? ((ChainedMemberScope) memberScope).getComponentScopes() : EmptyList.INSTANCE;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
                    for (MemberScope memberScope2 : listOf) {
                        memberScope2.getClass();
                        DeserializedPackageMemberScope deserializedPackageMemberScope = (DeserializedPackageMemberScope) memberScope2;
                        arrayList.add(ReadersKt.toKmPackage$default(deserializedPackageMemberScope.getProto(), deserializedPackageMemberScope.getC().getNameResolver(), false, null, 6, null));
                    }
                    return arrayList;
                }
                Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
                KotlinClassMetadata readLenient = metadata != null ? KotlinClassMetadata.Companion.readLenient(metadata) : null;
                if (readLenient instanceof KotlinClassMetadata.FileFacade) {
                    return CollectionsKt__CollectionsJVMKt.listOf(((KotlinClassMetadata.FileFacade) readLenient).getKmPackage());
                }
                if (readLenient instanceof KotlinClassMetadata.MultiFileClassPart) {
                    return CollectionsKt__CollectionsJVMKt.listOf(((KotlinClassMetadata.MultiFileClassPart) readLenient).getKmPackage());
                }
                if (!(readLenient instanceof KotlinClassMetadata.MultiFileClassFacade)) {
                    return EmptyList.INSTANCE;
                }
                List<String> partClassNames = ((KotlinClassMetadata.MultiFileClassFacade) readLenient).getPartClassNames();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = partClassNames.iterator();
                while (it.hasNext()) {
                    Class<?> loadClass = cls.getClassLoader().loadClass(StringsKt__StringsJVMKt.replace((String) it.next(), '/', '.', false));
                    loadClass.getClass();
                    KDeclarationContainer kDeclarationContainer = (KDeclarationContainer) CachesKt.K_PACKAGE_CACHE.get(loadClass);
                    kDeclarationContainer.getClass();
                    CollectionsKt__MutableCollectionsKt.addAll((List) ((KPackageImpl.Data) ((KPackageImpl) kDeclarationContainer).data.getValue()).kmPackages$delegate.getValue(), arrayList2);
                }
                return arrayList2;
            case 1:
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal2 = data.kotlinClass$delegate;
                KProperty kProperty2 = KPackageImpl.Data.$$delegatedProperties[0];
                ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) reflectProperties$LazySoftVal2.invoke();
                String multifileClassName = (reflectKotlinClass == null || (classHeader = reflectKotlinClass.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
                if (multifileClassName == null || multifileClassName.length() <= 0) {
                    return null;
                }
                return kPackageImpl.jClass.getClassLoader().loadClass(StringsKt__StringsJVMKt.replace(multifileClassName, '/', '.', false));
            default:
                if (SystemPropertiesKt.useK1Implementation) {
                    KClassImpl$getMembers$visitor$1 kClassImpl$getMembers$visitor$1 = new KClassImpl$getMembers$visitor$1(kPackageImpl, 1);
                    ReflectProperties$LazySoftVal reflectProperties$LazySoftVal3 = data.scope$delegate;
                    KProperty kProperty3 = KPackageImpl.Data.$$delegatedProperties[1];
                    Object invoke2 = reflectProperties$LazySoftVal3.invoke();
                    invoke2.getClass();
                    Collection<DeclarationDescriptor> contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default((MemberScope) invoke2, null, null, 3, null);
                    ArrayList arrayList3 = new ArrayList();
                    for (DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
                        DescriptorKCallable descriptorKCallable = declarationDescriptor instanceof CallableMemberDescriptor ? (DescriptorKCallable) declarationDescriptor.accept(kClassImpl$getMembers$visitor$1, Unit.INSTANCE) : null;
                        if (descriptorKCallable != null) {
                            arrayList3.add(descriptorKCallable);
                        }
                    }
                    return CollectionsKt.toList(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (KmPackage kmPackage : (List) data.kmPackages$delegate.getValue()) {
                    for (KmProperty kmProperty : kmPackage.getProperties()) {
                        kmProperty.getClass();
                        char c = !kmProperty.getContextParameters().isEmpty() ? (char) 65535 : kmProperty.getReceiverParameterType() != null ? (char) 1 : (char) 0;
                        String computeJvmSignature = ConvertFromMetadataKt.computeJvmSignature(kmProperty, kPackageImpl);
                        if (computeJvmSignature == null) {
                            f$$ExternalSyntheticLambda0.m$2(kmProperty.getName(), "No field or getter signature for property: ");
                            return null;
                        }
                        Object obj = CallableReference.NO_RECEIVER;
                        if (Attributes.isVar(kmProperty)) {
                            if (c == 65535) {
                                kotlinKMutablePropertyN = new KotlinKMutablePropertyN(kPackageImpl, computeJvmSignature, obj, kmProperty);
                            } else if (c != 0) {
                                if (c == 1) {
                                    kotlinKMutablePropertyN = new KotlinKMutableProperty1(kPackageImpl, computeJvmSignature, obj, kmProperty);
                                }
                                kotlinKMutablePropertyN = null;
                            } else {
                                kotlinKMutablePropertyN = new KotlinKMutableProperty0(kPackageImpl, computeJvmSignature, obj, kmProperty);
                            }
                            if (kotlinKMutablePropertyN != null) {
                            }
                        } else {
                            if (c == 65535) {
                                kotlinKMutablePropertyN = new KotlinKPropertyN(kPackageImpl, computeJvmSignature, obj, kmProperty);
                            } else if (c != 0) {
                                if (c == 1) {
                                    kotlinKMutablePropertyN = new KotlinKProperty1(kPackageImpl, computeJvmSignature, obj, kmProperty);
                                }
                                kotlinKMutablePropertyN = null;
                            } else {
                                kotlinKMutablePropertyN = new KotlinKProperty0(kPackageImpl, computeJvmSignature, obj, kmProperty);
                            }
                            if (kotlinKMutablePropertyN != null) {
                                throw new KotlinReflectionInternalError("Unsupported property: name=" + kmProperty.getName() + " signature=" + computeJvmSignature + " container=" + kPackageImpl);
                            }
                            arrayList4.add(kotlinKMutablePropertyN);
                        }
                    }
                    for (KmFunction kmFunction : kmPackage.getFunctions()) {
                        kmFunction.getClass();
                        JvmMethodSignature signature = JvmExtensionsKt.getSignature(kmFunction);
                        if (signature == null || (jvmMethodSignature = signature.toString()) == null) {
                            f$$ExternalSyntheticLambda0.m$2(kmFunction.getName(), "No signature for function: ");
                            return null;
                        }
                        arrayList4.add(new KotlinKNamedFunction(kPackageImpl, jvmMethodSignature, CallableReference.NO_RECEIVER, kmFunction));
                    }
                }
                return CollectionsKt.toList(arrayList4);
        }
    }

    public /* synthetic */ KPackageImpl$Data$$Lambda$0(KPackageImpl.Data data, KPackageImpl kPackageImpl, int i) {
        this.$r8$classId = i;
        this.arg$1 = data;
        this.arg$0 = kPackageImpl;
    }
}
