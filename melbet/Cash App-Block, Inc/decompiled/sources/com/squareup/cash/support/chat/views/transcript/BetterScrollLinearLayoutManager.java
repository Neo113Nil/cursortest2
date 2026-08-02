package com.squareup.cash.support.chat.views.transcript;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/support/chat/views/transcript/BetterScrollLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "views"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetterScrollLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        state.getClass();
        Context context = recyclerView.getContext();
        context.getClass();
        CarouselLayoutManager.AnonymousClass1 anonymousClass1 = new CarouselLayoutManager.AnonymousClass1(context, 3);
        anonymousClass1.mTargetPosition = i;
        startSmoothScroll(anonymousClass1);
    }
}
