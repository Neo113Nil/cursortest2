package x3;

import com.crrepa.band.my.model.net.TrainingRecordsEntity;
import java.util.List;

/* loaded from: classes3.dex */
public interface b {
    void renderMaxTimePerDay(boolean z7, String str);

    void renderTotalCalories(String str);

    void renderTotalTimes(String str);

    void renderTotalTrainingTime(String str);

    void renderTrainingList(List<TrainingRecordsEntity> list);
}
