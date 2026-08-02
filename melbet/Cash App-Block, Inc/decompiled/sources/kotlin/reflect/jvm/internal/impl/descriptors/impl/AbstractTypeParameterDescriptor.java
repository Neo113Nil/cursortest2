package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {
    public final NotNullLazyValue defaultType;
    public final int index;
    public final boolean reified;
    public final StorageManager storageManager;
    public final NotNullLazyValue typeConstructor;
    public final Variance variance;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$2, reason: invalid class name */
    public final class AnonymousClass2 implements Function0 {
        public final /* synthetic */ Name val$name;

        public AnonymousClass2(Name name) {
            this.val$name = name;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), AbstractTypeParameterDescriptor.this.getTypeConstructor(), Collections.EMPTY_LIST, false, new LazyScopeAdapter(new KotlinKPropertyN$$Lambda$0(this, 9)));
        }
    }

    public final class TypeParameterTypeConstructor extends AbstractTypeConstructor {
        public final SupertypeLoopChecker supertypeLoopChecker;
        public final /* synthetic */ AbstractTypeParameterDescriptor this$0;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(format2);
            }
            throw new IllegalStateException(format2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeParameterTypeConstructor(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            if (storageManager == null) {
                $$$reportNull$$$0(0);
                throw null;
            }
            this.this$0 = abstractTypeParameterDescriptor;
            this.supertypeLoopChecker = supertypeLoopChecker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection computeSupertypes() {
            List resolveUpperBounds = this.this$0.resolveUpperBounds();
            if (resolveUpperBounds != null) {
                return resolveUpperBounds;
            }
            $$$reportNull$$$0(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final KotlinType defaultSupertypeIfEmpty() {
            return ErrorUtils.createErrorType(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(this.this$0);
            if (builtIns != null) {
                return builtIns;
            }
            $$$reportNull$$$0(4);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final ClassifierDescriptor mo4153getDeclarationDescriptor() {
            return this.this$0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            $$$reportNull$$$0(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker getSupertypeLoopChecker() {
            SupertypeLoopChecker supertypeLoopChecker = this.supertypeLoopChecker;
            if (supertypeLoopChecker != null) {
                return supertypeLoopChecker;
            }
            $$$reportNull$$$0(5);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean isDenotable() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        public final boolean isSameClassifier(ClassifierDescriptor classifierDescriptor) {
            return (classifierDescriptor instanceof TypeParameterDescriptor) && DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent(this.this$0, (TypeParameterDescriptor) classifierDescriptor, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final List processSupertypesWithoutCycles(List list) {
            if (list == null) {
                $$$reportNull$$$0(7);
                throw null;
            }
            List processBoundsWithoutCycles = this.this$0.processBoundsWithoutCycles(list);
            if (processBoundsWithoutCycles != null) {
                return processBoundsWithoutCycles;
            }
            $$$reportNull$$$0(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final void reportSupertypeLoopError(KotlinType kotlinType) {
            if (kotlinType != null) {
                this.this$0.reportSupertypeLoopError(kotlinType);
            } else {
                $$$reportNull$$$0(6);
                throw null;
            }
        }

        public final String toString() {
            return this.this$0.getName().toString();
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format2);
            case 12:
            default:
                throw new IllegalArgumentException(format2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeParameterDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, Variance variance, boolean z, int i, SourceElement sourceElement, SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (storageManager == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (name == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (variance == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (supertypeLoopChecker == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        this.variance = variance;
        this.reified = z;
        this.index = i;
        this.typeConstructor = storageManager.createLazyValue(new KClassImpl$Data$$Lambda$23(this, storageManager, supertypeLoopChecker));
        this.defaultType = storageManager.createLazyValue(new AnonymousClass2(name));
        this.storageManager = storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitTypeParameterDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleType = (SimpleType) this.defaultType.invoke();
        if (simpleType != null) {
            return simpleType;
        }
        $$$reportNull$$$0(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) super.getOriginal();
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        $$$reportNull$$$0(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public StorageManager getStorageManager() {
        StorageManager storageManager = this.storageManager;
        if (storageManager != null) {
            return storageManager;
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = (TypeConstructor) this.typeConstructor.invoke();
        if (typeConstructor != null) {
            return typeConstructor;
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> supertypes = ((TypeParameterTypeConstructor) getTypeConstructor()).getSupertypes();
        if (supertypes != null) {
            return supertypes;
        }
        $$$reportNull$$$0(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public Variance getVariance() {
        Variance variance = this.variance;
        if (variance != null) {
            return variance;
        }
        $$$reportNull$$$0(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.reified;
    }

    public List processBoundsWithoutCycles(List list) {
        if (list == null) {
            $$$reportNull$$$0(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    public abstract void reportSupertypeLoopError(KotlinType kotlinType);

    public abstract List resolveUpperBounds();
}
