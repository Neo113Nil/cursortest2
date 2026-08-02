package kotlin.reflect.jvm.internal.impl.resolve;

import androidx.camera.video.VideoCapture;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public final class DescriptorEquivalenceForOverrides {
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z, boolean z2, boolean z3, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z, z4, z3, kotlinTypeRefiner);
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = OverridingUtil.AnonymousClass2.INSTANCE;
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z, function2);
    }

    public static SourceElement singleSource(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            overriddenDescriptors.getClass();
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.singleOrNull(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public final boolean areCallableDescriptorsEquivalent(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z, boolean z2, boolean z3, KotlinTypeRefiner kotlinTypeRefiner) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        kotlinTypeRefiner.getClass();
        if (!callableDescriptor.equals(callableDescriptor2)) {
            if (Intrinsics.areEqual(callableDescriptor.getName(), callableDescriptor2.getName()) && ((!z2 || !(callableDescriptor instanceof MemberDescriptor) || !(callableDescriptor2 instanceof MemberDescriptor) || ((MemberDescriptor) callableDescriptor).isExpect() == ((MemberDescriptor) callableDescriptor2).isExpect()) && ((!Intrinsics.areEqual(callableDescriptor.getContainingDeclaration(), callableDescriptor2.getContainingDeclaration()) || (z && Intrinsics.areEqual(singleSource(callableDescriptor), singleSource(callableDescriptor2)))) && !DescriptorUtils.isLocal(callableDescriptor) && !DescriptorUtils.isLocal(callableDescriptor2)))) {
                DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
                DeclarationDescriptor containingDeclaration2 = callableDescriptor2.getContainingDeclaration();
                if (((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? false : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z, false, 8, null)) {
                    OverridingUtil create = OverridingUtil.create(kotlinTypeRefiner, new VideoCapture.AnonymousClass3(callableDescriptor, callableDescriptor2, z));
                    create.getClass();
                    boolean z4 = !z3;
                    OverridingUtil.OverrideCompatibilityInfo.Result result = create.isOverridableBy(callableDescriptor, callableDescriptor2, null, z4).getResult();
                    OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
                    if (result != result2 || create.isOverridableBy(callableDescriptor2, callableDescriptor, null, z4).getResult() != result2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean areEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z, boolean z2) {
        return ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) ? Intrinsics.areEqual(((ClassDescriptor) declarationDescriptor).getTypeConstructor(), ((ClassDescriptor) declarationDescriptor2).getTypeConstructor()) : ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) ? areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z, null, 8, null) : ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) ? areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z, z2, false, KotlinTypeRefiner.Default.INSTANCE, 16, null) : ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.areEqual(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : Intrinsics.areEqual(declarationDescriptor, declarationDescriptor2);
    }

    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2) {
        typeParameterDescriptor.getClass();
        typeParameterDescriptor2.getClass();
        function2.getClass();
        if (typeParameterDescriptor.equals(typeParameterDescriptor2)) {
            return true;
        }
        if (Intrinsics.areEqual(typeParameterDescriptor.getContainingDeclaration(), typeParameterDescriptor2.getContainingDeclaration())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = typeParameterDescriptor2.getContainingDeclaration();
        return (((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? ((Boolean) function2.invoke(containingDeclaration, containingDeclaration2)).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z, false, 8, null)) && typeParameterDescriptor.getIndex() == typeParameterDescriptor2.getIndex();
    }

    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z) {
        typeParameterDescriptor.getClass();
        typeParameterDescriptor2.getClass();
        return areTypeParametersEquivalent$default(this, typeParameterDescriptor, typeParameterDescriptor2, z, null, 8, null);
    }
}
