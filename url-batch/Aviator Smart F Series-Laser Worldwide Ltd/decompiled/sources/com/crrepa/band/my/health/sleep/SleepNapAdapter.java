package com.crrepa.band.my.health.sleep;

import android.annotation.SuppressLint;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.ble.conn.bean.CRPNapSleepInfo;

/* loaded from: classes2.dex */
public class SleepNapAdapter extends BaseQuickAdapter<CRPNapSleepInfo, BaseViewHolder> {
    public SleepNapAdapter() {
        super(R.layout.sleep_nap_day_record_item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"SetTextI18n"})
    public void convert(BaseViewHolder baseViewHolder, CRPNapSleepInfo cRPNapSleepInfo) {
        e.bindTotalSleepTimeView(cRPNapSleepInfo.getTotalTime(), (TextView) baseViewHolder.getView(R.id.tv_nap_time_hour), (TextView) baseViewHolder.getView(R.id.tv_nap_time_minute));
        ((TextView) baseViewHolder.getView(R.id.tv_date)).setText(e.getNapDateStr(cRPNapSleepInfo));
    }
}
