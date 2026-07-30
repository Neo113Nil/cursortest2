package com.appsflyer.internal;

import defpackage.ai;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1sSDK {
    public static final JSONArray getMediationNetwork(List<AFc1bSDK> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(ai.h(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFc1bSDK) it.next()).getMonetizationNetwork());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getMediationNetwork(HttpURLConnection httpURLConnection) {
        httpURLConnection.getClass();
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
