package com.onesignal.otel.config;

import a4.C0198d;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelConfigSharedKt {
    public static final C0198d putAll(C0198d c0198d, Map<String, String> attributes) {
        i.e(c0198d, "<this>");
        i.e(attributes, "attributes");
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                c0198d.f3887a.f(key, value);
            }
        }
        return c0198d;
    }
}
