package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class fn extends yc {
    public final CoroutineContext e;
    public transient dn g;

    public fn(dn dnVar) {
        this(dnVar, dnVar != null ? dnVar.g() : null);
    }

    @Override // defpackage.dn
    public CoroutineContext g() {
        CoroutineContext coroutineContext = this.e;
        coroutineContext.getClass();
        return coroutineContext;
    }

    @Override // defpackage.yc
    public void m() {
        dn dnVar = this.g;
        if (dnVar != null && dnVar != this) {
            CoroutineContext.Element d = g().d(d.f);
            d.getClass();
            hs hsVar = (hs) dnVar;
            hsVar.j();
            tf m = hsVar.m();
            if (m != null) {
                m.o();
            }
        }
        this.g = gj.d;
    }

    public fn(dn dnVar, CoroutineContext coroutineContext) {
        super(dnVar);
        this.e = coroutineContext;
    }
}
