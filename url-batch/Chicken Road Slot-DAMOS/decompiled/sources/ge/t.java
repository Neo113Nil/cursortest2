package ge;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class t extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* renamed from: e, reason: collision with root package name */
    public static final s f4400e = new s(kotlin.coroutines.d.f5591n, new a1.f(25));

    public t() {
        super(kotlin.coroutines.d.f5591n);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(kotlin.coroutines.f fVar) {
        fVar.getClass();
        if (fVar instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) fVar;
            kotlin.coroutines.f fVar2 = this.f5586d;
            fVar2.getClass();
            if (fVar2 != bVar && bVar.f5588e != fVar2) {
                return this;
            }
            if (((CoroutineContext.Element) bVar.f5587d.invoke(this)) != null) {
                return kotlin.coroutines.g.f5592d;
            }
        } else if (kotlin.coroutines.d.f5591n == fVar) {
            return kotlin.coroutines.g.f5592d;
        }
        return this;
    }

    public abstract void L(CoroutineContext coroutineContext, Runnable runnable);

    public void M(CoroutineContext coroutineContext, Runnable runnable) {
        le.b.h(this, coroutineContext, runnable);
    }

    public boolean N(CoroutineContext coroutineContext) {
        return !(this instanceof y1);
    }

    public t O(int i3) {
        le.b.a(i3);
        return new le.h(this, i3);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        CoroutineContext.Element element;
        fVar.getClass();
        if (fVar instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) fVar;
            kotlin.coroutines.f fVar2 = this.f5586d;
            fVar2.getClass();
            if ((fVar2 == bVar || bVar.f5588e == fVar2) && (element = (CoroutineContext.Element) bVar.f5587d.invoke(this)) != null) {
                return element;
            }
        } else if (kotlin.coroutines.d.f5591n == fVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.m(this);
    }
}
