package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.training.model.TrainingRecordSyncEvent;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class n extends b {
    public n(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
    }

    private void showSynced() {
        this.holder.setImageResource(R.id.iv_sync_status, R$drawable.ic_import_completed);
        this.holder.setText(R.id.tv_content, R.string.training_record_imported);
        this.holder.setVisible(R.id.tv_not_display, true);
        this.holder.setVisible(R.id.iv_hide, true);
    }

    private void showSyncing() {
        this.holder.setImageResource(R.id.iv_sync_status, R$drawable.ic_importing);
        this.holder.setText(R.id.tv_content, R.string.training_record_importing);
        this.holder.setGone(R.id.tv_not_display, true);
        this.holder.setGone(R.id.iv_hide, true);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        TextView textView = (TextView) this.holder.getView(R.id.tv_not_display);
        String string = this.context.getString(R.string.training_record_card_not_display_again);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new UnderlineSpan(), 0, string.length(), 0);
        textView.setText(spannableString);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onTrainingRecordSyncEvent(TrainingRecordSyncEvent trainingRecordSyncEvent) {
        if (trainingRecordSyncEvent.getSyncStatus() == TrainingRecordSyncEvent.SyncStatus.COMPLETED) {
            showSynced();
        } else if (trainingRecordSyncEvent.getSyncStatus() == TrainingRecordSyncEvent.SyncStatus.START && com.crrepa.band.my.training.utils.o.isEnabled()) {
            showSyncing();
        }
    }
}
