package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class e0 implements f0 {
    public final f0 a;

    public e0(f0 f0Var) {
        f0Var.getClass();
        this.a = f0Var;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f0
    public void c(long j) {
        this.a.c(j);
    }

    @Override // j$.util.stream.f0
    public boolean d() {
        return this.a.d();
    }

    @Override // j$.util.stream.f0
    public final void end() {
        this.a.end();
    }
}
