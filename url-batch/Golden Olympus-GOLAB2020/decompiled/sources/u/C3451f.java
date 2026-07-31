package u;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3451f implements InterfaceC3449d {

    /* renamed from: d, reason: collision with root package name */
    m f46326d;

    /* renamed from: f, reason: collision with root package name */
    int f46328f;

    /* renamed from: g, reason: collision with root package name */
    public int f46329g;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC3449d f46323a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46324b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46325c = false;

    /* renamed from: e, reason: collision with root package name */
    a f46327e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f46330h = 1;

    /* renamed from: i, reason: collision with root package name */
    C3452g f46331i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f46332j = false;

    /* renamed from: k, reason: collision with root package name */
    List f46333k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List f46334l = new ArrayList();

    /* renamed from: u.f$a */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C3451f(m mVar) {
        this.f46326d = mVar;
    }

    @Override // u.InterfaceC3449d
    public void a(InterfaceC3449d interfaceC3449d) {
        Iterator it = this.f46334l.iterator();
        while (it.hasNext()) {
            if (!((C3451f) it.next()).f46332j) {
                return;
            }
        }
        this.f46325c = true;
        InterfaceC3449d interfaceC3449d2 = this.f46323a;
        if (interfaceC3449d2 != null) {
            interfaceC3449d2.a(this);
        }
        if (this.f46324b) {
            this.f46326d.a(this);
            return;
        }
        C3451f c3451f = null;
        int i4 = 0;
        for (C3451f c3451f2 : this.f46334l) {
            if (!(c3451f2 instanceof C3452g)) {
                i4++;
                c3451f = c3451f2;
            }
        }
        if (c3451f != null && i4 == 1 && c3451f.f46332j) {
            C3452g c3452g = this.f46331i;
            if (c3452g != null) {
                if (!c3452g.f46332j) {
                    return;
                } else {
                    this.f46328f = this.f46330h * c3452g.f46329g;
                }
            }
            d(c3451f.f46329g + this.f46328f);
        }
        InterfaceC3449d interfaceC3449d3 = this.f46323a;
        if (interfaceC3449d3 != null) {
            interfaceC3449d3.a(this);
        }
    }

    public void b(InterfaceC3449d interfaceC3449d) {
        this.f46333k.add(interfaceC3449d);
        if (this.f46332j) {
            interfaceC3449d.a(interfaceC3449d);
        }
    }

    public void c() {
        this.f46334l.clear();
        this.f46333k.clear();
        this.f46332j = false;
        this.f46329g = 0;
        this.f46325c = false;
        this.f46324b = false;
    }

    public void d(int i4) {
        if (this.f46332j) {
            return;
        }
        this.f46332j = true;
        this.f46329g = i4;
        for (InterfaceC3449d interfaceC3449d : this.f46333k) {
            interfaceC3449d.a(interfaceC3449d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46326d.f46359b.p());
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(this.f46327e);
        sb.append("(");
        sb.append(this.f46332j ? Integer.valueOf(this.f46329g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f46334l.size());
        sb.append(":d=");
        sb.append(this.f46333k.size());
        sb.append(">");
        return sb.toString();
    }
}
