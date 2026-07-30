package n6;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC0898a;

/* renamed from: n6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0786t extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* renamed from: e, reason: collision with root package name */
    public static final C0785s f7082e = new C0785s(kotlin.coroutines.d.f6145f, new c2.i(3));

    public AbstractC0786t() {
        super(kotlin.coroutines.d.f6145f);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            bVar.getClass();
            kotlin.coroutines.f key2 = this.f6140d;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f6142e != key2) {
                return this;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            if (((CoroutineContext.Element) bVar.f6141d.invoke(this)) != null) {
                return kotlin.coroutines.g.f6146d;
            }
        } else if (kotlin.coroutines.d.f6145f == key) {
            return kotlin.coroutines.g.f6146d;
        }
        return this;
    }

    public abstract void E(CoroutineContext coroutineContext, Runnable runnable);

    public void F(CoroutineContext coroutineContext, Runnable runnable) {
        E(coroutineContext, runnable);
    }

    public boolean G(CoroutineContext coroutineContext) {
        return !(this instanceof t0);
    }

    public AbstractC0786t H(int i2) {
        AbstractC0898a.a(i2);
        return new s6.g(this, i2);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            bVar.getClass();
            kotlin.coroutines.f key2 = this.f6140d;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f6142e != key2) {
                return null;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            CoroutineContext.Element element = (CoroutineContext.Element) bVar.f6141d.invoke(this);
            if (element != null) {
                return element;
            }
        } else if (kotlin.coroutines.d.f6145f == key) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0792z.g(this);
    }
}
