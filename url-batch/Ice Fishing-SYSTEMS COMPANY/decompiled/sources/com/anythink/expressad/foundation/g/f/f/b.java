package com.anythink.expressad.foundation.g.f.f;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f19474a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.anythink.expressad.foundation.g.f.c.c> f19475b;

    /* renamed from: c, reason: collision with root package name */
    private final InputStream f19476c;

    public b(int i, List<com.anythink.expressad.foundation.g.f.c.c> list) {
        this(i, list, null);
    }

    public final int a() {
        return this.f19474a;
    }

    public final List<com.anythink.expressad.foundation.g.f.c.c> b() {
        return Collections.unmodifiableList(this.f19475b);
    }

    public final InputStream c() {
        return this.f19476c;
    }

    public b(int i, List<com.anythink.expressad.foundation.g.f.c.c> list, InputStream inputStream) {
        this.f19474a = i;
        this.f19475b = list;
        this.f19476c = inputStream;
    }
}
