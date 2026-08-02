package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class Ei extends H4 {
    public Ei(E4 e4) {
        super(e4);
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(W5 w5, B4 b4) {
        Bundle bundle = w5.f6826m;
        this.f6061a.f5943k.a(new D4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
