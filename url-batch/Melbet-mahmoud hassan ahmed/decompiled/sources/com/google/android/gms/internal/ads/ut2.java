package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class ut2 implements tt2 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<du2, st2> f12984a;

    /* renamed from: b, reason: collision with root package name */
    private final au2 f12985b;

    /* renamed from: c, reason: collision with root package name */
    private final wt2 f12986c = new wt2();

    public ut2(au2 au2Var) {
        this.f12984a = new ConcurrentHashMap<>(au2Var.f2972k);
        this.f12985b = au2Var;
    }

    private final void e() {
        Parcelable.Creator<au2> creator = au2.CREATOR;
        if (((Boolean) sw.c().b(m10.N4)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12985b.f2970i);
            sb.append(" PoolCollection");
            sb.append(this.f12986c.b());
            int i7 = 0;
            for (Map.Entry<du2, st2> entry : this.f12984a.entrySet()) {
                i7++;
                sb.append(i7);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i8 = 0; i8 < entry.getValue().b(); i8++) {
                    sb.append("[O]");
                }
                for (int b7 = entry.getValue().b(); b7 < this.f12985b.f2972k; b7++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().g());
                sb.append("\n");
            }
            while (i7 < this.f12985b.f2971j) {
                i7++;
                sb.append(i7);
                sb.append(".\n");
            }
            io0.b(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.tt2
    public final synchronized boolean a(du2 du2Var, cu2<?, ?> cu2Var) {
        boolean h7;
        ConcurrentHashMap<du2, st2> concurrentHashMap;
        st2 st2Var = this.f12984a.get(du2Var);
        cu2Var.f3953d = y2.t.a().b();
        if (st2Var == null) {
            au2 au2Var = this.f12985b;
            st2Var = new st2(au2Var.f2972k, au2Var.f2973l * 1000);
            int size = this.f12984a.size();
            au2 au2Var2 = this.f12985b;
            if (size == au2Var2.f2971j) {
                int i7 = au2Var2.f2979r;
                int i8 = i7 - 1;
                du2 du2Var2 = null;
                if (i7 == 0) {
                    throw null;
                }
                long j7 = Long.MAX_VALUE;
                if (i8 == 0) {
                    for (Map.Entry<du2, st2> entry : this.f12984a.entrySet()) {
                        if (entry.getValue().c() < j7) {
                            j7 = entry.getValue().c();
                            du2Var2 = entry.getKey();
                        }
                    }
                    if (du2Var2 != null) {
                        concurrentHashMap = this.f12984a;
                        concurrentHashMap.remove(du2Var2);
                    }
                    this.f12986c.g();
                } else if (i8 != 1) {
                    if (i8 == 2) {
                        int i9 = Integer.MAX_VALUE;
                        for (Map.Entry<du2, st2> entry2 : this.f12984a.entrySet()) {
                            if (entry2.getValue().a() < i9) {
                                i9 = entry2.getValue().a();
                                du2Var2 = entry2.getKey();
                            }
                        }
                        if (du2Var2 != null) {
                            concurrentHashMap = this.f12984a;
                            concurrentHashMap.remove(du2Var2);
                        }
                    }
                    this.f12986c.g();
                } else {
                    for (Map.Entry<du2, st2> entry3 : this.f12984a.entrySet()) {
                        if (entry3.getValue().d() < j7) {
                            j7 = entry3.getValue().d();
                            du2Var2 = entry3.getKey();
                        }
                    }
                    if (du2Var2 != null) {
                        concurrentHashMap = this.f12984a;
                        concurrentHashMap.remove(du2Var2);
                    }
                    this.f12986c.g();
                }
            }
            this.f12984a.put(du2Var, st2Var);
            this.f12986c.d();
        }
        h7 = st2Var.h(cu2Var);
        this.f12986c.c();
        vt2 a7 = this.f12986c.a();
        ru2 f7 = st2Var.f();
        or F = ur.F();
        mr F2 = nr.F();
        F2.u(2);
        sr F3 = tr.F();
        F3.r(a7.f13495f);
        F3.s(a7.f13496g);
        F3.t(f7.f11423g);
        F2.t(F3);
        F.r(F2);
        cu2Var.f3950a.a().c().y(F.o());
        e();
        return h7;
    }

    @Override // com.google.android.gms.internal.ads.tt2
    @Deprecated
    public final du2 b(kv kvVar, String str, vv vvVar) {
        return new eu2(kvVar, str, new zi0(this.f12985b.f2968g).a().f2838k, this.f12985b.f2974m, vvVar);
    }

    @Override // com.google.android.gms.internal.ads.tt2
    public final synchronized cu2<?, ?> c(du2 du2Var) {
        cu2<?, ?> cu2Var;
        st2 st2Var = this.f12984a.get(du2Var);
        if (st2Var != null) {
            cu2Var = st2Var.e();
            if (cu2Var == null) {
                this.f12986c.e();
            }
            ru2 f7 = st2Var.f();
            if (cu2Var != null) {
                or F = ur.F();
                mr F2 = nr.F();
                F2.u(2);
                qr F3 = rr.F();
                F3.r(f7.f11422f);
                F3.s(f7.f11423g);
                F2.r(F3);
                F.r(F2);
                cu2Var.f3950a.a().c().y0(F.o());
            }
            e();
        } else {
            this.f12986c.f();
            e();
            cu2Var = null;
        }
        return cu2Var;
    }

    @Override // com.google.android.gms.internal.ads.tt2
    public final synchronized boolean d(du2 du2Var) {
        st2 st2Var = this.f12984a.get(du2Var);
        if (st2Var != null) {
            return st2Var.b() < this.f12985b.f2972k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.tt2
    public final au2 zza() {
        return this.f12985b;
    }
}
