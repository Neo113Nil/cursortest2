package m;

import B1.C0097d;
import b0.C0494b;
import b0.C0500h;
import b0.InterfaceC0496d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import w2.C1294c;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845s extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z.S f8176e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8177i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f8178j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f8179k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f8180l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8181m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0500h f8182n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0845s(boolean z4, Z.S s4, long j4, float f4, float f5, long j5, long j6, C0500h c0500h) {
        super(1);
        this.f8175d = z4;
        this.f8176e = s4;
        this.f8177i = j4;
        this.f8178j = f4;
        this.f8179k = f5;
        this.f8180l = j5;
        this.f8181m = j6;
        this.f8182n = c0500h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r0.G g4 = (r0.G) obj;
        g4.a();
        if (this.f8175d) {
            InterfaceC0496d.F(g4, this.f8176e, 0L, 0L, this.f8177i, null, 246);
        } else {
            long j4 = this.f8177i;
            float b4 = Y.a.b(j4);
            float f4 = this.f8178j;
            if (b4 < f4) {
                float f5 = this.f8179k;
                C0494b c0494b = g4.f9624d;
                float d4 = Y.f.d(c0494b.h());
                float f6 = this.f8179k;
                float f7 = d4 - f6;
                float b5 = Y.f.b(c0494b.h()) - f6;
                Z.S s4 = this.f8176e;
                long j5 = this.f8177i;
                C0097d c0097d = c0494b.f5603e;
                long s5 = c0097d.s();
                c0097d.k().g();
                try {
                    ((C0097d) ((C1294c) c0097d.f987e).f11388d).k().p(f5, f5, f7, b5, 0);
                    InterfaceC0496d.F(g4, s4, 0L, 0L, j5, null, 246);
                } finally {
                    c0097d.k().b();
                    c0097d.G(s5);
                }
            } else {
                InterfaceC0496d.F(g4, this.f8176e, this.f8180l, this.f8181m, u3.d.T(f4, j4), this.f8182n, 208);
            }
        }
        return Unit.f7487a;
    }
}
