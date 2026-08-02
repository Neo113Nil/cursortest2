package b2;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: b2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193g implements InterfaceC0189c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public l2.a f2551a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2552b = C0194h.f2554a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2553c = this;

    public C0193g(l2.a aVar) {
        this.f2551a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f2552b;
        C0194h c0194h = C0194h.f2554a;
        if (obj2 != c0194h) {
            return obj2;
        }
        synchronized (this.f2553c) {
            obj = this.f2552b;
            if (obj == c0194h) {
                l2.a aVar = this.f2551a;
                j.b(aVar);
                obj = aVar.invoke();
                this.f2552b = obj;
                this.f2551a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2552b != C0194h.f2554a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
