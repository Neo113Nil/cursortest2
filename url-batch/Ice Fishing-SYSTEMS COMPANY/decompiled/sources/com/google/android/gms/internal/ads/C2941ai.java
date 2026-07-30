package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.ScheduledExecutorService;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2941ai implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29262a;

    /* renamed from: b, reason: collision with root package name */
    public final C2860Xh f29263b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f29264c;

    public /* synthetic */ C2941ai(C2860Xh c2860Xh, C4009uN c4009uN, int i) {
        this.f29262a = i;
        this.f29263b = c2860Xh;
        this.f29264c = c4009uN;
    }

    public A3 a() {
        Context a9 = this.f29263b.a();
        Zu zu = (Zu) this.f29264c.d();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        p2.j jVar = p2.j.f39798C;
        C2855Xc c4 = jVar.f39817r.c(a9, C5107a.a(), zu);
        C2837Wb c2837Wb = AbstractC2655Lg.f26168C;
        c4.getClass();
        return new A3(a9, jVar.f39817r.c(a9, C5107a.a(), zu).a("google.afma.sdkConstants.getSdkConstants", c2837Wb, c2837Wb), C5107a.a(), c3157eg);
    }

    public C3278gs b() {
        return new C3278gs(2, this.f29263b.a(), (Intent) this.f29264c.d());
    }

    public Mt c() {
        C3165eo c3165eo = (C3165eo) this.f29264c.d();
        this.f29263b.a();
        return new Mt(3, c3165eo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f29262a) {
            case 0:
                try {
                    return U2.c.a(this.f29263b.a()).e(0, ((ApplicationInfo) this.f29264c.d()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return a();
            case 2:
                return new u2.l(this.f29263b.a(), (String) this.f29264c.d());
            case 3:
                return new C2844Wi(this.f29263b.a(), (C3617n8) this.f29264c.d());
            case 4:
                return new C3382ip(this.f29263b.a(), (C3165eo) this.f29264c.d());
            case 5:
                return new C4244yp(this.f29263b.a(), (C2569Gf) this.f29264c.d());
            case 6:
                return b();
            case 7:
                C2569Gf c2569Gf = (C2569Gf) this.f29264c.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new Wr(c2569Gf, c3157eg, this.f29263b.a(), 3);
            case 8:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f29264c.d();
                this.f29263b.a();
                return new Or(7, scheduledExecutorService);
            case 9:
                return new Qu(this.f29263b.a(), (Yu) this.f29264c.d());
            default:
                return c();
        }
    }

    public /* synthetic */ C2941ai(C4009uN c4009uN, C2860Xh c2860Xh, int i) {
        this.f29262a = i;
        this.f29264c = c4009uN;
        this.f29263b = c2860Xh;
    }
}
