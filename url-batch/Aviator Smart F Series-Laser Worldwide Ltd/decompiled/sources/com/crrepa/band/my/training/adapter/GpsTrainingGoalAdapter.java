package com.crrepa.band.my.training.adapter;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsTrainingGoalModel;

/* loaded from: classes3.dex */
public class GpsTrainingGoalAdapter extends BaseQuickAdapter<GpsTrainingGoalModel, BaseViewHolder> {
    public GpsTrainingGoalAdapter() {
        super(R.layout.item_gps_training_goal);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, GpsTrainingGoalModel gpsTrainingGoalModel) {
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_training_goal);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_training_goal_hint);
        textView.setText(gpsTrainingGoalModel.getGoal());
        if (gpsTrainingGoalModel.isChecked()) {
            baseViewHolder.setBackgroundResource(R.id.ll_gps_training_goal, R.drawable.shape_gps_training_goal_bg_h);
            textView.setTextColor(-1);
            textView2.setTextColor(-1);
        } else {
            baseViewHolder.setBackgroundResource(R.id.ll_gps_training_goal, R.drawable.shape_gps_training_goal_bg_n);
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.black));
            textView2.setTextColor(ContextCompat.getColor(getContext(), R.color.grey));
        }
        String hint = gpsTrainingGoalModel.getHint();
        boolean z7 = !TextUtils.isEmpty(hint);
        textView2.setVisibility(z7 ? 0 : 8);
        if (z7) {
            textView2.setText(hint);
        }
        if (textView.getText().length() > 8) {
            textView.setTextSize(2, 12.0f);
        } else {
            textView.setTextSize(2, 14.0f);
        }
    }
}
