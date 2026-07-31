package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.O;
import e.AbstractC2405a;
import e.AbstractC2407c;
import e.AbstractC2408d;
import f.AbstractC2415a;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259h {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f10916b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static C1259h f10917c;

    /* renamed from: a, reason: collision with root package name */
    private O f10918a;

    /* renamed from: androidx.appcompat.widget.h$a */
    class a implements O.c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f10919a = {e.e.f36252R, e.e.f36250P, e.e.f36254a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f10920b = {e.e.f36268o, e.e.f36236B, e.e.f36273t, e.e.f36269p, e.e.f36270q, e.e.f36272s, e.e.f36271r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f10921c = {e.e.f36249O, e.e.f36251Q, e.e.f36264k, e.e.f36245K, e.e.f36246L, e.e.f36247M, e.e.f36248N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f10922d = {e.e.f36276w, e.e.f36262i, e.e.f36275v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f10923e = {e.e.f36244J, e.e.f36253S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f10924f = {e.e.f36256c, e.e.f36260g, e.e.f36257d, e.e.f36261h};

        a() {
        }

        private boolean f(int[] iArr, int i4) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i4) {
            int c4 = V.c(context, AbstractC2405a.f36206t);
            return new ColorStateList(new int[][]{V.f10836b, V.f10839e, V.f10837c, V.f10843i}, new int[]{V.b(context, AbstractC2405a.f36204r), androidx.core.graphics.a.g(c4, i4), androidx.core.graphics.a.g(c4, i4), i4});
        }

        private ColorStateList i(Context context) {
            return h(context, V.c(context, AbstractC2405a.f36203q));
        }

        private ColorStateList j(Context context) {
            return h(context, V.c(context, AbstractC2405a.f36204r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e4 = V.e(context, AbstractC2405a.f36208v);
            if (e4 == null || !e4.isStateful()) {
                iArr[0] = V.f10836b;
                iArr2[0] = V.b(context, AbstractC2405a.f36208v);
                iArr[1] = V.f10840f;
                iArr2[1] = V.c(context, AbstractC2405a.f36205s);
                iArr[2] = V.f10843i;
                iArr2[2] = V.c(context, AbstractC2405a.f36208v);
            } else {
                int[] iArr3 = V.f10836b;
                iArr[0] = iArr3;
                iArr2[0] = e4.getColorForState(iArr3, 0);
                iArr[1] = V.f10840f;
                iArr2[1] = V.c(context, AbstractC2405a.f36205s);
                iArr[2] = V.f10843i;
                iArr2[2] = e4.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(O o4, Context context, int i4) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
            Drawable i5 = o4.i(context, e.e.f36240F);
            Drawable i6 = o4.i(context, e.e.f36241G);
            if ((i5 instanceof BitmapDrawable) && i5.getIntrinsicWidth() == dimensionPixelSize && i5.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) i5;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i5.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((i6 instanceof BitmapDrawable) && i6.getIntrinsicWidth() == dimensionPixelSize && i6.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i6;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i6.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i4, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C1259h.f10916b;
            }
            mutate.setColorFilter(C1259h.e(i4, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
        @Override // androidx.appcompat.widget.O.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(Context context, int i4, Drawable drawable) {
            PorterDuff.Mode mode;
            int i5;
            boolean z4;
            int round;
            PorterDuff.Mode mode2 = C1259h.f10916b;
            if (f(this.f10919a, i4)) {
                i5 = AbstractC2405a.f36207u;
            } else if (f(this.f10921c, i4)) {
                i5 = AbstractC2405a.f36205s;
            } else {
                if (f(this.f10922d, i4)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i4 == e.e.f36274u) {
                        round = Math.round(40.8f);
                        i5 = 16842800;
                        mode = mode2;
                        z4 = true;
                        if (z4) {
                            return false;
                        }
                        Drawable mutate = drawable.mutate();
                        mutate.setColorFilter(C1259h.e(V.c(context, i5), mode));
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                        return true;
                    }
                    if (i4 != e.e.f36265l) {
                        mode = mode2;
                        i5 = 0;
                        z4 = false;
                        round = -1;
                        if (z4) {
                        }
                    }
                }
                mode = mode2;
                round = -1;
                i5 = 16842801;
                z4 = true;
                if (z4) {
                }
            }
            mode = mode2;
            z4 = true;
            round = -1;
            if (z4) {
            }
        }

        @Override // androidx.appcompat.widget.O.c
        public PorterDuff.Mode b(int i4) {
            if (i4 == e.e.f36242H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.O.c
        public Drawable c(O o4, Context context, int i4) {
            if (i4 == e.e.f36263j) {
                return new LayerDrawable(new Drawable[]{o4.i(context, e.e.f36262i), o4.i(context, e.e.f36264k)});
            }
            if (i4 == e.e.f36278y) {
                return l(o4, context, AbstractC2408d.f36228g);
            }
            if (i4 == e.e.f36277x) {
                return l(o4, context, AbstractC2408d.f36229h);
            }
            if (i4 == e.e.f36279z) {
                return l(o4, context, AbstractC2408d.f36230i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.O.c
        public ColorStateList d(Context context, int i4) {
            if (i4 == e.e.f36266m) {
                return AbstractC2415a.a(context, AbstractC2407c.f36218e);
            }
            if (i4 == e.e.f36243I) {
                return AbstractC2415a.a(context, AbstractC2407c.f36221h);
            }
            if (i4 == e.e.f36242H) {
                return k(context);
            }
            if (i4 == e.e.f36259f) {
                return j(context);
            }
            if (i4 == e.e.f36255b) {
                return g(context);
            }
            if (i4 == e.e.f36258e) {
                return i(context);
            }
            if (i4 == e.e.f36238D || i4 == e.e.f36239E) {
                return AbstractC2415a.a(context, AbstractC2407c.f36220g);
            }
            if (f(this.f10920b, i4)) {
                return V.e(context, AbstractC2405a.f36207u);
            }
            if (f(this.f10923e, i4)) {
                return AbstractC2415a.a(context, AbstractC2407c.f36217d);
            }
            if (f(this.f10924f, i4)) {
                return AbstractC2415a.a(context, AbstractC2407c.f36216c);
            }
            if (i4 == e.e.f36235A) {
                return AbstractC2415a.a(context, AbstractC2407c.f36219f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.O.c
        public boolean e(Context context, int i4, Drawable drawable) {
            if (i4 == e.e.f36237C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), V.c(context, AbstractC2405a.f36207u), C1259h.f10916b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), V.c(context, AbstractC2405a.f36207u), C1259h.f10916b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), V.c(context, AbstractC2405a.f36205s), C1259h.f10916b);
                return true;
            }
            if (i4 != e.e.f36278y && i4 != e.e.f36277x && i4 != e.e.f36279z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), V.b(context, AbstractC2405a.f36207u), C1259h.f10916b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), V.c(context, AbstractC2405a.f36205s), C1259h.f10916b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), V.c(context, AbstractC2405a.f36205s), C1259h.f10916b);
            return true;
        }
    }

    public static synchronized C1259h b() {
        C1259h c1259h;
        synchronized (C1259h.class) {
            try {
                if (f10917c == null) {
                    h();
                }
                c1259h = f10917c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1259h;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter k4;
        synchronized (C1259h.class) {
            k4 = O.k(i4, mode);
        }
        return k4;
    }

    public static synchronized void h() {
        synchronized (C1259h.class) {
            if (f10917c == null) {
                C1259h c1259h = new C1259h();
                f10917c = c1259h;
                c1259h.f10918a = O.g();
                f10917c.f10918a.t(new a());
            }
        }
    }

    static void i(Drawable drawable, X x4, int[] iArr) {
        O.v(drawable, x4, iArr);
    }

    public synchronized Drawable c(Context context, int i4) {
        return this.f10918a.i(context, i4);
    }

    synchronized Drawable d(Context context, int i4, boolean z4) {
        return this.f10918a.j(context, i4, z4);
    }

    synchronized ColorStateList f(Context context, int i4) {
        return this.f10918a.l(context, i4);
    }

    public synchronized void g(Context context) {
        this.f10918a.r(context);
    }
}
