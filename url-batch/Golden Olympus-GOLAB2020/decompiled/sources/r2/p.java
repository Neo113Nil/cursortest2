package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s2.C3418i;

/* loaded from: classes3.dex */
abstract /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    private static final int f43575a = t2.H.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    static final class a extends kotlin.coroutines.jvm.internal.l implements h2.n {

        /* renamed from: l, reason: collision with root package name */
        int f43576l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f43577m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f43578n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2 f43579o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f43579o = function2;
        }

        @Override // h2.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3397g interfaceC3397g, Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f43579o, dVar);
            aVar.f43577m = interfaceC3397g;
            aVar.f43578n = obj;
            return aVar.invokeSuspend(Unit.f41027a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC3397g interfaceC3397g;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f43576l;
            if (i4 == 0) {
                ResultKt.a(obj);
                interfaceC3397g = (InterfaceC3397g) this.f43577m;
                Object obj2 = this.f43578n;
                Function2 function2 = this.f43579o;
                this.f43577m = interfaceC3397g;
                this.f43576l = 1;
                obj = function2.invoke(obj2, this);
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return Unit.f41027a;
                }
                interfaceC3397g = (InterfaceC3397g) this.f43577m;
                ResultKt.a(obj);
            }
            this.f43577m = null;
            this.f43576l = 2;
        }
    }

    public static final InterfaceC3396f a(InterfaceC3396f interfaceC3396f, Function2 function2) {
        return AbstractC3398h.u(interfaceC3396f, new a(function2, null));
    }

    public static final InterfaceC3396f b(InterfaceC3396f interfaceC3396f, h2.n nVar) {
        return new C3418i(nVar, interfaceC3396f, null, 0, null, 28, null);
    }
}
