package j1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3182a;

    public i(int i) {
        this.f3182a = i;
    }

    @Override // j1.f
    public final int f() {
        return this.f3182a;
    }

    public final String toString() {
        l.f3186a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
