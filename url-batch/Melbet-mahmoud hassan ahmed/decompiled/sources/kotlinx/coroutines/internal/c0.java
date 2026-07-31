package kotlinx.coroutines.internal;

import java.util.Objects;
import m6.e2;
import y5.g;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f18321a = new y("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final f6.p<Object, g.b, Object> f18322b = a.f18325f;

    /* renamed from: c, reason: collision with root package name */
    private static final f6.p<e2<?>, g.b, e2<?>> f18323c = b.f18326f;

    /* renamed from: d, reason: collision with root package name */
    private static final f6.p<f0, g.b, f0> f18324d = c.f18327f;

    static final class a extends kotlin.jvm.internal.j implements f6.p<Object, g.b, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f18325f = new a();

        a() {
            super(2);
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof e2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends kotlin.jvm.internal.j implements f6.p<e2<?>, g.b, e2<?>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f18326f = new b();

        b() {
            super(2);
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e2<?> invoke(e2<?> e2Var, g.b bVar) {
            if (e2Var != null) {
                return e2Var;
            }
            if (bVar instanceof e2) {
                return (e2) bVar;
            }
            return null;
        }
    }

    static final class c extends kotlin.jvm.internal.j implements f6.p<f0, g.b, f0> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f18327f = new c();

        c() {
            super(2);
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(f0 f0Var, g.b bVar) {
            if (bVar instanceof e2) {
                e2<?> e2Var = (e2) bVar;
                f0Var.a(e2Var, e2Var.h(f0Var.f18336a));
            }
            return f0Var;
        }
    }

    public static final void a(y5.g gVar, Object obj) {
        if (obj == f18321a) {
            return;
        }
        if (obj instanceof f0) {
            ((f0) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f18323c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((e2) fold).w(gVar, obj);
    }

    public static final Object b(y5.g gVar) {
        Object fold = gVar.fold(0, f18322b);
        kotlin.jvm.internal.i.b(fold);
        return fold;
    }

    public static final Object c(y5.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f18321a : obj instanceof Integer ? gVar.fold(new f0(gVar, ((Number) obj).intValue()), f18324d) : ((e2) obj).h(gVar);
    }
}
