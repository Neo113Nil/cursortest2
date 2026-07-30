package r6;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l implements g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final int f7961f;

    public l(int i7) {
        this.f7961f = i7;
    }

    @Override // r6.g
    public final int b() {
        return this.f7961f;
    }

    public final String toString() {
        w.f7969a.getClass();
        String a3 = x.a(this);
        k.e(a3, "renderLambdaToString(...)");
        return a3;
    }
}
