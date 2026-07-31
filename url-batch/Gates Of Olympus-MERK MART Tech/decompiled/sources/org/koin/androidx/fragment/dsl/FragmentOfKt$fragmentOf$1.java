package org.koin.androidx.fragment.dsl;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: FragmentOf.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class FragmentOfKt$fragmentOf$1<R> implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function0<R> $constructor;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentOfKt$fragmentOf$1(Function0<? extends R> function0) {
        this.$constructor = function0;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // kotlin.jvm.functions.Function2
    public final Fragment invoke(Scope fragment, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
        Intrinsics.checkNotNullParameter(it, "it");
        return (Fragment) this.$constructor.invoke();
    }
}
