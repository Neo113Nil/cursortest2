package com.startapp.sdk.internal;

import android.text.TextUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes.dex */
public final class yi {

    /* renamed from: a, reason: collision with root package name */
    public final Node f7968a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7969b;

    public yi(Node node) {
        this.f7968a = node;
        this.f7969b = false;
    }

    public final ArrayList a(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList a3 = zk.a(this.f7968a, str, str2, list, Collections.singleton((short) 8));
        int size = a3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a3.get(i4);
            i4++;
            arrayList.add(new yi((Node) obj));
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
        int size = a3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a3.get(i4);
            i4++;
            String b4 = ((yi) obj).b();
            if (!TextUtils.isEmpty(b4)) {
                arrayList.add(b4);
            }
        }
        return arrayList;
    }

    public final ArrayList d(String str) {
        return a("Tracking", "TrackingEvents", "event", Collections.singletonList(str));
    }

    public final ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList d4 = d(str);
        int size = d4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = d4.get(i4);
            i4++;
            String b4 = ((yi) obj).b();
            if (!TextUtils.isEmpty(b4)) {
                arrayList.add(b4);
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
        Node node = this.f7968a;
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
            this.f7968a = node;
            this.f7969b = true;
            return;
        }
        throw new IOException();
    }

    public final yi a(String str, String str2) {
        ArrayList a3 = zk.a(this.f7968a, str, str2, null, Collections.singleton((short) 8));
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
        Node namedItem = this.f7968a.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ArrayList a3 = a("Creative", "Creatives", null, null);
        int size = a3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a3.get(i4);
            i4++;
            arrayList.addAll(((yi) obj).a("Companion", "CompanionAds", null, null));
        }
        return arrayList;
    }
}
