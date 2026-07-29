package org.apache.a.f.d;

import com.aiming.mdt.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: RFC2109Spec.java */
/* loaded from: classes2.dex */
public class y extends o {

    /* renamed from: a, reason: collision with root package name */
    private static final org.apache.a.d.f f9881a = new org.apache.a.d.f();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9882b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: c, reason: collision with root package name */
    private final String[] f9883c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9884d;

    @Override // org.apache.a.d.h
    public int a() {
        return 1;
    }

    @Override // org.apache.a.d.h
    public org.apache.a.d b() {
        return null;
    }

    public String toString() {
        return "rfc2109";
    }

    public y(String[] strArr, boolean z) {
        if (strArr != null) {
            this.f9883c = (String[]) strArr.clone();
        } else {
            this.f9883c = f9882b;
        }
        this.f9884d = z;
        a("version", new aa());
        a("path", new i());
        a("domain", new x());
        a(Constants.KEY_MAX_AGE, new h());
        a("secure", new j());
        a("comment", new e());
        a("expires", new g(this.f9883c));
    }

    public y() {
        this(null, false);
    }

    @Override // org.apache.a.d.h
    public List<org.apache.a.d.b> a(org.apache.a.d dVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (dVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        if (!dVar.c().equalsIgnoreCase("Set-Cookie")) {
            throw new org.apache.a.d.k("Unrecognized cookie header '" + dVar.toString() + "'");
        }
        return a(dVar.e(), eVar);
    }

    @Override // org.apache.a.f.d.o, org.apache.a.d.h
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        String a2 = bVar.a();
        if (a2.indexOf(32) != -1) {
            throw new org.apache.a.d.g("Cookie name may not contain blanks");
        }
        if (a2.startsWith("$")) {
            throw new org.apache.a.d.g("Cookie name may not start with $");
        }
        super.a(bVar, eVar);
    }

    @Override // org.apache.a.d.h
    public List<org.apache.a.d> a(List<org.apache.a.d.b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, f9881a);
            list = arrayList;
        }
        if (this.f9884d) {
            return b(list);
        }
        return c(list);
    }

    private List<org.apache.a.d> b(List<org.apache.a.d.b> list) {
        int i = Integer.MAX_VALUE;
        for (org.apache.a.d.b bVar : list) {
            if (bVar.g() < i) {
                i = bVar.g();
            }
        }
        org.apache.a.k.b bVar2 = new org.apache.a.k.b(list.size() * 40);
        bVar2.a("Cookie");
        bVar2.a(": ");
        bVar2.a("$Version=");
        bVar2.a(Integer.toString(i));
        for (org.apache.a.d.b bVar3 : list) {
            bVar2.a("; ");
            a(bVar2, bVar3, i);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new org.apache.a.h.p(bVar2));
        return arrayList;
    }

    private List<org.apache.a.d> c(List<org.apache.a.d.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (org.apache.a.d.b bVar : list) {
            int g = bVar.g();
            org.apache.a.k.b bVar2 = new org.apache.a.k.b(40);
            bVar2.a("Cookie: ");
            bVar2.a("$Version=");
            bVar2.a(Integer.toString(g));
            bVar2.a("; ");
            a(bVar2, bVar, g);
            arrayList.add(new org.apache.a.h.p(bVar2));
        }
        return arrayList;
    }

    protected void a(org.apache.a.k.b bVar, String str, String str2, int i) {
        bVar.a(str);
        bVar.a("=");
        if (str2 != null) {
            if (i > 0) {
                bVar.a('\"');
                bVar.a(str2);
                bVar.a('\"');
                return;
            }
            bVar.a(str2);
        }
    }

    protected void a(org.apache.a.k.b bVar, org.apache.a.d.b bVar2, int i) {
        a(bVar, bVar2.a(), bVar2.b(), i);
        if (bVar2.d() != null && (bVar2 instanceof org.apache.a.d.a) && ((org.apache.a.d.a) bVar2).b("path")) {
            bVar.a("; ");
            a(bVar, "$Path", bVar2.d(), i);
        }
        if (bVar2.c() != null && (bVar2 instanceof org.apache.a.d.a) && ((org.apache.a.d.a) bVar2).b("domain")) {
            bVar.a("; ");
            a(bVar, "$Domain", bVar2.c(), i);
        }
    }
}
