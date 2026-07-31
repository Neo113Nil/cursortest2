package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2845o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Vn f39532a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f39533b;

    /* renamed from: c, reason: collision with root package name */
    public Wa f39534c;

    /* renamed from: d, reason: collision with root package name */
    public Xa f39535d;

    public C2845o0() {
        this(new Vn());
    }

    public final synchronized Wa a(Context context, C2823n4 c2823n4) {
        try {
            if (this.f39534c == null) {
                if (a(context)) {
                    this.f39534c = new C2897q0();
                } else {
                    this.f39534c = new C2819n0(context, c2823n4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39534c;
    }

    public C2845o0(Vn vn) {
        this.f39532a = vn;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f39533b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.f39533b;
                    if (bool == null) {
                        this.f39532a.getClass();
                        boolean a4 = Vn.a(context);
                        bool = Boolean.valueOf(!a4);
                        this.f39533b = bool;
                        if (!a4) {
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
