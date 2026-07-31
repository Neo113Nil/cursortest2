package m1;

import H5.S;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Executor;
import o1.InterfaceC0555a;
import o1.InterfaceC0556b;
import o1.InterfaceC0557c;
import p1.o;

/* loaded from: classes.dex */
public final class h implements p1.c {

    /* renamed from: g, reason: collision with root package name */
    public static final h f5434g = new h(0);

    /* renamed from: h, reason: collision with root package name */
    public static final h f5435h = new h(1);

    /* renamed from: i, reason: collision with root package name */
    public static final h f5436i = new h(2);

    /* renamed from: j, reason: collision with root package name */
    public static final h f5437j = new h(3);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5438f;

    public /* synthetic */ h(int i7) {
        this.f5438f = i7;
    }

    @Override // p1.c
    public final Object b(A.e eVar) {
        switch (this.f5438f) {
            case 0:
                Object e4 = eVar.e(new o(InterfaceC0555a.class, Executor.class));
                kotlin.jvm.internal.i.d(e4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e4);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Object e7 = eVar.e(new o(InterfaceC0557c.class, Executor.class));
                kotlin.jvm.internal.i.d(e7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e7);
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                Object e8 = eVar.e(new o(InterfaceC0556b.class, Executor.class));
                kotlin.jvm.internal.i.d(e8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e8);
            default:
                Object e9 = eVar.e(new o(o1.d.class, Executor.class));
                kotlin.jvm.internal.i.d(e9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e9);
        }
    }
}
