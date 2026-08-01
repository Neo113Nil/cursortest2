package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.z;
import org.json.JSONArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFd1qSDK {
    public static final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection) {
        httpURLConnection.getClass();
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    public static final JSONArray getMediationNetwork(List<AFc1aSDK> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(z.j(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFc1aSDK) it.next()).getRevenue());
        }
        return new JSONArray((Collection) arrayList);
    }
}
