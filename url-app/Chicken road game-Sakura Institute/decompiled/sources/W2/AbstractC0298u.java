package W2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0298u extends kotlin.coroutines.a implements kotlin.coroutines.e {

    /* renamed from: e, reason: collision with root package name */
    public static final C0297t f4293e = new C0297t(kotlin.coroutines.e.f7496f, new A1.v0(6));

    public AbstractC0298u() {
        super(kotlin.coroutines.e.f7496f);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element k(kotlin.coroutines.g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof kotlin.coroutines.b)) {
            if (kotlin.coroutines.e.f7496f == key) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
        bVar.getClass();
        kotlin.coroutines.g key2 = this.f7490d;
        Intrinsics.checkNotNullParameter(key2, "key");
        if (key2 != bVar && bVar.f7492e != key2) {
            return null;
        }
        Intrinsics.checkNotNullParameter(this, "element");
        CoroutineContext.Element element = (CoroutineContext.Element) bVar.f7491d.invoke(this);
        if (element != null) {
            return element;
        }
        return null;
    }

    public abstract void t(CoroutineContext coroutineContext, Runnable runnable);

    public String toString() {
        return getClass().getSimpleName() + '@' + B.f(this);
    }

    public boolean u(CoroutineContext coroutineContext) {
        return !(this instanceof z0);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(kotlin.coroutines.g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            bVar.getClass();
            kotlin.coroutines.g key2 = this.f7490d;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 == bVar || bVar.f7492e == key2) {
                Intrinsics.checkNotNullParameter(this, "element");
                if (((CoroutineContext.Element) bVar.f7491d.invoke(this)) != null) {
                    return kotlin.coroutines.i.f7498d;
                }
            }
        } else if (kotlin.coroutines.e.f7496f == key) {
            return kotlin.coroutines.i.f7498d;
        }
        return this;
    }

    public AbstractC0298u z(int i2, String str) {
        b3.a.c(i2);
        return new b3.g(this, i2, str);
    }
}
