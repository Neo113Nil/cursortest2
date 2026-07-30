package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Yy {

    /* renamed from: a, reason: collision with root package name */
    public final SD f28925a;

    /* renamed from: b, reason: collision with root package name */
    public final Zy f28926b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f28927c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28928d;

    /* renamed from: e, reason: collision with root package name */
    public final C3830r6 f28929e;

    /* renamed from: f, reason: collision with root package name */
    public final C3391iz f28930f;

    /* renamed from: g, reason: collision with root package name */
    public final C4158xA f28931g;

    public Yy(SD sd, Zy zy, C3391iz c3391iz, EnumC3714oy enumC3714oy, String str, C3830r6 c3830r6, AN an, AN an2, AN an3, C4158xA c4158xA) {
        this.f28925a = sd;
        this.f28926b = zy;
        this.f28928d = str;
        this.f28930f = c3391iz;
        this.f28929e = c3830r6;
        this.f28931g = c4158xA;
        int ordinal = enumC3714oy.ordinal();
        if (ordinal == 0) {
            this.f28927c = an.d();
        } else if (ordinal == 1) {
            this.f28927c = an2.d();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            this.f28927c = an3.d();
        }
    }

    public final J3.a a() {
        boolean z8;
        boolean z9;
        Zy zy = this.f28926b;
        synchronized (zy) {
            z8 = zy.f29128d;
        }
        if (!z8) {
            return C3686oN.c(Integer.toString(7));
        }
        C3391iz c3391iz = this.f28930f;
        synchronized (c3391iz) {
            z9 = c3391iz.f32049j;
        }
        if (!z9) {
            return C3686oN.p(new Xy(this, 2), this.f28925a);
        }
        Set set = this.f28927c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3157eg) this.f28925a).b((InterfaceCallableC3930sz) it.next()));
        }
        UB n9 = UB.n(arrayList);
        Xy xy = new Xy(this, 0);
        HD hd = HD.f25326n;
        GD gd = new GD(n9, false, false);
        gd.f25114I = new FD(gd, xy, hd);
        gd.w();
        return gd;
    }
}
