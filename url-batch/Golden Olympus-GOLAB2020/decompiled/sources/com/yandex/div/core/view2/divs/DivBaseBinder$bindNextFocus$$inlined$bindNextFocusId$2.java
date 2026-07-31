package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.DivViewIdProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2 extends s implements Function1<String, Unit> {
    final /* synthetic */ View $this_bindNextFocus$inlined;
    final /* synthetic */ DivViewIdProvider $viewIdProvider$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2(View view, DivViewIdProvider divViewIdProvider) {
        super(1);
        this.$this_bindNextFocus$inlined = view;
        this.$viewIdProvider$inlined = divViewIdProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.$this_bindNextFocus$inlined.setNextFocusLeftId(this.$viewIdProvider$inlined.getViewId(id));
    }
}
