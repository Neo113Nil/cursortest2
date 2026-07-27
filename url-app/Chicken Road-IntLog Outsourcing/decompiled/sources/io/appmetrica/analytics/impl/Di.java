package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Di implements InterfaceC0726ik {

    /* renamed from: e, reason: collision with root package name */
    public static final Ci f6685e = new Ci();

    /* renamed from: f, reason: collision with root package name */
    public static final long f6686f = TimeUnit.SECONDS.toMillis(4);

    /* renamed from: a, reason: collision with root package name */
    public final C0888p0 f6687a;

    /* renamed from: b, reason: collision with root package name */
    public final C0598dk f6688b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeProvider f6689c;

    /* renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f6690d;

    public Di(C0888p0 c0888p0, C0598dk c0598dk, TimeProvider timeProvider) {
        this.f6687a = c0888p0;
        this.f6688b = c0598dk;
        this.f6689c = timeProvider;
        this.f6690d = C0736j4.l().g().b();
    }

    public final void a(Ah ah) {
        Callable ug;
        ICommonExecutor iCommonExecutor = this.f6690d;
        if (ah.f6531b) {
            C0598dk c0598dk = this.f6688b;
            ug = new C0738j6(c0598dk.f8051a, c0598dk.f8052b, c0598dk.f8053c, ah);
        } else {
            C0598dk c0598dk2 = this.f6688b;
            ug = new Ug(c0598dk2.f8052b, c0598dk2.f8053c, ah);
        }
        iCommonExecutor.submit(ug);
    }

    public final void b(Ah ah) {
        long uptimeMillis = this.f6689c.uptimeMillis();
        C0598dk c0598dk = this.f6688b;
        C0738j6 c0738j6 = new C0738j6(c0598dk.f8051a, c0598dk.f8052b, c0598dk.f8053c, ah);
        if (this.f6687a.a()) {
            try {
                this.f6690d.submit(c0738j6).get(f6686f, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!c0738j6.f6639c) {
            try {
                c0738j6.a();
            } catch (Throwable unused2) {
            }
        }
        try {
            Thread.sleep(Math.max(0L, f6686f - (this.f6689c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused3) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0726ik
    public final void reportData(int i2, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f6690d;
        C0598dk c0598dk = this.f6688b;
        iCommonExecutor.submit(new Pn(c0598dk.f8052b, c0598dk.f8053c, i2, bundle));
    }

    public Di(C0888p0 c0888p0, C0598dk c0598dk) {
        this(c0888p0, c0598dk, new SystemTimeProvider());
    }

    public final void a(Gf gf) {
        ICommonExecutor iCommonExecutor = this.f6690d;
        C0598dk c0598dk = this.f6688b;
        iCommonExecutor.submit(new C1109xe(c0598dk.f8052b, c0598dk.f8053c, gf));
    }

    public final void b(Gf gf) {
        ICommonExecutor iCommonExecutor = this.f6690d;
        C0598dk c0598dk = this.f6688b;
        iCommonExecutor.submit(new Ji(c0598dk.f8052b, c0598dk.f8053c, gf));
    }
}
