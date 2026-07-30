package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class b extends ay {

    /* renamed from: a, reason: collision with root package name */
    private final String f9519a;

    /* renamed from: b, reason: collision with root package name */
    private String f9520b;

    public b(XmlPullParser xmlPullParser) {
        this.f9519a = xmlPullParser.getAttributeValue(null, "xmlEncoded");
        this.f9520b = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f9519a;
    }

    private String b() {
        return this.f9520b;
    }
}
