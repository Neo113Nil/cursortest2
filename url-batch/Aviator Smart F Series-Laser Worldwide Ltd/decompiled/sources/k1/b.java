package k1;

import com.crrepa.band.my.model.PillReminderTimeModel;
import com.crrepa.band.my.model.db.PillReminder;
import com.crrepa.ble.conn.bean.CRPPillReminderInfo;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    private b() {
    }

    private static int getDateOffset(int i8, Date date) {
        if (i8 == 1) {
            return 0;
        }
        return m.getDaySpace(date, new Date()) % i8;
    }

    public static CRPPillReminderInfo toCRPPillReminderInfo(PillReminder pillReminder) {
        CRPPillReminderInfo cRPPillReminderInfo = new CRPPillReminderInfo();
        cRPPillReminderInfo.setId(pillReminder.getIndex().intValue());
        cRPPillReminderInfo.setName(pillReminder.getName());
        int intValue = pillReminder.getRepeat().intValue();
        cRPPillReminderInfo.setRepeat(intValue);
        cRPPillReminderInfo.setDateOffset(getDateOffset(intValue, pillReminder.getDate()));
        ArrayList arrayList = new ArrayList();
        List<PillReminderTimeModel> json2List = s.json2List(pillReminder.getReminderTime(), PillReminderTimeModel[].class);
        if (json2List == null) {
            return null;
        }
        for (PillReminderTimeModel pillReminderTimeModel : json2List) {
            arrayList.add(new CRPPillReminderInfo.ReminderTimeBean(pillReminderTimeModel.getTime(), pillReminderTimeModel.getCount()));
        }
        cRPPillReminderInfo.setReminderTimeList(arrayList);
        return cRPPillReminderInfo;
    }
}
