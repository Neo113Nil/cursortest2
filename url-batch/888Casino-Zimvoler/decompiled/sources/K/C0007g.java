package K;

import k0.AbstractC0190m;
import k0.InterfaceC0188k;
import k0.InterfaceC0189l;

/* renamed from: K.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0007g implements K0.E, InterfaceC0189l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f410f;

    public /* synthetic */ C0007g(int i) {
        this.f410f = i;
    }

    @Override // k0.InterfaceC0189l
    public void a(InterfaceC0188k interfaceC0188k, AbstractC0190m abstractC0190m) {
        switch (this.f410f) {
            case 4:
                interfaceC0188k.f(abstractC0190m);
                break;
            case 5:
                interfaceC0188k.b(abstractC0190m);
                break;
            case 6:
                interfaceC0188k.e(abstractC0190m);
                break;
            case 7:
                interfaceC0188k.a();
                break;
            default:
                interfaceC0188k.c();
                break;
        }
    }
}
