package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import d0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.p;

/* loaded from: classes.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f1483e = j.f("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f1484a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1485b;

    /* renamed from: c, reason: collision with root package name */
    private final e f1486c;

    /* renamed from: d, reason: collision with root package name */
    private final h0.d f1487d;

    c(Context context, int i7, e eVar) {
        this.f1484a = context;
        this.f1485b = i7;
        this.f1486c = eVar;
        this.f1487d = new h0.d(context, eVar.f(), null);
    }

    void a() {
        List<p> r7 = this.f1486c.g().o().B().r();
        ConstraintProxy.a(this.f1484a, r7);
        this.f1487d.d(r7);
        ArrayList arrayList = new ArrayList(r7.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : r7) {
            String str = pVar.f18477a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f1487d.c(str))) {
                arrayList.add(pVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((p) it.next()).f18477a;
            Intent c7 = b.c(this.f1484a, str2);
            j.c().a(f1483e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f1486c;
            eVar.k(new e.b(eVar, c7, this.f1485b));
        }
        this.f1487d.e();
    }
}
