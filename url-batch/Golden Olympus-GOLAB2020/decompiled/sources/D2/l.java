package D2;

import A2.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class l implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final l f408a = new l();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f409b = A2.i.c("kotlinx.serialization.json.JsonElement", d.b.f66a, new A2.f[0], a.f410i);

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f410i = new a();

        /* renamed from: D2.l$a$a, reason: collision with other inner class name */
        static final class C0008a extends kotlin.jvm.internal.s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0008a f411i = new C0008a();

            C0008a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final A2.f invoke() {
                return A.f369a.getDescriptor();
            }
        }

        static final class b extends kotlin.jvm.internal.s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f412i = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final A2.f invoke() {
                return v.f425a.getDescriptor();
            }
        }

        static final class c extends kotlin.jvm.internal.s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            public static final c f413i = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final A2.f invoke() {
                return r.f420a.getDescriptor();
            }
        }

        static final class d extends kotlin.jvm.internal.s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            public static final d f414i = new d();

            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final A2.f invoke() {
                return y.f430a.getDescriptor();
            }
        }

        static final class e extends kotlin.jvm.internal.s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            public static final e f415i = new e();

            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final A2.f invoke() {
                return D2.d.f377a.getDescriptor();
            }
        }

        a() {
            super(1);
        }

        public final void a(A2.a buildSerialDescriptor) {
            A2.f f4;
            A2.f f5;
            A2.f f6;
            A2.f f7;
            A2.f f8;
            Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
            f4 = m.f(C0008a.f411i);
            A2.a.b(buildSerialDescriptor, "JsonPrimitive", f4, null, false, 12, null);
            f5 = m.f(b.f412i);
            A2.a.b(buildSerialDescriptor, "JsonNull", f5, null, false, 12, null);
            f6 = m.f(c.f413i);
            A2.a.b(buildSerialDescriptor, "JsonLiteral", f6, null, false, 12, null);
            f7 = m.f(d.f414i);
            A2.a.b(buildSerialDescriptor, "JsonObject", f7, null, false, 12, null);
            f8 = m.f(e.f415i);
            A2.a.b(buildSerialDescriptor, "JsonArray", f8, null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A2.a) obj);
            return Unit.f41027a;
        }
    }

    private l() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public i deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return m.d(decoder).i();
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, i value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m.h(encoder);
        if (value instanceof z) {
            encoder.t(A.f369a, value);
        } else if (value instanceof w) {
            encoder.t(y.f430a, value);
        } else if (value instanceof C0349b) {
            encoder.t(d.f377a, value);
        }
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f409b;
    }
}
