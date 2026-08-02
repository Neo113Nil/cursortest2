package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class R3 {

    /* renamed from: a, reason: collision with root package name */
    public final Q3 f10867a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1127z9 f10868b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1127z9 f10869c;

    public R3() {
        this(new Q3());
    }

    public final IHandlerExecutor a() {
        if (this.f10868b == null) {
            synchronized (this) {
                try {
                    if (this.f10868b == null) {
                        this.f10867a.getClass();
                        HandlerThreadC0534cb a3 = C1127z9.a("IAA-CDE");
                        this.f10868b = new C1127z9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f10868b;
    }

    public final ICommonExecutor b() {
        if (this.f10869c == null) {
            synchronized (this) {
                try {
                    if (this.f10869c == null) {
                        this.f10867a.getClass();
                        HandlerThreadC0534cb a3 = C1127z9.a("IAA-CRS");
                        this.f10869c = new C1127z9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f10869c;
    }

    public R3(Q3 q32) {
        this.f10867a = q32;
    }
}
