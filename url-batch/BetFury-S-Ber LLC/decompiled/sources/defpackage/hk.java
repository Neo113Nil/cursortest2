package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hk implements Executor {
    public final tg f;

    public hk(tg tgVar) {
        this.f = tgVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        tg tgVar = this.f;
        um umVar = um.f;
        if (tgVar.P(umVar)) {
            tgVar.O(umVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f.toString();
    }
}
