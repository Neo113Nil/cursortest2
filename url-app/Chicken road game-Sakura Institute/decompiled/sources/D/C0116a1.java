package D;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0964Z;

/* renamed from: D.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116a1 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1701e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1702i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1703j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z f1704k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1705l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1706m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q.m0 f1707n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0964Z f1708o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1709p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1710q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Integer f1711r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1712s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f1713t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116a1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Z z4, int i2, int i4, q.m0 m0Var, InterfaceC0964Z interfaceC0964Z, int i5, int i6, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f1700d = arrayList;
        this.f1701e = arrayList2;
        this.f1702i = arrayList3;
        this.f1703j = arrayList4;
        this.f1704k = z4;
        this.f1705l = i2;
        this.f1706m = i4;
        this.f1707n = m0Var;
        this.f1708o = interfaceC0964Z;
        this.f1709p = i5;
        this.f1710q = i6;
        this.f1711r = num;
        this.f1712s = arrayList5;
        this.f1713t = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2;
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        ArrayList arrayList = this.f1700d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0953N.d(abstractC0953N, (AbstractC0954O) arrayList.get(i4), 0, 0);
        }
        ArrayList arrayList2 = this.f1701e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AbstractC0953N.d(abstractC0953N, (AbstractC0954O) arrayList2.get(i5), 0, 0);
        }
        ArrayList arrayList3 = this.f1702i;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            i2 = this.f1709p;
            if (i6 >= size3) {
                break;
            }
            AbstractC0954O abstractC0954O = (AbstractC0954O) arrayList3.get(i6);
            int i7 = (this.f1705l - this.f1706m) / 2;
            InterfaceC0964Z interfaceC0964Z = this.f1708o;
            AbstractC0953N.d(abstractC0953N, abstractC0954O, this.f1707n.d(interfaceC0964Z, interfaceC0964Z.getLayoutDirection()) + i7, i2 - this.f1710q);
            i6++;
        }
        ArrayList arrayList4 = this.f1703j;
        int size4 = arrayList4.size();
        for (int i8 = 0; i8 < size4; i8++) {
            AbstractC0954O abstractC0954O2 = (AbstractC0954O) arrayList4.get(i8);
            Integer num = this.f1711r;
            AbstractC0953N.d(abstractC0953N, abstractC0954O2, 0, i2 - (num != null ? num.intValue() : 0));
        }
        Z z4 = this.f1704k;
        if (z4 != null) {
            ArrayList arrayList5 = this.f1712s;
            int size5 = arrayList5.size();
            for (int i9 = 0; i9 < size5; i9++) {
                AbstractC0954O abstractC0954O3 = (AbstractC0954O) arrayList5.get(i9);
                Integer num2 = this.f1713t;
                Intrinsics.c(num2);
                AbstractC0953N.d(abstractC0953N, abstractC0954O3, z4.f1685a, i2 - num2.intValue());
            }
        }
        return Unit.f7487a;
    }
}
