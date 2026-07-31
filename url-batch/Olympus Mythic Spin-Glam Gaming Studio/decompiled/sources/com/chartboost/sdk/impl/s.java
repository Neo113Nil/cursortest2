package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public abstract class s {
    public static final Map a(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String c = rVar.c();
        if (c == null) {
            c = "";
        }
        return MapsKt.mapOf(TuplesKt.to("CB_AUCTION_ID", c), TuplesKt.to("CB_IMPRESSION_IDS", new JSONArray((Collection) rVar.e()).toString()));
    }
}
