package t;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements InterfaceC0300d {
    public final o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3778f;

    /* renamed from: g, reason: collision with root package name */
    public int f3779g;

    /* renamed from: a, reason: collision with root package name */
    public o f3774a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3775b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3776c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3777e = 1;
    public int h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3780j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3781k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3782l = new ArrayList();

    public f(o oVar) {
        this.d = oVar;
    }

    @Override // t.InterfaceC0300d
    public final void a(InterfaceC0300d interfaceC0300d) {
        ArrayList arrayList = this.f3782l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f3780j) {
                return;
            }
        }
        this.f3776c = true;
        o oVar = this.f3774a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f3775b) {
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
        if (fVar != null && i == 1 && fVar.f3780j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f3780j) {
                    return;
                } else {
                    this.f3778f = this.h * gVar.f3779g;
                }
            }
            d(fVar.f3779g + this.f3778f);
        }
        o oVar2 = this.f3774a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f3781k.add(oVar);
        if (this.f3780j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f3782l.clear();
        this.f3781k.clear();
        this.f3780j = false;
        this.f3779g = 0;
        this.f3776c = false;
        this.f3775b = false;
    }

    public void d(int i) {
        if (this.f3780j) {
            return;
        }
        this.f3780j = true;
        this.f3779g = i;
        Iterator it = this.f3781k.iterator();
        while (it.hasNext()) {
            InterfaceC0300d interfaceC0300d = (InterfaceC0300d) it.next();
            interfaceC0300d.a(interfaceC0300d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3796b.f3587h0);
        sb.append(":");
        switch (this.f3777e) {
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
        sb.append(this.f3780j ? Integer.valueOf(this.f3779g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3782l.size());
        sb.append(":d=");
        sb.append(this.f3781k.size());
        sb.append(">");
        return sb.toString();
    }
}
