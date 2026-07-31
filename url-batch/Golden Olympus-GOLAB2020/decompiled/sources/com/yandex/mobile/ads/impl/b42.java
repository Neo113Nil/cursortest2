package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a42;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b42 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a42 f23593b;

    b42(a42 a42Var) {
        this.f23593b = a42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w32 b4;
        long j4;
        while (true) {
            a42 a42Var = this.f23593b;
            synchronized (a42Var) {
                b4 = a42Var.b();
            }
            if (b4 == null) {
                return;
            }
            z32 d4 = b4.d();
            Intrinsics.checkNotNull(d4);
            a42 a42Var2 = this.f23593b;
            a42 a42Var3 = a42.f23152h;
            boolean isLoggable = a42.b.a().isLoggable(Level.FINE);
            if (isLoggable) {
                j4 = d4.h().d().a();
                x32.b(b4, d4, "starting");
            } else {
                j4 = -1;
            }
            try {
                try {
                    a42Var2.b(b4);
                    Unit unit = Unit.f41027a;
                    if (isLoggable) {
                        x32.b(b4, d4, "finished run in " + x32.a(d4.h().d().a() - j4));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (isLoggable) {
                    x32.b(b4, d4, "failed a run in " + x32.a(d4.h().d().a() - j4));
                }
                throw th;
            }
        }
    }
}
