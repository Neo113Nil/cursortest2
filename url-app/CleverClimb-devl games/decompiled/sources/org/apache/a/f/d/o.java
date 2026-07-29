package org.apache.a.f.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: CookieSpecBase.java */
/* loaded from: classes2.dex */
public abstract class o extends b {
    protected static String a(org.apache.a.d.e eVar) {
        String b2 = eVar.b();
        int lastIndexOf = b2.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return b2;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return b2.substring(0, lastIndexOf);
    }

    protected static String b(org.apache.a.d.e eVar) {
        return eVar.a();
    }

    protected List<org.apache.a.d.b> a(org.apache.a.e[] eVarArr, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        ArrayList arrayList = new ArrayList(eVarArr.length);
        for (org.apache.a.e eVar2 : eVarArr) {
            String a2 = eVar2.a();
            String b2 = eVar2.b();
            if (a2 == null || a2.length() == 0) {
                throw new org.apache.a.d.k("Cookie name may not be empty");
            }
            c cVar = new c(a2, b2);
            cVar.e(a(eVar));
            cVar.d(b(eVar));
            org.apache.a.w[] c2 = eVar2.c();
            for (int length = c2.length - 1; length >= 0; length--) {
                org.apache.a.w wVar = c2[length];
                String lowerCase = wVar.a().toLowerCase(Locale.ENGLISH);
                cVar.a(lowerCase, wVar.b());
                org.apache.a.d.c a3 = a(lowerCase);
                if (a3 != null) {
                    a3.a(cVar, wVar.b());
                }
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // org.apache.a.d.h
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        Iterator<org.apache.a.d.c> it = c().iterator();
        while (it.hasNext()) {
            it.next().a(bVar, eVar);
        }
    }

    @Override // org.apache.a.d.h
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        Iterator<org.apache.a.d.c> it = c().iterator();
        while (it.hasNext()) {
            if (!it.next().b(bVar, eVar)) {
                return false;
            }
        }
        return true;
    }
}
