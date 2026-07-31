package C4;

import D4.m;
import D4.q;
import D4.r;
import com.onesignal.inAppMessages.internal.display.impl.a;
import g5.C0398a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Supplier {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f212f;

    public /* synthetic */ d(int i7) {
        this.f212f = i7;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f212f) {
            case 0:
                return Collections.EMPTY_MAP;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                U3.d dVar = U3.c.f2599c;
                if (dVar == null) {
                    synchronized (U3.c.f2598b) {
                        try {
                            dVar = U3.c.f2599c;
                            if (dVar == null) {
                                dVar = U3.c.a();
                                if (dVar == null) {
                                    dVar = U3.a.f2595f;
                                    U3.c.b(dVar);
                                }
                            }
                        } finally {
                        }
                    }
                }
                return dVar.a();
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new IdentityHashMap();
            case 3:
                return new ArrayList();
            case 4:
                return new m();
            case 5:
                return new m();
            case 6:
                return new r();
            case 7:
                return new r();
            case 8:
                return new q();
            case 9:
                return Double.valueOf(ThreadLocalRandom.current().nextDouble(0.8d, 1.2d));
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return R4.b.f2093b;
            case 11:
                return new R4.b(32000);
            default:
                return C0398a.f4286a;
        }
    }
}
