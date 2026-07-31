package com.yandex.div.core.state;

import com.yandex.div.core.state.DivViewState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class GalleryState implements DivViewState.BlockState {
    private final int scrollOffset;
    private final int visibleItemIndex;

    public GalleryState(int i4, int i5) {
        this.visibleItemIndex = i4;
        this.scrollOffset = i5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryState)) {
            return false;
        }
        GalleryState galleryState = (GalleryState) obj;
        return this.visibleItemIndex == galleryState.visibleItemIndex && this.scrollOffset == galleryState.scrollOffset;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getVisibleItemIndex() {
        return this.visibleItemIndex;
    }

    public int hashCode() {
        return (Integer.hashCode(this.visibleItemIndex) * 31) + Integer.hashCode(this.scrollOffset);
    }

    @NotNull
    public String toString() {
        return "GalleryState(visibleItemIndex=" + this.visibleItemIndex + ", scrollOffset=" + this.scrollOffset + ')';
    }
}
