package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class AFd1eSDK {
    public static final JSONArray AFInAppEventType(List<AFd1fSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<AFd1fSDK> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFd1fSDK) it.next()).AFKeystoreWrapper());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean values(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
