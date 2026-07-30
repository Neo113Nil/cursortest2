package m2;

import com.crrepa.band.my.model.db.OnceTemp;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void measureComplete();

    void renderLast7TimesOnceTemp(List<Float> list, Date[] dateArr);

    void renderOnceTemp(OnceTemp onceTemp);
}
