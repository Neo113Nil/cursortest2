package l5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l.v f6070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterable f6071e;

    public /* synthetic */ q(l.v vVar, f fVar, Iterable iterable, long j8, Iterable iterable2, int i7) {
        this.f6067a = i7;
        this.f6070d = vVar;
        this.f6068b = fVar;
        this.f6069c = j8;
        this.f6071e = iterable2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6067a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l.v vVar = this.f6070d;
                x xVar = (x) vVar.f5682c;
                t5.s sVar = (t5.s) this.f6071e;
                long j8 = this.f6069c;
                Long valueOf = Long.valueOf(j8);
                xVar.getClass();
                o5.j.c(j8 > ((Long) xVar.f6094c).longValue());
                ArrayList arrayList = (ArrayList) xVar.f6093b;
                f fVar = this.f6068b;
                arrayList.add(new v(j8, fVar, sVar));
                xVar.f6092a = ((b) xVar.f6092a).a(fVar, sVar);
                xVar.f6094c = valueOf;
                return l.v.h(vVar, new m5.e(m5.d.f6427d, fVar, sVar));
            default:
                b bVar = (b) this.f6071e;
                l.v vVar2 = this.f6070d;
                x xVar2 = (x) vVar2.f5682c;
                long j9 = this.f6069c;
                Long valueOf2 = Long.valueOf(j9);
                xVar2.getClass();
                o5.j.c(j9 > ((Long) xVar2.f6094c).longValue());
                ArrayList arrayList2 = (ArrayList) xVar2.f6093b;
                f fVar2 = this.f6068b;
                arrayList2.add(new v(j9, fVar2, bVar));
                xVar2.f6092a = ((b) xVar2.f6092a).g(fVar2, bVar);
                xVar2.f6094c = valueOf2;
                return l.v.h(vVar2, new m5.c(m5.d.f6427d, fVar2, bVar));
        }
    }
}
