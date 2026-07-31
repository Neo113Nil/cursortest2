package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ji1 extends lg1<zn> implements zn {

    /* renamed from: g, reason: collision with root package name */
    private final Map<View, ao> f7128g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f7129h;

    /* renamed from: i, reason: collision with root package name */
    private final rr2 f7130i;

    public ji1(Context context, Set<hi1<zn>> set, rr2 rr2Var) {
        super(set);
        this.f7128g = new WeakHashMap(1);
        this.f7129h = context;
        this.f7130i = rr2Var;
    }

    public final synchronized void S0(View view) {
        ao aoVar = this.f7128g.get(view);
        if (aoVar == null) {
            aoVar = new ao(this.f7129h, view);
            aoVar.c(this);
            this.f7128g.put(view, aoVar);
        }
        if (this.f7130i.U) {
            if (((Boolean) sw.c().b(m10.Z0)).booleanValue()) {
                aoVar.g(((Long) sw.c().b(m10.Y0)).longValue());
                return;
            }
        }
        aoVar.f();
    }

    public final synchronized void U0(View view) {
        if (this.f7128g.containsKey(view)) {
            this.f7128g.get(view).e(this);
            this.f7128g.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final synchronized void o0(final xn xnVar) {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.ii1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((zn) obj).o0(xn.this);
            }
        });
    }
}
