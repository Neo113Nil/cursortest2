package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0966t4 extends Ad {

    /* renamed from: f, reason: collision with root package name */
    public final Object f12766f;

    public AbstractC0966t4(int i4, String str, Object obj, InterfaceC0960so interfaceC0960so, J2 j22) {
        super(i4, str, interfaceC0960so, j22);
        this.f12766f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ad, io.appmetrica.analytics.impl.InterfaceC0598eo
    public final void a(Cdo cdo) {
        if (f()) {
            J2 j22 = this.f10044d;
            int i4 = this.f10042b;
            C0624fo a3 = j22.a(cdo, (C0624fo) ((HashMap) cdo.f11709a.get(i4)).get(this.f10041a), this);
            if (a3 != null) {
                a(a3);
            }
        }
    }

    public abstract void a(C0624fo c0624fo);

    public final Object g() {
        return this.f12766f;
    }
}
