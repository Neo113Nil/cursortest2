package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avo implements atz, avx, atm {
    Boolean a;
    private final Context b;
    private final avm d;
    private boolean e;
    private final atx h;
    private final arv i;
    private final avp k;
    private final ldt l;
    private final brr m;
    private final brn n;
    private final Map c = new HashMap();
    private final Object f = new Object();
    private final auc g = zy.h(true);
    private final Map j = new HashMap();

    static {
        asq.b("GreedyScheduler");
    }

    public avo(Context context, arv arvVar, cfz cfzVar, atx atxVar, brr brrVar, ldt ldtVar) {
        this.b = context;
        asz aszVar = arvVar.e;
        this.d = new avm(this, aszVar);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.k = new avp(aszVar, brrVar, 5400000L);
        this.l = ldtVar;
        this.n = new brn(cfzVar);
        this.i = arvVar;
        this.h = atxVar;
        this.m = brrVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(ayn.a(this.b, this.i));
    }

    private final void g() {
        if (this.e) {
            return;
        }
        this.h.c(this);
        this.e = true;
    }

    @Override // defpackage.atm
    public final void a(axl axlVar, boolean z) {
        kwu kwuVar;
        brn c = this.g.c(axlVar);
        if (c != null) {
            this.k.a(c);
        }
        synchronized (this.f) {
            kwuVar = (kwu) this.c.remove(axlVar);
        }
        if (kwuVar != null) {
            asq.a();
            Objects.toString(axlVar);
            kwuVar.s(null);
        }
        if (z) {
            return;
        }
        synchronized (this.f) {
            this.j.remove(axlVar);
        }
    }

    @Override // defpackage.atz
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            asq.a();
            return;
        }
        g();
        asq.a();
        avm avmVar = this.d;
        if (avmVar != null && (runnable = (Runnable) avmVar.c.remove(str)) != null) {
            avmVar.b.a(runnable);
        }
        for (brn brnVar : this.g.a(str)) {
            this.k.a(brnVar);
            brr brrVar = this.m;
            brnVar.getClass();
            brrVar.G(brnVar, -512);
        }
    }

    @Override // defpackage.atz
    public final void c(axt... axtVarArr) {
        long max;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            asq.a();
            return;
        }
        g();
        HashSet<axt> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (axt axtVar : axtVarArr) {
            axl u = abf.u(axtVar);
            auc aucVar = this.g;
            if (!aucVar.b(u)) {
                synchronized (this.f) {
                    axl u2 = abf.u(axtVar);
                    Map map = this.j;
                    avn avnVar = (avn) map.get(u2);
                    if (avnVar == null) {
                        int i = axtVar.l;
                        yp ypVar = this.i.n;
                        avnVar = new avn(i, System.currentTimeMillis());
                        map.put(u2, avnVar);
                    }
                    max = avnVar.b + (Math.max((axtVar.l - avnVar.a) - 5, 0) * 30000);
                }
                long max2 = Math.max(axtVar.a(), max);
                yp ypVar2 = this.i.n;
                long currentTimeMillis = System.currentTimeMillis();
                if (axtVar.c == atb.a) {
                    if (currentTimeMillis < max2) {
                        avm avmVar = this.d;
                        if (avmVar != null) {
                            String str = axtVar.b;
                            Map map2 = avmVar.c;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                avmVar.b.a(runnable);
                            }
                            avl avlVar = new avl(avmVar, axtVar, 0);
                            map2.put(str, avlVar);
                            avmVar.b.b(max2 - System.currentTimeMillis(), avlVar);
                        }
                    } else if (axtVar.b()) {
                        ary aryVar = axtVar.k;
                        if (aryVar.d) {
                            asq.a();
                            Objects.toString(axtVar);
                        } else if (aryVar.b()) {
                            asq.a();
                            Objects.toString(axtVar);
                        } else {
                            hashSet.add(axtVar);
                            hashSet2.add(axtVar.b);
                        }
                    } else if (!aucVar.b(abf.u(axtVar))) {
                        asq.a();
                        String str2 = axtVar.b;
                        brn e = aucVar.e(axtVar);
                        this.k.b(e);
                        this.m.H(e, null);
                    }
                }
            }
        }
        synchronized (this.f) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                asq.a();
                for (axt axtVar2 : hashSet) {
                    axl u3 = abf.u(axtVar2);
                    Map map3 = this.c;
                    if (!map3.containsKey(u3)) {
                        map3.put(u3, awa.a(this.n, axtVar2, (kvj) this.l.c, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.atz
    public final boolean d() {
        return false;
    }

    @Override // defpackage.avx
    public final void e(axt axtVar, zy zyVar) {
        boolean z = zyVar instanceof avt;
        axl u = abf.u(axtVar);
        if (z) {
            auc aucVar = this.g;
            if (aucVar.b(u)) {
                return;
            }
            asq.a();
            Objects.toString(u);
            u.toString();
            brn d = aucVar.d(u);
            this.k.b(d);
            this.m.H(d, null);
            return;
        }
        asq.a();
        Objects.toString(u);
        u.toString();
        brn c = this.g.c(u);
        if (c != null) {
            this.k.a(c);
            this.m.G(c, ((avu) zyVar).a);
        }
    }
}
