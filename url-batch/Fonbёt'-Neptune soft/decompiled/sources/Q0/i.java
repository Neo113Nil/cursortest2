package Q0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final int f978e;

    public i(int i2) {
        this.f978e = i2;
    }

    @Override // Q0.f
    public final int d() {
        return this.f978e;
    }

    public final String toString() {
        p.f984a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
