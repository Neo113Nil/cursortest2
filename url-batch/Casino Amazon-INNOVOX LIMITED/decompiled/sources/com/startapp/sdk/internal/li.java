package com.startapp.sdk.internal;

import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class li {

    /* renamed from: a, reason: collision with root package name */
    public final URL f324a;
    public final mi b;
    public final String c;
    public final AtomicBoolean d;

    public li(URL url, mi miVar) {
        miVar.getClass();
        this.f324a = url;
        this.b = miVar;
        String g = zh.g(url.toString());
        g.getClass();
        this.c = g;
        this.d = new AtomicBoolean();
    }
}
