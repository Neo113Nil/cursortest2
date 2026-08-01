package t;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements InterfaceC0346d {
    public final o d;

    /* renamed from: f, reason: collision with root package name */
    public int f4093f;

    /* renamed from: g, reason: collision with root package name */
    public int f4094g;

    /* renamed from: a, reason: collision with root package name */
    public o f4089a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4090b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4091c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4092e = 1;
    public int h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4095j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4096k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4097l = new ArrayList();

    public f(o oVar) {
        this.d = oVar;
    }

    @Override // t.InterfaceC0346d
    public final void a(InterfaceC0346d interfaceC0346d) {
        ArrayList arrayList = this.f4097l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f4095j) {
                return;
            }
        }
        this.f4091c = true;
        o oVar = this.f4089a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f4090b) {
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
        if (fVar != null && i == 1 && fVar.f4095j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f4095j) {
                    return;
                } else {
                    this.f4093f = this.h * gVar.f4094g;
                }
            }
            d(fVar.f4094g + this.f4093f);
        }
        o oVar2 = this.f4089a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f4096k.add(oVar);
        if (this.f4095j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f4097l.clear();
        this.f4096k.clear();
        this.f4095j = false;
        this.f4094g = 0;
        this.f4091c = false;
        this.f4090b = false;
    }

    public void d(int i) {
        if (this.f4095j) {
            return;
        }
        this.f4095j = true;
        this.f4094g = i;
        Iterator it = this.f4096k.iterator();
        while (it.hasNext()) {
            InterfaceC0346d interfaceC0346d = (InterfaceC0346d) it.next();
            interfaceC0346d.a(interfaceC0346d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f4111b.f3907h0);
        sb.append(":");
        switch (this.f4092e) {
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
        sb.append(this.f4095j ? Integer.valueOf(this.f4094g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4097l.size());
        sb.append(":d=");
        sb.append(this.f4096k.size());
        sb.append(">");
        return sb.toString();
    }
}
