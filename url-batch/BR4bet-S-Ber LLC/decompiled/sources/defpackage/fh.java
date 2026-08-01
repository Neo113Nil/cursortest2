package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class fh implements dh {
    public final rd0 d;
    public int f;
    public int g;
    public rd0 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public wh i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public fh(rd0 rd0Var) {
        this.d = rd0Var;
    }

    @Override // defpackage.dh
    public final void a(dh dhVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((fh) obj).j) {
                return;
            }
        }
        this.c = true;
        rd0 rd0Var = this.a;
        if (rd0Var != null) {
            rd0Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        fh fhVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            fh fhVar2 = (fh) obj2;
            if (!(fhVar2 instanceof wh)) {
                i++;
                fhVar = fhVar2;
            }
        }
        if (fhVar != null && i == 1 && fhVar.j) {
            wh whVar = this.i;
            if (whVar != null) {
                if (!whVar.j) {
                    return;
                } else {
                    this.f = this.h * whVar.g;
                }
            }
            d(fhVar.g + this.f);
        }
        rd0 rd0Var2 = this.a;
        if (rd0Var2 != null) {
            rd0Var2.a(this);
        }
    }

    public final void b(rd0 rd0Var) {
        this.k.add(rd0Var);
        if (this.j) {
            rd0Var.a(rd0Var);
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
            dh dhVar = (dh) obj;
            dhVar.a(dhVar);
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
