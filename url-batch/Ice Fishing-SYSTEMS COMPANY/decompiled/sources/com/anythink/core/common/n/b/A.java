package com.anythink.core.common.n.b;

import B2.N;
import O.A0;
import O.InterfaceC0358u;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.View;
import com.icefishing.icefishingliveapp.DetailsActivity;
import com.icefishing.icefishingliveapp.IntroActivity;
import com.icefishing.icefishingliveapp.MainActivity;
import com.icefishing.icefishingliveapp.SplashActivity;
import com.icefishing.icefishingliveapp.StartActivity;
import com.icefishing.icefishingliveapp.adscode.ApplinkActivity;
import h3.InterfaceC4567a;
import h4.C4568a;
import j2.AbstractC4595a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements b, q, InterfaceC0358u, InterfaceC4567a, g2.f, N3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f15016n;

    public /* synthetic */ A(int i) {
        this.f15016n = i;
    }

    @Override // g2.f
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                Y2.e a9 = Z1.i.a();
                a9.K(rawQuery.getString(1));
                a9.f3965w = AbstractC4595a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a9.f3964v = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a9.p());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // com.anythink.core.common.n.b.b
    public ad authenticate(ah ahVar, af afVar) {
        ad a9;
        a9 = b.a(ahVar, afVar);
        return a9;
    }

    @Override // N3.e
    public Object b(N n9) {
        Set b9 = n9.b(N3.r.a(C4568a.class));
        h4.c cVar = h4.c.f38230v;
        if (cVar == null) {
            synchronized (h4.c.class) {
                try {
                    cVar = h4.c.f38230v;
                    if (cVar == null) {
                        cVar = new h4.c(0);
                        h4.c.f38230v = cVar;
                    }
                } finally {
                }
            }
        }
        return new h4.b(b9, cVar);
    }

    @Override // O.InterfaceC0358u
    public A0 k(View view, A0 a02) {
        switch (this.f15016n) {
            case 2:
                int i = DetailsActivity.f36545x;
                G.e f6 = a02.f2213a.f(7);
                view.setPadding(f6.f1151a, f6.f1152b, f6.f1153c, f6.f1154d);
                break;
            case 3:
                int i4 = IntroActivity.f36935y;
                G.e f9 = a02.f2213a.f(7);
                view.setPadding(f9.f1151a, f9.f1152b, f9.f1153c, f9.f1154d);
                break;
            case 4:
                int i9 = MainActivity.f36970a1;
                G.e f10 = a02.f2213a.f(7);
                view.setPadding(f10.f1151a, f10.f1152b, f10.f1153c, f10.f1154d);
                break;
            case 5:
                int i10 = SplashActivity.f37047A;
                G.e f11 = a02.f2213a.f(7);
                view.setPadding(f11.f1151a, f11.f1152b, f11.f1153c, f11.f1154d);
                break;
            case 6:
                int i11 = StartActivity.f37053z;
                G.e f12 = a02.f2213a.f(7);
                view.setPadding(f12.f1151a, f12.f1152b, f12.f1153c, f12.f1154d);
                break;
            default:
                int i12 = ApplinkActivity.f37062u;
                G.e f13 = a02.f2213a.f(7);
                view.setPadding(f13.f1151a, f13.f1152b, f13.f1153c, f13.f1154d);
                break;
        }
        return a02;
    }

    @Override // com.anythink.core.common.n.b.q
    public List lookup(String str) {
        List a9;
        a9 = q.a(str);
        return a9;
    }

    @Override // h3.InterfaceC4567a
    public Object s(h3.n nVar) {
        switch (this.f15016n) {
            case 7:
                return 403;
            default:
                return -1;
        }
    }
}
