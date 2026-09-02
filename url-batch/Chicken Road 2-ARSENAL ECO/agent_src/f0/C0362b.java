package f0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import g0.InterfaceC0390a;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final C0362b f4168h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0362b f4169i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0362b f4170j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0362b f4171k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0362b f4172l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0362b f4173m;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4174f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4175g;

    static {
        int i7 = 0;
        f4168h = new C0362b("NONE", i7);
        f4169i = new C0362b("FULL", i7);
        int i8 = 1;
        f4170j = new C0362b("FLAT", i8);
        f4171k = new C0362b("HALF_OPENED", i8);
        int i9 = 2;
        f4172l = new C0362b("FOLD", i9);
        f4173m = new C0362b("HINGE", i9);
    }

    public /* synthetic */ C0362b(String str, int i7) {
        this.f4174f = i7;
        this.f4175g = str;
    }

    public String toString() {
        switch (this.f4174f) {
            case 0:
                return (String) this.f4175g;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return (String) this.f4175g;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return (String) this.f4175g;
            default:
                return super.toString();
        }
    }

    public C0362b(InterfaceC0390a interfaceC0390a) {
        this.f4174f = 3;
        int i7 = m.f4197b;
        this.f4175g = interfaceC0390a;
    }
}
