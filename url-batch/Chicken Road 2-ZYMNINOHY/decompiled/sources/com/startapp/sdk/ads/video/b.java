package com.startapp.sdk.ads.video;

import com.startapp.sdk.internal.pd;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f6236a;

    public b(c cVar) {
        this.f6236a = cVar;
    }

    public final void a() {
        c cVar = this.f6236a;
        if (!cVar.f6258f0) {
            cVar.a(VideoMode$VideoFinishedReason.COMPLETE);
        }
        pd pdVar = this.f6236a.L;
        if (pdVar != null) {
            pdVar.f7445h.stopPlayback();
        }
    }
}
