package g2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements InterfaceC0410f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4853a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4854b;

    /* renamed from: c, reason: collision with root package name */
    public final Z1.j f4855c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(InterfaceC0410f interfaceC0410f, Y1.c cVar, int i3) {
        this.f4853a = i3;
        switch (i3) {
            case 1:
                this.f4854b = interfaceC0410f;
                this.f4855c = (Z1.j) cVar;
                break;
            default:
                this.f4854b = interfaceC0410f;
                this.f4855c = (Z1.j) cVar;
                break;
        }
    }

    @Override // g2.InterfaceC0410f
    public final Iterator iterator() {
        switch (this.f4853a) {
            case 0:
                return new C0409e(this);
            case 1:
                return new m(this);
            default:
                return new O.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(Y1.a aVar, Y1.c cVar) {
        this.f4853a = 2;
        Z1.i.f(cVar, "getNextValue");
        this.f4855c = (Z1.j) aVar;
        this.f4854b = cVar;
    }
}
