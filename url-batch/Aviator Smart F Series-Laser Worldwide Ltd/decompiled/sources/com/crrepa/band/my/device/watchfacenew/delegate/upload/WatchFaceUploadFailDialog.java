package com.crrepa.band.my.device.watchfacenew.delegate.upload;

import android.content.Context;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.DialogWatchFaceUploadFailBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;

/* loaded from: classes2.dex */
public class WatchFaceUploadFailDialog extends BaseVBDialog<DialogWatchFaceUploadFailBinding> {
    public WatchFaceUploadFailDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ((DialogWatchFaceUploadFailBinding) this.binding).tvOk.setText(R.string.confirm);
        ((DialogWatchFaceUploadFailBinding) this.binding).ivIcon.setImageResource(R$drawable.ic_transfer_fail);
        ((DialogWatchFaceUploadFailBinding) this.binding).tvOk.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.upload.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceUploadFailDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogWatchFaceUploadFailBinding) this.binding).tvContent.setText(R.string.device_watch_face_update_fail_alrt_title);
    }
}
