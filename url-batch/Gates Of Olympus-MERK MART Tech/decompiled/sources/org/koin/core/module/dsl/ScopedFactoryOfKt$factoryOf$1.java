package org.koin.core.module.dsl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: ScopedFactoryOf.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ScopedFactoryOfKt$factoryOf$1<R> implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function0<R> $constructor;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopedFactoryOfKt$factoryOf$1(Function0<? extends R> function0) {
        this.$constructor = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final R invoke(Scope factory, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$constructor.invoke();
    }
}
