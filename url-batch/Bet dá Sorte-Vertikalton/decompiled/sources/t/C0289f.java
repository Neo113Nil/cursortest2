package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0289f implements InterfaceC0287d {
    public final AbstractC0298o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3798f;

    /* renamed from: g, reason: collision with root package name */
    public int f3799g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0298o f3794a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3795b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3796c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3797e = 1;
    public int h = 1;
    public C0290g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3800j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3801k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3802l = new ArrayList();

    public C0289f(AbstractC0298o abstractC0298o) {
        this.d = abstractC0298o;
    }

    @Override // t.InterfaceC0287d
    public final void a(InterfaceC0287d interfaceC0287d) {
        ArrayList arrayList = this.f3802l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0289f) it.next()).f3800j) {
                return;
            }
        }
        this.f3796c = true;
        AbstractC0298o abstractC0298o = this.f3794a;
        if (abstractC0298o != null) {
            abstractC0298o.a(this);
        }
        if (this.f3795b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0289f c0289f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0289f c0289f2 = (C0289f) it2.next();
            if (!(c0289f2 instanceof C0290g)) {
                i++;
                c0289f = c0289f2;
            }
        }
        if (c0289f != null && i == 1 && c0289f.f3800j) {
            C0290g c0290g = this.i;
            if (c0290g != null) {
                if (!c0290g.f3800j) {
                    return;
                } else {
                    this.f3798f = this.h * c0290g.f3799g;
                }
            }
            d(c0289f.f3799g + this.f3798f);
        }
        AbstractC0298o abstractC0298o2 = this.f3794a;
        if (abstractC0298o2 != null) {
            abstractC0298o2.a(this);
        }
    }

    public final void b(AbstractC0298o abstractC0298o) {
        this.f3801k.add(abstractC0298o);
        if (this.f3800j) {
            abstractC0298o.a(abstractC0298o);
        }
    }

    public final void c() {
        this.f3802l.clear();
        this.f3801k.clear();
        this.f3800j = false;
        this.f3799g = 0;
        this.f3796c = false;
        this.f3795b = false;
    }

    public void d(int i) {
        if (this.f3800j) {
            return;
        }
        this.f3800j = true;
        this.f3799g = i;
        Iterator it = this.f3801k.iterator();
        while (it.hasNext()) {
            InterfaceC0287d interfaceC0287d = (InterfaceC0287d) it.next();
            interfaceC0287d.a(interfaceC0287d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3816b.f3641h0);
        sb.append(":");
        switch (this.f3797e) {
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
        sb.append(this.f3800j ? Integer.valueOf(this.f3799g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3802l.size());
        sb.append(":d=");
        sb.append(this.f3801k.size());
        sb.append(">");
        return sb.toString();
    }
}
