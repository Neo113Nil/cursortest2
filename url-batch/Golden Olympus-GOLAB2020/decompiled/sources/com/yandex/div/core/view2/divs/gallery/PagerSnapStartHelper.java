package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class PagerSnapStartHelper extends q {

    @Nullable
    private p _horizontalHelper;

    @Nullable
    private p _verticalHelper;
    private int itemSpacing;

    public PagerSnapStartHelper(int i4) {
        this.itemSpacing = i4;
    }

    private final int distanceToCenter(RecyclerView.p pVar, View view, p pVar2) {
        float y4;
        int height;
        if (pVar.canScrollHorizontally()) {
            y4 = view.getX();
            height = view.getWidth() / 2;
        } else {
            y4 = view.getY();
            height = view.getHeight() / 2;
        }
        return ((int) (y4 + height)) - (pVar.getClipToPadding() ? pVar2.n() + (pVar2.o() / 2) : pVar2.h() / 2);
    }

    private final p getHorizontalHelper(RecyclerView.p pVar) {
        p pVar2 = this._horizontalHelper;
        if (pVar2 != null) {
            if (!Intrinsics.areEqual(pVar2.k(), pVar)) {
                pVar2 = null;
            }
            if (pVar2 != null) {
                return pVar2;
            }
        }
        p a4 = p.a(pVar);
        this._horizontalHelper = a4;
        Intrinsics.checkNotNullExpressionValue(a4, "createHorizontalHelper(l… _horizontalHelper = it }");
        return a4;
    }

    private final p getVerticalHelper(RecyclerView.p pVar) {
        p pVar2 = this._verticalHelper;
        if (pVar2 != null) {
            if (!Intrinsics.areEqual(pVar2.k(), pVar)) {
                pVar2 = null;
            }
            if (pVar2 != null) {
                return pVar2;
            }
        }
        p c4 = p.c(pVar);
        this._verticalHelper = c4;
        Intrinsics.checkNotNullExpressionValue(c4, "createVerticalHelper(lay… { _verticalHelper = it }");
        return c4;
    }

    @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.u
    @NotNull
    public int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.p layoutManager, @NotNull View targetView) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, targetView, getHorizontalHelper(layoutManager));
            return iArr;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(layoutManager, targetView, getVerticalHelper(layoutManager));
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.u
    public int findTargetSnapPosition(@NotNull RecyclerView.p manager, int i4, int i5) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        DivGalleryItemHelper divGalleryItemHelper = (DivGalleryItemHelper) manager;
        if (divGalleryItemHelper.getLayoutManagerOrientation() != 0) {
            i4 = i5;
        } else if (manager.getLayoutDirection() != 0) {
            i4 = -i4;
        }
        int firstCompletelyVisibleItemPosition = i4 < 0 ? divGalleryItemHelper.firstCompletelyVisibleItemPosition() : divGalleryItemHelper.lastCompletelyVisibleItemPosition();
        if (firstCompletelyVisibleItemPosition != -1) {
            return firstCompletelyVisibleItemPosition;
        }
        int firstVisibleItemPosition = divGalleryItemHelper.firstVisibleItemPosition();
        int lastVisibleItemPosition = divGalleryItemHelper.lastVisibleItemPosition();
        if (lastVisibleItemPosition == firstVisibleItemPosition) {
            if (lastVisibleItemPosition == -1) {
                return 0;
            }
        } else if (i4 < 0) {
            return firstVisibleItemPosition;
        }
        return lastVisibleItemPosition;
    }

    public final void setItemSpacing(int i4) {
        this.itemSpacing = i4;
    }
}
