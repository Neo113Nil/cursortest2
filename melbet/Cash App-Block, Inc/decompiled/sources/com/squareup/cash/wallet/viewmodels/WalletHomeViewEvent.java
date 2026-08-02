package com.squareup.cash.wallet.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewEvent;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface WalletHomeViewEvent {

    /* loaded from: classes9.dex */
    public final class Close implements WalletHomeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1622540587;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CopyCard implements WalletHomeViewEvent {
        public static final CopyCard INSTANCE = new CopyCard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyCard);
        }

        public final int hashCode() {
            return -54523886;
        }

        public final String toString() {
            return "CopyCard";
        }
    }

    /* loaded from: classes9.dex */
    public final class NewTagPeekConsumed implements WalletHomeViewEvent {
        public static final NewTagPeekConsumed INSTANCE = new NewTagPeekConsumed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewTagPeekConsumed);
        }

        public final int hashCode() {
            return -28914422;
        }

        public final String toString() {
            return "NewTagPeekConsumed";
        }
    }

    public final class NextUpCardClicked implements WalletHomeViewEvent {
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

    public final class NextUpCardDismissed implements WalletHomeViewEvent {
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

    public final class NextUpCardViewed implements WalletHomeViewEvent {
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

    public final class NullStateCarouselEvent implements WalletHomeViewEvent {
        public final NullStateCarouselViewEvent value;

        public NullStateCarouselEvent(NullStateCarouselViewEvent nullStateCarouselViewEvent) {
            nullStateCarouselViewEvent.getClass();
            this.value = nullStateCarouselViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NullStateCarouselEvent) && Intrinsics.areEqual(this.value, ((NullStateCarouselEvent) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "NullStateCarouselEvent(value=" + this.value + ")";
        }
    }

    /* loaded from: classes9.dex */
    public final class OpenLockHalfSheet implements WalletHomeViewEvent {
        public final String description;
        public final String title;

        public OpenLockHalfSheet(String str, String str2) {
            this.title = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenLockHalfSheet)) {
                return false;
            }
            OpenLockHalfSheet openLockHalfSheet = (OpenLockHalfSheet) obj;
            return this.title.equals(openLockHalfSheet.title) && this.description.equals(openLockHalfSheet.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("OpenLockHalfSheet(title=", this.title, ", description=", this.description, ")");
        }
    }

    public final class OpenUrl implements WalletHomeViewEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }

    public final class PageChanged implements WalletHomeViewEvent {
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

    /* loaded from: classes9.dex */
    public final class PrepurchaseHeaderButtonClick implements WalletHomeViewEvent {
        public final String url;

        public PrepurchaseHeaderButtonClick(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrepurchaseHeaderButtonClick) && Intrinsics.areEqual(this.url, ((PrepurchaseHeaderButtonClick) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PrepurchaseHeaderButtonClick(url=", this.url, ")");
        }
    }

    public final class PrepurchaseToggleTapped implements WalletHomeViewEvent {
        public static final PrepurchaseToggleTapped INSTANCE = new PrepurchaseToggleTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrepurchaseToggleTapped);
        }

        public final int hashCode() {
            return -297516489;
        }

        public final String toString() {
            return "PrepurchaseToggleTapped";
        }
    }

    public final class PresentationStatusActionClicked implements WalletHomeViewEvent {
        public final String buttonLabel;
        public final String deviceId;
        public final String themeToken;
        public final String url;

        public PresentationStatusActionClicked(String str, String str2, String str3, String str4) {
            str.getClass();
            this.url = str;
            this.buttonLabel = str2;
            this.themeToken = str3;
            this.deviceId = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PresentationStatusActionClicked)) {
                return false;
            }
            PresentationStatusActionClicked presentationStatusActionClicked = (PresentationStatusActionClicked) obj;
            return Intrinsics.areEqual(this.url, presentationStatusActionClicked.url) && this.buttonLabel.equals(presentationStatusActionClicked.buttonLabel) && Intrinsics.areEqual(this.themeToken, presentationStatusActionClicked.themeToken) && Intrinsics.areEqual(this.deviceId, presentationStatusActionClicked.deviceId);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.buttonLabel);
            String str = this.themeToken;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deviceId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PresentationStatusActionClicked(url=", this.url, ", buttonLabel=", this.buttonLabel, ", themeToken="), this.themeToken, ", deviceId=", this.deviceId, ")");
        }
    }

    /* loaded from: classes9.dex */
    public final class PresentationStatusClicked implements WalletHomeViewEvent {
        public final String deviceId;
        public final String statusSubtitle;
        public final String statusTitle;
        public final String themeToken;
        public final PresentationTimelineViewModel timeline;

        public PresentationStatusClicked(PresentationTimelineViewModel presentationTimelineViewModel, String str, String str2, String str3, String str4) {
            presentationTimelineViewModel.getClass();
            str.getClass();
            str2.getClass();
            this.timeline = presentationTimelineViewModel;
            this.statusTitle = str;
            this.statusSubtitle = str2;
            this.themeToken = str3;
            this.deviceId = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PresentationStatusClicked)) {
                return false;
            }
            PresentationStatusClicked presentationStatusClicked = (PresentationStatusClicked) obj;
            return Intrinsics.areEqual(this.timeline, presentationStatusClicked.timeline) && Intrinsics.areEqual(this.statusTitle, presentationStatusClicked.statusTitle) && Intrinsics.areEqual(this.statusSubtitle, presentationStatusClicked.statusSubtitle) && Intrinsics.areEqual(this.themeToken, presentationStatusClicked.themeToken) && Intrinsics.areEqual(this.deviceId, presentationStatusClicked.deviceId);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.timeline.hashCode() * 31, 31, this.statusTitle), 31, this.statusSubtitle);
            String str = this.themeToken;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deviceId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PresentationStatusClicked(timeline=");
            sb.append(this.timeline);
            sb.append(", statusTitle=");
            sb.append(this.statusTitle);
            sb.append(", statusSubtitle=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.statusSubtitle, ", themeToken=", this.themeToken, ", deviceId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.deviceId, ")");
        }
    }

    /* loaded from: classes9.dex */
    public final class PresentationStatusViewed implements WalletHomeViewEvent {
        public final CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel status;

        public PresentationStatusViewed(CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel) {
            this.status = deliveryStatusRowModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PresentationStatusViewed) && this.status.equals(((PresentationStatusViewed) obj).status);
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final String toString() {
            return "PresentationStatusViewed(status=" + this.status + ")";
        }
    }

    public final class TabToolbarEvent implements WalletHomeViewEvent {
        public final TabToolbarInternalViewEvent event;

        public TabToolbarEvent(TabToolbarInternalViewEvent tabToolbarInternalViewEvent) {
            tabToolbarInternalViewEvent.getClass();
            this.event = tabToolbarInternalViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabToolbarEvent) && Intrinsics.areEqual(this.event, ((TabToolbarEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "TabToolbarEvent(event=" + this.event + ")";
        }
    }

    public final class ToggleCardDataVisibility implements WalletHomeViewEvent {
        public final boolean visible;

        public ToggleCardDataVisibility(boolean z) {
            this.visible = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleCardDataVisibility) && this.visible == ((ToggleCardDataVisibility) obj).visible;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.visible);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleCardDataVisibility(visible=", ")", this.visible);
        }
    }

    /* loaded from: classes9.dex */
    public final class VerticalScroll implements WalletHomeViewEvent {
        public static final VerticalScroll INSTANCE = new VerticalScroll();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VerticalScroll);
        }

        public final int hashCode() {
            return -1341779952;
        }

        public final String toString() {
            return "VerticalScroll";
        }
    }
}
