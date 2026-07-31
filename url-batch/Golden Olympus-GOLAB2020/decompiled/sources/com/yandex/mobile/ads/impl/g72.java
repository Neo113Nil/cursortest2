package com.yandex.mobile.ads.impl;

import android.text.Layout;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.b9;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class g72 extends jy1 {

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f26046n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f26047o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f26048p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    static final Pattern f26049q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    static final Pattern f26050r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f26051s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f26052t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    private static final b f26053u = new b(30.0f, 1, 1);

    /* renamed from: v, reason: collision with root package name */
    private static final a f26054v = new a(15);

    /* renamed from: m, reason: collision with root package name */
    private final XmlPullParserFactory f26055m;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int f26056a;

        a(int i4) {
            this.f26056a = i4;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f26057a;

        /* renamed from: b, reason: collision with root package name */
        final int f26058b;

        /* renamed from: c, reason: collision with root package name */
        final int f26059c;

        b(float f4, int i4, int i5) {
            this.f26057a = f4;
            this.f26058b = i4;
            this.f26059c = i5;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f26060a;

        /* renamed from: b, reason: collision with root package name */
        final int f26061b;

        c(int i4, int i5) {
            this.f26060a = i4;
            this.f26061b = i5;
        }
    }

    public g72() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f26055m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    private static k72 a(k72 k72Var) {
        return k72Var == null ? new k72() : k72Var;
    }

    private static Layout.Alignment b(String str) {
        String b4 = C2207rf.b(str);
        b4.getClass();
        switch (b4) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy1
    protected final c32 a(byte[] bArr, int i4, boolean z4) {
        try {
            XmlPullParser newPullParser = this.f26055m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new i72("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i4), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i5 = 0;
            b bVar = f26053u;
            a aVar = f26054v;
            l72 l72Var = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                h72 h72Var = (h72) arrayDeque.peek();
                if (i5 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar = a(newPullParser);
                            aVar = a(newPullParser, f26054v);
                            cVar = b(newPullParser);
                        }
                        a aVar2 = aVar;
                        b bVar2 = bVar;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                a(newPullParser, hashMap, aVar2, cVar, hashMap2, hashMap3);
                            } else {
                                try {
                                    h72 a4 = a(newPullParser, h72Var, hashMap2, bVar2);
                                    arrayDeque.push(a4);
                                    if (h72Var != null) {
                                        h72Var.a(a4);
                                    }
                                } catch (e32 e4) {
                                    ms0.b("TtmlDecoder", "Suppressing parser error", e4);
                                }
                            }
                            aVar = aVar2;
                            bVar = bVar2;
                        } else {
                            ms0.c("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        aVar = aVar2;
                        bVar = bVar2;
                        i5++;
                    } else if (eventType == 4) {
                        h72Var.getClass();
                        h72Var.a(h72.a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            h72 h72Var2 = (h72) arrayDeque.peek();
                            h72Var2.getClass();
                            l72Var = new l72(h72Var2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                    newPullParser.next();
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i5--;
                        }
                        newPullParser.next();
                    }
                    i5++;
                    newPullParser.next();
                }
            }
            if (l72Var != null) {
                return l72Var;
            }
            throw new e32("No TTML subtitles found");
        } catch (IOException e5) {
            throw new IllegalStateException("Unexpected error when reading input.", e5);
        } catch (XmlPullParserException e6) {
            throw new e32("Unable to decode source", e6);
        }
    }

    private static c b(XmlPullParser xmlPullParser) {
        String a4 = vk2.a(xmlPullParser, "extent");
        if (a4 == null) {
            return null;
        }
        Matcher matcher = f26051s.matcher(a4);
        if (!matcher.matches()) {
            ms0.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(a4));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            ms0.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(a4));
            return null;
        }
    }

    private static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(b9.h.f15438E0) || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f26052t.matcher(attributeValue);
        if (!matcher.matches()) {
            ms0.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                throw new e32("Invalid cell resolution " + parseInt + " " + parseInt2);
            }
            return new a(parseInt2);
        } catch (NumberFormatException unused) {
            ms0.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    private static void a(String str, k72 k72Var) {
        Matcher matcher;
        String group;
        int i4 = u82.f32873a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = f26048p.matcher(str);
        } else if (split.length == 2) {
            matcher = f26048p.matcher(split[1]);
            ms0.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new e32("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            group = matcher.group(3);
            group.getClass();
            switch (group) {
                case "%":
                    k72Var.c(3);
                    break;
                case "em":
                    k72Var.c(2);
                    break;
                case "px":
                    k72Var.c(1);
                    break;
                default:
                    throw new e32("Invalid unit for fontSize: '" + group + "'.");
            }
            String group2 = matcher.group(1);
            group2.getClass();
            k72Var.a(Float.parseFloat(group2));
            return;
        }
        throw new e32("Invalid expression for fontSize: '" + str + "'.");
    }

    private static b a(XmlPullParser xmlPullParser) {
        float f4;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i4 = u82.f32873a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f4 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new e32("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f4 = 1.0f;
        }
        b bVar = f26053u;
        int i5 = bVar.f26058b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i5 = Integer.parseInt(attributeValue3);
        }
        int i6 = bVar.f26059c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i6 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f4, i5, i6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0266 A[LOOP:0: B:2:0x000a->B:22:0x0266, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(XmlPullParser xmlPullParser, HashMap hashMap, a aVar, c cVar, HashMap hashMap2, HashMap hashMap3) {
        String a4;
        float parseFloat;
        float parseFloat2;
        float parseFloat3;
        float parseFloat4;
        a aVar2;
        float f4;
        float f5;
        int i4;
        String a5;
        int i5;
        char c4;
        String[] split;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            xmlPullParser.next();
            if (vk2.c(xmlPullParser, "style")) {
                String a6 = vk2.a(xmlPullParser, "style");
                k72 a7 = a(xmlPullParser, new k72());
                if (a6 != null) {
                    String trim = a6.trim();
                    if (trim.isEmpty()) {
                        split = new String[i7];
                    } else {
                        int i8 = u82.f32873a;
                        split = trim.split("\\s+", i6);
                    }
                    int length = split.length;
                    for (int i9 = i7; i9 < length; i9++) {
                        a7.a((k72) hashMap.get(split[i9]));
                    }
                }
                String f6 = a7.f();
                if (f6 != null) {
                    hashMap.put(f6, a7);
                }
            } else {
                if (vk2.c(xmlPullParser, "region")) {
                    String a8 = vk2.a(xmlPullParser, "id");
                    i72 i72Var = null;
                    if (a8 != null) {
                        String a9 = vk2.a(xmlPullParser, "origin");
                        if (a9 != null) {
                            Pattern pattern = f26050r;
                            Matcher matcher = pattern.matcher(a9);
                            Pattern pattern2 = f26051s;
                            Matcher matcher2 = pattern2.matcher(a9);
                            if (matcher.matches()) {
                                try {
                                    String group = matcher.group(1);
                                    group.getClass();
                                    parseFloat = Float.parseFloat(group) / 100.0f;
                                    String group2 = matcher.group(2);
                                    group2.getClass();
                                    parseFloat2 = Float.parseFloat(group2) / 100.0f;
                                } catch (NumberFormatException unused) {
                                    ms0.d("TtmlDecoder", "Ignoring region with malformed origin: ".concat(a9));
                                }
                            } else if (!matcher2.matches()) {
                                ms0.d("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(a9));
                            } else if (cVar == null) {
                                ms0.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(a9));
                            } else {
                                try {
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    int parseInt = Integer.parseInt(group3);
                                    String group4 = matcher2.group(2);
                                    group4.getClass();
                                    float f7 = parseInt / cVar.f26060a;
                                    parseFloat2 = Integer.parseInt(group4) / cVar.f26061b;
                                    parseFloat = f7;
                                } catch (NumberFormatException unused2) {
                                    ms0.d("TtmlDecoder", "Ignoring region with malformed origin: ".concat(a9));
                                }
                            }
                            String a10 = vk2.a(xmlPullParser, "extent");
                            if (a10 != null) {
                                Matcher matcher3 = pattern.matcher(a10);
                                Matcher matcher4 = pattern2.matcher(a10);
                                if (matcher3.matches()) {
                                    try {
                                        String group5 = matcher3.group(1);
                                        group5.getClass();
                                        parseFloat3 = Float.parseFloat(group5) / 100.0f;
                                        String group6 = matcher3.group(2);
                                        group6.getClass();
                                        parseFloat4 = Float.parseFloat(group6) / 100.0f;
                                    } catch (NumberFormatException unused3) {
                                        ms0.d("TtmlDecoder", "Ignoring region with malformed extent: ".concat(a9));
                                    }
                                } else if (!matcher4.matches()) {
                                    ms0.d("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(a9));
                                } else if (cVar == null) {
                                    ms0.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(a9));
                                } else {
                                    try {
                                        String group7 = matcher4.group(1);
                                        group7.getClass();
                                        int parseInt2 = Integer.parseInt(group7);
                                        String group8 = matcher4.group(2);
                                        group8.getClass();
                                        parseFloat3 = parseInt2 / cVar.f26060a;
                                        parseFloat4 = Integer.parseInt(group8) / cVar.f26061b;
                                    } catch (NumberFormatException unused4) {
                                        ms0.d("TtmlDecoder", "Ignoring region with malformed extent: ".concat(a9));
                                    }
                                }
                                float f8 = parseFloat3;
                                float f9 = parseFloat4;
                                String a11 = vk2.a(xmlPullParser, "displayAlign");
                                if (a11 != null) {
                                    String b4 = C2207rf.b(a11);
                                    b4.getClass();
                                    if (b4.equals("center")) {
                                        aVar2 = aVar;
                                        f4 = parseFloat2 + (f9 / 2.0f);
                                        f5 = parseFloat;
                                        i4 = 1;
                                    } else if (b4.equals("after")) {
                                        aVar2 = aVar;
                                        f4 = parseFloat2 + f9;
                                        f5 = parseFloat;
                                        i4 = 2;
                                    }
                                    float f10 = 1.0f / aVar2.f26056a;
                                    a5 = vk2.a(xmlPullParser, "writingMode");
                                    if (a5 != null) {
                                        String b5 = C2207rf.b(a5);
                                        b5.getClass();
                                        switch (b5.hashCode()) {
                                            case 3694:
                                                if (b5.equals("tb")) {
                                                    c4 = 0;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 3553396:
                                                if (b5.equals("tblr")) {
                                                    c4 = 1;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 3553576:
                                                if (b5.equals("tbrl")) {
                                                    c4 = 2;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            default:
                                                c4 = 65535;
                                                break;
                                        }
                                        switch (c4) {
                                            case 0:
                                            case 1:
                                                i5 = 2;
                                                break;
                                            case 2:
                                                i5 = 1;
                                                break;
                                        }
                                        i72Var = new i72(a8, f5, f4, 0, i4, f8, f9, 1, f10, i5);
                                    }
                                    i5 = Integer.MIN_VALUE;
                                    i72Var = new i72(a8, f5, f4, 0, i4, f8, f9, 1, f10, i5);
                                }
                                aVar2 = aVar;
                                f4 = parseFloat2;
                                f5 = parseFloat;
                                i4 = 0;
                                float f102 = 1.0f / aVar2.f26056a;
                                a5 = vk2.a(xmlPullParser, "writingMode");
                                if (a5 != null) {
                                }
                                i5 = Integer.MIN_VALUE;
                                i72Var = new i72(a8, f5, f4, 0, i4, f8, f9, 1, f102, i5);
                            } else {
                                ms0.d("TtmlDecoder", "Ignoring region without an extent");
                            }
                        } else {
                            ms0.d("TtmlDecoder", "Ignoring region without an origin");
                        }
                        if (i72Var != null) {
                            hashMap2.put(i72Var.f27128a, i72Var);
                        }
                    }
                    if (i72Var != null) {
                    }
                } else if (vk2.c(xmlPullParser, "metadata")) {
                    do {
                        xmlPullParser.next();
                        if (vk2.c(xmlPullParser, "image") && (a4 = vk2.a(xmlPullParser, "id")) != null) {
                            hashMap3.put(a4, xmlPullParser.nextText());
                        }
                    } while (!vk2.b(xmlPullParser, "metadata"));
                    if (vk2.b(xmlPullParser, "head")) {
                        return;
                    }
                    i6 = -1;
                    i7 = 0;
                }
                if (vk2.b(xmlPullParser, "head")) {
                }
            }
            if (vk2.b(xmlPullParser, "head")) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0106, code lost:
    
        if (r3 != r20) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static h72 a(XmlPullParser xmlPullParser, h72 h72Var, HashMap hashMap, b bVar) {
        long j4;
        char c4;
        char c5;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String str = null;
        k72 a4 = a(xmlPullParser, (k72) null);
        long j5 = -9223372036854775807L;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        String str2 = "";
        int i4 = 0;
        String[] strArr = null;
        while (i4 < attributeCount) {
            long j9 = j5;
            String attributeName = xmlPullParser.getAttributeName(i4);
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        break;
                    }
                case 1:
                    j8 = a(attributeValue, bVar);
                    break;
                case 2:
                    j7 = a(attributeValue, bVar);
                    break;
                case 3:
                    j6 = a(attributeValue, bVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                        c5 = 65535;
                    } else {
                        int i5 = u82.f32873a;
                        c5 = 65535;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length <= 0) {
                        break;
                    } else {
                        strArr = split;
                        break;
                    }
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
            }
            i4++;
            j5 = j9;
        }
        long j10 = j5;
        if (h72Var != null) {
            long j11 = h72Var.f26655d;
            if (j11 != j10) {
                if (j6 != j10) {
                    j6 += j11;
                }
                if (j7 != j10) {
                    j7 += j11;
                }
            }
        }
        long j12 = j6;
        if (j7 == j10) {
            if (j8 != j10) {
                j7 = j12 + j8;
            } else if (h72Var != null) {
                j4 = h72Var.f26656e;
            }
        }
        j4 = j7;
        return h72.a(xmlPullParser.getName(), j12, j4, a4, strArr, str2, str, h72Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static k72 a(XmlPullParser xmlPullParser, k72 k72Var) {
        char c4;
        boolean z4;
        char c5;
        int attributeCount = xmlPullParser.getAttributeCount();
        k72 k72Var2 = k72Var;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            String attributeName = xmlPullParser.getAttributeName(i4);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals(b9.h.f15459S)) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    k72Var2 = a(k72Var2).b("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    k72Var2 = a(k72Var2).a(attributeValue);
                    break;
                case 2:
                    k72Var2 = a(k72Var2).b(b(attributeValue));
                    break;
                case 3:
                    String b4 = C2207rf.b(attributeValue);
                    b4.getClass();
                    switch (b4.hashCode()) {
                        case -1461280213:
                            if (b4.equals("nounderline")) {
                                z4 = false;
                                break;
                            }
                            z4 = -1;
                            break;
                        case -1026963764:
                            if (b4.equals("underline")) {
                                z4 = true;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 913457136:
                            if (b4.equals("nolinethrough")) {
                                z4 = 2;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 1679736913:
                            if (b4.equals("linethrough")) {
                                z4 = 3;
                                break;
                            }
                            z4 = -1;
                            break;
                        default:
                            z4 = -1;
                            break;
                    }
                    switch (z4) {
                        case false:
                            k72Var2 = a(k72Var2).e(false);
                            break;
                        case true:
                            k72Var2 = a(k72Var2).e(true);
                            break;
                        case true:
                            k72Var2 = a(k72Var2).c(false);
                            break;
                        case true:
                            k72Var2 = a(k72Var2).c(true);
                            break;
                    }
                case 4:
                    k72Var2 = a(k72Var2).a("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        k72Var2 = a(k72Var2).b(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String b5 = C2207rf.b(attributeValue);
                    b5.getClass();
                    switch (b5.hashCode()) {
                        case -618561360:
                            if (b5.equals("baseContainer")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -410956671:
                            if (b5.equals("container")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -250518009:
                            if (b5.equals("delimiter")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -136074796:
                            if (b5.equals("textContainer")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 3016401:
                            if (b5.equals("base")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 3556653:
                            if (b5.equals(b9.h.f15450K0)) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                        case 4:
                            k72Var2 = a(k72Var2).e(2);
                            break;
                        case 1:
                            k72Var2 = a(k72Var2).e(1);
                            break;
                        case 2:
                            k72Var2 = a(k72Var2).e(4);
                            break;
                        case 3:
                        case 5:
                            k72Var2 = a(k72Var2).e(3);
                            break;
                    }
                case 7:
                    k72Var2 = a(k72Var2);
                    try {
                        k72Var2.b(fq.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zu0.a("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case '\b':
                    k72 a4 = a(k72Var2);
                    Matcher matcher = f26049q.matcher(attributeValue);
                    float f4 = Float.MAX_VALUE;
                    if (!matcher.matches()) {
                        zu0.a("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    } else {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f4 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e4) {
                            ms0.b("TtmlDecoder", "Failed to parse shear: " + attributeValue, e4);
                        }
                    }
                    k72Var2 = a4.b(f4);
                    break;
                case '\t':
                    String b6 = C2207rf.b(attributeValue);
                    b6.getClass();
                    if (b6.equals("all")) {
                        k72Var2 = a(k72Var2).d(true);
                        break;
                    } else if (b6.equals("none")) {
                        k72Var2 = a(k72Var2).d(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        k72Var2 = a(k72Var2);
                        a(attributeValue, k72Var2);
                        break;
                    } catch (e32 unused2) {
                        zu0.a("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case 11:
                    k72Var2 = a(k72Var2).a(f42.a(attributeValue));
                    break;
                case '\f':
                    String b7 = C2207rf.b(attributeValue);
                    b7.getClass();
                    if (b7.equals("before")) {
                        k72Var2 = a(k72Var2).d(1);
                        break;
                    } else if (b7.equals("after")) {
                        k72Var2 = a(k72Var2).d(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    k72Var2 = a(k72Var2);
                    try {
                        k72Var2.a(fq.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        zu0.a("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case 14:
                    k72Var2 = a(k72Var2).a(b(attributeValue));
                    break;
            }
        }
        return k72Var2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long a(String str, b bVar) {
        double d4;
        double d5;
        char c4 = 4;
        Matcher matcher = f26046n.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / bVar.f26057a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / bVar.f26058b) / bVar.f26057a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f26047o.matcher(str);
        if (matcher2.matches()) {
            String group3 = matcher2.group(1);
            group3.getClass();
            double parseDouble = Double.parseDouble(group3);
            String group4 = matcher2.group(2);
            group4.getClass();
            switch (group4.hashCode()) {
                case 102:
                    if (group4.equals("f")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 104:
                    if (group4.equals("h")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case InterfaceC1490j3.d.b.f16815g /* 109 */:
                    if (group4.equals("m")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 116:
                    if (group4.equals("t")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3494:
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    d4 = bVar.f26057a;
                    parseDouble /= d4;
                    break;
                case 1:
                    d5 = 3600.0d;
                    break;
                case 2:
                    d5 = 60.0d;
                    break;
                case 3:
                    d4 = bVar.f26059c;
                    parseDouble /= d4;
                    break;
                case 4:
                    d4 = 1000.0d;
                    parseDouble /= d4;
                    break;
            }
            parseDouble *= d5;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new e32("Malformed time expression: " + str);
    }
}
