package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultComponentBehavior.java */
/* loaded from: classes.dex */
public class NB implements vG {
    @Override // com.bytedance.adsdk.ugeno.core.vG
    public List<icD> pvs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new icD("Text") { // from class: com.bytedance.adsdk.ugeno.core.NB.1
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.text.icD(context);
            }
        });
        arrayList.add(new icD("Image") { // from class: com.bytedance.adsdk.ugeno.core.NB.4
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.image.icD(context);
            }
        });
        arrayList.add(new icD("FlexLayout") { // from class: com.bytedance.adsdk.ugeno.core.NB.5
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.flexbox.NB(context);
            }
        });
        arrayList.add(new icD("FrameLayout") { // from class: com.bytedance.adsdk.ugeno.core.NB.6
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.frame.pvs(context);
            }
        });
        arrayList.add(new icD("ScrollLayout") { // from class: com.bytedance.adsdk.ugeno.core.NB.7
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.scroll.pvs(context);
            }
        });
        arrayList.add(new icD("RichText") { // from class: com.bytedance.adsdk.ugeno.core.NB.8
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.text.pvs(context);
            }
        });
        arrayList.add(new icD("Input") { // from class: com.bytedance.adsdk.ugeno.core.NB.9
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.input.pvs(context);
            }
        });
        arrayList.add(new icD("Dislike") { // from class: com.bytedance.adsdk.ugeno.core.NB.10
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.dislike.pvs(context);
            }
        });
        arrayList.add(new icD("RatingBar") { // from class: com.bytedance.adsdk.ugeno.core.NB.11
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.ratingbar.pvs(context);
            }
        });
        arrayList.add(new icD("UgenProgressView") { // from class: com.bytedance.adsdk.ugeno.core.NB.2
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.progressbar.pvs(context);
            }
        });
        arrayList.add(new icD("ProgressButton") { // from class: com.bytedance.adsdk.ugeno.core.NB.3
            @Override // com.bytedance.adsdk.ugeno.core.icD
            public com.bytedance.adsdk.ugeno.component.icD pvs(Context context) {
                return new com.bytedance.adsdk.ugeno.component.progressbar.pvs(context);
            }
        });
        return arrayList;
    }
}
