package Q;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266b extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f3831e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f3832i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0266b(Function1 function1, Function1 function12, int i2) {
        super(1);
        this.f3830d = i2;
        this.f3831e = function1;
        this.f3832i = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2;
        switch (this.f3830d) {
            case 0:
                o oVar = (o) obj;
                synchronized (q.f3878b) {
                    i2 = q.f3880d;
                    q.f3880d = i2 + 1;
                }
                return new C0269e(i2, oVar, this.f3831e, this.f3832i);
            case 1:
                this.f3831e.invoke(obj);
                this.f3832i.invoke(obj);
                return Unit.f7487a;
            default:
                this.f3831e.invoke(obj);
                this.f3832i.invoke(obj);
                return Unit.f7487a;
        }
    }
}
