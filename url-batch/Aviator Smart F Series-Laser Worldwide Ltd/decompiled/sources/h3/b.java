package h3;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ar.util.SystemInfoUtil;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.db.proxy.WeightDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.m;
import com.my.lib.data.ErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements f {
    private Context context;
    private List<Date> dateList;
    private j3.b view;
    private int tabType = 1;
    private Date currentDate = new Date();
    private final WeightDaoProxy weightDaoProxy = new WeightDaoProxy();
    private float selectedAverageNum = -1.0f;
    private float totalAverageNum = -1.0f;
    private int selectedPosition = -1;

    private List<Float> getAverageWeightNumList(List<Weight> list) {
        ArrayList arrayList = new ArrayList();
        this.dateList = new ArrayList();
        int i8 = this.tabType;
        if (i8 == 1) {
            Date startDateOfWeek = m.getStartDateOfWeek(this.currentDate);
            for (int i9 = 0; i9 < 7; i9++) {
                Date dateOfOffsetDay = m.getDateOfOffsetDay(startDateOfWeek, i9);
                arrayList.add(Float.valueOf(this.weightDaoProxy.getAverageWeightNum(list, dateOfOffsetDay, 0)));
                this.dateList.add(dateOfOffsetDay);
                if (i3.a.isSameDay(dateOfOffsetDay, this.currentDate)) {
                    this.selectedPosition = i9;
                }
            }
        } else if (i8 == 2) {
            Date startDateOfMonth = m.getStartDateOfMonth(this.currentDate);
            for (int i10 = 0; i10 < i3.a.getDayNumOfMonth(this.currentDate); i10++) {
                Date dateOfOffsetDay2 = m.getDateOfOffsetDay(startDateOfMonth, i10);
                arrayList.add(Float.valueOf(this.weightDaoProxy.getAverageWeightNum(list, dateOfOffsetDay2, 0)));
                this.dateList.add(dateOfOffsetDay2);
                if (i3.a.isSameDay(dateOfOffsetDay2, this.currentDate)) {
                    this.selectedPosition = i10;
                }
            }
        } else if (i8 == 3) {
            Date startDateOfYear = m.getStartDateOfYear(this.currentDate);
            for (int i11 = 0; i11 < 12; i11++) {
                Date dateOfOffsetMonth = m.getDateOfOffsetMonth(startDateOfYear, i11);
                arrayList.add(Float.valueOf(this.weightDaoProxy.getAverageWeightNum(list, dateOfOffsetMonth, 2)));
                this.dateList.add(dateOfOffsetMonth);
                if (i3.a.isSameMonth(dateOfOffsetMonth, this.currentDate)) {
                    this.selectedPosition = i11;
                }
            }
        }
        int i12 = this.selectedPosition;
        if (i12 == -1) {
            this.selectedAverageNum = this.weightDaoProxy.getAverageWeightNum(new Date(), this.tabType != 3 ? 0 : 2);
        } else {
            this.selectedAverageNum = ((Float) arrayList.get(i12)).floatValue();
        }
        this.totalAverageNum = this.weightDaoProxy.getTotalAverageNum(arrayList);
        return arrayList;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    public void getAverageData(boolean z7) {
        String str;
        String string = this.context.getString(R.string.statistics_date_format);
        if (z7) {
            this.view.showAverageInfo(this.totalAverageNum, m.format(new Date(), string) + ", " + this.context.getString(R.string.average));
            return;
        }
        int i8 = this.selectedPosition;
        Date date = i8 == -1 ? new Date() : this.dateList.get(i8);
        if (this.tabType == 3) {
            str = m.format(date, this.context.getString(R.string.year_month_format)) + SystemInfoUtil.COMMA + this.context.getString(R.string.average);
        } else {
            str = m.format(date, string) + ", " + this.context.getString(R.string.average);
        }
        this.view.showAverageInfo(this.selectedAverageNum, str);
    }

    public void getChartData() {
        List<Weight> weightList = this.weightDaoProxy.getWeightList(this.currentDate, this.tabType);
        List<Float> averageWeightNumList = getAverageWeightNumList(weightList);
        float[] maxMinWeightNum = new WeightDaoProxy().getMaxMinWeightNum(weightList);
        j3.b bVar = this.view;
        boolean z7 = false;
        float f8 = maxMinWeightNum[0];
        float f9 = maxMinWeightNum[1];
        if (weightList != null && weightList.size() > 0) {
            z7 = true;
        }
        bVar.renderWeightChart(averageWeightNumList, f8, f9, z7);
    }

    public int getDateListSize() {
        return this.dateList.size();
    }

    public int getSelectedPosition() {
        return this.selectedPosition;
    }

    public int getTabType() {
        return this.tabType;
    }

    public List<String> getXAxisTextList() {
        String[] stringArray = this.context.getResources().getStringArray(R.array.weight_week_array);
        int i8 = this.tabType;
        if (i8 == 2) {
            int dateMonth = i3.a.getDateMonth(this.currentDate) + 1;
            int dayNumOfMonth = i3.a.getDayNumOfMonth(this.currentDate);
            String[] strArr = new String[dayNumOfMonth];
            int[] iArr = {1, 10, 20, dayNumOfMonth};
            for (int i9 = 0; i9 < dayNumOfMonth; i9++) {
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = iArr[i10];
                    if (i9 == i11 - 1) {
                        strArr[i9] = dateMonth + "-" + i11;
                    }
                }
                if (TextUtils.isEmpty(strArr[i9])) {
                    strArr[i9] = "";
                }
            }
            stringArray = strArr;
        } else if (i8 == 3) {
            stringArray = new String[]{"1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", ErrorCode.PARAMETER_ERROR, "6", "7", "8", "9", "10", "11", "12"};
        }
        return Arrays.asList(stringArray);
    }

    public int getXAxisTextListSize() {
        int i8 = this.tabType;
        if (i8 == 2) {
            return 31;
        }
        return i8 == 3 ? 12 : 7;
    }

    public void initData(int i8, Date date) {
        com.orhanobut.logger.f.d("weight ==> tabType : " + i8 + "; currentDate : " + date);
        this.tabType = i8;
        this.currentDate = date;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setSelectedAverageNum(float f8) {
        this.selectedAverageNum = f8;
    }

    public void setSelectedPosition(int i8) {
        com.orhanobut.logger.f.d("weight ==> lineChart-selectX : " + i8);
        this.selectedPosition = i8;
    }

    public void setView(j3.b bVar, Context context) {
        this.view = bVar;
        this.context = context;
    }
}
