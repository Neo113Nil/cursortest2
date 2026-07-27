package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final Y3 f7768a;

    /* renamed from: b, reason: collision with root package name */
    public volatile G9 f7769b;

    /* renamed from: c, reason: collision with root package name */
    public volatile G9 f7770c;

    public Z3() {
        this(new Y3());
    }

    public final IHandlerExecutor a() {
        if (this.f7769b == null) {
            synchronized (this) {
                try {
                    if (this.f7769b == null) {
                        this.f7768a.getClass();
                        HandlerThreadC0743jb a6 = G9.a("IAA-CDE");
                        this.f7769b = new G9(a6, a6.getLooper(), new Handler(a6.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f7769b;
    }

    public final ICommonExecutor b() {
        if (this.f7770c == null) {
            synchronized (this) {
                try {
                    if (this.f7770c == null) {
                        this.f7768a.getClass();
                        HandlerThreadC0743jb a6 = G9.a("IAA-CRS");
                        this.f7770c = new G9(a6, a6.getLooper(), new Handler(a6.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f7770c;
    }

    public Z3(Y3 y32) {
        this.f7768a = y32;
    }
}
