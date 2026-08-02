package com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class HelpPagerItem {
    public final String description;
    public final Integer localAsset;

    public HelpPagerItem(Integer num, String str) {
        str.getClass();
        this.localAsset = num;
        this.description = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpPagerItem)) {
            return false;
        }
        HelpPagerItem helpPagerItem = (HelpPagerItem) obj;
        return Intrinsics.areEqual(this.localAsset, helpPagerItem.localAsset) && Intrinsics.areEqual(this.description, helpPagerItem.description);
    }

    public final int hashCode() {
        Integer num = this.localAsset;
        return this.description.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "HelpPagerItem(localAsset=" + this.localAsset + ", description=" + this.description + ")";
    }
}
