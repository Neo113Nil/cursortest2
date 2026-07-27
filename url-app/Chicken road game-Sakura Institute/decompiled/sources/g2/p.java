package g2;

import j2.AbstractC0720j;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f6739e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6740i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f6741j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Iterable f6742k;

    public /* synthetic */ p(s sVar, e eVar, Iterable iterable, long j4, Iterable iterable2, int i2) {
        this.f6738d = i2;
        this.f6741j = sVar;
        this.f6739e = eVar;
        this.f6740i = j4;
        this.f6742k = iterable2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6738d) {
            case 0:
                e eVar = this.f6739e;
                s sVar = this.f6741j;
                x xVar = (x) sVar.f6753c;
                long j4 = this.f6740i;
                Long valueOf = Long.valueOf(j4);
                xVar.getClass();
                AbstractC0720j.c(j4 > ((Long) xVar.f6773c).longValue());
                ArrayList arrayList = (ArrayList) xVar.f6772b;
                o2.s sVar2 = (o2.s) this.f6742k;
                arrayList.add(new v(j4, eVar, sVar2));
                xVar.f6771a = ((C0639b) xVar.f6771a).e(eVar, sVar2);
                xVar.f6773c = valueOf;
                return s.h(sVar, new h2.f(h2.e.f6876d, eVar, sVar2));
            default:
                e eVar2 = this.f6739e;
                s sVar3 = this.f6741j;
                x xVar2 = (x) sVar3.f6753c;
                long j5 = this.f6740i;
                Long valueOf2 = Long.valueOf(j5);
                xVar2.getClass();
                AbstractC0720j.c(j5 > ((Long) xVar2.f6773c).longValue());
                ArrayList arrayList2 = (ArrayList) xVar2.f6772b;
                C0639b c0639b = (C0639b) this.f6742k;
                arrayList2.add(new v(j5, eVar2, c0639b));
                xVar2.f6771a = ((C0639b) xVar2.f6771a).h(eVar2, c0639b);
                xVar2.f6773c = valueOf2;
                return s.h(sVar3, new h2.c(h2.e.f6876d, eVar2, c0639b));
        }
    }
}
