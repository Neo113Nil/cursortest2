package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
abstract /* synthetic */ class o {

    public static final class a implements InterfaceC3396f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3396f f43565b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f43566c;

        public a(InterfaceC3396f interfaceC3396f, Function2 function2) {
            this.f43565b = interfaceC3396f;
            this.f43566c = function2;
        }

        @Override // r2.InterfaceC3396f
        public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            Object a4 = this.f43565b.a(new b(new kotlin.jvm.internal.D(), interfaceC3397g, this.f43566c), dVar);
            return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
        }
    }

    static final class b implements InterfaceC3397g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.D f43567b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3397g f43568c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f43569d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: l, reason: collision with root package name */
            Object f43570l;

            /* renamed from: m, reason: collision with root package name */
            Object f43571m;

            /* renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f43572n;

            /* renamed from: p, reason: collision with root package name */
            int f43574p;

            a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43572n = obj;
                this.f43574p |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(kotlin.jvm.internal.D d4, InterfaceC3397g interfaceC3397g, Function2 function2) {
            this.f43567b = d4;
            this.f43568c = interfaceC3397g;
            this.f43569d = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // r2.InterfaceC3397g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            a aVar;
            int i4;
            b bVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i5 = aVar.f43574p;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    aVar.f43574p = i5 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f43572n;
                    Object f4 = AbstractC1241b.f();
                    i4 = aVar.f43574p;
                    if (i4 != 0) {
                        ResultKt.a(obj2);
                        if (this.f43567b.f41129b) {
                            InterfaceC3397g interfaceC3397g = this.f43568c;
                            aVar.f43574p = 1;
                        } else {
                            Function2 function2 = this.f43569d;
                            aVar.f43570l = this;
                            aVar.f43571m = obj;
                            aVar.f43574p = 2;
                            obj2 = function2.invoke(obj, aVar);
                            if (obj2 != f4) {
                                bVar = this;
                                if (!((Boolean) obj2).booleanValue()) {
                                }
                            }
                        }
                        return f4;
                    }
                    if (i4 == 1) {
                        ResultKt.a(obj2);
                        return Unit.f41027a;
                    }
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj2);
                        return Unit.f41027a;
                    }
                    obj = aVar.f43571m;
                    bVar = (b) aVar.f43570l;
                    ResultKt.a(obj2);
                    if (!((Boolean) obj2).booleanValue()) {
                        return Unit.f41027a;
                    }
                    bVar.f43567b.f41129b = true;
                    InterfaceC3397g interfaceC3397g2 = bVar.f43568c;
                    aVar.f43570l = null;
                    aVar.f43571m = null;
                    aVar.f43574p = 3;
                }
            }
            aVar = new a(dVar);
            Object obj22 = aVar.f43572n;
            Object f42 = AbstractC1241b.f();
            i4 = aVar.f43574p;
            if (i4 != 0) {
            }
        }
    }

    public static final InterfaceC3396f a(InterfaceC3396f interfaceC3396f, Function2 function2) {
        return new a(interfaceC3396f, function2);
    }
}
