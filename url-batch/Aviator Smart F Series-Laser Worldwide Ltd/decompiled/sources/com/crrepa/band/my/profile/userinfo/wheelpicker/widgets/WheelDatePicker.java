package com.crrepa.band.my.profile.userinfo.wheelpicker.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import com.orhanobut.logger.f;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class WheelDatePicker extends LinearLayout implements WheelPicker.a, com.moyoung.dafit.module.common.widgets.wheelpicker.a, com.moyoung.dafit.module.common.widgets.wheelpicker.b, b, e, d, c {
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-M-d", Locale.getDefault());
    private int mDay;
    private a mListener;
    private int mMonth;
    private WheelDayPicker mPickerDay;
    private WheelMonthPicker mPickerMonth;
    private WheelYearPicker mPickerYear;
    private int mYear;

    public interface a {
        void onDateSelected(WheelDatePicker wheelDatePicker, Date date);
    }

    public WheelDatePicker(Context context) {
        this(context, null);
    }

    private int getViewId(int i8) {
        return i8 != 1 ? i8 != 2 ? R.layout.view_wheel_date_picker_en : R.layout.view_wheel_date_picker_us : R.layout.view_wheel_date_picker;
    }

    private void setMaximumWidthTextYear() {
        String valueOf = String.valueOf(this.mPickerYear.getData().get(r0.size() - 1));
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < valueOf.length(); i8++) {
            sb.append("0");
        }
        this.mPickerYear.setMaximumWidthText(sb.toString());
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public Date getCurrentDate() {
        try {
            return SDF.parse(this.mYear + "-" + this.mMonth + "-" + this.mDay);
        } catch (ParseException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public int getCurrentDay() {
        return this.mPickerDay.getCurrentDay();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public int getCurrentItemPosition() {
        throw new UnsupportedOperationException("You can not get position of current item fromWheelDatePicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.d
    public int getCurrentMonth() {
        return this.mPickerMonth.getCurrentMonth();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public int getCurrentYear() {
        return this.mPickerYear.getCurrentYear();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getCurtainColor() {
        if (this.mPickerYear.getCurtainColor() == this.mPickerMonth.getCurtainColor() && this.mPickerMonth.getCurtainColor() == this.mPickerDay.getCurtainColor()) {
            return this.mPickerYear.getCurtainColor();
        }
        throw new RuntimeException("Can not get curtain color correctly from WheelDatePicker!");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public List getData() {
        throw new UnsupportedOperationException("You can not get data source from WheelDatePicker");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getIndicatorColor() {
        if (this.mPickerYear.getCurtainColor() == this.mPickerMonth.getCurtainColor() && this.mPickerMonth.getCurtainColor() == this.mPickerDay.getCurtainColor()) {
            return this.mPickerYear.getCurtainColor();
        }
        throw new RuntimeException("Can not get indicator color correctly from WheelDatePicker!");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getIndicatorSize() {
        if (this.mPickerYear.getIndicatorSize() == this.mPickerMonth.getIndicatorSize() && this.mPickerMonth.getIndicatorSize() == this.mPickerDay.getIndicatorSize()) {
            return this.mPickerYear.getIndicatorSize();
        }
        throw new RuntimeException("Can not get indicator size correctly from WheelDatePicker!");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public int getItemAlign() {
        throw new UnsupportedOperationException("You can not get item align from WheelDatePicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public int getItemAlignDay() {
        return this.mPickerDay.getItemAlign();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public int getItemAlignMonth() {
        return this.mPickerMonth.getItemAlign();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public int getItemAlignYear() {
        return this.mPickerYear.getItemAlign();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getItemSpace() {
        if (this.mPickerYear.getItemSpace() == this.mPickerMonth.getItemSpace() && this.mPickerMonth.getItemSpace() == this.mPickerDay.getItemSpace()) {
            return this.mPickerYear.getItemSpace();
        }
        throw new RuntimeException("Can not get item space correctly from WheelDatePicker!");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getItemTextColor() {
        if (this.mPickerYear.getItemTextColor() == this.mPickerMonth.getItemTextColor() && this.mPickerMonth.getItemTextColor() == this.mPickerDay.getItemTextColor()) {
            return this.mPickerYear.getItemTextColor();
        }
        throw new RuntimeException("Can not get color of item text correctly fromWheelDatePicker!");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getItemTextSize() {
        if (this.mPickerYear.getItemTextSize() == this.mPickerMonth.getItemTextSize() && this.mPickerMonth.getItemTextSize() == this.mPickerDay.getItemTextSize()) {
            return this.mPickerYear.getItemTextSize();
        }
        throw new RuntimeException("Can not get size of item text correctly fromWheelDatePicker!");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public String getMaximumWidthText() {
        throw new UnsupportedOperationException("You can not get maximum width text fromWheelDatePicker");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public int getMaximumWidthTextPosition() {
        throw new UnsupportedOperationException("You can not get maximum width text positionfrom WheelDatePicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public int getMonth() {
        return getSelectedMonth();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public int getSelectedDay() {
        return this.mPickerDay.getSelectedDay();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public int getSelectedItemPosition() {
        throw new UnsupportedOperationException("You can not get position of selected item fromWheelDatePicker");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getSelectedItemTextColor() {
        if (this.mPickerYear.getSelectedItemTextColor() == this.mPickerMonth.getSelectedItemTextColor() && this.mPickerMonth.getSelectedItemTextColor() == this.mPickerDay.getSelectedItemTextColor()) {
            return this.mPickerYear.getSelectedItemTextColor();
        }
        throw new RuntimeException("Can not get color of selected item text correctly fromWheelDatePicker!");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.d
    public int getSelectedMonth() {
        return this.mPickerMonth.getSelectedMonth();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public int getSelectedYear() {
        return this.mPickerYear.getSelectedYear();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public Typeface getTypeface() {
        if (this.mPickerYear.getTypeface().equals(this.mPickerMonth.getTypeface()) && this.mPickerMonth.getTypeface().equals(this.mPickerDay.getTypeface())) {
            return this.mPickerYear.getTypeface();
        }
        throw new RuntimeException("Can not get typeface correctly from WheelDatePicker!");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public int getVisibleItemCount() {
        if (this.mPickerYear.getVisibleItemCount() == this.mPickerMonth.getVisibleItemCount() && this.mPickerMonth.getVisibleItemCount() == this.mPickerDay.getVisibleItemCount()) {
            return this.mPickerYear.getVisibleItemCount();
        }
        throw new ArithmeticException("Can not get visible item count correctly fromWheelDatePicker!");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public WheelDayPicker getWheelDayPicker() {
        return this.mPickerDay;
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public WheelMonthPicker getWheelMonthPicker() {
        return this.mPickerMonth;
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public WheelYearPicker getWheelYearPicker() {
        return this.mPickerYear;
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public int getYear() {
        return getSelectedYear();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public int getYearEnd() {
        return this.mPickerYear.getYearEnd();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public int getYearStart() {
        return this.mPickerYear.getYearStart();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean hasAtmospheric() {
        return this.mPickerYear.hasAtmospheric() && this.mPickerMonth.hasAtmospheric() && this.mPickerDay.hasAtmospheric();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean hasCurtain() {
        return this.mPickerYear.hasCurtain() && this.mPickerMonth.hasCurtain() && this.mPickerDay.hasCurtain();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean hasIndicator() {
        return this.mPickerYear.hasIndicator() && this.mPickerMonth.hasIndicator() && this.mPickerDay.hasIndicator();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public boolean hasSameWidth() {
        throw new UnsupportedOperationException("You don't need to set same width forWheelDatePicker");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean isCurved() {
        return this.mPickerYear.isCurved() && this.mPickerMonth.isCurved() && this.mPickerDay.isCurved();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public boolean isCyclic() {
        return this.mPickerYear.isCyclic() && this.mPickerMonth.isCyclic() && this.mPickerDay.isCyclic();
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
    public void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
        if (wheelPicker.getId() == R.id.wheel_date_picker_year) {
            int intValue = ((Integer) obj).intValue();
            this.mYear = intValue;
            this.mPickerDay.setYear(intValue);
        } else if (wheelPicker.getId() == R.id.wheel_date_picker_month) {
            int intValue2 = ((Integer) obj).intValue();
            this.mMonth = intValue2;
            this.mPickerDay.setMonth(intValue2);
        }
        this.mDay = this.mPickerDay.getCurrentDay();
        String str = this.mYear + "-" + this.mMonth + "-" + this.mDay;
        f.d("date: " + str);
        a aVar = this.mListener;
        if (aVar != null) {
            try {
                aVar.onDateSelected(this, SDF.parse(str));
            } catch (ParseException e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setAtmospheric(boolean z7) {
        this.mPickerYear.setAtmospheric(z7);
        this.mPickerMonth.setAtmospheric(z7);
        this.mPickerDay.setAtmospheric(z7);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setCurtain(boolean z7) {
        this.mPickerYear.setCurtain(z7);
        this.mPickerMonth.setCurtain(z7);
        this.mPickerDay.setCurtain(z7);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setCurtainColor(int i8) {
        this.mPickerYear.setCurtainColor(i8);
        this.mPickerMonth.setCurtainColor(i8);
        this.mPickerDay.setCurtainColor(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setCurved(boolean z7) {
        this.mPickerYear.setCurved(z7);
        this.mPickerMonth.setCurved(z7);
        this.mPickerDay.setCurved(z7);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setCyclic(boolean z7) {
        this.mPickerYear.setCyclic(z7);
        this.mPickerMonth.setCyclic(z7);
        this.mPickerDay.setCyclic(z7);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public void setData(List list) {
        throw new UnsupportedOperationException("You don't need to set data source forWheelDatePicker");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.a
    public void setDebug(boolean z7) {
        this.mPickerYear.setDebug(z7);
        this.mPickerMonth.setDebug(z7);
        this.mPickerDay.setDebug(z7);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setIndicator(boolean z7) {
        this.mPickerYear.setIndicator(z7);
        this.mPickerMonth.setIndicator(z7);
        this.mPickerDay.setIndicator(z7);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setIndicatorColor(int i8) {
        this.mPickerYear.setIndicatorColor(i8);
        this.mPickerMonth.setIndicatorColor(i8);
        this.mPickerDay.setIndicatorColor(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setIndicatorSize(int i8) {
        this.mPickerYear.setIndicatorSize(i8);
        this.mPickerMonth.setIndicatorSize(i8);
        this.mPickerDay.setIndicatorSize(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public void setItemAlign(int i8) {
        throw new UnsupportedOperationException("You don't need to set item align forWheelDatePicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public void setItemAlignDay(int i8) {
        this.mPickerDay.setItemAlign(i8);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public void setItemAlignMonth(int i8) {
        this.mPickerMonth.setItemAlign(i8);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public void setItemAlignYear(int i8) {
        this.mPickerYear.setItemAlign(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setItemSpace(int i8) {
        this.mPickerYear.setItemSpace(i8);
        this.mPickerMonth.setItemSpace(i8);
        this.mPickerDay.setItemSpace(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setItemTextColor(int i8) {
        this.mPickerYear.setItemTextColor(i8);
        this.mPickerMonth.setItemTextColor(i8);
        this.mPickerDay.setItemTextColor(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setItemTextSize(int i8) {
        this.mPickerYear.setItemTextSize(i8);
        this.mPickerMonth.setItemTextSize(i8);
        this.mPickerDay.setItemTextSize(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public void setMaximumWidthText(String str) {
        throw new UnsupportedOperationException("You don't need to set maximum width text forWheelDatePicker");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public void setMaximumWidthTextPosition(int i8) {
        throw new UnsupportedOperationException("You don't need to set maximum width textposition for WheelDatePicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public void setMonth(int i8) {
        this.mMonth = i8;
        this.mPickerMonth.setSelectedMonth(i8);
        this.mPickerDay.setMonth(i8);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.b
    public void setOnDateSelectedListener(a aVar) {
        this.mListener = aVar;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public void setOnItemSelectedListener(WheelPicker.a aVar) {
        throw new UnsupportedOperationException("You can not set OnItemSelectedListener forWheelDatePicker");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public void setOnWheelChangeListener(WheelPicker.b bVar) {
        throw new UnsupportedOperationException("WheelDatePicker unsupport setOnWheelChangeListener");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public void setSameWidth(boolean z7) {
        throw new UnsupportedOperationException("You don't need to set same width forWheelDatePicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public void setSelectedDay(int i8) {
        this.mDay = i8;
        this.mPickerDay.setSelectedDay(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    @Deprecated
    public void setSelectedItemPosition(int i8) {
        throw new UnsupportedOperationException("You can not set position of selected item forWheelDatePicker");
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setSelectedItemTextColor(int i8) {
        this.mPickerYear.setSelectedItemTextColor(i8);
        this.mPickerMonth.setSelectedItemTextColor(i8);
        this.mPickerDay.setSelectedItemTextColor(i8);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.d
    public void setSelectedMonth(int i8) {
        this.mMonth = i8;
        this.mPickerMonth.setSelectedMonth(i8);
        this.mPickerDay.setMonth(i8);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public void setSelectedYear(int i8) {
        this.mYear = i8;
        this.mPickerYear.setSelectedYear(i8);
        this.mPickerDay.setYear(i8);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setTypeface(Typeface typeface) {
        this.mPickerYear.setTypeface(typeface);
        this.mPickerMonth.setTypeface(typeface);
        this.mPickerDay.setTypeface(typeface);
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setVisibleItemCount(int i8) {
        this.mPickerYear.setVisibleItemCount(i8);
        this.mPickerMonth.setVisibleItemCount(i8);
        this.mPickerDay.setVisibleItemCount(i8);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public void setYear(int i8) {
        this.mYear = i8;
        this.mPickerYear.setSelectedYear(i8);
        this.mPickerDay.setYear(i8);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public void setYearAndMonth(int i8, int i9) {
        this.mYear = i8;
        this.mMonth = i9;
        this.mPickerYear.setSelectedYear(i8);
        this.mPickerMonth.setSelectedMonth(i9);
        this.mPickerDay.setYearAndMonth(i8, i9);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public void setYearEnd(int i8) {
        this.mPickerYear.setYearEnd(i8);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public void setYearFrame(int i8, int i9) {
        this.mPickerYear.setYearFrame(i8, i9);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public void setYearStart(int i8) {
        this.mPickerYear.setYearStart(i8);
    }

    public WheelDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(getViewId(i3.a.getDateSortType()), this);
        this.mPickerYear = (WheelYearPicker) findViewById(R.id.wheel_date_picker_year);
        this.mPickerMonth = (WheelMonthPicker) findViewById(R.id.wheel_date_picker_month);
        this.mPickerDay = (WheelDayPicker) findViewById(R.id.wheel_date_picker_day);
        this.mPickerYear.setOnItemSelectedListener(this);
        this.mPickerMonth.setOnItemSelectedListener(this);
        this.mPickerDay.setOnItemSelectedListener(this);
        setMaximumWidthTextYear();
        this.mPickerMonth.setMaximumWidthText(n.TWO_INTEGERS_PATTERN);
        this.mPickerDay.setMaximumWidthText(n.TWO_INTEGERS_PATTERN);
        this.mYear = this.mPickerYear.getCurrentYear();
        this.mMonth = this.mPickerMonth.getCurrentMonth();
        this.mDay = this.mPickerDay.getCurrentDay();
    }
}
