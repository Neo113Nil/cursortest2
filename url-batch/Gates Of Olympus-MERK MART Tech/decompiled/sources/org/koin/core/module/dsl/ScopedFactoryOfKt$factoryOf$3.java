package org.koin.core.module.dsl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: ScopedFactoryOf.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ScopedFactoryOfKt$factoryOf$3<R> implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function2<T1, T2, R> $constructor;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopedFactoryOfKt$factoryOf$3(Function2<? super T1, ? super T2, ? extends R> function2) {
        this.$constructor = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final R invoke(Scope factory, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        Function2<T1, T2, R> function2 = this.$constructor;
        Intrinsics.reifiedOperationMarker(4, "T1");
        Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        return function2.invoke(obj, factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
