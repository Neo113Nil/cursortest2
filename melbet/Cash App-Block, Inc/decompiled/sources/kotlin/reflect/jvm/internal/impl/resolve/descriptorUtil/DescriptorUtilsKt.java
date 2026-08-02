package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import androidx.media3.extractor.VorbisUtil$Mode;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.Ref;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes9.dex */
public final class DescriptorUtilsKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Name.identifier("value").getClass();
    }

    public static final boolean declaresOrInheritsDefaultValue(ValueParameterDescriptor valueParameterDescriptor) {
        valueParameterDescriptor.getClass();
        Boolean ifAny = DFS.ifAny(CollectionsKt__CollectionsJVMKt.listOf(valueParameterDescriptor), DescriptorUtilsKt$$Lambda$0.INSTANCE, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        ifAny.getClass();
        return ifAny.booleanValue();
    }

    public static final CallableMemberDescriptor firstOverridden(CallableMemberDescriptor callableMemberDescriptor, boolean z, final Function1<? super CallableMemberDescriptor, Boolean> function1) {
        callableMemberDescriptor.getClass();
        function1.getClass();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        return (CallableMemberDescriptor) DFS.dfs(CollectionsKt__CollectionsJVMKt.listOf(callableMemberDescriptor), new VorbisUtil$Mode(z, false), new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public void afterChildren(CallableMemberDescriptor callableMemberDescriptor2) {
                callableMemberDescriptor2.getClass();
                Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                if (ref$ObjectRef2.element == null && ((Boolean) function1.invoke(callableMemberDescriptor2)).booleanValue()) {
                    ref$ObjectRef2.element = callableMemberDescriptor2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(CallableMemberDescriptor callableMemberDescriptor2) {
                callableMemberDescriptor2.getClass();
                return Ref$ObjectRef.this.element == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public CallableMemberDescriptor result() {
                return (CallableMemberDescriptor) Ref$ObjectRef.this.element;
            }
        });
    }

    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return firstOverridden(callableMemberDescriptor, z, function1);
    }

    public static final FqName fqNameOrNull(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    public static final ClassDescriptor getAnnotationClass(AnnotationDescriptor annotationDescriptor) {
        annotationDescriptor.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = annotationDescriptor.getType().getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) mo4153getDeclarationDescriptor;
        }
        return null;
    }

    public static final KotlinBuiltIns getBuiltIns(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return getModule(declarationDescriptor).getBuiltIns();
    }

    public static final ClassId getClassId(ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor containingDeclaration;
        ClassId classId;
        if (classifierDescriptor == null || (containingDeclaration = classifierDescriptor.getContainingDeclaration()) == null) {
            return null;
        }
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            Name name = classifierDescriptor.getName();
            name.getClass();
            return new ClassId(fqName, name);
        }
        if (!(containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) || (classId = getClassId((ClassifierDescriptor) containingDeclaration)) == null) {
            return null;
        }
        Name name2 = classifierDescriptor.getName();
        name2.getClass();
        return classId.createNestedClassId(name2);
    }

    public static final FqName getFqNameSafe(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqName fqNameSafe = DescriptorUtils.getFqNameSafe(declarationDescriptor);
        fqNameSafe.getClass();
        return fqNameSafe;
    }

    public static final FqNameUnsafe getFqNameUnsafe(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqNameUnsafe fqName = DescriptorUtils.getFqName(declarationDescriptor);
        fqName.getClass();
        return fqName;
    }

    public static final InlineClassRepresentation<SimpleType> getInlineClassRepresentation(ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof InlineClassRepresentation) {
            return (InlineClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    public static final KotlinTypeRefiner getKotlinTypeRefiner(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        TypeRefinementSupport typeRefinementSupport = ref != null ? (TypeRefinementSupport) ref.getValue() : null;
        return typeRefinementSupport instanceof TypeRefinementSupport.Enabled ? ((TypeRefinementSupport.Enabled) typeRefinementSupport).getTypeRefiner() : KotlinTypeRefiner.Default.INSTANCE;
    }

    public static final ModuleDescriptor getModule(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(declarationDescriptor);
        containingModule.getClass();
        return containingModule;
    }

    public static final Sequence<DeclarationDescriptor> getParents(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return SequencesKt___SequencesKt.drop(getParentsWithSelf(declarationDescriptor), 1);
    }

    public static final Sequence<DeclarationDescriptor> getParentsWithSelf(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return SequencesKt__SequencesKt.generateSequence(DescriptorUtilsKt$$Lambda$1.INSTANCE, declarationDescriptor);
    }

    public static final CallableMemberDescriptor getPropertyIfAccessor(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        correspondingProperty.getClass();
        return correspondingProperty;
    }

    public static final ClassDescriptor getSuperClassNotAny(ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        for (KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().getSupertypes()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
                if (DescriptorUtils.isClassOrEnumClass(mo4153getDeclarationDescriptor)) {
                    mo4153getDeclarationDescriptor.getClass();
                    return (ClassDescriptor) mo4153getDeclarationDescriptor;
                }
            }
        }
        return null;
    }

    public static final boolean isTypeRefinementEnabled(ModuleDescriptor moduleDescriptor) {
        TypeRefinementSupport typeRefinementSupport;
        moduleDescriptor.getClass();
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        return (ref == null || (typeRefinementSupport = (TypeRefinementSupport) ref.getValue()) == null || !typeRefinementSupport.isEnabled()) ? false : true;
    }

    public static final ClassDescriptor resolveTopLevelClass(ModuleDescriptor moduleDescriptor, FqName fqName, LookupLocation lookupLocation) {
        moduleDescriptor.getClass();
        fqName.getClass();
        lookupLocation.getClass();
        fqName.isRoot();
        ClassifierDescriptor mo4154getContributedClassifier = moduleDescriptor.getPackage(fqName.parent()).getMemberScope().mo4154getContributedClassifier(fqName.shortName(), lookupLocation);
        if (mo4154getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) mo4154getContributedClassifier;
        }
        return null;
    }
}
