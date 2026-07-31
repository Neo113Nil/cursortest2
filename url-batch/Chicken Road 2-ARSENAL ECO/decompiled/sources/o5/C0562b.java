package o5;

import x5.InterfaceC0747p;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0562b implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5616f;

    public /* synthetic */ C0562b(int i7) {
        this.f5616f = i7;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        C0563c c0563c;
        switch (this.f5616f) {
            case 0:
                String acc = (String) obj;
                InterfaceC0567g element = (InterfaceC0567g) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC0569i acc2 = (InterfaceC0569i) obj;
                InterfaceC0567g element2 = (InterfaceC0567g) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                InterfaceC0569i y = acc2.y(element2.getKey());
                C0570j c0570j = C0570j.f5620f;
                if (y == c0570j) {
                    return element2;
                }
                C0565e c0565e = C0565e.f5619f;
                InterfaceC0566f interfaceC0566f = (InterfaceC0566f) y.m(c0565e);
                if (interfaceC0566f == null) {
                    c0563c = new C0563c(element2, y);
                } else {
                    InterfaceC0569i y6 = y.y(c0565e);
                    if (y6 == c0570j) {
                        return new C0563c(interfaceC0566f, element2);
                    }
                    c0563c = new C0563c(interfaceC0566f, new C0563c(element2, y6));
                }
                return c0563c;
        }
    }
}
