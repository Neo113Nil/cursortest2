package com.bytedance.sdk.openadsdk.core.rt.zmn.zmn;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.fs.zn;
import com.bytedance.sdk.openadsdk.core.rt.iv;
import com.bytedance.sdk.openadsdk.core.rt.zmn.fs;
import com.bytedance.sdk.openadsdk.core.rt.zn.zmn;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
public class btk extends com.bytedance.sdk.openadsdk.core.rt.zmn.fs {
    public static final String nps = null;

    public btk(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.rt.zmn.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.openadsdk.core.rt.zmn zmn(String str, File file, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        InputStream inputStream;
        this.btk = 0;
        InputStream inputStream2 = null;
        if (this.fs == null) {
            this.btk = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.btk = -2;
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                inputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            } else {
                inputStream = new FileInputStream(file);
            }
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    newPullParser.setInput(inputStream, "UTF-8");
                    newPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.rt.zmn zmn2 = zmn(newPullParser, list);
                    zmn(zmn2);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return zmn2;
                } catch (Exception unused2) {
                    this.btk = -3;
                    zmn((com.bytedance.sdk.openadsdk.core.rt.zmn) null);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar) {
        if (this.hhw == null) {
            this.hhw = new fs.zmn();
        }
        fs.zmn zmnVar2 = this.hhw;
        zmnVar2.zmn = this.btk;
        zmnVar2.fs = this.zmn;
        if (zmnVar != null) {
            zmnVar2.zn = zmnVar.zmn().fs.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.rt.zmn zmn(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, nps, VastTagName.VAST);
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = fs(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (zmn(xmlPullParser.getAttributeValue(nps, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.rt.zmn zmn2 = fs.zmn(this.fs, xmlPullParser, list, this.zn, this.fb);
                                    if (zmn2 != null) {
                                        if (!TextUtils.isEmpty(zmn2.nps())) {
                                            return zmn2;
                                        }
                                        this.btk = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.rt.zmn fs = fs(xmlPullParser, list);
                                    if (fs != null) {
                                        return fs;
                                    }
                                } else {
                                    zmn(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        zmn(xmlPullParser);
                    }
                    z = true;
                } else {
                    zmn(xmlPullParser);
                }
            }
        }
        if (!z) {
            this.btk = -4;
            zn(str);
        }
        if (this.btk == 0) {
            this.btk = -5;
        }
        return null;
    }

    private void zn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn((nqi) null, (List<com.bytedance.sdk.openadsdk.core.rt.fs.zn>) Collections.singletonList(new zn.zmn(str).zmn()), this.zmn > 0 ? com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.UNDEFINED_ERROR, -1L, (String) null, (String) null), (zn.fs) null);
    }

    static class zmn {
        String fb;
        zmn.EnumC0182zmn fs;
        String zmn;
        zmn.fs zn;
        final List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> btk = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> hhw = new ArrayList();
        float nps = Float.MIN_VALUE;

        public zmn() {
        }

        public zmn(String str, zmn.EnumC0182zmn enumC0182zmn, zmn.fs fsVar) {
            zmn(str, enumC0182zmn, fsVar);
        }

        public void zmn(String str, zmn.EnumC0182zmn enumC0182zmn, zmn.fs fsVar) {
            this.zmn = str;
            this.fs = enumC0182zmn;
            this.zn = fsVar;
        }

        public void zmn(String str) {
            this.btk.add(new zn.zmn(str).zmn());
        }

        public void fs(String str) {
            this.hhw.add(new zn.zmn(str).zmn());
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zmn(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return zmn(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zmn(XmlPullParser xmlPullParser, String str, boolean z) throws IOException, XmlPullParserException {
        return zmn(fs(xmlPullParser, str), z);
    }

    public static int fs(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static String fs(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = nps;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() != 4) {
            str2 = "";
        } else {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    public static void zmn(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    public static void zmn(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private com.bytedance.sdk.openadsdk.core.rt.zmn fs(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) throws XmlPullParserException, IOException {
        File file;
        String name;
        File file2 = null;
        if (this.zmn >= 5) {
            zmn(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.rt.fb fbVar = new com.bytedance.sdk.openadsdk.core.rt.fb();
        String str = null;
        com.bytedance.sdk.openadsdk.core.rt.zn znVar = null;
        Set<iv> set = null;
        while (true) {
            if (xmlPullParser.getEventType() != 3 || !"Wrapper".equals(xmlPullParser.getName())) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "VASTAdTagURI":
                            String zmn2 = zmn(fs(xmlPullParser, "VASTAdTagURI"), list);
                            if (!TextUtils.isEmpty(zmn2)) {
                                file = null;
                                str = zmn2;
                                break;
                            } else {
                                zmn(xmlPullParser, "Wrapper", 3);
                                this.btk = -2;
                                return null;
                            }
                        case "Error":
                            list.add(new zn.zmn(fs(xmlPullParser, "Error")).zmn());
                            file = null;
                            break;
                        case "Extensions":
                            while (true) {
                                if (xmlPullParser.getEventType() == 3 && VastTagName.EXTENSIONS.equals(xmlPullParser.getName())) {
                                    file = null;
                                    break;
                                } else {
                                    xmlPullParser.next();
                                    if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                        set = fb.zmn(xmlPullParser);
                                    }
                                }
                            }
                            break;
                        case "TrackingEvents":
                            zn.zmn(xmlPullParser, fbVar);
                            file = null;
                            break;
                        case "CompanionAds":
                            znVar = com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.zmn.zmn(this.fs, xmlPullParser);
                            file2 = null;
                        case "ClickTracking":
                            fbVar.nps(zmn(xmlPullParser, "ClickTracking"));
                            file = null;
                            break;
                        case "Impression":
                            fbVar.zmn(zmn(xmlPullParser, name));
                            file = null;
                            break;
                        default:
                            file = null;
                            break;
                    }
                } else {
                    file = file2;
                }
                file2 = file;
            } else {
                com.bytedance.sdk.openadsdk.core.rt.zmn zmn3 = zmn(str, file2, list);
                if (zmn3 != null) {
                    if (zmn3.zn() == null) {
                        zmn3.zmn(znVar);
                    }
                    zmn3.zmn().zmn(fbVar);
                    if (set != null) {
                        zmn3.zmn(set);
                    }
                }
                return zmn3;
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zmn(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new zn.zmn(str).zmn(z).zmn());
    }
}
