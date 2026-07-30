package com.baidu.ar.filter;

import android.graphics.Point;
import java.util.List;

/* loaded from: classes.dex */
public interface IFilter {
    void clearAllFilter();

    void resetAllFilter();

    void setFilterStateListener(FilterStateListener filterStateListener);

    void updateFaceFilterWithKneadJson(String str);

    void updateFilter(FilterParam filterParam, float f8);

    void updateFilter(FilterParam filterParam, int i8);

    void updateFilter(FilterParam filterParam, String str);

    void updateFilter(FilterParam filterParam, List<Point> list);

    void updateFilter(FilterParam filterParam, float[] fArr);

    void updateFilter(String str, String str2, Object obj);

    String updateFilterCase(String str);
}
