package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public abstract class AbstractClassDescriptor extends ModuleAwareClassDescriptor {
    public final NotNullLazyValue defaultType;
    public final Name name;
    public final NotNullLazyValue thisAsReceiverParameter;
    public final NotNullLazyValue unsubstitutedInnerClassesScope;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$1, reason: invalid class name */
    public final class AnonymousClass1 implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ AbstractClassDescriptor this$0;

        public /* synthetic */ AnonymousClass1(AbstractClassDescriptor abstractClassDescriptor, int i) {
            this.$r8$classId = i;
            this.this$0 = abstractClassDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            AbstractClassDescriptor abstractClassDescriptor = this.this$0;
            switch (i) {
                case 0:
                    return TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope(), new KClasses$$Lambda$2(this, 27));
                case 1:
                    return new InnerClassesScopeWrapper(abstractClassDescriptor.getUnsubstitutedMemberScope());
                default:
                    return new LazyClassReceiverParameterDescriptor(abstractClassDescriptor);
            }
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(format2);
        }
        throw new IllegalStateException(format2);
    }

    public AbstractClassDescriptor(StorageManager storageManager, Name name) {
        int i = 0;
        if (storageManager == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        int i2 = 1;
        if (name == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        this.name = name;
        this.defaultType = storageManager.createLazyValue(new AnonymousClass1(this, i));
        this.unsubstitutedInnerClassesScope = storageManager.createLazyValue(new AnonymousClass1(this, i2));
        this.thisAsReceiverParameter = storageManager.createLazyValue(new AnonymousClass1(this, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleType = (SimpleType) this.defaultType.invoke();
        if (simpleType != null) {
            return simpleType;
        }
        $$$reportNull$$$0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(11);
            throw null;
        }
        if (!typeSubstitution.isEmpty()) {
            return new SubstitutingScope(getUnsubstitutedMemberScope(kotlinTypeRefiner), TypeSubstitutor.create(typeSubstitution));
        }
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (unsubstitutedMemberScope != null) {
            return unsubstitutedMemberScope;
        }
        $$$reportNull$$$0(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.name;
        if (name != null) {
            return name;
        }
        $$$reportNull$$$0(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) this.thisAsReceiverParameter.invoke();
        if (receiverParameterDescriptor != null) {
            return receiverParameterDescriptor;
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope memberScope = (MemberScope) this.unsubstitutedInnerClassesScope.invoke();
        if (memberScope != null) {
            return memberScope;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (unsubstitutedMemberScope != null) {
            return unsubstitutedMemberScope;
        }
        $$$reportNull$$$0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ClassDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
        }
        $$$reportNull$$$0(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ClassDescriptor getOriginal() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            MemberScope memberScope = getMemberScope(typeSubstitution, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
            if (memberScope != null) {
                return memberScope;
            }
            $$$reportNull$$$0(16);
            throw null;
        }
        $$$reportNull$$$0(15);
        throw null;
    }
}
