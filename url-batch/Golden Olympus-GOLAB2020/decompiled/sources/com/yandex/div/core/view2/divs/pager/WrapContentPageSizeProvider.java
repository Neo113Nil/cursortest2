package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class WrapContentPageSizeProvider extends DivPagerPageSizeProvider {
    private final boolean isHorizontal;

    @NotNull
    private final RecyclerView recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentPageSizeProvider(@NotNull RecyclerView recyclerView, boolean z4, int i4, @NotNull DivPagerPaddingsHolder paddings, @NotNull E9.c alignment) {
        super(i4, paddings, alignment);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.recyclerView = recyclerView;
        this.isHorizontal = z4;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    @Nullable
    public Float getItemSize(int i4) {
        View findViewByPosition;
        RecyclerView.p layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(i4)) == null) {
            return null;
        }
        return Float.valueOf(this.isHorizontal ? findViewByPosition.getWidth() : findViewByPosition.getHeight());
    }
}
