package org.koin.core.module.dsl;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: ScopeViewModelOf.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ScopeViewModelOfKt$viewModelOf$2<R> implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function1<T1, R> $constructor;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeViewModelOfKt$viewModelOf$2(Function1<? super T1, ? extends R> function1) {
        this.$constructor = function1;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // kotlin.jvm.functions.Function2
    public final ViewModel invoke(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<T1, R> function1 = this.$constructor;
        Intrinsics.reifiedOperationMarker(4, "T1");
        return (ViewModel) function1.invoke(viewModel.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
