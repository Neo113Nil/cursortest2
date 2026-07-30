package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class x extends ay {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9602c = "AdVerifications";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9603d = "Extension";

    /* renamed from: a, reason: collision with root package name */
    private String f9604a;

    /* renamed from: b, reason: collision with root package name */
    private e f9605b;

    public x(XmlPullParser xmlPullParser) {
        this.f9604a = xmlPullParser.getAttributeValue(null, "type");
        xmlPullParser.require(2, null, f9603d);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9602c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9602c);
                    this.f9605b = new e(xmlPullParser);
                    xmlPullParser.require(3, null, f9602c);
                }
            }
        }
    }

    private String b() {
        return this.f9604a;
    }

    public final e a() {
        return this.f9605b;
    }
}
