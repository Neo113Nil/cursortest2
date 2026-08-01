package X0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class g implements d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f872a;

    public g(int i) {
        this.f872a = i;
    }

    @Override // X0.d
    public final int b() {
        return this.f872a;
    }

    public final String toString() {
        j.f875a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        f.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
