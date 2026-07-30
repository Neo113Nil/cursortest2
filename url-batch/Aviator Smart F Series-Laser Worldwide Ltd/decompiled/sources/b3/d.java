package b3;

import com.baidu.platform.comapi.map.MapBundleKey;
import com.crrepa.band.my.health.base.f;
import com.crrepa.band.my.model.db.Step;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;

/* loaded from: classes2.dex */
public class d extends f {
    public void uploadSteps(Step step) {
        Map<String, String> baseRequest;
        if (step == null || System.currentTimeMillis() - this.lastUploadTime < 600000 || (baseRequest = getBaseRequest()) == null) {
            return;
        }
        baseRequest.put("steps", step.getSteps().toString());
        baseRequest.put("cal", step.getCalory().toString());
        baseRequest.put(MapBundleKey.MapObjKey.OBJ_DIS, step.getDistance().toString());
        com.crrepa.band.my.profile.b.getInstance().getApiStores().uploadBandSteps(baseRequest).subscribeOn(Schedulers.io()).subscribe();
        this.lastUploadTime = System.currentTimeMillis();
    }
}
