package v5;

import java.io.Serializable;

/* loaded from: classes.dex */
final class m<T> implements e<T>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private f6.a<? extends T> f22834f;

    /* renamed from: g, reason: collision with root package name */
    private volatile Object f22835g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f22836h;

    public m(f6.a<? extends T> aVar, Object obj) {
        kotlin.jvm.internal.i.d(aVar, "initializer");
        this.f22834f = aVar;
        this.f22835g = o.f22837a;
        this.f22836h = obj == null ? this : obj;
    }

    public /* synthetic */ m(f6.a aVar, Object obj, int i7, kotlin.jvm.internal.e eVar) {
        this(aVar, (i7 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f22835g != o.f22837a;
    }

    @Override // v5.e
    public T getValue() {
        T t6;
        T t7 = (T) this.f22835g;
        o oVar = o.f22837a;
        if (t7 != oVar) {
            return t7;
        }
        synchronized (this.f22836h) {
            t6 = (T) this.f22835g;
            if (t6 == oVar) {
                f6.a<? extends T> aVar = this.f22834f;
                kotlin.jvm.internal.i.b(aVar);
                t6 = aVar.invoke();
                this.f22835g = t6;
                this.f22834f = null;
            }
        }
        return t6;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
