package com.chartboost.sdk.impl;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* loaded from: classes11.dex */
public abstract class gj {
    public static final Regex a = new Regex("^market://details\\?id=(.*)$");

    public static final String a(ej ejVar) {
        List groupValues;
        MatchResult matchEntire = a.matchEntire(ejVar.b());
        if (matchEntire == null || (groupValues = matchEntire.getGroupValues()) == null) {
            return null;
        }
        return (String) CollectionsKt.getOrNull(groupValues, 1);
    }

    public static final ej b(ej ejVar) {
        Intrinsics.checkNotNullParameter(ejVar, "<this>");
        String a2 = a(ejVar);
        if (a2 == null) {
            return ejVar;
        }
        String format = String.format(POBCommonConstants.PLAY_STORE_URL, Arrays.copyOf(new Object[]{a2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        ej a3 = ej.a(ejVar, format, null, false, 6, null);
        return a3 == null ? ejVar : a3;
    }
}
