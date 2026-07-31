package G;

import I.InterfaceC0142c0;
import l2.InterfaceC0600a;
import l2.InterfaceC0602c;
import u0.C1123s;

/* loaded from: classes.dex */
public final /* synthetic */ class o extends f2.m implements InterfaceC0602c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2015k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i3, int i4, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i3);
        this.f2015k = i4;
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
        switch (this.f2015k) {
            case 0:
                return ((InterfaceC0142c0) this.f5813e).getValue();
            default:
                return ((C1123s) this.f5813e).getLayoutDirection();
        }
    }
}
