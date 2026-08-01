package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class mj implements jj {
    public final vn0 d;
    public int f;
    public int g;
    public vn0 a = null;
    public boolean b = false;
    public boolean c = false;
    public lj e = lj.UNKNOWN;
    public int h = 1;
    public ck i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public mj(vn0 vn0Var) {
        this.d = vn0Var;
    }

    @Override // defpackage.jj
    public final void a(jj jjVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((mj) obj).j) {
                return;
            }
        }
        this.c = true;
        vn0 vn0Var = this.a;
        if (vn0Var != null) {
            vn0Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        mj mjVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            mj mjVar2 = (mj) obj2;
            if (!(mjVar2 instanceof ck)) {
                i++;
                mjVar = mjVar2;
            }
        }
        if (mjVar != null && i == 1 && mjVar.j) {
            ck ckVar = this.i;
            if (ckVar != null) {
                if (!ckVar.j) {
                    return;
                } else {
                    this.f = this.h * ckVar.g;
                }
            }
            d(mjVar.g + this.f);
        }
        vn0 vn0Var2 = this.a;
        if (vn0Var2 != null) {
            vn0Var2.a(this);
        }
    }

    public final void b(vn0 vn0Var) {
        this.k.add(vn0Var);
        if (this.j) {
            vn0Var.a(vn0Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jj jjVar = (jj) obj;
            jjVar.a(jjVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.i0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
