package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class LinkInfo {
    private final String anchorText;
    private final String url;

    public LinkInfo(String anchorText, String url) {
        s.checkNotNullParameter(anchorText, "anchorText");
        s.checkNotNullParameter(url, "url");
        this.anchorText = anchorText;
        this.url = url;
    }

    public static /* synthetic */ LinkInfo copy$default(LinkInfo linkInfo, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = linkInfo.anchorText;
        }
        if ((i8 & 2) != 0) {
            str2 = linkInfo.url;
        }
        return linkInfo.copy(str, str2);
    }

    public final String component1() {
        return this.anchorText;
    }

    public final String component2() {
        return this.url;
    }

    public final LinkInfo copy(String anchorText, String url) {
        s.checkNotNullParameter(anchorText, "anchorText");
        s.checkNotNullParameter(url, "url");
        return new LinkInfo(anchorText, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkInfo)) {
            return false;
        }
        LinkInfo linkInfo = (LinkInfo) obj;
        return s.areEqual(this.anchorText, linkInfo.anchorText) && s.areEqual(this.url, linkInfo.url);
    }

    public final String getAnchorText() {
        return this.anchorText;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.anchorText.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        return "LinkInfo(anchorText=" + this.anchorText + ", url=" + this.url + ')';
    }
}
