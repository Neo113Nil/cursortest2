package com.yandex.div.core.view2.divs;

import B.w;
import O1.C0839h0;
import O1.C0892k0;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$bindAccessibilityDelegate$action$1 extends s implements Function2<View, w, Unit> {
    final /* synthetic */ C0839h0 $accessibility;
    final /* synthetic */ List<C0892k0> $actions;
    final /* synthetic */ List<C0892k0> $longTapActions;
    final /* synthetic */ View $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$bindAccessibilityDelegate$action$1(List<C0892k0> list, List<C0892k0> list2, View view, C0839h0 c0839h0) {
        super(2);
        this.$actions = list;
        this.$longTapActions = list2;
        this.$target = view;
        this.$accessibility = c0839h0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (w) obj2);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable View view, @Nullable w wVar) {
        if (!this.$actions.isEmpty() && wVar != null) {
            wVar.b(w.a.f144i);
        }
        if (!this.$longTapActions.isEmpty() && wVar != null) {
            wVar.b(w.a.f145j);
        }
        if (this.$target instanceof ImageView) {
            C0839h0 c0839h0 = this.$accessibility;
            if ((c0839h0 != null ? c0839h0.f6321g : null) == C0839h0.d.AUTO || c0839h0 == null) {
                if (this.$longTapActions.isEmpty() && this.$actions.isEmpty()) {
                    C0839h0 c0839h02 = this.$accessibility;
                    if ((c0839h02 != null ? c0839h02.f6315a : null) == null) {
                        if (wVar == null) {
                            return;
                        }
                        wVar.k0("");
                        return;
                    }
                }
                if (wVar == null) {
                    return;
                }
                wVar.k0("android.widget.ImageView");
            }
        }
    }
}
