package com.startapp.sdk.ads.video;

import com.startapp.sdk.internal.pd;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3153a;

    public b(c cVar) {
        this.f3153a = cVar;
    }

    public final void a() {
        c cVar = this.f3153a;
        if (!cVar.f3175f0) {
            cVar.a(VideoMode$VideoFinishedReason.COMPLETE);
        }
        pd pdVar = this.f3153a.L;
        if (pdVar != null) {
            pdVar.f4310h.stopPlayback();
        }
    }
}
