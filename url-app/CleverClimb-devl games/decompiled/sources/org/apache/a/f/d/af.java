package org.apache.a.f.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: RFC2965Spec.java */
/* loaded from: classes2.dex */
public class af extends y {
    @Override // org.apache.a.f.d.y, org.apache.a.d.h
    public int a() {
        return 1;
    }

    @Override // org.apache.a.f.d.y
    public String toString() {
        return "rfc2965";
    }

    public af() {
        this(null, false);
    }

    public af(String[] strArr, boolean z) {
        super(strArr, z);
        a("domain", new ad());
        a("port", new ae());
        a("commenturl", new ab());
        a("discard", new ac());
        a("version", new ah());
    }

    @Override // org.apache.a.f.d.y, org.apache.a.d.h
    public List<org.apache.a.d.b> a(org.apache.a.d dVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (dVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        if (!dVar.c().equalsIgnoreCase("Set-Cookie2")) {
            throw new org.apache.a.d.k("Unrecognized cookie header '" + dVar.toString() + "'");
        }
        return b(dVar.e(), c(eVar));
    }

    @Override // org.apache.a.f.d.o
    protected List<org.apache.a.d.b> a(org.apache.a.e[] eVarArr, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        return b(eVarArr, c(eVar));
    }

    private List<org.apache.a.d.b> b(org.apache.a.e[] eVarArr, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        ArrayList arrayList = new ArrayList(eVarArr.length);
        for (org.apache.a.e eVar2 : eVarArr) {
            String a2 = eVar2.a();
            String b2 = eVar2.b();
            if (a2 == null || a2.length() == 0) {
                throw new org.apache.a.d.k("Cookie name may not be empty");
            }
            d dVar = new d(a2, b2);
            dVar.e(a(eVar));
            dVar.d(b(eVar));
            dVar.a(new int[]{eVar.c()});
            org.apache.a.w[] c2 = eVar2.c();
            HashMap hashMap = new HashMap(c2.length);
            for (int length = c2.length - 1; length >= 0; length--) {
                org.apache.a.w wVar = c2[length];
                hashMap.put(wVar.a().toLowerCase(Locale.ENGLISH), wVar);
            }
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                org.apache.a.w wVar2 = (org.apache.a.w) ((Map.Entry) it.next()).getValue();
                String lowerCase = wVar2.a().toLowerCase(Locale.ENGLISH);
                dVar.a(lowerCase, wVar2.b());
                org.apache.a.d.c a3 = a(lowerCase);
                if (a3 != null) {
                    a3.a(dVar, wVar2.b());
                }
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    @Override // org.apache.a.f.d.y, org.apache.a.f.d.o, org.apache.a.d.h
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        super.a(bVar, c(eVar));
    }

    @Override // org.apache.a.f.d.o, org.apache.a.d.h
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        return super.b(bVar, c(eVar));
    }

    @Override // org.apache.a.f.d.y
    protected void a(org.apache.a.k.b bVar, org.apache.a.d.b bVar2, int i) {
        String a2;
        int[] e;
        super.a(bVar, bVar2, i);
        if (!(bVar2 instanceof org.apache.a.d.a) || (a2 = ((org.apache.a.d.a) bVar2).a("port")) == null) {
            return;
        }
        bVar.a("; $Port");
        bVar.a("=\"");
        if (a2.trim().length() > 0 && (e = bVar2.e()) != null) {
            int length = e.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 > 0) {
                    bVar.a(",");
                }
                bVar.a(Integer.toString(e[i2]));
            }
        }
        bVar.a("\"");
    }

    private static org.apache.a.d.e c(org.apache.a.d.e eVar) {
        String a2 = eVar.a();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a2.length()) {
                z = true;
                break;
            }
            char charAt = a2.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
            i++;
        }
        if (!z) {
            return eVar;
        }
        return new org.apache.a.d.e(a2 + ".local", eVar.c(), eVar.b(), eVar.d());
    }

    @Override // org.apache.a.f.d.y, org.apache.a.d.h
    public org.apache.a.d b() {
        org.apache.a.k.b bVar = new org.apache.a.k.b(40);
        bVar.a("Cookie2");
        bVar.a(": ");
        bVar.a("$Version=");
        bVar.a(Integer.toString(a()));
        return new org.apache.a.h.p(bVar);
    }
}
