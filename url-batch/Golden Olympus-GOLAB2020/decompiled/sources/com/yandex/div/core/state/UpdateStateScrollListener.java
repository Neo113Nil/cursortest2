package com.yandex.div.core.state;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class UpdateStateScrollListener extends RecyclerView.u {

    @NotNull
    private final String blockId;

    @NotNull
    private final DivViewState divViewState;

    @NotNull
    private final DivGalleryItemHelper layoutManager;

    public UpdateStateScrollListener(@NotNull String blockId, @NotNull DivViewState divViewState, @NotNull DivGalleryItemHelper layoutManager) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(divViewState, "divViewState");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        this.blockId = blockId;
        this.divViewState = divViewState;
        this.layoutManager = layoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrolled(@NotNull RecyclerView recyclerView, int i4, int i5) {
        View view;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i4, i5);
        int firstVisibleItemPosition = this.layoutManager.firstVisibleItemPosition();
        RecyclerView.E findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(firstVisibleItemPosition);
        this.divViewState.putBlockState(this.blockId, new GalleryState(firstVisibleItemPosition, (findViewHolderForLayoutPosition == null || (view = findViewHolderForLayoutPosition.itemView) == null) ? 0 : this.layoutManager.calcScrollOffset(view)));
    }
}
