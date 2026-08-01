package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class rf extends jf implements hf {

    /* renamed from: u, reason: collision with root package name */
    public final Exception f2764u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2765v;

    /* JADX WARN: Multi-variable type inference failed */
    public rf(String str, hf hfVar, wf wfVar, boolean z10, ag agVar) {
        super("<missing root>:".concat(str), (ff) hfVar, wf.a(wfVar, vf.f2897f), agVar);
        this.f2764u = hfVar.e();
        this.f2765v = z10;
    }

    @Override // com.google.android.gms.internal.measurement.hf
    public final rf B(String str, wf wfVar, boolean z10, ag agVar) {
        boolean z11 = this.f2765v;
        if (z10 && !z11) {
            AtomicReference atomicReference = mf.f2542a;
        }
        boolean z12 = true;
        if ((!z10 || z11) && !z11) {
            z12 = false;
        }
        return new rf(str, this, wfVar, z12, agVar);
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final bg I(String str, wf wfVar, ag agVar) {
        AtomicReference atomicReference = mf.f2542a;
        return B(str, wfVar, true, agVar);
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final wf b() {
        return vf.f2896e;
    }

    @Override // com.google.android.gms.internal.measurement.hf
    public final Exception e() {
        return this.f2764u;
    }

    public rf(UUID uuid, String str, String str2, wf wfVar, Exception exc, ag agVar) {
        super("<missing root>:".concat(str2), uuid, str, wf.a(wfVar, vf.f2897f), agVar);
        this.f2764u = exc;
        this.f2765v = false;
    }
}
