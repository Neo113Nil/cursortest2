package com.bytedance.sdk.openadsdk.core.rt.zmn.zmn;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.btk;
import com.bytedance.sdk.openadsdk.core.rt.zn.zmn;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class zmn {
    public static com.bytedance.sdk.openadsdk.core.rt.zn zmn(Context context, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str;
        int i;
        int i2;
        int i3;
        XmlPullParser xmlPullParser2;
        Context context2;
        int i4;
        String str2;
        Context context3;
        String str3;
        btk.zmn zmnVar;
        String str4;
        zmn.EnumC0182zmn enumC0182zmn;
        String str5;
        char c;
        int i5;
        int i6;
        Context context4 = context;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String str6 = "HTMLResource";
        String str7 = "IFrameResource";
        int i7 = 2;
        int i8 = 3;
        if (context4 == null) {
            btk.zmn(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i9 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        int i11 = (int) (i9 / f);
        int i12 = (int) (i10 / f);
        float f2 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.rt.zn znVar = null;
        while (true) {
            if (xmlPullParser.getEventType() == i8 && xmlPullParser.getName().equals("CompanionAds")) {
                return znVar;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == i7) {
                String str8 = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    String str9 = btk.nps;
                    int fs = btk.fs(xmlPullParser3.getAttributeValue(str9, "width"));
                    int fs2 = btk.fs(xmlPullParser3.getAttributeValue(str9, "height"));
                    if (fs < 300 || fs2 < 250) {
                        str = str6;
                        i2 = i12;
                        i3 = i11;
                        i = 2;
                        xmlPullParser2 = xmlPullParser3;
                        context2 = context4;
                        i4 = i8;
                        str2 = str7;
                        btk.zmn(xmlPullParser);
                        i7 = i;
                        str7 = str2;
                        str6 = str;
                        i11 = i3;
                        i8 = i4;
                        context4 = context2;
                        xmlPullParser3 = xmlPullParser2;
                        i12 = i2;
                    } else {
                        btk.zmn zmnVar2 = new btk.zmn();
                        while (true) {
                            if (xmlPullParser.getEventType() != i8 || !xmlPullParser.getName().equals(str8)) {
                                int i13 = i12;
                                int i14 = i11;
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2) {
                                    String name = xmlPullParser.getName();
                                    name.hashCode();
                                    char c2 = 65535;
                                    switch (name.hashCode()) {
                                        case -375340334:
                                            if (name.equals(str7)) {
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
                                            if (name.equals(str6)) {
                                                c = 5;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            str5 = str6;
                                            String str10 = str7;
                                            btk.zmn zmnVar3 = zmnVar2;
                                            str4 = str8;
                                            Point zmn = com.bytedance.sdk.openadsdk.core.rt.zn.zmn.zmn(context, fs, fs2, zmn.fs.HTML_RESOURCE);
                                            int i15 = zmn.x;
                                            int i16 = zmn.y;
                                            zmn.fs fsVar = zmn.fs.IFRAME_RESOURCE;
                                            zmn.EnumC0182zmn enumC0182zmn2 = zmn.EnumC0182zmn.NONE;
                                            float zmn2 = com.bytedance.sdk.openadsdk.core.rt.zn.zmn(i14, i13, i15, i16, fsVar, enumC0182zmn2);
                                            String fs3 = btk.fs(xmlPullParser, str10);
                                            if (TextUtils.isEmpty(fs3) || zmn2 <= zmnVar3.nps || zmn2 <= f2) {
                                                btk.zmn(xmlPullParser, str10, 3);
                                                zmnVar2 = zmnVar3;
                                                str7 = str10;
                                                str8 = str4;
                                                str6 = str5;
                                                i12 = i13;
                                                i11 = i14;
                                                i8 = 3;
                                                break;
                                            } else {
                                                zmnVar3.nps = zmn2;
                                                zmnVar3.zmn(fs3, enumC0182zmn2, fsVar);
                                                zmnVar2 = zmnVar3;
                                                str7 = str10;
                                                str8 = str4;
                                                str6 = str5;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            str5 = str6;
                                            zmnVar2.fb = btk.fs(xmlPullParser, "CompanionClickThrough");
                                            str7 = str7;
                                            str6 = str5;
                                            break;
                                        case 2:
                                            context3 = context;
                                            str5 = str6;
                                            str3 = str7;
                                            zmnVar = zmnVar2;
                                            str4 = str8;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    zmnVar2 = zmnVar;
                                                    str7 = str3;
                                                    str8 = str4;
                                                    str6 = str5;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    zmnVar.fs(btk.fs(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case 3:
                                            context3 = context;
                                            str3 = str7;
                                            zmnVar = zmnVar2;
                                            str4 = str8;
                                            zmn.EnumC0182zmn enumC0182zmn3 = zmn.EnumC0182zmn.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(btk.nps, "creativeType").toLowerCase();
                                            Set<String> set = com.bytedance.sdk.openadsdk.core.rt.zn.zmn.zmn;
                                            if (set.contains(lowerCase)) {
                                                enumC0182zmn = zmn.EnumC0182zmn.IMAGE;
                                            } else {
                                                enumC0182zmn = zmn.EnumC0182zmn.JAVASCRIPT;
                                            }
                                            zmn.fs fsVar2 = zmn.fs.STATIC_RESOURCE;
                                            Point zmn3 = com.bytedance.sdk.openadsdk.core.rt.zn.zmn.zmn(context3, fs, fs2, fsVar2);
                                            str5 = str6;
                                            float zmn4 = com.bytedance.sdk.openadsdk.core.rt.zn.zmn(i14, i13, zmn3.x, zmn3.y, fsVar2, enumC0182zmn);
                                            String fs4 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.rt.zn.zmn.fs.contains(lowerCase)) ? btk.fs(xmlPullParser, "StaticResource") : null;
                                            if (zmn4 < zmnVar.nps || zmn4 <= f2 || TextUtils.isEmpty(fs4)) {
                                                btk.zmn(xmlPullParser, "StaticResource", 3);
                                                i8 = 3;
                                                zmnVar2 = zmnVar;
                                                str7 = str3;
                                                str8 = str4;
                                                str6 = str5;
                                                i12 = i13;
                                                i11 = i14;
                                                break;
                                            } else {
                                                zmnVar.nps = zmn4;
                                                zmnVar.zmn(fs4, enumC0182zmn, fsVar2);
                                                zmnVar2 = zmnVar;
                                                str7 = str3;
                                                str8 = str4;
                                                str6 = str5;
                                                break;
                                            }
                                            break;
                                        case 4:
                                            zmnVar2.zmn(btk.fs(xmlPullParser, "CompanionClickTracking"));
                                            str7 = str7;
                                            break;
                                        case 5:
                                            zmn.fs fsVar3 = zmn.fs.HTML_RESOURCE;
                                            Point zmn5 = com.bytedance.sdk.openadsdk.core.rt.zn.zmn.zmn(context, fs, fs2, fsVar3);
                                            int i17 = zmn5.x;
                                            int i18 = zmn5.y;
                                            zmn.EnumC0182zmn enumC0182zmn4 = zmn.EnumC0182zmn.NONE;
                                            String str11 = str7;
                                            btk.zmn zmnVar4 = zmnVar2;
                                            String str12 = str8;
                                            float zmn6 = com.bytedance.sdk.openadsdk.core.rt.zn.zmn(i14, i13, i17, i18, fsVar3, enumC0182zmn4);
                                            String fs5 = btk.fs(xmlPullParser, str6);
                                            if (TextUtils.isEmpty(fs5) || zmn6 <= zmnVar4.nps || zmn6 <= f2) {
                                                btk.zmn(xmlPullParser, str6, 3);
                                                i8 = 3;
                                                zmnVar2 = zmnVar4;
                                                str7 = str11;
                                                str8 = str12;
                                                i12 = i13;
                                                i11 = i14;
                                                break;
                                            } else {
                                                zmnVar4.nps = zmn6;
                                                zmnVar4.zmn(fs5, enumC0182zmn4, fsVar3);
                                                zmnVar2 = zmnVar4;
                                                str7 = str11;
                                                str8 = str12;
                                                break;
                                            }
                                        default:
                                            btk.zmn(xmlPullParser);
                                            context3 = context;
                                            str5 = str6;
                                            str3 = str7;
                                            zmnVar = zmnVar2;
                                            str4 = str8;
                                            zmnVar2 = zmnVar;
                                            str7 = str3;
                                            str8 = str4;
                                            str6 = str5;
                                            break;
                                    }
                                }
                                i12 = i13;
                                i11 = i14;
                                i8 = 3;
                            } else {
                                if (TextUtils.isEmpty(zmnVar2.zmn) || zmnVar2.nps < f2) {
                                    i5 = i12;
                                    i6 = i11;
                                } else {
                                    i5 = i12;
                                    i6 = i11;
                                    com.bytedance.sdk.openadsdk.core.rt.zn znVar2 = new com.bytedance.sdk.openadsdk.core.rt.zn(fs, fs2, zmnVar2.fs, zmnVar2.zn, zmnVar2.zmn, zmnVar2.btk, zmnVar2.hhw, zmnVar2.fb);
                                    f2 = zmnVar2.nps;
                                    znVar = znVar2;
                                }
                                context4 = context;
                                xmlPullParser3 = xmlPullParser;
                                i12 = i5;
                                i11 = i6;
                                i7 = 2;
                                i8 = 3;
                            }
                        }
                    }
                }
            }
            str = str6;
            i = i7;
            i2 = i12;
            i3 = i11;
            xmlPullParser2 = xmlPullParser3;
            context2 = context4;
            i4 = i8;
            str2 = str7;
            i7 = i;
            str7 = str2;
            str6 = str;
            i11 = i3;
            i8 = i4;
            context4 = context2;
            xmlPullParser3 = xmlPullParser2;
            i12 = i2;
        }
    }
}
