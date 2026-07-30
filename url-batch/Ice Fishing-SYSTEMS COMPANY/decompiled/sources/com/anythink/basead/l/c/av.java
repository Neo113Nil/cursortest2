package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class av extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9495a = "VAST";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9496b = "Error";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9497c = "Ad";

    /* renamed from: d, reason: collision with root package name */
    private w f9498d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<a> f9499e;

    /* renamed from: f, reason: collision with root package name */
    private String f9500f;

    public av(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9495a);
        this.f9500f = xmlPullParser.getAttributeValue(null, com.anythink.expressad.foundation.g.a.i);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9496b)) {
                    xmlPullParser.require(2, null, f9496b);
                    this.f9498d = new w(xmlPullParser);
                    xmlPullParser.require(3, null, f9496b);
                } else if (name == null || !name.equals(f9497c)) {
                    ay.b(xmlPullParser);
                } else {
                    if (this.f9499e == null) {
                        this.f9499e = new ArrayList<>();
                    }
                    xmlPullParser.require(2, null, f9497c);
                    this.f9499e.add(new a(xmlPullParser));
                    xmlPullParser.require(3, null, f9497c);
                }
            }
        }
    }

    private w b() {
        return this.f9498d;
    }

    private String c() {
        return this.f9500f;
    }

    public final ArrayList<a> a() {
        return this.f9499e;
    }
}
