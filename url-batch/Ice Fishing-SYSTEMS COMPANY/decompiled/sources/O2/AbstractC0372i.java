package O2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import m.c1;

/* renamed from: O2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0372i extends AbstractC0369f implements M2.c {

    /* renamed from: W, reason: collision with root package name */
    public final Set f2431W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0372i(Context context, Looper looper, int i, c1 c1Var, M2.i iVar, M2.j jVar) {
        super(context, looper, r3, r4, i, new C0375l(iVar), new C0375l(jVar), (String) c1Var.f39398x);
        I a9 = I.a(context);
        L2.e eVar = L2.e.f1724d;
        w.h(iVar);
        w.h(jVar);
        Set set = (Set) c1Var.f39395u;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2431W = set;
    }

    @Override // M2.c
    public final Set b() {
        return n() ? this.f2431W : Collections.EMPTY_SET;
    }

    @Override // O2.AbstractC0369f
    public final Account q() {
        return null;
    }

    @Override // O2.AbstractC0369f
    public final Set t() {
        return this.f2431W;
    }
}
