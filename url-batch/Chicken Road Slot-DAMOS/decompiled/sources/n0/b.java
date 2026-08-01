package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f6640e;

    public /* synthetic */ b(int i3, long j) {
        this.f6639d = i3;
        this.f6640e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ge.h hVar;
        Object mVar;
        int i3 = this.f6639d;
        long j = this.f6640e;
        switch (i3) {
            case 0:
                c cVar = (c) obj;
                Function1 function1 = cVar.f6645b;
                if (function1 != null && (hVar = cVar.f6644a) != null) {
                    try {
                        hd.l lVar = hd.n.f4511e;
                        mVar = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        hd.l lVar2 = hd.n.f4511e;
                        mVar = new hd.m(th);
                    }
                    hVar.resumeWith(mVar);
                }
                return Unit.f5554a;
            default:
                ((b4.a) obj).c(u8.g.f9696b, Long.valueOf(j));
                return null;
        }
    }
}
