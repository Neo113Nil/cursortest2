package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731ok {

    /* renamed from: a, reason: collision with root package name */
    public final C0705nk f8027a;

    /* renamed from: b, reason: collision with root package name */
    public volatile G9 f8028b;

    /* renamed from: c, reason: collision with root package name */
    public volatile G9 f8029c;

    /* renamed from: d, reason: collision with root package name */
    public volatile G9 f8030d;

    /* renamed from: e, reason: collision with root package name */
    public volatile G9 f8031e;
    public volatile G9 f;

    /* renamed from: g, reason: collision with root package name */
    public volatile G9 f8032g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ExecutorC0679mk f8033h;

    public C0731ok() {
        this(new C0705nk());
    }

    public final IHandlerExecutor a() {
        if (this.f8032g == null) {
            synchronized (this) {
                try {
                    if (this.f8032g == null) {
                        this.f8027a.getClass();
                        HandlerThreadC0592jb a3 = G9.a("IAA-SDE");
                        this.f8032g = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8032g;
    }

    public final IHandlerExecutor b() {
        if (this.f8028b == null) {
            synchronized (this) {
                try {
                    if (this.f8028b == null) {
                        this.f8027a.getClass();
                        HandlerThreadC0592jb a3 = G9.a("IAA-SC");
                        this.f8028b = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8028b;
    }

    public final IHandlerExecutor c() {
        if (this.f8030d == null) {
            synchronized (this) {
                try {
                    if (this.f8030d == null) {
                        this.f8027a.getClass();
                        HandlerThreadC0592jb a3 = G9.a("IAA-SMH-1");
                        this.f8030d = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8030d;
    }

    public final IHandlerExecutor d() {
        if (this.f8031e == null) {
            synchronized (this) {
                try {
                    if (this.f8031e == null) {
                        this.f8027a.getClass();
                        HandlerThreadC0592jb a3 = G9.a("IAA-SNTPE");
                        this.f8031e = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8031e;
    }

    public final IHandlerExecutor e() {
        if (this.f8029c == null) {
            synchronized (this) {
                try {
                    if (this.f8029c == null) {
                        this.f8027a.getClass();
                        HandlerThreadC0592jb a3 = G9.a("IAA-STE");
                        this.f8029c = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8029c;
    }

    public C0731ok(C0705nk c0705nk) {
        new HashMap();
        this.f8027a = c0705nk;
    }
}
