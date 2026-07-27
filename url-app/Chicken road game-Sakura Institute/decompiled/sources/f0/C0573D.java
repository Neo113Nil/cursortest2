package f0;

import B1.C0097d;
import b0.InterfaceC0496d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import w2.C1294c;

/* renamed from: f0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573D extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0574E f6282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0573D(C0574E c0574e, int i2) {
        super(1);
        this.f6281d = i2;
        this.f6282e = c0574e;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6281d) {
            case 0:
                C0574E c0574e = this.f6282e;
                c0574e.f6285d = true;
                c0574e.f6287f.invoke();
                return Unit.f7487a;
            default:
                InterfaceC0496d interfaceC0496d = (InterfaceC0496d) obj;
                C0574E c0574e2 = this.f6282e;
                C0582c c0582c = c0574e2.f6283b;
                float f4 = c0574e2.f6292k;
                float f5 = c0574e2.f6293l;
                C0097d Y3 = interfaceC0496d.Y();
                long s4 = Y3.s();
                Y3.k().g();
                try {
                    ((C1294c) Y3.f987e).n(f4, f5, 0L);
                    c0582c.a(interfaceC0496d);
                    Y3.k().b();
                    Y3.G(s4);
                    return Unit.f7487a;
                } catch (Throwable th) {
                    Y3.k().b();
                    Y3.G(s4);
                    throw th;
                }
        }
    }
}
