package g1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class g implements e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2568a;

    public g(int i) {
        this.f2568a = i;
    }

    @Override // g1.e
    public final int f() {
        return this.f2568a;
    }

    public final String toString() {
        j.f2571a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        f.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
