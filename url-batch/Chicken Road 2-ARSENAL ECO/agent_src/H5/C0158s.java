package H5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import o5.InterfaceC0567g;
import o5.InterfaceC0569i;
import x5.InterfaceC0747p;

/* renamed from: H5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158s extends kotlin.jvm.internal.j implements InterfaceC0747p {

    /* renamed from: g, reason: collision with root package name */
    public static final C0158s f1096g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0158s f1097h;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1098f;

    static {
        int i7 = 2;
        f1096g = new C0158s(i7, 0);
        f1097h = new C0158s(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0158s(int i7, int i8) {
        super(i7);
        this.f1098f = i8;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1098f) {
            case 0:
                return ((InterfaceC0569i) obj).v((InterfaceC0567g) obj2);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC0569i) obj).v((InterfaceC0567g) obj2);
        }
    }
}
