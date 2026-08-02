package com.squareup.cash.support.chat.views.transcript;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.util.coroutines.StateFlowKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes7.dex */
public final class TranscriptRecyclerView extends RecyclerView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean fadingEdgeEnabled;
    public final BetterScrollLinearLayoutManager linearLayoutManager;
    public final SharedFlowImpl scrollDownSharedFlow;
    public final SharedFlowImpl scrollEvents;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ScrollDirection {
        public static final /* synthetic */ ScrollDirection[] $VALUES;
        public static final ScrollDirection DOWN;
        public static final ScrollDirection UP;

        static {
            ScrollDirection scrollDirection = new ScrollDirection("UP", 0);
            UP = scrollDirection;
            ScrollDirection scrollDirection2 = new ScrollDirection("DOWN", 1);
            DOWN = scrollDirection2;
            $VALUES = new ScrollDirection[]{scrollDirection, scrollDirection2};
        }

        public static ScrollDirection valueOf(String str) {
            return (ScrollDirection) Enum.valueOf(ScrollDirection.class, str);
        }

        public static ScrollDirection[] values() {
            return (ScrollDirection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranscriptRecyclerView(Context context) {
        super(context);
        context.getClass();
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.scrollDownSharedFlow = MutableSharedFlow$default;
        BetterScrollLinearLayoutManager betterScrollLinearLayoutManager = new BetterScrollLinearLayoutManager(context);
        this.linearLayoutManager = betterScrollLinearLayoutManager;
        this.scrollEvents = MutableSharedFlow$default;
        setLayoutManager(betterScrollLinearLayoutManager);
        setItemAnimator(new TranscriptItemAnimator());
        betterScrollLinearLayoutManager.setStackFromEnd(true);
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        return this.fadingEdgeEnabled ? super.getBottomFadingEdgeStrength() : RecyclerView.DECELERATION_RATE;
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        return RecyclerView.DECELERATION_RATE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i) {
        SharedFlowImpl sharedFlowImpl = this.scrollDownSharedFlow;
        if (i > 0) {
            StateFlowKt.emitOrThrow(sharedFlowImpl, ScrollDirection.DOWN);
        } else if (i < 0) {
            StateFlowKt.emitOrThrow(sharedFlowImpl, ScrollDirection.UP);
        }
    }

    public final void setBottomFadingEdgeEnabled(boolean z) {
        if (this.fadingEdgeEnabled != z) {
            this.fadingEdgeEnabled = z;
            setVerticalFadingEdgeEnabled(z);
        }
    }

    public final void smoothScrollToBottom() {
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int i = itemCount < 1 ? 0 : itemCount - 1;
            BetterScrollLinearLayoutManager betterScrollLinearLayoutManager = this.linearLayoutManager;
            if (i - betterScrollLinearLayoutManager.findLastVisibleItemPosition() < 3) {
                smoothScrollToPosition(i);
                return;
            }
            if (i - betterScrollLinearLayoutManager.findLastVisibleItemPosition() > 3) {
                scrollToPosition(i - 3);
            }
            post(new TranscriptRecyclerView$$ExternalSyntheticLambda0(this, i, 0));
        }
    }
}
