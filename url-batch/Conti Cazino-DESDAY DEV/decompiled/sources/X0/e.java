package X0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class e implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f1015a;

    public e(int i) {
        this.f1015a = i;
    }

    @Override // X0.c
    public final int b() {
        return this.f1015a;
    }

    public final String toString() {
        h.f1018a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
