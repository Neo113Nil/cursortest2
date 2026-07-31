package F;

import l2.InterfaceC0600a;
import l2.InterfaceC0602c;

/* loaded from: classes.dex */
public final /* synthetic */ class P0 extends f2.p implements InterfaceC0602c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1310k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(int i3, int i4, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i3);
        this.f1310k = i4;
    }

    @Override // f2.b
    public final InterfaceC0600a a() {
        f2.v.f5833a.getClass();
        return this;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        return get();
    }

    @Override // l2.InterfaceC0602c
    public final Object get() {
        switch (this.f1310k) {
            case 0:
                return ((I.W0) this.f5813e).getValue();
            case 1:
                return ((I.W0) this.f5813e).getValue();
            default:
                return this.f5813e.getClass().getSimpleName();
        }
    }
}
