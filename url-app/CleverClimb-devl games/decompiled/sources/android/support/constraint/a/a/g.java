package android.support.constraint.a.a;

import android.support.constraint.a.a.a;
import java.util.ArrayList;

/* compiled from: Snapshot.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private int f1422a;

    /* renamed from: b, reason: collision with root package name */
    private int f1423b;

    /* renamed from: c, reason: collision with root package name */
    private int f1424c;

    /* renamed from: d, reason: collision with root package name */
    private int f1425d;
    private ArrayList<a> e = new ArrayList<>();

    /* compiled from: Snapshot.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private android.support.constraint.a.a.a f1426a;

        /* renamed from: b, reason: collision with root package name */
        private android.support.constraint.a.a.a f1427b;

        /* renamed from: c, reason: collision with root package name */
        private int f1428c;

        /* renamed from: d, reason: collision with root package name */
        private a.b f1429d;
        private int e;

        public a(android.support.constraint.a.a.a aVar) {
            this.f1426a = aVar;
            this.f1427b = aVar.f();
            this.f1428c = aVar.d();
            this.f1429d = aVar.e();
            this.e = aVar.h();
        }

        public void a(b bVar) {
            this.f1426a = bVar.a(this.f1426a.c());
            if (this.f1426a != null) {
                this.f1427b = this.f1426a.f();
                this.f1428c = this.f1426a.d();
                this.f1429d = this.f1426a.e();
                this.e = this.f1426a.h();
                return;
            }
            this.f1427b = null;
            this.f1428c = 0;
            this.f1429d = a.b.STRONG;
            this.e = 0;
        }

        public void b(b bVar) {
            bVar.a(this.f1426a.c()).a(this.f1427b, this.f1428c, this.f1429d, this.e);
        }
    }

    public g(b bVar) {
        this.f1422a = bVar.f();
        this.f1423b = bVar.g();
        this.f1424c = bVar.h();
        this.f1425d = bVar.l();
        ArrayList<android.support.constraint.a.a.a> y = bVar.y();
        int size = y.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a(y.get(i)));
        }
    }

    public void a(b bVar) {
        this.f1422a = bVar.f();
        this.f1423b = bVar.g();
        this.f1424c = bVar.h();
        this.f1425d = bVar.l();
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.get(i).a(bVar);
        }
    }

    public void b(b bVar) {
        bVar.b(this.f1422a);
        bVar.c(this.f1423b);
        bVar.d(this.f1424c);
        bVar.e(this.f1425d);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.get(i).b(bVar);
        }
    }
}
