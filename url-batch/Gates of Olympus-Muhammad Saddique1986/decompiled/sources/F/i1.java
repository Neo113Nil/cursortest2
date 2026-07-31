package F;

import e2.InterfaceC0424c;
import java.util.ArrayList;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0902Y;

/* loaded from: classes.dex */
public final class i1 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1583g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1584h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z f1585i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1586j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1587k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r.X f1588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0902Y f1589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1590n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1591o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Integer f1592p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1593q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Integer f1594r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Z z3, int i3, int i4, r.X x3, InterfaceC0902Y interfaceC0902Y, int i5, int i6, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f1581e = arrayList;
        this.f1582f = arrayList2;
        this.f1583g = arrayList3;
        this.f1584h = arrayList4;
        this.f1585i = z3;
        this.f1586j = i3;
        this.f1587k = i4;
        this.f1588l = x3;
        this.f1589m = interfaceC0902Y;
        this.f1590n = i5;
        this.f1591o = i6;
        this.f1592p = num;
        this.f1593q = arrayList5;
        this.f1594r = num2;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        int i3;
        AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
        ArrayList arrayList = this.f1581e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0892N.d(abstractC0892N, (AbstractC0893O) arrayList.get(i4), 0, 0);
        }
        ArrayList arrayList2 = this.f1582f;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AbstractC0892N.d(abstractC0892N, (AbstractC0893O) arrayList2.get(i5), 0, 0);
        }
        ArrayList arrayList3 = this.f1583g;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            i3 = this.f1590n;
            if (i6 >= size3) {
                break;
            }
            AbstractC0893O abstractC0893O = (AbstractC0893O) arrayList3.get(i6);
            int i7 = (this.f1586j - this.f1587k) / 2;
            InterfaceC0902Y interfaceC0902Y = this.f1589m;
            AbstractC0892N.d(abstractC0892N, abstractC0893O, this.f1588l.a(interfaceC0902Y, interfaceC0902Y.getLayoutDirection()) + i7, i3 - this.f1591o);
            i6++;
        }
        ArrayList arrayList4 = this.f1584h;
        int size4 = arrayList4.size();
        for (int i8 = 0; i8 < size4; i8++) {
            AbstractC0893O abstractC0893O2 = (AbstractC0893O) arrayList4.get(i8);
            Integer num = this.f1592p;
            AbstractC0892N.d(abstractC0892N, abstractC0893O2, 0, i3 - (num != null ? num.intValue() : 0));
        }
        Z z3 = this.f1585i;
        if (z3 != null) {
            ArrayList arrayList5 = this.f1593q;
            int size5 = arrayList5.size();
            for (int i9 = 0; i9 < size5; i9++) {
                AbstractC0893O abstractC0893O3 = (AbstractC0893O) arrayList5.get(i9);
                Integer num2 = this.f1594r;
                f2.j.c(num2);
                AbstractC0892N.d(abstractC0892N, abstractC0893O3, z3.f1457a, i3 - num2.intValue());
            }
        }
        return R1.y.f4171a;
    }
}
