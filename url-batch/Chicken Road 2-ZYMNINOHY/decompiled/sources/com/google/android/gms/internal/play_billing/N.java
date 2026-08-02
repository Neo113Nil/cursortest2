package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class N extends AbstractC0299a0 implements W {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f5887d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final V f5888e = new V(Z.class);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f5889f;

    /* renamed from: g, reason: collision with root package name */
    public static final O3.d f5890g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5891a;

    /* renamed from: b, reason: collision with root package name */
    public volatile H f5892b;

    /* renamed from: c, reason: collision with root package name */
    public volatile M f5893c;

    static {
        boolean z;
        O3.d k4;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f5889f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                k4 = new L();
            } catch (Error | Exception e4) {
                try {
                    k4 = new J();
                } catch (Error | Exception e5) {
                    th3 = e5;
                    k4 = new K();
                }
                th = th3;
                th2 = e4;
            }
        } else {
            try {
                k4 = new J();
            } catch (NoClassDefFoundError unused2) {
                k4 = new K();
            }
        }
        th = null;
        th2 = null;
        f5890g = k4;
        if (th != null) {
            V v = f5888e;
            Logger a3 = v.a();
            Level level = Level.SEVERE;
            a3.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            v.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(M m4) {
        m4.f5874a = null;
        while (true) {
            M m5 = this.f5893c;
            if (m5 != M.f5873c) {
                M m6 = null;
                while (m5 != null) {
                    M m7 = m5.f5875b;
                    if (m5.f5874a != null) {
                        m6 = m5;
                    } else if (m6 != null) {
                        m6.f5875b = m7;
                        if (m6.f5874a == null) {
                            break;
                        }
                    } else if (!f5890g.S(this, m5, m7)) {
                        break;
                    }
                    m5 = m7;
                }
                return;
            }
            return;
        }
    }
}
