package com.crrepa.band.my.health.water.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Water;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.u;
import java.util.List;

/* loaded from: classes2.dex */
public class WaterRecordAdapter extends BaseQuickAdapter<Water, BaseViewHolder> {
    private final Context context;
    private final boolean isToday;

    public WaterRecordAdapter(@Nullable List<Water> list, Context context, boolean z7) {
        super(R.layout.item_water_record, list);
        this.context = context;
        this.isToday = z7;
    }

    private String getTimeFormat() {
        if (BandTimeSystemProvider.is12HourTime()) {
            return this.context.getString(u.isZH() ? R.string.hour_minute_format_12_zh : R.string.hour_minute_format_12);
        }
        return this.context.getString(R.string.hour_minute_format_24);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, Water water) {
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            baseViewHolder.setText(R.id.tv_water_intake, water.getIntakeMl() + this.context.getString(R.string.water_ml));
        } else {
            baseViewHolder.setText(R.id.tv_water_intake, water.getIntakeOz() + this.context.getString(R.string.water_oz));
        }
        baseViewHolder.setTextColor(R.id.tv_water_intake, ContextCompat.getColor(this.context, R.color.black));
        baseViewHolder.setText(R.id.tv_water_time, m.format(water.getDate(), getTimeFormat()));
        if (this.isToday) {
            baseViewHolder.setImageResource(R.id.iv_water_record_type, water.getType() == 0 ? R$drawable.ic_water_watch : R$drawable.ic_water_phone);
            if (WaterProvider.WATER_STATUS != WaterProvider.WaterConnectStatus.CONNECT_NEW && water.getType() == 0) {
                baseViewHolder.setTextColor(R.id.tv_water_intake, ContextCompat.getColor(this.context, R.color.color_water_record_unable));
                baseViewHolder.setImageResource(R.id.iv_water_record_type, R$drawable.ic_water_watch_disconnect);
            }
        }
    }
}
