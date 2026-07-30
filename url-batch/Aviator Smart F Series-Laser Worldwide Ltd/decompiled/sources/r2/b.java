package r2;

import com.crrepa.band.my.model.db.OnceHeartRate;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface b {
    void measureComplete();

    void renderLast7TimesOnceHeartRate(List<Float> list, Date[] dateArr);

    void renderOnceHeartRate(OnceHeartRate onceHeartRate);
}
