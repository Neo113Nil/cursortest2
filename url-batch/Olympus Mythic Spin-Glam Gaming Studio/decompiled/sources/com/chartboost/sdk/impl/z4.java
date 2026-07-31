package com.chartboost.sdk.impl;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class z4 {
    public static final z4 a = new z4();

    public final y4 a(Element element, zj zjVar) {
        List emptyList;
        List c = bm.a.c(element, "StaticResource");
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            lh a2 = mh.a.a((Element) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        List c2 = bm.a.c(element, "IFrameResource");
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = c2.iterator();
        while (it2.hasNext()) {
            l9 a3 = m9.a.a((Element) it2.next());
            if (a3 != null) {
                arrayList2.add(a3);
            }
        }
        List c3 = bm.a.c(element, "HTMLResource");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = c3.iterator();
        while (it3.hasNext()) {
            e9 a4 = f9.a.a((Element) it3.next());
            if (a4 != null) {
                arrayList3.add(a4);
            }
        }
        bm bmVar = bm.a;
        Element b = bmVar.b(element, "TrackingEvents");
        if (b == null || (emptyList = ui.a.a(b, zjVar, false)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        String d = bmVar.d(element, "CompanionClickThrough");
        List e = bmVar.e(element, "CompanionClickTracking");
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty() && list.isEmpty() && e.isEmpty()) {
            return null;
        }
        String a5 = bmVar.a(element, "id");
        String a6 = bmVar.a(element, "width");
        Integer intOrNull = a6 != null ? StringsKt.toIntOrNull(a6) : null;
        String a7 = bmVar.a(element, "height");
        Integer intOrNull2 = a7 != null ? StringsKt.toIntOrNull(a7) : null;
        String a8 = bmVar.a(element, VastAttributes.ASSET_WIDTH);
        Integer intOrNull3 = a8 != null ? StringsKt.toIntOrNull(a8) : null;
        String a9 = bmVar.a(element, VastAttributes.ASSET_HEIGHT);
        Integer intOrNull4 = a9 != null ? StringsKt.toIntOrNull(a9) : null;
        String a10 = bmVar.a(element, VastAttributes.EXPANDED_WIDTH);
        Integer intOrNull5 = a10 != null ? StringsKt.toIntOrNull(a10) : null;
        String a11 = bmVar.a(element, VastAttributes.EXPANDED_HEIGHT);
        return new y4(a5, intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, a11 != null ? StringsKt.toIntOrNull(a11) : null, bmVar.a(element, VastAttributes.API_FRAMEWORK), bmVar.a(element, VastAttributes.AD_SLOT_ID), bmVar.a(element, POBConstants.KEY_PXRATIO), bmVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K), bmVar.d(element, "AdParameters"), arrayList, arrayList2, arrayList3, list, d, e, null, 262144, null);
    }

    public final b5 b(Element element, zj context) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        bm bmVar = bm.a;
        String a2 = bmVar.a(element, "required");
        ArrayList arrayList = new ArrayList();
        Iterator it = bmVar.c(element, "Companion").iterator();
        while (it.hasNext()) {
            y4 a3 = a.a((Element) it.next(), context);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new b5(a2, arrayList);
    }
}
