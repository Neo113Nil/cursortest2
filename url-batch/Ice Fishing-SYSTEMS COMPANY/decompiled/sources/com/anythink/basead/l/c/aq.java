package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class aq extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9485a;

    /* renamed from: b, reason: collision with root package name */
    private String f9486b;

    /* renamed from: c, reason: collision with root package name */
    private String f9487c;

    public aq(XmlPullParser xmlPullParser) {
        this.f9485a = xmlPullParser.getAttributeValue(null, "model");
        this.f9486b = xmlPullParser.getAttributeValue(null, "currency");
        this.f9487c = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f9485a;
    }

    private String b() {
        return this.f9486b;
    }

    private String c() {
        return this.f9487c;
    }
}
