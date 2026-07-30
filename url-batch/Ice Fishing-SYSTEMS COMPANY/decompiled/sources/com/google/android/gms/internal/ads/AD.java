package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public abstract class AD extends AbstractC3300hD {

    /* renamed from: C, reason: collision with root package name */
    public static final AbstractC4161xD f23840C;

    /* renamed from: D, reason: collision with root package name */
    public static final RD f23841D = new RD(AD.class);

    /* renamed from: A, reason: collision with root package name */
    public volatile Set f23842A;

    /* renamed from: B, reason: collision with root package name */
    public volatile int f23843B;

    static {
        Throwable th;
        AbstractC4161xD c4269zD;
        try {
            c4269zD = new C4215yD();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c4269zD = new C4269zD();
        }
        Throwable th3 = th;
        f23840C = c4269zD;
        if (th3 != null) {
            f23841D.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
