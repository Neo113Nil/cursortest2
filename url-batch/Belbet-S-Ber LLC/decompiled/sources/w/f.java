package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class f implements d {
    public final o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3754f;

    /* renamed from: g, reason: collision with root package name */
    public int f3755g;

    /* renamed from: a, reason: collision with root package name */
    public o f3750a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3751b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3752c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3753e = 1;
    public int h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3756j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3757k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3758l = new ArrayList();

    public f(o oVar) {
        this.d = oVar;
    }

    @Override // w.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f3758l;
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!((f) obj).f3756j) {
                return;
            }
        }
        this.f3752c = true;
        o oVar = this.f3750a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f3751b) {
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
        if (fVar != null && i == 1 && fVar.f3756j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f3756j) {
                    return;
                } else {
                    this.f3754f = this.h * gVar.f3755g;
                }
            }
            d(fVar.f3755g + this.f3754f);
        }
        o oVar2 = this.f3750a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f3757k.add(oVar);
        if (this.f3756j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f3758l.clear();
        this.f3757k.clear();
        this.f3756j = false;
        this.f3755g = 0;
        this.f3752c = false;
        this.f3751b = false;
    }

    public void d(int i) {
        if (this.f3756j) {
            return;
        }
        this.f3756j = true;
        this.f3755g = i;
        ArrayList arrayList = this.f3757k;
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
        sb.append(this.d.f3772b.f3623h0);
        sb.append(":");
        switch (this.f3753e) {
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
        sb.append(this.f3756j ? Integer.valueOf(this.f3755g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3758l.size());
        sb.append(":d=");
        sb.append(this.f3757k.size());
        sb.append(">");
        return sb.toString();
    }
}
