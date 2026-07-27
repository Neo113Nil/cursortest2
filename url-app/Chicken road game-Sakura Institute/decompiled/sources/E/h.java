package E;

import A0.L;
import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2192e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f2193i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f2194j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2195k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(long j4, L l4, Function2 function2, int i2, int i4) {
        super(2);
        this.f2191d = i4;
        this.f2192e = j4;
        this.f2193i = l4;
        this.f2194j = function2;
        this.f2195k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f2191d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f2195k | 1);
                L l4 = this.f2193i;
                Function2 function2 = this.f2194j;
                a.a(this.f2192e, l4, function2, (C0216p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f2195k | 1);
                L l5 = this.f2193i;
                Function2 function22 = this.f2194j;
                v.b(this.f2192e, l5, function22, (C0216p) obj, U4);
                break;
        }
        return Unit.f7487a;
    }
}
