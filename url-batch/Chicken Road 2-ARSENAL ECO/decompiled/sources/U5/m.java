package U5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.j implements InterfaceC0732a {

    /* renamed from: g, reason: collision with root package name */
    public static final m f2652g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f2653h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f2654i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f2655j;

    /* renamed from: k, reason: collision with root package name */
    public static final m f2656k;

    /* renamed from: l, reason: collision with root package name */
    public static final m f2657l;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2658f;

    static {
        int i7 = 0;
        f2652g = new m(i7, 0);
        f2653h = new m(i7, 1);
        f2654i = new m(i7, 2);
        f2655j = new m(i7, 3);
        f2656k = new m(i7, 4);
        f2657l = new m(i7, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, int i8) {
        super(i7);
        this.f2658f = i8;
    }

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        switch (this.f2658f) {
            case 0:
                return C.f2631b;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return v.f2671b;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return s.f2668b;
            case 3:
                return z.f2677b;
            case 4:
                return g.f2643b;
            default:
                return v.f2670a;
        }
    }
}
