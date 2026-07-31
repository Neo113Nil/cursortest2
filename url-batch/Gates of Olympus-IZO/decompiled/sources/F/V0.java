package F;

import I.C0089d;
import I.C0113p;
import I.C0116q0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import h.AbstractC0416e;
import h1.C0438i;
import java.util.Arrays;
import java.util.List;
import u.InterfaceC0953v;
import u0.C0997t;

/* loaded from: classes.dex */
public final class V0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1126g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1127h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(int i3, int i4, Object obj, Object obj2) {
        super(2);
        this.f1124e = i4;
        this.f1126g = obj;
        this.f1127h = obj2;
        this.f1125f = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1124e) {
            case 0:
                ((Number) obj2).intValue();
                int T2 = C0089d.T(this.f1125f | 1);
                Q.a aVar = (Q.a) this.f1127h;
                X0.a((B0.C) this.f1126g, aVar, (C0113p) obj, T2);
                break;
            case 1:
                ((Number) obj2).intValue();
                C0116q0[] c0116q0Arr = (C0116q0[]) this.f1126g;
                C0116q0[] c0116q0Arr2 = (C0116q0[]) Arrays.copyOf(c0116q0Arr, c0116q0Arr.length);
                int T3 = C0089d.T(this.f1125f | 1);
                C0089d.b(c0116q0Arr2, (Y1.e) this.f1127h, (C0113p) obj, T3);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                int T4 = C0089d.T(this.f1125f | 1);
                C0089d.a((C0116q0) this.f1126g, (Y1.e) this.f1127h, (C0113p) obj, T4);
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj2).intValue();
                int T5 = C0089d.T(this.f1125f | 1);
                Q.a aVar2 = (Q.a) this.f1127h;
                I2.d.j((U.l) this.f1126g, aVar2, (C0113p) obj, T5);
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                int T6 = C0089d.T(this.f1125f) | 1;
                ((Q.a) this.f1127h).a(this.f1126g, (C0113p) obj, T6);
                break;
            case 5:
                ((Number) obj2).intValue();
                int T7 = C0089d.T(this.f1125f | 1);
                ((m.s0) this.f1126g).a(this.f1127h, (C0113p) obj, T7);
                break;
            case 6:
                ((Number) obj2).intValue();
                int T8 = C0089d.T(this.f1125f | 1);
                g2.i.B((U.l) this.f1126g, (Y1.c) this.f1127h, (C0113p) obj, T8);
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj2).intValue();
                int T9 = C0089d.T(this.f1125f | 1);
                r0.M.b((U.l) this.f1126g, (Y1.e) this.f1127h, (C0113p) obj, T9);
                break;
            case 8:
                ((Number) obj2).intValue();
                int T10 = C0089d.T(this.f1125f | 1);
                AbstractC0416e.j((S.t) this.f1126g, (List) this.f1127h, (C0113p) obj, T10);
                break;
            case AbstractC0382a.f4777a /* 9 */:
                ((Number) obj2).intValue();
                int T11 = C0089d.T(this.f1125f | 1);
                Q.a aVar3 = (Q.a) this.f1127h;
                AbstractC0381e.i((R.i) this.f1126g, aVar3, (C0113p) obj, T11);
                break;
            case AbstractC0382a.f4779c /* 10 */:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    ((InterfaceC0953v) this.f1126g).e(this.f1125f, this.f1127h, c0113p, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int T12 = C0089d.T(this.f1125f | 1);
                AndroidCompositionLocals_androidKt.a((C0997t) this.f1126g, (Q.a) this.f1127h, (C0113p) obj, T12);
                break;
        }
        return L1.z.f2729a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(int i3, Object obj, InterfaceC0953v interfaceC0953v) {
        super(2);
        this.f1124e = 10;
        this.f1126g = interfaceC0953v;
        this.f1125f = i3;
        this.f1127h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(Q.a aVar, Object obj, int i3) {
        super(2);
        this.f1124e = 4;
        this.f1127h = aVar;
        this.f1126g = obj;
        this.f1125f = i3;
    }
}
