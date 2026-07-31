package P0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final int f802e;

    public i(int i2) {
        this.f802e = i2;
    }

    @Override // P0.f
    public final int c() {
        return this.f802e;
    }

    public final String toString() {
        p.f808a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
