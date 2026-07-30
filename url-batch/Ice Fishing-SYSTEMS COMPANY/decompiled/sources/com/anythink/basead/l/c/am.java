package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class am extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9459a = "NonLinear";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9460b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9461c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9462d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9463e = "AdParameters";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9464f = "NonLinearClickThrough";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9465g = "NonLinearClickTracking";

    /* renamed from: h, reason: collision with root package name */
    private String f9466h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f9467j;

    /* renamed from: k, reason: collision with root package name */
    private String f9468k;

    /* renamed from: l, reason: collision with root package name */
    private String f9469l;

    /* renamed from: m, reason: collision with root package name */
    private String f9470m;

    /* renamed from: n, reason: collision with root package name */
    private String f9471n;

    /* renamed from: o, reason: collision with root package name */
    private String f9472o;

    /* renamed from: p, reason: collision with root package name */
    private String f9473p;

    /* renamed from: q, reason: collision with root package name */
    private ar f9474q;

    /* renamed from: r, reason: collision with root package name */
    private aa f9475r;

    /* renamed from: s, reason: collision with root package name */
    private z f9476s;

    /* renamed from: t, reason: collision with root package name */
    private b f9477t;

    /* renamed from: u, reason: collision with root package name */
    private ao f9478u;

    /* renamed from: v, reason: collision with root package name */
    private ap f9479v;

    public am(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9459a);
        this.f9466h = xmlPullParser.getAttributeValue(null, "id");
        this.i = xmlPullParser.getAttributeValue(null, "width");
        this.f9467j = xmlPullParser.getAttributeValue(null, "height");
        this.f9468k = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f9469l = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f9470m = xmlPullParser.getAttributeValue(null, "scalable");
        this.f9471n = xmlPullParser.getAttributeValue(null, "maintainAspectRatio");
        this.f9472o = xmlPullParser.getAttributeValue(null, "minSuggestedDuration");
        this.f9473p = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9460b)) {
                    xmlPullParser.require(2, null, f9460b);
                    this.f9474q = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f9460b);
                } else if (name != null && name.equals(f9461c)) {
                    xmlPullParser.require(2, null, f9461c);
                    this.f9475r = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f9461c);
                } else if (name != null && name.equals(f9462d)) {
                    xmlPullParser.require(2, null, f9462d);
                    this.f9476s = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f9462d);
                } else if (name != null && name.equals(f9463e)) {
                    xmlPullParser.require(2, null, f9463e);
                    this.f9477t = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f9463e);
                } else if (name != null && name.equals(f9464f)) {
                    xmlPullParser.require(2, null, f9464f);
                    this.f9478u = new ao(xmlPullParser);
                    xmlPullParser.require(3, null, f9464f);
                } else if (name == null || !name.equals(f9465g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9465g);
                    this.f9479v = new ap(xmlPullParser);
                    xmlPullParser.require(3, null, f9465g);
                }
            }
        }
    }

    private String a() {
        return this.f9466h;
    }

    private String b() {
        return this.i;
    }

    private String c() {
        return this.f9467j;
    }

    private String d() {
        return this.f9468k;
    }

    private String e() {
        return this.f9469l;
    }

    private String f() {
        return this.f9470m;
    }

    private String g() {
        return this.f9471n;
    }

    private String h() {
        return this.f9472o;
    }

    private String i() {
        return this.f9473p;
    }

    private ar j() {
        return this.f9474q;
    }

    private aa k() {
        return this.f9475r;
    }

    private z l() {
        return this.f9476s;
    }

    private b m() {
        return this.f9477t;
    }

    private ao n() {
        return this.f9478u;
    }

    private ap o() {
        return this.f9479v;
    }
}
