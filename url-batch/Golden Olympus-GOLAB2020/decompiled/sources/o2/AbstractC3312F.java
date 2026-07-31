package o2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: o2.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3312F {

    /* renamed from: o2.F$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f41998i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            return coroutineContext.plus(element);
        }
    }

    /* renamed from: o2.F$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.G f41999i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f42000j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.G g4, boolean z4) {
            super(2);
            this.f41999i = g4;
            this.f42000j = z4;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            return coroutineContext.plus(element);
        }
    }

    /* renamed from: o2.F$c */
    static final class c extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f42001i = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z4, CoroutineContext.Element element) {
            return Boolean.valueOf(z4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2);
        }
    }

    private static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z4) {
        boolean c4 = c(coroutineContext);
        boolean c5 = c(coroutineContext2);
        if (!c4 && !c5) {
            return coroutineContext.plus(coroutineContext2);
        }
        kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
        g4.f41132b = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f41113b;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new b(g4, z4));
        if (c5) {
            g4.f41132b = ((CoroutineContext) g4.f41132b).fold(gVar, a.f41998i);
        }
        return coroutineContext3.plus((CoroutineContext) g4.f41132b);
    }

    public static final String b(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, c.f42001i)).booleanValue();
    }

    public static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !c(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    public static final CoroutineContext e(InterfaceC3316J interfaceC3316J, CoroutineContext coroutineContext) {
        CoroutineContext a4 = a(interfaceC3316J.n(), coroutineContext, true);
        return (a4 == Z.a() || a4.get(kotlin.coroutines.e.f41111K2) != null) ? a4 : a4.plus(Z.a());
    }

    public static final Y0 f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof V) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof Y0) {
                return (Y0) eVar;
            }
        }
        return null;
    }

    public static final Y0 g(kotlin.coroutines.d dVar, CoroutineContext coroutineContext, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || coroutineContext.get(Z0.f42042b) == null) {
            return null;
        }
        Y0 f4 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f4 != null) {
            f4.T0(coroutineContext, obj);
        }
        return f4;
    }
}
