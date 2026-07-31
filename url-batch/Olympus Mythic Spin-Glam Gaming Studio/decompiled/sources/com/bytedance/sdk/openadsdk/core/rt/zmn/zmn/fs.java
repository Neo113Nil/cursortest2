package com.bytedance.sdk.openadsdk.core.rt.zmn.zmn;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes15.dex */
public class fs {
    public static com.bytedance.sdk.openadsdk.core.rt.zmn zmn(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list, int i, double d) throws IOException, XmlPullParserException {
        String name;
        xmlPullParser.require(2, btk.nps, "InLine");
        com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.rt.zmn();
        while (true) {
            if (xmlPullParser.next() != 3 || !"InLine".equals(xmlPullParser.getName())) {
                if (xmlPullParser.getEventType() == 2) {
                    name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "AdVerifications":
                            zmnVar.zmn(fb.zmn(xmlPullParser));
                            continue;
                        case "Creatives":
                            if (!TextUtils.isEmpty(zmnVar.nps()) && zmnVar.zn() != null) {
                                break;
                            } else {
                                while (xmlPullParser.next() != 3) {
                                    if (xmlPullParser.getEventType() == 2) {
                                        if ("Creative".equals(xmlPullParser.getName())) {
                                            zmn(context, xmlPullParser, zmnVar, i, d);
                                        } else {
                                            btk.zmn(xmlPullParser);
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        case "Description":
                            zmnVar.fs(btk.fs(xmlPullParser, name));
                            continue;
                        case "Error":
                            list.addAll(btk.zmn(xmlPullParser, name));
                            continue;
                        case "Extensions":
                            while (true) {
                                if (xmlPullParser.getEventType() == 3 && VastTagName.EXTENSIONS.equals(xmlPullParser.getName())) {
                                    continue;
                                } else {
                                    xmlPullParser.next();
                                    if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                        zmnVar.zmn(fb.zmn(xmlPullParser));
                                    }
                                }
                            }
                            break;
                        case "AdTitle":
                            zmnVar.zmn(btk.fs(xmlPullParser, name));
                            continue;
                        case "Impression":
                            zmnVar.zmn().zmn(btk.zmn(xmlPullParser, name));
                            continue;
                    }
                    btk.zmn(xmlPullParser);
                }
            } else {
                zmnVar.zmn().iv(list);
                return zmnVar;
            }
        }
    }

    public static void zmn(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar, int i, double d) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(zmnVar.nps())) {
                    zn.zmn(xmlPullParser, zmnVar, i, d);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && zmnVar.zn() == null) {
                    zmnVar.zmn(zmn.zmn(context, xmlPullParser));
                } else {
                    btk.zmn(xmlPullParser);
                }
            }
        }
    }
}
