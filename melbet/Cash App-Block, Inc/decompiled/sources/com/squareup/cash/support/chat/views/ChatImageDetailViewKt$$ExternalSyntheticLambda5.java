package com.squareup.cash.support.chat.views;

import android.view.View;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsView;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewEvent;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ChatImageDetailViewKt$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ChatImageDetailViewKt$$ExternalSyntheticLambda5(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(ChatImageDetailViewEvent.TapImageDetail.INSTANCE);
                break;
            default:
                int i2 = InvestingGraphTabsView.$r8$clinit;
                Object tag = view.getTag();
                tag.getClass();
                function1.invoke((HistoricalRange) tag);
                break;
        }
    }
}
