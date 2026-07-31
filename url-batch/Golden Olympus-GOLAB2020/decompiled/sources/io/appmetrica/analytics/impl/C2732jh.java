package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2732jh extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final C3024uo f39286b;

    public C2732jh(@NonNull C2953s5 c2953s5) {
        this(c2953s5, c2953s5.t());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        C2953s5 c2953s5 = this.f38930a;
        if (this.f39286b.c()) {
            return false;
        }
        if (!this.f39286b.d()) {
            F9 f9 = c2953s5.f39778n;
            f9.f37519c.b(C2773l6.a(c2773l6, EnumC3063wb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        C3024uo c3024uo = this.f39286b;
        synchronized (c3024uo) {
            C3050vo c3050vo = c3024uo.f39951a;
            c3050vo.a(c3050vo.a().put("first_event_done", true));
        }
        return false;
    }

    public C2732jh(C2953s5 c2953s5, C3024uo c3024uo) {
        super(c2953s5);
        this.f39286b = c3024uo;
    }
}
