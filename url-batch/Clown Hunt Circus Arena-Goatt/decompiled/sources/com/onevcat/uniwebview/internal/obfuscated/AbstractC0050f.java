package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0050f {
    public static String a(WebBackForwardList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("currentIndex", Integer.valueOf(list.getCurrentIndex()));
        int size = list.getSize();
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = list.getItemAtIndex(i);
            String title = itemAtIndex.getTitle();
            String str = "";
            if (title == null) {
                title = "";
            }
            Pair pair = TuplesKt.to("title", title);
            String url = itemAtIndex.getUrl();
            if (url == null) {
                url = "";
            }
            Pair pair2 = TuplesKt.to(ImagesContract.URL, url);
            String originalUrl = itemAtIndex.getOriginalUrl();
            if (originalUrl != null) {
                str = originalUrl;
            }
            mutableList.add(MapsKt.mapOf(pair, pair2, TuplesKt.to("originalUrl", str)));
        }
        linkedHashMap.put(FirebaseAnalytics.Param.ITEMS, mutableList);
        String jSONObject = new JSONObject(linkedHashMap).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "obj.toString()");
        B b = B.b;
        b.a(A.VERBOSE, AbstractC0045e.a("Got current back forward list: ", jSONObject, b, "message"));
        return jSONObject;
    }
}
