package kotlin.reflect.jvm.internal.impl.builtins.functions;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt;

/* loaded from: classes9.dex */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    public static final Companion Companion = new Companion(null);
    public static final ClassId functionClassId;
    public static final ClassId kFunctionClassId;
    public final int arity;
    public final PackageFragmentDescriptor containingDeclaration;
    public final FunctionTypeKind functionTypeKind;
    public final FunctionClassScope memberScope;
    public final List parameters;
    public final StorageManager storageManager;
    public final FunctionTypeConstructor typeConstructor;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        FqName fqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        Name identifier = Name.identifier("Function");
        identifier.getClass();
        functionClassId = new ClassId(fqName, identifier);
        FqName fqName2 = StandardNames.KOTLIN_REFLECT_FQ_NAME;
        Name identifier2 = Name.identifier("KFunction");
        identifier2.getClass();
        kFunctionClassId = new ClassId(fqName2, identifier2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(StorageManager storageManager, PackageFragmentDescriptor packageFragmentDescriptor, FunctionTypeKind functionTypeKind, int i) {
        super(storageManager, functionTypeKind.numberedClassName(i));
        storageManager.getClass();
        packageFragmentDescriptor.getClass();
        functionTypeKind.getClass();
        this.storageManager = storageManager;
        this.containingDeclaration = packageFragmentDescriptor;
        this.functionTypeKind = functionTypeKind;
        this.arity = i;
        this.typeConstructor = new FunctionTypeConstructor();
        this.memberScope = new FunctionClassScope(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
        IntProgressionIterator it = intRange.iterator();
        while (it.hasNext) {
            int nextInt = it.nextInt();
            FunctionClassDescriptor functionClassDescriptor = this;
            arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(functionClassDescriptor, Annotations.Companion.getEMPTY(), false, Variance.IN_VARIANCE, Name.identifier(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(nextInt, "P")), arrayList.size(), this.storageManager));
            arrayList2.add(Unit.INSTANCE);
            this = functionClassDescriptor;
        }
        FunctionClassDescriptor functionClassDescriptor2 = this;
        arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(functionClassDescriptor2, Annotations.Companion.getEMPTY(), false, Variance.OUT_VARIANCE, Name.identifier("R"), arrayList.size(), functionClassDescriptor2.storageManager));
        functionClassDescriptor2.parameters = CollectionsKt.toList(arrayList);
        FunctionClassKind.Companion.getFunctionClassKind(functionClassDescriptor2.functionTypeKind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public final int getArity() {
        return this.arity;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassDescriptor mo4141getCompanionObjectDescriptor() {
        return (ClassDescriptor) getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.parameters;
    }

    public final FunctionTypeKind getFunctionTypeKind() {
        return this.functionTypeKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        sourceElement.getClass();
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) getUnsubstitutedPrimaryConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        String asString = getName().asString();
        asString.getClass();
        return asString;
    }

    public final class FunctionTypeConstructor extends AbstractClassTypeConstructor {
        public FunctionTypeConstructor() {
            super(FunctionClassDescriptor.this.storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection computeSupertypes() {
            List listOf;
            FunctionClassDescriptor functionClassDescriptor = FunctionClassDescriptor.this;
            FunctionTypeKind functionTypeKind = functionClassDescriptor.getFunctionTypeKind();
            FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
            if (Intrinsics.areEqual(functionTypeKind, function)) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(FunctionClassDescriptor.functionClassId);
            } else if (Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE)) {
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.kFunctionClassId, new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, function.numberedClassName(functionClassDescriptor.getArity()))});
            } else {
                FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
                if (Intrinsics.areEqual(functionTypeKind, suspendFunction)) {
                    listOf = CollectionsKt__CollectionsJVMKt.listOf(FunctionClassDescriptor.functionClassId);
                } else {
                    if (!Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE)) {
                        AddToStdlibKt.shouldNotBeCalled$default(null, 1, null);
                        OptionalProvider$$ExternalSyntheticLambda0.m$1();
                        return null;
                    }
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.kFunctionClassId, new ClassId(StandardNames.COROUTINES_PACKAGE_FQ_NAME, suspendFunction.numberedClassName(functionClassDescriptor.getArity()))});
                }
            }
            ModuleDescriptor containingDeclaration = functionClassDescriptor.containingDeclaration.getContainingDeclaration();
            List<ClassId> list = listOf;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ClassId classId : list) {
                ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
                if (findClassAcrossModuleDependencies == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Built-in class ", classId, " not found");
                    return null;
                }
                List takeLast = CollectionsKt.takeLast(findClassAcrossModuleDependencies.getTypeConstructor().getParameters().size(), functionClassDescriptor.parameters);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(takeLast, 10));
                Iterator it = takeLast.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).getDefaultType()));
                }
                arrayList.add(KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), findClassAcrossModuleDependencies, arrayList2));
            }
            return CollectionsKt.toList(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final ClassDescriptor mo4153getDeclarationDescriptor() {
            return FunctionClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            return FunctionClassDescriptor.this.parameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean isDenotable() {
            return true;
        }

        public final String toString() {
            return FunctionClassDescriptor.this.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final ClassifierDescriptor mo4153getDeclarationDescriptor() {
            return FunctionClassDescriptor.this;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PackageFragmentDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope.Empty getStaticScope() {
        return MemberScope.Empty.INSTANCE;
    }

    public Void getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassConstructorDescriptor> getConstructors() {
        return EmptyList.INSTANCE;
    }

    public Void getUnsubstitutedPrimaryConstructor() {
        return null;
    }
}
