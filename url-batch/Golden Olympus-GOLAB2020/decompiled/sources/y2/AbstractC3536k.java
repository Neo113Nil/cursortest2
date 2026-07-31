package y2;

import C2.AbstractC0325o;
import C2.I0;
import C2.InterfaceC0335t0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z2.AbstractC3551a;

/* renamed from: y2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3536k {

    /* renamed from: a, reason: collision with root package name */
    private static final I0 f46780a = AbstractC0325o.a(c.f46788i);

    /* renamed from: b, reason: collision with root package name */
    private static final I0 f46781b = AbstractC0325o.a(d.f46789i);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC0335t0 f46782c = AbstractC0325o.b(a.f46784i);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC0335t0 f46783d = AbstractC0325o.b(b.f46786i);

    /* renamed from: y2.k$a */
    static final class a extends s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f46784i = new a();

        /* renamed from: y2.k$a$a, reason: collision with other inner class name */
        static final class C0294a extends s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ List f46785i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0294a(List list) {
                super(0);
                this.f46785i = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m2.d invoke() {
                return ((m2.k) this.f46785i.get(0)).g();
            }
        }

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3527b invoke(m2.c clazz, List types) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            List e4 = AbstractC3537l.e(F2.c.a(), types, true);
            Intrinsics.checkNotNull(e4);
            return AbstractC3537l.a(clazz, e4, new C0294a(types));
        }
    }

    /* renamed from: y2.k$b */
    static final class b extends s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f46786i = new b();

        /* renamed from: y2.k$b$a */
        static final class a extends s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ List f46787i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f46787i = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m2.d invoke() {
                return ((m2.k) this.f46787i.get(0)).g();
            }
        }

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3527b invoke(m2.c clazz, List types) {
            InterfaceC3527b t4;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            List e4 = AbstractC3537l.e(F2.c.a(), types, true);
            Intrinsics.checkNotNull(e4);
            InterfaceC3527b a4 = AbstractC3537l.a(clazz, e4, new a(types));
            if (a4 == null || (t4 = AbstractC3551a.t(a4)) == null) {
                return null;
            }
            return t4;
        }
    }

    /* renamed from: y2.k$c */
    static final class c extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f46788i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3527b invoke(m2.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC3537l.d(it);
        }
    }

    /* renamed from: y2.k$d */
    static final class d extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f46789i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3527b invoke(m2.c it) {
            InterfaceC3527b t4;
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC3527b d4 = AbstractC3537l.d(it);
            if (d4 == null || (t4 = AbstractC3551a.t(d4)) == null) {
                return null;
            }
            return t4;
        }
    }

    public static final InterfaceC3527b a(m2.c clazz, boolean z4) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (z4) {
            return f46781b.a(clazz);
        }
        InterfaceC3527b a4 = f46780a.a(clazz);
        if (a4 != null) {
            return a4;
        }
        return null;
    }

    public static final Object b(m2.c clazz, List types, boolean z4) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !z4 ? f46782c.a(clazz, types) : f46783d.a(clazz, types);
    }
}
