package y2;

import A2.d;
import A2.j;
import C2.AbstractC0299b;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s;
import z2.AbstractC3551a;

/* renamed from: y2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3530e extends AbstractC0299b {

    /* renamed from: a, reason: collision with root package name */
    private final m2.c f46775a;

    /* renamed from: b, reason: collision with root package name */
    private List f46776b;

    /* renamed from: c, reason: collision with root package name */
    private final W1.h f46777c;

    /* renamed from: y2.e$a */
    static final class a extends s implements Function0 {

        /* renamed from: y2.e$a$a, reason: collision with other inner class name */
        static final class C0293a extends s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C3530e f46779i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0293a(C3530e c3530e) {
                super(1);
                this.f46779i = c3530e;
            }

            public final void a(A2.a buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                A2.a.b(buildSerialDescriptor, "type", AbstractC3551a.H(L.f41137a).getDescriptor(), null, false, 12, null);
                A2.a.b(buildSerialDescriptor, "value", A2.i.d("kotlinx.serialization.Polymorphic<" + this.f46779i.e().e() + '>', j.a.f97a, new A2.f[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.h(this.f46779i.f46776b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((A2.a) obj);
                return Unit.f41027a;
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final A2.f invoke() {
            return A2.b.c(A2.i.c("kotlinx.serialization.Polymorphic", d.a.f65a, new A2.f[0], new C0293a(C3530e.this)), C3530e.this.e());
        }
    }

    public C3530e(m2.c baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f46775a = baseClass;
        this.f46776b = CollectionsKt.emptyList();
        this.f46777c = W1.i.a(W1.l.f9607c, new a());
    }

    @Override // C2.AbstractC0299b
    public m2.c e() {
        return this.f46775a;
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return (A2.f) this.f46777c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}
