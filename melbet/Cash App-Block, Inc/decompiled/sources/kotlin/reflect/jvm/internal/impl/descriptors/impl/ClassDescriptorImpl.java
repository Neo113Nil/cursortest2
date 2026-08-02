package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public class ClassDescriptorImpl extends ClassDescriptorBase {
    public Set constructors;
    public final ClassKind kind;
    public final Modality modality;
    public ClassConstructorDescriptor primaryConstructor;
    public final ClassTypeConstructorImpl typeConstructor;
    public MemberScope unsubstitutedMemberScope;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format2);
            case 12:
            default:
                throw new IllegalArgumentException(format2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorImpl(DeclarationDescriptor declarationDescriptor, Name name, Modality modality, ClassKind classKind, Collection<KotlinType> collection, SourceElement sourceElement, boolean z, StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name, sourceElement, z);
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (name == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (modality == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (classKind == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (collection == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (storageManager == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        this.modality = modality;
        this.kind = classKind;
        this.typeConstructor = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, collection, storageManager);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations empty = Annotations.Companion.getEMPTY();
        if (empty != null) {
            return empty;
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo4141getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Set set = this.constructors;
        if (set != null) {
            return set;
        }
        $$$reportNull$$$0(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        ClassKind classKind = this.kind;
        if (classKind != null) {
            return classKind;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.modality;
        if (modality != null) {
            return modality;
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty != null) {
            return empty;
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        ClassTypeConstructorImpl classTypeConstructorImpl = this.typeConstructor;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        $$$reportNull$$$0(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(12);
            throw null;
        }
        MemberScope memberScope = this.unsubstitutedMemberScope;
        if (memberScope != null) {
            return memberScope;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor() {
        return this.primaryConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        $$$reportNull$$$0(17);
        throw null;
    }

    public final void initialize(MemberScope memberScope, Set<ClassConstructorDescriptor> set, ClassConstructorDescriptor classConstructorDescriptor) {
        if (memberScope == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        if (set == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        this.unsubstitutedMemberScope = memberScope;
        this.constructors = set;
        this.primaryConstructor = classConstructorDescriptor;
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
        return "class " + getName();
    }
}
