package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class at extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f9490a;

    /* renamed from: b, reason: collision with root package name */
    private String f9491b;

    public at(XmlPullParser xmlPullParser) {
        this.f9490a = xmlPullParser.getAttributeValue(null, "event");
        this.f9491b = ay.a(xmlPullParser);
    }

    public final String a() {
        return this.f9490a;
    }

    public final String b() {
        return this.f9491b;
    }

    private void a(String str) {
        this.f9490a = str;
    }
}
