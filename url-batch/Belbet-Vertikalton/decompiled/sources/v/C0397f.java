package v;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0397f implements InterfaceC0395d {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0406o f4418d;

    /* renamed from: f, reason: collision with root package name */
    public int f4419f;

    /* renamed from: g, reason: collision with root package name */
    public int f4420g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0406o f4415a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4416b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4417c = false;
    public int e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f4421h = 1;
    public C0398g i = null;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4422k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4423l = new ArrayList();

    public C0397f(AbstractC0406o abstractC0406o) {
        this.f4418d = abstractC0406o;
    }

    @Override // v.InterfaceC0395d
    public final void a(InterfaceC0395d interfaceC0395d) {
        ArrayList arrayList = this.f4423l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0397f) it.next()).j) {
                return;
            }
        }
        this.f4417c = true;
        AbstractC0406o abstractC0406o = this.f4415a;
        if (abstractC0406o != null) {
            abstractC0406o.a(this);
        }
        if (this.f4416b) {
            this.f4418d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0397f c0397f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0397f c0397f2 = (C0397f) it2.next();
            if (!(c0397f2 instanceof C0398g)) {
                i++;
                c0397f = c0397f2;
            }
        }
        if (c0397f != null && i == 1 && c0397f.j) {
            C0398g c0398g = this.i;
            if (c0398g != null) {
                if (!c0398g.j) {
                    return;
                } else {
                    this.f4419f = this.f4421h * c0398g.f4420g;
                }
            }
            d(c0397f.f4420g + this.f4419f);
        }
        AbstractC0406o abstractC0406o2 = this.f4415a;
        if (abstractC0406o2 != null) {
            abstractC0406o2.a(this);
        }
    }

    public final void b(AbstractC0406o abstractC0406o) {
        this.f4422k.add(abstractC0406o);
        if (this.j) {
            abstractC0406o.a(abstractC0406o);
        }
    }

    public final void c() {
        this.f4423l.clear();
        this.f4422k.clear();
        this.j = false;
        this.f4420g = 0;
        this.f4417c = false;
        this.f4416b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f4420g = i;
        Iterator it = this.f4422k.iterator();
        while (it.hasNext()) {
            InterfaceC0395d interfaceC0395d = (InterfaceC0395d) it.next();
            interfaceC0395d.a(interfaceC0395d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4418d.f4437b.f4268h0);
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
        sb.append(this.j ? Integer.valueOf(this.f4420g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4423l.size());
        sb.append(":d=");
        sb.append(this.f4422k.size());
        sb.append(">");
        return sb.toString();
    }
}
