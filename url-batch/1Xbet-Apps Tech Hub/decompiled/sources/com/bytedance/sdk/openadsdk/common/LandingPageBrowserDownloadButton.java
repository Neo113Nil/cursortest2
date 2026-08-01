package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class LandingPageBrowserDownloadButton extends Button {
    public LandingPageBrowserDownloadButton(Context context) {
        super(context);
        pvs();
    }

    private void pvs() {
        setId(kj.rcB);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, Pj.icD(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_browser_download_selector"));
        setText(uc.icD(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
