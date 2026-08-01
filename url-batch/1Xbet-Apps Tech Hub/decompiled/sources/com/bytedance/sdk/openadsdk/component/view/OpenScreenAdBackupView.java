package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.IP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;

/* loaded from: classes2.dex */
public class OpenScreenAdBackupView extends BackupView {
    private NativeExpressView pvs;

    public OpenScreenAdBackupView(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void pvs(View view, int i, IP ip) {
        NativeExpressView nativeExpressView = this.pvs;
        if (nativeExpressView != null) {
            nativeExpressView.pvs(view, i, ip);
        }
    }

    public void pvs(NativeExpressView nativeExpressView) {
        this.pvs = nativeExpressView;
        nativeExpressView.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
