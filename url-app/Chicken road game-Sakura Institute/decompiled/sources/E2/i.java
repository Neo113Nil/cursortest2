package E2;

import M2.F;
import M2.G;
import M2.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i extends h implements l {

    /* renamed from: e, reason: collision with root package name */
    public final int f2319e;

    public i(int i2, C2.a aVar) {
        super(aVar);
        this.f2319e = i2;
    }

    @Override // M2.l
    public final int getArity() {
        return this.f2319e;
    }

    @Override // E2.a
    public final String toString() {
        if (this.f2309d != null) {
            return super.toString();
        }
        F.f3581a.getClass();
        String a4 = G.a(this);
        Intrinsics.checkNotNullExpressionValue(a4, "renderLambdaToString(...)");
        return a4;
    }
}
