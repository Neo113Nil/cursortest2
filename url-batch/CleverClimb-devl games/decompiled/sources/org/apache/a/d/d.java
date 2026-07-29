package org.apache.a.d;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: CookieIdentityComparator.java */
/* loaded from: classes2.dex */
public class d implements Serializable, Comparator<b> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        int compareTo = bVar.a().compareTo(bVar2.a());
        if (compareTo == 0) {
            String c2 = bVar.c();
            if (c2 == null) {
                c2 = "";
            } else if (c2.indexOf(46) == -1) {
                c2 = c2 + ".local";
            }
            String c3 = bVar2.c();
            if (c3 == null) {
                c3 = "";
            } else if (c3.indexOf(46) == -1) {
                c3 = c3 + ".local";
            }
            compareTo = c2.compareToIgnoreCase(c3);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        String d2 = bVar.d();
        if (d2 == null) {
            d2 = "/";
        }
        String d3 = bVar2.d();
        if (d3 == null) {
            d3 = "/";
        }
        return d2.compareTo(d3);
    }
}
