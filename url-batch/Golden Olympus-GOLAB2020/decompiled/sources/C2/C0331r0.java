package C2;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0331r0 extends Y {

    /* renamed from: c, reason: collision with root package name */
    private final A2.f f328c;

    /* renamed from: C2.r0$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC3527b f329i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3527b f330j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3527b interfaceC3527b, InterfaceC3527b interfaceC3527b2) {
            super(1);
            this.f329i = interfaceC3527b;
            this.f330j = interfaceC3527b2;
        }

        public final void a(A2.a buildClassSerialDescriptor) {
            Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            A2.a.b(buildClassSerialDescriptor, "first", this.f329i.getDescriptor(), null, false, 12, null);
            A2.a.b(buildClassSerialDescriptor, "second", this.f330j.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A2.a) obj);
            return Unit.f41027a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0331r0(InterfaceC3527b keySerializer, InterfaceC3527b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f328c = A2.i.b("kotlin.Pair", new A2.f[0], new a(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.Y
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.Y
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return this.f328c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.Y
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Pair e(Object obj, Object obj2) {
        return TuplesKt.to(obj, obj2);
    }
}
