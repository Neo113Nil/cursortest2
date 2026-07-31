package com.bytedance.adsdk.ugeno.fb;

import android.content.Context;
import com.yandex.div.core.DivActionHandler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class zmn implements zg {
    @Override // com.bytedance.adsdk.ugeno.fb.zg
    public List<nps> zmn() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nps("slide") { // from class: com.bytedance.adsdk.ugeno.fb.zmn.1
            @Override // com.bytedance.adsdk.ugeno.fb.nps
            public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context) {
                return new com.bytedance.adsdk.ugeno.fb.fb.btk(context);
            }
        });
        arrayList.add(new nps("tap") { // from class: com.bytedance.adsdk.ugeno.fb.zmn.2
            @Override // com.bytedance.adsdk.ugeno.fb.nps
            public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context) {
                return new com.bytedance.adsdk.ugeno.fb.fb.bvs(context);
            }
        });
        arrayList.add(new nps(DivActionHandler.DivActionReason.TIMER) { // from class: com.bytedance.adsdk.ugeno.fb.zmn.3
            @Override // com.bytedance.adsdk.ugeno.fb.nps
            public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context) {
                return new com.bytedance.adsdk.ugeno.fb.fb.iv(context);
            }
        });
        arrayList.add(new nps("touchStart") { // from class: com.bytedance.adsdk.ugeno.fb.zmn.4
            @Override // com.bytedance.adsdk.ugeno.fb.nps
            public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context) {
                return new com.bytedance.adsdk.ugeno.fb.fb.klz(context);
            }
        });
        arrayList.add(new nps("touchEnd") { // from class: com.bytedance.adsdk.ugeno.fb.zmn.5
            @Override // com.bytedance.adsdk.ugeno.fb.nps
            public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context) {
                return new com.bytedance.adsdk.ugeno.fb.fb.rc(context);
            }
        });
        arrayList.add(new nps("animateState") { // from class: com.bytedance.adsdk.ugeno.fb.zmn.6
            @Override // com.bytedance.adsdk.ugeno.fb.nps
            public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context) {
                return new com.bytedance.adsdk.ugeno.fb.fb.fs(context);
            }
        });
        return arrayList;
    }
}
