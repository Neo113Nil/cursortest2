package r2;

import a2.AbstractC1241b;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s2.C3410a;

/* loaded from: classes3.dex */
abstract /* synthetic */ class q {

    public static final class a implements InterfaceC3397g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.G f43580b;

        public a(kotlin.jvm.internal.G g4) {
            this.f43580b = g4;
        }

        @Override // r2.InterfaceC3397g
        public Object emit(Object obj, kotlin.coroutines.d dVar) {
            this.f43580b.f41132b = obj;
            throw new C3410a(this);
        }
    }

    public static final class b implements InterfaceC3397g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f43581b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.G f43582c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: l, reason: collision with root package name */
            Object f43583l;

            /* renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f43584m;

            /* renamed from: n, reason: collision with root package name */
            int f43585n;

            /* renamed from: p, reason: collision with root package name */
            Object f43587p;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43584m = obj;
                this.f43585n |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, kotlin.jvm.internal.G g4) {
            this.f43581b = function2;
            this.f43582c = g4;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // r2.InterfaceC3397g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Object obj, kotlin.coroutines.d dVar) {
            a aVar;
            Object obj2;
            int i4;
            b bVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i5 = aVar.f43585n;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    aVar.f43585n = i5 - Integer.MIN_VALUE;
                    obj2 = aVar.f43584m;
                    Object f4 = AbstractC1241b.f();
                    i4 = aVar.f43585n;
                    if (i4 != 0) {
                        ResultKt.a(obj2);
                        Function2 function2 = this.f43581b;
                        aVar.f43583l = this;
                        aVar.f43587p = obj;
                        aVar.f43585n = 1;
                        kotlin.jvm.internal.q.c(6);
                        obj2 = function2.invoke(obj, aVar);
                        kotlin.jvm.internal.q.c(7);
                        if (obj2 == f4) {
                            return f4;
                        }
                        bVar = this;
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = aVar.f43587p;
                        bVar = (b) aVar.f43583l;
                        ResultKt.a(obj2);
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        return Unit.f41027a;
                    }
                    bVar.f43582c.f41132b = obj;
                    throw new C3410a(bVar);
                }
            }
            aVar = new a(dVar);
            obj2 = aVar.f43584m;
            Object f42 = AbstractC1241b.f();
            i4 = aVar.f43585n;
            if (i4 != 0) {
            }
            if (((Boolean) obj2).booleanValue()) {
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43588l;

        /* renamed from: m, reason: collision with root package name */
        Object f43589m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f43590n;

        /* renamed from: o, reason: collision with root package name */
        int f43591o;

        c(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43590n = obj;
            this.f43591o |= Integer.MIN_VALUE;
            return AbstractC3398h.m(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43592l;

        /* renamed from: m, reason: collision with root package name */
        Object f43593m;

        /* renamed from: n, reason: collision with root package name */
        Object f43594n;

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f43595o;

        /* renamed from: p, reason: collision with root package name */
        int f43596p;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43595o = obj;
            this.f43596p |= Integer.MIN_VALUE;
            return AbstractC3398h.n(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InterfaceC3396f interfaceC3396f, kotlin.coroutines.d dVar) {
        c cVar;
        int i4;
        kotlin.jvm.internal.G g4;
        C3410a e4;
        InterfaceC3397g interfaceC3397g;
        Object obj;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i5 = cVar.f43591o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.f43591o = i5 - Integer.MIN_VALUE;
                Object obj2 = cVar.f43590n;
                Object f4 = AbstractC1241b.f();
                i4 = cVar.f43591o;
                if (i4 != 0) {
                    ResultKt.a(obj2);
                    kotlin.jvm.internal.G g5 = new kotlin.jvm.internal.G();
                    g5.f41132b = s2.s.f46019a;
                    InterfaceC3397g aVar = new a(g5);
                    try {
                        cVar.f43588l = g5;
                        cVar.f43589m = aVar;
                        cVar.f43591o = 1;
                        if (interfaceC3396f.a(aVar, cVar) == f4) {
                            return f4;
                        }
                        g4 = g5;
                    } catch (C3410a e5) {
                        g4 = g5;
                        e4 = e5;
                        interfaceC3397g = aVar;
                        s2.o.a(e4, interfaceC3397g);
                        obj = g4.f41132b;
                        if (obj == s2.s.f46019a) {
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3397g = (a) cVar.f43589m;
                    g4 = (kotlin.jvm.internal.G) cVar.f43588l;
                    try {
                        ResultKt.a(obj2);
                    } catch (C3410a e6) {
                        e4 = e6;
                        s2.o.a(e4, interfaceC3397g);
                        obj = g4.f41132b;
                        if (obj == s2.s.f46019a) {
                        }
                    }
                }
                obj = g4.f41132b;
                if (obj == s2.s.f46019a) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        cVar = new c(dVar);
        Object obj22 = cVar.f43590n;
        Object f42 = AbstractC1241b.f();
        i4 = cVar.f43591o;
        if (i4 != 0) {
        }
        obj = g4.f41132b;
        if (obj == s2.s.f46019a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(InterfaceC3396f interfaceC3396f, Function2 function2, kotlin.coroutines.d dVar) {
        d dVar2;
        int i4;
        Function2 function22;
        kotlin.jvm.internal.G g4;
        C3410a e4;
        InterfaceC3397g interfaceC3397g;
        Object obj;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i5 = dVar2.f43596p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar2.f43596p = i5 - Integer.MIN_VALUE;
                Object obj2 = dVar2.f43595o;
                Object f4 = AbstractC1241b.f();
                i4 = dVar2.f43596p;
                if (i4 != 0) {
                    ResultKt.a(obj2);
                    kotlin.jvm.internal.G g5 = new kotlin.jvm.internal.G();
                    g5.f41132b = s2.s.f46019a;
                    InterfaceC3397g bVar = new b(function2, g5);
                    try {
                        dVar2.f43592l = function2;
                        dVar2.f43593m = g5;
                        dVar2.f43594n = bVar;
                        dVar2.f43596p = 1;
                        if (interfaceC3396f.a(bVar, dVar2) == f4) {
                            return f4;
                        }
                        function22 = function2;
                        g4 = g5;
                    } catch (C3410a e5) {
                        function22 = function2;
                        g4 = g5;
                        e4 = e5;
                        interfaceC3397g = bVar;
                        s2.o.a(e4, interfaceC3397g);
                        obj = g4.f41132b;
                        if (obj == s2.s.f46019a) {
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3397g = (b) dVar2.f43594n;
                    g4 = (kotlin.jvm.internal.G) dVar2.f43593m;
                    function22 = (Function2) dVar2.f43592l;
                    try {
                        ResultKt.a(obj2);
                    } catch (C3410a e6) {
                        e4 = e6;
                        s2.o.a(e4, interfaceC3397g);
                        obj = g4.f41132b;
                        if (obj == s2.s.f46019a) {
                        }
                    }
                }
                obj = g4.f41132b;
                if (obj == s2.s.f46019a) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + function22);
            }
        }
        dVar2 = new d(dVar);
        Object obj22 = dVar2.f43595o;
        Object f42 = AbstractC1241b.f();
        i4 = dVar2.f43596p;
        if (i4 != 0) {
        }
        obj = g4.f41132b;
        if (obj == s2.s.f46019a) {
        }
    }
}
