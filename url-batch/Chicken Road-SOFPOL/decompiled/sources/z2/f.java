package z2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final o f9140d;

    /* renamed from: f, reason: collision with root package name */
    public int f9142f;

    /* renamed from: g, reason: collision with root package name */
    public int f9143g;

    /* renamed from: a, reason: collision with root package name */
    public o f9137a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9138b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9139c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f9141e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f9144h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9145j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9146k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f9147l = new ArrayList();

    public f(o oVar) {
        this.f9140d = oVar;
    }

    @Override // z2.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f9147l;
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            if (!((f) obj).f9145j) {
                return;
            }
        }
        this.f9139c = true;
        o oVar = this.f9137a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f9138b) {
            this.f9140d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.f9145j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f9145j) {
                    return;
                } else {
                    this.f9142f = this.f9144h * gVar.f9143g;
                }
            }
            d(fVar.f9143g + this.f9142f);
        }
        o oVar2 = this.f9137a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f9146k.add(oVar);
        if (this.f9145j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f9147l.clear();
        this.f9146k.clear();
        this.f9145j = false;
        this.f9143g = 0;
        this.f9139c = false;
        this.f9138b = false;
    }

    public void d(int i) {
        if (this.f9145j) {
            return;
        }
        this.f9145j = true;
        this.f9143g = i;
        ArrayList arrayList = this.f9146k;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9140d.f9162b.f8762h0);
        sb.append(":");
        switch (this.f9141e) {
            case 1:
                str = "UNKNOWN";
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "HORIZONTAL_DIMENSION";
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "VERTICAL_DIMENSION";
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "BOTTOM";
                break;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f9145j ? Integer.valueOf(this.f9143g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9147l.size());
        sb.append(":d=");
        sb.append(this.f9146k.size());
        sb.append(">");
        return sb.toString();
    }
}
