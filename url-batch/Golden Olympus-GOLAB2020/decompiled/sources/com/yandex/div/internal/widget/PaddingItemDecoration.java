package com.yandex.div.internal.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class PaddingItemDecoration extends RecyclerView.o {
    private final int crossItemPadding;
    private final int midItemPadding;
    private final int orientation;
    private final int paddingBottom;
    private final int paddingLeft;
    private final int paddingRight;
    private final int paddingTop;

    public /* synthetic */ PaddingItemDecoration(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i4, (i11 & 2) != 0 ? 0 : i5, (i11 & 4) != 0 ? 0 : i6, (i11 & 8) != 0 ? 0 : i7, (i11 & 16) != 0 ? 0 : i8, (i11 & 32) != 0 ? 0 : i9, (i11 & 64) != 0 ? 0 : i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int i4;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.p layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            i4 = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unsupported layoutManger: " + layoutManager);
                }
            }
            i4 = 1;
        }
        if (i4 != 1) {
            int i5 = this.midItemPadding / 2;
            int i6 = this.crossItemPadding / 2;
            int i7 = this.orientation;
            if (i7 == 0) {
                outRect.set(i5, i6, i5, i6);
                return;
            }
            if (i7 == 1) {
                outRect.set(i6, i5, i6, i5);
                return;
            }
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported orientation: " + this.orientation);
                return;
            }
            return;
        }
        RecyclerView.h adapter = parent.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            boolean z4 = childAdapterPosition == 0;
            int i8 = itemCount - 1;
            boolean z5 = childAdapterPosition == i8;
            int i9 = this.orientation;
            if (i9 == 0) {
                if (ViewsKt.isLayoutRtl(parent)) {
                    z4 = childAdapterPosition == i8;
                    z5 = childAdapterPosition == 0;
                }
                outRect.set(z4 ? this.paddingLeft : 0, this.paddingTop, z5 ? this.paddingRight : this.midItemPadding, this.paddingBottom);
                return;
            }
            if (i9 == 1) {
                outRect.set(this.paddingLeft, z4 ? this.paddingTop : 0, this.paddingRight, z5 ? this.paddingBottom : this.midItemPadding);
                return;
            }
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported orientation: " + this.orientation);
            }
        }
    }

    public PaddingItemDecoration(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.paddingLeft = i4;
        this.midItemPadding = i5;
        this.crossItemPadding = i6;
        this.paddingRight = i7;
        this.paddingTop = i8;
        this.paddingBottom = i9;
        this.orientation = i10;
    }
}
