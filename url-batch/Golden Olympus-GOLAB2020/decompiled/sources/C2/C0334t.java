package C2;

import g2.AbstractC2429a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0334t implements I0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f332a;

    /* renamed from: b, reason: collision with root package name */
    private final C0338v f333b;

    /* renamed from: C2.t$a */
    public static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ m2.c f335j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m2.c cVar) {
            super(0);
            this.f335j = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new C0321m((InterfaceC3527b) C0334t.this.b().invoke(this.f335j));
        }
    }

    public C0334t(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f332a = compute;
        this.f333b = new C0338v();
    }

    @Override // C2.I0
    public InterfaceC3527b a(m2.c key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        obj = this.f333b.get(AbstractC2429a.a(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
        C0318k0 c0318k0 = (C0318k0) obj;
        Object obj2 = c0318k0.f303a.get();
        if (obj2 == null) {
            obj2 = c0318k0.a(new a(key));
        }
        return ((C0321m) obj2).f306a;
    }

    public final Function1 b() {
        return this.f332a;
    }
}
