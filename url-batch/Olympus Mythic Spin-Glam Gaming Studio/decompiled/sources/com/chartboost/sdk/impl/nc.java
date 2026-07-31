package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class nc {
    public static final String a(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return (str == null || str.length() == 0) ? (str2 == null || str2.length() == 0) ? "" : str2 : str;
        }
        return str + " " + str2;
    }

    public static final Map a(mc mcVar) {
        Intrinsics.checkNotNullParameter(mcVar, "<this>");
        Mediation mediation = mcVar.getMediation();
        String str = mediation != null ? mediation.mediationType : null;
        if (str == null) {
            str = "";
        }
        Pair pair = TuplesKt.to("CB_MEDIATOR_NAME", str);
        Mediation mediation2 = mcVar.getMediation();
        String str2 = mediation2 != null ? mediation2.libraryVersion : null;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair2 = TuplesKt.to("CB_MEDIATOR_SDK_VERSION", str2);
        Mediation mediation3 = mcVar.getMediation();
        String str3 = mediation3 != null ? mediation3.adapterVersion : null;
        return MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_MEDIATOR_ADAPTER_VERSION", str3 != null ? str3 : ""));
    }
}
