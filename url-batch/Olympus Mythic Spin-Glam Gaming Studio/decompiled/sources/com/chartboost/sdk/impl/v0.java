package com.chartboost.sdk.impl;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class v0 {
    public static final v0 a = new v0();

    public final u0 a(Element element, zj context) {
        List<Element> c;
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        bm bmVar = bm.a;
        String a2 = bmVar.a(element, VastAttributes.VENDOR);
        List c2 = bmVar.c(element, VastTagName.JAVA_SCRIPT_RESOURCE);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c2, 10));
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            arrayList.add(ob.a.a((Element) it.next()));
        }
        bm bmVar2 = bm.a;
        Element b = bmVar2.b(element, "TrackingEvents");
        ArrayList arrayList2 = new ArrayList();
        if (b != null && (c = bmVar2.c(b, "Tracking")) != null) {
            for (Element element2 : c) {
                bm bmVar3 = bm.a;
                String a3 = bmVar3.a(element2, "event");
                String a4 = bmVar3.a(element2, "offset");
                String textContent = element2.getTextContent();
                if (textContent != null) {
                    Intrinsics.checkNotNull(textContent);
                    String obj = StringsKt.trim(textContent).toString();
                    if (obj != null && obj.length() > 0) {
                        str = obj;
                        if (a3 != null && str != null) {
                            arrayList2.add(new qi(a3, str, context.c(), a4, null, null, 48, null));
                        }
                    }
                }
                str = null;
                if (a3 != null) {
                    arrayList2.add(new qi(a3, str, context.c(), a4, null, null, 48, null));
                }
            }
        }
        Element b2 = bm.a.b(element, VastTagName.VERIFICATION_PARAMETERS);
        return new u0(a2, arrayList, arrayList2, b2 != null ? b2.getTextContent() : null);
    }

    public final List b(Element adVerificationsParentElement, zj context) {
        u0 u0Var;
        Intrinsics.checkNotNullParameter(adVerificationsParentElement, "adVerificationsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List c = bm.a.c(adVerificationsParentElement, VastTagName.VERIFICATION);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                u0Var = a.a((Element) it.next(), context);
            } catch (Exception e) {
                xb.b("Failed to parse AdVerification element: " + e.getMessage(), e);
                u0Var = null;
            }
            if (u0Var != null) {
                arrayList.add(u0Var);
            }
        }
        return arrayList;
    }
}
