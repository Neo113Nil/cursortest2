package com.chartboost.sdk.impl;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public abstract class n0 {
    public static final String a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() <= 0) {
            return "";
        }
        if (!StringsKt.startsWith$default(url, com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u, false, 2, (Object) null) && !StringsKt.startsWith$default(url, com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v, false, 2, (Object) null)) {
            url = com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + url;
        }
        Uri parse = Uri.parse(url);
        if (parse == null) {
            return "";
        }
        List<String> pathSegments = parse.getPathSegments();
        Intrinsics.checkNotNull(pathSegments);
        return CollectionsKt.joinToString$default(pathSegments, "_", null, null, 0, null, null, 62, null);
    }

    public static final jc a(int i) {
        Object obj;
        Iterator<E> it = jc.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jc) obj).c() == i) {
                break;
            }
        }
        jc jcVar = (jc) obj;
        return jcVar == null ? jc.c : jcVar;
    }
}
