package com.startapp.sdk.internal;

import android.text.TextUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes.dex */
public final class yi {

    /* renamed from: a, reason: collision with root package name */
    public final Node f4820a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4821b;

    public yi(Node node) {
        this.f4820a = node;
        this.f4821b = false;
    }

    public final ArrayList a(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = zk.a(this.f4820a, str, str2, list, Collections.singleton((short) 8)).iterator();
        while (it.hasNext()) {
            arrayList.add(new yi((Node) it.next()));
        }
        return arrayList;
    }

    public final Integer b(String str) {
        try {
            String a3 = a(str);
            if (a3 != null) {
                return Integer.valueOf(Integer.parseInt(a3));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final ArrayList c(String str) {
        ArrayList a3 = a(str, null, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = a3.iterator();
        while (it.hasNext()) {
            String b3 = ((yi) it.next()).b();
            if (!TextUtils.isEmpty(b3)) {
                arrayList.add(b3);
            }
        }
        return arrayList;
    }

    public final ArrayList d(String str) {
        return a("Tracking", "TrackingEvents", "event", Collections.singletonList(str));
    }

    public final ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = d(str).iterator();
        while (it.hasNext()) {
            String b3 = ((yi) it.next()).b();
            if (!TextUtils.isEmpty(b3)) {
                arrayList.add(b3);
            }
        }
        return arrayList;
    }

    public final String f(String str) {
        yi a3 = a(str, null);
        if (a3 == null) {
            return null;
        }
        return a3.b();
    }

    public final String b() {
        Node node = this.f4820a;
        if (node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    public yi(String str) {
        String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setCoalescing(true);
        newInstance.setExpandEntityReferences(false);
        ArrayList a3 = zk.a(newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst))), null, null, null, Collections.singleton((short) 8));
        Node node = a3.isEmpty() ? null : (Node) a3.get(0);
        if (node != null) {
            this.f4820a = node;
            this.f4821b = true;
            return;
        }
        throw new IOException();
    }

    public final yi a(String str, String str2) {
        ArrayList a3 = zk.a(this.f4820a, str, str2, null, Collections.singleton((short) 8));
        Node node = a3.isEmpty() ? null : (Node) a3.get(0);
        if (node != null) {
            return new yi(node);
        }
        return null;
    }

    public final String c() {
        String a3;
        yi a4 = a("StaticResource", null);
        if (a4 == null || (a3 = a4.a("creativeType")) == null) {
            return null;
        }
        return a3.toLowerCase(Locale.ROOT);
    }

    public final ArrayList a(String str, String str2, String str3, List list) {
        ArrayList arrayList = new ArrayList();
        yi a3 = a(str2, null);
        return a3 == null ? arrayList : a3.a(str, str3, list);
    }

    public final String a(String str) {
        Node namedItem = this.f4820a.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = a("Creative", "Creatives", null, null).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((yi) it.next()).a("Companion", "CompanionAds", null, null));
        }
        return arrayList;
    }
}
