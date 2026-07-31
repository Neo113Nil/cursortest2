package t4;

import m5.d;

/* loaded from: classes.dex */
public class e implements d.b {

    /* renamed from: a, reason: collision with root package name */
    private d.b f22315a;

    class a implements d.InterfaceC0108d {
        a() {
        }

        @Override // m5.d.InterfaceC0108d
        public void g(Object obj) {
            e.this.f22315a = null;
        }

        @Override // m5.d.InterfaceC0108d
        public void h(Object obj, d.b bVar) {
            e.this.f22315a = bVar;
        }
    }

    public e(m5.c cVar, String str) {
        new m5.d(cVar, str).d(new a());
    }

    @Override // m5.d.b
    public void a(Object obj) {
        d.b bVar = this.f22315a;
        if (bVar != null) {
            bVar.a(obj);
        }
    }

    @Override // m5.d.b
    public void b(String str, String str2, Object obj) {
        d.b bVar = this.f22315a;
        if (bVar != null) {
            bVar.b(str, str2, obj);
        }
    }

    @Override // m5.d.b
    public void c() {
        d.b bVar = this.f22315a;
        if (bVar != null) {
            bVar.c();
        }
    }
}
