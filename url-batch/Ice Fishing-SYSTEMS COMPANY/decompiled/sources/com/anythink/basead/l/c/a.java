package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9375a = "Ad";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9376b = "InLine";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9377c = "Wrapper";

    /* renamed from: d, reason: collision with root package name */
    private ai f9378d;

    /* renamed from: e, reason: collision with root package name */
    private bc f9379e;

    /* renamed from: f, reason: collision with root package name */
    private String f9380f;

    /* renamed from: g, reason: collision with root package name */
    private String f9381g;

    public a(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9375a);
        this.f9380f = xmlPullParser.getAttributeValue(null, "id");
        this.f9381g = xmlPullParser.getAttributeValue(null, "sequence");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9376b)) {
                    xmlPullParser.require(2, null, f9376b);
                    this.f9378d = new ai(xmlPullParser);
                    xmlPullParser.require(3, null, f9376b);
                } else if (name == null || !name.equals(f9377c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9377c);
                    this.f9379e = new bc(xmlPullParser);
                    xmlPullParser.require(3, null, f9377c);
                }
            }
        }
    }

    private String c() {
        return this.f9380f;
    }

    private String d() {
        return this.f9381g;
    }

    public final ai a() {
        return this.f9378d;
    }

    public final bc b() {
        return this.f9379e;
    }
}
