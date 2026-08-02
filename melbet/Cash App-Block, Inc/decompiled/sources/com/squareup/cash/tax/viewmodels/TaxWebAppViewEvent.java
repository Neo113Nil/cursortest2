package com.squareup.cash.tax.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.tax.viewmodels.TaxWebAppBridgeEvent;
import com.squareup.cash.tax.viewmodels.interfaces.CloseKeyboard;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class TaxWebAppViewEvent {

    public final class FinishTaxFlow extends TaxWebAppViewEvent implements CloseKeyboard {
        public static final FinishTaxFlow INSTANCE = new FinishTaxFlow();
    }

    public final class OpenTooltipEvent extends TaxWebAppViewEvent {
        public final int anchorBottom;
        public final int anchorLeft;
        public final int anchorWidth;

        public OpenTooltipEvent(int i, int i2, int i3) {
            this.anchorBottom = i;
            this.anchorLeft = i2;
            this.anchorWidth = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenTooltipEvent)) {
                return false;
            }
            OpenTooltipEvent openTooltipEvent = (OpenTooltipEvent) obj;
            return this.anchorBottom == openTooltipEvent.anchorBottom && this.anchorLeft == openTooltipEvent.anchorLeft && this.anchorWidth == openTooltipEvent.anchorWidth;
        }

        public final int hashCode() {
            return Integer.hashCode(this.anchorWidth) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.anchorLeft, Integer.hashCode(this.anchorBottom) * 31, 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.anchorWidth, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.anchorBottom, this.anchorLeft, "OpenTooltipEvent(anchorBottom=", ", anchorLeft=", ", anchorWidth="));
        }
    }

    public final class WebAppBridgeEvent extends TaxWebAppViewEvent {
        public final TaxWebAppBridgeEvent.PresenterHandledTaxWebAppBridgeEvent bridgeEvent;

        public WebAppBridgeEvent(TaxWebAppBridgeEvent.PresenterHandledTaxWebAppBridgeEvent presenterHandledTaxWebAppBridgeEvent) {
            presenterHandledTaxWebAppBridgeEvent.getClass();
            this.bridgeEvent = presenterHandledTaxWebAppBridgeEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebAppBridgeEvent) && Intrinsics.areEqual(this.bridgeEvent, ((WebAppBridgeEvent) obj).bridgeEvent);
        }

        public final int hashCode() {
            return this.bridgeEvent.hashCode();
        }

        public final String toString() {
            return "WebAppBridgeEvent(bridgeEvent=" + this.bridgeEvent + ")";
        }
    }
}
