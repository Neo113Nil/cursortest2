package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
abstract /* synthetic */ class s {

    public static final class a implements InterfaceC3396f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3396f f43610b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3396f f43611c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h2.n f43612d;

        public a(InterfaceC3396f interfaceC3396f, InterfaceC3396f interfaceC3396f2, h2.n nVar) {
            this.f43610b = interfaceC3396f;
            this.f43611c = interfaceC3396f2;
            this.f43612d = nVar;
        }

        @Override // r2.InterfaceC3396f
        public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            Object a4 = s2.k.a(interfaceC3397g, new InterfaceC3396f[]{this.f43610b, this.f43611c}, s.c(), new b(this.f43612d, null), dVar);
            return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements h2.n {

        /* renamed from: l, reason: collision with root package name */
        int f43613l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f43614m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f43615n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ h2.n f43616o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h2.n nVar, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f43616o = nVar;
        }

        @Override // h2.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3397g interfaceC3397g, Object[] objArr, kotlin.coroutines.d dVar) {
            b bVar = new b(this.f43616o, dVar);
            bVar.f43614m = interfaceC3397g;
            bVar.f43615n = objArr;
            return bVar.invokeSuspend(Unit.f41027a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC3397g interfaceC3397g;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f43613l;
            if (i4 == 0) {
                ResultKt.a(obj);
                interfaceC3397g = (InterfaceC3397g) this.f43614m;
                Object[] objArr = (Object[]) this.f43615n;
                h2.n nVar = this.f43616o;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f43614m = interfaceC3397g;
                this.f43613l = 1;
                obj = nVar.invoke(obj2, obj3, this);
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return Unit.f41027a;
                }
                interfaceC3397g = (InterfaceC3397g) this.f43614m;
                ResultKt.a(obj);
            }
            this.f43614m = null;
            this.f43613l = 2;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f43617i = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final InterfaceC3396f b(InterfaceC3396f interfaceC3396f, InterfaceC3396f interfaceC3396f2, h2.n nVar) {
        return new a(interfaceC3396f, interfaceC3396f2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 c() {
        return c.f43617i;
    }
}
