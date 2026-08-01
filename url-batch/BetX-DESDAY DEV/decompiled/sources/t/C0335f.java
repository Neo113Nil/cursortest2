package t;

import com.luckyarcade.spinthrow.GameConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0335f implements InterfaceC0333d {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0344o f4175d;

    /* renamed from: f, reason: collision with root package name */
    public int f4177f;

    /* renamed from: g, reason: collision with root package name */
    public int f4178g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0344o f4172a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4173b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4174c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4176e = 1;
    public int h = 1;
    public C0336g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4179j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4180k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4181l = new ArrayList();

    public C0335f(AbstractC0344o abstractC0344o) {
        this.f4175d = abstractC0344o;
    }

    @Override // t.InterfaceC0333d
    public final void a(InterfaceC0333d interfaceC0333d) {
        ArrayList arrayList = this.f4181l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0335f) it.next()).f4179j) {
                return;
            }
        }
        this.f4174c = true;
        AbstractC0344o abstractC0344o = this.f4172a;
        if (abstractC0344o != null) {
            abstractC0344o.a(this);
        }
        if (this.f4173b) {
            this.f4175d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0335f c0335f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0335f c0335f2 = (C0335f) it2.next();
            if (!(c0335f2 instanceof C0336g)) {
                i++;
                c0335f = c0335f2;
            }
        }
        if (c0335f != null && i == 1 && c0335f.f4179j) {
            C0336g c0336g = this.i;
            if (c0336g != null) {
                if (!c0336g.f4179j) {
                    return;
                } else {
                    this.f4177f = this.h * c0336g.f4178g;
                }
            }
            d(c0335f.f4178g + this.f4177f);
        }
        AbstractC0344o abstractC0344o2 = this.f4172a;
        if (abstractC0344o2 != null) {
            abstractC0344o2.a(this);
        }
    }

    public final void b(AbstractC0344o abstractC0344o) {
        this.f4180k.add(abstractC0344o);
        if (this.f4179j) {
            abstractC0344o.a(abstractC0344o);
        }
    }

    public final void c() {
        this.f4181l.clear();
        this.f4180k.clear();
        this.f4179j = false;
        this.f4178g = 0;
        this.f4174c = false;
        this.f4173b = false;
    }

    public void d(int i) {
        if (this.f4179j) {
            return;
        }
        this.f4179j = true;
        this.f4178g = i;
        Iterator it = this.f4180k.iterator();
        while (it.hasNext()) {
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) it.next();
            interfaceC0333d.a(interfaceC0333d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4175d.f4196b.f4048h0);
        sb.append(":");
        switch (this.f4176e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case GameConfig.COMBO_EVERY /* 3 */:
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
        sb.append(this.f4179j ? Integer.valueOf(this.f4178g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4181l.size());
        sb.append(":d=");
        sb.append(this.f4180k.size());
        sb.append(">");
        return sb.toString();
    }
}
