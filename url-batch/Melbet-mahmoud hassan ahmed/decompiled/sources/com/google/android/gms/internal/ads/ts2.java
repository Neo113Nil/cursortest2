package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ts2 {

    /* renamed from: a, reason: collision with root package name */
    private final rr2 f12371a;

    /* renamed from: b, reason: collision with root package name */
    private final ur2 f12372b;

    /* renamed from: c, reason: collision with root package name */
    private final o42 f12373c;

    /* renamed from: d, reason: collision with root package name */
    private final cy2 f12374d;

    public ts2(o42 o42Var, cy2 cy2Var, rr2 rr2Var, ur2 ur2Var) {
        this.f12371a = rr2Var;
        this.f12372b = ur2Var;
        this.f12373c = o42Var;
        this.f12374d = cy2Var;
    }

    public final void a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            b(it.next(), 2);
        }
    }

    public final void b(String str, int i7) {
        if (!this.f12371a.f11380g0) {
            this.f12374d.b(str);
        } else {
            this.f12373c.i(new q42(y2.t.a().b(), this.f12372b.f12947b, str, i7));
        }
    }

    public final void c(List<String> list, int i7) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            b(it.next(), i7);
        }
    }
}
