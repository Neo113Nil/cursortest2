package com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.NB;
import com.bytedance.sdk.openadsdk.core.yiw.vG.pvs;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: CompanionAdsParser.java */
/* loaded from: classes2.dex */
public class pvs {
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x0120. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.sdk.openadsdk.core.yiw.vG pvs(Context context, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        com.bytedance.sdk.openadsdk.core.yiw.vG vGVar;
        NB.pvs pvsVar;
        int i;
        pvs.EnumC0089pvs enumC0089pvs;
        int i2;
        int i3;
        char c;
        if (context == null) {
            NB.pvs(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        int i6 = (int) (i4 / displayMetrics.density);
        int i7 = (int) (i5 / displayMetrics.density);
        float f = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.yiw.vG vGVar2 = null;
        while (true) {
            int i8 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return vGVar2;
            }
            xmlPullParser.next();
            int i9 = 2;
            if (xmlPullParser.getEventType() == 2) {
                String str = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    int icD = NB.icD(xmlPullParser.getAttributeValue(NB.yiw, "width"));
                    int icD2 = NB.icD(xmlPullParser.getAttributeValue(NB.yiw, "height"));
                    if (icD < 300 || icD2 < 250) {
                        vGVar = vGVar2;
                        NB.pvs(xmlPullParser);
                        vGVar2 = vGVar;
                    } else {
                        NB.pvs pvsVar2 = new NB.pvs();
                        while (true) {
                            if (xmlPullParser.getEventType() != i8 || !xmlPullParser.getName().equals(str)) {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i9) {
                                    String name = xmlPullParser.getName();
                                    name.hashCode();
                                    com.bytedance.sdk.openadsdk.core.yiw.vG vGVar3 = vGVar2;
                                    String str2 = str;
                                    char c2 = 65535;
                                    switch (name.hashCode()) {
                                        case -375340334:
                                            if (name.equals("IFrameResource")) {
                                                c = 0;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name.equals("CompanionClickThrough")) {
                                                c = 1;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name.equals("TrackingEvents")) {
                                                c2 = 2;
                                                break;
                                            }
                                            break;
                                        case 676623548:
                                            if (name.equals("StaticResource")) {
                                                c2 = 3;
                                                break;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name.equals("CompanionClickTracking")) {
                                                c = 4;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name.equals("HTMLResource")) {
                                                c = 5;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            NB.pvs pvsVar3 = pvsVar2;
                                            int i10 = icD2;
                                            int i11 = icD;
                                            Point pvs = com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.pvs(context, i11, i10, pvs.icD.HTML_RESOURCE);
                                            float pvs2 = com.bytedance.sdk.openadsdk.core.yiw.vG.pvs(i6, i7, pvs.x, pvs.y, pvs.icD.IFRAME_RESOURCE, pvs.EnumC0089pvs.NONE);
                                            String icD3 = NB.icD(xmlPullParser, "IFrameResource");
                                            if (TextUtils.isEmpty(icD3) || pvs2 <= pvsVar3.yiw || pvs2 <= f) {
                                                i2 = 3;
                                                NB.pvs(xmlPullParser, "IFrameResource", 3);
                                                pvsVar2 = pvsVar3;
                                                icD2 = i10;
                                                icD = i11;
                                                i9 = 2;
                                                vGVar2 = vGVar3;
                                                str = str2;
                                                i8 = i2;
                                                break;
                                            } else {
                                                pvsVar3.yiw = pvs2;
                                                pvsVar3.pvs(icD3, pvs.EnumC0089pvs.NONE, pvs.icD.IFRAME_RESOURCE);
                                                pvsVar2 = pvsVar3;
                                                icD2 = i10;
                                                icD = i11;
                                                i9 = 2;
                                                vGVar2 = vGVar3;
                                                str = str2;
                                                i8 = 3;
                                                break;
                                            }
                                        case 1:
                                            pvsVar2.Jd = NB.icD(xmlPullParser, "CompanionClickThrough");
                                            i9 = 2;
                                            icD = icD;
                                            vGVar2 = vGVar3;
                                            str = str2;
                                            i8 = 3;
                                            break;
                                        case 2:
                                            pvsVar = pvsVar2;
                                            i3 = icD2;
                                            i = icD;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    icD2 = i3;
                                                    icD = i;
                                                    pvsVar2 = pvsVar;
                                                    vGVar2 = vGVar3;
                                                    str = str2;
                                                    i8 = 3;
                                                    i9 = 2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    pvsVar.icD(NB.icD(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case 3:
                                            pvsVar = pvsVar2;
                                            int i12 = icD2;
                                            i = icD;
                                            pvs.EnumC0089pvs enumC0089pvs2 = pvs.EnumC0089pvs.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(NB.yiw, "creativeType").toLowerCase();
                                            if (com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.pvs.contains(lowerCase)) {
                                                enumC0089pvs = pvs.EnumC0089pvs.IMAGE;
                                            } else {
                                                enumC0089pvs = pvs.EnumC0089pvs.JAVASCRIPT;
                                            }
                                            pvs.EnumC0089pvs enumC0089pvs3 = enumC0089pvs;
                                            Point pvs3 = com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.pvs(context, i, i12, pvs.icD.STATIC_RESOURCE);
                                            float pvs4 = com.bytedance.sdk.openadsdk.core.yiw.vG.pvs(i6, i7, pvs3.x, pvs3.y, pvs.icD.STATIC_RESOURCE, enumC0089pvs3);
                                            String icD4 = (com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.pvs.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.icD.contains(lowerCase)) ? NB.icD(xmlPullParser, "StaticResource") : null;
                                            if (pvs4 < pvsVar.yiw || pvs4 <= f || TextUtils.isEmpty(icD4)) {
                                                i2 = 3;
                                                NB.pvs(xmlPullParser, "StaticResource", 3);
                                                icD2 = i12;
                                                icD = i;
                                                pvsVar2 = pvsVar;
                                                vGVar2 = vGVar3;
                                                str = str2;
                                                i9 = 2;
                                                i8 = i2;
                                                break;
                                            } else {
                                                pvsVar.yiw = pvs4;
                                                pvsVar.pvs(icD4, enumC0089pvs3, pvs.icD.STATIC_RESOURCE);
                                                icD2 = i12;
                                                icD = i;
                                                pvsVar2 = pvsVar;
                                                vGVar2 = vGVar3;
                                                str = str2;
                                                i8 = 3;
                                                i9 = 2;
                                                break;
                                            }
                                            break;
                                        case 4:
                                            pvsVar2.pvs(NB.icD(xmlPullParser, "CompanionClickTracking"));
                                            vGVar2 = vGVar3;
                                            str = str2;
                                            i8 = 3;
                                            i9 = 2;
                                            break;
                                        case 5:
                                            Point pvs5 = com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.pvs(context, icD, icD2, pvs.icD.HTML_RESOURCE);
                                            pvsVar = pvsVar2;
                                            int i13 = icD2;
                                            int i14 = icD;
                                            float pvs6 = com.bytedance.sdk.openadsdk.core.yiw.vG.pvs(i6, i7, pvs5.x, pvs5.y, pvs.icD.HTML_RESOURCE, pvs.EnumC0089pvs.NONE);
                                            String icD5 = NB.icD(xmlPullParser, "HTMLResource");
                                            if (TextUtils.isEmpty(icD5) || pvs6 <= pvsVar.yiw || pvs6 <= f) {
                                                NB.pvs(xmlPullParser, "HTMLResource", 3);
                                                icD2 = i13;
                                                i8 = 3;
                                                icD = i14;
                                                pvsVar2 = pvsVar;
                                                vGVar2 = vGVar3;
                                                str = str2;
                                                i9 = 2;
                                                break;
                                            } else {
                                                pvsVar.yiw = pvs6;
                                                pvsVar.pvs(icD5, pvs.EnumC0089pvs.NONE, pvs.icD.HTML_RESOURCE);
                                                icD2 = i13;
                                                icD = i14;
                                                pvsVar2 = pvsVar;
                                                vGVar2 = vGVar3;
                                                str = str2;
                                                i8 = 3;
                                                i9 = 2;
                                            }
                                            break;
                                        default:
                                            NB.pvs(xmlPullParser);
                                            pvsVar = pvsVar2;
                                            i3 = icD2;
                                            i = icD;
                                            icD2 = i3;
                                            icD = i;
                                            pvsVar2 = pvsVar;
                                            vGVar2 = vGVar3;
                                            str = str2;
                                            i8 = 3;
                                            i9 = 2;
                                            break;
                                    }
                                }
                            } else if (!TextUtils.isEmpty(pvsVar2.pvs) && pvsVar2.yiw >= f) {
                                vGVar2 = new com.bytedance.sdk.openadsdk.core.yiw.vG(icD, icD2, pvsVar2.icD, pvsVar2.vG, pvsVar2.pvs, pvsVar2.NB, pvsVar2.sUS, pvsVar2.Jd);
                                f = pvsVar2.yiw;
                            }
                        }
                    }
                }
            }
            vGVar = vGVar2;
            vGVar2 = vGVar;
        }
    }
}
