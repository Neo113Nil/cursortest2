package org.apache.a.f.d;

import com.aiming.mdt.utils.Constants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NetscapeDraftSpec.java */
/* loaded from: classes2.dex */
public class v extends o {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f9880a;

    @Override // org.apache.a.d.h
    public int a() {
        return 0;
    }

    @Override // org.apache.a.d.h
    public org.apache.a.d b() {
        return null;
    }

    public String toString() {
        return "netscape";
    }

    public v(String[] strArr) {
        if (strArr != null) {
            this.f9880a = (String[]) strArr.clone();
        } else {
            this.f9880a = new String[]{"EEE, dd-MMM-yy HH:mm:ss z"};
        }
        a("path", new i());
        a("domain", new t());
        a(Constants.KEY_MAX_AGE, new h());
        a("secure", new j());
        a("comment", new e());
        a("expires", new g(this.f9880a));
    }

    public v() {
        this(null);
    }

    @Override // org.apache.a.d.h
    public List<org.apache.a.d.b> a(org.apache.a.d dVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        org.apache.a.k.b bVar;
        org.apache.a.h.u uVar;
        if (dVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        if (!dVar.c().equalsIgnoreCase("Set-Cookie")) {
            throw new org.apache.a.d.k("Unrecognized cookie header '" + dVar.toString() + "'");
        }
        u uVar2 = u.f9879a;
        if (dVar instanceof org.apache.a.c) {
            org.apache.a.c cVar = (org.apache.a.c) dVar;
            bVar = cVar.a();
            uVar = new org.apache.a.h.u(cVar.b(), bVar.c());
        } else {
            String d2 = dVar.d();
            if (d2 == null) {
                throw new org.apache.a.d.k("Header value is null");
            }
            bVar = new org.apache.a.k.b(d2.length());
            bVar.a(d2);
            uVar = new org.apache.a.h.u(0, bVar.c());
        }
        return a(new org.apache.a.e[]{uVar2.a(bVar, uVar)}, eVar);
    }

    @Override // org.apache.a.d.h
    public List<org.apache.a.d> a(List<org.apache.a.d.b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
        org.apache.a.k.b bVar = new org.apache.a.k.b(list.size() * 20);
        bVar.a("Cookie");
        bVar.a(": ");
        for (int i = 0; i < list.size(); i++) {
            org.apache.a.d.b bVar2 = list.get(i);
            if (i > 0) {
                bVar.a("; ");
            }
            bVar.a(bVar2.a());
            String b2 = bVar2.b();
            if (b2 != null) {
                bVar.a("=");
                bVar.a(b2);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new org.apache.a.h.p(bVar));
        return arrayList;
    }
}
