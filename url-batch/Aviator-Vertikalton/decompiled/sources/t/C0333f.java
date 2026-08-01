package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0333f implements InterfaceC0331d {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0342o f4171d;

    /* renamed from: f, reason: collision with root package name */
    public int f4173f;

    /* renamed from: g, reason: collision with root package name */
    public int f4174g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0342o f4168a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4169b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4170c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4172e = 1;
    public int h = 1;
    public C0334g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4175j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4176k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4177l = new ArrayList();

    public C0333f(AbstractC0342o abstractC0342o) {
        this.f4171d = abstractC0342o;
    }

    @Override // t.InterfaceC0331d
    public final void a(InterfaceC0331d interfaceC0331d) {
        ArrayList arrayList = this.f4177l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0333f) it.next()).f4175j) {
                return;
            }
        }
        this.f4170c = true;
        AbstractC0342o abstractC0342o = this.f4168a;
        if (abstractC0342o != null) {
            abstractC0342o.a(this);
        }
        if (this.f4169b) {
            this.f4171d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0333f c0333f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0333f c0333f2 = (C0333f) it2.next();
            if (!(c0333f2 instanceof C0334g)) {
                i++;
                c0333f = c0333f2;
            }
        }
        if (c0333f != null && i == 1 && c0333f.f4175j) {
            C0334g c0334g = this.i;
            if (c0334g != null) {
                if (!c0334g.f4175j) {
                    return;
                } else {
                    this.f4173f = this.h * c0334g.f4174g;
                }
            }
            d(c0333f.f4174g + this.f4173f);
        }
        AbstractC0342o abstractC0342o2 = this.f4168a;
        if (abstractC0342o2 != null) {
            abstractC0342o2.a(this);
        }
    }

    public final void b(AbstractC0342o abstractC0342o) {
        this.f4176k.add(abstractC0342o);
        if (this.f4175j) {
            abstractC0342o.a(abstractC0342o);
        }
    }

    public final void c() {
        this.f4177l.clear();
        this.f4176k.clear();
        this.f4175j = false;
        this.f4174g = 0;
        this.f4170c = false;
        this.f4169b = false;
    }

    public void d(int i) {
        if (this.f4175j) {
            return;
        }
        this.f4175j = true;
        this.f4174g = i;
        Iterator it = this.f4176k.iterator();
        while (it.hasNext()) {
            InterfaceC0331d interfaceC0331d = (InterfaceC0331d) it.next();
            interfaceC0331d.a(interfaceC0331d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4171d.f4192b.f4044h0);
        sb.append(":");
        switch (this.f4172e) {
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
        sb.append(this.f4175j ? Integer.valueOf(this.f4174g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4177l.size());
        sb.append(":d=");
        sb.append(this.f4176k.size());
        sb.append(">");
        return sb.toString();
    }
}
