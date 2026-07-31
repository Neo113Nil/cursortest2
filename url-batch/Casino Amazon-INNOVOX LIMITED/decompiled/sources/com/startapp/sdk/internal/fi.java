package com.startapp.sdk.internal;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class fi {

    /* renamed from: a, reason: collision with root package name */
    public final Node f240a;
    public final boolean b;

    public fi(Node node) {
        this.f240a = node;
        this.b = false;
    }

    public final ArrayList a(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList a2 = ck.a(this.f240a, str, str2, list, Collections.singleton((short) 8));
        int size = a2.size();
        int i = 0;
        while (i < size) {
            Object obj = a2.get(i);
            i++;
            arrayList.add(new fi((Node) obj));
        }
        return arrayList;
    }

    public final Integer b(String str) {
        try {
            String a2 = a(str);
            if (a2 != null) {
                return Integer.valueOf(Integer.parseInt(a2));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final String c() {
        Node node = this.f240a;
        if (node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    public final ArrayList d(String str) {
        return a("Tracking", "TrackingEvents", NotificationCompat.CATEGORY_EVENT, Collections.singletonList(str));
    }

    public final ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList d = d(str);
        int size = d.size();
        int i = 0;
        while (i < size) {
            Object obj = d.get(i);
            i++;
            String c = ((fi) obj).c();
            if (!TextUtils.isEmpty(c)) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    public final String f(String str) {
        fi a2 = a(str, null);
        if (a2 == null) {
            return null;
        }
        return a2.c();
    }

    public final String d() {
        String a2;
        fi a3 = a("StaticResource", null);
        if (a3 == null || (a2 = a3.a("creativeType")) == null) {
            return null;
        }
        return a2.toLowerCase(Locale.ROOT);
    }

    public fi(String str) {
        String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setCoalescing(true);
        newInstance.setExpandEntityReferences(false);
        ArrayList a2 = ck.a(newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst))), null, null, null, Collections.singleton((short) 8));
        Node node = a2.isEmpty() ? null : (Node) a2.get(0);
        if (node != null) {
            this.f240a = node;
            this.b = true;
            return;
        }
        throw new IOException();
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ArrayList a2 = a("Creative", "Creatives", null, null);
        int size = a2.size();
        int i = 0;
        while (i < size) {
            Object obj = a2.get(i);
            i++;
            fi a3 = ((fi) obj).a("Linear", null);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    public final ArrayList c(String str) {
        ArrayList a2 = a(str, null, null);
        ArrayList arrayList = new ArrayList();
        int size = a2.size();
        int i = 0;
        while (i < size) {
            Object obj = a2.get(i);
            i++;
            String c = ((fi) obj).c();
            if (!TextUtils.isEmpty(c)) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    public final fi a(String str, String str2) {
        ArrayList a2 = ck.a(this.f240a, str, str2, null, Collections.singleton((short) 8));
        Node node = a2.isEmpty() ? null : (Node) a2.get(0);
        if (node != null) {
            return new fi(node);
        }
        return null;
    }

    public final ArrayList a(String str, String str2, String str3, List list) {
        ArrayList arrayList = new ArrayList();
        fi a2 = a(str2, null);
        return a2 == null ? arrayList : a2.a(str, str3, list);
    }

    public final String a(String str) {
        Node namedItem = this.f240a.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ArrayList a2 = a("Creative", "Creatives", null, null);
        int size = a2.size();
        int i = 0;
        while (i < size) {
            Object obj = a2.get(i);
            i++;
            arrayList.addAll(((fi) obj).a("Companion", "CompanionAds", null, null));
        }
        return arrayList;
    }
}
