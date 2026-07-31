package com.startapp.sdk.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class ck {
    public static ArrayList a(Node node, String str, String str2, List list, Set set) {
        NamedNodeMap attributes;
        Node namedItem;
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if ((str == null || str.equals(item.getNodeName())) && ((TextUtils.isEmpty(str2) || list == null || ((attributes = item.getAttributes()) != null && (namedItem = attributes.getNamedItem(str2)) != null && list.contains(namedItem.getNodeValue()))) && (set == null || !set.contains(Short.valueOf(item.getNodeType()))))) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }
}
