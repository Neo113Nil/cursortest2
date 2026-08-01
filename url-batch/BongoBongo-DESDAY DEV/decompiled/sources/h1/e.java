package h1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class e implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2648a;

    public e(int i) {
        this.f2648a = i;
    }

    @Override // h1.c
    public final int d() {
        return this.f2648a;
    }

    public final String toString() {
        h.f2651a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
