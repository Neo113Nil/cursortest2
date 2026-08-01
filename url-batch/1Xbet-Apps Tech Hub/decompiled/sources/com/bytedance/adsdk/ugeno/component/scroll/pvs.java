package com.bytedance.adsdk.ugeno.component.scroll;

import android.content.Context;
import android.widget.ScrollView;
import com.bytedance.adsdk.ugeno.component.frame.pvs;
import com.bytedance.adsdk.ugeno.component.pvs;

/* compiled from: UGScrollLayoutWidget.java */
/* loaded from: classes.dex */
public class pvs extends com.bytedance.adsdk.ugeno.component.pvs<ScrollView> {
    public pvs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: cR, reason: merged with bridge method [inline-methods] */
    public ScrollView vG() {
        UGScrollView uGScrollView = new UGScrollView(this.icD);
        uGScrollView.pvs(this);
        return uGScrollView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.pvs
    public pvs.C0033pvs so() {
        return new pvs.C0032pvs();
    }
}
