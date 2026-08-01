package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0307f implements InterfaceC0305d {
    public final AbstractC0316o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3761f;

    /* renamed from: g, reason: collision with root package name */
    public int f3762g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0316o f3757a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3758b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3759c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3760e = 1;
    public int h = 1;
    public C0308g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3763j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3764k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3765l = new ArrayList();

    public C0307f(AbstractC0316o abstractC0316o) {
        this.d = abstractC0316o;
    }

    @Override // t.InterfaceC0305d
    public final void a(InterfaceC0305d interfaceC0305d) {
        ArrayList arrayList = this.f3765l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0307f) it.next()).f3763j) {
                return;
            }
        }
        this.f3759c = true;
        AbstractC0316o abstractC0316o = this.f3757a;
        if (abstractC0316o != null) {
            abstractC0316o.a(this);
        }
        if (this.f3758b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0307f c0307f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0307f c0307f2 = (C0307f) it2.next();
            if (!(c0307f2 instanceof C0308g)) {
                i++;
                c0307f = c0307f2;
            }
        }
        if (c0307f != null && i == 1 && c0307f.f3763j) {
            C0308g c0308g = this.i;
            if (c0308g != null) {
                if (!c0308g.f3763j) {
                    return;
                } else {
                    this.f3761f = this.h * c0308g.f3762g;
                }
            }
            d(c0307f.f3762g + this.f3761f);
        }
        AbstractC0316o abstractC0316o2 = this.f3757a;
        if (abstractC0316o2 != null) {
            abstractC0316o2.a(this);
        }
    }

    public final void b(AbstractC0316o abstractC0316o) {
        this.f3764k.add(abstractC0316o);
        if (this.f3763j) {
            abstractC0316o.a(abstractC0316o);
        }
    }

    public final void c() {
        this.f3765l.clear();
        this.f3764k.clear();
        this.f3763j = false;
        this.f3762g = 0;
        this.f3759c = false;
        this.f3758b = false;
    }

    public void d(int i) {
        if (this.f3763j) {
            return;
        }
        this.f3763j = true;
        this.f3762g = i;
        Iterator it = this.f3764k.iterator();
        while (it.hasNext()) {
            InterfaceC0305d interfaceC0305d = (InterfaceC0305d) it.next();
            interfaceC0305d.a(interfaceC0305d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3779b.f3635h0);
        sb.append(":");
        switch (this.f3760e) {
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
        sb.append(this.f3763j ? Integer.valueOf(this.f3762g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3765l.size());
        sb.append(":d=");
        sb.append(this.f3764k.size());
        sb.append(">");
        return sb.toString();
    }
}
