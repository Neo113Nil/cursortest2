package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class s extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9599a = "Creatives";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9600b = "Creative";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<p> f9601c = new ArrayList<>();

    public s(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9599a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9600b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9600b);
                    this.f9601c.add(new p(xmlPullParser));
                    xmlPullParser.require(3, null, f9600b);
                }
            }
        }
    }

    public final ArrayList<p> a() {
        return this.f9601c;
    }
}
