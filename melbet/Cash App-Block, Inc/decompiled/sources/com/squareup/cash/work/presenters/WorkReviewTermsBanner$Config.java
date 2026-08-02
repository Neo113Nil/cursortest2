package com.squareup.cash.work.presenters;

import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;

/* loaded from: classes6.dex */
public final class WorkReviewTermsBanner$Config {
    public final KClassImpl$Data$$Lambda$23 onTap;
    public final AlertBannerViewModel viewModel;

    public WorkReviewTermsBanner$Config(AlertBannerViewModel alertBannerViewModel, KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23) {
        this.viewModel = alertBannerViewModel;
        this.onTap = kClassImpl$Data$$Lambda$23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkReviewTermsBanner$Config) {
            WorkReviewTermsBanner$Config workReviewTermsBanner$Config = (WorkReviewTermsBanner$Config) obj;
            return this.viewModel.equals(workReviewTermsBanner$Config.viewModel) && this.onTap == workReviewTermsBanner$Config.onTap;
        }
        return false;
    }

    public final int hashCode() {
        return this.onTap.hashCode() + (this.viewModel.hashCode() * 31);
    }

    public final String toString() {
        return "Config(viewModel=" + this.viewModel + ", onTap=" + this.onTap + ")";
    }
}
