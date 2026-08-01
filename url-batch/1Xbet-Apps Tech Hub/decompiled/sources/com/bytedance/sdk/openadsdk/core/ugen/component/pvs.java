package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: CommentNumWidget.java */
/* loaded from: classes2.dex */
public class pvs extends com.bytedance.adsdk.ugeno.component.text.icD {
    public pvs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.text.icD
    public void NB(String str) {
        super.NB(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            return;
        }
        try {
            ((TextView) this.NB).setText("(" + String.format(uc.pvs(this.icD, "tt_comment_num_backup"), Integer.valueOf(Integer.parseInt(str))) + ")");
        } catch (Exception unused) {
        }
    }
}
