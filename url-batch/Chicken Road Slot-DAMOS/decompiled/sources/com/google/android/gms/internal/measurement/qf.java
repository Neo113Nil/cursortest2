package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class qf extends ff implements hf {

    /* renamed from: u, reason: collision with root package name */
    public static final b1.j f2716u = new b1.j(6);

    /* renamed from: t, reason: collision with root package name */
    public final Exception f2717t;

    public qf(UUID uuid, String str, Exception exc, ag agVar) {
        super("<missing root>", uuid, str, agVar);
        this.f2717t = exc;
    }

    @Override // com.google.android.gms.internal.measurement.hf
    public final rf B(String str, wf wfVar, boolean z10, ag agVar) {
        if (z10) {
            AtomicReference atomicReference = mf.f2542a;
        }
        return new rf(str, this, wfVar, z10, agVar);
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final bg I(String str, wf wfVar, ag agVar) {
        AtomicReference atomicReference = mf.f2542a;
        return B(str, wfVar, true, agVar);
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final wf c() {
        return vf.f2896e;
    }

    @Override // com.google.android.gms.internal.measurement.hf
    public final Exception e() {
        return this.f2717t;
    }
}
