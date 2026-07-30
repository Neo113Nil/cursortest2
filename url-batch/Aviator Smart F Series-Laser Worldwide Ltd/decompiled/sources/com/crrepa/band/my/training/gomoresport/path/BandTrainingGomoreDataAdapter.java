package com.crrepa.band.my.training.gomoresport.path;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.training.gomoresport.GomoreSportTipsDialog;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes3.dex */
public class BandTrainingGomoreDataAdapter extends BaseQuickAdapter<a, BaseViewHolder> {
    private final Context context;

    public BandTrainingGomoreDataAdapter(Context context) {
        super(R.layout.item_band_training_gomore_sport_data);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$0(a aVar, View view) {
        showTipsDialog(aVar.tipsType);
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
    public void convert(@NonNull BaseViewHolder baseViewHolder, final a aVar) {
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_data);
        baseViewHolder.setText(R.id.tv_title, aVar.title);
        textView.setText(aVar.data);
        baseViewHolder.setText(R.id.tv_unit, aVar.unit);
        baseViewHolder.setImageResource(R.id.iv_icon, aVar.icon);
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_tips);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_title);
        if (aVar.tipsType == -1) {
            imageView.setVisibility(8);
            textView2.setPadding(0, 0, 0, 0);
        } else {
            imageView.setVisibility(0);
            textView2.setPaddingRelative(0, 0, o.dp2px(16.0f), 0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.path.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BandTrainingGomoreDataAdapter.this.lambda$convert$0(aVar, view);
                }
            });
        }
        if (aVar.tipsType == 1) {
            textView.setTextSize(2, 12.0f);
        } else {
            textView.setTextSize(2, 15.0f);
        }
    }
}
