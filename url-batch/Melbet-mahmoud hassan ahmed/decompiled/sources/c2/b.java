package c2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import r0.i;

/* loaded from: classes.dex */
public final class b implements r0.i {

    /* renamed from: w, reason: collision with root package name */
    public static final b f1822w = new C0043b().o("").a();

    /* renamed from: x, reason: collision with root package name */
    public static final i.a<b> f1823x = new i.a() { // from class: c2.a
        @Override // r0.i.a
        public final r0.i a(Bundle bundle) {
            b c7;
            c7 = b.c(bundle);
            return c7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f1824f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f1825g;

    /* renamed from: h, reason: collision with root package name */
    public final Layout.Alignment f1826h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap f1827i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1828j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1829k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1830l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1831m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1832n;

    /* renamed from: o, reason: collision with root package name */
    public final float f1833o;

    /* renamed from: p, reason: collision with root package name */
    public final float f1834p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1835q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1836r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1837s;

    /* renamed from: t, reason: collision with root package name */
    public final float f1838t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1839u;

    /* renamed from: v, reason: collision with root package name */
    public final float f1840v;

    /* renamed from: c2.b$b, reason: collision with other inner class name */
    public static final class C0043b {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f1841a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f1842b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f1843c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f1844d;

        /* renamed from: e, reason: collision with root package name */
        private float f1845e;

        /* renamed from: f, reason: collision with root package name */
        private int f1846f;

        /* renamed from: g, reason: collision with root package name */
        private int f1847g;

        /* renamed from: h, reason: collision with root package name */
        private float f1848h;

        /* renamed from: i, reason: collision with root package name */
        private int f1849i;

        /* renamed from: j, reason: collision with root package name */
        private int f1850j;

        /* renamed from: k, reason: collision with root package name */
        private float f1851k;

        /* renamed from: l, reason: collision with root package name */
        private float f1852l;

        /* renamed from: m, reason: collision with root package name */
        private float f1853m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f1854n;

        /* renamed from: o, reason: collision with root package name */
        private int f1855o;

        /* renamed from: p, reason: collision with root package name */
        private int f1856p;

        /* renamed from: q, reason: collision with root package name */
        private float f1857q;

        public C0043b() {
            this.f1841a = null;
            this.f1842b = null;
            this.f1843c = null;
            this.f1844d = null;
            this.f1845e = -3.4028235E38f;
            this.f1846f = Integer.MIN_VALUE;
            this.f1847g = Integer.MIN_VALUE;
            this.f1848h = -3.4028235E38f;
            this.f1849i = Integer.MIN_VALUE;
            this.f1850j = Integer.MIN_VALUE;
            this.f1851k = -3.4028235E38f;
            this.f1852l = -3.4028235E38f;
            this.f1853m = -3.4028235E38f;
            this.f1854n = false;
            this.f1855o = -16777216;
            this.f1856p = Integer.MIN_VALUE;
        }

        private C0043b(b bVar) {
            this.f1841a = bVar.f1824f;
            this.f1842b = bVar.f1827i;
            this.f1843c = bVar.f1825g;
            this.f1844d = bVar.f1826h;
            this.f1845e = bVar.f1828j;
            this.f1846f = bVar.f1829k;
            this.f1847g = bVar.f1830l;
            this.f1848h = bVar.f1831m;
            this.f1849i = bVar.f1832n;
            this.f1850j = bVar.f1837s;
            this.f1851k = bVar.f1838t;
            this.f1852l = bVar.f1833o;
            this.f1853m = bVar.f1834p;
            this.f1854n = bVar.f1835q;
            this.f1855o = bVar.f1836r;
            this.f1856p = bVar.f1839u;
            this.f1857q = bVar.f1840v;
        }

        public b a() {
            return new b(this.f1841a, this.f1843c, this.f1844d, this.f1842b, this.f1845e, this.f1846f, this.f1847g, this.f1848h, this.f1849i, this.f1850j, this.f1851k, this.f1852l, this.f1853m, this.f1854n, this.f1855o, this.f1856p, this.f1857q);
        }

        public C0043b b() {
            this.f1854n = false;
            return this;
        }

        public int c() {
            return this.f1847g;
        }

        public int d() {
            return this.f1849i;
        }

        public CharSequence e() {
            return this.f1841a;
        }

        public C0043b f(Bitmap bitmap) {
            this.f1842b = bitmap;
            return this;
        }

        public C0043b g(float f7) {
            this.f1853m = f7;
            return this;
        }

        public C0043b h(float f7, int i7) {
            this.f1845e = f7;
            this.f1846f = i7;
            return this;
        }

        public C0043b i(int i7) {
            this.f1847g = i7;
            return this;
        }

        public C0043b j(Layout.Alignment alignment) {
            this.f1844d = alignment;
            return this;
        }

        public C0043b k(float f7) {
            this.f1848h = f7;
            return this;
        }

        public C0043b l(int i7) {
            this.f1849i = i7;
            return this;
        }

        public C0043b m(float f7) {
            this.f1857q = f7;
            return this;
        }

        public C0043b n(float f7) {
            this.f1852l = f7;
            return this;
        }

        public C0043b o(CharSequence charSequence) {
            this.f1841a = charSequence;
            return this;
        }

        public C0043b p(Layout.Alignment alignment) {
            this.f1843c = alignment;
            return this;
        }

        public C0043b q(float f7, int i7) {
            this.f1851k = f7;
            this.f1850j = i7;
            return this;
        }

        public C0043b r(int i7) {
            this.f1856p = i7;
            return this;
        }

        public C0043b s(int i7) {
            this.f1855o = i7;
            this.f1854n = true;
            return this;
        }
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i7, int i8, float f8, int i9, int i10, float f9, float f10, float f11, boolean z6, int i11, int i12, float f12) {
        if (charSequence == null) {
            o2.a.e(bitmap);
        } else {
            o2.a.a(bitmap == null);
        }
        this.f1824f = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f1825g = alignment;
        this.f1826h = alignment2;
        this.f1827i = bitmap;
        this.f1828j = f7;
        this.f1829k = i7;
        this.f1830l = i8;
        this.f1831m = f8;
        this.f1832n = i9;
        this.f1833o = f10;
        this.f1834p = f11;
        this.f1835q = z6;
        this.f1836r = i11;
        this.f1837s = i10;
        this.f1838t = f9;
        this.f1839u = i12;
        this.f1840v = f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C0043b c0043b = new C0043b();
        CharSequence charSequence = bundle.getCharSequence(d(0));
        if (charSequence != null) {
            c0043b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(d(1));
        if (alignment != null) {
            c0043b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(d(2));
        if (alignment2 != null) {
            c0043b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(d(3));
        if (bitmap != null) {
            c0043b.f(bitmap);
        }
        if (bundle.containsKey(d(4)) && bundle.containsKey(d(5))) {
            c0043b.h(bundle.getFloat(d(4)), bundle.getInt(d(5)));
        }
        if (bundle.containsKey(d(6))) {
            c0043b.i(bundle.getInt(d(6)));
        }
        if (bundle.containsKey(d(7))) {
            c0043b.k(bundle.getFloat(d(7)));
        }
        if (bundle.containsKey(d(8))) {
            c0043b.l(bundle.getInt(d(8)));
        }
        if (bundle.containsKey(d(10)) && bundle.containsKey(d(9))) {
            c0043b.q(bundle.getFloat(d(10)), bundle.getInt(d(9)));
        }
        if (bundle.containsKey(d(11))) {
            c0043b.n(bundle.getFloat(d(11)));
        }
        if (bundle.containsKey(d(12))) {
            c0043b.g(bundle.getFloat(d(12)));
        }
        if (bundle.containsKey(d(13))) {
            c0043b.s(bundle.getInt(d(13)));
        }
        if (!bundle.getBoolean(d(14), false)) {
            c0043b.b();
        }
        if (bundle.containsKey(d(15))) {
            c0043b.r(bundle.getInt(d(15)));
        }
        if (bundle.containsKey(d(16))) {
            c0043b.m(bundle.getFloat(d(16)));
        }
        return c0043b.a();
    }

    private static String d(int i7) {
        return Integer.toString(i7, 36);
    }

    public C0043b b() {
        return new C0043b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f1824f, bVar.f1824f) && this.f1825g == bVar.f1825g && this.f1826h == bVar.f1826h && ((bitmap = this.f1827i) != null ? !((bitmap2 = bVar.f1827i) == null || !bitmap.sameAs(bitmap2)) : bVar.f1827i == null) && this.f1828j == bVar.f1828j && this.f1829k == bVar.f1829k && this.f1830l == bVar.f1830l && this.f1831m == bVar.f1831m && this.f1832n == bVar.f1832n && this.f1833o == bVar.f1833o && this.f1834p == bVar.f1834p && this.f1835q == bVar.f1835q && this.f1836r == bVar.f1836r && this.f1837s == bVar.f1837s && this.f1838t == bVar.f1838t && this.f1839u == bVar.f1839u && this.f1840v == bVar.f1840v;
    }

    public int hashCode() {
        return l4.i.b(this.f1824f, this.f1825g, this.f1826h, this.f1827i, Float.valueOf(this.f1828j), Integer.valueOf(this.f1829k), Integer.valueOf(this.f1830l), Float.valueOf(this.f1831m), Integer.valueOf(this.f1832n), Float.valueOf(this.f1833o), Float.valueOf(this.f1834p), Boolean.valueOf(this.f1835q), Integer.valueOf(this.f1836r), Integer.valueOf(this.f1837s), Float.valueOf(this.f1838t), Integer.valueOf(this.f1839u), Float.valueOf(this.f1840v));
    }
}
