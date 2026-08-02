package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749kk {

    /* renamed from: a, reason: collision with root package name */
    public final C0723jk f12244a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1127z9 f12245b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1127z9 f12246c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C1127z9 f12247d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C1127z9 f12248e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C1127z9 f12249f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C1127z9 f12250g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ExecutorC0697ik f12251h;

    public C0749kk() {
        this(new C0723jk());
    }

    public final IHandlerExecutor a() {
        if (this.f12250g == null) {
            synchronized (this) {
                try {
                    if (this.f12250g == null) {
                        this.f12244a.getClass();
                        HandlerThreadC0534cb a3 = C1127z9.a("IAA-SDE");
                        this.f12250g = new C1127z9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f12250g;
    }

    public final IHandlerExecutor b() {
        if (this.f12247d == null) {
            synchronized (this) {
                try {
                    if (this.f12247d == null) {
                        this.f12244a.getClass();
                        HandlerThreadC0534cb a3 = C1127z9.a("IAA-SMH-1");
                        this.f12247d = new C1127z9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f12247d;
    }

    public final IHandlerExecutor c() {
        if (this.f12248e == null) {
            synchronized (this) {
                try {
                    if (this.f12248e == null) {
                        this.f12244a.getClass();
                        HandlerThreadC0534cb a3 = C1127z9.a("IAA-SNTPE");
                        this.f12248e = new C1127z9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f12248e;
    }

    public final IHandlerExecutor d() {
        if (this.f12246c == null) {
            synchronized (this) {
                try {
                    if (this.f12246c == null) {
                        this.f12244a.getClass();
                        HandlerThreadC0534cb a3 = C1127z9.a("IAA-STE");
                        this.f12246c = new C1127z9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f12246c;
    }

    public C0749kk(C0723jk c0723jk) {
        new HashMap();
        this.f12244a = c0723jk;
    }
}
