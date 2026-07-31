package com.chartboost.sdk.impl;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes6.dex */
public final class p8 {
    public static final p8 a = new p8();

    public final n8 a(Element element, zj context) {
        String str;
        String str2;
        String a2;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        String a3 = bm.a.a(element, "type");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim(textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Intrinsics.checkNotNull(item, "null cannot be cast to non-null type org.w3c.dom.Element");
                Element element2 = (Element) item;
                String nodeName = element2.getNodeName();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length2 = element2.getAttributes().getLength();
                for (int i2 = 0; i2 < length2; i2++) {
                    Node item2 = element2.getAttributes().item(i2);
                    String nodeName2 = item2.getNodeName();
                    Intrinsics.checkNotNullExpressionValue(nodeName2, "getNodeName(...)");
                    String nodeValue = item2.getNodeValue();
                    Intrinsics.checkNotNullExpressionValue(nodeValue, "getNodeValue(...)");
                    linkedHashMap.put(nodeName2, nodeValue);
                }
                String textContent2 = element2.getTextContent();
                if (textContent2 == null || (str2 = StringsKt.trim(textContent2).toString()) == null || str2.length() <= 0) {
                    str2 = null;
                }
                if (Intrinsics.areEqual(nodeName, "Tracking") && Intrinsics.areEqual(element2.getParentNode(), element) && (a2 = bm.a.a(element2, "event")) != null && str2 != null) {
                    context.b().add(new qi(a2, str2, context.c(), null, null, null, 56, null));
                }
                Intrinsics.checkNotNull(nodeName);
                arrayList.add(new o8(nodeName, linkedHashMap, str2));
            }
        }
        return new n8(a3, str, arrayList);
    }

    public final List b(Element extensionsParentElement, zj context) {
        n8 n8Var;
        Intrinsics.checkNotNullParameter(extensionsParentElement, "extensionsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List c = bm.a.c(extensionsParentElement, VastTagName.EXTENSION);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                n8Var = a.a((Element) it.next(), context);
            } catch (Exception e) {
                xb.b("Failed to parse Extension element: " + e.getMessage(), e);
                n8Var = null;
            }
            if (n8Var != null) {
                arrayList.add(n8Var);
            }
        }
        return arrayList;
    }
}
