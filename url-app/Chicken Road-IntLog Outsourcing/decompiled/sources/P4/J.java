package P4;

import java.util.ArrayList;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0142v f2333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(C0142v c0142v, int i2) {
        super(0);
        this.f2332e = i2;
        this.f2333f = c0142v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f4.e, java.lang.Object] */
    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        C0142v c0142v = this.f2333f;
        switch (this.f2332e) {
            case 0:
                return Integer.valueOf(I.c(c0142v, (N4.e[]) c0142v.f2408g.getValue()));
            case 1:
                C0143w c0143w = c0142v.f2403b;
                return c0143w != null ? new M4.a[]{(M4.a) c0143w.f2412b} : I.f2331b;
            default:
                return I.b(c0142v.f2403b != null ? new ArrayList(0) : null);
        }
    }
}
