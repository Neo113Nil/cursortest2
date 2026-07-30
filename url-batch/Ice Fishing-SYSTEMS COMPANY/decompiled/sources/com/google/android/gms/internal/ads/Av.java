package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Av {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23921a;

    /* renamed from: b, reason: collision with root package name */
    public final SD f23922b;

    /* renamed from: c, reason: collision with root package name */
    public final TD f23923c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.l f23924d;

    /* renamed from: e, reason: collision with root package name */
    public final C4250yv f23925e;

    /* renamed from: f, reason: collision with root package name */
    public final Zu f23926f;

    /* renamed from: g, reason: collision with root package name */
    public final C2775Sh f23927g;

    public Av(Context context, SD sd, TD td, u2.l lVar, C4250yv c4250yv, Zu zu, C2775Sh c2775Sh) {
        this.f23921a = context;
        this.f23922b = sd;
        this.f23923c = td;
        this.f23924d = lVar;
        this.f23925e = c4250yv;
        this.f23926f = zu;
        this.f23927g = c2775Sh;
    }

    public final void a(List list, t2.w wVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), wVar, null, null);
        }
    }

    public final void b(String str, t2.w wVar, Yu yu, C2744Qk c2744Qk) {
        J3.a b9;
        Vu vu = null;
        if (Zu.a() && ((Boolean) AbstractC2547Fa.f24967d.r()).booleanValue()) {
            vu = Vu.f(this.f23921a, 14);
            vu.a();
        }
        if (wVar != null) {
            b9 = new r((u2.h) wVar.f40939u, this.f23924d, this.f23923c, this.f23925e, this.f23927g, 10).b(str);
        } else {
            b9 = ((C3157eg) this.f23923c).b(new T6(9, this, str));
        }
        b9.c(new MD(0, b9, new C2518Df(this, vu, yu, c2744Qk)), this.f23922b);
    }
}
