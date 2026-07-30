package g2;

import com.crrepa.band.my.health.base.f;
import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.profile.b;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;

/* loaded from: classes2.dex */
public class a extends f {
    public void uploadBloodPressure(BloodOxygen bloodOxygen) {
        Map<String, String> baseRequest;
        if (bloodOxygen == null || (baseRequest = getBaseRequest()) == null) {
            return;
        }
        baseRequest.put("spo2", bloodOxygen.getBloodOxygen().toString());
        b.getInstance().getApiStores().uploadBandBloodOxygen(baseRequest).subscribeOn(Schedulers.io()).subscribe();
    }
}
