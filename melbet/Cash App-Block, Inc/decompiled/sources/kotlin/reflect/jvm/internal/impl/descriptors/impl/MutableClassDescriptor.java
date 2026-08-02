package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
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
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public class MutableClassDescriptor extends ClassDescriptorBase {
    public final boolean isInner;
    public final ClassKind kind;
    public Modality modality;
    public final StorageManager storageManager;
    public final ArrayList supertypes;
    public ClassTypeConstructorImpl typeConstructor;
    public ArrayList typeParameters;
    public DescriptorVisibility visibility;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableClassDescriptor(DeclarationDescriptor declarationDescriptor, ClassKind classKind, boolean z, boolean z2, Name name, SourceElement sourceElement, StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name, sourceElement, z2);
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (classKind == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (name == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (storageManager == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        this.supertypes = new ArrayList();
        this.storageManager = storageManager;
        this.kind = classKind;
        this.isInner = z;
    }

    public void createTypeConstructor() {
        this.typeConstructor = new ClassTypeConstructorImpl(this, this.typeParameters, this.supertypes, this.storageManager);
        Iterator<ClassConstructorDescriptor> it = getConstructors().iterator();
        while (it.hasNext()) {
            ((ClassConstructorDescriptorImpl) it.next()).setReturnType(getDefaultType());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations empty = Annotations.Companion.getEMPTY();
        if (empty != null) {
            return empty;
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo4141getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Set<ClassConstructorDescriptor> getConstructors() {
        Set<ClassConstructorDescriptor> set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        ArrayList arrayList = this.typeParameters;
        if (arrayList != null) {
            return arrayList;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        ClassKind classKind = this.kind;
        if (classKind != null) {
            return classKind;
        }
        $$$reportNull$$$0(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.modality;
        if (modality != null) {
            return modality;
        }
        $$$reportNull$$$0(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty != null) {
            return empty;
        }
        $$$reportNull$$$0(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        ClassTypeConstructorImpl classTypeConstructorImpl = this.typeConstructor;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        $$$reportNull$$$0(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(16);
            throw null;
        }
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty != null) {
            return empty;
        }
        $$$reportNull$$$0(17);
        throw null;
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
        DescriptorVisibility descriptorVisibility = this.visibility;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        $$$reportNull$$$0(10);
        throw null;
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
        return this.isInner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public void setModality(Modality modality) {
        if (modality != null) {
            this.modality = modality;
        } else {
            $$$reportNull$$$0(6);
            throw null;
        }
    }

    public void setTypeParameterDescriptors(List<TypeParameterDescriptor> list) {
        if (list == null) {
            $$$reportNull$$$0(14);
            throw null;
        }
        if (this.typeParameters == null) {
            this.typeParameters = new ArrayList(list);
        } else {
            a$$ExternalSyntheticBUOutline0.m$2(getName(), "Type parameters are already set for ");
        }
    }

    public void setVisibility(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            this.visibility = descriptorVisibility;
        } else {
            $$$reportNull$$$0(9);
            throw null;
        }
    }

    public String toString() {
        return DeclarationDescriptorImpl.toString(this);
    }
}
