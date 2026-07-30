package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;
import p.AbstractC4841a;

/* renamed from: com.google.android.gms.internal.ads.qa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3798qa extends AbstractC4841a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3851ra f33732a;

    public C3798qa(C3851ra c3851ra) {
        Objects.requireNonNull(c3851ra);
        this.f33732a = c3851ra;
    }

    @Override // p.AbstractC4841a
    public final void e(int i, Bundle bundle) {
        C3851ra c3851ra = this.f33732a;
        c3851ra.getClass();
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31840y5)).booleanValue() || c3851ra.f34043v == null) {
            return;
        }
        AbstractC3212fg.f30738a.execute(new L.a(c3851ra, i, 5));
    }
}
