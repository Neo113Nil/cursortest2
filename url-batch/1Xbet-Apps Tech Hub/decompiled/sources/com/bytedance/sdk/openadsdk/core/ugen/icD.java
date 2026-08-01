package com.bytedance.sdk.openadsdk.core.ugen;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGenInitHelper.java */
/* loaded from: classes2.dex */
public class icD {
    public static void pvs(Context context) {
        com.bytedance.adsdk.ugeno.vG.pvs().pvs(context, new com.bytedance.adsdk.ugeno.core.vG() { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.1
            @Override // com.bytedance.adsdk.ugeno.core.vG
            public List<com.bytedance.adsdk.ugeno.core.icD> pvs() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.bytedance.adsdk.ugeno.core.icD("Gif") { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.1.1
                    @Override // com.bytedance.adsdk.ugeno.core.icD
                    public com.bytedance.adsdk.ugeno.component.icD pvs(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.icD(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.icD("Lottie") { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.1.2
                    @Override // com.bytedance.adsdk.ugeno.core.icD
                    public com.bytedance.adsdk.ugeno.component.icD pvs(Context context2) {
                        return new com.bytedance.adsdk.icD.pvs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.icD("Logo") { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.1.3
                    @Override // com.bytedance.adsdk.ugeno.core.icD
                    public com.bytedance.adsdk.ugeno.component.icD pvs(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.vG(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.icD("CommentNum") { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.1.4
                    @Override // com.bytedance.adsdk.ugeno.core.icD
                    public com.bytedance.adsdk.ugeno.component.icD pvs(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.pvs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.icD("Video") { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.1.5
                    @Override // com.bytedance.adsdk.ugeno.core.icD
                    public com.bytedance.adsdk.ugeno.component.icD pvs(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.video.pvs(context2);
                    }
                });
                return arrayList;
            }
        }, new pvs());
    }
}
