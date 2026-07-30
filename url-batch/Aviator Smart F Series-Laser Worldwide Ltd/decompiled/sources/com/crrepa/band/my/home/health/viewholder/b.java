package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.setting.other.model.BandTimeSystemChangeEvent;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public abstract class b extends com.crrepa.band.my.home.health.b {
    private Date date;

    public b(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    @Override // com.crrepa.band.my.home.health.b
    public abstract void bindViewHolder();

    @Override // com.crrepa.band.my.home.health.b
    public void destory() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandTimeSystemChangeEvent(BandTimeSystemChangeEvent bandTimeSystemChangeEvent) {
        Date date = this.date;
        if (date != null) {
            setSyncTime(date);
        }
        updateTimeSystem();
    }

    protected void setSyncTime(Date date) {
        this.date = date;
        this.holder.setText(R.id.tv_sync_time, com.moyoung.dafit.module.common.utils.m.format(date, com.crrepa.band.my.health.base.j.getSyncTimeFormat(this.context)));
    }

    protected void updateTimeSystem() {
    }
}
