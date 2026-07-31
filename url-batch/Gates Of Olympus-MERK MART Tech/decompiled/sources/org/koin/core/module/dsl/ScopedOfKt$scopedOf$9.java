package org.koin.core.module.dsl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: ScopedOf.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ScopedOfKt$scopedOf$9<R> implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> $constructor;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopedOfKt$scopedOf$9(Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        this.$constructor = function8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final R invoke(Scope scoped, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
        Intrinsics.checkNotNullParameter(it, "it");
        Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8 = this.$constructor;
        Intrinsics.reifiedOperationMarker(4, "T1");
        Object obj = scoped.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Object obj2 = scoped.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Object obj3 = scoped.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Object obj4 = scoped.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Object obj5 = scoped.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Object obj6 = scoped.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Object obj7 = scoped.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        return function8.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, scoped.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
