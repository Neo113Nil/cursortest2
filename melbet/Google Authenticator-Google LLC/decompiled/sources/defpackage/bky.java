package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bky implements Cloneable {
    public boolean h;
    public Drawable j;
    public boolean n;
    public boolean p;
    private int q;
    private Drawable r;
    private int s;
    private Drawable t;
    private int u;
    private int v;
    private boolean w;
    private Resources.Theme x;
    private boolean y;
    private boolean z;
    public float a = 1.0f;
    public bdg b = bdg.d;
    public azw c = azw.c;
    public boolean d = true;
    public int e = -1;
    public int f = -1;
    public bbh g = blr.b;
    public boolean i = true;
    public bbl k = new bbl();
    public Map l = new blw();
    public Class m = Object.class;
    public boolean o = true;

    private static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    private final bky b(bhu bhuVar, bbp bbpVar) {
        bky s = s(bhuVar, bbpVar);
        s.o = true;
        return s;
    }

    final bky A(bhu bhuVar, bbp bbpVar) {
        if (this.n) {
            return g().A(bhuVar, bbpVar);
        }
        n(bhuVar);
        return y(bbpVar);
    }

    final bky B(Class cls, bbp bbpVar, boolean z) {
        if (this.n) {
            return g().B(cls, bbpVar, z);
        }
        this.l.put(cls, bbpVar);
        int i = this.q;
        this.i = true;
        this.q = 67584 | i;
        this.o = false;
        if (z) {
            this.q = i | 198656;
            this.h = true;
        }
        H();
        return this;
    }

    public final boolean C(bky bkyVar) {
        if (Float.compare(bkyVar.a, this.a) != 0) {
            return false;
        }
        int i = bkyVar.s;
        Drawable drawable = bkyVar.r;
        char[] cArr = bmi.a;
        if (!iwo.b(null, null)) {
            return false;
        }
        int i2 = bkyVar.u;
        Drawable drawable2 = bkyVar.t;
        if (!iwo.b(null, null)) {
            return false;
        }
        int i3 = bkyVar.v;
        if (!iwo.b(this.j, bkyVar.j) || this.d != bkyVar.d || this.e != bkyVar.e || this.f != bkyVar.f || this.h != bkyVar.h || this.i != bkyVar.i) {
            return false;
        }
        boolean z = bkyVar.y;
        boolean z2 = bkyVar.z;
        if (!this.b.equals(bkyVar.b) || this.c != bkyVar.c || !this.k.equals(bkyVar.k) || !this.l.equals(bkyVar.l) || !this.m.equals(bkyVar.m) || !iwo.b(this.g, bkyVar.g)) {
            return false;
        }
        Resources.Theme theme = bkyVar.x;
        return iwo.b(null, null);
    }

    public final boolean D(int i) {
        return a(this.q, i);
    }

    public final boolean E() {
        return bmi.k(this.f, this.e);
    }

    public bky F() {
        if (this.n) {
            return g().F();
        }
        this.d = false;
        this.q |= 256;
        H();
        return this;
    }

    public bky G() {
        if (this.n) {
            return g().G();
        }
        this.p = true;
        this.q |= 1048576;
        H();
        return this;
    }

    protected final void H() {
        if (this.w) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public void I() {
        this.w = true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bky) {
            return C((bky) obj);
        }
        return false;
    }

    public bky f(bky bkyVar) {
        if (this.n) {
            return g().f(bkyVar);
        }
        int i = bkyVar.q;
        if (a(i, 2)) {
            this.a = bkyVar.a;
        }
        if (a(i, 262144)) {
            boolean z = bkyVar.y;
            this.y = false;
        }
        if (a(i, 1048576)) {
            this.p = bkyVar.p;
        }
        if (a(i, 4)) {
            this.b = bkyVar.b;
        }
        if (a(i, 8)) {
            this.c = bkyVar.c;
        }
        if (a(i, 16)) {
            Drawable drawable = bkyVar.r;
            this.r = null;
            this.s = 0;
            this.q &= -33;
        }
        if (a(bkyVar.q, 32)) {
            int i2 = bkyVar.s;
            this.s = 0;
            this.r = null;
            this.q &= -17;
        }
        if (a(bkyVar.q, 64)) {
            Drawable drawable2 = bkyVar.t;
            this.t = null;
            this.u = 0;
            this.q &= -129;
        }
        if (a(bkyVar.q, 128)) {
            int i3 = bkyVar.u;
            this.u = 0;
            this.t = null;
            this.q &= -65;
        }
        int i4 = bkyVar.q;
        if (a(i4, 256)) {
            this.d = bkyVar.d;
        }
        if (a(i4, 512)) {
            this.f = bkyVar.f;
            this.e = bkyVar.e;
        }
        if (a(i4, 1024)) {
            this.g = bkyVar.g;
        }
        if (a(i4, 4096)) {
            this.m = bkyVar.m;
        }
        if (a(i4, 8192)) {
            this.j = bkyVar.j;
            this.v = 0;
            this.q &= -16385;
        }
        if (a(bkyVar.q, 16384)) {
            int i5 = bkyVar.v;
            this.v = 0;
            this.j = null;
            this.q &= -8193;
        }
        int i6 = bkyVar.q;
        if (a(i6, 32768)) {
            Resources.Theme theme = bkyVar.x;
            this.x = null;
        }
        if (a(i6, 65536)) {
            this.i = bkyVar.i;
        }
        if (a(i6, 131072)) {
            this.h = bkyVar.h;
        }
        if (a(i6, 2048)) {
            this.l.putAll(bkyVar.l);
            this.o = bkyVar.o;
        }
        if (a(bkyVar.q, 524288)) {
            boolean z2 = bkyVar.z;
            this.z = false;
        }
        if (!this.i) {
            this.l.clear();
            int i7 = this.q;
            this.h = false;
            this.q = i7 & (-133121);
            this.o = true;
        }
        this.q |= bkyVar.q;
        this.k.c(bkyVar.k);
        H();
        return this;
    }

    @Override // 
    public bky g() {
        try {
            bky bkyVar = (bky) super.clone();
            bbl bblVar = new bbl();
            bkyVar.k = bblVar;
            bblVar.c(this.k);
            blw blwVar = new blw();
            bkyVar.l = blwVar;
            blwVar.putAll(this.l);
            bkyVar.w = false;
            bkyVar.n = false;
            return bkyVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int hashCode() {
        float f = this.a;
        char[] cArr = bmi.a;
        return bmi.c(null, bmi.c(this.g, bmi.c(this.m, bmi.c(this.l, bmi.c(this.k, bmi.c(this.c, bmi.c(this.b, ((((((((((bmi.c(this.j, bmi.c(null, bmi.c(null, (Float.floatToIntBits(f) + 527) * 31) * 31) * 31) * 31) + (this.d ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 961)))))));
    }

    public bky j() {
        if (this.w && !this.n) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.n = true;
        I();
        return this;
    }

    public final bky k() {
        return A(bhu.c, new bhi());
    }

    public bky l(Class cls) {
        if (this.n) {
            return g().l(cls);
        }
        this.m = cls;
        this.q |= 4096;
        H();
        return this;
    }

    public bky m(bdg bdgVar) {
        if (this.n) {
            return g().m(bdgVar);
        }
        this.b = bdgVar;
        this.q |= 4;
        H();
        return this;
    }

    public bky n(bhu bhuVar) {
        bbk bbkVar = bhu.g;
        a.v(bhuVar, "Argument must not be null");
        return w(bbkVar, bhuVar);
    }

    public bky o(Drawable drawable) {
        if (this.n) {
            return g().o(drawable);
        }
        this.j = drawable;
        int i = this.q | 8192;
        this.v = 0;
        this.q = i & (-16385);
        H();
        return this;
    }

    public bky p() {
        return s(bhu.d, new bhg());
    }

    public bky q() {
        return b(bhu.c, new bhh());
    }

    public bky r() {
        return b(bhu.b, new bic());
    }

    final bky s(bhu bhuVar, bbp bbpVar) {
        if (this.n) {
            return g().s(bhuVar, bbpVar);
        }
        n(bhuVar);
        return z(bbpVar, false);
    }

    public bky t(int i) {
        return u(i, i);
    }

    public bky u(int i, int i2) {
        if (this.n) {
            return g().u(i, i2);
        }
        this.f = i;
        this.e = i2;
        this.q |= 512;
        H();
        return this;
    }

    public bky v(azw azwVar) {
        if (this.n) {
            return g().v(azwVar);
        }
        a.v(azwVar, "Argument must not be null");
        this.c = azwVar;
        this.q |= 8;
        H();
        return this;
    }

    public bky w(bbk bbkVar, Object obj) {
        if (this.n) {
            return g().w(bbkVar, obj);
        }
        a.v(bbkVar, "Argument must not be null");
        this.k.d(bbkVar, obj);
        H();
        return this;
    }

    public bky x(bbh bbhVar) {
        if (this.n) {
            return g().x(bbhVar);
        }
        this.g = bbhVar;
        this.q |= 1024;
        H();
        return this;
    }

    public bky y(bbp bbpVar) {
        return z(bbpVar, true);
    }

    public final bky z(bbp bbpVar, boolean z) {
        if (this.n) {
            return g().z(bbpVar, z);
        }
        bia biaVar = new bia(bbpVar, z);
        B(Bitmap.class, bbpVar, z);
        B(Drawable.class, biaVar, z);
        B(BitmapDrawable.class, biaVar, z);
        B(bjj.class, new bjm(bbpVar), z);
        H();
        return this;
    }
}
