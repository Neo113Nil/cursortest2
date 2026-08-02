package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Yn f12635a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f12636b;

    /* renamed from: c, reason: collision with root package name */
    public Ba f12637c;

    /* renamed from: d, reason: collision with root package name */
    public Ca f12638d;

    public C0910r0() {
        this(new Yn());
    }

    public final synchronized Ba a(Context context, R3 r32) {
        try {
            if (this.f12637c == null) {
                if (a(context)) {
                    this.f12637c = new C1014v0();
                } else {
                    this.f12637c = new C0885q0(context, r32);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12637c;
    }

    public C0910r0(Yn yn) {
        this.f12635a = yn;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f12636b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.f12636b;
                    if (bool == null) {
                        this.f12635a.getClass();
                        boolean a3 = Yn.a(context);
                        bool = Boolean.valueOf(!a3);
                        this.f12636b = bool;
                        if (!a3) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }
}
