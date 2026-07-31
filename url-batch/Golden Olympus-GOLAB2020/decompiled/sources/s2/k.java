package s2;

import a2.AbstractC1241b;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import q2.u;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;

/* loaded from: classes3.dex */
public abstract class k {

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        Object f45994l;

        /* renamed from: m, reason: collision with root package name */
        Object f45995m;

        /* renamed from: n, reason: collision with root package name */
        int f45996n;

        /* renamed from: o, reason: collision with root package name */
        int f45997o;

        /* renamed from: p, reason: collision with root package name */
        int f45998p;

        /* renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f45999q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC3396f[] f46000r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function0 f46001s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ h2.n f46002t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC3397g f46003u;

        /* renamed from: s2.k$a$a, reason: collision with other inner class name */
        static final class C0276a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f46004l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ InterfaceC3396f[] f46005m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f46006n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f46007o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q2.d f46008p;

            /* renamed from: s2.k$a$a$a, reason: collision with other inner class name */
            static final class C0277a implements InterfaceC3397g {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q2.d f46009b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f46010c;

                /* renamed from: s2.k$a$a$a$a, reason: collision with other inner class name */
                static final class C0278a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: l, reason: collision with root package name */
                    /* synthetic */ Object f46011l;

                    /* renamed from: n, reason: collision with root package name */
                    int f46013n;

