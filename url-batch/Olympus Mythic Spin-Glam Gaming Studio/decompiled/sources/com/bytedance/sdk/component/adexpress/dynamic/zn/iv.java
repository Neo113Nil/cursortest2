package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class iv {
    public static nps zmn(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar, com.bytedance.sdk.component.adexpress.dynamic.fb.iv ivVar, com.bytedance.sdk.component.adexpress.fs.mw mwVar) {
        String vlj;
        String uqh;
        nps kwVar;
        String str = null;
        if (context == null || btkVar == null || npsVar == null) {
            return null;
        }
        vlj = npsVar.vlj();
        uqh = mwVar.uqh();
        vlj.hashCode();
        switch (vlj) {
            case "0":
                return new btk(context, btkVar, npsVar);
            case "1":
                return new zn(context, btkVar, npsVar);
            case "2":
                return new fs(context, btkVar, npsVar);
            case "5":
                if (npsVar.dgt() == 1) {
                    return new olo(context, btkVar, npsVar, npsVar.cd());
                }
                return new cyb(context, btkVar, npsVar);
            case "6":
            case "11":
                return new rt(context, btkVar, npsVar);
            case "7":
            case "14":
                return new klz(context, btkVar, npsVar);
            case "8":
                return new mw(context, btkVar, npsVar);
            case "9":
            case "16":
                return new cn(context, btkVar, npsVar, vlj, ivVar.zmn(), ivVar.fs(), ivVar.fb(), ivVar.nps());
            case "10":
                return new fb(context, btkVar, npsVar);
            case "12":
                return new cyb(context, btkVar, npsVar);
            case "13":
                return new olo(context, btkVar, npsVar);
            case "17":
            case "18":
                kwVar = new kw(context, btkVar, npsVar, vlj, ivVar);
                break;
            case "20":
                if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                    kwVar = new rc(context, btkVar, npsVar, uqh + "static/lotties/glass-swipe/glass-swipe.json", "20");
                    break;
                } else {
                    if (!TextUtils.isEmpty(uqh)) {
                        str = uqh + "brush_mask.json";
                    }
                    kwVar = new rc(context, btkVar, npsVar, str, "20");
                    break;
                }
            case "22":
                if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                    kwVar = new rc(context, btkVar, npsVar, uqh + "static/lotties/202327swiper-up-star/index.json", "22");
                    break;
                } else {
                    return new kgc(context, btkVar, npsVar);
                }
            case "23":
                if (!com.bytedance.sdk.component.adexpress.fb.fs()) {
                    return null;
                }
                kwVar = new rc(context, btkVar, npsVar, uqh + "static/lotties/202327swiper-up-star/click.json", "23");
                break;
            case "24":
                if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                    return new zmn(context, btkVar, npsVar);
                }
                if (!TextUtils.isEmpty(uqh)) {
                    str = uqh + "swiper_up_star.json";
                }
                kwVar = new rc(context, btkVar, npsVar, str, "24");
                break;
            case "25":
                if (!com.bytedance.sdk.component.adexpress.fb.fs()) {
                    return null;
                }
                kwVar = new rc(context, btkVar, npsVar, uqh + "static/lotties/gesture-slide.json", "25");
                break;
            case "29":
                return new hhw(context, btkVar, npsVar, ivVar.zmn(), ivVar.fs(), ivVar.fb(), ivVar.nps());
            default:
                return null;
        }
        return kwVar;
    }
}
