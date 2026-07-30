package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import java.util.Date;

/* loaded from: classes2.dex */
public class m extends b {
    public m(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        this.holder.setText(R.id.tv_today_date, com.moyoung.dafit.module.common.utils.m.format(new Date(), this.context.getString(R.string.today_date_format)));
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void destory() {
    }
}
