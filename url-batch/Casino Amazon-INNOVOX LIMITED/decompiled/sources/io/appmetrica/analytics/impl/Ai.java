package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public final class Ai extends B4 {
    public Ai(C0644y4 c0644y4) {
        super(c0644y4);
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(Q5 q5, C0569v4 c0569v4) {
        Bundle bundle = q5.m;
        this.f771a.k.a(new C0619x4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
