package J0;

import Q0.h;
import Q0.p;

/* loaded from: classes.dex */
public abstract class g extends b implements Q0.f {

    /* renamed from: h, reason: collision with root package name */
    public final int f744h;

    public g(int i2, H0.d dVar) {
        super(dVar);
        this.f744h = i2;
    }

    @Override // Q0.f
    public final int d() {
        return this.f744h;
    }

    @Override // J0.b
    public final String toString() {
        if (this.f736e != null) {
            return super.toString();
        }
        p.f984a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
