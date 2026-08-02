package com.squareup.cash.wallet.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PresentationTimelineViewEvent {

    public final class ActionClicked implements PresentationTimelineViewEvent {
        public final PresentationAction action;

        public ActionClicked(PresentationAction presentationAction) {
            presentationAction.getClass();
            this.action = presentationAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionClicked) && Intrinsics.areEqual(this.action, ((ActionClicked) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "ActionClicked(action=" + this.action + ")";
        }
    }

    public final class Dismiss implements PresentationTimelineViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1152670042;
        }

        public final String toString() {
            return "Dismiss";
        }
    }
}
