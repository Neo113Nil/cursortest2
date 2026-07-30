package com.crrepa.band.my.profile.userinfo.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.baidu.ar.auth.FeatureCodes;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes2.dex */
public class WheelYearPicker extends WheelPicker implements e {
    private int mSelectedYear;
    private int mYearEnd;
    private int mYearStart;

    public WheelYearPicker(Context context) {
        this(context, null);
    }

    private void updateSelectedYear() {
        setSelectedItemPosition(this.mSelectedYear - this.mYearStart);
    }

    private void updateYears() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = this.mYearStart; i8 <= this.mYearEnd; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        super.setData(arrayList);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public int getCurrentYear() {
        return Integer.parseInt(String.valueOf(getData().get(getCurrentItemPosition())));
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public int getSelectedYear() {
        return this.mSelectedYear;
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public int getYearEnd() {
        return this.mYearEnd;
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public int getYearStart() {
        return this.mYearStart;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker, com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelYearPicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public void setSelectedYear(int i8) {
        this.mSelectedYear = i8;
        updateSelectedYear();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public void setYearEnd(int i8) {
        this.mYearEnd = i8;
        updateYears();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public void setYearFrame(int i8, int i9) {
        this.mYearStart = i8;
        this.mYearEnd = i9;
        this.mSelectedYear = getCurrentYear();
        updateYears();
        updateSelectedYear();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.e
    public void setYearStart(int i8) {
        this.mYearStart = i8;
        this.mSelectedYear = getCurrentYear();
        updateYears();
        updateSelectedYear();
    }

    public WheelYearPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mYearStart = FeatureCodes.SKY_SEG;
        this.mYearEnd = FeatureCodes.TRACK_2D;
        updateYears();
        this.mSelectedYear = Calendar.getInstance().get(1);
        updateSelectedYear();
    }
}
