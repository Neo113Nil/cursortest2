package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pc1 implements dn, un {
    public final dn d;
    public final CoroutineContext e;

    public pc1(dn dnVar, CoroutineContext coroutineContext) {
        this.d = dnVar;
        this.e = coroutineContext;
    }

    @Override // defpackage.un
    public final un c() {
        dn dnVar = this.d;
        if (dnVar instanceof un) {
            return (un) dnVar;
        }
        return null;
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return this.e;
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        this.d.l(obj);
    }
}
