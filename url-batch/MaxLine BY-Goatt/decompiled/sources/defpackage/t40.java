package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class t40 extends a implements e {
    public static final s40 n = new s40(e.d, new zd(12));

    public t40() {
        super(e.d);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        gVar.getClass();
        if (!(gVar instanceof b)) {
            return e.d == gVar ? h.m : this;
        }
        b bVar = (b) gVar;
        g gVar2 = this.m;
        gVar2.getClass();
        return (gVar2 == bVar || bVar.n == gVar2) ? ((CoroutineContext.Element) bVar.m.invoke(this)) != null ? h.m : this : this;
    }

    public abstract void N(CoroutineContext coroutineContext, Runnable runnable);

    public void O(CoroutineContext coroutineContext, Runnable runnable) {
        N(coroutineContext, runnable);
    }

    public boolean P(CoroutineContext coroutineContext) {
        return !(this instanceof w13);
    }

    public t40 Q(int i) {
        l41.u(i);
        return new od1(this, i);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(g gVar) {
        CoroutineContext.Element element;
        gVar.getClass();
        if (gVar instanceof b) {
            b bVar = (b) gVar;
            g gVar2 = this.m;
            gVar2.getClass();
            if ((gVar2 == bVar || bVar.n == gVar2) && (element = (CoroutineContext.Element) bVar.m.invoke(this)) != null) {
                return element;
            }
        } else if (e.d == gVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + o70.x(this);
    }
}
