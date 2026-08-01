package e1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class e implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2053a;

    public e(int i) {
        this.f2053a = i;
    }

    @Override // e1.c
    public final int b() {
        return this.f2053a;
    }

    public final String toString() {
        h.f2056a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
