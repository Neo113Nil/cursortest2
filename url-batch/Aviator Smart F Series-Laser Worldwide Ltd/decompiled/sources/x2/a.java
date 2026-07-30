package x2;

import com.haibin.calendarview.Calendar;
import java.util.Map;

/* loaded from: classes2.dex */
public interface a {
    void hidePhysiologcalPhase();

    void hidePregnancyChance();

    void renderDescription(String str);

    void renderLastMonth(int i8, int i9);

    void renderNextMonth(int i8, int i9);

    void renderPhysiologcalPeriod(Map<String, Calendar> map);

    void renderPhysiologcalPhase(String str);

    void renderPregnancyChance(String str);

    void renderTitleYearMonth(String str);
}
