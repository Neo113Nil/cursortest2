package com.anythink.core.common.h;

import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final String f14255a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14256b;

    /* renamed from: c, reason: collision with root package name */
    private String f14257c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f14258d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14259e;

    public v(String str, String str2) {
        this.f14255a = str;
        this.f14256b = str2;
    }

    public final String a() {
        return this.f14255a;
    }

    public final String b() {
        return this.f14256b;
    }

    public final String c() {
        return this.f14257c;
    }

    public final Map<String, String> d() {
        return this.f14258d;
    }

    public final boolean e() {
        return this.f14259e;
    }

    public final void f() {
        this.f14259e = true;
    }

    public final void a(String str) {
        this.f14257c = str;
    }

    public final void a(Map<String, String> map) {
        this.f14258d = map;
    }
}
