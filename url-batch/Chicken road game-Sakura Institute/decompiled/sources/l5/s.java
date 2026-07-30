package l5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6076a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l.v f6078c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6079d;

    public s(l.v vVar, f fVar, t5.s sVar) {
        this.f6078c = vVar;
        this.f6077b = fVar;
        this.f6079d = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6076a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l.v vVar = this.f6078c;
                n5.a aVar = (n5.a) vVar.f5686g;
                f fVar = this.f6077b;
                q5.i.a(fVar);
                t5.s sVar = (t5.s) this.f6079d;
                aVar.b();
                return l.v.h(vVar, new m5.e(m5.d.f6428e, fVar, sVar));
            default:
                b y4 = b.y((HashMap) this.f6079d);
                l.v vVar2 = this.f6078c;
                ((n5.a) vVar2.f5686g).b();
                return l.v.h(vVar2, new m5.c(m5.d.f6428e, this.f6077b, y4));
        }
    }

    public s(l.v vVar, HashMap hashMap, f fVar) {
        this.f6078c = vVar;
        this.f6079d = hashMap;
        this.f6077b = fVar;
    }
}
