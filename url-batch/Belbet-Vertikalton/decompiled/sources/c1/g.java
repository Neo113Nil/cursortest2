package c1;

import j1.h;
import j1.l;

/* loaded from: classes.dex */
public abstract class g extends AbstractC0106c implements j1.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2232a;

    public g(a1.d dVar) {
        super(dVar);
        this.f2232a = 2;
    }

    @Override // j1.f
    public final int f() {
        return this.f2232a;
    }

    @Override // c1.AbstractC0104a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        l.f3186a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
