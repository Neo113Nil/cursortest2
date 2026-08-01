package md;

import kotlin.collections.i0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public int f6627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f6628e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ld.a f6629i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ld.a aVar, CoroutineContext coroutineContext, Function2 function2, ld.a aVar2) {
        super(coroutineContext, aVar);
        this.f6628e = function2;
        this.f6629i = aVar2;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f6627d;
        if (i3 != 0) {
            if (i3 != 1) {
                i0.l("This coroutine had already completed");
                return null;
            }
            this.f6627d = 2;
            cf.c.M(obj);
            return obj;
        }
        this.f6627d = 1;
        cf.c.M(obj);
        Function2 function2 = this.f6628e;
        function2.getClass();
        g0.c(2, function2);
        return function2.invoke(this.f6629i, this);
    }
}
