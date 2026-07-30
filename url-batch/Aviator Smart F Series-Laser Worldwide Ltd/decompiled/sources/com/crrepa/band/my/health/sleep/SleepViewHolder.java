package com.crrepa.band.my.health.sleep;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.sleep.model.BandSleepChangeEvent;
import com.crrepa.band.my.health.sleep.model.BandSleepNapChangeEvent;
import com.crrepa.band.my.health.widgets.segmentedview.SegmentedView;
import com.crrepa.band.my.model.band.provider.SleepNapProvider;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.SleepNap;
import com.crrepa.band.my.model.db.proxy.SleepDaoProxy;
import com.crrepa.band.my.model.db.proxy.SleepNapDaoProxy;
import com.crrepa.band.my.model.user.provider.UserRecommendSleepTimeProvider;
import com.crrepa.band.my.profile.userinfo.model.UserAgeChangeEvent;
import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class SleepViewHolder extends com.crrepa.band.my.home.health.viewholder.b {
    private final RecyclerView rvNap;
    private final SegmentedView segmentedBarView;
    private final TextView tvEndTime;
    private final TextView tvHour;
    private final TextView tvMinute;
    private final TextView tvNapHour;
    private final TextView tvNapMinute;
    private final TextView tvStartTime;

    public static class NapAdapter extends BaseQuickAdapter<CRPNapSleepInfo, BaseViewHolder> {
        public NapAdapter() {
            super(R.layout.sleep_nap_card_record_item);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, CRPNapSleepInfo cRPNapSleepInfo) {
            e.bindTotalSleepTimeView(cRPNapSleepInfo.getTotalTime(), (TextView) baseViewHolder.getView(R.id.tv_nap_time_hour), (TextView) baseViewHolder.getView(R.id.tv_nap_time_minute));
            ((TextView) baseViewHolder.getView(R.id.tv_date)).setText(e.getNapDateStr(cRPNapSleepInfo));
        }
    }

    public SleepViewHolder(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.tvHour = (TextView) this.holder.getView(R.id.tv_date_first_part);
        this.tvMinute = (TextView) this.holder.getView(R.id.tv_date_second_part);
        this.tvNapHour = (TextView) this.holder.getView(R.id.tv_nap_time_hour);
        this.tvNapMinute = (TextView) this.holder.getView(R.id.tv_nap_time_minute);
        this.rvNap = (RecyclerView) this.holder.getView(R.id.rv_nap);
        this.segmentedBarView = (SegmentedView) this.holder.getView(R.id.sleep_time_distributed_view);
        this.tvStartTime = (TextView) this.holder.getView(R.id.tv_fall_asleep_time);
        this.tvEndTime = (TextView) this.holder.getView(R.id.tv_wake_up_time);
        setSleepType();
        setRecommendSleepTime();
    }

    private void renderNoDataLine() {
        View view = this.holder.getView(R.id.include_no_data);
        View view2 = this.holder.getView(R.id.line_no_data);
        View view3 = this.holder.getView(R.id.sleep_nap_card);
        if (view.getVisibility() == 0 && view3.getVisibility() == 0) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
    }

    private void setRecommendSleepTime() {
        this.holder.setText(R.id.tv_today_data_description, this.context.getString(R.string.recommend_sleep_time, String.valueOf(UserRecommendSleepTimeProvider.getRecommendSleepTime())));
    }

    private void setSleepTimeDistributeView(String str, int i8) {
        boolean bindSleepTimeDistributeView = e.bindSleepTimeDistributeView(this.context, str, i8, this.segmentedBarView, this.tvStartTime, this.tvEndTime);
        this.holder.setGone(R.id.include_no_data, bindSleepTimeDistributeView);
        this.holder.setGone(R.id.include_chart, !bindSleepTimeDistributeView);
    }

    private void setSleepType() {
        this.holder.setText(R.id.tv_data_type, R.string.sleep);
        int color = ContextCompat.getColor(this.context, R.color.color_sleep);
        this.holder.setTextColor(R.id.tv_date_first_part, color);
        this.holder.setTextColor(R.id.tv_date_second_part, color);
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.hour);
        this.holder.setText(R.id.tv_date_second_part_unit, R.string.minute);
    }

    private void updateSleepDate(Sleep sleep) {
        Date date = new Date();
        if (sleep != null) {
            date = sleep.getDate();
            int totalSleepTime = SleepDaoProxy.getTotalSleepTime(sleep);
            e.bindTotalSleepTimeView(totalSleepTime, this.tvHour, this.tvMinute);
            setSleepTimeDistributeView(sleep.getDetail(), totalSleepTime);
        }
        setSyncTime(date);
    }

    private void updateSleepNapData() {
        View view = this.holder.getView(R.id.sleep_nap_card);
        if (SleepNapProvider.notSupportSleepNap()) {
            view.setVisibility(8);
            renderNoDataLine();
            return;
        }
        SleepNap sleepNap = SleepNapDaoProxy.get().getSleepNap(new Date());
        List<CRPNapSleepInfo> napList = sleepNap == null ? null : sleepNap.getNapList();
        int napTotalTime = SleepNapDaoProxy.getNapTotalTime(napList);
        view.setVisibility(napTotalTime != 0 ? 0 : 8);
        renderNoDataLine();
        if (napTotalTime == 0) {
            return;
        }
        e.bindTotalSleepTimeView(napTotalTime, this.tvNapHour, this.tvNapMinute);
        this.rvNap.setLayoutManager(new LinearLayoutManager(this.context));
        NapAdapter napAdapter = new NapAdapter();
        this.rvNap.setAdapter(napAdapter);
        napAdapter.setNewData(napList);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        updateSleepDate(SleepDaoProxy.getInstance().getSleep(new Date()));
        updateSleepNapData();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandSleepChangeEvent(BandSleepChangeEvent bandSleepChangeEvent) {
        Sleep sleep = bandSleepChangeEvent.getSleep();
        if (sleep == null || !DateUtils.isToday(sleep.getDate().getTime())) {
            return;
        }
        updateSleepDate(sleep);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(BandSleepNapChangeEvent bandSleepNapChangeEvent) {
        updateSleepNapData();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onUserAgeChangeEvent(UserAgeChangeEvent userAgeChangeEvent) {
        setRecommendSleepTime();
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b
    protected void updateTimeSystem() {
        super.updateTimeSystem();
        bindViewHolder();
    }
}
