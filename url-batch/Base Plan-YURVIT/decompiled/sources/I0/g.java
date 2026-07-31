package I0;

import P0.h;
import P0.p;

/* loaded from: classes.dex */
public abstract class g extends b implements P0.f {

    /* renamed from: h, reason: collision with root package name */
    public final int f534h;

    public g(int i2, G0.d dVar) {
        super(dVar);
        this.f534h = i2;
    }

    @Override // P0.f
    public final int c() {
        return this.f534h;
    }

    @Override // I0.b
    public final String toString() {
        if (this.f526e != null) {
            return super.toString();
        }
        p.f808a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
