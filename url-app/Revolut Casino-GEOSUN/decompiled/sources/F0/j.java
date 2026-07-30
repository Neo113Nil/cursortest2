package F0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements f, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final int f319e;

    public j(int i2) {
        this.f319e = i2;
    }

    @Override // F0.f
    public final int h() {
        return this.f319e;
    }

    public final String toString() {
        q.f325a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
