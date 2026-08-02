package com.squareup.cash.ui.overlays.viewmodels;

import com.squareup.cash.clientrouting.data.RoutingParams;

/* loaded from: classes6.dex */
public final class AlertBannerViewEvent$BannerClicked {
    public final RoutingParams routingParams;

    public AlertBannerViewEvent$BannerClicked(RoutingParams routingParams) {
        this.routingParams = routingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlertBannerViewEvent$BannerClicked) && this.routingParams.equals(((AlertBannerViewEvent$BannerClicked) obj).routingParams);
    }

    public final int hashCode() {
        return this.routingParams.hashCode();
    }

    public final String toString() {
        return "BannerClicked(routingParams=" + this.routingParams + ")";
    }
}
