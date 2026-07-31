package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.n4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2823n4 {

    /* renamed from: a, reason: collision with root package name */
    public final C2797m4 f39486a;

    /* renamed from: b, reason: collision with root package name */
    public volatile U9 f39487b;

    /* renamed from: c, reason: collision with root package name */
    public volatile U9 f39488c;

    public C2823n4() {
        this(new C2797m4());
    }

    public final IHandlerExecutor a() {
        if (this.f39487b == null) {
            synchronized (this) {
                try {
                    if (this.f39487b == null) {
                        this.f39486a.getClass();
                        HandlerThreadC3089xb a4 = U9.a("IAA-CDE");
                        this.f39487b = new U9(a4, a4.getLooper(), new Handler(a4.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f39487b;
    }

    public final ICommonExecutor b() {
        if (this.f39488c == null) {
            synchronized (this) {
                try {
                    if (this.f39488c == null) {
                        this.f39486a.getClass();
                        HandlerThreadC3089xb a4 = U9.a("IAA-CRS");
                        this.f39488c = new U9(a4, a4.getLooper(), new Handler(a4.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f39488c;
    }

    public C2823n4(C2797m4 c2797m4) {
        this.f39486a = c2797m4;
    }
}
