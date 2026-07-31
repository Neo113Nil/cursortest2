package H1;

import android.content.Intent;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.logging.Logger;

/* renamed from: H1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0134h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f961i;

    public /* synthetic */ RunnableC0134h(I0.a aVar, D0.j jVar, B1.g gVar, D0.i iVar) {
        this.f958f = 1;
        this.f959g = aVar;
        this.f960h = jVar;
        this.f961i = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f958f) {
            case 0:
                AbstractServiceC0135i abstractServiceC0135i = (AbstractServiceC0135i) this.f959g;
                Intent intent = (Intent) this.f960h;
                k1.h hVar = (k1.h) this.f961i;
                try {
                    abstractServiceC0135i.b(intent);
                    return;
                } finally {
                    hVar.a(null);
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                I0.a aVar = (I0.a) this.f959g;
                D0.j jVar = (D0.j) this.f960h;
                String str = jVar.f342a;
                D0.i iVar = (D0.i) this.f961i;
                aVar.getClass();
                Logger logger = I0.a.f1160f;
                try {
                    E0.f a7 = aVar.f1163c.a(str);
                    if (a7 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((K0.h) aVar.f1165e).m(new r(aVar, jVar, ((B0.e) a7).a(iVar), 1));
                    }
                    return;
                } catch (Exception e4) {
                    logger.warning("Error scheduling event " + e4.getMessage());
                    return;
                }
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                U4.b bVar = (U4.b) this.f959g;
                O4.c cVar = (O4.c) this.f960h;
                O4.c cVar2 = (O4.c) this.f961i;
                bVar.f2615r = false;
                O4.c shutdown = bVar.f2606i.shutdown();
                shutdown.f(new RunnableC0134h(cVar, shutdown, cVar2, 3));
                return;
            case 3:
                O4.c cVar3 = (O4.c) this.f959g;
                O4.c cVar4 = (O4.c) this.f960h;
                O4.c cVar5 = (O4.c) this.f961i;
                if (cVar3.b() && cVar4.b()) {
                    cVar5.e();
                    return;
                } else {
                    cVar5.a(null);
                    return;
                }
            default:
                com.onesignal.core.internal.application.impl.a.decorViewReady$lambda$1((com.onesignal.core.internal.application.impl.a) this.f959g, (Runnable) this.f960h, (com.onesignal.core.internal.application.impl.a) this.f961i);
                return;
        }
    }

    public /* synthetic */ RunnableC0134h(Object obj, Object obj2, Object obj3, int i7) {
        this.f958f = i7;
        this.f959g = obj;
        this.f960h = obj2;
        this.f961i = obj3;
    }
}
