package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.q;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: u, reason: collision with root package name */
    private static final long f21804u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    int f21805a;

    /* renamed from: b, reason: collision with root package name */
    long f21806b;

    /* renamed from: c, reason: collision with root package name */
    int f21807c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f21808d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21809e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21810f;

    /* renamed from: g, reason: collision with root package name */
    public final List f21811g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21812h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21813i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21814j;

    /* renamed from: k, reason: collision with root package name */
    public final int f21815k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21816l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21817m;

    /* renamed from: n, reason: collision with root package name */
    public final float f21818n;

    /* renamed from: o, reason: collision with root package name */
    public final float f21819o;

    /* renamed from: p, reason: collision with root package name */
    public final float f21820p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f21821q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21822r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.Config f21823s;

    /* renamed from: t, reason: collision with root package name */
    public final q.f f21824t;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f21825a;

        /* renamed from: b, reason: collision with root package name */
        private int f21826b;

        /* renamed from: c, reason: collision with root package name */
        private String f21827c;

        /* renamed from: d, reason: collision with root package name */
        private int f21828d;

        /* renamed from: e, reason: collision with root package name */
        private int f21829e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f21830f;

        /* renamed from: g, reason: collision with root package name */
        private int f21831g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f21832h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f21833i;

        /* renamed from: j, reason: collision with root package name */
        private float f21834j;

        /* renamed from: k, reason: collision with root package name */
        private float f21835k;

        /* renamed from: l, reason: collision with root package name */
        private float f21836l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f21837m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f21838n;

        /* renamed from: o, reason: collision with root package name */
        private List f21839o;

        /* renamed from: p, reason: collision with root package name */
        private Bitmap.Config f21840p;

        /* renamed from: q, reason: collision with root package name */
        private q.f f21841q;

        b(Uri uri, int i4, Bitmap.Config config) {
            this.f21825a = uri;
            this.f21826b = i4;
            this.f21840p = config;
        }

        public t a() {
            boolean z4 = this.f21832h;
            if (z4 && this.f21830f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f21830f && this.f21828d == 0 && this.f21829e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z4 && this.f21828d == 0 && this.f21829e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f21841q == null) {
                this.f21841q = q.f.NORMAL;
            }
            return new t(this.f21825a, this.f21826b, this.f21827c, this.f21839o, this.f21828d, this.f21829e, this.f21830f, this.f21832h, this.f21831g, this.f21833i, this.f21834j, this.f21835k, this.f21836l, this.f21837m, this.f21838n, this.f21840p, this.f21841q);
        }

        boolean b() {
            return (this.f21825a == null && this.f21826b == 0) ? false : true;
        }

        boolean c() {
            return (this.f21828d == 0 && this.f21829e == 0) ? false : true;
        }

        public b d(int i4, int i5) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i5 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i5 == 0 && i4 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f21828d = i4;
            this.f21829e = i5;
            return this;
        }
    }

    String a() {
        Uri uri = this.f21808d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f21809e);
    }

    boolean b() {
        return this.f21811g != null;
    }

    public boolean c() {
        return (this.f21812h == 0 && this.f21813i == 0) ? false : true;
    }

    String d() {
        long nanoTime = System.nanoTime() - this.f21806b;
        if (nanoTime > f21804u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    boolean e() {
        return c() || this.f21818n != 0.0f;
    }

    boolean f() {
        return e() || b();
    }

    String g() {
        return "[R" + this.f21805a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i4 = this.f21809e;
        if (i4 > 0) {
            sb.append(i4);
        } else {
            sb.append(this.f21808d);
        }
        List list = this.f21811g;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f21811g.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                sb.append(' ');
                throw null;
            }
        }
        if (this.f21810f != null) {
            sb.append(" stableKey(");
            sb.append(this.f21810f);
            sb.append(')');
        }
        if (this.f21812h > 0) {
            sb.append(" resize(");
            sb.append(this.f21812h);
            sb.append(',');
            sb.append(this.f21813i);
            sb.append(')');
        }
        if (this.f21814j) {
            sb.append(" centerCrop");
        }
        if (this.f21816l) {
            sb.append(" centerInside");
        }
        if (this.f21818n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f21818n);
            if (this.f21821q) {
                sb.append(" @ ");
                sb.append(this.f21819o);
                sb.append(',');
                sb.append(this.f21820p);
            }
            sb.append(')');
        }
        if (this.f21822r) {
            sb.append(" purgeable");
        }
        if (this.f21823s != null) {
            sb.append(' ');
            sb.append(this.f21823s);
        }
        sb.append('}');
        return sb.toString();
    }

    private t(Uri uri, int i4, String str, List list, int i5, int i6, boolean z4, boolean z5, int i7, boolean z6, float f4, float f5, float f6, boolean z7, boolean z8, Bitmap.Config config, q.f fVar) {
        this.f21808d = uri;
        this.f21809e = i4;
        this.f21810f = str;
        if (list == null) {
            this.f21811g = null;
        } else {
            this.f21811g = Collections.unmodifiableList(list);
        }
        this.f21812h = i5;
        this.f21813i = i6;
        this.f21814j = z4;
        this.f21816l = z5;
        this.f21815k = i7;
        this.f21817m = z6;
        this.f21818n = f4;
        this.f21819o = f5;
        this.f21820p = f6;
        this.f21821q = z7;
        this.f21822r = z8;
        this.f21823s = config;
        this.f21824t = fVar;
    }
}
