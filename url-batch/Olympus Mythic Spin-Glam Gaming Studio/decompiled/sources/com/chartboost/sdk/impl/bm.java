package com.chartboost.sdk.impl;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* loaded from: classes8.dex */
public final class bm {
    public static final bm a = new bm();

    public final String a(Element element, String name) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (element.hasAttribute(name)) {
            String attribute = element.getAttribute(name);
            Intrinsics.checkNotNullExpressionValue(attribute, "getAttribute(...)");
            String obj = StringsKt.trim(attribute).toString();
            if (obj.length() > 0) {
                return obj;
            }
        }
        return null;
    }

    public final Element b(Element element, String tagName) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName)) {
                    return element2;
                }
            }
        }
        return null;
    }

    public final List c(Element element, String tagName) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if ((item instanceof Element) && Intrinsics.areEqual(((Element) item).getNodeName(), tagName)) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    public final String d(Element element, String tagName) {
        String obj;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        NodeList elementsByTagName = element.getElementsByTagName(tagName);
        int length = elementsByTagName.getLength();
        for (int i = 0; i < length; i++) {
            Node item = elementsByTagName.item(i);
            if (Intrinsics.areEqual(item.getParentNode(), element) && (item instanceof Element)) {
                Element element2 = (Element) item;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName)) {
                    String textContent = element2.getTextContent();
                    if (textContent == null || (obj = StringsKt.trim(textContent).toString()) == null || obj.length() <= 0) {
                        return null;
                    }
                    return obj;
                }
            }
        }
        return null;
    }

    public final List e(Element element, String tagName) {
        String textContent;
        String obj;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName) && (textContent = element2.getTextContent()) != null && (obj = StringsKt.trim(textContent).toString()) != null) {
                    if (obj.length() <= 0) {
                        obj = null;
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public final Object a(String xmlString) {
        Intrinsics.checkNotNullParameter(xmlString, "xmlString");
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            newInstance.setValidating(false);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(xmlString)));
            parse.getDocumentElement().normalize();
            return Result.m8023constructorimpl(parse);
        } catch (Exception e) {
            xb.b("Error parsing XML string.", e);
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new mb("Error parsing VAST XML: " + e.getMessage(), null, 2, null)));
        }
    }
}