                    C0278a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f46011l = obj;
                        this.f46013n |= Integer.MIN_VALUE;
                        return C0277a.this.emit(null, this);
                    }
                }

                C0277a(q2.d dVar, int i4) {
                    this.f46009b = dVar;
                    this.f46010c = i4;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
                
                    if (o2.c1.a(r0) != r1) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
                
                    if (r8.s(r2, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // r2.InterfaceC3397g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    C0278a c0278a;
                    int i4;
                    if (dVar instanceof C0278a) {
                        c0278a = (C0278a) dVar;
                        int i5 = c0278a.f46013n;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            c0278a.f46013n = i5 - Integer.MIN_VALUE;
                            Object obj2 = c0278a.f46011l;
                            Object f4 = AbstractC1241b.f();
                            i4 = c0278a.f46013n;
                            if (i4 != 0) {
                                ResultKt.a(obj2);
                                q2.d dVar2 = this.f46009b;
                                IndexedValue indexedValue = new IndexedValue(this.f46010c, obj);
                                c0278a.f46013n = 1;
                            } else {
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.a(obj2);
                                    return Unit.f41027a;
                                }
                                ResultKt.a(obj2);
                            }
                            c0278a.f46013n = 2;
                        }
                    }
                    c0278a = new C0278a(dVar);
                    Object obj22 = c0278a.f46011l;
                    Object f42 = AbstractC1241b.f();
                    i4 = c0278a.f46013n;
                    if (i4 != 0) {
                    }
                    c0278a.f46013n = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0276a(InterfaceC3396f[] interfaceC3396fArr, int i4, AtomicInteger atomicInteger, q2.d dVar, kotlin.coroutines.d dVar2) {
                super(2, dVar2);
                this.f46005m = interfaceC3396fArr;
                this.f46006n = i4;
                this.f46007o = atomicInteger;
                this.f46008p = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new C0276a(this.f46005m, this.f46006n, this.f46007o, this.f46008p, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object f4 = AbstractC1241b.f();
                int i4 = this.f46004l;
                try {
                    if (i4 == 0) {
                        ResultKt.a(obj);
                        InterfaceC3396f[] interfaceC3396fArr = this.f46005m;
                        int i5 = this.f46006n;
                        InterfaceC3396f interfaceC3396f = interfaceC3396fArr[i5];
                        C0277a c0277a = new C0277a(this.f46008p, i5);
                        this.f46004l = 1;
                        if (interfaceC3396f.a(c0277a, this) == f4) {
                            return f4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        u.a.a(this.f46008p, null, 1, null);
                    }
                    return Unit.f41027a;
                } finally {
                    if (this.f46007o.decrementAndGet() == 0) {
                        u.a.a(this.f46008p, null, 1, null);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                return ((C0276a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3396f[] interfaceC3396fArr, Function0 function0, h2.n nVar, InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f46000r = interfaceC3396fArr;
            this.f46001s = function0;
            this.f46002t = nVar;
            this.f46003u = interfaceC3397g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f46000r, this.f46001s, this.f46002t, this.f46003u, dVar);
            aVar.f45999q = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c1 A[LOOP:0: B:18:0x00c1->B:33:?, LOOP_START, PHI: r6 r10
          0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:15:0x00bc, B:33:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v12 kotlin.collections.IndexedValue) binds: [B:15:0x00bc, B:33:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0106 -> B:10:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0126 -> B:10:0x0129). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            int i4;
            byte[] bArr;
            Object[] objArr;
            q2.d dVar;
            Object obj2;
            Object[] objArr2;
            byte[] bArr2;
            int i5;
            int i6;
            IndexedValue indexedValue;
            Object f4 = AbstractC1241b.f();
            int i7 = this.f45998p;
            if (i7 == 0) {
                ResultKt.a(obj);
                InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f45999q;
                length = this.f46000r.length;
                if (length == 0) {
                    return Unit.f41027a;
                }
                Object[] objArr3 = new Object[length];
                AbstractC3219i.o(objArr3, s.f46020b, 0, 0, 6, null);
                q2.d b4 = q2.g.b(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                i4 = 0;
                int i8 = 0;
                while (i8 < length) {
                    AtomicInteger atomicInteger2 = atomicInteger;
                    AbstractC3337k.d(interfaceC3316J, null, null, new C0276a(this.f46000r, i8, atomicInteger2, b4, null), 3, null);
                    i8++;
                    atomicInteger = atomicInteger2;
                }
                bArr = new byte[length];
                objArr = objArr3;
                dVar = b4;
                byte b5 = (byte) (i4 + 1);
                this.f45999q = objArr;
                this.f45994l = dVar;
                this.f45995m = bArr;
                this.f45996n = length;
                this.f45997o = b5;
                this.f45998p = 1;
                obj2 = dVar.e(this);
                if (obj2 != f4) {
                }
                return f4;
            }
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6 = this.f45997o;
                i5 = this.f45996n;
                bArr2 = (byte[]) this.f45995m;
                dVar = (q2.d) this.f45994l;
                objArr2 = (Object[]) this.f45999q;
                ResultKt.a(obj);
                i4 = i6;
                length = i5;
                bArr = bArr2;
                objArr = objArr2;
                byte b52 = (byte) (i4 + 1);
                this.f45999q = objArr;
                this.f45994l = dVar;
                this.f45995m = bArr;
                this.f45996n = length;
                this.f45997o = b52;
                this.f45998p = 1;
                obj2 = dVar.e(this);
                if (obj2 != f4) {
                    byte[] bArr3 = bArr;
                    i5 = length;
                    i6 = b52;
                    objArr2 = objArr;
                    bArr2 = bArr3;
                    indexedValue = (IndexedValue) q2.h.f(obj2);
                    if (indexedValue != null) {
                        return Unit.f41027a;
                    }
                    while (true) {
                        int a4 = indexedValue.a();
                        Object obj3 = objArr2[a4];
                        objArr2[a4] = indexedValue.b();
                        if (obj3 == s.f46020b) {
                            i5--;
                        }
                        if (bArr2[a4] != i6) {
                            bArr2[a4] = (byte) i6;
                            indexedValue = (IndexedValue) q2.h.f(dVar.d());
                            if (indexedValue != null) {
                            }
                        }
                        if (i5 == 0) {
                            Object[] objArr4 = (Object[]) this.f46001s.invoke();
                            if (objArr4 == null) {
                                h2.n nVar = this.f46002t;
                                InterfaceC3397g interfaceC3397g = this.f46003u;
                                this.f45999q = objArr2;
                                this.f45994l = dVar;
                                this.f45995m = bArr2;
                                this.f45996n = i5;
                                this.f45997o = i6;
                                this.f45998p = 2;
                            } else {
                                AbstractC3219i.j(objArr2, objArr4, 0, 0, 0, 14, null);
                                h2.n nVar2 = this.f46002t;
                                InterfaceC3397g interfaceC3397g2 = this.f46003u;
                                this.f45999q = objArr2;
                                this.f45994l = dVar;
                                this.f45995m = bArr2;
                                this.f45996n = i5;
                                this.f45997o = i6;
                                this.f45998p = 3;
                            }
                            byte b522 = (byte) (i4 + 1);
                            this.f45999q = objArr;
                            this.f45994l = dVar;
                            this.f45995m = bArr;
                            this.f45996n = length;
                            this.f45997o = b522;
                            this.f45998p = 1;
                            obj2 = dVar.e(this);
                            if (obj2 != f4) {
                            }
                        }
                    }
                    i4 = i6;
                    length = i5;
                    bArr = bArr2;
                    objArr = objArr2;
                    byte b5222 = (byte) (i4 + 1);
                    this.f45999q = objArr;
                    this.f45994l = dVar;
                    this.f45995m = bArr;
                    this.f45996n = length;
                    this.f45997o = b5222;
                    this.f45998p = 1;
                    obj2 = dVar.e(this);
                    if (obj2 != f4) {
                    }
                }
                return f4;
            }
            i6 = this.f45997o;
            i5 = this.f45996n;
            bArr2 = (byte[]) this.f45995m;
            dVar = (q2.d) this.f45994l;
            objArr2 = (Object[]) this.f45999q;
            ResultKt.a(obj);
            obj2 = ((q2.h) obj).k();
            indexedValue = (IndexedValue) q2.h.f(obj2);
            if (indexedValue != null) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    public static final Object a(InterfaceC3397g interfaceC3397g, InterfaceC3396f[] interfaceC3396fArr, Function0 function0, h2.n nVar, kotlin.coroutines.d dVar) {
        Object a4 = n.a(new a(interfaceC3396fArr, function0, nVar, interfaceC3397g, null), dVar);
        return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
    }
}
