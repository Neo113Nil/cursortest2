package j$.util.stream;

import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class a0 extends d0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(d0 d0Var, int i, Object obj, int i2) {
        super(d0Var, i);
        this.j = i2;
        this.k = obj;
    }

    @Override // j$.util.stream.a
    public final f0 e(f0 f0Var) {
        int i = this.j;
        Object obj = this.k;
        switch (i) {
            case 0:
                return new z(f0Var, (Function) obj, 1);
            case 1:
                return new b0(f0Var, (Function) obj);
            default:
                return new z(f0Var, (Predicate) obj, 0);
        }
    }
}
