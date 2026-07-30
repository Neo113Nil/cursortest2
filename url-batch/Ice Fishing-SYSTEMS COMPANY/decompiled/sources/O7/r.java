package O7;

import v7.InterfaceC5136g;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.i implements E7.p {

    /* renamed from: u, reason: collision with root package name */
    public static final r f2621u = new r(2, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final r f2622v = new r(2, 1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2623n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i4) {
        super(i);
        this.f2623n = i4;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2623n) {
            case 0:
                return ((InterfaceC5138i) obj).n((InterfaceC5136g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC5138i) obj).n((InterfaceC5136g) obj2);
        }
    }
}
