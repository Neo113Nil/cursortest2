package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class gf implements ef {
    public final ra0 d;
    public int f;
    public int g;
    public ra0 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public pf i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public gf(ra0 ra0Var) {
        this.d = ra0Var;
    }

    @Override // defpackage.ef
    public final void a(ef efVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((gf) obj).j) {
                return;
            }
        }
        this.c = true;
        ra0 ra0Var = this.a;
        if (ra0Var != null) {
            ra0Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        gf gfVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            gf gfVar2 = (gf) obj2;
            if (!(gfVar2 instanceof pf)) {
                i++;
                gfVar = gfVar2;
            }
        }
        if (gfVar != null && i == 1 && gfVar.j) {
            pf pfVar = this.i;
            if (pfVar != null) {
                if (!pfVar.j) {
                    return;
                } else {
                    this.f = this.h * pfVar.g;
                }
            }
            d(gfVar.g + this.f);
        }
        ra0 ra0Var2 = this.a;
        if (ra0Var2 != null) {
            ra0Var2.a(this);
        }
    }

    public final void b(ra0 ra0Var) {
        this.k.add(ra0Var);
        if (this.j) {
            ra0Var.a(ra0Var);
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
            ef efVar = (ef) obj;
            efVar.a(efVar);
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
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                str = "RIGHT";
                break;
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
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
