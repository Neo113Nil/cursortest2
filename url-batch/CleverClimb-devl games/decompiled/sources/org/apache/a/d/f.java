package org.apache.a.d;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: CookiePathComparator.java */
/* loaded from: classes2.dex */
public class f implements Serializable, Comparator<b> {
    private String a(b bVar) {
        String d2 = bVar.d();
        if (d2 == null) {
            d2 = "/";
        }
        if (d2.endsWith("/")) {
            return d2;
        }
        return d2 + '/';
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        String a2 = a(bVar);
        String a3 = a(bVar2);
        if (a2.equals(a3)) {
            return 0;
        }
        if (a2.startsWith(a3)) {
            return -1;
        }
        return a3.startsWith(a2) ? 1 : 0;
    }
}
