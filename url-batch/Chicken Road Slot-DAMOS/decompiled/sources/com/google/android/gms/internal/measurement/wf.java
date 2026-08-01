package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class wf {

    /* renamed from: d, reason: collision with root package name */
    public static final uf f2954d = new uf();

    /* renamed from: a, reason: collision with root package name */
    public final wf f2955a;

    /* renamed from: b, reason: collision with root package name */
    public final s.r0 f2956b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2957c = false;

    public /* synthetic */ wf(wf wfVar, s.r0 r0Var) {
        if (wfVar != null) {
            i7.a.t(wfVar.f2957c);
        }
        this.f2955a = wfVar;
        this.f2956b = r0Var;
    }

    public static wf a(wf wfVar, wf wfVar2) {
        wfVar.getClass();
        wf wfVar3 = vf.f2896e;
        if (wfVar == wfVar3) {
            return wfVar2;
        }
        wfVar2.getClass();
        if (wfVar2 == wfVar3) {
            return wfVar;
        }
        b8.i<wf> m10 = b8.i.m(2, wfVar, wfVar2);
        if (m10.isEmpty()) {
            return wfVar3;
        }
        if (m10.size() == 1) {
            return (wf) m10.iterator().next();
        }
        int i3 = 0;
        for (wf wfVar4 : m10) {
            do {
                i3 += wfVar4.f2956b.f8369i;
                wfVar4 = wfVar4.f2955a;
            } while (wfVar4 != null);
        }
        if (i3 == 0) {
            return vf.f2896e;
        }
        s.r0 r0Var = new s.r0(i3);
        for (wf wfVar5 : m10) {
            do {
                int i10 = 0;
                while (true) {
                    s.r0 r0Var2 = wfVar5.f2956b;
                    if (i10 >= r0Var2.f8369i) {
                        break;
                    }
                    i7.a.u(r0Var.put((uf) r0Var2.e(i10), r0Var2.h(i10)) == null, "Duplicate bindings: %s", r0Var2.e(i10));
                    i10++;
                }
                wfVar5 = wfVar5.f2955a;
            } while (wfVar5 != null);
        }
        return new vf(null, r0Var).b();
    }

    public final wf b() {
        if (this.f2957c) {
            kotlin.collections.i0.l("Already frozen");
            return null;
        }
        this.f2957c = true;
        wf wfVar = this.f2955a;
        return (wfVar == null || !this.f2956b.isEmpty()) ? this : wfVar;
    }

    public final boolean c() {
        if (this.f2956b.containsKey(f2954d)) {
            return true;
        }
        wf wfVar = this.f2955a;
        return wfVar != null && wfVar.c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (wf wfVar = this; wfVar != null; wfVar = wfVar.f2955a) {
            for (int i3 = 0; i3 < wfVar.f2956b.f8369i; i3++) {
                sb2.append("[");
                sb2.append(this.f2956b.h(i3));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }
}
