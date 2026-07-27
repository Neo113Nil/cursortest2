package n;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import y2.InterfaceC1332g;

/* loaded from: classes.dex */
public final class p extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8541d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f8542e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1332g f8543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Function0 function0, boolean z4) {
        super(0);
        this.f8542e = z4;
        this.f8543i = (M2.p) function0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8541d) {
            case 0:
                if (this.f8542e) {
                    ((M2.p) this.f8543i).invoke();
                }
                break;
            default:
                ((Function1) this.f8543i).invoke(Boolean.valueOf(!this.f8542e));
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Function1 function1, boolean z4) {
        super(0);
        this.f8543i = function1;
        this.f8542e = z4;
    }
}
