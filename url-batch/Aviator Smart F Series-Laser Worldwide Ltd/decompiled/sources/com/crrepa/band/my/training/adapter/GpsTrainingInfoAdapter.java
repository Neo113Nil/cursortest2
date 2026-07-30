package com.crrepa.band.my.training.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.gps.GpsTrainingInfoModel;
import com.crrepa.band.my.training.gomoresport.GomoreSportTipsDialog;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes3.dex */
public class GpsTrainingInfoAdapter extends BaseQuickAdapter<GpsTrainingInfoModel, BaseViewHolder> {
    private final Context context;

    public GpsTrainingInfoAdapter(Context context) {
        super(R.layout.item_gps_training_info);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$0(GpsTrainingInfoModel gpsTrainingInfoModel, View view) {
        showTipsDialog(gpsTrainingInfoModel.getTipsType());
    }

    private void showTipsDialog(int i8) {
        int i9;
        int i10;
        if (i8 == 0) {
            i9 = R.string.training_load_title;
            i10 = R.string.training_acwr_desc;
        } else {
            i9 = R.string.training_status_title;
            i10 = R.string.training_acwr_content;
        }
        GomoreSportTipsDialog gomoreSportTipsDialog = new GomoreSportTipsDialog(this.context);
        gomoreSportTipsDialog.showData(i9, i10);
        gomoreSportTipsDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, final GpsTrainingInfoModel gpsTrainingInfoModel) {
        baseViewHolder.setText(R.id.tv_gps_training_title, gpsTrainingInfoModel.getTitle());
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_gps_training_content);
        if (gpsTrainingInfoModel.getContent() == null) {
            textView.setText(getContext().getString(R.string.data_blank));
        } else {
            textView.setText(gpsTrainingInfoModel.getContent());
        }
        textView.setCompoundDrawablePadding(10);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(gpsTrainingInfoModel.getIcon(), 0, 0, 0);
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_tips);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_gps_training_title);
        if (gpsTrainingInfoModel.getTipsType() == -1) {
            imageView.setVisibility(8);
            textView2.setPaddingRelative(0, 0, 0, 0);
        } else {
            textView2.setPaddingRelative(0, 0, o.dp2px(16.0f), 0);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GpsTrainingInfoAdapter.this.lambda$convert$0(gpsTrainingInfoModel, view);
                }
            });
        }
    }
}
