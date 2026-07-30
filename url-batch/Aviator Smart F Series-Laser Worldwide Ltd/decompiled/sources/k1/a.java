package k1;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.PillReminderTimeModel;
import com.crrepa.band.my.model.db.PillReminder;
import com.crrepa.band.my.model.db.proxy.PillReminderDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements f {
    private static final int MAX_REMINDER_REPEAT = 30;
    private static final int MAX_REMINDER_TIMES = 8;
    private static final int MAX_REMINDER_TIME_HOUR = 18;
    private static final int MIN_REMINDER_REPEAT = 1;
    private static final int MIN_REMINDER_TIMES = 1;
    private static final int MIN_REMINDER_TIME_HOUR = 7;
    private static final int REMINDER_REPEAT_UNIT = 1;
    private static final int REMINDER_TIMES_UNIT = 1;
    private PillReminderDaoProxy pillReminderDaoProxy = new PillReminderDaoProxy();
    private l1.a view;

    private List<PillReminderTimeModel> getDefaultPillReminderTimeList(int i8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PillReminderTimeModel(TypedValues.CycleType.TYPE_EASING, 1));
        if (1 < i8) {
            int i9 = 660 / (i8 - 1);
            for (int i10 = 1; i10 < i8; i10++) {
                arrayList.add(new PillReminderTimeModel((i9 * i10) + TypedValues.CycleType.TYPE_EASING, 1));
            }
        }
        return arrayList;
    }

    public void deleteReminder(long j8) {
        PillReminder pillReminder = this.pillReminderDaoProxy.get(j8);
        if (pillReminder == null) {
            return;
        }
        i4.getInstance().deletePillReminder(pillReminder.getIndex().intValue());
        this.pillReminderDaoProxy.delete(pillReminder);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getPillReminder(long j8) {
        int i8;
        int i9;
        List<PillReminderTimeModel> list = null;
        PillReminder pillReminder = 0 <= j8 ? this.pillReminderDaoProxy.get(j8) : null;
        if (pillReminder != null) {
            this.view.renderDeleteReminder();
            this.view.renderPillName(pillReminder.getName());
            i8 = pillReminder.getRepeat().intValue() - 1;
            i9 = pillReminder.getTimes().intValue();
            list = s.json2List(pillReminder.getReminderTime(), PillReminderTimeModel[].class);
        } else {
            i8 = 0;
            i9 = 1;
        }
        this.view.renderReminderRepeat(1, 30, 1, i8);
        this.view.renderReminderTimes(1, 8, 1, i9 - 1);
        if (list == null) {
            list = getDefaultPillReminderTimeList(i9);
        }
        this.view.renderReminderTime(list);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveReminder(PillReminder pillReminder, long j8) {
        int i8;
        PillReminder pillReminder2;
        com.orhanobut.logger.f.d("saveReminder id: " + j8);
        pillReminder.setEnable(Boolean.TRUE);
        int intValue = pillReminder.getRepeat().intValue();
        if (0 > j8 || (pillReminder2 = this.pillReminderDaoProxy.get(j8)) == null) {
            i8 = -1;
        } else {
            pillReminder.setId(pillReminder2.getId());
            i8 = pillReminder2.getIndex().intValue();
            if (intValue == pillReminder2.getRepeat().intValue()) {
                pillReminder.setDate(pillReminder2.getDate());
            }
        }
        if (pillReminder.getDate() == null) {
            pillReminder.setDate(new Date());
        }
        com.orhanobut.logger.f.d("saveReminder date: " + pillReminder.getDate());
        if (i8 < 0) {
            i8 = this.pillReminderDaoProxy.getNextPillReminderIndex();
        }
        if (i8 >= 0) {
            com.orhanobut.logger.f.d("saveReminder reminderIndex: " + i8);
            pillReminder.setIndex(Integer.valueOf(i8));
            this.pillReminderDaoProxy.save(pillReminder);
            i4.getInstance().sendPillReminder(b.toCRPPillReminderInfo(pillReminder));
        }
    }

    public void setView(l1.a aVar) {
        this.view = aVar;
    }

    public void updateReminderTimes(int i8) {
        this.view.renderReminderTime(getDefaultPillReminderTimeList(i8));
    }
}
