package com.squareup.cash.tabs.viewmodels;

import androidx.media3.muxer.Av1ConfigUtil;

/* loaded from: classes7.dex */
public final class TabToolbarViewModel {
    public final Av1ConfigUtil title;

    public TabToolbarViewModel(Av1ConfigUtil av1ConfigUtil) {
        this.title = av1ConfigUtil;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TabToolbarViewModel) && this.title.equals(((TabToolbarViewModel) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return "TabToolbarViewModel(title=" + this.title + ")";
    }
}
