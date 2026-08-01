package v;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0283f implements InterfaceC0281d {
    public final AbstractC0292o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3818f;

    /* renamed from: g, reason: collision with root package name */
    public int f3819g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0292o f3814a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3815b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3816c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3817e = 1;
    public int h = 1;
    public C0284g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3820j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3821k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3822l = new ArrayList();

    public C0283f(AbstractC0292o abstractC0292o) {
        this.d = abstractC0292o;
    }

    @Override // v.InterfaceC0281d
    public final void a(InterfaceC0281d interfaceC0281d) {
        ArrayList arrayList = this.f3822l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0283f) it.next()).f3820j) {
                return;
            }
        }
        this.f3816c = true;
        AbstractC0292o abstractC0292o = this.f3814a;
        if (abstractC0292o != null) {
            abstractC0292o.a(this);
        }
        if (this.f3815b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0283f c0283f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0283f c0283f2 = (C0283f) it2.next();
            if (!(c0283f2 instanceof C0284g)) {
                i++;
                c0283f = c0283f2;
            }
        }
        if (c0283f != null && i == 1 && c0283f.f3820j) {
            C0284g c0284g = this.i;
            if (c0284g != null) {
                if (!c0284g.f3820j) {
                    return;
                } else {
                    this.f3818f = this.h * c0284g.f3819g;
                }
            }
            d(c0283f.f3819g + this.f3818f);
        }
        AbstractC0292o abstractC0292o2 = this.f3814a;
        if (abstractC0292o2 != null) {
            abstractC0292o2.a(this);
        }
    }

    public final void b(AbstractC0292o abstractC0292o) {
        this.f3821k.add(abstractC0292o);
        if (this.f3820j) {
            abstractC0292o.a(abstractC0292o);
        }
    }

    public final void c() {
        this.f3822l.clear();
        this.f3821k.clear();
        this.f3820j = false;
        this.f3819g = 0;
        this.f3816c = false;
        this.f3815b = false;
    }

    public void d(int i) {
        if (this.f3820j) {
            return;
        }
        this.f3820j = true;
        this.f3819g = i;
        Iterator it = this.f3821k.iterator();
        while (it.hasNext()) {
            InterfaceC0281d interfaceC0281d = (InterfaceC0281d) it.next();
            interfaceC0281d.a(interfaceC0281d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3836b.f3679h0);
        sb.append(":");
        switch (this.f3817e) {
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
        sb.append(this.f3820j ? Integer.valueOf(this.f3819g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3822l.size());
        sb.append(":d=");
        sb.append(this.f3821k.size());
        sb.append(">");
        return sb.toString();
    }
}
