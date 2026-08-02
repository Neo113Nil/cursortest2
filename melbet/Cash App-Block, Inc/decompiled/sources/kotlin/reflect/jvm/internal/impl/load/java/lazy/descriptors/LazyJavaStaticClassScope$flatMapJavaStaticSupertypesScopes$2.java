package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes9.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2 extends DFS.AbstractNodeHandler<ClassDescriptor, Unit> {
    public final /* synthetic */ Function1 $onJavaStaticScope;
    public final /* synthetic */ LinkedHashSet $result;
    public final /* synthetic */ ClassDescriptor $root;

    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(ClassDescriptor classDescriptor, LinkedHashSet linkedHashSet, Function1 function1) {
        this.$root = classDescriptor;
        this.$result = linkedHashSet;
        this.$onJavaStaticScope = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public boolean beforeChildren(ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        if (classDescriptor == this.$root) {
            return true;
        }
        MemberScope staticScope = classDescriptor.getStaticScope();
        staticScope.getClass();
        if (!(staticScope instanceof LazyJavaStaticScope)) {
            return true;
        }
        this.$result.addAll((Collection) this.$onJavaStaticScope.invoke(staticScope));
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public /* bridge */ /* synthetic */ Object result() {
        m4149result();
        return Unit.INSTANCE;
    }

    /* renamed from: result, reason: collision with other method in class */
    public void m4149result() {
    }
}
