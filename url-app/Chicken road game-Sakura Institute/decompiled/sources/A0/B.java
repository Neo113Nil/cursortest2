package A0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class B implements P.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2.p f234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M2.p f235e;

    /* JADX WARN: Multi-variable type inference failed */
    public B(Function2 function2, Function1 function1) {
        this.f234d = (M2.p) function2;
        this.f235e = (M2.p) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function2] */
    @Override // P.n
    public final Object e(P.b bVar, Object obj) {
        return this.f234d.h(bVar, obj);
    }
}
