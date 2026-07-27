package A;

import G.X0;
import kotlin.jvm.functions.Function0;
import l.C0790p;

/* loaded from: classes.dex */
public final class K extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f33d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X0 f34e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(X0 x02, int i2) {
        super(0);
        this.f33d = i2;
        this.f34e = x02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X0 x02 = this.f34e;
        switch (this.f33d) {
            case 0:
                C0790p c0790p = O.f45a;
                return new Y.c(((Y.c) x02.getValue()).f4372a);
            default:
                return (Float) x02.getValue();
        }
    }
}
