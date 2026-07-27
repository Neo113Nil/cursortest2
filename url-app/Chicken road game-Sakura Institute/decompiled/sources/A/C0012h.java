package A;

import B1.C0097d;
import Z.C0310g;
import Z.C0316m;
import b0.C0494b;
import b0.InterfaceC0496d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import w2.C1294c;

/* renamed from: A.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012h extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f146e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0310g f147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0316m f148j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012h(Function0 function0, boolean z4, C0310g c0310g, C0316m c0316m) {
        super(1);
        this.f145d = function0;
        this.f146e = z4;
        this.f147i = c0310g;
        this.f148j = c0316m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r0.G g4 = (r0.G) obj;
        g4.a();
        if (((Boolean) this.f145d.invoke()).booleanValue()) {
            boolean z4 = this.f146e;
            C0316m c0316m = this.f148j;
            C0310g c0310g = this.f147i;
            if (z4) {
                C0494b c0494b = g4.f9624d;
                long w4 = c0494b.w();
                C0097d c0097d = c0494b.f5603e;
                long s4 = c0097d.s();
                c0097d.k().g();
                try {
                    ((C1294c) c0097d.f987e).n(-1.0f, 1.0f, w4);
                    InterfaceC0496d.C(g4, c0310g, c0316m);
                } finally {
                    c0097d.k().b();
                    c0097d.G(s4);
                }
            } else {
                InterfaceC0496d.C(g4, c0310g, c0316m);
            }
        }
        return Unit.f7487a;
    }
}
