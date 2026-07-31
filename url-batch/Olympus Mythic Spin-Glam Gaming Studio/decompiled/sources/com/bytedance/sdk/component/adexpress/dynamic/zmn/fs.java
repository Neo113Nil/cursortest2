package com.bytedance.sdk.component.adexpress.dynamic.zmn;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.am;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bjh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bvs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cyb;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.doe;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ev;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iqz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kgc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kjb;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.klz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nps;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nqi;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.olo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.phc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.so;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uqh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zak;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zn;
import com.bytedance.sdk.component.adexpress.dynamic.fb.zg;
import com.bytedance.sdk.component.adexpress.fb;
import com.bytedance.sdk.component.adexpress.fs.mw;

/* loaded from: classes5.dex */
public class fs {
    public static btk zmn(Context context, DynamicRootView dynamicRootView, zg zgVar) {
        mw renderRequest;
        if (context == null || dynamicRootView == null || zgVar == null || zgVar.iv() == null) {
            return null;
        }
        switch (zgVar.iv().zmn()) {
            case -1:
                return new yj(context, dynamicRootView, zgVar);
            case 0:
                return new bjh(context, dynamicRootView, zgVar);
            case 1:
                return new rc(context, dynamicRootView, zgVar);
            case 2:
                return new nps(context, dynamicRootView, zgVar);
            case 3:
                return new bvs(context, dynamicRootView, zgVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mw(context, dynamicRootView, zgVar);
            case 5:
                return new rt(context, dynamicRootView, zgVar);
            case 6:
            case 9:
            case 17:
                return new hhw(context, dynamicRootView, zgVar);
            case 7:
                return new ev(context, dynamicRootView, zgVar);
            case 8:
                return new kgc(context, dynamicRootView, zgVar);
            case 10:
                return new cyb(context, dynamicRootView, zgVar);
            case 11:
                return new uqh(context, dynamicRootView, zgVar);
            case 12:
                return new iv(context, dynamicRootView, zgVar);
            case 13:
                return new rp(context, dynamicRootView, zgVar);
            case 14:
                return new kjb(context, dynamicRootView, zgVar);
            case 15:
                if (fb.fs()) {
                    return new zak(context, dynamicRootView, zgVar);
                }
                return new am(context, dynamicRootView, zgVar);
            case 16:
                return new rc(context, dynamicRootView, zgVar);
            case 18:
                return new nqi(context, dynamicRootView, zgVar);
            case 19:
                return new doe(context, dynamicRootView, zgVar);
            case 20:
                return new iqz(context, dynamicRootView, zgVar);
            case 21:
                return new phc(context, dynamicRootView, zgVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zg(context, dynamicRootView, zgVar);
            case 23:
                return new olo(context, dynamicRootView, zgVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fb(context, dynamicRootView, zgVar);
            case 25:
                return new klz(context, dynamicRootView, zgVar);
            case 26:
                if ("vertical".equals(zgVar.iv().btk().es())) {
                    return new so(context, dynamicRootView, zgVar);
                }
                return new zn(context, dynamicRootView, zgVar);
            case 27:
                return new am(context, dynamicRootView, zgVar);
            case 28:
                if (!fb.fs() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new cn(context, dynamicRootView, zgVar, renderRequest.uqh());
            default:
                return null;
        }
    }
}
