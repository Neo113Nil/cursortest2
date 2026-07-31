package com.yandex.div.core.widget;

import com.yandex.div.core.widget.GridContainer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class GridContainer$Grid$_rows$1 extends s implements Function0<List<? extends GridContainer.Line>> {
    final /* synthetic */ GridContainer.Grid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GridContainer$Grid$_rows$1(GridContainer.Grid grid) {
        super(0);
        this.this$0 = grid;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<GridContainer.Line> invoke() {
        List<GridContainer.Line> measureRows;
        measureRows = this.this$0.measureRows();
        return measureRows;
    }
}
