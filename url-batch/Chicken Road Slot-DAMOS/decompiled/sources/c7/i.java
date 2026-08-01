package c7;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i extends f {
    public final Set E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(Context context, Looper looper, int i3, g2 g2Var, a7.k kVar, a7.l lVar) {
        super(context, looper, r3, r4, i3, new l(kVar), new l(lVar), (String) g2Var.f6081s);
        o0 a9 = o0.a(context);
        z6.f fVar = z6.f.f10879e;
        c0.g(kVar);
        c0.g(lVar);
        Set set = (Set) g2Var.f6078e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                kotlin.collections.i0.l("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.E = set;
    }

    @Override // c7.f
    public final Account f() {
        return null;
    }

    @Override // c7.f
    public final Executor h() {
        return null;
    }

    @Override // c7.f
    public final Set l() {
        return this.E;
    }
}
