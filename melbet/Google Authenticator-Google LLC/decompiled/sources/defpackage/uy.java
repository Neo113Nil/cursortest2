package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uy {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, uw uwVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface b2 = b(context, resources, typedValue, i, i2, uwVar, z, z2);
        if (b2 != null || uwVar != null || z2) {
            return b2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0366, code lost:
    
        if (r38 == null) goto L183;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109 A[Catch: IOException -> 0x0497, XmlPullParserException -> 0x04a9, TryCatch #0 {XmlPullParserException -> 0x04a9, blocks: (B:17:0x003f, B:19:0x004b, B:20:0x004f, B:25:0x005a, B:26:0x0061, B:28:0x0062, B:30:0x0075, B:34:0x00ae, B:36:0x00fd, B:37:0x0102, B:39:0x0109, B:42:0x0110, B:44:0x011c, B:53:0x0146, B:62:0x0156, B:63:0x0159, B:64:0x015a, B:67:0x0160, B:69:0x0167, B:71:0x025d, B:73:0x0266, B:76:0x026d, B:78:0x0273, B:80:0x027e, B:84:0x0351, B:85:0x0354, B:89:0x0361, B:94:0x036d, B:95:0x0371, B:97:0x038a, B:99:0x0390, B:101:0x03ab, B:104:0x0471, B:107:0x03b9, B:108:0x03c8, B:110:0x03cd, B:112:0x03dc, B:114:0x03e6, B:115:0x03ed, B:116:0x03ee, B:118:0x03fc, B:119:0x0406, B:120:0x040d, B:130:0x042a, B:132:0x043d, B:133:0x044c, B:134:0x0447, B:137:0x0459, B:141:0x0284, B:143:0x028c, B:144:0x029a, B:148:0x02a4, B:150:0x02aa, B:152:0x02b9, B:157:0x02be, B:159:0x02c4, B:161:0x02d1, B:164:0x02d9, B:166:0x02df, B:182:0x02eb, B:168:0x0307, B:178:0x030f, B:172:0x033a, B:174:0x0343, B:175:0x0340, B:170:0x032f, B:180:0x0326, B:165:0x0349, B:184:0x045a, B:187:0x0466, B:188:0x046a, B:191:0x0170, B:193:0x0180, B:194:0x018e, B:195:0x0195, B:196:0x019c, B:197:0x00b5, B:202:0x00c1, B:215:0x00f8, B:218:0x019e, B:219:0x01a1, B:220:0x01a2, B:221:0x01a9, B:223:0x01b0, B:226:0x01b7, B:233:0x01c3, B:236:0x01d6, B:239:0x01e6, B:242:0x01f1, B:245:0x01fa, B:248:0x0203, B:251:0x0215, B:252:0x0220, B:254:0x0227, B:256:0x022b, B:229:0x0237, B:264:0x023e, B:268:0x0245, B:269:0x0255), top: B:16:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167 A[Catch: IOException -> 0x0497, XmlPullParserException -> 0x04a9, TryCatch #0 {XmlPullParserException -> 0x04a9, blocks: (B:17:0x003f, B:19:0x004b, B:20:0x004f, B:25:0x005a, B:26:0x0061, B:28:0x0062, B:30:0x0075, B:34:0x00ae, B:36:0x00fd, B:37:0x0102, B:39:0x0109, B:42:0x0110, B:44:0x011c, B:53:0x0146, B:62:0x0156, B:63:0x0159, B:64:0x015a, B:67:0x0160, B:69:0x0167, B:71:0x025d, B:73:0x0266, B:76:0x026d, B:78:0x0273, B:80:0x027e, B:84:0x0351, B:85:0x0354, B:89:0x0361, B:94:0x036d, B:95:0x0371, B:97:0x038a, B:99:0x0390, B:101:0x03ab, B:104:0x0471, B:107:0x03b9, B:108:0x03c8, B:110:0x03cd, B:112:0x03dc, B:114:0x03e6, B:115:0x03ed, B:116:0x03ee, B:118:0x03fc, B:119:0x0406, B:120:0x040d, B:130:0x042a, B:132:0x043d, B:133:0x044c, B:134:0x0447, B:137:0x0459, B:141:0x0284, B:143:0x028c, B:144:0x029a, B:148:0x02a4, B:150:0x02aa, B:152:0x02b9, B:157:0x02be, B:159:0x02c4, B:161:0x02d1, B:164:0x02d9, B:166:0x02df, B:182:0x02eb, B:168:0x0307, B:178:0x030f, B:172:0x033a, B:174:0x0343, B:175:0x0340, B:170:0x032f, B:180:0x0326, B:165:0x0349, B:184:0x045a, B:187:0x0466, B:188:0x046a, B:191:0x0170, B:193:0x0180, B:194:0x018e, B:195:0x0195, B:196:0x019c, B:197:0x00b5, B:202:0x00c1, B:215:0x00f8, B:218:0x019e, B:219:0x01a1, B:220:0x01a2, B:221:0x01a9, B:223:0x01b0, B:226:0x01b7, B:233:0x01c3, B:236:0x01d6, B:239:0x01e6, B:242:0x01f1, B:245:0x01fa, B:248:0x0203, B:251:0x0215, B:252:0x0220, B:254:0x0227, B:256:0x022b, B:229:0x0237, B:264:0x023e, B:268:0x0245, B:269:0x0255), top: B:16:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025d A[Catch: IOException -> 0x0497, XmlPullParserException -> 0x04a9, TryCatch #0 {XmlPullParserException -> 0x04a9, blocks: (B:17:0x003f, B:19:0x004b, B:20:0x004f, B:25:0x005a, B:26:0x0061, B:28:0x0062, B:30:0x0075, B:34:0x00ae, B:36:0x00fd, B:37:0x0102, B:39:0x0109, B:42:0x0110, B:44:0x011c, B:53:0x0146, B:62:0x0156, B:63:0x0159, B:64:0x015a, B:67:0x0160, B:69:0x0167, B:71:0x025d, B:73:0x0266, B:76:0x026d, B:78:0x0273, B:80:0x027e, B:84:0x0351, B:85:0x0354, B:89:0x0361, B:94:0x036d, B:95:0x0371, B:97:0x038a, B:99:0x0390, B:101:0x03ab, B:104:0x0471, B:107:0x03b9, B:108:0x03c8, B:110:0x03cd, B:112:0x03dc, B:114:0x03e6, B:115:0x03ed, B:116:0x03ee, B:118:0x03fc, B:119:0x0406, B:120:0x040d, B:130:0x042a, B:132:0x043d, B:133:0x044c, B:134:0x0447, B:137:0x0459, B:141:0x0284, B:143:0x028c, B:144:0x029a, B:148:0x02a4, B:150:0x02aa, B:152:0x02b9, B:157:0x02be, B:159:0x02c4, B:161:0x02d1, B:164:0x02d9, B:166:0x02df, B:182:0x02eb, B:168:0x0307, B:178:0x030f, B:172:0x033a, B:174:0x0343, B:175:0x0340, B:170:0x032f, B:180:0x0326, B:165:0x0349, B:184:0x045a, B:187:0x0466, B:188:0x046a, B:191:0x0170, B:193:0x0180, B:194:0x018e, B:195:0x0195, B:196:0x019c, B:197:0x00b5, B:202:0x00c1, B:215:0x00f8, B:218:0x019e, B:219:0x01a1, B:220:0x01a2, B:221:0x01a9, B:223:0x01b0, B:226:0x01b7, B:233:0x01c3, B:236:0x01d6, B:239:0x01e6, B:242:0x01f1, B:245:0x01fa, B:248:0x0203, B:251:0x0215, B:252:0x0220, B:254:0x0227, B:256:0x022b, B:229:0x0237, B:264:0x023e, B:268:0x0245, B:269:0x0255), top: B:16:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026d A[Catch: IOException -> 0x0497, XmlPullParserException -> 0x04a9, TryCatch #0 {XmlPullParserException -> 0x04a9, blocks: (B:17:0x003f, B:19:0x004b, B:20:0x004f, B:25:0x005a, B:26:0x0061, B:28:0x0062, B:30:0x0075, B:34:0x00ae, B:36:0x00fd, B:37:0x0102, B:39:0x0109, B:42:0x0110, B:44:0x011c, B:53:0x0146, B:62:0x0156, B:63:0x0159, B:64:0x015a, B:67:0x0160, B:69:0x0167, B:71:0x025d, B:73:0x0266, B:76:0x026d, B:78:0x0273, B:80:0x027e, B:84:0x0351, B:85:0x0354, B:89:0x0361, B:94:0x036d, B:95:0x0371, B:97:0x038a, B:99:0x0390, B:101:0x03ab, B:104:0x0471, B:107:0x03b9, B:108:0x03c8, B:110:0x03cd, B:112:0x03dc, B:114:0x03e6, B:115:0x03ed, B:116:0x03ee, B:118:0x03fc, B:119:0x0406, B:120:0x040d, B:130:0x042a, B:132:0x043d, B:133:0x044c, B:134:0x0447, B:137:0x0459, B:141:0x0284, B:143:0x028c, B:144:0x029a, B:148:0x02a4, B:150:0x02aa, B:152:0x02b9, B:157:0x02be, B:159:0x02c4, B:161:0x02d1, B:164:0x02d9, B:166:0x02df, B:182:0x02eb, B:168:0x0307, B:178:0x030f, B:172:0x033a, B:174:0x0343, B:175:0x0340, B:170:0x032f, B:180:0x0326, B:165:0x0349, B:184:0x045a, B:187:0x0466, B:188:0x046a, B:191:0x0170, B:193:0x0180, B:194:0x018e, B:195:0x0195, B:196:0x019c, B:197:0x00b5, B:202:0x00c1, B:215:0x00f8, B:218:0x019e, B:219:0x01a1, B:220:0x01a2, B:221:0x01a9, B:223:0x01b0, B:226:0x01b7, B:233:0x01c3, B:236:0x01d6, B:239:0x01e6, B:242:0x01f1, B:245:0x01fa, B:248:0x0203, B:251:0x0215, B:252:0x0220, B:254:0x0227, B:256:0x022b, B:229:0x0237, B:264:0x023e, B:268:0x0245, B:269:0x0255), top: B:16:0x003f }] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface b(Context context, Resources resources, TypedValue typedValue, int i, int i2, uw uwVar, boolean z, boolean z2) {
        String str;
        int next;
        Object obj;
        Typeface typeface;
        Font.Builder fontVariationSettings;
        Font build;
        FontFamily build2;
        boolean z3;
        Typeface typeface2;
        XmlResourceParser xmlResourceParser;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        ArrayList arrayList3;
        if (typedValue.string == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence = typedValue.string.toString();
        if (!charSequence.startsWith("res/")) {
            if (uwVar != null) {
                uwVar.c(-3);
            }
            return null;
        }
        Typeface typeface3 = (Typeface) vd.b.a(vd.d(resources, i, charSequence, typedValue.assetCookie, i2));
        if (typeface3 != null) {
            if (uwVar != null) {
                uwVar.d(typeface3);
            }
            return typeface3;
        }
        if (z2) {
            return null;
        }
        try {
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    XmlResourceParser xml = resources.getXml(i);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            xml.require(2, null, "font-family");
                            if (xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), ud.b);
                                String string = obtainAttributes.getString(0);
                                String string2 = obtainAttributes.getString(5);
                                String string3 = obtainAttributes.getString(6);
                                String string4 = obtainAttributes.getString(2);
                                int resourceId = obtainAttributes.getResourceId(1, 0);
                                int integer = obtainAttributes.getInteger(3, 1);
                                int integer2 = obtainAttributes.getInteger(4, 500);
                                String string5 = obtainAttributes.getString(7);
                                if (string == null || string2 == null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    while (xml.next() != 3) {
                                        if (xml.getEventType() == 2) {
                                            if (xml.getName().equals("font")) {
                                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xml), ud.c);
                                                int i4 = obtainAttributes2.getInt(true != obtainAttributes2.hasValue(8) ? 1 : 8, 400);
                                                boolean z4 = obtainAttributes2.getInt(true != obtainAttributes2.hasValue(6) ? 2 : 6, 0) == 1;
                                                int i5 = true != obtainAttributes2.hasValue(9) ? 3 : 9;
                                                String string6 = obtainAttributes2.getString(true != obtainAttributes2.hasValue(7) ? 4 : 7);
                                                int i6 = obtainAttributes2.getInt(i5, 0);
                                                int i7 = true != obtainAttributes2.hasValue(5) ? 0 : 5;
                                                int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                                                String string7 = obtainAttributes2.getString(i7);
                                                while (xml.next() != 3) {
                                                    oy.k(xml);
                                                }
                                                arrayList4.add(new wh(string7, i4, z4, string6, i6, resourceId2));
                                            } else {
                                                oy.k(xml);
                                            }
                                        }
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        obj = new brn((wh[]) arrayList4.toArray(new wh[0]), (byte[]) null);
                                    }
                                } else {
                                    if (resourceId == 0) {
                                        arrayList3 = Collections.EMPTY_LIST;
                                    } else {
                                        TypedArray obtainTypedArray = resources.obtainTypedArray(resourceId);
                                        try {
                                            if (obtainTypedArray.length() != 0) {
                                                ArrayList arrayList5 = new ArrayList();
                                                xmlResourceParser = xml;
                                                if (obtainTypedArray.getType(0) == 1) {
                                                    for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                                                        int resourceId3 = obtainTypedArray.getResourceId(i8, 0);
                                                        if (resourceId3 != 0) {
                                                            arrayList5.add(oy.j(resources.getStringArray(resourceId3)));
                                                        }
                                                    }
                                                } else {
                                                    arrayList5.add(oy.j(resources.getStringArray(resourceId)));
                                                }
                                                obtainTypedArray.recycle();
                                                arrayList = arrayList5;
                                                arrayList2 = new ArrayList();
                                                while (xmlResourceParser.next() != 3) {
                                                    if (xmlResourceParser.getEventType() == 2) {
                                                        if (xmlResourceParser.getName().equals("fallback")) {
                                                            TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), ud.d);
                                                            try {
                                                                String string8 = obtainAttributes3.getString(0);
                                                                String string9 = obtainAttributes3.getString(1);
                                                                String string10 = obtainAttributes3.getString(2);
                                                                if (string8 == null) {
                                                                    throw new XmlPullParserException("query attribute must be set in fallback element");
                                                                }
                                                                while (xmlResourceParser.next() != 3) {
                                                                    oy.k(xmlResourceParser);
                                                                }
                                                                i3 = integer2;
                                                                wc wcVar = new wc(string, string2, string8, arrayList, string9, string10);
                                                                obtainAttributes3.recycle();
                                                                arrayList2.add(wcVar);
                                                            } finally {
                                                                obtainAttributes3.recycle();
                                                            }
                                                        } else {
                                                            i3 = integer2;
                                                            oy.k(xmlResourceParser);
                                                        }
                                                        integer2 = i3;
                                                    }
                                                }
                                                int i9 = integer2;
                                                if (arrayList2.isEmpty()) {
                                                    obj = new uu(arrayList2, integer, i9, string5);
                                                } else {
                                                    if (string3 == null) {
                                                        throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
                                                    }
                                                    arrayList2.add(new wc(string, string2, string3, arrayList, null, null));
                                                    if (string4 != null) {
                                                        arrayList2.add(new wc(string, string2, string4, arrayList, null, null));
                                                    }
                                                    obj = new uu(arrayList2, integer, i9, string5);
                                                }
                                            }
                                        } finally {
                                            obtainTypedArray.recycle();
                                        }
                                    }
                                    xmlResourceParser = xml;
                                    arrayList = arrayList3;
                                    arrayList2 = new ArrayList();
                                    while (xmlResourceParser.next() != 3) {
                                    }
                                    int i92 = integer2;
                                    if (arrayList2.isEmpty()) {
                                    }
                                }
                                if (obj != null) {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    if (uwVar == null) {
                                        return null;
                                    }
                                    uwVar.c(-3);
                                    return null;
                                }
                                int i10 = typedValue.assetCookie;
                                if (obj instanceof uu) {
                                    uu uuVar = (uu) obj;
                                    String str2 = uuVar.d;
                                    int i11 = -1;
                                    if (TextUtils.isEmpty(str2) || (typeface = vd.b(str2)) == null) {
                                        List list = uuVar.a;
                                        if (list.size() == 1) {
                                            typeface = vd.b(((wc) list.get(0)).e);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 31) {
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= list.size()) {
                                                        int i13 = 0;
                                                        Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                                        while (true) {
                                                            if (i13 >= list.size()) {
                                                                break;
                                                            }
                                                            wc wcVar2 = (wc) list.get(i13);
                                                            if (i13 == list.size() + i11 && TextUtils.isEmpty(wcVar2.f)) {
                                                                customFallbackBuilder.setSystemFallback(wcVar2.e);
                                                                break;
                                                            }
                                                            String str3 = wcVar2.e;
                                                            Font c2 = vd.c(vd.b(str3));
                                                            if (c2 == null) {
                                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + str3 + ". Falling back to provider font.");
                                                                break;
                                                            }
                                                            String str4 = wcVar2.f;
                                                            if (TextUtils.isEmpty(str4)) {
                                                                build2 = new FontFamily.Builder(c2).build();
                                                            } else {
                                                                try {
                                                                    fontVariationSettings = new Font.Builder(c2).setFontVariationSettings(str4);
                                                                    build = fontVariationSettings.build();
                                                                    build2 = new FontFamily.Builder(build).build();
                                                                } catch (IOException unused) {
                                                                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                                }
                                                            }
                                                            if (customFallbackBuilder == null) {
                                                                customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                                            } else {
                                                                customFallbackBuilder.addCustomFallback(build2);
                                                            }
                                                            i13++;
                                                            i11 = -1;
                                                        }
                                                        typeface = customFallbackBuilder.build();
                                                    } else {
                                                        if (vd.b(((wc) list.get(i12)).e) == null) {
                                                            break;
                                                        }
                                                        i12++;
                                                    }
                                                }
                                            }
                                            typeface = null;
                                        }
                                    }
                                    if (typeface != null) {
                                        if (uwVar != null) {
                                            uwVar.d(typeface);
                                        }
                                        vd.b.b(vd.d(resources, i, charSequence, i10, i2), typeface);
                                        return typeface;
                                    }
                                    if (z) {
                                        z3 = uuVar.c == 0;
                                    }
                                    int i14 = z ? uuVar.b : -1;
                                    Handler e = uw.e();
                                    brn brnVar = new brn(uwVar, (byte[]) null);
                                    List list2 = uuVar.a;
                                    brr brrVar = new brr(brnVar, new pl(e, 3));
                                    if (!z3) {
                                        String a2 = wg.a(list2, i2);
                                        Typeface typeface4 = (Typeface) wg.a.a(a2);
                                        if (typeface4 != null) {
                                            brrVar.n(new bsh(typeface4));
                                            typeface2 = typeface4;
                                        } else {
                                            wf wfVar = new wf(brrVar, 1);
                                            synchronized (wg.c) {
                                                qy qyVar = wg.d;
                                                ArrayList arrayList6 = (ArrayList) qyVar.get(a2);
                                                if (arrayList6 != null) {
                                                    arrayList6.add(wfVar);
                                                } else {
                                                    ArrayList arrayList7 = new ArrayList();
                                                    arrayList7.add(wfVar);
                                                    qyVar.put(a2, arrayList7);
                                                    wg.b.execute(new wj(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new we(a2, context, list2, i2), new wf(a2, 0)));
                                                }
                                            }
                                            typeface2 = null;
                                        }
                                    } else {
                                        if (list2.size() > 1) {
                                            throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                                        }
                                        wc wcVar3 = (wc) list2.get(0);
                                        qs qsVar = wg.a;
                                        String a3 = wg.a(pk.e(wcVar3), i2);
                                        Typeface typeface5 = (Typeface) wg.a.a(a3);
                                        if (typeface5 != null) {
                                            brrVar.n(new bsh(typeface5));
                                            typeface2 = typeface5;
                                        } else if (i14 == -1) {
                                            bsh b2 = wg.b(a3, context, pk.e(wcVar3), i2);
                                            brrVar.n(b2);
                                            typeface2 = b2.b;
                                        } else {
                                            try {
                                                bsh bshVar = (bsh) tw.H(wg.b, new wd(a3, context, wcVar3, i2), i14);
                                                brrVar.n(bshVar);
                                                typeface2 = bshVar.b;
                                            } catch (InterruptedException unused2) {
                                                brrVar.n(new bsh(-3));
                                            }
                                        }
                                    }
                                    typeface = typeface2;
                                } else {
                                    Typeface b3 = vd.a.b(context, (brn) obj, resources, i2);
                                    if (uwVar != null) {
                                        if (b3 != null) {
                                            uwVar.d(b3);
                                        } else {
                                            uwVar.c(-3);
                                        }
                                    }
                                    typeface = b3;
                                }
                                if (typeface != null) {
                                    vd.b.b(vd.d(resources, i, charSequence, i10, i2), typeface);
                                }
                                return typeface;
                            }
                            oy.k(xml);
                            obj = null;
                            if (obj != null) {
                            }
                        }
                    } while (next != 1);
                    throw new XmlPullParserException("No start tag found");
                }
                str = charSequence;
                try {
                    Typeface a4 = vd.a(context, resources, i, str, typedValue.assetCookie, i2);
                    if (uwVar != null) {
                        if (a4 != null) {
                            uwVar.d(a4);
                            return a4;
                        }
                        uwVar.c(-3);
                    }
                    return a4;
                } catch (IOException e2) {
                    e = e2;
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(String.valueOf(str)), e);
                    if (uwVar != null) {
                        return null;
                    }
                    uwVar.c(-3);
                    return null;
                } catch (XmlPullParserException e3) {
                    e = e3;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(String.valueOf(str)), e);
                    if (uwVar != null) {
                    }
                }
            } catch (XmlPullParserException e4) {
                e = e4;
                str = charSequence;
            }
        } catch (IOException e5) {
            e = e5;
            str = charSequence;
        }
    }
}
