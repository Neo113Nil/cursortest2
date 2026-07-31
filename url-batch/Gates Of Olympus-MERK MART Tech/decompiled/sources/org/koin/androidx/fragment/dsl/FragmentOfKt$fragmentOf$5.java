package org.koin.androidx.fragment.dsl;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: FragmentOf.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class FragmentOfKt$fragmentOf$5<R> implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function4<T1, T2, T3, T4, R> $constructor;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentOfKt$fragmentOf$5(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        this.$constructor = function4;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
    @Override // kotlin.jvm.functions.Function2
    public final Fragment invoke(Scope fragment, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
        Intrinsics.checkNotNullParameter(it, "it");
        Function4<T1, T2, T3, T4, R> function4 = this.$constructor;
        Intrinsics.reifiedOperationMarker(4, "T1");
        Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        return (Fragment) function4.invoke(obj, obj2, obj3, fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
