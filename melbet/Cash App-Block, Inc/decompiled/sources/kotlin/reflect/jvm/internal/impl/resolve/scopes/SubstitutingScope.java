package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class SubstitutingScope implements MemberScope {
    public final Lazy _allDescriptors$delegate;
    public final TypeSubstitutor capturingSubstitutor;
    public HashMap substitutedDescriptors;
    public final Lazy substitutor$delegate;
    public final MemberScope workerScope;

    public SubstitutingScope(MemberScope memberScope, TypeSubstitutor typeSubstitutor) {
        memberScope.getClass();
        typeSubstitutor.getClass();
        this.workerScope = memberScope;
        this.substitutor$delegate = LazyKt.lazy(new KotlinKPropertyN$$Lambda$0(typeSubstitutor, 21));
        TypeSubstitution substitution = typeSubstitutor.getSubstitution();
        substitution.getClass();
        this.capturingSubstitutor = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this._allDescriptors$delegate = LazyKt.lazy(new KotlinKPropertyN$$Lambda$0(this, 22));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor mo4154getContributedClassifier = this.workerScope.mo4154getContributedClassifier(name, lookupLocation);
        if (mo4154getContributedClassifier != null) {
            return (ClassifierDescriptor) substitute(mo4154getContributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return (Collection) this._allDescriptors$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return substitute(this.workerScope.getContributedFunctions(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return substitute(this.workerScope.getContributedVariables(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public /* bridge */ void mo4157recordLookup(Name name, LookupLocation lookupLocation) {
        MemberScope.DefaultImpls.recordLookup(this, name, lookupLocation);
    }

    public final DeclarationDescriptor substitute(DeclarationDescriptor declarationDescriptor) {
        TypeSubstitutor typeSubstitutor = this.capturingSubstitutor;
        if (typeSubstitutor.isEmpty()) {
            return declarationDescriptor;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new HashMap();
        }
        HashMap hashMap = this.substitutedDescriptors;
        hashMap.getClass();
        Object obj = hashMap.get(declarationDescriptor);
        if (obj == null) {
            if (!(declarationDescriptor instanceof Substitutable)) {
                Path$$ExternalSyntheticBUOutline0.m$1(declarationDescriptor, "Unknown descriptor in scope: ");
                return null;
            }
            obj = ((Substitutable) declarationDescriptor).substitute(typeSubstitutor);
            if (obj == null) {
                f$$ExternalSyntheticLambda0.m$1("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", declarationDescriptor, " substitution fails");
                return null;
            }
            hashMap.put(declarationDescriptor, obj);
        }
        return (DeclarationDescriptor) obj;
    }

    public final Collection substitute(Collection collection) {
        if (this.capturingSubstitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet newLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            newLinkedHashSetWithExpectedSize.add(substitute((DeclarationDescriptor) it.next()));
        }
        return newLinkedHashSetWithExpectedSize;
    }
}
