package com.crrepa.band.my.device.muslim.adapter;

import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.model.MuslimPray;
import com.crrepa.band.my.device.muslim.view.SwitchButton;

/* loaded from: classes2.dex */
public class PrayReminderSwitchAdapter extends BaseQuickAdapter<MuslimPray, BaseViewHolder> {
    private a itemCheckedChangeListener;

    public interface a {
        void onItemCheckedChange(boolean z7);
    }

    public PrayReminderSwitchAdapter() {
        super(R.layout.item_muslim_pray_reminder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$0(MuslimPray muslimPray, CompoundButton compoundButton, boolean z7) {
        muslimPray.setRemind(z7);
        a aVar = this.itemCheckedChangeListener;
        if (aVar != null) {
            aVar.onItemCheckedChange(z7);
        }
    }

    public void setItemCheckedChangeListener(a aVar) {
        this.itemCheckedChangeListener = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, final MuslimPray muslimPray) {
        baseViewHolder.setImageResource(R.id.iv_pray_time, muslimPray.getIcon());
        baseViewHolder.setText(R.id.tv_pray_name, muslimPray.getName());
        SwitchButton switchButton = (SwitchButton) baseViewHolder.getView(R.id.sbtn_prayer_reminder);
        switchButton.setCheckedNoEvent(muslimPray.isRemind());
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.adapter.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                PrayReminderSwitchAdapter.this.lambda$convert$0(muslimPray, compoundButton, z7);
            }
        });
    }
}
