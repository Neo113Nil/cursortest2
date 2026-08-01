package u;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements InterfaceC0303d {
    public final o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3925f;

    /* renamed from: g, reason: collision with root package name */
    public int f3926g;

    /* renamed from: a, reason: collision with root package name */
    public o f3921a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3922b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3923c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3924e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f3927h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3928j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3929k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3930l = new ArrayList();

    public f(o oVar) {
        this.d = oVar;
    }

    @Override // u.InterfaceC0303d
    public final void a(InterfaceC0303d interfaceC0303d) {
        ArrayList arrayList = this.f3930l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f3928j) {
                return;
            }
        }
        this.f3923c = true;
        o oVar = this.f3921a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f3922b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.f3928j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f3928j) {
                    return;
                } else {
                    this.f3925f = this.f3927h * gVar.f3926g;
                }
            }
            d(fVar.f3926g + this.f3925f);
        }
        o oVar2 = this.f3921a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f3929k.add(oVar);
        if (this.f3928j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f3930l.clear();
        this.f3929k.clear();
        this.f3928j = false;
        this.f3926g = 0;
        this.f3923c = false;
        this.f3922b = false;
    }

    public void d(int i) {
        if (this.f3928j) {
            return;
        }
        this.f3928j = true;
        this.f3926g = i;
        Iterator it = this.f3929k.iterator();
        while (it.hasNext()) {
            InterfaceC0303d interfaceC0303d = (InterfaceC0303d) it.next();
            interfaceC0303d.a(interfaceC0303d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3944b.f3790h0);
        sb.append(":");
        switch (this.f3924e) {
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
        sb.append(this.f3928j ? Integer.valueOf(this.f3926g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3930l.size());
        sb.append(":d=");
        sb.append(this.f3929k.size());
        sb.append(">");
        return sb.toString();
    }
}
