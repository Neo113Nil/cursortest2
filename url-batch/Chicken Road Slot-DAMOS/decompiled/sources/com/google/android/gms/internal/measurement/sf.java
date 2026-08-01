package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class sf extends jf {

    /* renamed from: u, reason: collision with root package name */
    public static final sf f2803u;

    static {
        UUID randomUUID = UUID.randomUUID();
        f2803u = new sf("<skip trace>", randomUUID, ff.a(randomUUID), vf.f2896e, mf.c());
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final bg I(String str, wf wfVar, ag agVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final wf b() {
        return vf.f2896e;
    }
}
