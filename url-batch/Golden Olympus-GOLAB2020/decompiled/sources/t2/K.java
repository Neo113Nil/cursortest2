package t2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.S0;

/* loaded from: classes3.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final G f46209a = new G("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f46210b = a.f46213i;

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f46211c = b.f46214i;

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f46212d = c.f46215i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f46213i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            if (!(element instanceof S0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? element : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f46214i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke(S0 s02, CoroutineContext.Element element) {
            if (s02 != null) {
                return s02;
            }
            if (element instanceof S0) {
                return (S0) element;
            }
            return null;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f46215i = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke(O o4, CoroutineContext.Element element) {
            if (element instanceof S0) {
                S0 s02 = (S0) element;
                o4.a(s02, s02.Q(o4.f46218a));
            }
            return o4;
        }
    }

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f46209a) {
            return;
        }
        if (obj instanceof O) {
            ((O) obj).b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f46211c);
        Intrinsics.checkNotNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((S0) fold).l(coroutineContext, obj);
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f46210b);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f46209a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new O(coroutineContext, ((Number) obj).intValue()), f46212d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((S0) obj).Q(coroutineContext);
    }
}
