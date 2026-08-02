package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class NotFoundClasses {
    public final MemoizedFunctionToNotNull classes;
    public final ModuleDescriptor module;
    public final MemoizedFunctionToNotNull packageFragments;
    public final StorageManager storageManager;

    public final class ClassRequest {
        public final ClassId classId;
        public final List typeParametersCount;

        public ClassRequest(ClassId classId, List list) {
            classId.getClass();
            list.getClass();
            this.classId = classId;
            this.typeParametersCount = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassRequest)) {
                return false;
            }
            ClassRequest classRequest = (ClassRequest) obj;
            return Intrinsics.areEqual(this.classId, classRequest.classId) && Intrinsics.areEqual(this.typeParametersCount, classRequest.typeParametersCount);
        }

        public final int hashCode() {
            return this.typeParametersCount.hashCode() + (this.classId.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClassRequest(classId=");
            sb.append(this.classId);
            sb.append(", typeParametersCount=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.typeParametersCount, ')');
        }
    }

    public NotFoundClasses(StorageManager storageManager, ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.storageManager = storageManager;
        this.module = moduleDescriptor;
        final int i = 0;
        this.packageFragments = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$0
            public final NotFoundClasses arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DeclarationDescriptor declarationDescriptor;
                int i2 = i;
                NotFoundClasses notFoundClasses = this.arg$0;
                switch (i2) {
                    case 0:
                        FqName fqName = (FqName) obj;
                        fqName.getClass();
                        return new EmptyPackageFragmentDescriptor(notFoundClasses.module, fqName);
                    default:
                        NotFoundClasses.ClassRequest classRequest = (NotFoundClasses.ClassRequest) obj;
                        classRequest.getClass();
                        ClassId classId = classRequest.classId;
                        List list = classRequest.typeParametersCount;
                        if (classId.isLocal()) {
                            f$$ExternalSyntheticLambda0.m((Object) classId, "Unresolved local class: ");
                            return null;
                        }
                        ClassId outerClassId = classId.getOuterClassId();
                        if (outerClassId == null || (declarationDescriptor = notFoundClasses.getClass(outerClassId, CollectionsKt.drop(list, 1))) == null) {
                            declarationDescriptor = (ClassOrPackageFragmentDescriptor) notFoundClasses.packageFragments.invoke(classId.getPackageFqName());
                        }
                        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
                        boolean isNestedClass = classId.isNestedClass();
                        StorageManager storageManager2 = notFoundClasses.storageManager;
                        Name shortClassName = classId.getShortClassName();
                        Integer num = (Integer) CollectionsKt.firstOrNull(list);
                        return new NotFoundClasses.MockClassDescriptor(storageManager2, declarationDescriptor2, shortClassName, isNestedClass, num != null ? num.intValue() : 0);
                }
            }
        });
        final int i2 = 1;
        this.classes = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$0
            public final NotFoundClasses arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DeclarationDescriptor declarationDescriptor;
                int i22 = i2;
                NotFoundClasses notFoundClasses = this.arg$0;
                switch (i22) {
                    case 0:
                        FqName fqName = (FqName) obj;
                        fqName.getClass();
                        return new EmptyPackageFragmentDescriptor(notFoundClasses.module, fqName);
                    default:
                        NotFoundClasses.ClassRequest classRequest = (NotFoundClasses.ClassRequest) obj;
                        classRequest.getClass();
                        ClassId classId = classRequest.classId;
                        List list = classRequest.typeParametersCount;
                        if (classId.isLocal()) {
                            f$$ExternalSyntheticLambda0.m((Object) classId, "Unresolved local class: ");
                            return null;
                        }
                        ClassId outerClassId = classId.getOuterClassId();
                        if (outerClassId == null || (declarationDescriptor = notFoundClasses.getClass(outerClassId, CollectionsKt.drop(list, 1))) == null) {
                            declarationDescriptor = (ClassOrPackageFragmentDescriptor) notFoundClasses.packageFragments.invoke(classId.getPackageFqName());
                        }
                        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
                        boolean isNestedClass = classId.isNestedClass();
                        StorageManager storageManager2 = notFoundClasses.storageManager;
                        Name shortClassName = classId.getShortClassName();
                        Integer num = (Integer) CollectionsKt.firstOrNull(list);
                        return new NotFoundClasses.MockClassDescriptor(storageManager2, declarationDescriptor2, shortClassName, isNestedClass, num != null ? num.intValue() : 0);
                }
            }
        });
    }

    public final ClassDescriptor getClass(ClassId classId, List<Integer> list) {
        classId.getClass();
        list.getClass();
        return (ClassDescriptor) this.classes.invoke(new ClassRequest(classId, list));
    }

    public static final class MockClassDescriptor extends ClassDescriptorBase {
        public final ArrayList declaredTypeParameters;
        public final boolean isInner;
        public final ClassTypeConstructorImpl typeConstructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Name name, boolean z, int i) {
            super(storageManager, declarationDescriptor, name, SourceElement.NO_SOURCE, false);
            storageManager.getClass();
            declarationDescriptor.getClass();
            name.getClass();
            this.isInner = z;
            IntRange until = RangesKt___RangesKt.until(0, i);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
            IntProgressionIterator it = until.iterator();
            while (it.hasNext) {
                int nextInt = it.nextInt();
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.INVARIANT, Name.identifier("T" + nextInt), nextInt, storageManager));
            }
            this.declaredTypeParameters = arrayList;
            this.typeConstructor = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.computeConstructorTypeParameters(this), SetsKt__SetsJVMKt.setOf(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* renamed from: getCompanionObjectDescriptor */
        public ClassDescriptor mo4141getCompanionObjectDescriptor() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassConstructorDescriptor> getConstructors() {
            return EmptySet.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.declaredTypeParameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public Modality getModality() {
            return Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* renamed from: getUnsubstitutedPrimaryConstructor */
        public ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor() {
            return null;
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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
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
            return this.isInner;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isValue() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public MemberScope.Empty getStaticScope() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.typeConstructor;
        }
    }
}
