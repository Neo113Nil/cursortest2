package org.apache.a.f.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

/* compiled from: BasicCookieStore.java */
/* loaded from: classes2.dex */
public class d implements Serializable, org.apache.a.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final TreeSet<org.apache.a.d.b> f9767a = new TreeSet<>(new org.apache.a.d.d());

    @Override // org.apache.a.b.e
    public synchronized void a(org.apache.a.d.b bVar) {
        if (bVar != null) {
            this.f9767a.remove(bVar);
            if (!bVar.a(new Date())) {
                this.f9767a.add(bVar);
            }
        }
    }

    @Override // org.apache.a.b.e
    public synchronized List<org.apache.a.d.b> a() {
        return new ArrayList(this.f9767a);
    }

    public synchronized String toString() {
        return this.f9767a.toString();
    }
}
