package com.crrepa.band.my.device.scan;

import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityScanHelpBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class ScanHelpActivity extends BaseVBActivity<ActivityScanHelpBinding> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        ((ActivityScanHelpBinding) this.binding).bar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityScanHelpBinding) this.binding).bar.tvExpandedTitle.setText(R.string.binding_see_help);
        ((ActivityScanHelpBinding) this.binding).bar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanHelpActivity.this.lambda$initBinding$0(view);
            }
        });
    }
}
