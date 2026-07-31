package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Ch extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final Gi f37305b;

    public Ch(C2953s5 c2953s5) {
        super(c2953s5);
        this.f37305b = new Gi(new G9(c2953s5), c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        return this.f37305b.a(c2773l6, new Fi());
    }
}
