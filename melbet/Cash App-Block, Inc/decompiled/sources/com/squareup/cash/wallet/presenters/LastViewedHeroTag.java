package com.squareup.cash.wallet.presenters;

import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;

/* loaded from: classes.dex */
public final class LastViewedHeroTag {
    public final CardSchemeViewModel.Module.HeroTag heroTag;
    public final int page;

    public LastViewedHeroTag(int i, CardSchemeViewModel.Module.HeroTag heroTag) {
        this.page = i;
        this.heroTag = heroTag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastViewedHeroTag)) {
            return false;
        }
        LastViewedHeroTag lastViewedHeroTag = (LastViewedHeroTag) obj;
        return this.page == lastViewedHeroTag.page && this.heroTag.equals(lastViewedHeroTag.heroTag);
    }

    public final int hashCode() {
        return this.heroTag.hashCode() + (Integer.hashCode(this.page) * 31);
    }

    public final String toString() {
        return "LastViewedHeroTag(page=" + this.page + ", heroTag=" + this.heroTag + ")";
    }
}
