package u0;

import java.util.Set;
import m0.a2;
import m0.b2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements a2 {

    /* renamed from: d, reason: collision with root package name */
    public final Set f7144d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.e f7145e = new o0.e(new b2[16]);

    public e(Set set) {
        this.f7144d = set;
    }

    @Override // m0.a2
    public final void e() {
        o0.e eVar = this.f7145e;
        Object[] objArr = eVar.f5578d;
        int i = eVar.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            a2 a2Var = ((b2) objArr[i8]).f4881a;
            this.f7144d.remove(a2Var);
            a2Var.e();
        }
    }

    @Override // m0.a2
    public final void f() {
    }

    @Override // m0.a2
    public final void i() {
    }
}
