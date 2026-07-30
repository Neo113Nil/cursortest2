package y0;

import F0.i;
import F0.q;

/* loaded from: classes.dex */
public abstract class f extends b implements F0.f {

    /* renamed from: h, reason: collision with root package name */
    public final int f3102h;

    public f(int i2, w0.d dVar) {
        super(dVar);
        this.f3102h = i2;
    }

    @Override // F0.f
    public final int h() {
        return this.f3102h;
    }

    @Override // y0.b
    public final String toString() {
        if (this.f3097e != null) {
            return super.toString();
        }
        q.f325a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
