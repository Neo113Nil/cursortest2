package j$.util.stream;

import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class z extends e0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(f0 f0Var, Object obj, int i) {
        super(f0Var);
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        f0 f0Var = this.a;
        switch (i) {
            case 0:
                if (((Predicate) obj2).test(obj)) {
                    f0Var.accept(obj);
                    break;
                }
                break;
            default:
                f0Var.accept(((Function) obj2).apply(obj));
                break;
        }
    }

    @Override // j$.util.stream.e0, j$.util.stream.f0
    public void c(long j) {
        switch (this.b) {
            case 0:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }
}
