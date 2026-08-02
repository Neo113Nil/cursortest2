package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final Y3 f6928a;

    /* renamed from: b, reason: collision with root package name */
    public volatile G9 f6929b;

    /* renamed from: c, reason: collision with root package name */
    public volatile G9 f6930c;

    public Z3() {
        this(new Y3());
    }

    public final IHandlerExecutor a() {
        if (this.f6929b == null) {
            synchronized (this) {
                try {
                    if (this.f6929b == null) {
                        this.f6928a.getClass();
                        HandlerThreadC0592jb a3 = G9.a("IAA-CDE");
                        this.f6929b = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6929b;
    }

    public final ICommonExecutor b() {
        if (this.f6930c == null) {
            synchronized (this) {
                try {
                    if (this.f6930c == null) {
                        this.f6928a.getClass();
                        HandlerThreadC0592jb a3 = G9.a("IAA-CRS");
                        this.f6930c = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f6930c;
    }

    public Z3(Y3 y3) {
        this.f6928a = y3;
    }
}
