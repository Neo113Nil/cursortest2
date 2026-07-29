package android.support.constraint.a.a;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class h extends b {
    protected ArrayList<b> aj = new ArrayList<>();

    @Override // android.support.constraint.a.a.b
    public void a() {
        this.aj.clear();
        super.a();
    }

    public void b(b bVar) {
        this.aj.add(bVar);
        if (bVar.c() != null) {
            ((h) bVar.c()).c(bVar);
        }
        bVar.a((b) this);
    }

    public void c(b bVar) {
        this.aj.remove(bVar);
        bVar.a((b) null);
    }

    public c H() {
        b c2 = c();
        c cVar = this instanceof c ? (c) this : null;
        while (c2 != null) {
            b c3 = c2.c();
            if (c2 instanceof c) {
                cVar = (c) c2;
            }
            c2 = c3;
        }
        return cVar;
    }

    @Override // android.support.constraint.a.a.b
    public void b(int i, int i2) {
        super.b(i, i2);
        int size = this.aj.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.aj.get(i3).b(r(), s());
        }
    }

    @Override // android.support.constraint.a.a.b
    public void z() {
        super.z();
        if (this.aj == null) {
            return;
        }
        int size = this.aj.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.aj.get(i);
            bVar.b(n(), o());
            if (!(bVar instanceof c)) {
                bVar.z();
            }
        }
    }

    public void F() {
        z();
        if (this.aj == null) {
            return;
        }
        int size = this.aj.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.aj.get(i);
            if (bVar instanceof h) {
                ((h) bVar).F();
            }
        }
    }

    @Override // android.support.constraint.a.a.b
    public void a(android.support.constraint.a.c cVar) {
        super.a(cVar);
        int size = this.aj.size();
        for (int i = 0; i < size; i++) {
            this.aj.get(i).a(cVar);
        }
    }

    public void I() {
        this.aj.clear();
    }
}
