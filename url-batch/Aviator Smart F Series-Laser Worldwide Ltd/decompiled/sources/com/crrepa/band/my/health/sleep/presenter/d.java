package com.crrepa.band.my.health.sleep.presenter;

import android.text.TextUtils;
import com.crrepa.band.my.health.widgets.h;
import com.crrepa.band.my.model.SleepTimeDistributionModel;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.proxy.SleepDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class d implements com.moyoung.dafit.module.common.baseui.f {
    private h view;

    private boolean isEmptySleep(Sleep sleep) {
        return sleep == null || sleep.getDeep().intValue() + sleep.getShallow().intValue() == 0;
    }

    private void showEmptySleep() {
        this.view.renderEmptySleep();
    }

    private void showSleepDetail(List<SleepTimeDistributionModel.DetailBean> list) {
        List<com.crrepa.band.my.health.widgets.segmentedview.a> sleepSegmentList = com.crrepa.band.my.health.sleep.e.getSleepSegmentList(list);
        if (sleepSegmentList != null) {
            this.view.renderSleepDetail(sleepSegmentList);
        }
    }

    private void showTotalSleepTime(int i8) {
        this.view.renderSleepTime(i8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getSleepDetail(Date date) {
        SleepTimeDistributionModel sleepTimeDistributionModel;
        List<SleepTimeDistributionModel.DetailBean> detail;
        this.view.renderDate(date);
        Sleep sleep = SleepDaoProxy.getInstance().getSleep(date);
        if (isEmptySleep(sleep)) {
            showEmptySleep();
            return;
        }
        showTotalSleepTime(SleepDaoProxy.getTotalSleepTime(sleep));
        String detail2 = sleep.getDetail();
        if (TextUtils.isEmpty(detail2) || (sleepTimeDistributionModel = (SleepTimeDistributionModel) s.json2Bean(detail2, SleepTimeDistributionModel.class)) == null || (detail = sleepTimeDistributionModel.getDetail()) == null || detail.isEmpty()) {
            return;
        }
        List<SleepTimeDistributionModel.DetailBean> mergeAdjacentSameTypeSegments = com.crrepa.band.my.health.sleep.e.mergeAdjacentSameTypeSegments(detail);
        Date[] sleepDate = com.crrepa.band.my.health.sleep.e.getSleepDate(date, mergeAdjacentSameTypeSegments.get(0).getStart(), mergeAdjacentSameTypeSegments.get(mergeAdjacentSameTypeSegments.size() - 1).getEnd());
        if (sleepDate != null) {
            this.view.renderStartSleepTime(sleepDate[0]);
            this.view.renderEndSleepTime(sleepDate[1]);
        }
        showSleepDetail(mergeAdjacentSameTypeSegments);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(h hVar) {
        this.view = hVar;
    }
}
