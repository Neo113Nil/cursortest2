package com.bytedance.sdk.openadsdk.core.mw.fs;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.doe;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes12.dex */
public class zmn extends com.bytedance.adsdk.ugeno.bvs.hhw.fs {
    public zmn(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.hhw.fs
    public void rt(String str) {
        super.rt(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(POBCommonConstants.NULL_VALUE, str)) {
            return;
        }
        try {
            String format = String.format(doe.zmn(this.fs, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.bvs.hhw.zmn) this.btk).setText("(" + format + ")");
        } catch (Exception unused) {
        }
    }
}
