package Y3;

import com.onesignal.common.j;
import com.onesignal.common.modeling.l;
import com.onesignal.inAppMessages.internal.display.impl.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends l {

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
    public e(H2.b prefs) {
        super(a.INSTANCE, "subscriptions", prefs);
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public void replaceAll(List<d> models, String tag) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!Intrinsics.a(tag, "HYDRATE")) {
            super.replaceAll(models, tag);
            return;
        }
        synchronized (models) {
            try {
                Iterator<d> it = models.iterator();
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
                super.replaceAll(models, tag);
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.k
    public JSONObject transformJsonForPersistence(d model, JSONObject json) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(json, "json");
        String optString = json.optString(m.EVENT_TYPE_KEY, "");
        Intrinsics.b(optString);
        if (optString.length() != 0 && !optString.equals(g.PUSH.toString())) {
            String optString2 = json.optString("address", "");
            Intrinsics.b(optString2);
            if (optString2.length() > 0) {
                j jVar = j.INSTANCE;
                if (!jVar.isHashed(optString2)) {
                    json.put("address", jVar.hash(optString2));
                }
            }
        }
        return json;
    }
}
