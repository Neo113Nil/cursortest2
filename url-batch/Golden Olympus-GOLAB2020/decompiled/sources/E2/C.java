package E2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final C2.E f514a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f515b;

    /* synthetic */ class a extends kotlin.jvm.internal.p implements Function2 {
        a(Object obj) {
            super(2, obj, C.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean a(A2.f p02, int i4) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(((C) this.receiver).e(p02, i4));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((A2.f) obj, ((Number) obj2).intValue());
        }
    }

    public C(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f514a = new C2.E(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(A2.f fVar, int i4) {
        boolean z4 = !fVar.j(i4) && fVar.i(i4).c();
        this.f515b = z4;
        return z4;
    }

    public final boolean b() {
        return this.f515b;
    }

    public final void c(int i4) {
        this.f514a.a(i4);
    }

    public final int d() {
        return this.f514a.d();
    }
}
