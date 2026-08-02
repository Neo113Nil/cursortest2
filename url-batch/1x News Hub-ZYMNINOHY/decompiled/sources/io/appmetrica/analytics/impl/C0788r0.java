package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788r0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0373ao f8190a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f8191b;

    /* renamed from: c, reason: collision with root package name */
    public Ia f8192c;

    /* renamed from: d, reason: collision with root package name */
    public Ja f8193d;

    public C0788r0() {
        this(new C0373ao());
    }

    public final synchronized Ia a(Context context, Z3 z3) {
        try {
            if (this.f8192c == null) {
                if (a(context)) {
                    this.f8192c = new C0840t0();
                } else {
                    this.f8192c = new C0763q0(context, z3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8192c;
    }

    public C0788r0(C0373ao c0373ao) {
        this.f8190a = c0373ao;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f8191b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.f8191b;
                    if (bool == null) {
                        this.f8190a.getClass();
                        boolean a3 = C0373ao.a(context);
                        bool = Boolean.valueOf(!a3);
                        this.f8191b = bool;
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
