package G1;

import A.e;
import H5.S;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import o1.InterfaceC0555a;
import o1.InterfaceC0556b;
import o1.InterfaceC0557c;
import o1.d;
import p1.c;
import p1.o;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final a f833g = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final a f834h = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f835i = new a(2);

    /* renamed from: j, reason: collision with root package name */
    public static final a f836j = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f837f;

    public /* synthetic */ a(int i7) {
        this.f837f = i7;
    }

    @Override // p1.c
    public final Object b(e eVar) {
        switch (this.f837f) {
            case 0:
                Object e4 = eVar.e(new o(InterfaceC0555a.class, Executor.class));
                i.d(e4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e4);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Object e7 = eVar.e(new o(InterfaceC0557c.class, Executor.class));
                i.d(e7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e7);
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                Object e8 = eVar.e(new o(InterfaceC0556b.class, Executor.class));
                i.d(e8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e8);
            default:
                Object e9 = eVar.e(new o(d.class, Executor.class));
                i.d(e9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e9);
        }
    }
}
