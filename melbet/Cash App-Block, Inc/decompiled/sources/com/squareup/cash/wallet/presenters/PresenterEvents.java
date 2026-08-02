package com.squareup.cash.wallet.presenters;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewEvent;
import com.squareup.cash.wallet.viewmodels.NextUpDismissMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PresenterEvents {

    public final class CarouselEvents implements PresenterEvents {
        public final NullStateCarouselViewEvent carouselViewEvent;

        public CarouselEvents(NullStateCarouselViewEvent nullStateCarouselViewEvent) {
            nullStateCarouselViewEvent.getClass();
            this.carouselViewEvent = nullStateCarouselViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CarouselEvents) && Intrinsics.areEqual(this.carouselViewEvent, ((CarouselEvents) obj).carouselViewEvent);
        }

        public final int hashCode() {
            return this.carouselViewEvent.hashCode();
        }

        public final String toString() {
            return "CarouselEvents(carouselViewEvent=" + this.carouselViewEvent + ")";
        }
    }

    public final class ExecuteCopy implements PresenterEvents {
        public final String tagDeviceId;

        public ExecuteCopy(String str) {
            this.tagDeviceId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteCopy) && Intrinsics.areEqual(this.tagDeviceId, ((ExecuteCopy) obj).tagDeviceId);
        }

        public final int hashCode() {
            String str = this.tagDeviceId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExecuteCopy(tagDeviceId=", this.tagDeviceId, ")");
        }
    }

    public final class ExecutingScenario implements PresenterEvents {
        public final boolean inProgress;

        public ExecutingScenario(boolean z) {
            this.inProgress = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecutingScenario) && this.inProgress == ((ExecutingScenario) obj).inProgress;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.inProgress);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ExecutingScenario(inProgress=", ")", this.inProgress);
        }
    }

    /* loaded from: classes5.dex */
    public final class NewTagPeekConsumed implements PresenterEvents {
        public static final NewTagPeekConsumed INSTANCE = new NewTagPeekConsumed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewTagPeekConsumed);
        }

        public final int hashCode() {
            return -973661942;
        }

        public final String toString() {
            return "NewTagPeekConsumed";
        }
    }

    public final class NextUpCardClicked implements PresenterEvents {
        public final String actionId;

        public NextUpCardClicked(String str) {
            this.actionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextUpCardClicked) && this.actionId.equals(((NextUpCardClicked) obj).actionId);
        }

        public final int hashCode() {
            return this.actionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NextUpCardClicked(actionId=", this.actionId, ")");
        }
    }

    public final class NextUpCardDismissed implements PresenterEvents {
        public final String actionId;
        public final String id;
        public final NextUpDismissMethod method;

        public NextUpCardDismissed(String str, String str2, NextUpDismissMethod nextUpDismissMethod) {
            this.id = str;
            this.actionId = str2;
            this.method = nextUpDismissMethod;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextUpCardDismissed)) {
                return false;
            }
            NextUpCardDismissed nextUpCardDismissed = (NextUpCardDismissed) obj;
            return this.id.equals(nextUpCardDismissed.id) && this.actionId.equals(nextUpCardDismissed.actionId) && this.method == nextUpCardDismissed.method;
        }

        public final int hashCode() {
            return this.method.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.actionId);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NextUpCardDismissed(id=", this.id, ", actionId=", this.actionId, ", method=");
            m.append(this.method);
            m.append(")");
            return m.toString();
        }
    }

    public final class NextUpCardViewed implements PresenterEvents {
        public final String actionId;
        public final String id;

        public NextUpCardViewed(String str, String str2) {
            this.id = str;
            this.actionId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextUpCardViewed)) {
                return false;
            }
            NextUpCardViewed nextUpCardViewed = (NextUpCardViewed) obj;
            return this.id.equals(nextUpCardViewed.id) && this.actionId.equals(nextUpCardViewed.actionId);
        }

        public final int hashCode() {
            return this.actionId.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("NextUpCardViewed(id=", this.id, ", actionId=", this.actionId, ")");
        }
    }

    public final class PageChanged implements PresenterEvents {
        public final int page;

        public PageChanged(int i) {
            this.page = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageChanged) && this.page == ((PageChanged) obj).page;
        }

        public final int hashCode() {
            return Integer.hashCode(this.page);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.page, "PageChanged(page=", ")");
        }
    }

    /* loaded from: classes5.dex */
    public final class PrepurchaseToggleTapped implements PresenterEvents {
        public static final PrepurchaseToggleTapped INSTANCE = new PrepurchaseToggleTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrepurchaseToggleTapped);
        }

        public final int hashCode() {
            return 618886711;
        }

        public final String toString() {
            return "PrepurchaseToggleTapped";
        }
    }

    /* loaded from: classes5.dex */
    public final class VerticalScroll implements PresenterEvents {
        public static final VerticalScroll INSTANCE = new VerticalScroll();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VerticalScroll);
        }

        public final int hashCode() {
            return 331111440;
        }

        public final String toString() {
            return "VerticalScroll";
        }
    }
}
