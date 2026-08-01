package defpackage;

import android.os.Looper;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sa0 extends rv {
    public final /* synthetic */ na0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(String[] strArr, na0 na0Var) {
        super(strArr);
        this.b = na0Var;
    }

    @Override // defpackage.rv
    public final void a(Set set) {
        set.getClass();
        x6 F = x6.F();
        r1 r1Var = new r1(12, this.b);
        F.a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            r1Var.run();
        } else {
            F.G(r1Var);
        }
    }
}
