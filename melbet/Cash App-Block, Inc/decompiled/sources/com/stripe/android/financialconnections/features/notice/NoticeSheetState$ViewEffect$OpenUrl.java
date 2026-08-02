package com.stripe.android.financialconnections.features.notice;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NoticeSheetState$ViewEffect$OpenUrl {
    public final long id;
    public final String url;

    public NoticeSheetState$ViewEffect$OpenUrl(String str, long j) {
        str.getClass();
        this.url = str;
        this.id = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeSheetState$ViewEffect$OpenUrl)) {
            return false;
        }
        NoticeSheetState$ViewEffect$OpenUrl noticeSheetState$ViewEffect$OpenUrl = (NoticeSheetState$ViewEffect$OpenUrl) obj;
        return Intrinsics.areEqual(this.url, noticeSheetState$ViewEffect$OpenUrl.url) && this.id == noticeSheetState$ViewEffect$OpenUrl.id;
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
