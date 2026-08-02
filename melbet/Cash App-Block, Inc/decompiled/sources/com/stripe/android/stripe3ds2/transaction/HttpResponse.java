package com.stripe.android.stripe3ds2.transaction;

import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class HttpResponse {
    public final String content;
    public final boolean isJsonContentType;

    public HttpResponse(String str, String str2) {
        this.content = str;
        boolean z = false;
        if (str2 != null && StringsKt__StringsJVMKt.startsWith(str2, "application/json", false)) {
            z = true;
        }
        this.isJsonContentType = z;
    }
}
