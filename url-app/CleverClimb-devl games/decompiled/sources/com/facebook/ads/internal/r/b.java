package com.facebook.ads.internal.r;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private c f5476a;

    /* renamed from: b, reason: collision with root package name */
    private float f5477b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f5478c;

    public b(c cVar) {
        this(cVar, 0.0f);
    }

    public b(c cVar, float f) {
        this(cVar, f, null);
    }

    public b(c cVar, float f, Map<String, String> map) {
        this.f5476a = cVar;
        this.f5477b = f;
        if (map != null) {
            this.f5478c = map;
        } else {
            this.f5478c = new HashMap();
        }
    }

    public boolean a() {
        return this.f5476a == c.IS_VIEWABLE;
    }

    public int b() {
        return this.f5476a.a();
    }

    public float c() {
        return this.f5477b;
    }

    public Map<String, String> d() {
        return this.f5478c;
    }
}
