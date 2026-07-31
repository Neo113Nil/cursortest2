package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.EnumC3383a;
import s2.AbstractC3414e;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3392b extends AbstractC3394d {

    /* renamed from: f, reason: collision with root package name */
    private final Function2 f43536f;

    /* renamed from: r2.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43537l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f43538m;

        /* renamed from: o, reason: collision with root package name */
        int f43540o;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43538m = obj;
            this.f43540o |= Integer.MIN_VALUE;
            return C3392b.this.i(null, this);
        }
    }

    public /* synthetic */ C3392b(Function2 function2, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i5 & 2) != 0 ? kotlin.coroutines.g.f41113b : coroutineContext, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? EnumC3383a.f43420b : enumC3383a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // r2.AbstractC3394d, s2.AbstractC3414e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object i(q2.r rVar, kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f43540o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f43540o = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f43538m;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f43540o;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    aVar.f43537l = rVar;
                    aVar.f43540o = 1;
                    if (super.i(rVar, aVar) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (q2.r) aVar.f43537l;
                    ResultKt.a(obj);
                }
                if (rVar.t()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return Unit.f41027a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f43538m;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f43540o;
        if (i4 != 0) {
        }
        if (rVar.t()) {
        }
    }

    @Override // s2.AbstractC3414e
    protected AbstractC3414e j(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return new C3392b(this.f43536f, coroutineContext, i4, enumC3383a);
    }

    public C3392b(Function2 function2, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        super(function2, coroutineContext, i4, enumC3383a);
        this.f43536f = function2;
    }
}
