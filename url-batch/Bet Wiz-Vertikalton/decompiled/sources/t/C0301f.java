package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0301f implements InterfaceC0299d {
    public final AbstractC0310o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3701f;

    /* renamed from: g, reason: collision with root package name */
    public int f3702g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0310o f3697a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3698b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3699c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3700e = 1;
    public int h = 1;
    public C0302g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3703j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3704k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3705l = new ArrayList();

    public C0301f(AbstractC0310o abstractC0310o) {
        this.d = abstractC0310o;
    }

    @Override // t.InterfaceC0299d
    public final void a(InterfaceC0299d interfaceC0299d) {
        ArrayList arrayList = this.f3705l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0301f) it.next()).f3703j) {
                return;
            }
        }
        this.f3699c = true;
        AbstractC0310o abstractC0310o = this.f3697a;
        if (abstractC0310o != null) {
            abstractC0310o.a(this);
        }
        if (this.f3698b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0301f c0301f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0301f c0301f2 = (C0301f) it2.next();
            if (!(c0301f2 instanceof C0302g)) {
                i++;
                c0301f = c0301f2;
            }
        }
        if (c0301f != null && i == 1 && c0301f.f3703j) {
            C0302g c0302g = this.i;
            if (c0302g != null) {
                if (!c0302g.f3703j) {
                    return;
                } else {
                    this.f3701f = this.h * c0302g.f3702g;
                }
            }
            d(c0301f.f3702g + this.f3701f);
        }
        AbstractC0310o abstractC0310o2 = this.f3697a;
        if (abstractC0310o2 != null) {
            abstractC0310o2.a(this);
        }
    }

    public final void b(AbstractC0310o abstractC0310o) {
        this.f3704k.add(abstractC0310o);
        if (this.f3703j) {
            abstractC0310o.a(abstractC0310o);
        }
    }

    public final void c() {
        this.f3705l.clear();
        this.f3704k.clear();
        this.f3703j = false;
        this.f3702g = 0;
        this.f3699c = false;
        this.f3698b = false;
    }

    public void d(int i) {
        if (this.f3703j) {
            return;
        }
        this.f3703j = true;
        this.f3702g = i;
        Iterator it = this.f3704k.iterator();
        while (it.hasNext()) {
            InterfaceC0299d interfaceC0299d = (InterfaceC0299d) it.next();
            interfaceC0299d.a(interfaceC0299d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3719b.f3563h0);
        sb.append(":");
        switch (this.f3700e) {
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
        sb.append(this.f3703j ? Integer.valueOf(this.f3702g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3705l.size());
        sb.append(":d=");
        sb.append(this.f3704k.size());
        sb.append(">");
        return sb.toString();
    }
}
