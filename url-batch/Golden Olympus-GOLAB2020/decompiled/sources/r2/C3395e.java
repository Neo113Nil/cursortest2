package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: r2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3395e implements InterfaceC3396f {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3396f f43545b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f43546c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f43547d;

    /* renamed from: r2.e$a */
    static final class a implements InterfaceC3397g {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.G f43549c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3397g f43550d;

        /* renamed from: r2.e$a$a, reason: collision with other inner class name */
        static final class C0251a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: l, reason: collision with root package name */
            /* synthetic */ Object f43551l;

            /* renamed from: n, reason: collision with root package name */
            int f43553n;

            C0251a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43551l = obj;
                this.f43553n |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(kotlin.jvm.internal.G g4, InterfaceC3397g interfaceC3397g) {
            this.f43549c = g4;
            this.f43550d = interfaceC3397g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // r2.InterfaceC3397g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            C0251a c0251a;
            int i4;
            if (dVar instanceof C0251a) {
                c0251a = (C0251a) dVar;
                int i5 = c0251a.f43553n;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0251a.f43553n = i5 - Integer.MIN_VALUE;
                    Object obj2 = c0251a.f43551l;
                    Object f4 = AbstractC1241b.f();
                    i4 = c0251a.f43553n;
                    if (i4 != 0) {
                        ResultKt.a(obj2);
                        Object invoke = C3395e.this.f43546c.invoke(obj);
                        Object obj3 = this.f43549c.f41132b;
                        if (obj3 != s2.s.f46019a && ((Boolean) C3395e.this.f43547d.invoke(obj3, invoke)).booleanValue()) {
                            return Unit.f41027a;
                        }
                        this.f43549c.f41132b = invoke;
                        InterfaceC3397g interfaceC3397g = this.f43550d;
                        c0251a.f43553n = 1;
                        if (interfaceC3397g.emit(obj, c0251a) == f4) {
                            return f4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj2);
                    }
                    return Unit.f41027a;
                }
            }
            c0251a = new C0251a(dVar);
            Object obj22 = c0251a.f43551l;
            Object f42 = AbstractC1241b.f();
            i4 = c0251a.f43553n;
            if (i4 != 0) {
            }
            return Unit.f41027a;
        }
    }

    public C3395e(InterfaceC3396f interfaceC3396f, Function1 function1, Function2 function2) {
        this.f43545b = interfaceC3396f;
        this.f43546c = function1;
        this.f43547d = function2;
    }

    @Override // r2.InterfaceC3396f
    public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
        g4.f41132b = s2.s.f46019a;
        Object a4 = this.f43545b.a(new a(g4, interfaceC3397g), dVar);
        return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
    }
}
