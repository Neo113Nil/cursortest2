package f2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class k implements g, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f5825d;

    public k(int i3) {
        this.f5825d = i3;
    }

    @Override // f2.g
    public final int d() {
        return this.f5825d;
    }

    public final String toString() {
        v.f5833a.getClass();
        String a3 = w.a(this);
        j.e(a3, "renderLambdaToString(...)");
        return a3;
    }
}
