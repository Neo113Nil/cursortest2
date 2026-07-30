package u0;

import F0.i;
import java.io.Serializable;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245e implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public E0.a f3001e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f3002f = C0246f.f3004a;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3003g = this;

    public C0245e(E0.a aVar) {
        this.f3001e = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f3002f;
        C0246f c0246f = C0246f.f3004a;
        if (obj2 != c0246f) {
            return obj2;
        }
        synchronized (this.f3003g) {
            obj = this.f3002f;
            if (obj == c0246f) {
                E0.a aVar = this.f3001e;
                i.b(aVar);
                obj = aVar.d();
                this.f3002f = obj;
                this.f3001e = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f3002f != C0246f.f3004a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
