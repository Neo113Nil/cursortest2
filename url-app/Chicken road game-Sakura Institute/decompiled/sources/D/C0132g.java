package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132g extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O.a f1793e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1794i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0132g(O.a aVar, int i2, int i4) {
        super(2);
        this.f1792d = i4;
        switch (i4) {
            case 1:
                this.f1793e = aVar;
                this.f1794i = i2;
                super(2);
                break;
            default:
                float f4 = AbstractC0150m.f1888a;
                float f5 = AbstractC0150m.f1888a;
                this.f1793e = aVar;
                this.f1794i = i2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        O.a aVar = this.f1793e;
        int i2 = this.f1794i;
        int i4 = this.f1792d;
        C0216p c0216p = (C0216p) obj;
        ((Number) obj2).intValue();
        switch (i4) {
            case 0:
                int U3 = C0192d.U(i2 | 1);
                float f4 = AbstractC0150m.f1888a;
                float f5 = AbstractC0150m.f1888a;
                AbstractC0150m.b(aVar, c0216p, U3);
                break;
            default:
                m3.u.b(aVar, c0216p, C0192d.U(i2 | 1));
                break;
        }
        return Unit.f7487a;
    }
}
