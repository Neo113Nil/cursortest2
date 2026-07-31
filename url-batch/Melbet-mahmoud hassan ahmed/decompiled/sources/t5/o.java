package t5;

import java.util.ArrayList;
import java.util.Iterator;
import m5.d;

/* loaded from: classes.dex */
final class o implements d.b {

    /* renamed from: a, reason: collision with root package name */
    private d.b f22354a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<Object> f22355b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f22356c = false;

    private static class b {
        private b() {
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        String f22357a;

        /* renamed from: b, reason: collision with root package name */
        String f22358b;

        /* renamed from: c, reason: collision with root package name */
        Object f22359c;

        c(String str, String str2, Object obj) {
            this.f22357a = str;
            this.f22358b = str2;
            this.f22359c = obj;
        }
    }

    o() {
    }

    private void d(Object obj) {
        if (this.f22356c) {
            return;
        }
        this.f22355b.add(obj);
    }

    private void e() {
        if (this.f22354a == null) {
            return;
        }
        Iterator<Object> it = this.f22355b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof b) {
                this.f22354a.c();
            } else if (next instanceof c) {
                c cVar = (c) next;
                this.f22354a.b(cVar.f22357a, cVar.f22358b, cVar.f22359c);
            } else {
                this.f22354a.a(next);
            }
        }
        this.f22355b.clear();
    }

    @Override // m5.d.b
    public void a(Object obj) {
        d(obj);
        e();
    }

    @Override // m5.d.b
    public void b(String str, String str2, Object obj) {
        d(new c(str, str2, obj));
        e();
    }

    @Override // m5.d.b
    public void c() {
        d(new b());
        e();
        this.f22356c = true;
    }

    public void f(d.b bVar) {
        this.f22354a = bVar;
        e();
    }
}
