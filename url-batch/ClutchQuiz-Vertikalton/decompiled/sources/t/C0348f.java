package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0348f implements InterfaceC0346d {
    public final AbstractC0358p d;

    /* renamed from: f, reason: collision with root package name */
    public int f3694f;

    /* renamed from: g, reason: collision with root package name */
    public int f3695g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0358p f3690a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3691b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3692c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3693e = 1;
    public int h = 1;
    public C0349g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3696j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3697k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3698l = new ArrayList();

    public C0348f(AbstractC0358p abstractC0358p) {
        this.d = abstractC0358p;
    }

    @Override // t.InterfaceC0346d
    public final void a(InterfaceC0346d interfaceC0346d) {
        ArrayList arrayList = this.f3698l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0348f) it.next()).f3696j) {
                return;
            }
        }
        this.f3692c = true;
        AbstractC0358p abstractC0358p = this.f3690a;
        if (abstractC0358p != null) {
            abstractC0358p.a(this);
        }
        if (this.f3691b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0348f c0348f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0348f c0348f2 = (C0348f) it2.next();
            if (!(c0348f2 instanceof C0349g)) {
                i++;
                c0348f = c0348f2;
            }
        }
        if (c0348f != null && i == 1 && c0348f.f3696j) {
            C0349g c0349g = this.i;
            if (c0349g != null) {
                if (!c0349g.f3696j) {
                    return;
                } else {
                    this.f3694f = this.h * c0349g.f3695g;
                }
            }
            d(c0348f.f3695g + this.f3694f);
        }
        AbstractC0358p abstractC0358p2 = this.f3690a;
        if (abstractC0358p2 != null) {
            abstractC0358p2.a(this);
        }
    }

    public final void b(AbstractC0358p abstractC0358p) {
        this.f3697k.add(abstractC0358p);
        if (this.f3696j) {
            abstractC0358p.a(abstractC0358p);
        }
    }

    public final void c() {
        this.f3698l.clear();
        this.f3697k.clear();
        this.f3696j = false;
        this.f3695g = 0;
        this.f3692c = false;
        this.f3691b = false;
    }

    public void d(int i) {
        if (this.f3696j) {
            return;
        }
        this.f3696j = true;
        this.f3695g = i;
        Iterator it = this.f3697k.iterator();
        while (it.hasNext()) {
            InterfaceC0346d interfaceC0346d = (InterfaceC0346d) it.next();
            interfaceC0346d.a(interfaceC0346d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3712b.f3535h0);
        sb.append(":");
        switch (this.f3693e) {
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
        sb.append(this.f3696j ? Integer.valueOf(this.f3695g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3698l.size());
        sb.append(":d=");
        sb.append(this.f3697k.size());
        sb.append(">");
        return sb.toString();
    }
}
