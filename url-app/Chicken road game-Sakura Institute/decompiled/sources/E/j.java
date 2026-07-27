package E;

import G.InterfaceC0191c0;
import s0.C1166s;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends M2.r {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2199n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, int i4, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i2);
        this.f2199n = i4;
    }

    @Override // S2.c
    public final Object get() {
        switch (this.f2199n) {
            case 0:
                return ((InterfaceC0191c0) this.f3591e).getValue();
            default:
                return ((C1166s) this.f3591e).getLayoutDirection();
        }
    }
}
