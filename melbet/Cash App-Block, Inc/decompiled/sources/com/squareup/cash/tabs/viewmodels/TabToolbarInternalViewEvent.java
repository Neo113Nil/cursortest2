package com.squareup.cash.tabs.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;

/* loaded from: classes7.dex */
public interface TabToolbarInternalViewEvent {

    public final class BackButtonClick implements TabToolbarInternalViewEvent {
        public static final BackButtonClick INSTANCE = new BackButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackButtonClick);
        }

        public final int hashCode() {
            return -1455377486;
        }

        public final String toString() {
            return "BackButtonClick";
        }
    }

    public final class CloseButtonClick implements TabToolbarInternalViewEvent {
        public static final CloseButtonClick INSTANCE = new CloseButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseButtonClick);
        }

        public final int hashCode() {
            return 583169819;
        }

        public final String toString() {
            return "CloseButtonClick";
        }
    }

    public final class ProfileClick implements TabToolbarInternalViewEvent {
        public final long badgeCount;

        public ProfileClick(long j) {
            this.badgeCount = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfileClick) && this.badgeCount == ((ProfileClick) obj).badgeCount;
        }

        public final int hashCode() {
            return Long.hashCode(this.badgeCount);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.badgeCount, "ProfileClick(badgeCount=", ")");
        }
    }

    public final class ProfileLongClick implements TabToolbarInternalViewEvent {
        public static final ProfileLongClick INSTANCE = new ProfileLongClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileLongClick);
        }

        public final int hashCode() {
            return 1785551744;
        }

        public final String toString() {
            return "ProfileLongClick";
        }
    }

    public final class ToolbarButtonClick implements TabToolbarInternalViewEvent {
        public final TabToolbarInternalViewModel.ToolbarButton.Id id;

        public ToolbarButtonClick(TabToolbarInternalViewModel.ToolbarButton.Id id) {
            id.getClass();
            this.id = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToolbarButtonClick) && this.id == ((ToolbarButtonClick) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "ToolbarButtonClick(id=" + this.id + ")";
        }
    }
}
