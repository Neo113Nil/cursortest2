package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public final class LazyWrappedType extends WrappedType {
    public final Function0 computation;
    public final NotNullLazyValue lazyValue;
    public final StorageManager storageManager;

    public LazyWrappedType(StorageManager storageManager, Function0<? extends KotlinType> function0) {
        storageManager.getClass();
        function0.getClass();
        this.storageManager = storageManager;
        this.computation = function0;
        this.lazyValue = storageManager.createLazyValue(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public final KotlinType getDelegate() {
        return (KotlinType) this.lazyValue.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public LazyWrappedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new LazyWrappedType(this.storageManager, new KClassImpl$Data$$Lambda$22(29, kotlinTypeRefiner, this));
    }
}
