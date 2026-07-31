package C2;

import A2.k;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;
import y2.InterfaceC3527b;

/* renamed from: C2.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0330q0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f320a;

    /* renamed from: b, reason: collision with root package name */
    private List f321b;

    /* renamed from: c, reason: collision with root package name */
    private final W1.h f322c;

    /* renamed from: C2.q0$a */
    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f323i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C0330q0 f324j;

        /* renamed from: C2.q0$a$a, reason: collision with other inner class name */
        static final class C0006a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C0330q0 f325i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0006a(C0330q0 c0330q0) {
                super(1);
                this.f325i = c0330q0;
            }

            public final void a(A2.a buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.h(this.f325i.f321b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((A2.a) obj);
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, C0330q0 c0330q0) {
            super(0);
            this.f323i = str;
            this.f324j = c0330q0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final A2.f invoke() {
            return A2.i.c(this.f323i, k.d.f102a, new A2.f[0], new C0006a(this.f324j));
        }
    }

    public C0330q0(String serialName, Object objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f320a = objectInstance;
        this.f321b = CollectionsKt.emptyList();
        this.f322c = W1.i.a(W1.l.f9607c, new a(serialName, this));
    }

    @Override // y2.InterfaceC3526a
    public Object deserialize(B2.e decoder) {
        int t4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        A2.f descriptor = getDescriptor();
        B2.c b4 = decoder.b(descriptor);
        if (b4.v() || (t4 = b4.t(getDescriptor())) == -1) {
            Unit unit = Unit.f41027a;
            b4.c(descriptor);
            return this.f320a;
        }
        throw new C3534i("Unexpected index " + t4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return (A2.f) this.f322c.getValue();
    }

    @Override // y2.InterfaceC3535j
    public void serialize(B2.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }
}
