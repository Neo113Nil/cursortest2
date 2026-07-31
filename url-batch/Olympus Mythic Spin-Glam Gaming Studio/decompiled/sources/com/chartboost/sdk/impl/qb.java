package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class qb {
    public static final qb a = new qb();

    public final pb a(Element element, zj context) {
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        bm bmVar = bm.a;
        String d = bmVar.d(element, "Duration");
        Element b = bmVar.b(element, "TrackingEvents");
        if (b == null || (emptyList = ui.a(ui.a, b, context, false, 4, null)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        Element b2 = bmVar.b(element, "VideoClicks");
        mk a2 = b2 != null ? nk.a.a(b2) : null;
        Element b3 = bmVar.b(element, "MediaFiles");
        if (b3 == null || (emptyList2 = gc.a.b(b3)) == null) {
            emptyList2 = CollectionsKt.emptyList();
        }
        return new pb(d, list, a2, emptyList2, r9.a.b(element, context));
    }
}
