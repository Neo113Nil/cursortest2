package X1;

import f2.j;
import f2.v;
import f2.w;

/* loaded from: classes.dex */
public abstract class h extends g implements f2.g {

    /* renamed from: e, reason: collision with root package name */
    public final int f4646e;

    public h(int i3, V1.d dVar) {
        super(dVar);
        this.f4646e = i3;
    }

    @Override // f2.g
    public final int d() {
        return this.f4646e;
    }

    @Override // X1.a
    public final String toString() {
        if (this.f4640d != null) {
            return super.toString();
        }
        v.f5833a.getClass();
        String a3 = w.a(this);
        j.e(a3, "renderLambdaToString(...)");
        return a3;
    }
}
