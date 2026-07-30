package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class pv0 extends ln implements ce {
    public final Set K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pv0(Context context, Looper looper, int i, sf sfVar, uv0 uv0Var, vv0 vv0Var) {
        super(context, looper, r3, r4, i, new ot2(12, uv0Var), new ot2(13, vv0Var), (String) sfVar.d);
        rs3 a = rs3.a(context);
        sv0 sv0Var = sv0.d;
        ll3.v(uv0Var);
        ll3.v(vv0Var);
        Set set = (Set) sfVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                lh.g("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.K = set;
    }

    @Override // defpackage.ce
    public final Set b() {
        return k() ? this.K : Collections.EMPTY_SET;
    }

    @Override // defpackage.ln
    public final Account p() {
        return null;
    }

    @Override // defpackage.ln
    public final Set s() {
        return this.K;
    }
}
