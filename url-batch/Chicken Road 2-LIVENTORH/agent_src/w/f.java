package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class f implements d {
    public final o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3531f;

    /* renamed from: g, reason: collision with root package name */
    public int f3532g;

    /* renamed from: a, reason: collision with root package name */
    public o f3527a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3528b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3529c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3530e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f3533h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3534j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3535k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3536l = new ArrayList();

    public f(o oVar) {
        this.d = oVar;
    }

    @Override // w.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f3536l;
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!((f) obj).f3534j) {
                return;
            }
        }
        this.f3529c = true;
        o oVar = this.f3527a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f3528b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.f3534j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f3534j) {
                    return;
                } else {
                    this.f3531f = this.f3533h * gVar.f3532g;
                }
            }
            d(fVar.f3532g + this.f3531f);
        }
        o oVar2 = this.f3527a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f3535k.add(oVar);
        if (this.f3534j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f3536l.clear();
        this.f3535k.clear();
        this.f3534j = false;
        this.f3532g = 0;
        this.f3529c = false;
        this.f3528b = false;
    }

    public void d(int i) {
        if (this.f3534j) {
            return;
        }
        this.f3534j = true;
        this.f3532g = i;
        ArrayList arrayList = this.f3535k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3550b.f3404h0);
        sb.append(":");
        switch (this.f3530e) {
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
        sb.append(this.f3534j ? Integer.valueOf(this.f3532g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3536l.size());
        sb.append(":d=");
        sb.append(this.f3535k.size());
        sb.append(">");
        return sb.toString();
    }
}
