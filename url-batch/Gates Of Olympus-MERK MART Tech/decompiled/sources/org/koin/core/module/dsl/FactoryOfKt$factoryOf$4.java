package org.koin.core.module.dsl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: FactoryOf.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class FactoryOfKt$factoryOf$4<R> implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function3<T1, T2, T3, R> $constructor;

    /* JADX WARN: Multi-variable type inference failed */
    public FactoryOfKt$factoryOf$4(Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        this.$constructor = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final R invoke(Scope factory, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        Function3<T1, T2, T3, R> function3 = this.$constructor;
        Intrinsics.reifiedOperationMarker(4, "T1");
        Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        return function3.invoke(obj, obj2, factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
