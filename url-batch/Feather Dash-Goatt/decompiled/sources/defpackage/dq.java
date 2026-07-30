package defpackage;

import android.content.Context;
import android.os.UserManager;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dq implements b60, c60 {
    public final be0 a;
    public final Context b;
    public final p01 c;
    public final Set d;
    public final Executor e;

    public dq(Context context, String str, Set set, p01 p01Var, Executor executor) {
        this.a = new be0(new dk(context, 1, str));
        this.d = set;
        this.e = executor;
        this.c = p01Var;
        this.b = context;
    }

    public final zu1 a() {
        if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return t80.p("");
        }
        return t80.i(this.e, new cq(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            t80.p(null);
        } else if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            t80.p(null);
        } else {
            t80.i(this.e, new cq(this, 1));
        }
    }
}
