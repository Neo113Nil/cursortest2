package s2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import r2.InterfaceC3397g;
import t2.K;

/* loaded from: classes3.dex */
final class z implements InterfaceC3397g {

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext f46034b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f46035c;

    /* renamed from: d, reason: collision with root package name */
    private final Function2 f46036d;

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f46037l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f46038m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC3397g f46039n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f46039n = interfaceC3397g;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.d dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f46039n, dVar);
            aVar.f46038m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f46037l;
            if (i4 == 0) {
                ResultKt.a(obj);
                Object obj2 = this.f46038m;
                InterfaceC3397g interfaceC3397g = this.f46039n;
                this.f46037l = 1;
                if (interfaceC3397g.emit(obj2, this) == f4) {
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

    public z(InterfaceC3397g interfaceC3397g, CoroutineContext coroutineContext) {
        this.f46034b = coroutineContext;
        this.f46035c = K.b(coroutineContext);
        this.f46036d = new a(interfaceC3397g, null);
    }

    @Override // r2.InterfaceC3397g
    public Object emit(Object obj, kotlin.coroutines.d dVar) {
        Object b4 = AbstractC3415f.b(this.f46034b, obj, this.f46035c, this.f46036d, dVar);
        return b4 == AbstractC1241b.f() ? b4 : Unit.f41027a;
    }
}
