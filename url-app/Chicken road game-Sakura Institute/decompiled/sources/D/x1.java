package D;

import G.C0192d;
import G.C0216p;
import G.C0219q0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n.AbstractC0864b;
import q.AbstractC1024c;
import s0.C1166s;

/* loaded from: classes.dex */
public final class x1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2100e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2101i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2102j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(int i2, int i4, Object obj, Object obj2) {
        super(2);
        this.f2099d = i4;
        this.f2102j = obj;
        this.f2100e = obj2;
        this.f2101i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f2099d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f2101i | 1);
                z1.d((O.a) this.f2102j, (Function2) this.f2100e, (C0216p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f2101i | 1);
                N1.a((A0.L) this.f2102j, (Function2) this.f2100e, (C0216p) obj, U4);
                break;
            case 2:
                ((Number) obj2).intValue();
                C0219q0[] c0219q0Arr = (C0219q0[]) this.f2102j;
                C0219q0[] c0219q0Arr2 = (C0219q0[]) Arrays.copyOf(c0219q0Arr, c0219q0Arr.length);
                int U5 = C0192d.U(this.f2101i | 1);
                C0192d.b(c0219q0Arr2, (Function2) this.f2100e, (C0216p) obj, U5);
                break;
            case 3:
                ((Number) obj2).intValue();
                int U6 = C0192d.U(this.f2101i | 1);
                C0192d.a((C0219q0) this.f2102j, (Function2) this.f2100e, (C0216p) obj, U6);
                break;
            case 4:
                ((Number) obj2).intValue();
                int U7 = C0192d.U(this.f2101i) | 1;
                ((O.a) this.f2102j).a(this.f2100e, (C0216p) obj, U7);
                break;
            case 5:
                ((Number) obj2).intValue();
                int U8 = C0192d.U(this.f2101i | 1);
                ((l.m0) this.f2102j).a(this.f2100e, (C0216p) obj, U8);
                break;
            case 6:
                ((Number) obj2).intValue();
                int U9 = C0192d.U(this.f2101i | 1);
                u3.l.H((S.o) this.f2102j, (Function1) this.f2100e, (C0216p) obj, U9);
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj2).intValue();
                int U10 = C0192d.U(this.f2101i | 1);
                ((n.j) this.f2102j).a((n.c) this.f2100e, (C0216p) obj, U10);
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    ((r.h) this.f2102j).a(this.f2101i, this.f2100e, c0216p, 0);
                }
                break;
            case AbstractC1024c.f9242c /* 9 */:
                ((Number) obj2).intValue();
                int U11 = C0192d.U(this.f2101i | 1);
                AndroidCompositionLocals_androidKt.a((C1166s) this.f2100e, (O.a) this.f2102j, (C0216p) obj, U11);
                break;
            case 10:
                ((Number) obj2).intValue();
                int U12 = C0192d.U(this.f2101i | 1);
                AbstractC0864b.g((Q.v) this.f2102j, (List) this.f2100e, (C0216p) obj, U12);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                ((Number) obj2).intValue();
                int U13 = C0192d.U(this.f2101i | 1);
                O.a aVar = (O.a) this.f2102j;
                m3.o.d((P.i) this.f2100e, aVar, (C0216p) obj, U13);
                break;
            default:
                ((Number) obj2).intValue();
                int U14 = C0192d.U(this.f2101i | 1);
                w.M.b((A.a0) this.f2100e, (O.a) this.f2102j, (C0216p) obj, U14);
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(int i2, Object obj, r.h hVar) {
        super(2);
        this.f2099d = 8;
        this.f2102j = hVar;
        this.f2101i = i2;
        this.f2100e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, O.a aVar, int i2, int i4) {
        super(2);
        this.f2099d = i4;
        this.f2100e = obj;
        this.f2102j = aVar;
        this.f2101i = i2;
    }
}
