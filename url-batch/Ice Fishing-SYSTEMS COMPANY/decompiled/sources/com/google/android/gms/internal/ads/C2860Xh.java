package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Xh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2860Xh implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28668a;

    /* renamed from: b, reason: collision with root package name */
    public final C2809Uh f28669b;

    public /* synthetic */ C2860Xh(C2809Uh c2809Uh, int i) {
        this.f28668a = i;
        this.f28669b = c2809Uh;
    }

    public Context a() {
        Context context = this.f28669b.f28060b;
        AbstractC3137eE.h(context);
        return context;
    }

    public C5107a b() {
        C5107a c5107a = this.f28669b.f28059a;
        AbstractC3137eE.h(c5107a);
        return c5107a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f28668a) {
            case 0:
                C2809Uh c2809Uh = this.f28669b;
                return new C2792Th(c2809Uh.f28060b, c2809Uh.f28059a);
            case 1:
                Context context = this.f28669b.f28060b;
                AbstractC3137eE.h(context);
                return context;
            case 2:
                Context context2 = this.f28669b.f28060b;
                AbstractC3137eE.h(context2);
                return context2;
            case 3:
                WeakReference weakReference = this.f28669b.f28062d;
                AbstractC3137eE.h(weakReference);
                return weakReference;
            case 4:
                return new C3550lw(this.f28669b.f28060b);
            case 5:
                C2809Uh c2809Uh2 = this.f28669b;
                return new p2.e(c2809Uh2.f28060b, c2809Uh2.f28059a);
            case 6:
                C2809Uh c2809Uh3 = this.f28669b;
                String E8 = p2.j.f39798C.f39803c.E(c2809Uh3.f28060b, c2809Uh3.f28059a.f41217n);
                AbstractC3137eE.h(E8);
                return E8;
            case 7:
                C5107a c5107a = this.f28669b.f28059a;
                AbstractC3137eE.h(c5107a);
                return c5107a;
            default:
                return Long.valueOf(this.f28669b.f28061c);
        }
    }
}
