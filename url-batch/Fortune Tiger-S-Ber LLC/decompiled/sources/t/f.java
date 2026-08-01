package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final o f3335d;

    /* renamed from: f, reason: collision with root package name */
    public int f3337f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public o f3333a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3334b = false;
    public boolean c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3336e = 1;
    public int h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f3338i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3339j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3340k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3341l = new ArrayList();

    public f(o oVar) {
        this.f3335d = oVar;
    }

    @Override // t.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f3341l;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            if (!((f) obj).f3339j) {
                return;
            }
        }
        this.c = true;
        o oVar = this.f3333a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f3334b) {
            this.f3335d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i4++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i4 == 1 && fVar.f3339j) {
            g gVar = this.f3338i;
            if (gVar != null) {
                if (!gVar.f3339j) {
                    return;
                } else {
                    this.f3337f = this.h * gVar.g;
                }
            }
            d(fVar.g + this.f3337f);
        }
        o oVar2 = this.f3333a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f3340k.add(oVar);
        if (this.f3339j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f3341l.clear();
        this.f3340k.clear();
        this.f3339j = false;
        this.g = 0;
        this.c = false;
        this.f3334b = false;
    }

    public void d(int i4) {
        if (this.f3339j) {
            return;
        }
        this.f3339j = true;
        this.g = i4;
        ArrayList arrayList = this.f3340k;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3335d.f3355b.f3243h0);
        sb.append(":");
        switch (this.f3336e) {
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
        sb.append(this.f3339j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3341l.size());
        sb.append(":d=");
        sb.append(this.f3340k.size());
        sb.append(">");
        return sb.toString();
    }
}
