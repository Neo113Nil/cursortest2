package com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: InLineParser.java */
/* loaded from: classes2.dex */
public class icD {
    public static com.bytedance.sdk.openadsdk.core.yiw.pvs pvs(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list, int i, double d) throws IOException, XmlPullParserException {
        String name;
        xmlPullParser.require(2, NB.yiw, "InLine");
        com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.yiw.pvs();
        while (true) {
            if (xmlPullParser.next() != 3 || !"InLine".equals(xmlPullParser.getName())) {
                if (xmlPullParser.getEventType() == 2) {
                    name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "AdVerifications":
                            pvsVar.pvs(Jd.pvs(xmlPullParser));
                            continue;
                        case "Creatives":
                            if (!TextUtils.isEmpty(pvsVar.yiw()) && pvsVar.vG() != null) {
                                break;
                            } else {
                                while (xmlPullParser.next() != 3) {
                                    if (xmlPullParser.getEventType() == 2) {
                                        if ("Creative".equals(xmlPullParser.getName())) {
                                            pvs(context, xmlPullParser, pvsVar, i, d);
                                        } else {
                                            NB.pvs(xmlPullParser);
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        case "Description":
                            pvsVar.icD(NB.icD(xmlPullParser, name));
                            continue;
                        case "Error":
                            list.addAll(NB.pvs(xmlPullParser, name));
                            continue;
                        case "Extensions":
                            while (true) {
                                if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                    continue;
                                } else {
                                    xmlPullParser.next();
                                    if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                        pvsVar.pvs(Jd.pvs(xmlPullParser));
                                    }
                                }
                            }
                            break;
                        case "AdTitle":
                            pvsVar.pvs(NB.icD(xmlPullParser, name));
                            continue;
                        case "Impression":
                            pvsVar.pvs().pvs(NB.pvs(xmlPullParser, name));
                            continue;
                    }
                    NB.pvs(xmlPullParser);
                }
            } else {
                pvsVar.pvs().Wyp(list);
                return pvsVar;
            }
        }
    }

    public static void pvs(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar, int i, double d) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(pvsVar.yiw())) {
                    vG.pvs(xmlPullParser, pvsVar, i, d);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && pvsVar.vG() == null) {
                    pvsVar.pvs(pvs.pvs(context, xmlPullParser));
                } else {
                    NB.pvs(xmlPullParser);
                }
            }
        }
    }
}
