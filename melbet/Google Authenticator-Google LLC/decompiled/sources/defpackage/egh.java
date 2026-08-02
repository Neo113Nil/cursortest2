package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egh implements egc {
    private final efx a;
    private final dof b = new egg(this);
    private final List c = new ArrayList();
    private final bkp d;
    private final jdd e;
    private final ekx f;
    private final cka g;

    public egh(Context context, jdd jddVar, efx efxVar, gzp gzpVar) {
        context.getClass();
        jddVar.getClass();
        this.e = jddVar;
        this.a = efxVar;
        this.d = new bkp(context, efxVar, new idn(this, 1));
        this.f = new ekx(context, jddVar, efxVar, gzpVar);
        this.g = new cka(jddVar);
    }

    public static hvi g(hvi hviVar) {
        return hoq.at(hviVar, new drv(6), huf.a);
    }

    @Override // defpackage.egc
    public final hvi a() {
        return this.f.c(new drv(7));
    }

    @Override // defpackage.egc
    public final hvi b() {
        return this.f.c(new drv(8));
    }

    @Override // defpackage.egc
    public final hvi c(String str, int i) {
        return this.g.i(new egf(1), str, i);
    }

    @Override // defpackage.egc
    public final hvi d(String str, int i) {
        return this.g.i(new egf(0), str, i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.accounts.OnAccountsUpdateListener, java.lang.Object] */
    @Override // defpackage.egc
    public final void e(ehn ehnVar) {
        List list = this.c;
        synchronized (list) {
            if (list.isEmpty()) {
                bkp bkpVar = this.d;
                synchronized (bkpVar) {
                    if (!bkpVar.a) {
                        ((AccountManager) bkpVar.c).addOnAccountsUpdatedListener(bkpVar.b, null, false, new String[]{"com.google"});
                        bkpVar.a = true;
                    }
                }
                hoq.av(this.a.a(), new ckt(this, 6), huf.a);
            }
            list.add(ehnVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.accounts.OnAccountsUpdateListener, java.lang.Object] */
    @Override // defpackage.egc
    public final void f(ehn ehnVar) {
        List list = this.c;
        synchronized (list) {
            if (list.isEmpty()) {
                return;
            }
            list.remove(ehnVar);
            if (list.isEmpty()) {
                bkp bkpVar = this.d;
                synchronized (bkpVar) {
                    if (bkpVar.a) {
                        try {
                            ((AccountManager) bkpVar.c).removeOnAccountsUpdatedListener(bkpVar.b);
                        } catch (IllegalArgumentException e) {
                            Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                        }
                        bkpVar.a = false;
                    }
                }
            }
        }
    }

    public final void h(Account account) {
        dok a = this.e.a(account);
        Object obj = a.b;
        dof dofVar = this.b;
        synchronized (obj) {
            a.a.remove(dofVar);
        }
        a.d(dofVar, huf.a);
    }

    public final void i() {
        List list = this.c;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ehn) it.next()).c();
            }
        }
    }
}
