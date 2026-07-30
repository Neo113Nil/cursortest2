package z2;

import com.crrepa.band.my.model.db.Sleep;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;

/* loaded from: classes2.dex */
public class h extends com.crrepa.band.my.health.base.f {
    public void uploadSleep(Sleep sleep) {
        Map<String, String> baseRequest;
        if (sleep == null || System.currentTimeMillis() - this.lastUploadTime < 600000 || (baseRequest = getBaseRequest()) == null) {
            return;
        }
        baseRequest.put("deep", sleep.getDeep().toString());
        baseRequest.put("light", sleep.getShallow().toString());
        com.crrepa.band.my.profile.b.getInstance().getApiStores().uploadBandSleep(baseRequest).subscribeOn(Schedulers.io()).subscribe();
        this.lastUploadTime = System.currentTimeMillis();
    }
}
