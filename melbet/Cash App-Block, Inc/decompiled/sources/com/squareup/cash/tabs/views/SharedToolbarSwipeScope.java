package com.squareup.cash.tabs.views;

import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class SharedToolbarSwipeScope {
    public final SharedToolbarSwipeGeometry geometry;
    public final boolean isMoneybotToolbar;
    public final PoolDescriptionKt$$ExternalSyntheticLambda3 isSourceToolbar;
    public final boolean moneybotIsBeforeTabs;
    public final SharedToolbarSwipePalette palette;
    public final Function0 transitionProgress;
    public final ToolbarTuckTargets tuckTargets;

    public SharedToolbarSwipeScope(Function0 function0, PoolDescriptionKt$$ExternalSyntheticLambda3 poolDescriptionKt$$ExternalSyntheticLambda3, boolean z, SharedToolbarSwipeGeometry sharedToolbarSwipeGeometry, SharedToolbarSwipePalette sharedToolbarSwipePalette, boolean z2) {
        function0.getClass();
        sharedToolbarSwipeGeometry.getClass();
        sharedToolbarSwipePalette.getClass();
        this.transitionProgress = function0;
        this.isSourceToolbar = poolDescriptionKt$$ExternalSyntheticLambda3;
        this.isMoneybotToolbar = z;
        this.geometry = sharedToolbarSwipeGeometry;
        this.palette = sharedToolbarSwipePalette;
        this.moneybotIsBeforeTabs = z2;
        this.tuckTargets = new ToolbarTuckTargets(0);
    }
}
