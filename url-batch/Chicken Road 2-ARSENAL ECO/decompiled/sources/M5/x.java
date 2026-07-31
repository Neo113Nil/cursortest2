package M5;

import H5.o0;
import com.onesignal.inAppMessages.internal.display.impl.a;
import o5.InterfaceC0567g;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements InterfaceC0747p {

    /* renamed from: g, reason: collision with root package name */
    public static final x f1627g;

    /* renamed from: h, reason: collision with root package name */
    public static final x f1628h;

    /* renamed from: i, reason: collision with root package name */
    public static final x f1629i;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1630f;

    static {
        int i7 = 2;
        f1627g = new x(i7, 0);
        f1628h = new x(i7, 1);
        f1629i = new x(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i7, int i8) {
        super(i7);
        this.f1630f = i8;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1630f) {
            case 0:
                InterfaceC0567g interfaceC0567g = (InterfaceC0567g) obj2;
                if (!(interfaceC0567g instanceof o0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC0567g : Integer.valueOf(intValue + 1);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                o0 o0Var = (o0) obj;
                InterfaceC0567g interfaceC0567g2 = (InterfaceC0567g) obj2;
                if (o0Var != null) {
                    return o0Var;
                }
                if (interfaceC0567g2 instanceof o0) {
                    return (o0) interfaceC0567g2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
