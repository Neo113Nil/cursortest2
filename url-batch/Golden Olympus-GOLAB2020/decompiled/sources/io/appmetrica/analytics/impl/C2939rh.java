package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2939rh extends AbstractC2601eh {
    public C2939rh(C2953s5 c2953s5) {
        super(c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        C2953s5 c2953s5 = this.f38930a;
        synchronized (c2953s5) {
            ((F5) c2953s5.f39780p).d();
        }
        return false;
    }
}
