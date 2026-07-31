package X1;

import f2.j;
import f2.v;
import f2.w;

/* loaded from: classes.dex */
public abstract class i extends c implements f2.g {

    /* renamed from: g, reason: collision with root package name */
    public final int f4647g;

    public i(int i3, V1.d dVar) {
        super(dVar);
        this.f4647g = i3;
    }

    @Override // f2.g
    public final int d() {
        return this.f4647g;
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
