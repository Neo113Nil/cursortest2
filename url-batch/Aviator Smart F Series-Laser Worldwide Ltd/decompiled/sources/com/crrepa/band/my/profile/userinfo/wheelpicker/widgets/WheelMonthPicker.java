package com.crrepa.band.my.profile.userinfo.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes2.dex */
public class WheelMonthPicker extends WheelPicker implements d {
    private int mSelectedMonth;

    public WheelMonthPicker(Context context) {
        this(context, null);
    }

    private void updateSelectedYear() {
        setSelectedItemPosition(this.mSelectedMonth - 1);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.d
    public int getCurrentMonth() {
        return Integer.parseInt(String.valueOf(getData().get(getCurrentItemPosition())));
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.d
    public int getSelectedMonth() {
        return this.mSelectedMonth;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker, com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelMonthPicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.d
    public void setSelectedMonth(int i8) {
        this.mSelectedMonth = i8;
        updateSelectedYear();
    }

    public WheelMonthPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 <= 12; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        super.setData(arrayList);
        this.mSelectedMonth = Calendar.getInstance().get(2) + 1;
        updateSelectedYear();
    }
}
