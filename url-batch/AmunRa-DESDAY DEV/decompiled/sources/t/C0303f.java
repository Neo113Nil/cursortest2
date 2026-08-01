package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0303f implements InterfaceC0301d {
    public final AbstractC0312o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3846f;

    /* renamed from: g, reason: collision with root package name */
    public int f3847g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0312o f3842a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3843b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3844c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3845e = 1;
    public int h = 1;
    public C0304g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3848j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3849k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3850l = new ArrayList();

    public C0303f(AbstractC0312o abstractC0312o) {
        this.d = abstractC0312o;
    }

    @Override // t.InterfaceC0301d
    public final void a(InterfaceC0301d interfaceC0301d) {
        ArrayList arrayList = this.f3850l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0303f) it.next()).f3848j) {
                return;
            }
        }
        this.f3844c = true;
        AbstractC0312o abstractC0312o = this.f3842a;
        if (abstractC0312o != null) {
            abstractC0312o.a(this);
        }
        if (this.f3843b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0303f c0303f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0303f c0303f2 = (C0303f) it2.next();
            if (!(c0303f2 instanceof C0304g)) {
                i++;
                c0303f = c0303f2;
            }
        }
        if (c0303f != null && i == 1 && c0303f.f3848j) {
            C0304g c0304g = this.i;
            if (c0304g != null) {
                if (!c0304g.f3848j) {
                    return;
                } else {
                    this.f3846f = this.h * c0304g.f3847g;
                }
            }
            d(c0303f.f3847g + this.f3846f);
        }
        AbstractC0312o abstractC0312o2 = this.f3842a;
        if (abstractC0312o2 != null) {
            abstractC0312o2.a(this);
        }
    }

    public final void b(AbstractC0312o abstractC0312o) {
        this.f3849k.add(abstractC0312o);
        if (this.f3848j) {
            abstractC0312o.a(abstractC0312o);
        }
    }

    public final void c() {
        this.f3850l.clear();
        this.f3849k.clear();
        this.f3848j = false;
        this.f3847g = 0;
        this.f3844c = false;
        this.f3843b = false;
    }

    public void d(int i) {
        if (this.f3848j) {
            return;
        }
        this.f3848j = true;
        this.f3847g = i;
        Iterator it = this.f3849k.iterator();
        while (it.hasNext()) {
            InterfaceC0301d interfaceC0301d = (InterfaceC0301d) it.next();
            interfaceC0301d.a(interfaceC0301d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3864b.f3701h0);
        sb.append(":");
        switch (this.f3845e) {
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
        sb.append(this.f3848j ? Integer.valueOf(this.f3847g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3850l.size());
        sb.append(":d=");
        sb.append(this.f3849k.size());
        sb.append(">");
        return sb.toString();
    }
}
