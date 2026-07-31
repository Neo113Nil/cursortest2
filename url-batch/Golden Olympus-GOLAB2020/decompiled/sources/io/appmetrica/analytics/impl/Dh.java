package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Dh extends AbstractC2601eh {
    public Dh(C2953s5 c2953s5) {
        super(c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        ((F5) this.f38930a.f39780p).e();
        Sk sk = this.f38930a.f39774j;
        synchronized (sk) {
            try {
                Ek b4 = sk.b(c2773l6);
                if (b4.f37480g) {
                    b4.f37480g = false;
                    Vk vk = b4.f37475b;
                    vk.a(Vk.f38441i, Boolean.FALSE);
                    vk.b();
                }
                if (sk.f38268g != 1) {
                    sk.b(sk.f38267f, c2773l6);
                }
                sk.f38268g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
