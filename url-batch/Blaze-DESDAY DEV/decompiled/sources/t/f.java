package t;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements InterfaceC0301d {
    public final o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3746f;

    /* renamed from: g, reason: collision with root package name */
    public int f3747g;

    /* renamed from: a, reason: collision with root package name */
    public o f3742a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3743b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3744c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3745e = 1;
    public int h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3748j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3749k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3750l = new ArrayList();

    public f(o oVar) {
        this.d = oVar;
    }

    @Override // t.InterfaceC0301d
    public final void a(InterfaceC0301d interfaceC0301d) {
        ArrayList arrayList = this.f3750l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f3748j) {
                return;
            }
        }
        this.f3744c = true;
        o oVar = this.f3742a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f3743b) {
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
        if (fVar != null && i == 1 && fVar.f3748j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f3748j) {
                    return;
                } else {
                    this.f3746f = this.h * gVar.f3747g;
                }
            }
            d(fVar.f3747g + this.f3746f);
        }
        o oVar2 = this.f3742a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f3749k.add(oVar);
        if (this.f3748j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f3750l.clear();
        this.f3749k.clear();
        this.f3748j = false;
        this.f3747g = 0;
        this.f3744c = false;
        this.f3743b = false;
    }

    public void d(int i) {
        if (this.f3748j) {
            return;
        }
        this.f3748j = true;
        this.f3747g = i;
        Iterator it = this.f3749k.iterator();
        while (it.hasNext()) {
            InterfaceC0301d interfaceC0301d = (InterfaceC0301d) it.next();
            interfaceC0301d.a(interfaceC0301d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3764b.f3613h0);
        sb.append(":");
        switch (this.f3745e) {
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
        sb.append(this.f3748j ? Integer.valueOf(this.f3747g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3750l.size());
        sb.append(":d=");
        sb.append(this.f3749k.size());
        sb.append(">");
        return sb.toString();
    }
}
