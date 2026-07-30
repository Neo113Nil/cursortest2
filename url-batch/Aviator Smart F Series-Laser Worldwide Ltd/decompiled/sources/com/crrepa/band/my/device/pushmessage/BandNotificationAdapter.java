package com.crrepa.band.my.device.pushmessage;

import android.widget.CompoundButton;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.MessageModel;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public class BandNotificationAdapter extends BaseQuickAdapter<MessageModel, BaseViewHolder> {
    private b onItemCheckedChangeListener;

    class a implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ MessageModel val$item;

        a(MessageModel messageModel) {
            this.val$item = messageModel;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            this.val$item.setEnable(z7);
            BandNotificationAdapter.this.onItemCheckedChangeListener.onCheckedChanged(BandNotificationAdapter.this.getItemPosition(this.val$item), this.val$item.getType(), z7);
        }
    }

    public interface b {
        void onCheckedChanged(int i8, int i9, boolean z7);
    }

    public BandNotificationAdapter() {
        super(R.layout.item_message);
    }

    public void setOnItemCheckedChangeListener(b bVar) {
        this.onItemCheckedChangeListener = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, MessageModel messageModel) {
        baseViewHolder.setImageResource(R.id.iv_message_icon, messageModel.getIcon());
        baseViewHolder.setText(R.id.tv_message_name, messageModel.getName());
        SwitchButton switchButton = (SwitchButton) baseViewHolder.getView(R.id.sbtn_message);
        switchButton.setCheckedNoEvent(messageModel.isEnable());
        switchButton.setOnCheckedChangeListener(new a(messageModel));
    }
}
