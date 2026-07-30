package t0;

import d1.i;
import java.io.Serializable;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public i f1174b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f1175c = f.f1177a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1176d = this;

    /* JADX WARN: Multi-variable type inference failed */
    public e(c1.a aVar) {
        this.f1174b = (i) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [c1.a, d1.i, java.lang.Object] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f1175c;
        f fVar = f.f1177a;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f1176d) {
            obj = this.f1175c;
            if (obj == fVar) {
                ?? r1 = this.f1174b;
                r1.getClass();
                obj = r1.a();
                this.f1175c = obj;
                this.f1174b = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f1175c != f.f1177a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
