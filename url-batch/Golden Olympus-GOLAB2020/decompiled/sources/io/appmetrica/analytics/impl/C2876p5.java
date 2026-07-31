package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2876p5 extends AbstractC2850o5 {
    public C2876p5(@NotNull C2953s5 c2953s5) {
        super(c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2850o5
    public final boolean b(int i4) {
        return i4 < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2850o5
    public final void c() {
        C2756kf c2756kf = this.f39554a.f39767c;
        try {
            Vk vk = new Vk(c2756kf, L2.f37912g);
            Long a4 = vk.f38444c.a(Vk.f38436d);
            if (a4 != null) {
                vk.a(Vk.f38436d, Long.valueOf(TimeUnit.SECONDS.toMillis(a4.longValue())));
            }
            Long a5 = vk.f38444c.a(Vk.f38437e);
            if (a5 != null) {
                vk.a(Vk.f38437e, Long.valueOf(TimeUnit.SECONDS.toMillis(a5.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Vk vk2 = new Vk(c2756kf, Ca.f37288g);
            Long a6 = vk2.f38444c.a(Vk.f38436d);
            if (a6 != null) {
                vk2.a(Vk.f38436d, Long.valueOf(TimeUnit.SECONDS.toMillis(a6.longValue())));
            }
            Long a7 = vk2.f38444c.a(Vk.f38437e);
            if (a7 != null) {
                vk2.a(Vk.f38437e, Long.valueOf(TimeUnit.SECONDS.toMillis(a7.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
