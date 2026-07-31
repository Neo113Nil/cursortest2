package com.yandex.div.core.view2.divs;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$bindDivActions$1$4 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Function0<Unit> $onApply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$bindDivActions$1$4(Function0<Unit> function0) {
        super(1);
        this.$onApply = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m67invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m67invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onApply.invoke();
    }
}
