package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2942rk {

    /* renamed from: a, reason: collision with root package name */
    public final C2917qk f39744a;

    /* renamed from: b, reason: collision with root package name */
    public volatile U9 f39745b;

    /* renamed from: c, reason: collision with root package name */
    public volatile U9 f39746c;

    /* renamed from: d, reason: collision with root package name */
    public volatile U9 f39747d;

    /* renamed from: e, reason: collision with root package name */
    public volatile U9 f39748e;

    /* renamed from: f, reason: collision with root package name */
    public volatile U9 f39749f;

    /* renamed from: g, reason: collision with root package name */
    public volatile U9 f39750g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ExecutorC2891pk f39751h;

    public C2942rk() {
        this(new C2917qk());
    }

    public final IHandlerExecutor a() {
        if (this.f39750g == null) {
            synchronized (this) {
                try {
                    if (this.f39750g == null) {
                        this.f39744a.getClass();
                        HandlerThreadC3089xb a4 = U9.a("IAA-SDE");
                        this.f39750g = new U9(a4, a4.getLooper(), new Handler(a4.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f39750g;
    }

    public final IHandlerExecutor b() {
        if (this.f39745b == null) {
            synchronized (this) {
                try {
                    if (this.f39745b == null) {
                        this.f39744a.getClass();
                        HandlerThreadC3089xb a4 = U9.a("IAA-SC");
                        this.f39745b = new U9(a4, a4.getLooper(), new Handler(a4.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f39745b;
    }

    public final IHandlerExecutor c() {
        if (this.f39747d == null) {
            synchronized (this) {
                try {
                    if (this.f39747d == null) {
                        this.f39744a.getClass();
                        HandlerThreadC3089xb a4 = U9.a("IAA-SMH-1");
                        this.f39747d = new U9(a4, a4.getLooper(), new Handler(a4.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f39747d;
    }

    public final IHandlerExecutor d() {
        if (this.f39748e == null) {
            synchronized (this) {
                try {
                    if (this.f39748e == null) {
                        this.f39744a.getClass();
                        HandlerThreadC3089xb a4 = U9.a("IAA-SNTPE");
                        this.f39748e = new U9(a4, a4.getLooper(), new Handler(a4.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f39748e;
    }

    public final IHandlerExecutor e() {
        if (this.f39746c == null) {
            synchronized (this) {
                try {
                    if (this.f39746c == null) {
                        this.f39744a.getClass();
                        HandlerThreadC3089xb a4 = U9.a("IAA-STE");
                        this.f39746c = new U9(a4, a4.getLooper(), new Handler(a4.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f39746c;
    }

    public final Executor f() {
        if (this.f39751h == null) {
            synchronized (this) {
                try {
                    if (this.f39751h == null) {
                        this.f39744a.getClass();
                        this.f39751h = new ExecutorC2891pk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f39751h;
    }

    public C2942rk(C2917qk c2917qk) {
        new HashMap();
        this.f39744a = c2917qk;
    }
}
