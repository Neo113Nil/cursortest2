package r2;

import a2.AbstractC1241b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3367z0;
import o2.InterfaceC3359v0;
import q2.EnumC3383a;
import s2.AbstractC3411b;
import s2.AbstractC3413d;

/* loaded from: classes3.dex */
final class H extends AbstractC3411b implements u, InterfaceC3396f, s2.p {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f43519g = AtomicReferenceFieldUpdater.newUpdater(H.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: f, reason: collision with root package name */
    private int f43520f;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43521l;

        /* renamed from: m, reason: collision with root package name */
        Object f43522m;

        /* renamed from: n, reason: collision with root package name */
        Object f43523n;

        /* renamed from: o, reason: collision with root package name */
        Object f43524o;

        /* renamed from: p, reason: collision with root package name */
        Object f43525p;

        /* renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f43526q;

        /* renamed from: s, reason: collision with root package name */
        int f43528s;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43526q = obj;
            this.f43528s |= Integer.MIN_VALUE;
            return H.this.a(null, this);
        }
    }

    public H(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean r(Object obj, Object obj2) {
        int i4;
        AbstractC3413d[] n4;
        synchronized (this) {
            Object obj3 = f43519g.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            f43519g.set(this, obj2);
            int i5 = this.f43520f;
            if ((i5 & 1) != 0) {
                this.f43520f = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.f43520f = i6;
            AbstractC3413d[] n5 = n();
            Unit unit = Unit.f41027a;
            while (true) {
                J[] jArr = (J[]) n5;
                if (jArr != null) {
                    for (J j4 : jArr) {
                        if (j4 != null) {
                            j4.g();
                        }
                    }
                }
                synchronized (this) {
                    i4 = this.f43520f;
                    if (i4 == i6) {
                        this.f43520f = i6 + 1;
                        return true;
                    }
                    n4 = n();
                    Unit unit2 = Unit.f41027a;
                }
                n5 = n4;
                i6 = i4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
    
        if (r6.e(r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d5 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // r2.x, r2.InterfaceC3396f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        a aVar;
        Object f4;
        int i4;
        H h4;
        J j4;
        InterfaceC3397g interfaceC3397g2;
        InterfaceC3359v0 interfaceC3359v0;
        Object obj;
        Object obj2;
        Object obj3;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i5 = aVar.f43528s;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    aVar.f43528s = i5 - Integer.MIN_VALUE;
                    Object obj4 = aVar.f43526q;
                    f4 = AbstractC1241b.f();
                    i4 = aVar.f43528s;
                    if (i4 != 0) {
                        ResultKt.a(obj4);
                        h4 = this;
                        j4 = (J) i();
                    } else if (i4 == 1) {
                        j4 = (J) aVar.f43523n;
                        interfaceC3397g = (InterfaceC3397g) aVar.f43522m;
                        h4 = (H) aVar.f43521l;
                        ResultKt.a(obj4);
                    } else if (i4 == 2) {
                        obj = aVar.f43525p;
                        interfaceC3359v0 = (InterfaceC3359v0) aVar.f43524o;
                        j4 = (J) aVar.f43523n;
                        interfaceC3397g2 = (InterfaceC3397g) aVar.f43522m;
                        h4 = (H) aVar.f43521l;
                        ResultKt.a(obj4);
                        if (!j4.h()) {
                        }
                        obj2 = f43519g.get(h4);
                        if (interfaceC3359v0 != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj2 == s2.s.f46019a) {
                        }
                        aVar.f43521l = h4;
                        aVar.f43522m = interfaceC3397g2;
                        aVar.f43523n = j4;
                        aVar.f43524o = interfaceC3359v0;
                        aVar.f43525p = obj2;
                        aVar.f43528s = 2;
                        if (interfaceC3397g2.emit(obj3, aVar) == f4) {
                        }
                    } else {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = aVar.f43525p;
                        interfaceC3359v0 = (InterfaceC3359v0) aVar.f43524o;
                        j4 = (J) aVar.f43523n;
                        interfaceC3397g2 = (InterfaceC3397g) aVar.f43522m;
                        h4 = (H) aVar.f43521l;
                        ResultKt.a(obj4);
                        obj2 = f43519g.get(h4);
                        if (interfaceC3359v0 != null) {
                            AbstractC3367z0.j(interfaceC3359v0);
                        }
                        if (obj != null || !Intrinsics.areEqual(obj, obj2)) {
                            obj3 = obj2 == s2.s.f46019a ? null : obj2;
                            aVar.f43521l = h4;
                            aVar.f43522m = interfaceC3397g2;
                            aVar.f43523n = j4;
                            aVar.f43524o = interfaceC3359v0;
                            aVar.f43525p = obj2;
                            aVar.f43528s = 2;
                            if (interfaceC3397g2.emit(obj3, aVar) == f4) {
                                return f4;
                            }
                            obj = obj2;
                        }
                        if (!j4.h()) {
                            aVar.f43521l = h4;
                            aVar.f43522m = interfaceC3397g2;
                            aVar.f43523n = j4;
                            aVar.f43524o = interfaceC3359v0;
                            aVar.f43525p = obj;
                            aVar.f43528s = 3;
                        }
                        obj2 = f43519g.get(h4);
                        if (interfaceC3359v0 != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj2 == s2.s.f46019a) {
                        }
                        aVar.f43521l = h4;
                        aVar.f43522m = interfaceC3397g2;
                        aVar.f43523n = j4;
                        aVar.f43524o = interfaceC3359v0;
                        aVar.f43525p = obj2;
                        aVar.f43528s = 2;
                        if (interfaceC3397g2.emit(obj3, aVar) == f4) {
                        }
                    }
                    interfaceC3397g2 = interfaceC3397g;
                    interfaceC3359v0 = (InterfaceC3359v0) aVar.getContext().get(InterfaceC3359v0.f42105N2);
                    obj = null;
                    obj2 = f43519g.get(h4);
                    if (interfaceC3359v0 != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj2 == s2.s.f46019a) {
                    }
                    aVar.f43521l = h4;
                    aVar.f43522m = interfaceC3397g2;
                    aVar.f43523n = j4;
                    aVar.f43524o = interfaceC3359v0;
                    aVar.f43525p = obj2;
                    aVar.f43528s = 2;
                    if (interfaceC3397g2.emit(obj3, aVar) == f4) {
                    }
                }
            }
            if (i4 != 0) {
            }
            interfaceC3397g2 = interfaceC3397g;
            interfaceC3359v0 = (InterfaceC3359v0) aVar.getContext().get(InterfaceC3359v0.f42105N2);
            obj = null;
            obj2 = f43519g.get(h4);
            if (interfaceC3359v0 != null) {
            }
            if (obj != null) {
            }
            if (obj2 == s2.s.f46019a) {
            }
            aVar.f43521l = h4;
            aVar.f43522m = interfaceC3397g2;
            aVar.f43523n = j4;
            aVar.f43524o = interfaceC3359v0;
            aVar.f43525p = obj2;
            aVar.f43528s = 2;
            if (interfaceC3397g2.emit(obj3, aVar) == f4) {
            }
        } catch (Throwable th) {
            h4.l(j4);
            throw th;
        }
        aVar = new a(dVar);
        Object obj42 = aVar.f43526q;
        f4 = AbstractC1241b.f();
        i4 = aVar.f43528s;
    }

    @Override // r2.u
    public boolean b(Object obj, Object obj2) {
        if (obj == null) {
            obj = s2.s.f46019a;
        }
        if (obj2 == null) {
            obj2 = s2.s.f46019a;
        }
        return r(obj, obj2);
    }

    @Override // r2.t
    public void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // r2.t
    public boolean d(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // r2.t, r2.InterfaceC3397g
    public Object emit(Object obj, kotlin.coroutines.d dVar) {
        setValue(obj);
        return Unit.f41027a;
    }

    @Override // s2.p
    public InterfaceC3396f f(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return I.d(this, coroutineContext, i4, enumC3383a);
    }

    @Override // r2.u, r2.G
    public Object getValue() {
        t2.G g4 = s2.s.f46019a;
        Object obj = f43519g.get(this);
        if (obj == g4) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s2.AbstractC3411b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public J j() {
        return new J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s2.AbstractC3411b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public J[] k(int i4) {
        return new J[i4];
    }

    @Override // r2.u
    public void setValue(Object obj) {
        if (obj == null) {
            obj = s2.s.f46019a;
        }
        r(null, obj);
    }
}
