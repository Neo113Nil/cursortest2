package x2;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface b {
    void renderLastMenstrualDate(Date date);

    void renderMenstrualPeriod(String str);

    void renderPhysiologicalCycle(String str);

    void renderSelectedLastMenstrualDate(Date date);

    void renderSelectedMenstrualPeriod(List<Integer> list, int i8);

    void renderSelectedPhysiologicalCycle(List<Integer> list, int i8);
}
