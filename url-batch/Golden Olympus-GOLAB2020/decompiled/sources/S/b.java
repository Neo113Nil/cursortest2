package S;

import S.a;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.AbstractC1281a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final p f9193m = new f("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final p f9194n = new g("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final p f9195o = new h("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final p f9196p = new i("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final p f9197q = new j("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final p f9198r = new k("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final p f9199s = new l("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final p f9200t = new m("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final p f9201u = new n("x");

    /* renamed from: v, reason: collision with root package name */
    public static final p f9202v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final p f9203w = new C0063b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final p f9204x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final p f9205y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final p f9206z = new e("scrollY");

    /* renamed from: d, reason: collision with root package name */
    final Object f9210d;

    /* renamed from: e, reason: collision with root package name */
    final S.c f9211e;

    /* renamed from: j, reason: collision with root package name */
    private float f9216j;

    /* renamed from: a, reason: collision with root package name */
    float f9207a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    float f9208b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    boolean f9209c = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f9212f = false;

    /* renamed from: g, reason: collision with root package name */
    float f9213g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    float f9214h = -Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    private long f9215i = 0;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f9217k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f9218l = new ArrayList();

    static class a extends p {
        a(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getY();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setY(f4);
        }
    }

    /* renamed from: S.b$b, reason: collision with other inner class name */
    static class C0063b extends p {
        C0063b(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return AbstractC1281a0.N(view);
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            AbstractC1281a0.M0(view, f4);
        }
    }

    static class c extends p {
        c(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setAlpha(f4);
        }
    }

    static class d extends p {
        d(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScrollX();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setScrollX((int) f4);
        }
    }

    static class e extends p {
        e(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScrollY();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setScrollY((int) f4);
        }
    }

    static class f extends p {
        f(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setTranslationX(f4);
        }
    }

    static class g extends p {
        g(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setTranslationY(f4);
        }
    }

    static class h extends p {
        h(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return AbstractC1281a0.L(view);
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            AbstractC1281a0.L0(view, f4);
        }
    }

    static class i extends p {
        i(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setScaleX(f4);
        }
    }

    static class j extends p {
        j(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScaleY();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setScaleY(f4);
        }
    }

    static class k extends p {
        k(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotation();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setRotation(f4);
        }
    }

    static class l extends p {
        l(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotationX();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setRotationX(f4);
        }
    }

    static class m extends p {
        m(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotationY();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setRotationY(f4);
        }
    }

    static class n extends p {
        n(String str) {
            super(str, null);
        }

        @Override // S.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getX();
        }

        @Override // S.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f4) {
            view.setX(f4);
        }
    }

    static class o {

        /* renamed from: a, reason: collision with root package name */
        float f9219a;

        /* renamed from: b, reason: collision with root package name */
        float f9220b;

        o() {
        }
    }

    public static abstract class p extends S.c {
        /* synthetic */ p(String str, f fVar) {
            this(str);
        }

        private p(String str) {
            super(str);
        }
    }

    b(Object obj, S.c cVar) {
        this.f9210d = obj;
        this.f9211e = cVar;
        if (cVar == f9198r || cVar == f9199s || cVar == f9200t) {
            this.f9216j = 0.1f;
            return;
        }
        if (cVar == f9204x) {
            this.f9216j = 0.00390625f;
        } else if (cVar == f9196p || cVar == f9197q) {
            this.f9216j = 0.00390625f;
        } else {
            this.f9216j = 1.0f;
        }
    }

    private void b(boolean z4) {
        this.f9212f = false;
        S.a.d().g(this);
        this.f9215i = 0L;
        this.f9209c = false;
        for (int i4 = 0; i4 < this.f9217k.size(); i4++) {
            if (this.f9217k.get(i4) != null) {
                android.support.v4.media.session.b.a(this.f9217k.get(i4));
                throw null;
            }
        }
        f(this.f9217k);
    }

    private float c() {
        return this.f9211e.getValue(this.f9210d);
    }

    private static void f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void j() {
        if (this.f9212f) {
            return;
        }
        this.f9212f = true;
        if (!this.f9209c) {
            this.f9208b = c();
        }
        float f4 = this.f9208b;
        if (f4 > this.f9213g || f4 < this.f9214h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        S.a.d().a(this, 0L);
    }

    @Override // S.a.b
    public boolean a(long j4) {
        long j5 = this.f9215i;
        if (j5 == 0) {
            this.f9215i = j4;
            g(this.f9208b);
            return false;
        }
        this.f9215i = j4;
        boolean k4 = k(j4 - j5);
        float min = Math.min(this.f9208b, this.f9213g);
        this.f9208b = min;
        float max = Math.max(min, this.f9214h);
        this.f9208b = max;
        g(max);
        if (k4) {
            b(false);
        }
        return k4;
    }

    float d() {
        return this.f9216j * 0.75f;
    }

    public boolean e() {
        return this.f9212f;
    }

    void g(float f4) {
        this.f9211e.setValue(this.f9210d, f4);
        for (int i4 = 0; i4 < this.f9218l.size(); i4++) {
            if (this.f9218l.get(i4) != null) {
                android.support.v4.media.session.b.a(this.f9218l.get(i4));
                throw null;
            }
        }
        f(this.f9218l);
    }

    public b h(float f4) {
        this.f9208b = f4;
        this.f9209c = true;
        return this;
    }

    public void i() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f9212f) {
            return;
        }
        j();
    }

    abstract boolean k(long j4);
}
