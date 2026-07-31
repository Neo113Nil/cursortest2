package R1;

import Z1.u;
import Z1.v;

/* loaded from: classes.dex */
public abstract class h extends g implements Z1.f {

    /* renamed from: d, reason: collision with root package name */
    public final int f3171d;

    public h(int i3, P1.d dVar) {
        super(dVar);
        this.f3171d = i3;
    }

    @Override // Z1.f
    public final int d() {
        return this.f3171d;
    }

    @Override // R1.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        u.f3481a.getClass();
        String a3 = v.a(this);
        Z1.i.e(a3, "renderLambdaToString(...)");
        return a3;
    }
}
