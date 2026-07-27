package D4;

import k4.InterfaceC1221g;
import k4.InterfaceC1223i;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.j implements InterfaceC1445p {

    /* renamed from: f, reason: collision with root package name */
    public static final r f530f = new r(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final r f531g = new r(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i2, int i3) {
        super(i2);
        this.f532e = i3;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f532e) {
            case 0:
                return ((InterfaceC1223i) obj).A((InterfaceC1221g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC1223i) obj).A((InterfaceC1221g) obj2);
        }
    }
}
