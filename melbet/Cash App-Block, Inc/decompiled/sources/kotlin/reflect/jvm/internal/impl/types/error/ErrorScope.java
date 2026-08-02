package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes9.dex */
public class ErrorScope implements MemberScope {
    public final String debugMessage;

    public ErrorScope(ErrorScopeKind errorScopeKind, String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        String debugMessage = errorScopeKind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.debugMessage = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        Name special = Name.special(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{name}, 1)));
        special.getClass();
        return new ErrorClassDescriptor(special);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Set<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return SetsKt__SetsJVMKt.setOf(new ErrorFunctionDescriptor(ErrorUtils.INSTANCE.getErrorClass()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return ErrorUtils.INSTANCE.getErrorPropertyGroup();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo4157recordLookup(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
    }

    public String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("ErrorScope{"), this.debugMessage, '}');
    }
}
