package l1;

import com.crrepa.band.my.model.PillReminderTimeModel;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderDeleteReminder();

    void renderPillName(String str);

    void renderReminderRepeat(int i8, int i9, int i10, int i11);

    void renderReminderTime(List<PillReminderTimeModel> list);

    void renderReminderTimes(int i8, int i9, int i10, int i11);
}
