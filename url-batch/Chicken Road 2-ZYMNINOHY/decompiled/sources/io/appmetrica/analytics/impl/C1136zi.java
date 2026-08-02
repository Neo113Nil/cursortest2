package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136zi extends A4 {
    public C1136zi(C1070x4 c1070x4) {
        super(c1070x4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(P5 p5, C0992u4 c0992u4) {
        Bundle bundle = p5.f10806m;
        this.f10020a.f13009k.a(new C1044w4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
