package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Ey implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24865a;

    /* renamed from: b, reason: collision with root package name */
    public final C4117wN f24866b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f24867c;

    /* renamed from: d, reason: collision with root package name */
    public final C4117wN f24868d;

    /* renamed from: e, reason: collision with root package name */
    public final C4117wN f24869e;

    /* renamed from: f, reason: collision with root package name */
    public final C4009uN f24870f;

    public Ey(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C4009uN c4009uN2, C4117wN c4117wN3) {
        this.f24865a = 0;
        this.f24866b = c4117wN;
        this.f24867c = c4009uN;
        this.f24868d = c4117wN2;
        this.f24870f = c4009uN2;
        this.f24869e = c4117wN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f24865a) {
            case 0:
                Context context = (Context) this.f24866b.f34977a;
                InterfaceC3929sy interfaceC3929sy = (InterfaceC3929sy) this.f24867c.d();
                ExecutorService executorService = (ExecutorService) this.f24868d.f34977a;
                C3875ry c3875ry = (C3875ry) this.f24870f.d();
                C3066cy c3066cy = (C3066cy) this.f24869e.f34977a;
                return new Hy(context, interfaceC3929sy, executorService, c3875ry, new Random(), c3066cy.T().A(), c3066cy.T().C(), c3066cy.T().D(), c3066cy.T().B(), c3066cy.R(), c3066cy.L(), c3066cy.J() - 1);
            case 1:
                return new C3499kz((C3830r6) this.f24866b.f34977a, (C3391iz) this.f24867c.d(), (View) this.f24868d.f34977a, (Activity) this.f24869e.f34977a, (C4158xA) this.f24870f.d());
            case 2:
                return new C3499kz((C3830r6) this.f24866b.f34977a, (C3391iz) this.f24867c.d(), (Map) this.f24868d.f34977a, (Context) this.f24869e.f34977a, (C4158xA) this.f24870f.d());
            default:
                return new C3499kz((C3830r6) this.f24866b.f34977a, (C3391iz) this.f24867c.d(), (EnumC3714oy) this.f24868d.f34977a, (Map) this.f24869e.f34977a, (C4158xA) this.f24870f.d());
        }
    }

    public /* synthetic */ Ey(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C4117wN c4117wN3, C4009uN c4009uN2, int i) {
        this.f24865a = i;
        this.f24866b = c4117wN;
        this.f24867c = c4009uN;
        this.f24868d = c4117wN2;
        this.f24869e = c4117wN3;
        this.f24870f = c4009uN2;
    }
}
