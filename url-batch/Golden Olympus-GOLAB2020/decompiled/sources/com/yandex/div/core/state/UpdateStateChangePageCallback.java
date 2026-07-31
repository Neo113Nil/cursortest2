package com.yandex.div.core.state;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class UpdateStateChangePageCallback extends ViewPager2.i {

    @NotNull
    private final String mBlockId;

    @NotNull
    private final DivViewState mDivViewState;

    public UpdateStateChangePageCallback(@NotNull String mBlockId, @NotNull DivViewState mDivViewState) {
        Intrinsics.checkNotNullParameter(mBlockId, "mBlockId");
        Intrinsics.checkNotNullParameter(mDivViewState, "mDivViewState");
        this.mBlockId = mBlockId;
        this.mDivViewState = mDivViewState;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageSelected(int i4) {
        if (i4 != -1) {
            this.mDivViewState.putBlockState(this.mBlockId, new PagerState(i4));
        }
    }
}
