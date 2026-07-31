package org.koin.androidx.viewmodel.dsl;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: ViewModelOf.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ViewModelOfKt$viewModelOf$3<R> implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function2<T1, T2, R> $constructor;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelOfKt$viewModelOf$3(Function2<? super T1, ? super T2, ? extends R> function2) {
        this.$constructor = function2;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // kotlin.jvm.functions.Function2
    public final ViewModel invoke(Scope viewModel, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        Function2<T1, T2, R> function2 = this.$constructor;
        Intrinsics.reifiedOperationMarker(4, "T1");
        Object obj = viewModel.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        return (ViewModel) function2.invoke(obj, viewModel.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
