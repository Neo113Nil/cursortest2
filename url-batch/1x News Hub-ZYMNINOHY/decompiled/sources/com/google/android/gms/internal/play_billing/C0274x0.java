package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274x0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0232j f2958a = new C0232j();

    /* renamed from: b, reason: collision with root package name */
    public final String f2959b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f2960c;

    public C0274x0(Class cls) {
        this.f2959b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f2960c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f2958a) {
            try {
                Logger logger2 = this.f2960c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f2959b);
                this.f2960c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
