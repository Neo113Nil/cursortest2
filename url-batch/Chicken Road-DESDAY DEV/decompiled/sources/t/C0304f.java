package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0304f implements InterfaceC0302d {
    public final AbstractC0313o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3721f;

    /* renamed from: g, reason: collision with root package name */
    public int f3722g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0313o f3717a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3718b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3719c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3720e = 1;
    public int h = 1;
    public C0305g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3723j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3724k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3725l = new ArrayList();

    public C0304f(AbstractC0313o abstractC0313o) {
        this.d = abstractC0313o;
    }

    @Override // t.InterfaceC0302d
    public final void a(InterfaceC0302d interfaceC0302d) {
        ArrayList arrayList = this.f3725l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0304f) it.next()).f3723j) {
                return;
            }
        }
        this.f3719c = true;
        AbstractC0313o abstractC0313o = this.f3717a;
        if (abstractC0313o != null) {
            abstractC0313o.a(this);
        }
        if (this.f3718b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0304f c0304f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0304f c0304f2 = (C0304f) it2.next();
            if (!(c0304f2 instanceof C0305g)) {
                i++;
                c0304f = c0304f2;
            }
        }
        if (c0304f != null && i == 1 && c0304f.f3723j) {
            C0305g c0305g = this.i;
            if (c0305g != null) {
                if (!c0305g.f3723j) {
                    return;
                } else {
                    this.f3721f = this.h * c0305g.f3722g;
                }
            }
            d(c0304f.f3722g + this.f3721f);
        }
        AbstractC0313o abstractC0313o2 = this.f3717a;
        if (abstractC0313o2 != null) {
            abstractC0313o2.a(this);
        }
    }

    public final void b(AbstractC0313o abstractC0313o) {
        this.f3724k.add(abstractC0313o);
        if (this.f3723j) {
            abstractC0313o.a(abstractC0313o);
        }
    }

    public final void c() {
        this.f3725l.clear();
        this.f3724k.clear();
        this.f3723j = false;
        this.f3722g = 0;
        this.f3719c = false;
        this.f3718b = false;
    }

    public void d(int i) {
        if (this.f3723j) {
            return;
        }
        this.f3723j = true;
        this.f3722g = i;
        Iterator it = this.f3724k.iterator();
        while (it.hasNext()) {
            InterfaceC0302d interfaceC0302d = (InterfaceC0302d) it.next();
            interfaceC0302d.a(interfaceC0302d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3739b.f3587h0);
        sb.append(":");
        switch (this.f3720e) {
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
        sb.append(this.f3723j ? Integer.valueOf(this.f3722g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3725l.size());
        sb.append(":d=");
        sb.append(this.f3724k.size());
        sb.append(">");
        return sb.toString();
    }
}
