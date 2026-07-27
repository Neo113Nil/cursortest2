package D;

import G.C0208l;
import G.C0216p;
import androidx.compose.foundation.layout.FillElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0960V;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0964Z;
import z2.C1412P;

/* loaded from: classes.dex */
public final class G1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O.a f1295e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f1296i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L2.c f1297j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G1(O.a aVar, Function2 function2, L2.c cVar, int i2) {
        super(2);
        this.f1294d = i2;
        this.f1295e = aVar;
        this.f1296i = function2;
        this.f1297j = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        InterfaceC0946G t4;
        switch (this.f1294d) {
            case 0:
                InterfaceC0964Z interfaceC0964Z = (InterfaceC0964Z) obj;
                long j4 = ((M0.a) obj2).f3539a;
                int i2 = M0.a.i(j4);
                List v4 = interfaceC0964Z.v(J1.f1352d, this.f1295e);
                int size = v4.size();
                M2.C c4 = new M2.C();
                if (size > 0) {
                    c4.f3578d = i2 / size;
                }
                Integer num = 0;
                int size2 = v4.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    num = Integer.valueOf(Math.max(((InterfaceC0944E) v4.get(i4)).b(c4.f3578d), num.intValue()));
                }
                int intValue = num.intValue();
                ArrayList arrayList = new ArrayList(v4.size());
                int size3 = v4.size();
                int i5 = 0;
                while (i5 < size3) {
                    InterfaceC0944E interfaceC0944E = (InterfaceC0944E) v4.get(i5);
                    int i6 = c4.f3578d;
                    arrayList.add(interfaceC0944E.a(M0.a.a(i6, i6, intValue, intValue)));
                    i5++;
                    i2 = i2;
                }
                int i7 = i2;
                ArrayList arrayList2 = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    M0.e a4 = new M0.e(interfaceC0964Z.i0(Math.min(((InterfaceC0944E) v4.get(i8)).X(intValue), c4.f3578d)) - (z1.f2128c * 2));
                    M0.e b4 = new M0.e(24);
                    Intrinsics.checkNotNullParameter(a4, "a");
                    Intrinsics.checkNotNullParameter(b4, "b");
                    if (a4.compareTo(b4) < 0) {
                        a4 = b4;
                    }
                    arrayList2.add(new A1(interfaceC0964Z.i0(c4.f3578d) * i8, interfaceC0964Z.i0(c4.f3578d), a4.f3545d));
                }
                t4 = interfaceC0964Z.t(i7, intValue, C1412P.c(), new F1(arrayList, interfaceC0964Z, this.f1296i, c4, j4, intValue, this.f1297j, arrayList2, i7));
                return t4;
            default:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f5081a;
                    O.a aVar = this.f1295e;
                    boolean f4 = c0216p.f(aVar);
                    Function2 function2 = this.f1296i;
                    boolean f5 = f4 | c0216p.f(function2);
                    L2.c cVar = this.f1297j;
                    boolean f6 = f5 | c0216p.f(cVar);
                    Object I3 = c0216p.I();
                    if (f6 || I3 == C0208l.f2826a) {
                        I3 = new G1(aVar, function2, cVar, 0);
                        c0216p.c0(I3);
                    }
                    AbstractC0960V.b(fillElement, (Function2) I3, c0216p, 6, 0);
                }
                return Unit.f7487a;
        }
    }
}
