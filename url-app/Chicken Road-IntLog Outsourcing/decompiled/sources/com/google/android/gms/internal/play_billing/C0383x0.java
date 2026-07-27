package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383x0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0341j f5287a = new C0341j();

    /* renamed from: b, reason: collision with root package name */
    public final String f5288b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f5289c;

    public C0383x0(Class cls) {
        this.f5288b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f5289c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f5287a) {
            try {
                Logger logger2 = this.f5289c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f5288b);
                this.f5289c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
