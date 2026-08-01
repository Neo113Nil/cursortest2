package k1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class f implements d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3242a;

    public f(int i) {
        this.f3242a = i;
    }

    @Override // k1.d
    public final int f() {
        return this.f3242a;
    }

    public final String toString() {
        i.f3246a.getClass();
        String a2 = j.a(this);
        e.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
