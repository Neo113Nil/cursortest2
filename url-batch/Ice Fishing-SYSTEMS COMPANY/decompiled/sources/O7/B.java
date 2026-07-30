package O7;

import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public class B extends AbstractC0376a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2548w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(InterfaceC5138i interfaceC5138i, boolean z8, int i) {
        super(interfaceC5138i, z8);
        this.f2548w = i;
    }

    @Override // O7.h0
    public boolean D(Throwable th) {
        switch (this.f2548w) {
            case 1:
                AbstractC0399y.l(th, this.f2578v);
                return true;
            default:
                return super.D(th);
        }
    }
}
