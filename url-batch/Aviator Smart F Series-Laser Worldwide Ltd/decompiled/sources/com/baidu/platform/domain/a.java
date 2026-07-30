package com.baidu.platform.domain;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Integer, String> f10618a = new C0142a();

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Integer, String> f10619b = new b();

    /* renamed from: com.baidu.platform.domain.a$a, reason: collision with other inner class name */
    static class C0142a extends HashMap<Integer, String> {
        C0142a() {
            put(1, "https://api.map.baidu.com");
        }
    }

    static class b extends HashMap<Integer, String> {
        b() {
            put(1, "/sdkproxy/lbs_androidsdk");
        }
    }
}
