package k;

import A.C0016l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import s.C1101e;
import s.C1103g;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740f extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7287d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7288e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7289i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f7290j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f7291k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740f(int i2, int i4, i.v vVar, C0016l c0016l) {
        super(1);
        this.f7288e = i2;
        this.f7289i = i4;
        this.f7290j = vVar;
        this.f7291k = c0016l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7287d) {
            case 0:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                for (AbstractC0954O abstractC0954O : (AbstractC0954O[]) this.f7290j) {
                    if (abstractC0954O != null) {
                        long a4 = ((C0741g) this.f7291k).f7292a.f7301b.a(u3.d.c(abstractC0954O.f9005d, abstractC0954O.f9006e), u3.d.c(this.f7288e, this.f7289i), M0.k.f3555d);
                        AbstractC0953N.d(abstractC0953N, abstractC0954O, (int) (a4 >> 32), (int) (a4 & 4294967295L));
                    }
                }
                break;
            default:
                C1103g c1103g = (C1103g) obj;
                l2.g gVar = c1103g.f9932c;
                int max = Math.max(this.f7288e, c1103g.f9930a);
                int min = Math.min(this.f7289i, (r1 + c1103g.f9931b) - 1);
                if (max <= min) {
                    while (true) {
                        C1101e c1101e = new C1101e(max);
                        ((i.v) this.f7290j).f(max, c1101e);
                        C0016l c0016l = (C0016l) this.f7291k;
                        ((Object[]) c0016l.f165d)[max - c0016l.f163b] = c1101e;
                        if (max != min) {
                            max++;
                        }
                    }
                }
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740f(AbstractC0954O[] abstractC0954OArr, C0741g c0741g, int i2, int i4) {
        super(1);
        this.f7290j = abstractC0954OArr;
        this.f7291k = c0741g;
        this.f7288e = i2;
        this.f7289i = i4;
    }
}
