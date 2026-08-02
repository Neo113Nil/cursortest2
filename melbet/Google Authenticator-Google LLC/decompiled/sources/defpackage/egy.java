package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egy implements egc {
    public static final /* synthetic */ int b = 0;
    private static final fso k;
    private final Context c;
    private final cyn d;
    private final Executor e;
    private final efx f;
    private final cll g;
    private final cms i;
    private final cms j;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final cym h = new cym() { // from class: egx
        @Override // defpackage.cym
        public final void a() {
            Iterator it = egy.this.a.iterator();
            while (it.hasNext()) {
                ((ehn) it.next()).c();
            }
        }
    };

    static {
        fso fsoVar = new fso(null, null);
        fsoVar.a = 1;
        k = fsoVar;
    }

    public egy(Context context, cms cmsVar, cyn cynVar, cms cmsVar2, efx efxVar, Executor executor, cll cllVar) {
        this.c = context;
        this.i = cmsVar;
        this.d = cynVar;
        this.j = cmsVar2;
        this.e = executor;
        this.f = efxVar;
        this.g = cllVar;
    }

    public static Object g(hvi hviVar, String str) {
        try {
            return hnu.aR(hviVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof cmc) || (cause instanceof cmb)) {
                throw e;
            }
            Log.e("OneGoogle", String.format("Failed to load %s. Exception: %s", str, dih.aj(cause)));
            return null;
        }
    }

    private final hvi h(int i) {
        return cmd.f(i) ? hnu.aI(new cmc(i, "Google Play Services not available", this.g.m(this.c, i, null))) : hnu.aI(new cmb(i));
    }

    @Override // defpackage.egc
    public final hvi a() {
        return b();
    }

    @Override // defpackage.egc
    public final hvi b() {
        hvi K;
        cll cllVar = this.g;
        Context context = this.c;
        efx efxVar = this.f;
        hvi a = efxVar.a();
        int l = cllVar.l(context, 10000000);
        if (l != 0) {
            K = h(l);
        } else {
            cms cmsVar = this.i;
            fso fsoVar = k;
            cmv cmvVar = cmsVar.h;
            dar darVar = new dar(cmvVar, fsoVar);
            cmvVar.a(darVar);
            K = dih.K(darVar, gvx.a(new drv(14)), huf.a);
        }
        hvi b2 = efxVar.b();
        return hoq.aV(a, K, b2).s(new bqi(a, b2, K, 3), huf.a);
    }

    @Override // defpackage.egc
    public final hvi c(String str, int i) {
        return d(str, i);
    }

    @Override // defpackage.egc
    public final hvi d(String str, int i) {
        int l = this.g.l(this.c, 10400000);
        if (l != 0) {
            return h(l);
        }
        cms cmsVar = this.j;
        int O = dih.O(i);
        cmv cmvVar = cmsVar.h;
        dat datVar = new dat(cmvVar, str, O);
        cmvVar.a(datVar);
        return dih.K(datVar, new drv(13), this.e);
    }

    @Override // defpackage.egc
    public final void e(ehn ehnVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        if (copyOnWriteArrayList.isEmpty()) {
            cyn cynVar = this.d;
            cme m = cynVar.m(this.h, cym.class.getName());
            dai daiVar = new dai(m);
            ciu ciuVar = new ciu(daiVar, 18);
            ciu ciuVar2 = new ciu(daiVar, 19);
            cow cowVar = new cow();
            cowVar.a = ciuVar;
            cowVar.b = ciuVar2;
            cowVar.f = m;
            cowVar.e = 2720;
            cynVar.n(cowVar.a());
        }
        copyOnWriteArrayList.add(ehnVar);
    }

    @Override // defpackage.egc
    public final void f(ehn ehnVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        copyOnWriteArrayList.remove(ehnVar);
        if (copyOnWriteArrayList.isEmpty()) {
            this.d.j(ox.p(this.h, cym.class.getName()), 2721);
        }
    }
}
