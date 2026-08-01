package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;

/* compiled from: InteractViewFactory.java */
/* loaded from: classes.dex */
public class Wyp {
    public static so pvs(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar, com.bytedance.sdk.component.adexpress.dynamic.vG.Wyp wyp, com.bytedance.sdk.component.adexpress.icD.Ju ju) {
        String jhZ;
        String ZhG;
        if (context == null || dynamicBaseWidget == null || yiwVar == null) {
            return null;
        }
        jhZ = yiwVar.jhZ();
        ZhG = ju.ZhG();
        jhZ.hashCode();
        switch (jhZ) {
            case "0":
                return new sUS(context, dynamicBaseWidget, yiwVar);
            case "1":
                break;
            case "2":
                return new vG(context, dynamicBaseWidget, yiwVar);
            case "5":
                if (yiwVar.yWX() == 1) {
                    return new cR(context, dynamicBaseWidget, yiwVar, yiwVar.Cwg());
                }
                return new mnm(context, dynamicBaseWidget, yiwVar);
            case "6":
            case "11":
                return new IP(context, dynamicBaseWidget, yiwVar);
            case "7":
            case "14":
                return new kj(context, dynamicBaseWidget, yiwVar);
            case "8":
                return new Ju(context, dynamicBaseWidget, yiwVar);
            case "9":
            case "16":
                return new bNS(context, dynamicBaseWidget, yiwVar, jhZ, wyp.pvs(), wyp.icD(), wyp.Jd(), wyp.yiw());
            case "10":
                return new NB(context, dynamicBaseWidget, yiwVar);
            case "12":
                return new mnm(context, dynamicBaseWidget, yiwVar);
            case "13":
                return new cR(context, dynamicBaseWidget, yiwVar);
            case "17":
            case "18":
                return new uc(context, dynamicBaseWidget, yiwVar, jhZ, wyp);
            case "20":
                return new icD(context, dynamicBaseWidget, yiwVar);
            case "22":
                if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                    return new vA(context, dynamicBaseWidget, yiwVar);
                }
                return new zM(context, dynamicBaseWidget, yiwVar);
            case "23":
                if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                    return new qh(context, dynamicBaseWidget, yiwVar, ZhG + "static/lotties/202327swiper-up-star/click.json");
                }
                return null;
            case "24":
                if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                    return new pvs(context, dynamicBaseWidget, yiwVar);
                }
                return new vA(context, dynamicBaseWidget, yiwVar);
            case "25":
                if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                    new qh(context, dynamicBaseWidget, yiwVar, ZhG + "static/lotties/gesture-slide.json");
                    break;
                }
                break;
            case "29":
                return new yiw(context, dynamicBaseWidget, yiwVar, wyp.pvs(), wyp.icD(), wyp.Jd(), wyp.yiw());
            default:
                return null;
        }
        return new Jd(context, dynamicBaseWidget, yiwVar);
    }
}
