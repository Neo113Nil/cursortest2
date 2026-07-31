package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2888ph extends AbstractC2601eh {
    public C2888ph(@NotNull C2953s5 c2953s5) {
        super(c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NotNull C2773l6 c2773l6) {
        Ek ek;
        Uk uk;
        F9 f9 = this.f38930a.f39778n;
        Sk sk = f9.f37519c;
        if (sk.f38268g == 0) {
            ek = sk.f38265d.b();
            Ek b4 = sk.f38266e.b();
            if ((ek == null ? -1L : ek.f37477d) <= (b4 != null ? b4.f37477d : -1L)) {
                ek = b4;
            }
        } else {
            ek = sk.f38267f;
        }
        if (ek != null) {
            uk = new Uk();
            uk.f38378a = ek.f37477d;
            long andIncrement = ek.f37479f.getAndIncrement();
            Vk vk = ek.f37475b;
            vk.a(Vk.f38439g, Long.valueOf(ek.f37479f.get()));
            vk.b();
            uk.f38379b = andIncrement;
            uk.f38380c = TimeUnit.MILLISECONDS.toSeconds(ek.f37483j);
            uk.f38381d = ek.f37476c.f37662a;
        } else {
            long j4 = c2773l6.f39385j;
            long a4 = sk.f38263b.a();
            C2645g7 c2645g7 = sk.f38262a.f39769e;
            Wk wk = Wk.BACKGROUND;
            c2645g7.a(a4, wk, j4);
            uk = new Uk();
            uk.f38378a = a4;
            uk.f38381d = wk;
            uk.f38379b = 0L;
            uk.f38380c = 0L;
        }
        f9.a(c2773l6, uk);
        return false;
    }
}
