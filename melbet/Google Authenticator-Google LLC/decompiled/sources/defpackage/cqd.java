package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cqd extends cpo implements cml {
    public static volatile Executor t;
    public final Set u;
    private final Account v;

    protected cqd(Context context, Looper looper, int i, cpr cprVar, cnx cnxVar, cot cotVar) {
        super(context, looper, cqj.b(context), cll.a, i, new kee(cnxVar), new kee(cotVar), cprVar.e);
        this.v = cprVar.a;
        Set set = cprVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.u = set;
        if (t == null) {
            synchronized (cqd.class) {
                if (t == null && cqh.a(context.getPackageName())) {
                    t = cqf.a(context);
                }
            }
        }
    }

    @Override // defpackage.cpo
    public final cli[] E() {
        return new cli[0];
    }

    @Override // defpackage.cpo, defpackage.cml
    public int a() {
        throw null;
    }

    @Override // defpackage.cml
    public final Set j() {
        return o() ? this.u : Collections.EMPTY_SET;
    }

    @Override // defpackage.cpo
    public final Account t() {
        return this.v;
    }

    @Override // defpackage.cpo
    protected final Executor w() {
        return t;
    }
}
