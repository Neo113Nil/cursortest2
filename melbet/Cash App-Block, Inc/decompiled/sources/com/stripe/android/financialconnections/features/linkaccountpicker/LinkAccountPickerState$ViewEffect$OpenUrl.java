package com.stripe.android.financialconnections.features.linkaccountpicker;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LinkAccountPickerState$ViewEffect$OpenUrl {
    public final long id;
    public final String url;

    public LinkAccountPickerState$ViewEffect$OpenUrl(String str, long j) {
        str.getClass();
        this.url = str;
        this.id = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkAccountPickerState$ViewEffect$OpenUrl)) {
            return false;
        }
        LinkAccountPickerState$ViewEffect$OpenUrl linkAccountPickerState$ViewEffect$OpenUrl = (LinkAccountPickerState$ViewEffect$OpenUrl) obj;
        return Intrinsics.areEqual(this.url, linkAccountPickerState$ViewEffect$OpenUrl.url) && this.id == linkAccountPickerState$ViewEffect$OpenUrl.id;
    }

    public final int hashCode() {
        return Long.hashCode(this.id) + (this.url.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ", id=", this.id);
        m.append(")");
        return m.toString();
    }
}
