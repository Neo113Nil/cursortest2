package m0;

import androidx.work.impl.WorkDatabase;
import d0.m;
import d0.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import l0.q;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final e0.c f18828f = new e0.c();

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    class C0096a extends a {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0.i f18829g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UUID f18830h;

        C0096a(e0.i iVar, UUID uuid) {
            this.f18829g = iVar;
            this.f18830h = uuid;
        }

        @Override // m0.a
        void h() {
            WorkDatabase o7 = this.f18829g.o();
            o7.c();
            try {
                a(this.f18829g, this.f18830h.toString());
                o7.r();
                o7.g();
                g(this.f18829g);
            } catch (Throwable th) {
                o7.g();
                throw th;
            }
        }
    }

    class b extends a {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0.i f18831g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f18832h;

        b(e0.i iVar, String str) {
            this.f18831g = iVar;
            this.f18832h = str;
        }

        @Override // m0.a
        void h() {
            WorkDatabase o7 = this.f18831g.o();
            o7.c();
            try {
                Iterator<String> it = o7.B().n(this.f18832h).iterator();
                while (it.hasNext()) {
                    a(this.f18831g, it.next());
                }
                o7.r();
                o7.g();
                g(this.f18831g);
            } catch (Throwable th) {
                o7.g();
                throw th;
            }
        }
    }

    class c extends a {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0.i f18833g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f18834h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f18835i;

        c(e0.i iVar, String str, boolean z6) {
            this.f18833g = iVar;
            this.f18834h = str;
            this.f18835i = z6;
        }

        @Override // m0.a
        void h() {
            WorkDatabase o7 = this.f18833g.o();
            o7.c();
            try {
                Iterator<String> it = o7.B().e(this.f18834h).iterator();
                while (it.hasNext()) {
                    a(this.f18833g, it.next());
                }
                o7.r();
                o7.g();
                if (this.f18835i) {
                    g(this.f18833g);
                }
            } catch (Throwable th) {
                o7.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, e0.i iVar) {
        return new C0096a(iVar, uuid);
    }

    public static a c(String str, e0.i iVar, boolean z6) {
        return new c(iVar, str, z6);
    }

    public static a d(String str, e0.i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q B = workDatabase.B();
        l0.b t6 = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s h7 = B.h(str2);
            if (h7 != s.SUCCEEDED && h7 != s.FAILED) {
                B.j(s.CANCELLED, str2);
            }
            linkedList.addAll(t6.d(str2));
        }
    }

    void a(e0.i iVar, String str) {
        f(iVar.o(), str);
        iVar.m().l(str);
        Iterator<e0.e> it = iVar.n().iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    public d0.m e() {
        return this.f18828f;
    }

    void g(e0.i iVar) {
        e0.f.b(iVar.i(), iVar.o(), iVar.n());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f18828f.a(d0.m.f15489a);
        } catch (Throwable th) {
            this.f18828f.a(new m.b.a(th));
        }
    }
}
