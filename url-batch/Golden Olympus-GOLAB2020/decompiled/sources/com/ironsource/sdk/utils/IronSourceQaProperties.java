package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class IronSourceQaProperties {

    /* renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f19548a;

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, String> f19549b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f19548a == null) {
            f19548a = new IronSourceQaProperties();
        }
        return f19548a;
    }

    public static boolean isInitialized() {
        return f19548a != null;
    }

    public Map<String, String> getParameters() {
        return f19549b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f19549b.put(str, str2);
    }
}
