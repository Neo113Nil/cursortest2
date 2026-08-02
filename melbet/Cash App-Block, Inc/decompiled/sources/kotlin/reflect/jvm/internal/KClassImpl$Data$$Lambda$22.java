package kotlin.reflect.jvm.internal;

import com.squareup.cash.work.viewmodels.TaxFormItemViewModel;
import com.squareup.cash.work.viewmodels.TaxFormsListViewEvent;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.shared.di.Factory;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$3;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class KClassImpl$Data$$Lambda$22 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;
    public final Object arg$1;

    public KClassImpl$Data$$Lambda$22(KotlinBuiltIns kotlinBuiltIns, ModuleDescriptorImpl moduleDescriptorImpl) {
        this.$r8$classId = 13;
        this.arg$1 = kotlinBuiltIns;
        this.arg$0 = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List functions;
        int i = this.$r8$classId;
        Object obj = this.arg$1;
        Object obj2 = this.arg$0;
        switch (i) {
            case 0:
                KClassImpl kClassImpl = (KClassImpl) obj;
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((KotlinType) obj2).getConstructor().mo4153getDeclarationDescriptor();
                if (!(mo4153getDeclarationDescriptor instanceof ClassDescriptor)) {
                    f$$ExternalSyntheticLambda0.m$1(mo4153getDeclarationDescriptor, "Supertype not a class: ");
                    return null;
                }
                Class javaClass = UtilKt.toJavaClass((ClassDescriptor) mo4153getDeclarationDescriptor);
                if (javaClass == null) {
                    f$$ExternalSyntheticLambda0.m$1("Unsupported superclass of ", kClassImpl, ": ", mo4153getDeclarationDescriptor);
                    return null;
                }
                Class cls = kClassImpl.jClass;
                if (Intrinsics.areEqual(cls.getSuperclass(), javaClass)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int indexOf = ArraysKt___ArraysKt.indexOf(interfaces, javaClass);
                if (indexOf < 0) {
                    f$$ExternalSyntheticLambda0.m$1("No superclass of ", kClassImpl, " in Java reflection for ", mo4153getDeclarationDescriptor);
                    return null;
                }
                Type type2 = cls.getGenericInterfaces()[indexOf];
                type2.getClass();
                return type2;
            case 1:
                TaxFormItemViewModel taxFormItemViewModel = (TaxFormItemViewModel) obj;
                ((Function1) obj2).invoke(new TaxFormsListViewEvent.FormClicked(taxFormItemViewModel.token, taxFormItemViewModel.title, taxFormItemViewModel.downloadUrl));
                return Unit.INSTANCE;
            case 2:
                return new Factory((DocumentStepFragment) obj2, (HCaptcha$$ExternalSyntheticLambda2) obj);
            case 3:
                return new Factory((GovernmentIdStepFragment) obj2, (HCaptcha$$ExternalSyntheticLambda2) obj);
            case 4:
                return new Factory((IntegrationStepFragment) obj2, (HCaptcha$$ExternalSyntheticLambda2) obj);
            case 5:
                return new Factory((InquiryWorkflowFragment) obj2, (InquiryWorkflowFragment$$ExternalSyntheticLambda0) obj);
            case 6:
                return new Factory((InquiryWorkflowFragment) obj2, (InquiryWorkflowFragment$$ExternalSyntheticLambda0) obj);
            case 7:
                return new Factory((PermissionRequestFragment) obj2, (HCaptcha$$ExternalSyntheticLambda2) obj);
            case 8:
                return new Factory((SelfieStepFragment) obj2, (ForwardingFileSystem$$ExternalSyntheticLambda0) obj);
            case 9:
                return new Factory((UiStepFragment) obj2, (ForwardingFileSystem$$ExternalSyntheticLambda0) obj);
            case 10:
                DescriptorKFunction descriptorKFunction = (DescriptorKFunction) obj2;
                String str = (String) obj;
                KDeclarationContainerImpl kDeclarationContainerImpl = descriptorKFunction.container;
                String str2 = descriptorKFunction.signature;
                kDeclarationContainerImpl.getClass();
                str.getClass();
                str2.getClass();
                if (str.equals("<init>")) {
                    functions = CollectionsKt.toList(kDeclarationContainerImpl.getConstructorDescriptors());
                } else {
                    Name identifier = Name.identifier(str);
                    identifier.getClass();
                    functions = kDeclarationContainerImpl.getFunctions(identifier);
                }
                Collection collection = functions;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collection) {
                    if (Intrinsics.areEqual(RuntimeTypeMapper.mapSignature((FunctionDescriptor) obj3).asString(), str2)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return (FunctionDescriptor) CollectionsKt.single((List) arrayList);
                }
                String joinToString$default = CollectionsKt.joinToString$default(collection, "\n", null, null, 0, null, UtilKt$$Lambda$0.INSTANCE$14, 30);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                m.append(kDeclarationContainerImpl);
                m.append(':');
                m.append(joinToString$default.length() == 0 ? " no members found" : "\n".concat(joinToString$default));
                throw new KotlinReflectionInternalError(m.toString());
            case 11:
                KotlinKParameter kotlinKParameter = (KotlinKParameter) obj2;
                KmType type3 = kotlinKParameter.kmParameter.getType();
                ClassLoader classLoader = kotlinKParameter.callable.getContainer().getJClass().getClassLoader();
                classLoader.getClass();
                return ConvertFromMetadataKt.toKType(type3, classLoader, (TypeParameterTable) obj, new KotlinKParameter$$Lambda$1(kotlinKParameter, 0));
            case 12:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj2).getCanonicalName());
                CollectionsKt.joinTo$default(((Map) obj).entrySet(), sb, ", ", "(", ")", AnnotationConstructorCallerKt$$Lambda$3.INSTANCE, 48);
                return sb.toString();
            case 13:
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) obj2;
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                if (kotlinBuiltIns.builtInsModule == null) {
                    kotlinBuiltIns.builtInsModule = moduleDescriptorImpl;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + kotlinBuiltIns.builtInsModule + " (attempting to reset to " + moduleDescriptorImpl + ")");
            case 14:
                JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = (JvmBuiltInClassDescriptorFactory) obj2;
                StorageManager storageManager = (StorageManager) obj;
                JvmBuiltInClassDescriptorFactory.Companion companion = JvmBuiltInClassDescriptorFactory.Companion;
                Function1 function1 = jvmBuiltInClassDescriptorFactory.computeContainingDeclaration;
                ModuleDescriptor moduleDescriptor = jvmBuiltInClassDescriptorFactory.moduleDescriptor;
                ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl((DeclarationDescriptor) function1.invoke(moduleDescriptor), JvmBuiltInClassDescriptorFactory.CLONEABLE_NAME, Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt__CollectionsJVMKt.listOf(moduleDescriptor.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false, storageManager);
                classDescriptorImpl.initialize(new CloneableClassScope(storageManager, classDescriptorImpl), EmptySet.INSTANCE, null);
                return classDescriptorImpl;
            case 15:
                JvmBuiltIns jvmBuiltIns = (JvmBuiltIns) obj2;
                KProperty[] kPropertyArr = JvmBuiltIns.$$delegatedProperties;
                ModuleDescriptorImpl builtInsModule = jvmBuiltIns.getBuiltInsModule();
                builtInsModule.getClass();
                return new JvmBuiltInsCustomizer(builtInsModule, (StorageManager) obj, new KotlinKPropertyN$$Lambda$0(jvmBuiltIns, 5));
            case 16:
                JvmBuiltInsCustomizer jvmBuiltInsCustomizer = (JvmBuiltInsCustomizer) obj2;
                KProperty[] kPropertyArr2 = JvmBuiltInsCustomizer.$$delegatedProperties;
                return FindClassInModuleKt.findNonGenericClassAcrossDependencies(jvmBuiltInsCustomizer.getSettings().getOwnerModuleDescriptor(), JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new NotFoundClasses((StorageManager) obj, jvmBuiltInsCustomizer.getSettings().getOwnerModuleDescriptor())).getDefaultType();
            case 17:
                KProperty[] kPropertyArr3 = JvmBuiltInsCustomizer.$$delegatedProperties;
                JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
                javaResolverCache.getClass();
                return ((LazyJavaClassDescriptor) obj2).copy$descriptors_jvm(javaResolverCache, (ClassDescriptor) obj);
            case 18:
                return (MemberScope) ((ScopesHolderForClass) obj2).scopeFactory.invoke((KotlinTypeRefiner) obj);
            case 19:
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) obj2;
                ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
                StorageManager storageManager2 = typeAliasConstructorDescriptorImpl.storageManager;
                TypeAliasDescriptor typeAliasDescriptor = typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor();
                Annotations annotations = classConstructorDescriptor.getAnnotations();
                CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
                kind.getClass();
                SourceElement source = typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getSource();
                source.getClass();
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager2, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptorImpl, annotations, kind, source);
                TypeSubstitutor access$getTypeSubstitutorForUnderlyingClass = TypeAliasConstructorDescriptorImpl.Companion.access$getTypeSubstitutorForUnderlyingClass(TypeAliasConstructorDescriptorImpl.Companion, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor());
                if (access$getTypeSubstitutorForUnderlyingClass == null) {
                    return null;
                }
                ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor.getDispatchReceiverParameter();
                ReceiverParameterDescriptor substitute = dispatchReceiverParameter != null ? dispatchReceiverParameter.substitute(access$getTypeSubstitutorForUnderlyingClass) : null;
                List<ReceiverParameterDescriptor> contextReceiverParameters = classConstructorDescriptor.getContextReceiverParameters();
                contextReceiverParameters.getClass();
                List<ReceiverParameterDescriptor> list = contextReceiverParameters;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ReceiverParameterDescriptor) it.next()).substitute(access$getTypeSubstitutorForUnderlyingClass));
                }
                typeAliasConstructorDescriptorImpl2.initialize(null, substitute, arrayList2, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getDeclaredTypeParameters(), typeAliasConstructorDescriptorImpl.getValueParameters(), typeAliasConstructorDescriptorImpl.getReturnType(), Modality.FINAL, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getVisibility());
                return typeAliasConstructorDescriptorImpl2;
            case 20:
                KProperty[] kPropertyArr4 = JavaAnnotationDescriptor.$$delegatedProperties;
                return ((LazyJavaResolverContext) obj2).getModule().getBuiltIns().getBuiltInClassByFqName(((JavaAnnotationDescriptor) obj).getFqName()).getDefaultType();
            case 21:
                return ContextKt.computeNewDefaultTypeQualifiers((LazyJavaResolverContext) obj2, ((ClassOrPackageFragmentDescriptor) obj).getAnnotations());
            case 22:
                return ContextKt.computeNewDefaultTypeQualifiers((LazyJavaResolverContext) obj2, (Annotations) obj);
            case 23:
                return new LazyJavaPackageFragment(((LazyJavaPackageFragmentProvider) obj2).c, (JavaPackage) obj);
            case 24:
                int i2 = LazyJavaPackageScope.$r8$clinit;
                return ((LazyJavaResolverContext) obj2).getComponents().getFinder().knownClassNamesInPackage(((LazyJavaPackageScope) obj).ownerDescriptor.getFqName());
            case 25:
                AbstractSignatureParts abstractSignatureParts = (AbstractSignatureParts) obj;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((List) obj2).iterator();
                while (it2.hasNext()) {
                    KotlinTypeMarker enhancedForWarnings = abstractSignatureParts.getEnhancedForWarnings((KotlinTypeMarker) it2.next());
                    if (enhancedForWarnings != null) {
                        arrayList3.add(enhancedForWarnings);
                    }
                }
                return arrayList3;
            case 26:
                DeserializationContext deserializationContext = ((TypeDeserializer) obj2).c;
                return deserializationContext.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations((ProtoBuf.Type) obj, deserializationContext.getNameResolver());
            case 27:
                DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) obj2;
                return CollectionsKt.toList(deserializedClassDescriptor.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(deserializedClassDescriptor.getThisAsProtoContainer$deserialization(), (ProtoBuf.EnumEntry) obj));
            case 28:
                return KotlinTypeRefinerKt.refineTypes(((AbstractTypeConstructor.ModuleViewTypeConstructor) obj2).kotlinTypeRefiner, ((AbstractTypeConstructor) obj).getSupertypes());
            default:
                return ((KotlinTypeRefiner) obj2).refineType((KotlinTypeMarker) ((LazyWrappedType) obj).computation.invoke());
        }
    }

    public /* synthetic */ KClassImpl$Data$$Lambda$22(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.arg$0 = obj;
        this.arg$1 = obj2;
    }
}
