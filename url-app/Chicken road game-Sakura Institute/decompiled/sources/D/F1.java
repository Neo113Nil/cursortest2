package D;

import a.AbstractC0345a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0964Z;

/* loaded from: classes.dex */
public final class F1 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0964Z f1256e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f1257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M2.C f1258j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1259k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L2.c f1261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1262n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1263o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(ArrayList arrayList, InterfaceC0964Z interfaceC0964Z, Function2 function2, M2.C c4, long j4, int i2, L2.c cVar, ArrayList arrayList2, int i4) {
        super(1);
        this.f1255d = arrayList;
        this.f1256e = interfaceC0964Z;
        this.f1257i = function2;
        this.f1258j = c4;
        this.f1259k = j4;
        this.f1260l = i2;
        this.f1261m = cVar;
        this.f1262n = arrayList2;
        this.f1263o = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2;
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        ArrayList arrayList = this.f1255d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0953N.f(abstractC0953N, (AbstractC0954O) arrayList.get(i4), this.f1258j.f3578d * i4, 0);
        }
        J1 j12 = J1.f1353e;
        Function2 function2 = this.f1257i;
        InterfaceC0964Z interfaceC0964Z = this.f1256e;
        List v4 = interfaceC0964Z.v(j12, function2);
        int size2 = v4.size();
        int i5 = 0;
        while (true) {
            i2 = this.f1260l;
            if (i5 >= size2) {
                break;
            }
            AbstractC0954O a4 = ((InterfaceC0944E) v4.get(i5)).a(M0.a.b(this.f1259k, 0, 0, 0, 0, 11));
            AbstractC0953N.f(abstractC0953N, a4, 0, i2 - a4.f9006e);
            i5++;
        }
        List v5 = interfaceC0964Z.v(J1.f1354i, new O.a(1621992604, true, new C0120c(this.f1261m, 6, this.f1262n)));
        int size3 = v5.size();
        for (int i6 = 0; i6 < size3; i6++) {
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) v5.get(i6);
            int i7 = this.f1263o;
            if (i7 < 0 || i2 < 0) {
                AbstractC0345a.I("width(" + i7 + ") and height(" + i2 + ") must be >= 0");
                throw null;
            }
            AbstractC0953N.f(abstractC0953N, interfaceC0944E.a(u3.d.t(i7, i7, i2, i2)), 0, 0);
        }
        return Unit.f7487a;
    }
}
