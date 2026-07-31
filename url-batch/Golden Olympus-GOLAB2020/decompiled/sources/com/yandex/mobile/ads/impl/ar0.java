package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hu;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class ar0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f23421a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xd2 f23422b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final i40 f23423c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final iz1 f23424d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final sk2<mv0> f23425e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final sk2<sh0> f23426f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final sk2<a62> f23427g;

    public /* synthetic */ ar0() {
        this(new uk2(), new xd2(), new i40(), new iz1(), new sk2(new ov0(), "MediaFiles", "MediaFile"), new sk2(new th0(), "Icons", "Icon"), new sk2(new b62(), "TrackingEvents", "Tracking"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void a(@NotNull XmlPullParser parser, @NotNull hu.a creativeBuilder, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(creativeBuilder, "creativeBuilder");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f23421a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Linear");
        this.f23424d.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        String attributeValue = parser.getAttributeValue(null, "skipoffset");
        if (attributeValue == null) {
            attributeValue = "";
        }
        creativeBuilder.a(attributeValue.length() > 0 ? new hz1(attributeValue) : null);
        while (true) {
            this.f23421a.getClass();
            if (!uk2.a(parser)) {
                return;
            }
            this.f23421a.getClass();
            if (uk2.b(parser)) {
                String name = parser.getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case -2049897434:
                            if (!name.equals("VideoClicks")) {
                                break;
                            } else {
                                wd2 a4 = this.f23422b.a(parser, base64EncodingParameters);
                                creativeBuilder.b(a4.a());
                                Iterator<String> it = a4.b().iterator();
                                while (it.hasNext()) {
                                    creativeBuilder.a(new a62("clickTracking", it.next(), null));
                                }
                                break;
                            }
                        case -1927368268:
                            if (!name.equals("Duration")) {
                                break;
                            } else {
                                creativeBuilder.a(this.f23423c.a(parser));
                                break;
                            }
                        case -1348833651:
                            if (!name.equals("AdParameters")) {
                                break;
                            } else {
                                this.f23421a.getClass();
                                creativeBuilder.a(uk2.c(parser));
                                break;
                            }
                        case -385055469:
                            if (!name.equals("MediaFiles")) {
                                break;
                            } else {
                                creativeBuilder.b(this.f23425e.a(parser, base64EncodingParameters));
                                break;
                            }
                        case 70476538:
                            if (!name.equals("Icons")) {
                                break;
                            } else {
                                creativeBuilder.a(this.f23426f.a(parser, base64EncodingParameters));
                                break;
                            }
                        case 611554000:
                            if (!name.equals("TrackingEvents")) {
                                break;
                            } else {
                                ArrayList a5 = this.f23427g.a(parser, base64EncodingParameters);
                                int size = a5.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    Object obj = a5.get(i4);
                                    i4++;
                                    creativeBuilder.a((a62) obj);
                                }
                                break;
                            }
                    }
                }
                this.f23421a.getClass();
                uk2.d(parser);
            }
        }
    }

    public ar0(@NotNull uk2 xmlHelper, @NotNull xd2 videoClicksParser, @NotNull i40 durationParser, @NotNull iz1 skipOffsetParser, @NotNull sk2<mv0> mediaFileArrayParser, @NotNull sk2<sh0> iconArrayParser, @NotNull sk2<a62> trackingEventsArrayParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(videoClicksParser, "videoClicksParser");
        Intrinsics.checkNotNullParameter(durationParser, "durationParser");
        Intrinsics.checkNotNullParameter(skipOffsetParser, "skipOffsetParser");
        Intrinsics.checkNotNullParameter(mediaFileArrayParser, "mediaFileArrayParser");
        Intrinsics.checkNotNullParameter(iconArrayParser, "iconArrayParser");
        Intrinsics.checkNotNullParameter(trackingEventsArrayParser, "trackingEventsArrayParser");
        this.f23421a = xmlHelper;
        this.f23422b = videoClicksParser;
        this.f23423c = durationParser;
        this.f23424d = skipOffsetParser;
        this.f23425e = mediaFileArrayParser;
        this.f23426f = iconArrayParser;
        this.f23427g = trackingEventsArrayParser;
    }
}
