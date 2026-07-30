package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class an extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9480a = "NonLinearAds";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9481b = "NonLinear";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9482c = "TrackingEvents";

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<am> f9483d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<at> f9484e;

    public an(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9480a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null && name.equals(f9481b)) {
                    xmlPullParser.require(2, null, f9481b);
                    this.f9483d.add(new am(xmlPullParser));
                    xmlPullParser.require(3, null, f9481b);
                } else if (name == null || !name.equals(f9482c)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9482c);
                    this.f9484e = new au(xmlPullParser).a();
                    xmlPullParser.require(3, null, f9482c);
                }
            }
        }
    }

    private ArrayList<am> b() {
        return this.f9483d;
    }

    public final ArrayList<at> a() {
        return this.f9484e;
    }
}
