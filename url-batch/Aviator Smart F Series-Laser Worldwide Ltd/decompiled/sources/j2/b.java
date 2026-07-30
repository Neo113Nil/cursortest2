package j2;

import com.crrepa.band.my.health.base.f;
import com.crrepa.band.my.model.db.BloodPressure;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;

/* loaded from: classes2.dex */
public class b extends f {
    public void uploadBloodPressure(BloodPressure bloodPressure) {
        Map<String, String> baseRequest;
        if (bloodPressure == null || (baseRequest = getBaseRequest()) == null) {
            return;
        }
        baseRequest.put("sbp", bloodPressure.getSbp().toString());
        baseRequest.put("dbp", bloodPressure.getDbp().toString());
        com.crrepa.band.my.profile.b.getInstance().getApiStores().uploadBandBloodPressure(baseRequest).subscribeOn(Schedulers.io()).subscribe();
    }
}
