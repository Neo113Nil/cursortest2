package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ln extends a implements d {
    public static final kn e = new kn(d.f, new q1(5));

    public ln() {
        super(d.f);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element d(f fVar) {
        CoroutineContext.Element element;
        fVar.getClass();
        if (fVar instanceof b) {
            b bVar = (b) fVar;
            f fVar2 = this.d;
            fVar2.getClass();
            if ((fVar2 == bVar || bVar.e == fVar2) && (element = (CoroutineContext.Element) bVar.d.invoke(this)) != null) {
                return element;
            }
        } else if (d.f == fVar) {
            return this;
        }
        return null;
    }

    public abstract void f(CoroutineContext coroutineContext, Runnable runnable);

    public void g(CoroutineContext coroutineContext, Runnable runnable) {
        f(coroutineContext, runnable);
    }

    public boolean l(CoroutineContext coroutineContext) {
        return !(this instanceof yk1);
    }

    public ln m(int i) {
        t80.k(i);
        return new dh0(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + op.y(this);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(f fVar) {
        fVar.getClass();
        if (!(fVar instanceof b)) {
            return d.f == fVar ? g.d : this;
        }
        b bVar = (b) fVar;
        f fVar2 = this.d;
        fVar2.getClass();
        return (fVar2 == bVar || bVar.e == fVar2) ? ((CoroutineContext.Element) bVar.d.invoke(this)) != null ? g.d : this : this;
    }
}
