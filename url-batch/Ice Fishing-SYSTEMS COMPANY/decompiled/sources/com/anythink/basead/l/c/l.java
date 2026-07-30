package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class l extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9556a = "Companion";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9557b = "StaticResource";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9558c = "IFrameResource";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9559d = "HTMLResource";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9560e = "AdParameters";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9561f = "AltText";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9562g = "CompanionClickThrough";

    /* renamed from: h, reason: collision with root package name */
    private static final String f9563h = "CompanionClickTracking";
    private static final String i = "TrackingEvents";

    /* renamed from: j, reason: collision with root package name */
    private String f9564j;

    /* renamed from: k, reason: collision with root package name */
    private String f9565k;

    /* renamed from: l, reason: collision with root package name */
    private String f9566l;

    /* renamed from: m, reason: collision with root package name */
    private String f9567m;

    /* renamed from: n, reason: collision with root package name */
    private String f9568n;

    /* renamed from: o, reason: collision with root package name */
    private String f9569o;

    /* renamed from: p, reason: collision with root package name */
    private String f9570p;

    /* renamed from: q, reason: collision with root package name */
    private String f9571q;

    /* renamed from: r, reason: collision with root package name */
    private String f9572r;

    /* renamed from: s, reason: collision with root package name */
    private ar f9573s;

    /* renamed from: t, reason: collision with root package name */
    private aa f9574t;

    /* renamed from: u, reason: collision with root package name */
    private z f9575u;

    /* renamed from: v, reason: collision with root package name */
    private b f9576v;

    /* renamed from: w, reason: collision with root package name */
    private g f9577w;

    /* renamed from: x, reason: collision with root package name */
    private n f9578x;

    /* renamed from: y, reason: collision with root package name */
    private o f9579y;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList<at> f9580z;

    public l(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9556a);
        this.f9564j = xmlPullParser.getAttributeValue(null, "id");
        this.f9565k = xmlPullParser.getAttributeValue(null, "width");
        this.f9566l = xmlPullParser.getAttributeValue(null, "height");
        this.f9567m = xmlPullParser.getAttributeValue(null, "assetWidth");
        this.f9568n = xmlPullParser.getAttributeValue(null, "assetHeight");
        this.f9569o = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f9570p = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f9571q = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f9572r = xmlPullParser.getAttributeValue(null, "adSlotID");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9557b)) {
                    xmlPullParser.require(2, null, f9557b);
                    this.f9573s = new ar(xmlPullParser);
                    xmlPullParser.require(3, null, f9557b);
                } else if (name != null && name.equals(f9558c)) {
                    xmlPullParser.require(2, null, f9558c);
                    this.f9574t = new aa(xmlPullParser);
                    xmlPullParser.require(3, null, f9558c);
                } else if (name != null && name.equals(f9559d)) {
                    xmlPullParser.require(2, null, f9559d);
                    this.f9575u = new z(xmlPullParser);
                    xmlPullParser.require(3, null, f9559d);
                } else if (name != null && name.equals(f9560e)) {
                    xmlPullParser.require(2, null, f9560e);
                    this.f9576v = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f9560e);
                } else if (name != null && name.equals(f9561f)) {
                    xmlPullParser.require(2, null, f9561f);
                    this.f9577w = new g(xmlPullParser);
                    xmlPullParser.require(3, null, f9561f);
                } else if (name != null && name.equals(f9562g)) {
                    xmlPullParser.require(2, null, f9562g);
                    this.f9578x = new n(xmlPullParser);
                    xmlPullParser.require(3, null, f9562g);
                } else if (name != null && name.equals(f9563h)) {
                    xmlPullParser.require(2, null, f9563h);
                    this.f9579y = new o(xmlPullParser);
                    xmlPullParser.require(3, null, f9563h);
                } else if (name == null || !name.equals(i)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, i);
                    this.f9580z = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, i);
                }
            }
        }
    }

    private String i() {
        return this.f9564j;
    }

    private String j() {
        return this.f9567m;
    }

    private String k() {
        return this.f9568n;
    }

    private String l() {
        return this.f9569o;
    }

    private String m() {
        return this.f9570p;
    }

    private String n() {
        return this.f9571q;
    }

    private String o() {
        return this.f9572r;
    }

    private b p() {
        return this.f9576v;
    }

    private g q() {
        return this.f9577w;
    }

    public final String a() {
        return this.f9565k;
    }

    public final String b() {
        return this.f9566l;
    }

    public final ar c() {
        return this.f9573s;
    }

    public final aa d() {
        return this.f9574t;
    }

    public final z e() {
        return this.f9575u;
    }

    public final n f() {
        return this.f9578x;
    }

    public final o g() {
        return this.f9579y;
    }

    public final ArrayList<at> h() {
        return this.f9580z;
    }
}
