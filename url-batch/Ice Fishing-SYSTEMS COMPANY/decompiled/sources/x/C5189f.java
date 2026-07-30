package x;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5189f implements InterfaceC5187d {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5199p f41736d;

    /* renamed from: f, reason: collision with root package name */
    public int f41738f;

    /* renamed from: g, reason: collision with root package name */
    public int f41739g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5199p f41733a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41734b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41735c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f41737e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f41740h = 1;
    public C5190g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41741j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f41742k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f41743l = new ArrayList();

    public C5189f(AbstractC5199p abstractC5199p) {
        this.f41736d = abstractC5199p;
    }

    @Override // x.InterfaceC5187d
    public final void a(InterfaceC5187d interfaceC5187d) {
        ArrayList arrayList = this.f41743l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C5189f) it.next()).f41741j) {
                return;
            }
        }
        this.f41735c = true;
        AbstractC5199p abstractC5199p = this.f41733a;
        if (abstractC5199p != null) {
            abstractC5199p.a(this);
        }
        if (this.f41734b) {
            this.f41736d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C5189f c5189f = null;
        int i = 0;
        while (it2.hasNext()) {
            C5189f c5189f2 = (C5189f) it2.next();
            if (!(c5189f2 instanceof C5190g)) {
                i++;
                c5189f = c5189f2;
            }
        }
        if (c5189f != null && i == 1 && c5189f.f41741j) {
            C5190g c5190g = this.i;
            if (c5190g != null) {
                if (!c5190g.f41741j) {
                    return;
                } else {
                    this.f41738f = this.f41740h * c5190g.f41739g;
                }
            }
            d(c5189f.f41739g + this.f41738f);
        }
        AbstractC5199p abstractC5199p2 = this.f41733a;
        if (abstractC5199p2 != null) {
            abstractC5199p2.a(this);
        }
    }

    public final void b(AbstractC5199p abstractC5199p) {
        this.f41742k.add(abstractC5199p);
        if (this.f41741j) {
            abstractC5199p.a(abstractC5199p);
        }
    }

    public final void c() {
        this.f41743l.clear();
        this.f41742k.clear();
        this.f41741j = false;
        this.f41739g = 0;
        this.f41735c = false;
        this.f41734b = false;
    }

    public void d(int i) {
        if (this.f41741j) {
            return;
        }
        this.f41741j = true;
        this.f41739g = i;
        Iterator it = this.f41742k.iterator();
        while (it.hasNext()) {
            InterfaceC5187d interfaceC5187d = (InterfaceC5187d) it.next();
            interfaceC5187d.a(interfaceC5187d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41736d.f41758b.f41453h0);
        sb.append(":");
        switch (this.f41737e) {
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
        sb.append(this.f41741j ? Integer.valueOf(this.f41739g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f41743l.size());
        sb.append(":d=");
        sb.append(this.f41742k.size());
        sb.append(">");
        return sb.toString();
    }
}
