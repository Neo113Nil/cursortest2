package w3;

import com.onesignal.common.modeling.l;
import com.onesignal.inAppMessages.internal.display.impl.n;
import f2.InterfaceC0365b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public class e extends l {

    public static final class a extends j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final d invoke() {
            return new d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC0365b prefs) {
        super(a.INSTANCE, "subscriptions", prefs);
        i.e(prefs, "prefs");
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public void replaceAll(List<d> models, String tag) {
        i.e(models, "models");
        i.e(tag, "tag");
        if (!tag.equals("HYDRATE")) {
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.k
    public JSONObject transformJsonForPersistence(d model, JSONObject json) {
        i.e(model, "model");
        i.e(json, "json");
        String optString = json.optString(n.EVENT_TYPE_KEY, "");
        i.b(optString);
        if (optString.length() != 0 && !optString.equals(g.PUSH.toString())) {
            String optString2 = json.optString("address", "");
            i.b(optString2);
            if (optString2.length() > 0) {
                com.onesignal.common.j jVar = com.onesignal.common.j.INSTANCE;
                if (!jVar.isHashed(optString2)) {
                    json.put("address", jVar.hash(optString2));
                }
            }
        }
        return json;
    }
}
