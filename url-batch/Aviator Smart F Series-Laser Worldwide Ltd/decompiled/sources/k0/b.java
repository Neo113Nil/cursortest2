package k0;

import com.crrepa.band.my.model.band.provider.BandTimingBloodOxygenProvider;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.ble.conn.bean.CRPBloodOxygenInfo;
import com.crrepa.ble.conn.type.CRPBloodOxygenTimeType;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    private b() {
    }

    public static TimingBloodOxygen convertTimingBloodOxygen(CRPBloodOxygenInfo cRPBloodOxygenInfo) {
        if (cRPBloodOxygenInfo == null) {
            return null;
        }
        List<Integer> list = cRPBloodOxygenInfo.getList();
        CRPBloodOxygenTimeType type = cRPBloodOxygenInfo.getType();
        List<Integer> formatTimingBloodOxygen = formatTimingBloodOxygen(list, type);
        if (formatTimingBloodOxygen == null) {
            return null;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (Integer num : formatTimingBloodOxygen) {
            if (num.intValue() > 0) {
                i9 += num.intValue();
                i8++;
                if (i10 == 0 || i10 < num.intValue()) {
                    i10 = num.intValue();
                }
                if (i11 == 0 || num.intValue() < i11) {
                    i11 = num.intValue();
                }
            }
        }
        int i12 = i8 != 0 ? i9 / i8 : 0;
        TimingBloodOxygen timingBloodOxygen = new TimingBloodOxygen();
        Date date = new Date();
        if (type == CRPBloodOxygenTimeType.YESTERDAY) {
            date = m.getDateOfOffsetDay(date, -1);
        }
        timingBloodOxygen.setDate(date);
        timingBloodOxygen.setBloodOxygen(s.bean2Json(formatTimingBloodOxygen));
        timingBloodOxygen.setAverage(i12);
        timingBloodOxygen.setMax(i10);
        timingBloodOxygen.setMin(i11);
        return timingBloodOxygen;
    }

    private static List<Integer> formatTimingBloodOxygen(List<Integer> list, CRPBloodOxygenTimeType cRPBloodOxygenTimeType) {
        int i8;
        int timingBloodOxygenInterval = BandTimingBloodOxygenProvider.getTimingBloodOxygenInterval();
        if (list == null || list.isEmpty() || timingBloodOxygenInterval == 0) {
            return null;
        }
        int i9 = timingBloodOxygenInterval * 5;
        int i10 = 1440 / i9;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int minuteOfDay = CRPBloodOxygenTimeType.TODAY == cRPBloodOxygenTimeType ? m.getMinuteOfDay(new Date()) / i9 : i10;
        for (int i11 = 0; i11 < list.size() && minuteOfDay > (i8 = i11 / timingBloodOxygenInterval); i11++) {
            int intValue = list.get(i11).intValue();
            if (intValue > 0) {
                iArr[i8] = iArr[i8] + intValue;
                iArr2[i8] = iArr2[i8] + 1;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr2[i12];
            if (i13 == 0) {
                arrayList.add(0);
            } else {
                arrayList.add(Integer.valueOf(iArr[i12] / i13));
            }
        }
        return arrayList;
    }
}
