package com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bumptech.glide.load.Key;
import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import com.bytedance.sdk.openadsdk.core.yiw.pvs.icD;
import com.bytedance.sdk.openadsdk.core.yiw.vG.pvs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VastXmlPullParser.java */
/* loaded from: classes2.dex */
public class NB extends com.bytedance.sdk.openadsdk.core.yiw.pvs.icD {
    public static final String yiw = null;

    public NB(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.yiw.pvs.icD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.openadsdk.core.yiw.pvs pvs(String str, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        ByteArrayInputStream byteArrayInputStream;
        this.NB = 0;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (this.icD == null) {
            this.NB = -1;
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            this.NB = -2;
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(str.getBytes(Key.STRING_CHARSET_NAME));
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    newPullParser.setInput(byteArrayInputStream, Key.STRING_CHARSET_NAME);
                    newPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.yiw.pvs pvs2 = pvs(newPullParser, list);
                    pvs(pvs2);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return pvs2;
                } catch (Exception unused2) {
                    this.NB = -3;
                    pvs((com.bytedance.sdk.openadsdk.core.yiw.pvs) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream2 = byteArrayInputStream;
                if (byteArrayInputStream2 != null) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayInputStream2 != null) {
            }
            throw th;
        }
    }

    private void pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar) {
        if (this.sUS == null) {
            this.sUS = new icD.pvs();
        }
        this.sUS.pvs = this.NB;
        this.sUS.icD = this.pvs;
        if (pvsVar != null) {
            this.sUS.vG = pvsVar.pvs().icD.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.yiw.pvs pvs(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, yiw, "VAST");
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = icD(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (pvs(xmlPullParser.getAttributeValue(yiw, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.yiw.pvs pvs2 = icD.pvs(this.icD, xmlPullParser, list, this.vG, this.Jd);
                                    if (pvs2 != null) {
                                        if (!TextUtils.isEmpty(pvs2.yiw())) {
                                            return pvs2;
                                        }
                                        this.NB = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.yiw.pvs icD = icD(xmlPullParser, list);
                                    if (icD != null) {
                                        return icD;
                                    }
                                } else {
                                    pvs(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        pvs(xmlPullParser);
                    }
                    z = true;
                } else {
                    pvs(xmlPullParser);
                }
            }
        }
        if (!z) {
            this.NB = -4;
            vG(str);
        }
        if (this.NB == 0) {
            this.NB = -5;
        }
        return null;
    }

    private void vG(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(Collections.singletonList(new vG.pvs(str).pvs()), this.pvs > 0 ? com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.UNDEFINED_ERROR, -1L, null), (vG.icD) null);
    }

    /* compiled from: VastXmlPullParser.java */
    static class pvs {
        String Jd;
        pvs.EnumC0089pvs icD;
        String pvs;
        pvs.icD vG;
        final List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> NB = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> sUS = new ArrayList();
        float yiw = Float.MIN_VALUE;

        public pvs() {
        }

        public pvs(String str, pvs.EnumC0089pvs enumC0089pvs, pvs.icD icd) {
            pvs(str, enumC0089pvs, icd);
        }

        public void pvs(String str, pvs.EnumC0089pvs enumC0089pvs, pvs.icD icd) {
            this.pvs = str;
            this.icD = enumC0089pvs;
            this.vG = icd;
        }

        public void pvs(String str) {
            this.NB.add(new vG.pvs(str).pvs());
        }

        public void icD(String str) {
            this.sUS.add(new vG.pvs(str).pvs());
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> pvs(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return Jd(icD(xmlPullParser, str));
    }

    public static int icD(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static String icD(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = yiw;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    public static void pvs(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void pvs(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0017, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008a, code lost:
    
        if (r8.equals("TrackingEvents") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.bytedance.sdk.openadsdk.core.yiw.pvs icD(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) throws XmlPullParserException, IOException {
        if (this.pvs >= 5) {
            pvs(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.yiw.Jd jd = new com.bytedance.sdk.openadsdk.core.yiw.Jd(null);
        String str = null;
        com.bytedance.sdk.openadsdk.core.yiw.vG vGVar = null;
        while (true) {
            if (xmlPullParser.getEventType() != 3 || !"Wrapper".equals(xmlPullParser.getName())) {
                xmlPullParser.next();
                char c = 2;
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name.hashCode()) {
                        case -587420703:
                            if (name.equals("VASTAdTagURI")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 67232232:
                            if (name.equals("Error")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 611554000:
                            break;
                        case 1150879268:
                            if (name.equals("CompanionAds")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2107600959:
                            if (name.equals("ClickTracking")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2114088489:
                            if (name.equals("Impression")) {
                                c = 5;
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
                            str = icD(icD(xmlPullParser, "VASTAdTagURI"), list);
                            if (!TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                pvs(xmlPullParser, "Wrapper", 3);
                                this.NB = -2;
                                return null;
                            }
                        case 1:
                            list.add(new vG.pvs(icD(xmlPullParser, "Error")).pvs());
                            break;
                        case 2:
                            vG.pvs(xmlPullParser, jd);
                            break;
                        case 3:
                            vGVar = com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.pvs.pvs(this.icD, xmlPullParser);
                            break;
                        case 4:
                            jd.yiw(pvs(xmlPullParser, "ClickTracking"));
                            break;
                        case 5:
                            jd.pvs(pvs(xmlPullParser, name));
                            break;
                    }
                }
            } else {
                com.bytedance.sdk.openadsdk.core.yiw.pvs pvs2 = pvs(str, list);
                if (pvs2 != null) {
                    if (pvs2.vG() == null) {
                        pvs2.pvs(vGVar);
                    }
                    pvs2.pvs().pvs(jd);
                }
                return pvs2;
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> pvs(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new vG.pvs(str).pvs(z).pvs());
    }

    private static List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> Jd(String str) {
        return pvs(str, false);
    }
}
