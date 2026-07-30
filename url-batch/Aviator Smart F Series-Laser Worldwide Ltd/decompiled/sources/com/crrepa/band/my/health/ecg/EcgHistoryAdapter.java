package com.crrepa.band.my.health.ecg;

import android.content.Context;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.Ecg;
import java.util.List;

/* loaded from: classes2.dex */
public class EcgHistoryAdapter extends BaseQuickAdapter<Ecg, BaseViewHolder> {
    private Context context;

    public EcgHistoryAdapter(Context context, @Nullable List<Ecg> list) {
        super(R.layout.item_history_ecg, list);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, Ecg ecg) {
        Integer averageHeartRate = ecg.getAverageHeartRate();
        if (averageHeartRate != null && averageHeartRate.intValue() > 0) {
            baseViewHolder.setText(R.id.tv_average_hr, averageHeartRate.toString());
        }
        if (ecg.getHeartRateVariability() != null) {
            baseViewHolder.setVisible(R.id.tv_hrv, true);
            baseViewHolder.setVisible(R.id.tv_hrv_value, true);
            baseViewHolder.setText(R.id.tv_hrv_value, ecg.getHeartRateVariability().toString());
        }
        com.crrepa.band.my.health.base.b.setMeasureDate(this.context, baseViewHolder, ecg.getDate());
    }
}
