package g1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class e implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2549a;

    public e(int i) {
        this.f2549a = i;
    }

    @Override // g1.c
    public final int d() {
        return this.f2549a;
    }

    public final String toString() {
        h.f2552a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
