package r2;

import a2.AbstractC1241b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import q2.EnumC3383a;
import s2.AbstractC3414e;

/* renamed from: r2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3394d extends AbstractC3414e {

    /* renamed from: e, reason: collision with root package name */
    private final Function2 f43544e;

    public AbstractC3394d(Function2 function2, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        super(coroutineContext, i4, enumC3383a);
        this.f43544e = function2;
    }

    static /* synthetic */ Object o(AbstractC3394d abstractC3394d, q2.r rVar, kotlin.coroutines.d dVar) {
        Object invoke = abstractC3394d.f43544e.invoke(rVar, dVar);
        return invoke == AbstractC1241b.f() ? invoke : Unit.f41027a;
    }

    @Override // s2.AbstractC3414e
    protected Object i(q2.r rVar, kotlin.coroutines.d dVar) {
        return o(this, rVar, dVar);
    }

    @Override // s2.AbstractC3414e
    public String toString() {
        return "block[" + this.f43544e + "] -> " + super.toString();
    }
}
