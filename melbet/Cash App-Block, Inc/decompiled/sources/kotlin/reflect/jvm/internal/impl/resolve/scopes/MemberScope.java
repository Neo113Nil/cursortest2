package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;

/* loaded from: classes9.dex */
public interface MemberScope extends ResolutionScope {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final Function1<Name, Boolean> getALL_NAME_FILTER() {
            return MemberScope$Companion$$Lambda$0.INSTANCE;
        }
    }

    public static final class DefaultImpls {
        public static void recordLookup(MemberScope memberScope, Name name, LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            ResolutionScope.DefaultImpls.recordLookup(memberScope, name, lookupLocation);
        }
    }

    public static final class Empty extends MemberScopeImpl {
        public static final Empty INSTANCE = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getClassifierNames() {
            return EmptySet.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getFunctionNames() {
            return EmptySet.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getVariableNames() {
            return EmptySet.INSTANCE;
        }
    }

    Set<Name> getClassifierNames();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

    Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation);

    Set<Name> getFunctionNames();

    Set<Name> getVariableNames();
}
