package com.bytedance.sdk.openadsdk.core.rt.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.rt.fs.zn;
import com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.btk;
import com.bytedance.sdk.openadsdk.core.rt.zn.zmn;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes13.dex */
public class zn {
    public static void zmn(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar, int i, double d) throws IOException, XmlPullParserException {
        boolean z = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z && TextUtils.isEmpty(zmnVar.nps())) {
                        btk.zmn(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "VideoClicks":
                            zmn(xmlPullParser, zmnVar);
                            break;
                        case "Duration":
                            zmnVar.zmn(fs(xmlPullParser));
                            break;
                        case "MediaFiles":
                            zmn(xmlPullParser, i, d, zmnVar);
                            z = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.rt.fs zmn = zmn(xmlPullParser);
                            if (zmn != null && zmnVar.fs() == null) {
                                zmnVar.zmn(zmn);
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            zmn(xmlPullParser, zmnVar.zmn());
                            break;
                        default:
                            btk.zmn(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static String zmn(XmlPullParser xmlPullParser, int i, double d, com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar) throws IOException, XmlPullParserException {
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = btk.nps;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int fs = btk.fs(xmlPullParser.getAttributeValue(str2, "width"));
                int fs2 = btk.fs(xmlPullParser.getAttributeValue(str2, "height"));
                int fs3 = btk.fs(xmlPullParser.getAttributeValue(str2, VastAttributes.BITRATE));
                String fs4 = btk.fs(xmlPullParser, "MediaFile");
                if (fs > 0 && fs2 > 0 && com.bytedance.sdk.openadsdk.core.rt.zn.fb.zmn.contains(attributeValue) && !TextUtils.isEmpty(fs4)) {
                    double zmn = com.bytedance.sdk.openadsdk.core.rt.zn.fb.zmn(i, d, fs, fs2, fs3, attributeValue);
                    if (zmn > d2) {
                        str = fs4;
                        d2 = zmn;
                        i2 = fs;
                        i3 = fs2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            zmnVar.fb(str);
            zmnVar.zmn(i2);
            zmnVar.fs(i3);
        }
        return str;
    }

    public static com.bytedance.sdk.openadsdk.core.rt.fs zmn(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        String str2;
        String str3;
        com.bytedance.sdk.openadsdk.core.rt.fs fsVar;
        String str4;
        String str5;
        int i;
        com.bytedance.sdk.openadsdk.core.rt.fs fsVar2;
        String str6;
        String str7;
        String str8;
        int i2;
        zmn.EnumC0182zmn enumC0182zmn;
        String str9;
        String str10;
        String str11 = "HTMLResource";
        String str12 = k.G;
        String str13 = "StaticResource";
        String str14 = "IFrameResource";
        String str15 = k.J;
        int i3 = 2;
        int i4 = 3;
        com.bytedance.sdk.openadsdk.core.rt.fs fsVar3 = null;
        while (true) {
            if (xmlPullParser.getEventType() == i4 && xmlPullParser.getName().equals(k.B)) {
                return fsVar3;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == i3 && xmlPullParser.getName().equals(k.C)) {
                String str16 = btk.nps;
                int fs = btk.fs(xmlPullParser.getAttributeValue(str16, "width"));
                int fs2 = btk.fs(xmlPullParser.getAttributeValue(str16, "height"));
                if (fs <= 0 || fs > 300 || fs2 <= 0 || fs2 > 300) {
                    str = str11;
                    str2 = str14;
                    str3 = str15;
                    fsVar = fsVar3;
                    str4 = str12;
                    btk.zmn(xmlPullParser);
                } else {
                    int zmn = com.bytedance.sdk.openadsdk.core.rt.fs.zmn.zmn(xmlPullParser.getAttributeValue(str16, "offset"));
                    int zmn2 = com.bytedance.sdk.openadsdk.core.rt.fs.zmn.zmn(xmlPullParser.getAttributeValue(str16, IronSourceConstants.EVENTS_DURATION));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    String str17 = str14;
                    String str18 = str15;
                    btk.zmn zmnVar = null;
                    String str19 = null;
                    while (true) {
                        if (xmlPullParser.next() != i4 || !xmlPullParser.getName().equals(k.C)) {
                            String str20 = str12;
                            String str21 = str13;
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        i = zmn2;
                                        str6 = str18;
                                        str7 = str17;
                                        str8 = str20;
                                        str13 = str21;
                                        if (name.equals(str6)) {
                                            i2 = 0;
                                            break;
                                        }
                                        i2 = -1;
                                        break;
                                    case -375340334:
                                        str7 = str17;
                                        str8 = str20;
                                        str13 = str21;
                                        if (!name.equals(str7)) {
                                            i = zmn2;
                                            str6 = str18;
                                            i2 = -1;
                                            break;
                                        } else {
                                            i2 = 1;
                                            i = zmn2;
                                            str6 = str18;
                                            break;
                                        }
                                    case 676623548:
                                        str8 = str20;
                                        str13 = str21;
                                        i = zmn2;
                                        str6 = str18;
                                        str7 = str17;
                                        if (name.equals(str13)) {
                                            i2 = 2;
                                            break;
                                        }
                                        i2 = -1;
                                        break;
                                    case 1030746596:
                                        str8 = str20;
                                        if (!name.equals(str8)) {
                                            i = zmn2;
                                            str6 = str18;
                                            str7 = str17;
                                            str13 = str21;
                                            i2 = -1;
                                            break;
                                        } else {
                                            i2 = i4;
                                            i = zmn2;
                                            str6 = str18;
                                            str7 = str17;
                                            str13 = str21;
                                            break;
                                        }
                                    case 1928285401:
                                        if (name.equals(str11)) {
                                            i2 = 4;
                                            i = zmn2;
                                            str6 = str18;
                                            str7 = str17;
                                            str8 = str20;
                                            str13 = str21;
                                            break;
                                        }
                                    default:
                                        i = zmn2;
                                        str6 = str18;
                                        str7 = str17;
                                        str8 = str20;
                                        str13 = str21;
                                        i2 = -1;
                                        break;
                                }
                                switch (i2) {
                                    case 0:
                                        str5 = str11;
                                        fsVar2 = fsVar3;
                                        arrayList2.add(new zn.zmn(btk.fs(xmlPullParser, str6)).zmn());
                                        break;
                                    case 1:
                                        str5 = str11;
                                        fsVar2 = fsVar3;
                                        if (zmnVar == null) {
                                            zmnVar = new btk.zmn(btk.fs(xmlPullParser, str7), zmn.EnumC0182zmn.NONE, zmn.fs.IFRAME_RESOURCE);
                                            break;
                                        }
                                        btk.zmn(xmlPullParser);
                                        break;
                                    case 2:
                                        str5 = str11;
                                        fsVar2 = fsVar3;
                                        zmn.EnumC0182zmn enumC0182zmn2 = zmn.EnumC0182zmn.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(btk.nps, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.rt.zn.zmn.zmn;
                                        String fs3 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.rt.zn.zmn.fs.contains(lowerCase)) ? btk.fs(xmlPullParser, str13) : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0182zmn = zmn.EnumC0182zmn.IMAGE;
                                        } else {
                                            enumC0182zmn = zmn.EnumC0182zmn.JAVASCRIPT;
                                        }
                                        zmnVar = new btk.zmn(fs3, enumC0182zmn, zmn.fs.STATIC_RESOURCE);
                                        break;
                                    case 3:
                                        str5 = str11;
                                        fsVar2 = fsVar3;
                                        while (true) {
                                            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals(str8)) {
                                                if (xmlPullParser.getEventType() == 2) {
                                                    if (xmlPullParser.getName().equals(k.H)) {
                                                        str19 = btk.fs(xmlPullParser, k.H);
                                                    } else if (xmlPullParser.getName().equals(k.I)) {
                                                        arrayList.add(new zn.zmn(btk.fs(xmlPullParser, k.I)).zmn());
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (zmnVar != null) {
                                            fsVar2 = fsVar3;
                                            if (zmnVar.zn != zmn.fs.IFRAME_RESOURCE) {
                                                str5 = str11;
                                                btk.zmn(xmlPullParser);
                                                break;
                                            }
                                        } else {
                                            fsVar2 = fsVar3;
                                        }
                                        str5 = str11;
                                        zmnVar = new btk.zmn(btk.fs(xmlPullParser, str11), zmn.EnumC0182zmn.NONE, zmn.fs.HTML_RESOURCE);
                                        break;
                                    default:
                                        str5 = str11;
                                        fsVar2 = fsVar3;
                                        btk.zmn(xmlPullParser);
                                        break;
                                }
                            } else {
                                str5 = str11;
                                i = zmn2;
                                fsVar2 = fsVar3;
                                str6 = str18;
                                str7 = str17;
                                str8 = str20;
                                str13 = str21;
                            }
                            str12 = str8;
                            str17 = str7;
                            str18 = str6;
                            fsVar3 = fsVar2;
                            zmn2 = i;
                            str11 = str5;
                            i4 = 3;
                        } else {
                            if (zmnVar == null || !(fsVar3 == null || TextUtils.isEmpty(fsVar3.btk()))) {
                                str9 = str12;
                                str10 = str13;
                            } else {
                                str9 = str12;
                                str10 = str13;
                                com.bytedance.sdk.openadsdk.core.rt.fs fsVar4 = new com.bytedance.sdk.openadsdk.core.rt.fs(fs, fs2, zmn, zmn2, zmnVar.fs, zmnVar.zn, zmnVar.zmn, arrayList, arrayList2, str19);
                                btk.zmn(xmlPullParser, k.B, i4);
                                fsVar3 = fsVar4;
                            }
                            str15 = str18;
                            str14 = str17;
                            str12 = str9;
                            str13 = str10;
                            i3 = 2;
                        }
                    }
                }
            } else {
                str = str11;
                str2 = str14;
                str3 = str15;
                fsVar = fsVar3;
                str4 = str12;
            }
            str12 = str4;
            str14 = str2;
            str15 = str3;
            fsVar3 = fsVar;
            str11 = str;
            i3 = 2;
            i4 = 3;
        }
    }

    public static double fs(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (btk.fs(xmlPullParser, "Duration").split(":").length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(r2[0].trim()) * 3600) + (Integer.parseInt(r2[1].trim()) * 60) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static void zmn(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.rt.fb fbVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(btk.nps, "event");
                    if (TextUtils.isEmpty(attributeValue)) {
                        btk.zmn(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "midpoint":
                                fbVar.zmn(btk.fs(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case "thirdQuartile":
                                fbVar.zmn(btk.fs(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case "resume":
                                fbVar.zn(zmn(xmlPullParser, true));
                                break;
                            case "unmute":
                                fbVar.klz(zmn(xmlPullParser, true));
                                break;
                            case "complete":
                                fbVar.fb(zn(xmlPullParser));
                                break;
                            case "mute":
                                fbVar.rc(zmn(xmlPullParser, true));
                                break;
                            case "skip":
                                fbVar.hhw(zn(xmlPullParser));
                                break;
                            case "close":
                                fbVar.btk(zn(xmlPullParser));
                                break;
                            case "pause":
                                fbVar.fs(zmn(xmlPullParser, true));
                                break;
                            case "start":
                            case "creativeView":
                                fbVar.zmn(btk.fs(xmlPullParser, "Tracking"), 0L);
                                break;
                            case "firstQuartile":
                                fbVar.zmn(btk.fs(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    btk.zmn(xmlPullParser);
                }
            }
        }
    }

    private static void zmn(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (!name.equals("ClickThrough")) {
                    if (name.equals("ClickTracking")) {
                        zmnVar.zmn().nps(btk.zmn(xmlPullParser, "ClickTracking"));
                    } else {
                        btk.zmn(xmlPullParser);
                    }
                } else {
                    zmnVar.zn(btk.fs(xmlPullParser, "ClickThrough"));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zn(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return zmn(xmlPullParser, false);
    }

    private static List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zmn(XmlPullParser xmlPullParser, boolean z) throws IOException, XmlPullParserException {
        return btk.zmn(xmlPullParser, "Tracking", z);
    }
}
