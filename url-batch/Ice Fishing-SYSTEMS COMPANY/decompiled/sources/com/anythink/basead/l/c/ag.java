package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ag extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9405a = "Icons";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9406b = "Icon";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<ab> f9407c = new ArrayList<>();

    public ag(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9405a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9406b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9406b);
                    this.f9407c.add(new ab(xmlPullParser));
                    xmlPullParser.require(3, null, f9406b);
                }
            }
        }
    }

    public final ArrayList<ab> a() {
        return this.f9407c;
    }
}
