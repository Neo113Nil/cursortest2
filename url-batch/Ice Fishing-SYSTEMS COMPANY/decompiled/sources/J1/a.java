package J1;

import B1.AbstractC0263e;
import B1.m;
import B1.r;
import N1.p;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anythink.basead.exoplayer.h.o;
import com.icefishing.icefishingliveapp.C5284R;
import s1.InterfaceC4992e;
import s1.h;
import s1.l;
import u1.j;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: B, reason: collision with root package name */
    public boolean f1338B;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1342F;

    /* renamed from: G, reason: collision with root package name */
    public Resources.Theme f1343G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1344H;
    public boolean J;

    /* renamed from: n, reason: collision with root package name */
    public int f1346n;

    /* renamed from: w, reason: collision with root package name */
    public int f1349w;

    /* renamed from: u, reason: collision with root package name */
    public j f1347u = j.f41129d;

    /* renamed from: v, reason: collision with root package name */
    public com.bumptech.glide.j f1348v = com.bumptech.glide.j.f23559v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1350x = true;

    /* renamed from: y, reason: collision with root package name */
    public int f1351y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f1352z = -1;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4992e f1337A = M1.c.f1878b;

    /* renamed from: C, reason: collision with root package name */
    public h f1339C = new h();

    /* renamed from: D, reason: collision with root package name */
    public N1.c f1340D = new N1.c();

    /* renamed from: E, reason: collision with root package name */
    public Class f1341E = Object.class;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1345I = true;

    public static boolean l(int i, int i4) {
        return (i & i4) != 0;
    }

    public a a(a aVar) {
        if (this.f1344H) {
            return clone().a(aVar);
        }
        int i = aVar.f1346n;
        if (l(aVar.f1346n, o.f7899d)) {
            this.J = aVar.J;
        }
        if (l(aVar.f1346n, 4)) {
            this.f1347u = aVar.f1347u;
        }
        if (l(aVar.f1346n, 8)) {
            this.f1348v = aVar.f1348v;
        }
        if (l(aVar.f1346n, 16)) {
            this.f1346n &= -33;
        }
        if (l(aVar.f1346n, 32)) {
            this.f1346n &= -17;
        }
        if (l(aVar.f1346n, 64)) {
            this.f1349w = 0;
            this.f1346n &= -129;
        }
        if (l(aVar.f1346n, 128)) {
            this.f1349w = aVar.f1349w;
            this.f1346n &= -65;
        }
        if (l(aVar.f1346n, 256)) {
            this.f1350x = aVar.f1350x;
        }
        if (l(aVar.f1346n, 512)) {
            this.f1352z = aVar.f1352z;
            this.f1351y = aVar.f1351y;
        }
        if (l(aVar.f1346n, 1024)) {
            this.f1337A = aVar.f1337A;
        }
        if (l(aVar.f1346n, 4096)) {
            this.f1341E = aVar.f1341E;
        }
        if (l(aVar.f1346n, 8192)) {
            this.f1346n &= -16385;
        }
        if (l(aVar.f1346n, 16384)) {
            this.f1346n &= -8193;
        }
        if (l(aVar.f1346n, 32768)) {
            this.f1343G = aVar.f1343G;
        }
        if (l(aVar.f1346n, 131072)) {
            this.f1338B = aVar.f1338B;
        }
        if (l(aVar.f1346n, 2048)) {
            this.f1340D.putAll(aVar.f1340D);
            this.f1345I = aVar.f1345I;
        }
        this.f1346n |= aVar.f1346n;
        this.f1339C.f40426b.i(aVar.f1339C.f40426b);
        r();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return k((a) obj);
        }
        return false;
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            h hVar = new h();
            aVar.f1339C = hVar;
            hVar.f40426b.i(this.f1339C.f40426b);
            N1.c cVar = new N1.c();
            aVar.f1340D = cVar;
            cVar.putAll(this.f1340D);
            aVar.f1342F = false;
            aVar.f1344H = false;
            return aVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public int hashCode() {
        char[] cArr = p.f1976a;
        return p.h(p.h(p.h(p.h(p.h(p.h(p.h(p.g(0, p.g(0, p.g(1, p.g(this.f1338B ? 1 : 0, p.g(this.f1352z, p.g(this.f1351y, p.g(this.f1350x ? 1 : 0, p.h(p.g(0, p.h(p.g(this.f1349w, p.h(p.g(0, p.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f1347u), this.f1348v), this.f1339C), this.f1340D), this.f1341E), this.f1337A), this.f1343G);
    }

    public final a i(Class cls) {
        if (this.f1344H) {
            return clone().i(cls);
        }
        this.f1341E = cls;
        this.f1346n |= 4096;
        r();
        return this;
    }

    public final a j(j jVar) {
        if (this.f1344H) {
            return clone().j(jVar);
        }
        this.f1347u = jVar;
        this.f1346n |= 4;
        r();
        return this;
    }

    public final boolean k(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = p.f1976a;
        return this.f1349w == aVar.f1349w && this.f1350x == aVar.f1350x && this.f1351y == aVar.f1351y && this.f1352z == aVar.f1352z && this.f1338B == aVar.f1338B && this.f1347u.equals(aVar.f1347u) && this.f1348v == aVar.f1348v && this.f1339C.equals(aVar.f1339C) && this.f1340D.equals(aVar.f1340D) && this.f1341E.equals(aVar.f1341E) && this.f1337A.equals(aVar.f1337A) && p.b(this.f1343G, aVar.f1343G);
    }

    public final a m(m mVar, AbstractC0263e abstractC0263e) {
        if (this.f1344H) {
            return clone().m(mVar, abstractC0263e);
        }
        s(m.f107g, mVar);
        return x(abstractC0263e, false);
    }

    public final a n(int i, int i4) {
        if (this.f1344H) {
            return clone().n(i, i4);
        }
        this.f1352z = i;
        this.f1351y = i4;
        this.f1346n |= 512;
        r();
        return this;
    }

    public final a o() {
        if (this.f1344H) {
            return clone().o();
        }
        this.f1349w = C5284R.drawable.default_image;
        this.f1346n = (this.f1346n | 128) & (-65);
        r();
        return this;
    }

    public final a p() {
        com.bumptech.glide.j jVar = com.bumptech.glide.j.f23560w;
        if (this.f1344H) {
            return clone().p();
        }
        this.f1348v = jVar;
        this.f1346n |= 8;
        r();
        return this;
    }

    public final a q(s1.g gVar) {
        if (this.f1344H) {
            return clone().q(gVar);
        }
        this.f1339C.f40426b.remove(gVar);
        r();
        return this;
    }

    public final void r() {
        if (this.f1342F) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a s(s1.g gVar, Object obj) {
        if (this.f1344H) {
            return clone().s(gVar, obj);
        }
        N1.g.b(gVar);
        N1.g.b(obj);
        this.f1339C.f40426b.put(gVar, obj);
        r();
        return this;
    }

    public final a t(InterfaceC4992e interfaceC4992e) {
        if (this.f1344H) {
            return clone().t(interfaceC4992e);
        }
        this.f1337A = interfaceC4992e;
        this.f1346n |= 1024;
        r();
        return this;
    }

    public final a u() {
        if (this.f1344H) {
            return clone().u();
        }
        this.f1350x = false;
        this.f1346n |= 256;
        r();
        return this;
    }

    public final a v(Resources.Theme theme) {
        if (this.f1344H) {
            return clone().v(theme);
        }
        this.f1343G = theme;
        if (theme != null) {
            this.f1346n |= 32768;
            return s(D1.c.f680b, theme);
        }
        this.f1346n &= -32769;
        return q(D1.c.f680b);
    }

    public final a w(Class cls, l lVar, boolean z8) {
        if (this.f1344H) {
            return clone().w(cls, lVar, z8);
        }
        N1.g.b(lVar);
        this.f1340D.put(cls, lVar);
        int i = this.f1346n;
        this.f1346n = 67584 | i;
        this.f1345I = false;
        if (z8) {
            this.f1346n = i | 198656;
            this.f1338B = true;
        }
        r();
        return this;
    }

    public final a x(l lVar, boolean z8) {
        if (this.f1344H) {
            return clone().x(lVar, z8);
        }
        r rVar = new r(lVar, z8);
        w(Bitmap.class, lVar, z8);
        w(Drawable.class, rVar, z8);
        w(BitmapDrawable.class, rVar, z8);
        w(F1.b.class, new F1.c(lVar), z8);
        r();
        return this;
    }

    public final a y() {
        if (this.f1344H) {
            return clone().y();
        }
        this.J = true;
        this.f1346n |= o.f7899d;
        r();
        return this;
    }
}
