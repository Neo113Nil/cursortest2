package com.yandex.div.core.view2.divs.gallery;

import O1.C0970o6;
import O1.Z;
import android.view.View;
import androidx.core.view.AbstractC1293g0;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivGalleryScrollListener extends RecyclerView.u {
    private boolean alreadyLogged;

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private String direction;

    @NotNull
    private final Div2View divView;

    @NotNull
    private final C0970o6 galleryDiv;

    @NotNull
    private final DivGalleryItemHelper galleryItemHelper;
    private final int minimumSignificantDx;

    @NotNull
    private final DivRecyclerView recycler;
    private int totalDelta;

    public DivGalleryScrollListener(@NotNull BindingContext bindingContext, @NotNull DivRecyclerView recycler, @NotNull DivGalleryItemHelper galleryItemHelper, @NotNull C0970o6 galleryDiv) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(galleryItemHelper, "galleryItemHelper");
        Intrinsics.checkNotNullParameter(galleryDiv, "galleryDiv");
        this.bindingContext = bindingContext;
        this.recycler = recycler;
        this.galleryItemHelper = galleryItemHelper;
        this.galleryDiv = galleryDiv;
        Div2View divView = bindingContext.getDivView();
        this.divView = divView;
        this.minimumSignificantDx = divView.getConfig().getLogCardScrollSignificantThreshold();
        this.direction = "next";
    }

    private final void trackViews() {
        DivVisibilityActionTracker visibilityActionTracker = this.divView.getDiv2Component$div_release().getVisibilityActionTracker();
        Intrinsics.checkNotNullExpressionValue(visibilityActionTracker, "divView.div2Component.visibilityActionTracker");
        visibilityActionTracker.updateVisibleViews(k.D(AbstractC1293g0.b(this.recycler)));
        for (View view : AbstractC1293g0.b(this.recycler)) {
            int childAdapterPosition = this.recycler.getChildAdapterPosition(view);
            if (childAdapterPosition != -1) {
                RecyclerView.h adapter = this.recycler.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
                visibilityActionTracker.startTrackingViewsHierarchy(this.bindingContext, view, ((DivGalleryAdapter) adapter).getVisibleItems().get(childAdapterPosition).getDiv());
            }
        }
        Map<View, Z> divWithWaitingDisappearActions = visibilityActionTracker.getDivWithWaitingDisappearActions();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, Z> entry : divWithWaitingDisappearActions.entrySet()) {
            if (!k.m(AbstractC1293g0.b(this.recycler), entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            visibilityActionTracker.trackDetachedView(this.bindingContext, (View) entry2.getKey(), (Z) entry2.getValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i4) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i4);
        if (i4 == 1) {
            this.alreadyLogged = false;
        }
        if (i4 == 0) {
            this.divView.getDiv2Component$div_release().getDiv2Logger().logGalleryCompleteScroll(this.divView, this.bindingContext.getExpressionResolver(), this.galleryDiv, this.galleryItemHelper.firstVisibleItemPosition(), this.galleryItemHelper.lastVisibleItemPosition(), this.direction);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrolled(@NotNull RecyclerView recyclerView, int i4, int i5) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i4, i5);
        int i6 = this.minimumSignificantDx;
        if (i6 <= 0) {
            i6 = this.galleryItemHelper.width() / 20;
        }
        int abs = this.totalDelta + Math.abs(i4) + Math.abs(i5);
        this.totalDelta = abs;
        if (abs > i6) {
            this.totalDelta = 0;
            if (!this.alreadyLogged) {
                this.alreadyLogged = true;
                this.divView.getDiv2Component$div_release().getDiv2Logger().logGalleryScroll(this.divView);
                this.direction = (i4 > 0 || i5 > 0) ? "next" : "back";
            }
            trackViews();
        }
    }
}
