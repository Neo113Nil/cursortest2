package dd;

import com.onesignal.common.modeling.l;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class e extends l {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            return new d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qa.b bVar) {
        super(a.INSTANCE, "subscriptions", bVar);
        bVar.getClass();
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public void replaceAll(List<d> list, String str) {
        list.getClass();
        str.getClass();
        if (!Intrinsics.a(str, "HYDRATE")) {
            super.replaceAll(list, str);
            return;
        }
        synchronized (list) {
            try {
                Iterator<d> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    d next = it.next();
                    if (next.getType() == g.PUSH) {
                        d dVar = (d) get(next.getId());
                        if (dVar != null) {
                            next.setSdk(dVar.getSdk());
                            next.setDeviceOS(dVar.getDeviceOS());
                            next.setCarrier(dVar.getCarrier());
                            next.setAppVersion(dVar.getAppVersion());
                            next.setStatus(dVar.getStatus());
                        }
                    }
                }
                super.replaceAll(list, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
