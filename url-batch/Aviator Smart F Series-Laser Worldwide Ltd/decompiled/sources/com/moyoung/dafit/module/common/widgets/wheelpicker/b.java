package com.moyoung.dafit.module.common.widgets.wheelpicker;

import android.graphics.Typeface;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import java.util.List;

/* loaded from: classes4.dex */
public interface b {
    int getCurrentItemPosition();

    int getCurtainColor();

    List getData();

    int getIndicatorColor();

    int getIndicatorSize();

    int getItemAlign();

    int getItemSpace();

    int getItemTextColor();

    int getItemTextSize();

    String getMaximumWidthText();

    int getMaximumWidthTextPosition();

    int getSelectedItemPosition();

    int getSelectedItemTextColor();

    Typeface getTypeface();

    int getVisibleItemCount();

    boolean hasAtmospheric();

    boolean hasCurtain();

    boolean hasIndicator();

    boolean hasSameWidth();

    boolean isCurved();

    boolean isCyclic();

    void setAtmospheric(boolean z7);

    void setCurtain(boolean z7);

    void setCurtainColor(int i8);

    void setCurved(boolean z7);

    void setCyclic(boolean z7);

    void setData(List list);

    void setIndicator(boolean z7);

    void setIndicatorColor(int i8);

    void setIndicatorSize(int i8);

    void setItemAlign(int i8);

    void setItemSpace(int i8);

    void setItemTextColor(int i8);

    void setItemTextSize(int i8);

    void setMaximumWidthText(String str);

    void setMaximumWidthTextPosition(int i8);

    void setOnItemSelectedListener(WheelPicker.a aVar);

    void setOnWheelChangeListener(WheelPicker.b bVar);

    void setSameWidth(boolean z7);

    void setSelectedItemPosition(int i8);

    void setSelectedItemTextColor(int i8);

    void setTypeface(Typeface typeface);

    void setVisibleItemCount(int i8);
}
