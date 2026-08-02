package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfw extends gez {
    public gez a = null;
    private final bd b;
    private final Executor c;
    private final iwq d;

    public gfw(bd bdVar, iwq iwqVar, Executor executor) {
        this.b = bdVar;
        this.d = iwqVar;
        this.c = executor;
    }

    @Override // defpackage.gez
    public final hnu g(int i, gew gewVar, gex gexVar) {
        fao.c();
        try {
            hoq.I(this.b.M().L().c == aek.b, "A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.");
            if (this.a == null) {
                try {
                    bd bdVar = this.b;
                    cka q = cka.q(bdVar.M(), bdVar);
                    bd bdVar2 = this.b;
                    Executor executor = this.c;
                    this.a = new gfh(new gfk(new gfe(bdVar2.M(), q, executor), q, this.d, executor, bdVar2.M()));
                    bdVar2.M().L().a(new gwn(new gkd(this, 1)));
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("Currently a Fragment cannot inject both `@ViewLifecycle StreamMixin` and `@ViewLifecycle LocalSubscriptionMixin` at the same time. Please file go/tiktok-bug if you need it.\n\nIf this Fragment injects both unqualified and `@ViewLifecycle` qualified Mixins it's likely a bug. Only one the two Mixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle` Mixin exclusively.", e);
                }
            }
            return this.a.g(i, gewVar, gexVar);
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.", e2);
        }
    }
}
