package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final MemberScope getRefinedMemberScopeIfPossible$descriptors(ClassDescriptor classDescriptor, TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope memberScope;
            classDescriptor.getClass();
            typeSubstitution.getClass();
            kotlinTypeRefiner.getClass();
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (memberScope = moduleAwareClassDescriptor.getMemberScope(typeSubstitution, kotlinTypeRefiner)) != null) {
                return memberScope;
            }
            MemberScope memberScope2 = classDescriptor.getMemberScope(typeSubstitution);
            memberScope2.getClass();
            return memberScope2;
        }

        public final MemberScope getRefinedUnsubstitutedMemberScopeIfPossible$descriptors(ClassDescriptor classDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope unsubstitutedMemberScope;
            classDescriptor.getClass();
            kotlinTypeRefiner.getClass();
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (unsubstitutedMemberScope = moduleAwareClassDescriptor.getUnsubstitutedMemberScope(kotlinTypeRefiner)) != null) {
                return unsubstitutedMemberScope;
            }
            MemberScope unsubstitutedMemberScope2 = classDescriptor.getUnsubstitutedMemberScope();
            unsubstitutedMemberScope2.getClass();
            return unsubstitutedMemberScope2;
        }
    }

    public abstract MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ /* synthetic */ ClassifierDescriptor getOriginal() {
        return getOriginal();
    }

    public abstract MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ /* synthetic */ DeclarationDescriptor getOriginal() {
        return getOriginal();
    }
}
