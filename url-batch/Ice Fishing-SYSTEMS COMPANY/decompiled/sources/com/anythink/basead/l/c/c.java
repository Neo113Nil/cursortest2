package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class c extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9549a;

    /* renamed from: b, reason: collision with root package name */
    private String f9550b;

    public c(XmlPullParser xmlPullParser) {
        this.f9549a = xmlPullParser.getAttributeValue(null, com.anythink.expressad.foundation.g.a.i);
        this.f9550b = ay.a(xmlPullParser);
    }

    private String a() {
        return this.f9549a;
    }

    private String b() {
        return this.f9550b;
    }
}
