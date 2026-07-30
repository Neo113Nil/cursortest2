package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ya, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4229ya implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35349a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f35350b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f35351c;

    /* renamed from: d, reason: collision with root package name */
    public final C2860Xh f35352d;

    public /* synthetic */ C4229ya(C2860Xh c2860Xh, C4009uN c4009uN, C4009uN c4009uN2, int i) {
        this.f35349a = i;
        this.f35352d = c2860Xh;
        this.f35350b = c4009uN;
        this.f35351c = c4009uN2;
    }

    public Qr a() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new Qr(c3157eg, (Object) this.f35352d.a(), this.f35350b.d(), this.f35351c.d(), 8);
    }

    public Wr b() {
        return new Wr((ApplicationInfo) this.f35350b.d(), (PackageInfo) this.f35351c.d(), this.f35352d.a(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f35349a) {
            case 0:
                this.f35352d.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f35350b.d();
                return new C4175xa(scheduledExecutorService);
            case 1:
                return new C2900Zn((C3002bo) this.f35350b.d(), (C3381io) this.f35351c.d(), this.f35352d.a());
            case 2:
                Context a9 = this.f35352d.a();
                C2892Zf c2892Zf = (C2892Zf) this.f35350b.d();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f35351c.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C3385is(a9, c2892Zf, scheduledExecutorService2, c3157eg);
            case 3:
                return b();
            default:
                return a();
        }
    }

    public /* synthetic */ C4229ya(C4009uN c4009uN, C4009uN c4009uN2, C2860Xh c2860Xh, int i) {
        this.f35349a = i;
        this.f35350b = c4009uN;
        this.f35351c = c4009uN2;
        this.f35352d = c2860Xh;
    }
}
