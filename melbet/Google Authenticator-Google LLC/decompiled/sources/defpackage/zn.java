package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zn {
    private final zz a;
    vb[] b;
    Rect[][] c;
    Rect[][] d;

    public zn(zz zzVar) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = zzVar;
        h(zzVar);
    }

    public zz a() {
        i();
        return this.a;
    }

    public void g(int i, vb vbVar) {
        if (this.b == null) {
            this.b = new vb[10];
        }
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[yl.c(i2)] = vbVar;
            }
        }
    }

    public void h(zz zzVar) {
        int i = 1;
        while (i <= 512) {
            zw zwVar = zzVar.b;
            List f = zwVar.f(i);
            int c = yl.c(i);
            this.c[c] = (Rect[]) f.toArray(new Rect[f.size()]);
            if (i != 8) {
                List g = zwVar.g(i);
                this.d[c] = (Rect[]) g.toArray(new Rect[g.size()]);
            } else {
                i = 8;
            }
            i += i;
        }
    }

    protected final void i() {
        vb[] vbVarArr = this.b;
        if (vbVarArr != null) {
            vb vbVar = vbVarArr[yl.c(1)];
            vb vbVar2 = this.b[yl.c(2)];
            if (vbVar2 == null) {
                vbVar2 = this.a.f(2);
            }
            if (vbVar == null) {
                vbVar = this.a.f(1);
            }
            c(vb.b(vbVar, vbVar2));
            vb vbVar3 = this.b[yl.c(16)];
            if (vbVar3 != null) {
                e(vbVar3);
            }
            vb vbVar4 = this.b[yl.c(32)];
            if (vbVar4 != null) {
                d(vbVar4);
            }
            vb vbVar5 = this.b[yl.c(64)];
            if (vbVar5 != null) {
                f(vbVar5);
            }
        }
    }

    public zn() {
        this(new zz());
    }

    public void b(vb vbVar) {
    }

    public void c(vb vbVar) {
    }

    public void d(vb vbVar) {
    }

    public void e(vb vbVar) {
    }

    public void f(vb vbVar) {
    }
}
