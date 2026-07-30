package com.crrepa.band.my.home.health;

import com.crrepa.band.my.model.BandDataTypeModel;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderDataList(List<BandDataTypeModel> list);

    void renderSwipeRefresh(boolean z7);

    void renderSwipeRefreshComplete();

    void renderTodayDate(Date date);
}
