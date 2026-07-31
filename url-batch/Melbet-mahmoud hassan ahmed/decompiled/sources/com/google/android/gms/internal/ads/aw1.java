package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class aw1 implements ow2 {

    /* renamed from: g, reason: collision with root package name */
    private final sv1 f2989g;

    /* renamed from: h, reason: collision with root package name */
    private final v3.d f2990h;

    /* renamed from: f, reason: collision with root package name */
    private final Map<gw2, Long> f2988f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Map<gw2, zv1> f2991i = new HashMap();

    public aw1(sv1 sv1Var, Set<zv1> set, v3.d dVar) {
        gw2 gw2Var;
        this.f2989g = sv1Var;
        for (zv1 zv1Var : set) {
            Map<gw2, zv1> map = this.f2991i;
            gw2Var = zv1Var.f15272c;
            map.put(gw2Var, zv1Var);
        }
        this.f2990h = dVar;
    }

    private final void c(gw2 gw2Var, boolean z6) {
        gw2 gw2Var2;
        String str;
        gw2Var2 = this.f2991i.get(gw2Var).f15271b;
        String str2 = true != z6 ? "f." : "s.";
        if (this.f2988f.containsKey(gw2Var2)) {
            long a7 = this.f2990h.a() - this.f2988f.get(gw2Var2).longValue();
            Map<String, String> a8 = this.f2989g.a();
            str = this.f2991i.get(gw2Var).f15270a;
            String concat = str.length() != 0 ? "label.".concat(str) : new String("label.");
            String valueOf = String.valueOf(Long.toString(a7));
            a8.put(concat, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void a(gw2 gw2Var, String str) {
        if (this.f2988f.containsKey(gw2Var)) {
            long a7 = this.f2990h.a() - this.f2988f.get(gw2Var).longValue();
            Map<String, String> a8 = this.f2989g.a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(a7));
            a8.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f2991i.containsKey(gw2Var)) {
            c(gw2Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void b(gw2 gw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void s(gw2 gw2Var, String str) {
        this.f2988f.put(gw2Var, Long.valueOf(this.f2990h.a()));
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void z(gw2 gw2Var, String str, Throwable th) {
        if (this.f2988f.containsKey(gw2Var)) {
            long a7 = this.f2990h.a() - this.f2988f.get(gw2Var).longValue();
            Map<String, String> a8 = this.f2989g.a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(a7));
            a8.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f2991i.containsKey(gw2Var)) {
            c(gw2Var, false);
        }
    }
}
