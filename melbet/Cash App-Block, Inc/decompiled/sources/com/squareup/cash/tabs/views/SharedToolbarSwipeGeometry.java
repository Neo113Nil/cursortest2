package com.squareup.cash.tabs.views;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Rect;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes7.dex */
public final class SharedToolbarSwipeGeometry {
    public final ParcelableSnapshotMutableState tabsLeadingBounds$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState moneybotLeadingBounds$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState tabsTrailingBounds$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState moneybotTrailingBounds$delegate = Updater.mutableStateOf$default(null);

    public final Rect ownBounds(boolean z, SwipeToolbarCorner swipeToolbarCorner) {
        swipeToolbarCorner.getClass();
        int ordinal = swipeToolbarCorner.ordinal();
        if (ordinal == 0) {
            return z ? (Rect) this.moneybotLeadingBounds$delegate.getValue() : (Rect) this.tabsLeadingBounds$delegate.getValue();
        }
        if (ordinal == 1) {
            return z ? (Rect) this.moneybotTrailingBounds$delegate.getValue() : (Rect) this.tabsTrailingBounds$delegate.getValue();
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
