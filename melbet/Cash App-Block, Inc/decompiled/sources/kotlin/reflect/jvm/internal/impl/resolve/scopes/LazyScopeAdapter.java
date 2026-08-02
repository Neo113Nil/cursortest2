package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes9.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {
    public final NotNullLazyValue lazyScope;

    public LazyScopeAdapter(StorageManager storageManager, Function0<? extends MemberScope> function0) {
        storageManager.getClass();
        function0.getClass();
        this.lazyScope = storageManager.createLazyValue(new LazyScopeAdapter$$Lambda$0(0, function0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public final MemberScope getWorkerScope() {
        return (MemberScope) this.lazyScope.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter(Function0<? extends MemberScope> function0) {
        this(null, function0, 1, 0 == true ? 1 : 0);
        function0.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LazyScopeAdapter(StorageManager storageManager, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, function0);
        if ((i & 1) != 0) {
            storageManager = LockBasedStorageManager.NO_LOCKS;
            storageManager.getClass();
        }
    }
}
