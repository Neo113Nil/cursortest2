package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0339p f5919a = new C0339p();

    /* renamed from: b, reason: collision with root package name */
    public final String f5920b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f5921c;

    public V(Class cls) {
        this.f5920b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f5921c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f5919a) {
            try {
                Logger logger2 = this.f5921c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f5920b);
                this.f5921c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
