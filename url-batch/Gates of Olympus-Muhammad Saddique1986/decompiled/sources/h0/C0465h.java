package h0;

import android.graphics.Path;
import b0.AbstractC0347p;
import b0.C0341j;
import b0.C0342k;
import b0.M;
import d0.C0407h;
import d0.InterfaceC0403d;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465h extends AbstractC0450C {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0347p f5964b;

    /* renamed from: c, reason: collision with root package name */
    public float f5965c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public Object f5966d;

    /* renamed from: e, reason: collision with root package name */
    public float f5967e;

    /* renamed from: f, reason: collision with root package name */
    public float f5968f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0347p f5969g;

    /* renamed from: h, reason: collision with root package name */
    public int f5970h;

    /* renamed from: i, reason: collision with root package name */
    public int f5971i;

    /* renamed from: j, reason: collision with root package name */
    public float f5972j;

    /* renamed from: k, reason: collision with root package name */
    public float f5973k;

    /* renamed from: l, reason: collision with root package name */
    public float f5974l;

    /* renamed from: m, reason: collision with root package name */
    public float f5975m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5976n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5977o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5978p;

    /* renamed from: q, reason: collision with root package name */
    public C0407h f5979q;

    /* renamed from: r, reason: collision with root package name */
    public final C0341j f5980r;

    /* renamed from: s, reason: collision with root package name */
    public C0341j f5981s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f5982t;

    public C0465h() {
        int i3 = AbstractC0454G.f5881a;
        this.f5966d = S1.u.f4320d;
        this.f5967e = 1.0f;
        this.f5970h = 0;
        this.f5971i = 0;
        this.f5972j = 4.0f;
        this.f5974l = 1.0f;
        this.f5976n = true;
        this.f5977o = true;
        C0341j h3 = M.h();
        this.f5980r = h3;
        this.f5981s = h3;
        this.f5982t = R1.a.c(R1.g.f4148e, C0464g.f5961f);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // h0.AbstractC0450C
    public final void a(InterfaceC0403d interfaceC0403d) {
        if (this.f5976n) {
            AbstractC0459b.d(this.f5966d, this.f5980r);
            e();
        } else if (this.f5978p) {
            e();
        }
        this.f5976n = false;
        this.f5978p = false;
        AbstractC0347p abstractC0347p = this.f5964b;
        if (abstractC0347p != null) {
            InterfaceC0403d.z(interfaceC0403d, this.f5981s, abstractC0347p, this.f5965c, null, 56);
        }
        AbstractC0347p abstractC0347p2 = this.f5969g;
        if (abstractC0347p2 != null) {
            C0407h c0407h = this.f5979q;
            if (this.f5977o || c0407h == null) {
                c0407h = new C0407h(this.f5968f, this.f5972j, this.f5970h, this.f5971i, 16);
                this.f5979q = c0407h;
                this.f5977o = false;
            }
            InterfaceC0403d.z(interfaceC0403d, this.f5981s, abstractC0347p2, this.f5967e, c0407h, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [R1.f, java.lang.Object] */
    public final void e() {
        Path path;
        float f3 = this.f5973k;
        C0341j c0341j = this.f5980r;
        if (f3 == 0.0f && this.f5974l == 1.0f) {
            this.f5981s = c0341j;
            return;
        }
        if (f2.j.a(this.f5981s, c0341j)) {
            this.f5981s = M.h();
        } else {
            int i3 = this.f5981s.f5420a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f5981s.f5420a.rewind();
            this.f5981s.f(i3);
        }
        ?? r02 = this.f5982t;
        C0342k c0342k = (C0342k) r02.getValue();
        if (c0341j != null) {
            c0342k.getClass();
            path = c0341j.f5420a;
        } else {
            path = null;
        }
        c0342k.f5423a.setPath(path, false);
        float length = ((C0342k) r02.getValue()).f5423a.getLength();
        float f4 = this.f5973k;
        float f5 = this.f5975m;
        float f6 = ((f4 + f5) % 1.0f) * length;
        float f7 = ((this.f5974l + f5) % 1.0f) * length;
        if (f6 <= f7) {
            ((C0342k) r02.getValue()).a(f6, f7, this.f5981s);
        } else {
            ((C0342k) r02.getValue()).a(f6, length, this.f5981s);
            ((C0342k) r02.getValue()).a(0.0f, f7, this.f5981s);
        }
    }

    public final String toString() {
        return this.f5980r.toString();
    }
}
