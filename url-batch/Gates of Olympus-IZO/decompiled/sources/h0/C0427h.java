package h0;

import android.graphics.Path;
import b0.AbstractC0259J;
import b0.C0278k;
import b0.C0279l;
import d0.C0326g;
import d0.InterfaceC0323d;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427h extends AbstractC0419C {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0259J f4974b;

    /* renamed from: c, reason: collision with root package name */
    public float f4975c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public Object f4976d;

    /* renamed from: e, reason: collision with root package name */
    public float f4977e;

    /* renamed from: f, reason: collision with root package name */
    public float f4978f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0259J f4979g;

    /* renamed from: h, reason: collision with root package name */
    public int f4980h;

    /* renamed from: i, reason: collision with root package name */
    public int f4981i;

    /* renamed from: j, reason: collision with root package name */
    public float f4982j;

    /* renamed from: k, reason: collision with root package name */
    public float f4983k;

    /* renamed from: l, reason: collision with root package name */
    public float f4984l;

    /* renamed from: m, reason: collision with root package name */
    public float f4985m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4986n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4987o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public C0326g f4988q;

    /* renamed from: r, reason: collision with root package name */
    public final C0278k f4989r;

    /* renamed from: s, reason: collision with root package name */
    public C0278k f4990s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f4991t;

    public C0427h() {
        int i3 = G.f4893a;
        this.f4976d = M1.u.f2803d;
        this.f4977e = 1.0f;
        this.f4980h = 0;
        this.f4981i = 0;
        this.f4982j = 4.0f;
        this.f4984l = 1.0f;
        this.f4986n = true;
        this.f4987o = true;
        C0278k g3 = AbstractC0259J.g();
        this.f4989r = g3;
        this.f4990s = g3;
        this.f4991t = I2.d.E(L1.h.f2706e, C0426g.f4971f);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // h0.AbstractC0419C
    public final void a(InterfaceC0323d interfaceC0323d) {
        if (this.f4986n) {
            AbstractC0421b.d(this.f4976d, this.f4989r);
            e();
        } else if (this.p) {
            e();
        }
        this.f4986n = false;
        this.p = false;
        AbstractC0259J abstractC0259J = this.f4974b;
        if (abstractC0259J != null) {
            InterfaceC0323d.S(interfaceC0323d, this.f4990s, abstractC0259J, this.f4975c, null, 56);
        }
        AbstractC0259J abstractC0259J2 = this.f4979g;
        if (abstractC0259J2 != null) {
            C0326g c0326g = this.f4988q;
            if (this.f4987o || c0326g == null) {
                c0326g = new C0326g(this.f4978f, this.f4982j, this.f4980h, this.f4981i, 16);
                this.f4988q = c0326g;
                this.f4987o = false;
            }
            InterfaceC0323d.S(interfaceC0323d, this.f4990s, abstractC0259J2, this.f4977e, c0326g, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [L1.g, java.lang.Object] */
    public final void e() {
        Path path;
        float f3 = this.f4983k;
        C0278k c0278k = this.f4989r;
        if (f3 == 0.0f && this.f4984l == 1.0f) {
            this.f4990s = c0278k;
            return;
        }
        if (Z1.i.a(this.f4990s, c0278k)) {
            this.f4990s = AbstractC0259J.g();
        } else {
            int i3 = this.f4990s.f4278a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f4990s.f4278a.rewind();
            this.f4990s.i(i3);
        }
        ?? r02 = this.f4991t;
        C0279l c0279l = (C0279l) r02.getValue();
        if (c0278k != null) {
            c0279l.getClass();
            path = c0278k.f4278a;
        } else {
            path = null;
        }
        c0279l.f4281a.setPath(path, false);
        float length = ((C0279l) r02.getValue()).f4281a.getLength();
        float f4 = this.f4983k;
        float f5 = this.f4985m;
        float f6 = ((f4 + f5) % 1.0f) * length;
        float f7 = ((this.f4984l + f5) % 1.0f) * length;
        if (f6 <= f7) {
            ((C0279l) r02.getValue()).a(f6, f7, this.f4990s);
        } else {
            ((C0279l) r02.getValue()).a(f6, length, this.f4990s);
            ((C0279l) r02.getValue()).a(0.0f, f7, this.f4990s);
        }
    }

    public final String toString() {
        return this.f4989r.toString();
    }
}
