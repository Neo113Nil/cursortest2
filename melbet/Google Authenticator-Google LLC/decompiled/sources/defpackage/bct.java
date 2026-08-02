package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bct implements bcw, bbt {
    private final List a;
    private final bcx b;
    private final bcv c;
    private int d = -1;
    private bbh e;
    private List f;
    private int g;
    private File h;
    private volatile bvw i;

    public bct(List list, bcx bcxVar, bcv bcvVar) {
        this.a = list;
        this.b = bcxVar;
        this.c = bcvVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bbu, java.lang.Object] */
    @Override // defpackage.bcw
    public final void a() {
        bvw bvwVar = this.i;
        if (bvwVar != null) {
            bvwVar.b.bo();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [bbu, java.lang.Object] */
    @Override // defpackage.bbt
    public final void b(Object obj) {
        this.c.d(this.e, obj, this.i.b, 3, this.e);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [bbu, java.lang.Object] */
    @Override // defpackage.bcw
    public final boolean c() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.i = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    bge bgeVar = (bge) list.get(i);
                    File file = this.h;
                    bcx bcxVar = this.b;
                    this.i = bgeVar.b(file, bcxVar.e, bcxVar.f, bcxVar.h);
                    if (this.i != null && bcxVar.g(this.i.b.a())) {
                        this.i.b.f(bcxVar.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return false;
            }
            bbh bbhVar = (bbh) list2.get(this.d);
            bcx bcxVar2 = this.b;
            File a = bcxVar2.c().a(new bcu(bbhVar, bcxVar2.m));
            this.h = a;
            if (a != null) {
                this.e = bbhVar;
                this.f = bcxVar2.f(a);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [bbu, java.lang.Object] */
    @Override // defpackage.bbt
    public final void e(Exception exc) {
        this.c.b(this.e, exc, this.i.b, 3);
    }
}
