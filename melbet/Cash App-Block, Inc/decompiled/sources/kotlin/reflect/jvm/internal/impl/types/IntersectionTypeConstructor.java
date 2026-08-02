package kotlin.reflect.jvm.internal.impl.types;

import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {
    public KotlinType alternative;
    public final int hashCode;
    public final LinkedHashSet intersectedTypes;

    public IntersectionTypeConstructor(Collection<? extends KotlinType> collection) {
        collection.getClass();
        collection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        this.intersectedTypes = linkedHashSet;
        this.hashCode = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String makeDebugNameForIntersectionType$default(IntersectionTypeConstructor intersectionTypeConstructor, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AbstractTypeConstructor$$Lambda$1.INSTANCE$1;
        }
        return intersectionTypeConstructor.makeDebugNameForIntersectionType(function1);
    }

    public final MemberScope createScopeForKotlinType() {
        return TypeIntersectionScope.Companion.create("member scope for intersection type", this.intersectedTypes);
    }

    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this, EmptyList.INSTANCE, false, createScopeForKotlinType(), new TasksKt$awaitImpl$2$2(this, 22));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntersectionTypeConstructor)) {
            return false;
        }
        return Intrinsics.areEqual(this.intersectedTypes, ((IntersectionTypeConstructor) obj).intersectedTypes);
    }

    public final KotlinType getAlternativeType() {
        return this.alternative;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = ((KotlinType) this.intersectedTypes.iterator().next()).getConstructor().getBuiltIns();
        builtIns.getClass();
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo4153getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        return this.intersectedTypes;
    }

    public int hashCode() {
        return this.hashCode;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public final String makeDebugNameForIntersectionType(final Function1<? super KotlinType, ? extends Object> function1) {
        function1.getClass();
        return CollectionsKt.joinToString$default(CollectionsKt.sortedWith(this.intersectedTypes, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                KotlinType kotlinType = (KotlinType) t;
                kotlinType.getClass();
                Function1 function12 = Function1.this;
                String obj = function12.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t2;
                kotlinType2.getClass();
                return ComparisonsKt__ComparisonsKt.compareValues(obj, function12.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(18, function1), 24);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public IntersectionTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        Collection<KotlinType> supertypes = getSupertypes();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10));
        Iterator<T> it = supertypes.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).refine(kotlinTypeRefiner));
            z = true;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = null;
        if (z) {
            KotlinType alternativeType = getAlternativeType();
            intersectionTypeConstructor = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(kotlinTypeRefiner) : null);
        }
        return intersectionTypeConstructor == null ? this : intersectionTypeConstructor;
    }

    public final IntersectionTypeConstructor setAlternative(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor(this.intersectedTypes);
        intersectionTypeConstructor.alternative = kotlinType;
        return intersectionTypeConstructor;
    }

    public String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }
}
