package m2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x implements a1.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f6518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f6519e;

    public x(Function2 function2, Function1 function1) {
        this.f6518d = function2;
        this.f6519e = function1;
    }

    @Override // a1.r
    public final Object b(a1.c cVar, Object obj) {
        return this.f6518d.invoke(cVar, obj);
    }
}
