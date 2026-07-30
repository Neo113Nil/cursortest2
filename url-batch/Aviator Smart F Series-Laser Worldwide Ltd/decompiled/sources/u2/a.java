package u2;

import com.crrepa.band.my.model.db.Hrv;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void measureComplete();

    void renderHistoryHrv(int i8, List<Float> list, Date[] dateArr);

    void renderHrv(Hrv hrv);
}
