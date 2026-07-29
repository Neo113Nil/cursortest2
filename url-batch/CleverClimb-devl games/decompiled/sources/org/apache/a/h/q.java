package org.apache.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: HeaderGroup.java */
/* loaded from: classes2.dex */
public class q implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final List f9975a = new ArrayList(16);

    public void a() {
        this.f9975a.clear();
    }

    public void a(org.apache.a.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f9975a.add(dVar);
    }

    public void b(org.apache.a.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f9975a.remove(dVar);
    }

    public void c(org.apache.a.d dVar) {
        if (dVar == null) {
            return;
        }
        for (int i = 0; i < this.f9975a.size(); i++) {
            if (((org.apache.a.d) this.f9975a.get(i)).c().equalsIgnoreCase(dVar.c())) {
                this.f9975a.set(i, dVar);
                return;
            }
        }
        this.f9975a.add(dVar);
    }

    public void a(org.apache.a.d[] dVarArr) {
        a();
        if (dVarArr == null) {
            return;
        }
        for (org.apache.a.d dVar : dVarArr) {
            this.f9975a.add(dVar);
        }
    }

    public org.apache.a.d[] a(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f9975a.size(); i++) {
            org.apache.a.d dVar = (org.apache.a.d) this.f9975a.get(i);
            if (dVar.c().equalsIgnoreCase(str)) {
                arrayList.add(dVar);
            }
        }
        return (org.apache.a.d[]) arrayList.toArray(new org.apache.a.d[arrayList.size()]);
    }

    public org.apache.a.d b(String str) {
        for (int i = 0; i < this.f9975a.size(); i++) {
            org.apache.a.d dVar = (org.apache.a.d) this.f9975a.get(i);
            if (dVar.c().equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public org.apache.a.d c(String str) {
        for (int size = this.f9975a.size() - 1; size >= 0; size--) {
            org.apache.a.d dVar = (org.apache.a.d) this.f9975a.get(size);
            if (dVar.c().equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public org.apache.a.d[] b() {
        return (org.apache.a.d[]) this.f9975a.toArray(new org.apache.a.d[this.f9975a.size()]);
    }

    public boolean d(String str) {
        for (int i = 0; i < this.f9975a.size(); i++) {
            if (((org.apache.a.d) this.f9975a.get(i)).c().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public org.apache.a.g c() {
        return new k(this.f9975a, null);
    }

    public org.apache.a.g e(String str) {
        return new k(this.f9975a, str);
    }

    public Object clone() throws CloneNotSupportedException {
        q qVar = (q) super.clone();
        qVar.f9975a.clear();
        qVar.f9975a.addAll(this.f9975a);
        return qVar;
    }

    public String toString() {
        return this.f9975a.toString();
    }
}
