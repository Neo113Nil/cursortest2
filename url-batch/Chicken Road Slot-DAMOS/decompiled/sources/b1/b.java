package b1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f943d;

    /* renamed from: e, reason: collision with root package name */
    public Object f944e;

    public /* synthetic */ b(int i3, Object obj) {
        this.f943d = i3;
        this.f944e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.f943d) {
            case 0:
                o oVar = (o) obj;
                synchronized (r.f1030c) {
                    j = r.f1032e;
                    r.f1032e = 1 + j;
                }
                return new g(j, oVar, (Function1) this.f944e);
            case 1:
                ((n0.f) this.f944e).cancel();
                return Unit.f5554a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x1.q qVar = (x1.q) this.f944e;
                if (qVar != null) {
                    qVar.f10313c = booleanValue;
                }
                return Unit.f5554a;
        }
    }

    public /* synthetic */ b() {
        this.f943d = 2;
    }
}
