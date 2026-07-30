package com.crrepa.band.my.health.weight.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import i3.a;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class WeightHistoryAdapter extends BaseQuickAdapter<Weight, BaseViewHolder> {
    private final Context context;

    public WeightHistoryAdapter(@Nullable List<Weight> list, Context context) {
        super(R.layout.item_weight_history, list);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, Weight weight) {
        Date date = weight.getDate();
        if (!weight.isShowWeight()) {
            baseViewHolder.setVisible(R.id.tv_weight_day, true);
            baseViewHolder.setText(R.id.tv_weight_day, m.format(date, this.context.getString(R.string.statistics_date_format)));
            baseViewHolder.setGone(R.id.rl_weight_record, true);
        } else {
            baseViewHolder.setVisible(R.id.rl_weight_record, true);
            baseViewHolder.setText(R.id.tv_weight_num, n.formatWeight(UserWeightProvider.getCurrentWeight(weight), 1));
            baseViewHolder.setText(R.id.tv_weight_unit, this.context.getString(BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.weight_kg : R.string.weight_lb));
            baseViewHolder.setText(R.id.tv_weight_time, m.format(date, a.getTimeFormat(this.context)));
            baseViewHolder.setGone(R.id.tv_weight_day, true);
        }
    }
}
