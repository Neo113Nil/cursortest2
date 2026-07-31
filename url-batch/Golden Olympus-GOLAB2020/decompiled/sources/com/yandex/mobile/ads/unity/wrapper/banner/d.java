package com.yandex.mobile.ads.unity.wrapper.banner;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Integer f36023a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Integer f36024b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final Integer f36025c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final Integer f36026d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final Integer f36027e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final Integer f36028f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final Integer f36029g = 6;

    /* renamed from: h, reason: collision with root package name */
    private static final Integer f36030h = 7;

    /* renamed from: i, reason: collision with root package name */
    private static final Integer f36031i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final Integer f36032j = 81;

    /* renamed from: k, reason: collision with root package name */
    private static final Map f36033k = new a();

    class a extends HashMap {
        a() {
            put(d.f36023a, 51);
            put(d.f36024b, 49);
            put(d.f36025c, 53);
            put(d.f36026d, 19);
            put(d.f36027e, 17);
            put(d.f36028f, 21);
            put(d.f36029g, 83);
            put(d.f36030h, 81);
            put(d.f36031i, 85);
        }
    }

    d() {
    }

    int a(int i4) {
        Integer num = (Integer) f36033k.get(Integer.valueOf(i4));
        if (num == null) {
            num = f36032j;
        }
        return num.intValue();
    }
}
