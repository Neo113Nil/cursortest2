package com.chartboost.sdk.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
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
public final class r9 {
    public static final r9 a = new r9();

    public final n9 a(Element element, zj context) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
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
        Element b = bmVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G);
        p9 a5 = b != null ? q9.a.a(b) : null;
        List e = bmVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J);
        Iterator it4 = e.iterator();
        while (it4.hasNext()) {
            context.b().add(new qi("iconView", (String) it4.next(), context.c(), null, null, null, 56, null));
        }
        bm bmVar2 = bm.a;
        String a6 = bmVar2.a(element, "program");
        String a7 = bmVar2.a(element, "width");
        Integer intOrNull = a7 != null ? StringsKt.toIntOrNull(a7) : null;
        String a8 = bmVar2.a(element, "height");
        return new n9(a6, intOrNull, a8 != null ? StringsKt.toIntOrNull(a8) : null, bmVar2.a(element, "xPosition"), bmVar2.a(element, "yPosition"), bmVar2.a(element, IronSourceConstants.EVENTS_DURATION), bmVar2.a(element, "offset"), bmVar2.a(element, VastAttributes.API_FRAMEWORK), bmVar2.a(element, POBConstants.KEY_PXRATIO), bmVar2.a(element, "altText"), bmVar2.a(element, "hoverText"), arrayList, arrayList2, arrayList3, a5, e);
    }

    public final List b(Element parentElement, zj context) {
        List c;
        n9 n9Var;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        bm bmVar = bm.a;
        Element b = bmVar.b(parentElement, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B);
        if (b == null || (c = bmVar.c(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                n9Var = a.a((Element) it.next(), context);
            } catch (Exception e) {
                xb.b("Failed to parse Icon element: " + e.getMessage(), e);
                n9Var = null;
            }
            if (n9Var != null) {
                arrayList.add(n9Var);
            }
        }
        return arrayList;
    }
}
