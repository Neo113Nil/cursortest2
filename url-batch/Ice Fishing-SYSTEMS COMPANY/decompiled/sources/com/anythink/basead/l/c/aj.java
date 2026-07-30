package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class aj extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9430a = "Linear";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9431b = "AdParameters";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9432c = "Duration";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9433d = "MediaFiles";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9434e = "TrackingEvents";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9435f = "VideoClicks";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9436g = "Icons";

    /* renamed from: h, reason: collision with root package name */
    private String f9437h;
    private b i;

    /* renamed from: j, reason: collision with root package name */
    private v f9438j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<ak> f9439k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<at> f9440l;

    /* renamed from: m, reason: collision with root package name */
    private bb f9441m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<ab> f9442n;

    public aj(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9430a);
        this.f9437h = xmlPullParser.getAttributeValue(null, "skipoffset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9431b)) {
                    xmlPullParser.require(2, null, f9431b);
                    this.i = new b(xmlPullParser);
                    xmlPullParser.require(3, null, f9431b);
                } else if (name != null && name.equals(f9432c)) {
                    xmlPullParser.require(2, null, f9432c);
                    this.f9438j = new v(xmlPullParser);
                    xmlPullParser.require(3, null, f9432c);
                } else if (name != null && name.equals(f9433d)) {
                    xmlPullParser.require(2, null, f9433d);
                    this.f9439k = new al(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9433d);
                } else if (name != null && name.equals(f9434e)) {
                    xmlPullParser.require(2, null, f9434e);
                    this.f9440l = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9434e);
                } else if (name != null && name.equals(f9435f)) {
                    xmlPullParser.require(2, null, f9435f);
                    this.f9441m = new bb(xmlPullParser);
                    xmlPullParser.require(3, null, f9435f);
                } else if (name == null || !name.equals(f9436g)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9436g);
                    this.f9442n = new ag(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9436g);
                }
            }
        }
    }

    private b f() {
        return this.i;
    }

    private ArrayList<ab> g() {
        return this.f9442n;
    }

    public final String a() {
        return this.f9437h;
    }

    public final v b() {
        return this.f9438j;
    }

    public final ArrayList<ak> c() {
        return this.f9439k;
    }

    public final ArrayList<at> d() {
        return this.f9440l;
    }

    public final bb e() {
        return this.f9441m;
    }
}
