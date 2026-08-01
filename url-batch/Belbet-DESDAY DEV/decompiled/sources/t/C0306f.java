package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0306f implements InterfaceC0304d {
    public final AbstractC0315o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3778f;

    /* renamed from: g, reason: collision with root package name */
    public int f3779g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0315o f3774a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3775b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3776c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3777e = 1;
    public int h = 1;
    public C0307g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3780j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3781k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3782l = new ArrayList();

    public C0306f(AbstractC0315o abstractC0315o) {
        this.d = abstractC0315o;
    }

    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        ArrayList arrayList = this.f3782l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0306f) it.next()).f3780j) {
                return;
            }
        }
        this.f3776c = true;
        AbstractC0315o abstractC0315o = this.f3774a;
        if (abstractC0315o != null) {
            abstractC0315o.a(this);
        }
        if (this.f3775b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0306f c0306f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0306f c0306f2 = (C0306f) it2.next();
            if (!(c0306f2 instanceof C0307g)) {
                i++;
                c0306f = c0306f2;
            }
        }
        if (c0306f != null && i == 1 && c0306f.f3780j) {
            C0307g c0307g = this.i;
            if (c0307g != null) {
                if (!c0307g.f3780j) {
                    return;
                } else {
                    this.f3778f = this.h * c0307g.f3779g;
                }
            }
            d(c0306f.f3779g + this.f3778f);
        }
        AbstractC0315o abstractC0315o2 = this.f3774a;
        if (abstractC0315o2 != null) {
            abstractC0315o2.a(this);
        }
    }

    public final void b(AbstractC0315o abstractC0315o) {
        this.f3781k.add(abstractC0315o);
        if (this.f3780j) {
            abstractC0315o.a(abstractC0315o);
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
            InterfaceC0304d interfaceC0304d = (InterfaceC0304d) it.next();
            interfaceC0304d.a(interfaceC0304d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3796b.f3652h0);
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
