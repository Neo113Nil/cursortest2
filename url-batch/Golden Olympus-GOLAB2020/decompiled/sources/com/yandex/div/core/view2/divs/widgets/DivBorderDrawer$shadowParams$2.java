package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer.ShadowParams;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBorderDrawer$shadowParams$2 extends s implements Function0<DivBorderDrawer.ShadowParams> {
    final /* synthetic */ DivBorderDrawer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBorderDrawer$shadowParams$2(DivBorderDrawer divBorderDrawer) {
        super(0);
        this.this$0 = divBorderDrawer;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DivBorderDrawer.ShadowParams invoke() {
        return this.this$0.new ShadowParams();
    }
}
