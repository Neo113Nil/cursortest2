package com.squareup.cash.upsell.viewmodels;

import androidx.room.util.TableInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public abstract class NullStateViewEvent$SwipeViewEvent extends TableInfo.Companion {

    public final class SwipeToPage extends NullStateViewEvent$SwipeViewEvent {
        public final int index;

        public SwipeToPage(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SwipeToPage) && this.index == ((SwipeToPage) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index) * 31;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "SwipeToPage(index=", ", treatment=)");
        }
    }

    public final class TapSwipeViewButton extends NullStateViewEvent$SwipeViewEvent {
        public final NullStateViewEvent$TapActionButton event;

        public TapSwipeViewButton(NullStateViewEvent$TapActionButton nullStateViewEvent$TapActionButton) {
            this.event = nullStateViewEvent$TapActionButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapSwipeViewButton) && this.event.equals(((TapSwipeViewButton) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "TapSwipeViewButton(event=" + this.event + ")";
        }
    }
}
