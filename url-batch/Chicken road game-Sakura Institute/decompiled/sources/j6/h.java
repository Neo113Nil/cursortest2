package j6;

import r6.k;
import r6.w;
import r6.x;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class h extends g implements r6.g {

    /* renamed from: f, reason: collision with root package name */
    public final int f5123f;

    public h(int i7, h6.d dVar) {
        super(dVar);
        this.f5123f = i7;
    }

    @Override // r6.g
    public final int b() {
        return this.f5123f;
    }

    @Override // j6.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f7969a.getClass();
        String a3 = x.a(this);
        k.e(a3, "renderLambdaToString(...)");
        return a3;
    }
}
