package com.facebook.appevents.a;

import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ActivityLifecycleTracker.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile c f5947d;

    /* renamed from: a, reason: collision with root package name */
    private static final String f5944a = a.class.getCanonicalName();

    /* renamed from: b, reason: collision with root package name */
    private static final ScheduledExecutorService f5945b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    private static AtomicInteger f5946c = new AtomicInteger(0);
    private static AtomicBoolean e = new AtomicBoolean(false);

    public static boolean a() {
        return e.get();
    }

    public static UUID b() {
        if (f5947d != null) {
            return f5947d.a();
        }
        return null;
    }
}
