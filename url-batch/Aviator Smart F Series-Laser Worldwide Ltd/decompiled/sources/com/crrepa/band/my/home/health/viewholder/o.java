package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class o extends b {
    public o(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        initView();
    }

    private void initView() {
        this.holder.setText(R.id.tv_water_card_title, this.context.getString(R.string.water_intake_reminder));
        this.holder.setText(R.id.tv_water_card_note, this.context.getString(R.string.water_record_view));
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
    }
}
