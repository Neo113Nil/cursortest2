package Y;

import e0.h;
import e0.l;

/* loaded from: classes.dex */
public abstract class f extends b implements e0.f {

    /* renamed from: e, reason: collision with root package name */
    public final int f403e;

    public f(W.d dVar) {
        super(dVar);
        this.f403e = 2;
    }

    @Override // e0.f
    public final int f() {
        return this.f403e;
    }

    @Override // Y.b
    public final String toString() {
        if (this.f398b != null) {
            return super.toString();
        }
        l.f505a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
