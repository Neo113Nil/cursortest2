package h4;

import com.crrepa.ble.conn.bean.CRPSleepInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16788a = 70;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16789b = 90;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16790c = 18;

    private static int a(int i8, int i9) {
        int i10 = i8 % 3;
        return i9 == 0 ? i10 + 18 : i9 + i10;
    }

    public static CRPSleepInfo a(CRPSleepInfo cRPSleepInfo) {
        int i8;
        if (cRPSleepInfo != null && cRPSleepInfo.getDetails() != null && !cRPSleepInfo.getDetails().isEmpty()) {
            List<CRPSleepInfo.DetailBean> details = cRPSleepInfo.getDetails();
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            int i10 = 70;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < details.size(); i13++) {
                CRPSleepInfo.DetailBean detailBean = details.get(i13);
                int totalTime = detailBean.getTotalTime();
                i11 += totalTime;
                if (i13 != 0) {
                    int type = detailBean.getType();
                    int type2 = details.get(i13 - 1).getType();
                    if (type == 1 && type2 == 2 && (i8 = i11 - totalTime) >= i10) {
                        i12 = a(i8, i12);
                        if (totalTime <= i12) {
                            detailBean.setType(3);
                        } else {
                            int startTime = detailBean.getStartTime();
                            int i14 = startTime + i12;
                            CRPSleepInfo.DetailBean detailBean2 = new CRPSleepInfo.DetailBean();
                            detailBean2.setStartTime(startTime);
                            detailBean2.setEndTime(i14);
                            detailBean2.setType(3);
                            detailBean2.setTotalTime(i12);
                            arrayList.add(detailBean2);
                            detailBean.setStartTime(i14);
                            detailBean.setTotalTime(detailBean.getTotalTime() - i12);
                        }
                        arrayList.add(detailBean);
                        i10 += 90;
                    }
                }
                a(arrayList, detailBean);
            }
            int i15 = 0;
            for (CRPSleepInfo.DetailBean detailBean3 : arrayList) {
                int type3 = detailBean3.getType();
                int totalTime2 = detailBean3.getTotalTime();
                if (type3 == 1) {
                    i9 += totalTime2;
                } else if (type3 == 3) {
                    i15 += totalTime2;
                }
            }
            cRPSleepInfo.setLightTime(i9);
            cRPSleepInfo.setRemTime(i15);
            cRPSleepInfo.setDetails(arrayList);
        }
        return cRPSleepInfo;
    }

    private static void a(List<CRPSleepInfo.DetailBean> list, CRPSleepInfo.DetailBean detailBean) {
        if (!list.isEmpty()) {
            CRPSleepInfo.DetailBean detailBean2 = list.get(list.size() - 1);
            if (detailBean2.getType() == detailBean.getType()) {
                detailBean2.setEndTime(detailBean.getEndTime());
                detailBean2.setTotalTime(detailBean2.getTotalTime() + detailBean.getTotalTime());
                return;
            }
        }
        list.add(detailBean);
    }
}
