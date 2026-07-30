package com.crrepa.band.my.health.sleep;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.segmentedview.SegmentedView;
import com.crrepa.band.my.health.widgets.segmentedview.SleepState;
import com.crrepa.band.my.model.SleepTimeDistributionModel;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class e {
    private static final int START_SLEEP_HOUR = 20;
    public static final String TIME_SEPARATOR = ":";

    private e() {
    }

    public static boolean bindSleepTimeDistributeView(Context context, String str, int i8, SegmentedView segmentedView, TextView textView, TextView textView2) {
        SleepTimeDistributionModel sleepTimeDistributionModel;
        List<SleepTimeDistributionModel.DetailBean> detail;
        if (!TextUtils.isEmpty(str) && (sleepTimeDistributionModel = (SleepTimeDistributionModel) s.json2Bean(str, SleepTimeDistributionModel.class)) != null && (detail = sleepTimeDistributionModel.getDetail()) != null && !detail.isEmpty()) {
            List<SleepTimeDistributionModel.DetailBean> mergeAdjacentSameTypeSegments = mergeAdjacentSameTypeSegments(detail);
            Date[] sleepDate = getSleepDate(new Date(), mergeAdjacentSameTypeSegments.get(0).getStart(), mergeAdjacentSameTypeSegments.get(mergeAdjacentSameTypeSegments.size() - 1).getEnd());
            if (sleepDate != null) {
                textView.setText(getSleepStartEndTime(context, sleepDate[0], context.getString(R.string.fall_asleep)));
                textView2.setText(getSleepStartEndTime(context, sleepDate[1], context.getString(R.string.wake_up)));
            }
            List<com.crrepa.band.my.health.widgets.segmentedview.a> sleepSegmentList = getSleepSegmentList(mergeAdjacentSameTypeSegments);
            if (sleepSegmentList != null) {
                segmentedView.setSegmentList(sleepSegmentList);
                return true;
            }
        }
        return false;
    }

    public static void bindTotalSleepTimeView(int i8, TextView textView, TextView textView2) {
        if (i8 < 0) {
            return;
        }
        int i9 = i8 / 60;
        String format = n.format(i8 % 60, n.TWO_INTEGERS_PATTERN);
        textView.setText(String.valueOf(i9));
        textView2.setText(format);
    }

    @NonNull
    private static Date getDate(Date date, int i8, int i9, int i10) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        calendar.add(5, i8);
        calendar.set(11, i9);
        calendar.set(12, i10);
        return calendar.getTime();
    }

    private static String getDateStr(int i8) {
        return m.formatTime(i8 / 60, i8 % 60, i3.a.getTimeFormat(com.moyoung.dafit.module.common.utils.d.get()));
    }

    public static String getNapDateStr(CRPNapSleepInfo cRPNapSleepInfo) {
        return getDateStr(cRPNapSleepInfo.getStartTime()) + "-" + getDateStr(cRPNapSleepInfo.getEndTime());
    }

    public static Date[] getSleepDate(Date date, String str, String str2) {
        String[] split = str.split(":");
        String[] split2 = str2.split(":");
        if (split.length < 2 || split2.length < 2) {
            return null;
        }
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split2[0]);
        int parseInt4 = Integer.parseInt(split2[1]);
        return new Date[]{getDate(date, (parseInt3 * 60) + parseInt4 <= (parseInt * 60) + parseInt2 ? -1 : 0, parseInt, parseInt2), getDate(date, 0, parseInt3, parseInt4)};
    }

    public static List<com.crrepa.band.my.health.widgets.segmentedview.a> getSleepSegmentList(List<SleepTimeDistributionModel.DetailBean> list) {
        ArrayList arrayList = new ArrayList();
        for (SleepTimeDistributionModel.DetailBean detailBean : list) {
            com.crrepa.band.my.health.widgets.segmentedview.a aVar = new com.crrepa.band.my.health.widgets.segmentedview.a();
            aVar.setStartTime(detailBean.getStart());
            aVar.setEndTime(detailBean.getEnd());
            aVar.setTime(detailBean.getTotal());
            int type = detailBean.getType();
            if (SleepState.values().length <= type) {
                return null;
            }
            aVar.setType(SleepState.values()[type]);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static String getSleepStartEndTime(Context context, Date date, String str) {
        int timeSystem = BandTimeSystemProvider.getTimeSystem(context);
        String string = context.getString(R.string.sleep_wake_up_time_format_24);
        if (timeSystem == 0) {
            string = context.getString(R.string.sleep_wake_up_time_format_12);
        }
        return m.format(date, string) + l.SPACE + str;
    }

    public static List<SleepTimeDistributionModel.DetailBean> mergeAdjacentSameTypeSegments(List<SleepTimeDistributionModel.DetailBean> list) {
        if (list != null) {
            if (list.size() > 1) {
                ArrayList arrayList = new ArrayList();
                SleepTimeDistributionModel.DetailBean detailBean = list.get(0);
                arrayList.add(detailBean);
                for (int i8 = 1; i8 < list.size(); i8++) {
                    SleepTimeDistributionModel.DetailBean detailBean2 = list.get(i8);
                    if (detailBean.getType() == detailBean2.getType()) {
                        detailBean.setEnd(detailBean2.getEnd());
                        detailBean.setTotal(detailBean.getTotal() + detailBean2.getTotal());
                    } else {
                        arrayList.add(detailBean2);
                        detailBean = detailBean2;
                    }
                }
                return arrayList;
            }
        }
        return list;
    }
}
