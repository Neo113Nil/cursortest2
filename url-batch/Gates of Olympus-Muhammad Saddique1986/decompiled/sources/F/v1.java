package F;

import I.C0143d;
import I.C0167p;
import I.C0170q0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.InterfaceC0426e;
import java.util.Arrays;
import java.util.List;
import n.AbstractC0695v;
import o.C0740b;
import r.AbstractC0856c;
import r0.AbstractC0898U;
import s.C0939h;
import u0.C1123s;

/* loaded from: classes.dex */
public final class v1 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1840h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(int i3, int i4, Object obj, Object obj2) {
        super(2);
        this.f1837e = i4;
        this.f1839g = obj;
        this.f1840h = obj2;
        this.f1838f = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1837e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f1838f | 1);
                Q.a aVar = (Q.a) this.f1840h;
                x1.a((C0.K) this.f1839g, aVar, (C0167p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                C0170q0[] c0170q0Arr = (C0170q0[]) this.f1839g;
                C0170q0[] c0170q0Arr2 = (C0170q0[]) Arrays.copyOf(c0170q0Arr, c0170q0Arr.length);
                int U4 = C0143d.U(this.f1838f | 1);
                C0143d.b(c0170q0Arr2, (InterfaceC0426e) this.f1840h, (C0167p) obj, U4);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f1838f | 1);
                C0143d.a((C0170q0) this.f1839g, (InterfaceC0426e) this.f1840h, (C0167p) obj, U5);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj2).intValue();
                int U6 = C0143d.U(this.f1838f) | 1;
                ((Q.a) this.f1840h).c(this.f1839g, (C0167p) obj, U6);
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                int U7 = C0143d.U(this.f1838f | 1);
                ((m.l0) this.f1839g).a(this.f1840h, (C0167p) obj, U7);
                break;
            case 5:
                ((Number) obj2).intValue();
                int U8 = C0143d.U(this.f1838f | 1);
                ((o.i) this.f1839g).a((C0740b) this.f1840h, (C0167p) obj, U8);
                break;
            case 6:
                ((Number) obj2).intValue();
                int U9 = C0143d.U(this.f1838f | 1);
                AbstractC0898U.b((U.q) this.f1839g, (InterfaceC0426e) this.f1840h, (C0167p) obj, U9);
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    ((C0939h) this.f1839g).a(this.f1838f, this.f1840h, c0167p, 0);
                }
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                ((Number) obj2).intValue();
                int U10 = C0143d.U(this.f1838f | 1);
                AndroidCompositionLocals_androidKt.a((C1123s) this.f1839g, (Q.a) this.f1840h, (C0167p) obj, U10);
                break;
            case AbstractC0856c.f8037c /* 9 */:
                ((Number) obj2).intValue();
                int U11 = C0143d.U(this.f1838f | 1);
                n.r.c((S.t) this.f1839g, (List) this.f1840h, (C0167p) obj, U11);
                break;
            case AbstractC0856c.f8039e /* 10 */:
                ((Number) obj2).intValue();
                int U12 = C0143d.U(this.f1838f | 1);
                Q.a aVar2 = (Q.a) this.f1840h;
                AbstractC0695v.d((R.i) this.f1839g, aVar2, (C0167p) obj, U12);
                break;
            default:
                ((Number) obj2).intValue();
                int U13 = C0143d.U(this.f1838f | 1);
                x.N.b((B.a0) this.f1839g, (Q.a) this.f1840h, (C0167p) obj, U13);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(int i3, Object obj, C0939h c0939h) {
        super(2);
        this.f1837e = 7;
        this.f1839g = c0939h;
        this.f1838f = i3;
        this.f1840h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(Q.a aVar, Object obj, int i3) {
        super(2);
        this.f1837e = 3;
        this.f1840h = aVar;
        this.f1839g = obj;
        this.f1838f = i3;
    }
}
