package f0;

import Z.AbstractC0319p;
import Z.C0313j;
import Z.C0314k;
import Z.K;
import android.graphics.Path;
import b0.C0500h;
import b0.InterfaceC0496d;
import kotlin.jvm.internal.Intrinsics;
import y2.C1336k;
import y2.EnumC1337l;

/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587h extends AbstractC0572C {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0319p f6388b;

    /* renamed from: f, reason: collision with root package name */
    public float f6392f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0319p f6393g;

    /* renamed from: k, reason: collision with root package name */
    public float f6397k;

    /* renamed from: m, reason: collision with root package name */
    public float f6399m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6402p;

    /* renamed from: q, reason: collision with root package name */
    public C0500h f6403q;

    /* renamed from: r, reason: collision with root package name */
    public final C0313j f6404r;

    /* renamed from: s, reason: collision with root package name */
    public C0313j f6405s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f6406t;

    /* renamed from: c, reason: collision with root package name */
    public float f6389c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public Object f6390d = AbstractC0576G.f6305a;

    /* renamed from: e, reason: collision with root package name */
    public float f6391e = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f6394h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f6395i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f6396j = 4.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f6398l = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6400n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6401o = true;

    public C0587h() {
        C0313j h4 = K.h();
        this.f6404r = h4;
        this.f6405s = h4;
        this.f6406t = C1336k.b(EnumC1337l.f11671e, C0586g.f6385e);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // f0.AbstractC0572C
    public final void a(InterfaceC0496d interfaceC0496d) {
        if (this.f6400n) {
            AbstractC0581b.d(this.f6390d, this.f6404r);
            e();
        } else if (this.f6402p) {
            e();
        }
        this.f6400n = false;
        this.f6402p = false;
        AbstractC0319p abstractC0319p = this.f6388b;
        if (abstractC0319p != null) {
            InterfaceC0496d.U(interfaceC0496d, this.f6405s, abstractC0319p, this.f6389c, null, 56);
        }
        AbstractC0319p abstractC0319p2 = this.f6393g;
        if (abstractC0319p2 != null) {
            C0500h c0500h = this.f6403q;
            if (this.f6401o || c0500h == null) {
                c0500h = new C0500h(this.f6392f, this.f6396j, this.f6394h, this.f6395i, 16);
                this.f6403q = c0500h;
                this.f6401o = false;
            }
            InterfaceC0496d.U(interfaceC0496d, this.f6405s, abstractC0319p2, this.f6391e, c0500h, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, y2.j] */
    public final void e() {
        Path path;
        float f4 = this.f6397k;
        C0313j c0313j = this.f6404r;
        if (f4 == 0.0f && this.f6398l == 1.0f) {
            this.f6405s = c0313j;
            return;
        }
        if (Intrinsics.a(this.f6405s, c0313j)) {
            this.f6405s = K.h();
        } else {
            int i2 = this.f6405s.f4530a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f6405s.f4530a.rewind();
            this.f6405s.f(i2);
        }
        ?? r02 = this.f6406t;
        C0314k c0314k = (C0314k) r02.getValue();
        if (c0313j != null) {
            c0314k.getClass();
            path = c0313j.f4530a;
        } else {
            path = null;
        }
        c0314k.f4533a.setPath(path, false);
        float length = ((C0314k) r02.getValue()).f4533a.getLength();
        float f5 = this.f6397k;
        float f6 = this.f6399m;
        float f7 = ((f5 + f6) % 1.0f) * length;
        float f8 = ((this.f6398l + f6) % 1.0f) * length;
        if (f7 <= f8) {
            ((C0314k) r02.getValue()).a(f7, f8, this.f6405s);
        } else {
            ((C0314k) r02.getValue()).a(f7, length, this.f6405s);
            ((C0314k) r02.getValue()).a(0.0f, f8, this.f6405s);
        }
    }

    public final String toString() {
        return this.f6404r.toString();
    }
}
