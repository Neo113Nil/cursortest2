package com.yandex.div.core.view2.divs;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$bindTapActions$setTapListener$1 extends s implements Function0<Unit> {
    final /* synthetic */ View.OnClickListener $listener;
    final /* synthetic */ View $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$bindTapActions$setTapListener$1(View.OnClickListener onClickListener, View view) {
        super(0);
        this.$listener = onClickListener;
        this.$target = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m71invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m71invoke() {
        this.$listener.onClick(this.$target);
    }
}
