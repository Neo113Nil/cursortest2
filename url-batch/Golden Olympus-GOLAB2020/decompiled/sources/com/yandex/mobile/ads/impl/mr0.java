package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class mr0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f29225a = new AtomicLong();

    public static long a() {
        return f29225a.getAndIncrement();
    }
}
