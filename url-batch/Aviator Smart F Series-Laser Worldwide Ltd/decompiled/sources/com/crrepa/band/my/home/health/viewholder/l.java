package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.proxy.TodayQuoteDaoProxy;

/* loaded from: classes2.dex */
public class l extends com.crrepa.band.my.home.health.b {
    public l(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
    }

    @Override // com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        String todayQuote = new TodayQuoteDaoProxy().getTodayQuote(this.context);
        if (TextUtils.isEmpty(todayQuote)) {
            this.holder.setGone(R.id.tv_today_quote, true);
        } else {
            this.holder.setText(R.id.tv_today_quote, todayQuote);
        }
    }

    @Override // com.crrepa.band.my.home.health.b
    public void destory() {
    }
}
