package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class hf implements ff {
    public final ka0 d;
    public int f;
    public int g;
    public ka0 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public xf i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public hf(ka0 ka0Var) {
        this.d = ka0Var;
    }

    @Override // defpackage.ff
    public final void a(ff ffVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((hf) obj).j) {
                return;
            }
        }
        this.c = true;
        ka0 ka0Var = this.a;
        if (ka0Var != null) {
            ka0Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        hf hfVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            hf hfVar2 = (hf) obj2;
            if (!(hfVar2 instanceof xf)) {
                i++;
                hfVar = hfVar2;
            }
        }
        if (hfVar != null && i == 1 && hfVar.j) {
            xf xfVar = this.i;
            if (xfVar != null) {
                if (!xfVar.j) {
                    return;
                } else {
                    this.f = this.h * xfVar.g;
                }
            }
            d(hfVar.g + this.f);
        }
        ka0 ka0Var2 = this.a;
        if (ka0Var2 != null) {
            ka0Var2.a(this);
        }
    }

    public final void b(ka0 ka0Var) {
        this.k.add(ka0Var);
        if (this.j) {
            ka0Var.a(ka0Var);
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
            ff ffVar = (ff) obj;
            ffVar.a(ffVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
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
