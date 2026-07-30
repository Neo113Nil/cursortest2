package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.rD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3837rD extends AbstractC3192fE implements J3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f33988w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final RD f33989x = new RD(AbstractC3354iD.class);

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f33990y;

    /* renamed from: z, reason: collision with root package name */
    public static final AbstractC3406jD f33991z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f33992n;

    /* renamed from: u, reason: collision with root package name */
    public volatile C3191fD f33993u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C3784qD f33994v;

    static {
        boolean z8;
        AbstractC3406jD c3514lD;
        Throwable th;
        Throwable th2;
        try {
            z8 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z8 = false;
        }
        f33990y = z8;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                c3514lD = new C3730pD();
            } catch (Error | Exception e6) {
                try {
                    c3514lD = new C3460kD();
                } catch (Error | Exception e9) {
                    th3 = e9;
                    c3514lD = new C3514lD();
                }
                th = th3;
                th2 = e6;
            }
        } else {
            try {
                c3514lD = new C3460kD();
            } catch (NoClassDefFoundError unused2) {
                c3514lD = new C3514lD();
            }
        }
        th = null;
        th2 = null;
        f33991z = c3514lD;
        if (th != null) {
            RD rd = f33989x;
            Logger a9 = rd.a();
            Level level = Level.SEVERE;
            a9.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            rd.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(C3784qD c3784qD) {
        c3784qD.f33670a = null;
        while (true) {
            C3784qD c3784qD2 = this.f33994v;
            if (c3784qD2 != C3784qD.f33669c) {
                C3784qD c3784qD3 = null;
                while (c3784qD2 != null) {
                    C3784qD c3784qD4 = c3784qD2.f33671b;
                    if (c3784qD2.f33670a != null) {
                        c3784qD3 = c3784qD2;
                    } else if (c3784qD3 != null) {
                        c3784qD3.f33671b = c3784qD4;
                        if (c3784qD3.f33670a == null) {
                            break;
                        }
                    } else if (!f33991z.i(this, c3784qD2, c3784qD4)) {
                        break;
                    }
                    c3784qD2 = c3784qD4;
                }
                return;
            }
            return;
        }
    }
}
