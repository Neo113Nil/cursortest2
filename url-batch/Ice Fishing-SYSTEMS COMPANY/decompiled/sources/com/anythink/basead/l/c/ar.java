package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ar extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9488a;

    /* renamed from: b, reason: collision with root package name */
    private String f9489b;

    public ar(XmlPullParser xmlPullParser) {
        this.f9488a = xmlPullParser.getAttributeValue(null, "creativeType");
        this.f9489b = ay.a(xmlPullParser);
    }

    private String b() {
        return this.f9488a;
    }

    public final String a() {
        return this.f9489b;
    }
}
