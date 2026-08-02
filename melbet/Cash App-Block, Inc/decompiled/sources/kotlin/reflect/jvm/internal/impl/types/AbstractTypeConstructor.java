package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {
    public final NotNullLazyValue supertypes;

    public final class ModuleViewTypeConstructor implements TypeConstructor {
        public final KotlinTypeRefiner kotlinTypeRefiner;
        public final Lazy refinedSupertypes$delegate;
        public final /* synthetic */ AbstractTypeConstructor this$0;

        public ModuleViewTypeConstructor(AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            this.this$0 = abstractTypeConstructor;
            this.kotlinTypeRefiner = kotlinTypeRefiner;
            this.refinedSupertypes$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KClassImpl$Data$$Lambda$22(28, this, abstractTypeConstructor));
        }

        public final boolean equals(Object obj) {
            return this.this$0.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.this$0.getBuiltIns();
            builtIns.getClass();
            return builtIns;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final ClassifierDescriptor mo4153getDeclarationDescriptor() {
            return this.this$0.mo4153getDeclarationDescriptor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            List<TypeParameterDescriptor> parameters = this.this$0.getParameters();
            parameters.getClass();
            return parameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final Collection getSupertypes() {
            return (List) this.refinedSupertypes$delegate.getValue();
        }

        public final int hashCode() {
            return this.this$0.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean isDenotable() {
            return this.this$0.isDenotable();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return this.this$0.refine(kotlinTypeRefiner);
        }

        public final String toString() {
            return this.this$0.toString();
        }
    }

    public final class Supertypes {
        public final Collection allSupertypes;
        public List supertypesWithoutCycles;

        public Supertypes(Collection collection) {
            collection.getClass();
            this.allSupertypes = collection;
            this.supertypesWithoutCycles = CollectionsKt__CollectionsJVMKt.listOf(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
        }
    }

    public AbstractTypeConstructor(StorageManager storageManager) {
        storageManager.getClass();
        this.supertypes = storageManager.createLazyValueWithPostCompute(new KotlinKPropertyN$$Lambda$0(this, 27), AbstractTypeConstructor$$Lambda$1.INSTANCE, new AbstractTypeConstructor$$Lambda$2(this, 0));
    }

    public abstract Collection computeSupertypes();

    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    public Collection getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return EmptyList.INSTANCE;
    }

    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<KotlinType> getSupertypes() {
        return ((Supertypes) this.supertypes.invoke()).supertypesWithoutCycles;
    }

    public List processSupertypesWithoutCycles(List list) {
        list.getClass();
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    public void reportSupertypeLoopError(KotlinType kotlinType) {
        kotlinType.getClass();
    }
}
