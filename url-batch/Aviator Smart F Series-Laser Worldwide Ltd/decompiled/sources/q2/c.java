package q2;

import com.crrepa.band.my.health.base.f;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends f {
    public void uploadHeartRate(int i8) {
        Map<String, String> baseRequest;
        if (i8 > 0 && (baseRequest = getBaseRequest()) != null) {
            baseRequest.put("hr", String.valueOf(i8));
            com.crrepa.band.my.profile.b.getInstance().getApiStores().uploadBandHeartRate(baseRequest).subscribeOn(Schedulers.io()).subscribe();
        }
    }
}
