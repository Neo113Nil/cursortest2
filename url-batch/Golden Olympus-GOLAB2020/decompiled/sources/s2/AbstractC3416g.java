package s2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3312F;
import q2.EnumC3383a;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;

/* renamed from: s2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3416g extends AbstractC3414e {

    /* renamed from: e, reason: collision with root package name */
    protected final InterfaceC3396f f45971e;

    /* renamed from: s2.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f45972l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f45973m;

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            return ((a) create(interfaceC3397g, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = AbstractC3416g.this.new a(dVar);
            aVar.f45973m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f45972l;
            if (i4 == 0) {
                ResultKt.a(obj);
                InterfaceC3397g interfaceC3397g = (InterfaceC3397g) this.f45973m;
                AbstractC3416g abstractC3416g = AbstractC3416g.this;
                this.f45972l = 1;
                if (abstractC3416g.r(interfaceC3397g, this) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }
    }

    public AbstractC3416g(InterfaceC3396f interfaceC3396f, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        super(coroutineContext, i4, enumC3383a);
        this.f45971e = interfaceC3396f;
    }

    static /* synthetic */ Object o(AbstractC3416g abstractC3416g, InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        if (abstractC3416g.f45962c == -3) {
            CoroutineContext context = dVar.getContext();
            CoroutineContext d4 = AbstractC3312F.d(context, abstractC3416g.f45961b);
            if (Intrinsics.areEqual(d4, context)) {
                Object r4 = abstractC3416g.r(interfaceC3397g, dVar);
                return r4 == AbstractC1241b.f() ? r4 : Unit.f41027a;
            }
            e.b bVar = kotlin.coroutines.e.f41111K2;
            if (Intrinsics.areEqual(d4.get(bVar), context.get(bVar))) {
                Object q4 = abstractC3416g.q(interfaceC3397g, d4, dVar);
                return q4 == AbstractC1241b.f() ? q4 : Unit.f41027a;
            }
        }
        Object a4 = super.a(interfaceC3397g, dVar);
        return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
    }

    static /* synthetic */ Object p(AbstractC3416g abstractC3416g, q2.r rVar, kotlin.coroutines.d dVar) {
        Object r4 = abstractC3416g.r(new w(rVar), dVar);
        return r4 == AbstractC1241b.f() ? r4 : Unit.f41027a;
    }

    private final Object q(InterfaceC3397g interfaceC3397g, CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        InterfaceC3397g d4;
        d4 = AbstractC3415f.d(interfaceC3397g, dVar.getContext());
        return AbstractC3415f.c(coroutineContext, d4, null, new a(null), dVar, 4, null);
    }

    @Override // s2.AbstractC3414e, r2.InterfaceC3396f
    public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        return o(this, interfaceC3397g, dVar);
    }

    @Override // s2.AbstractC3414e
    protected Object i(q2.r rVar, kotlin.coroutines.d dVar) {
        return p(this, rVar, dVar);
    }

    protected abstract Object r(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar);

    @Override // s2.AbstractC3414e
    public String toString() {
        return this.f45971e + " -> " + super.toString();
    }
}
