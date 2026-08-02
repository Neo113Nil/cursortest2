package com.stripe.android.core.networking;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes8.dex */
public final class StripeResponse {
    public final Object body;
    public final int code;
    public final Map headers;
    public final boolean isError;
    public final boolean isOk;
    public final RequestId requestId;

    public StripeResponse(String str, Map map, int i) {
        map.getClass();
        this.code = i;
        this.body = str;
        this.headers = map;
        this.isOk = i == 200;
        this.isError = i < 200 || i >= 300;
        List headerValue = getHeaderValue("Request-Id");
        String str2 = headerValue != null ? (String) CollectionsKt.firstOrNull(headerValue) : null;
        str2 = (str2 == null || StringsKt.isBlank(str2)) ? null : str2;
        this.requestId = str2 != null ? new RequestId(str2) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeResponse)) {
            return false;
        }
        StripeResponse stripeResponse = (StripeResponse) obj;
        return this.code == stripeResponse.code && Intrinsics.areEqual(this.body, stripeResponse.body) && Intrinsics.areEqual(this.headers, stripeResponse.headers);
    }

    public final List getHeaderValue(String str) {
        Object obj;
        Iterator it = this.headers.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt__StringsJVMKt.equals((String) ((Map.Entry) obj).getKey(), str, true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (List) entry.getValue();
        }
        return null;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        Object obj = this.body;
        return this.headers.hashCode() + ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        return "Request-Id: " + this.requestId + ", Status Code: " + this.code;
    }
}
