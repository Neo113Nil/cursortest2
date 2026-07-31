package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class w {

    /* renamed from: a, reason: collision with root package name */
    final androidx.collection.g f13185a = new androidx.collection.g();

    /* renamed from: b, reason: collision with root package name */
    final androidx.collection.d f13186b = new androidx.collection.d();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static A.e f13187d = new A.f(20);

        /* renamed from: a, reason: collision with root package name */
        int f13188a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.m.b f13189b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.m.b f13190c;

        private a() {
        }

        static void a() {
            while (f13187d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f13187d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f13188a = 0;
            aVar.f13189b = null;
            aVar.f13190c = null;
            f13187d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.E e4);

        void b(RecyclerView.E e4, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void c(RecyclerView.E e4, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void d(RecyclerView.E e4, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);
    }

    w() {
    }

    private RecyclerView.m.b l(RecyclerView.E e4, int i4) {
        a aVar;
        RecyclerView.m.b bVar;
        int h4 = this.f13185a.h(e4);
        if (h4 >= 0 && (aVar = (a) this.f13185a.q(h4)) != null) {
            int i5 = aVar.f13188a;
            if ((i5 & i4) != 0) {
                int i6 = (~i4) & i5;
                aVar.f13188a = i6;
                if (i4 == 4) {
                    bVar = aVar.f13189b;
                } else {
                    if (i4 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f13190c;
                }
                if ((i6 & 12) == 0) {
                    this.f13185a.o(h4);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.E e4, RecyclerView.m.b bVar) {
        a aVar = (a) this.f13185a.get(e4);
        if (aVar == null) {
            aVar = a.b();
            this.f13185a.put(e4, aVar);
        }
        aVar.f13188a |= 2;
        aVar.f13189b = bVar;
    }

    void b(RecyclerView.E e4) {
        a aVar = (a) this.f13185a.get(e4);
        if (aVar == null) {
            aVar = a.b();
            this.f13185a.put(e4, aVar);
        }
        aVar.f13188a |= 1;
    }

    void c(long j4, RecyclerView.E e4) {
        this.f13186b.m(j4, e4);
    }

    void d(RecyclerView.E e4, RecyclerView.m.b bVar) {
        a aVar = (a) this.f13185a.get(e4);
        if (aVar == null) {
            aVar = a.b();
            this.f13185a.put(e4, aVar);
        }
        aVar.f13190c = bVar;
        aVar.f13188a |= 8;
    }

    void e(RecyclerView.E e4, RecyclerView.m.b bVar) {
        a aVar = (a) this.f13185a.get(e4);
        if (aVar == null) {
            aVar = a.b();
            this.f13185a.put(e4, aVar);
        }
        aVar.f13189b = bVar;
        aVar.f13188a |= 4;
    }

    void f() {
        this.f13185a.clear();
        this.f13186b.a();
    }

    RecyclerView.E g(long j4) {
        return (RecyclerView.E) this.f13186b.i(j4);
    }

    boolean h(RecyclerView.E e4) {
        a aVar = (a) this.f13185a.get(e4);
        return (aVar == null || (aVar.f13188a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.E e4) {
        a aVar = (a) this.f13185a.get(e4);
        return (aVar == null || (aVar.f13188a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.E e4) {
        p(e4);
    }

    RecyclerView.m.b m(RecyclerView.E e4) {
        return l(e4, 8);
    }

    RecyclerView.m.b n(RecyclerView.E e4) {
        return l(e4, 4);
    }

    void o(b bVar) {
        for (int size = this.f13185a.size() - 1; size >= 0; size--) {
            RecyclerView.E e4 = (RecyclerView.E) this.f13185a.m(size);
            a aVar = (a) this.f13185a.o(size);
            int i4 = aVar.f13188a;
            if ((i4 & 3) == 3) {
                bVar.a(e4);
            } else if ((i4 & 1) != 0) {
                RecyclerView.m.b bVar2 = aVar.f13189b;
                if (bVar2 == null) {
                    bVar.a(e4);
                } else {
                    bVar.c(e4, bVar2, aVar.f13190c);
                }
            } else if ((i4 & 14) == 14) {
                bVar.b(e4, aVar.f13189b, aVar.f13190c);
            } else if ((i4 & 12) == 12) {
                bVar.d(e4, aVar.f13189b, aVar.f13190c);
            } else if ((i4 & 4) != 0) {
                bVar.c(e4, aVar.f13189b, null);
            } else if ((i4 & 8) != 0) {
                bVar.b(e4, aVar.f13189b, aVar.f13190c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.E e4) {
        a aVar = (a) this.f13185a.get(e4);
        if (aVar == null) {
            return;
        }
        aVar.f13188a &= -2;
    }

    void q(RecyclerView.E e4) {
        int p4 = this.f13186b.p() - 1;
        while (true) {
            if (p4 < 0) {
                break;
            }
            if (e4 == this.f13186b.q(p4)) {
                this.f13186b.o(p4);
                break;
            }
            p4--;
        }
        a aVar = (a) this.f13185a.remove(e4);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
