package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {
    public int hashCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TypeConstructor) && obj.hashCode() == hashCode()) {
            TypeConstructor typeConstructor = (TypeConstructor) obj;
            if (typeConstructor.getParameters().size() == getParameters().size()) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = mo4153getDeclarationDescriptor();
                ClassifierDescriptor mo4153getDeclarationDescriptor2 = typeConstructor.mo4153getDeclarationDescriptor();
                if (mo4153getDeclarationDescriptor2 == null || ErrorUtils.isError(mo4153getDeclarationDescriptor) || DescriptorUtils.isLocal(mo4153getDeclarationDescriptor) || ErrorUtils.isError(mo4153getDeclarationDescriptor2) || DescriptorUtils.isLocal(mo4153getDeclarationDescriptor2)) {
                    return false;
                }
                return isSameClassifier(mo4153getDeclarationDescriptor2);
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo4153getDeclarationDescriptor();

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor = mo4153getDeclarationDescriptor();
        int identityHashCode = (ErrorUtils.isError(mo4153getDeclarationDescriptor) || DescriptorUtils.isLocal(mo4153getDeclarationDescriptor)) ? System.identityHashCode(this) : DescriptorUtils.getFqName(mo4153getDeclarationDescriptor).hashCode();
        this.hashCode = identityHashCode;
        return identityHashCode;
    }

    public abstract boolean isSameClassifier(ClassifierDescriptor classifierDescriptor);
}
