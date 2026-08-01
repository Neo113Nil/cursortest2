package com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.NB;
import com.bytedance.sdk.openadsdk.core.yiw.vG.pvs;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.ktor.http.LinkHeader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: LinearParser.java */
/* loaded from: classes2.dex */
public class vG {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0050, code lost:
    
        if (r2.equals("Icons") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pvs(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar, int i, double d) throws IOException, XmlPullParserException {
        boolean z = false;
        while (true) {
            char c = 3;
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z && TextUtils.isEmpty(pvsVar.yiw())) {
                        NB.pvs(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name.hashCode()) {
                        case -2049897434:
                            if (name.equals("VideoClicks")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1927368268:
                            if (name.equals("Duration")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -385055469:
                            if (name.equals("MediaFiles")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 70476538:
                            break;
                        case 611554000:
                            if (name.equals("TrackingEvents")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            pvs(xmlPullParser, pvsVar);
                            break;
                        case 1:
                            pvsVar.pvs(icD(xmlPullParser));
                            break;
                        case 2:
                            pvs(xmlPullParser, i, d, pvsVar);
                            z = true;
                            break;
                        case 3:
                            com.bytedance.sdk.openadsdk.core.yiw.icD pvs = pvs(xmlPullParser);
                            if (pvs != null && pvsVar.icD() == null) {
                                pvsVar.pvs(pvs);
                                break;
                            }
                            break;
                        case 4:
                            pvs(xmlPullParser, pvsVar.pvs());
                            break;
                        default:
                            NB.pvs(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static String pvs(XmlPullParser xmlPullParser, int i, double d, com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar) throws IOException, XmlPullParserException {
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String attributeValue = xmlPullParser.getAttributeValue(NB.yiw, LinkHeader.Parameters.Type);
                int icD = NB.icD(xmlPullParser.getAttributeValue(NB.yiw, "width"));
                int icD2 = NB.icD(xmlPullParser.getAttributeValue(NB.yiw, "height"));
                int icD3 = NB.icD(xmlPullParser.getAttributeValue(NB.yiw, "bitrate"));
                String icD4 = NB.icD(xmlPullParser, "MediaFile");
                if (icD > 0 && icD2 > 0 && com.bytedance.sdk.openadsdk.core.yiw.vG.Jd.pvs.contains(attributeValue) && !TextUtils.isEmpty(icD4)) {
                    double pvs = com.bytedance.sdk.openadsdk.core.yiw.vG.Jd.pvs(i, d, icD, icD2, icD3, attributeValue);
                    if (pvs > d2) {
                        str = icD4;
                        i2 = icD;
                        d2 = pvs;
                        i3 = icD2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            pvsVar.Jd(str);
            pvsVar.pvs(i2);
            pvsVar.icD(i3);
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.sdk.openadsdk.core.yiw.icD pvs(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        com.bytedance.sdk.openadsdk.core.yiw.icD icd;
        com.bytedance.sdk.openadsdk.core.yiw.icD icd2;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        pvs.EnumC0089pvs enumC0089pvs;
        char c;
        com.bytedance.sdk.openadsdk.core.yiw.icD icd3 = null;
        while (true) {
            int i5 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return icd3;
            }
            xmlPullParser.next();
            int i6 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                int icD = NB.icD(xmlPullParser.getAttributeValue(NB.yiw, "width"));
                int icD2 = NB.icD(xmlPullParser.getAttributeValue(NB.yiw, "height"));
                if (icD <= 0 || icD > 300 || icD2 <= 0 || icD2 > 300) {
                    icd = icd3;
                    NB.pvs(xmlPullParser);
                } else {
                    int pvs = com.bytedance.sdk.openadsdk.core.yiw.icD.pvs.pvs(xmlPullParser.getAttributeValue(NB.yiw, TypedValues.CycleType.S_WAVE_OFFSET));
                    int pvs2 = com.bytedance.sdk.openadsdk.core.yiw.icD.pvs.pvs(xmlPullParser.getAttributeValue(NB.yiw, TypedValues.TransitionType.S_DURATION));
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    NB.pvs pvsVar = null;
                    String str = null;
                    while (true) {
                        if (xmlPullParser.next() != i5 || !xmlPullParser.getName().equals("Icon")) {
                            ArrayList arrayList4 = arrayList3;
                            ArrayList arrayList5 = arrayList2;
                            if (xmlPullParser.getEventType() == i6) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                icd2 = icd3;
                                char c2 = 65535;
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals("IconViewTracking")) {
                                            c = 0;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c = 1;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c2 = 2;
                                            break;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals("IconClicks")) {
                                            c2 = 3;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c = 4;
                                            c2 = c;
                                            break;
                                        }
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        i2 = 3;
                                        i = 2;
                                        arrayList = arrayList4;
                                        arrayList.add(new vG.pvs(NB.icD(xmlPullParser, "IconViewTracking")).pvs());
                                        break;
                                    case 1:
                                        i3 = 3;
                                        i4 = 2;
                                        if (pvsVar == null) {
                                            pvsVar = new NB.pvs(NB.icD(xmlPullParser, "IFrameResource"), pvs.EnumC0089pvs.NONE, pvs.icD.IFRAME_RESOURCE);
                                            arrayList2 = arrayList5;
                                            i5 = i3;
                                            i6 = i4;
                                            icd3 = icd2;
                                            arrayList3 = arrayList4;
                                            break;
                                        }
                                        NB.pvs(xmlPullParser);
                                        arrayList2 = arrayList5;
                                        i5 = i3;
                                        i6 = i4;
                                        icd3 = icd2;
                                        arrayList3 = arrayList4;
                                    case 2:
                                        i3 = 3;
                                        i4 = 2;
                                        pvs.EnumC0089pvs enumC0089pvs2 = pvs.EnumC0089pvs.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(NB.yiw, "creativeType").toLowerCase();
                                        String icD3 = (com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.pvs.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.icD.contains(lowerCase)) ? NB.icD(xmlPullParser, "StaticResource") : null;
                                        if (com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.pvs.contains(lowerCase)) {
                                            enumC0089pvs = pvs.EnumC0089pvs.IMAGE;
                                        } else {
                                            enumC0089pvs = pvs.EnumC0089pvs.JAVASCRIPT;
                                        }
                                        pvsVar = new NB.pvs(icD3, enumC0089pvs, pvs.icD.STATIC_RESOURCE);
                                        arrayList2 = arrayList5;
                                        i5 = i3;
                                        i6 = i4;
                                        icd3 = icd2;
                                        arrayList3 = arrayList4;
                                        break;
                                    case 3:
                                        while (true) {
                                            i3 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i4 = 2;
                                                arrayList2 = arrayList5;
                                                i5 = i3;
                                                i6 = i4;
                                                icd3 = icd2;
                                                arrayList3 = arrayList4;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    str = NB.icD(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList5.add(new vG.pvs(NB.icD(xmlPullParser, "IconClickTracking")).pvs());
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (pvsVar == null || pvsVar.vG == pvs.icD.IFRAME_RESOURCE) {
                                            pvsVar = new NB.pvs(NB.icD(xmlPullParser, "HTMLResource"), pvs.EnumC0089pvs.NONE, pvs.icD.HTML_RESOURCE);
                                            arrayList2 = arrayList5;
                                            icd3 = icd2;
                                            arrayList3 = arrayList4;
                                            i5 = 3;
                                            i6 = 2;
                                            break;
                                        } else {
                                            i3 = 3;
                                            i4 = 2;
                                            NB.pvs(xmlPullParser);
                                            arrayList2 = arrayList5;
                                            i5 = i3;
                                            i6 = i4;
                                            icd3 = icd2;
                                            arrayList3 = arrayList4;
                                            break;
                                        }
                                        break;
                                    default:
                                        i3 = 3;
                                        i4 = 2;
                                        NB.pvs(xmlPullParser);
                                        arrayList2 = arrayList5;
                                        i5 = i3;
                                        i6 = i4;
                                        icd3 = icd2;
                                        arrayList3 = arrayList4;
                                        break;
                                }
                            } else {
                                icd2 = icd3;
                                i = i6;
                                arrayList = arrayList4;
                                i2 = 3;
                            }
                            arrayList2 = arrayList5;
                            i5 = i2;
                            i6 = i;
                            arrayList3 = arrayList;
                            icd3 = icd2;
                        } else if (pvsVar != null && (icd3 == null || TextUtils.isEmpty(icd3.sUS()))) {
                            icd3 = new com.bytedance.sdk.openadsdk.core.yiw.icD(icD, icD2, pvs, pvs2, pvsVar.icD, pvsVar.vG, pvsVar.pvs, arrayList2, arrayList3, str);
                            NB.pvs(xmlPullParser, "Icons", 3);
                        }
                    }
                }
            } else {
                icd = icd3;
            }
            icd3 = icd;
        }
    }

    public static double icD(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (NB.icD(xmlPullParser, "Duration").split(":").length != 3) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        try {
            return (Integer.parseInt(r2[0].trim()) * 60 * 60) + (Integer.parseInt(r2[1].trim()) * 60) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00af, code lost:
    
        if (r0.equals("unmute") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pvs(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.yiw.Jd jd) throws IOException, XmlPullParserException {
        while (true) {
            char c = 3;
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(NB.yiw, NotificationCompat.CATEGORY_EVENT);
                    if (TextUtils.isEmpty(attributeValue)) {
                        NB.pvs(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -1638835128:
                                if (attributeValue.equals("midpoint")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1337830390:
                                if (attributeValue.equals("thirdQuartile")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -934426579:
                                if (attributeValue.equals("resume")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -840405966:
                                break;
                            case -599445191:
                                if (attributeValue.equals("complete")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3363353:
                                if (attributeValue.equals("mute")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3532159:
                                if (attributeValue.equals("skip")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 94756344:
                                if (attributeValue.equals("close")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 106440182:
                                if (attributeValue.equals("pause")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 109757538:
                                if (attributeValue.equals("start")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 560220243:
                                if (attributeValue.equals("firstQuartile")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1778167540:
                                if (attributeValue.equals("creativeView")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                jd.pvs(NB.icD(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case 1:
                                jd.pvs(NB.icD(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case 2:
                                jd.vG(vG(xmlPullParser));
                                break;
                            case 3:
                                jd.kj(vG(xmlPullParser));
                                break;
                            case 4:
                                jd.Jd(vG(xmlPullParser));
                                break;
                            case 5:
                                jd.qh(vG(xmlPullParser));
                                break;
                            case 6:
                                jd.sUS(vG(xmlPullParser));
                                break;
                            case 7:
                                jd.NB(vG(xmlPullParser));
                                break;
                            case '\b':
                                jd.icD(vG(xmlPullParser));
                                break;
                            case '\t':
                            case 11:
                                jd.pvs(NB.icD(xmlPullParser, "Tracking"), 0L);
                                break;
                            case '\n':
                                jd.pvs(NB.icD(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    NB.pvs(xmlPullParser);
                }
            }
        }
    }

    private static void pvs(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ClickThrough")) {
                    pvsVar.vG(NB.icD(xmlPullParser, "ClickThrough"));
                } else if (name.equals("ClickTracking")) {
                    pvsVar.pvs().yiw(NB.pvs(xmlPullParser, "ClickTracking"));
                } else {
                    NB.pvs(xmlPullParser);
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> vG(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return NB.pvs(xmlPullParser, "Tracking");
    }
}
