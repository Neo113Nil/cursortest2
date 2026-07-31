package s2;

import a2.AbstractC1241b;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import o2.K;
import o2.L;
import o2.N;
import q2.EnumC3383a;
import r2.AbstractC3398h;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;

/* renamed from: s2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3414e implements p {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f45961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45962c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC3383a f45963d;

    /* renamed from: s2.e$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f45964l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f45965m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC3397g f45966n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AbstractC3414e f45967o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3397g interfaceC3397g, AbstractC3414e abstractC3414e, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f45966n = interfaceC3397g;
            this.f45967o = abstractC3414e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f45966n, this.f45967o, dVar);
            aVar.f45965m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f45964l;
            if (i4 == 0) {
                ResultKt.a(obj);
                InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f45965m;
                InterfaceC3397g interfaceC3397g = this.f45966n;
                q2.t n4 = this.f45967o.n(interfaceC3316J);
                this.f45964l = 1;
                if (AbstractC3398h.j(interfaceC3397g, n4, this) == f4) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    /* renamed from: s2.e$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f45968l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f45969m;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q2.r rVar, kotlin.coroutines.d dVar) {
            return ((b) create(rVar, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            b bVar = AbstractC3414e.this.new b(dVar);
            bVar.f45969m = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f45968l;
            if (i4 == 0) {
                ResultKt.a(obj);
                q2.r rVar = (q2.r) this.f45969m;
                AbstractC3414e abstractC3414e = AbstractC3414e.this;
                this.f45968l = 1;
                if (abstractC3414e.i(rVar, this) == f4) {
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

    public AbstractC3414e(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        this.f45961b = coroutineContext;
        this.f45962c = i4;
        this.f45963d = enumC3383a;
    }

    static /* synthetic */ Object h(AbstractC3414e abstractC3414e, InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        Object g4 = K.g(new a(interfaceC3397g, abstractC3414e, null), dVar);
        return g4 == AbstractC1241b.f() ? g4 : Unit.f41027a;
    }

    @Override // r2.InterfaceC3396f
    public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        return h(this, interfaceC3397g, dVar);
    }

    @Override // s2.p
    public InterfaceC3396f f(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        CoroutineContext plus = coroutineContext.plus(this.f45961b);
        if (enumC3383a == EnumC3383a.f43420b) {
            int i5 = this.f45962c;
            if (i5 != -3) {
                if (i4 != -3) {
                    if (i5 != -2) {
                        if (i4 != -2) {
                            i4 += i5;
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i5;
            }
            enumC3383a = this.f45963d;
        }
        return (Intrinsics.areEqual(plus, this.f45961b) && i4 == this.f45962c && enumC3383a == this.f45963d) ? this : j(plus, i4, enumC3383a);
    }

    protected String g() {
        return null;
    }

    protected abstract Object i(q2.r rVar, kotlin.coroutines.d dVar);

    protected abstract AbstractC3414e j(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a);

    public InterfaceC3396f k() {
        return null;
    }

    public final Function2 l() {
        return new b(null);
    }

    public final int m() {
        int i4 = this.f45962c;
        if (i4 == -3) {
            return -2;
        }
        return i4;
    }

    public q2.t n(InterfaceC3316J interfaceC3316J) {
        return q2.p.d(interfaceC3316J, this.f45961b, m(), this.f45963d, L.f42011d, null, l(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String g4 = g();
        if (g4 != null) {
            arrayList.add(g4);
        }
        if (this.f45961b != kotlin.coroutines.g.f41113b) {
            arrayList.add("context=" + this.f45961b);
        }
        if (this.f45962c != -3) {
            arrayList.add("capacity=" + this.f45962c);
        }
        if (this.f45963d != EnumC3383a.f43420b) {
            arrayList.add("onBufferOverflow=" + this.f45963d);
        }
        return N.a(this) + '[' + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
