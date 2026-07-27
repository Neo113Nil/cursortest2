package com.onesignal.otel;

import Q2.b;
import W2.e;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OneSignalOpenTelemetryKt {
    public static final e setAllAttributes(e eVar, Map<String, String> attributes) {
        i.e(eVar, "<this>");
        i.e(attributes, "attributes");
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            String key = entry.getKey();
            eVar.f(V2.e.a(b.f2476a, key), entry.getValue());
        }
        return eVar;
    }
}
