package X0;

import B2.N;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b1.C0523a;
import f1.C4491b;
import f1.C4493d;
import g1.C4524d;
import j1.AbstractC4591d;
import j1.ChoreographerFrameCallbackC4593f;
import j1.ThreadFactoryC4592e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A0, reason: collision with root package name */
    public static final ThreadPoolExecutor f3719A0;

    /* renamed from: y0, reason: collision with root package name */
    public static final boolean f3720y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final List f3721z0;

    /* renamed from: A, reason: collision with root package name */
    public String f3722A;

    /* renamed from: B, reason: collision with root package name */
    public N f3723B;

    /* renamed from: C, reason: collision with root package name */
    public Map f3724C;

    /* renamed from: D, reason: collision with root package name */
    public String f3725D;

    /* renamed from: E, reason: collision with root package name */
    public final C4524d f3726E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3727F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3728G;

    /* renamed from: H, reason: collision with root package name */
    public C4491b f3729H;

    /* renamed from: I, reason: collision with root package name */
    public int f3730I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3731K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3732L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3733M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3734N;

    /* renamed from: O, reason: collision with root package name */
    public F f3735O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3736P;

    /* renamed from: Q, reason: collision with root package name */
    public final Matrix f3737Q;

    /* renamed from: R, reason: collision with root package name */
    public Bitmap f3738R;

    /* renamed from: S, reason: collision with root package name */
    public Canvas f3739S;

    /* renamed from: T, reason: collision with root package name */
    public Rect f3740T;

    /* renamed from: U, reason: collision with root package name */
    public RectF f3741U;

    /* renamed from: V, reason: collision with root package name */
    public Y0.a f3742V;

    /* renamed from: W, reason: collision with root package name */
    public Rect f3743W;

    /* renamed from: X, reason: collision with root package name */
    public Rect f3744X;
    public RectF Y;

    /* renamed from: Z, reason: collision with root package name */
    public RectF f3745Z;

    /* renamed from: n, reason: collision with root package name */
    public i f3746n;

    /* renamed from: n0, reason: collision with root package name */
    public Matrix f3747n0;

    /* renamed from: o0, reason: collision with root package name */
    public final float[] f3748o0;

    /* renamed from: p0, reason: collision with root package name */
    public Matrix f3749p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3750q0;

    /* renamed from: r0, reason: collision with root package name */
    public EnumC0407a f3751r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Semaphore f3752s0;

    /* renamed from: t0, reason: collision with root package name */
    public Handler f3753t0;

    /* renamed from: u, reason: collision with root package name */
    public final ChoreographerFrameCallbackC4593f f3754u;

    /* renamed from: u0, reason: collision with root package name */
    public s f3755u0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3756v;

    /* renamed from: v0, reason: collision with root package name */
    public final s f3757v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3758w;

    /* renamed from: w0, reason: collision with root package name */
    public float f3759w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3760x;

    /* renamed from: x0, reason: collision with root package name */
    public int f3761x0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f3762y;

    /* renamed from: z, reason: collision with root package name */
    public C0523a f3763z;

    static {
        f3720y0 = Build.VERSION.SDK_INT <= 25;
        f3721z0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f3719A0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4592e());
    }

    public v() {
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = new ChoreographerFrameCallbackC4593f();
        this.f3754u = choreographerFrameCallbackC4593f;
        this.f3756v = true;
        this.f3758w = false;
        this.f3760x = false;
        this.f3761x0 = 1;
        this.f3762y = new ArrayList();
        this.f3726E = new C4524d(10);
        this.f3727F = false;
        this.f3728G = true;
        this.f3730I = com.anythink.basead.exoplayer.k.p.f8630b;
        this.f3734N = false;
        this.f3735O = F.f3643n;
        this.f3736P = false;
        this.f3737Q = new Matrix();
        this.f3748o0 = new float[9];
        this.f3750q0 = false;
        F3.i iVar = new F3.i(1, this);
        this.f3752s0 = new Semaphore(1);
        this.f3757v0 = new s(this, 1);
        this.f3759w0 = -3.4028235E38f;
        choreographerFrameCallbackC4593f.addUpdateListener(iVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean j(float f6) {
        return (Float.isNaN(f6) || Float.isInfinite(f6)) ? false : true;
    }

    public final void a(final c1.e eVar, final ColorFilter colorFilter, final S0.s sVar) {
        C4491b c4491b = this.f3729H;
        if (c4491b == null) {
            this.f3762y.add(new u() { // from class: X0.p
                @Override // X0.u
                public final void run() {
                    v.this.a(eVar, colorFilter, sVar);
                }
            });
            return;
        }
        boolean z8 = true;
        if (eVar == c1.e.f5678c) {
            c4491b.c(colorFilter, sVar);
        } else {
            c1.f fVar = eVar.f5680b;
            if (fVar != null) {
                fVar.c(colorFilter, sVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f3729H.f(eVar, 0, arrayList, new c1.e(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((c1.e) arrayList.get(i)).f5680b.c(colorFilter, sVar);
                }
                z8 = true ^ arrayList.isEmpty();
            }
        }
        if (z8) {
            invalidateSelf();
            if (colorFilter == z.f3774C) {
                u(this.f3754u.h());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.f3758w) {
            return true;
        }
        if (!this.f3756v) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = j1.j.f38533a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        i iVar = this.f3746n;
        if (iVar == null) {
            return;
        }
        S0.s sVar = h1.q.f38190a;
        Rect rect = iVar.f3678k;
        List list = Collections.EMPTY_LIST;
        C4491b c4491b = new C4491b(this, new C4493d(list, iVar, "__container", -1L, 1, -1L, null, list, new d1.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), iVar.f3677j, iVar);
        this.f3729H = c4491b;
        if (this.f3731K) {
            c4491b.q(true);
        }
        this.f3729H.f37587L = this.f3728G;
    }

    public final void d() {
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = this.f3754u;
        if (choreographerFrameCallbackC4593f.f38495F) {
            choreographerFrameCallbackC4593f.cancel();
            if (!isVisible()) {
                this.f3761x0 = 1;
            }
        }
        this.f3746n = null;
        this.f3729H = null;
        this.f3763z = null;
        this.f3759w0 = -3.4028235E38f;
        choreographerFrameCallbackC4593f.f38494E = null;
        choreographerFrameCallbackC4593f.f38492C = -2.1474836E9f;
        choreographerFrameCallbackC4593f.f38493D = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        i iVar;
        C4491b c4491b = this.f3729H;
        if (c4491b == null) {
            return;
        }
        EnumC0407a enumC0407a = this.f3751r0;
        if (enumC0407a == null) {
            enumC0407a = EnumC0407a.f3647n;
        }
        boolean z8 = enumC0407a == EnumC0407a.f3648u;
        ThreadPoolExecutor threadPoolExecutor = f3719A0;
        Semaphore semaphore = this.f3752s0;
        s sVar = this.f3757v0;
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = this.f3754u;
        if (z8) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z8) {
                    return;
                }
                semaphore.release();
                if (c4491b.f37586K == choreographerFrameCallbackC4593f.h()) {
                    return;
                }
            } catch (Throwable th) {
                if (z8) {
                    semaphore.release();
                    if (c4491b.f37586K != choreographerFrameCallbackC4593f.h()) {
                        threadPoolExecutor.execute(sVar);
                    }
                }
                throw th;
            }
        }
        if (z8 && (iVar = this.f3746n) != null) {
            float f6 = this.f3759w0;
            float h9 = choreographerFrameCallbackC4593f.h();
            this.f3759w0 = h9;
            if (Math.abs(h9 - f6) * iVar.b() >= 50.0f) {
                u(choreographerFrameCallbackC4593f.h());
            }
        }
        if (this.f3760x) {
            try {
                if (this.f3736P) {
                    m(canvas, c4491b);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC4591d.f38485a.getClass();
            }
        } else if (this.f3736P) {
            m(canvas, c4491b);
        } else {
            g(canvas);
        }
        this.f3750q0 = false;
        if (z8) {
            semaphore.release();
            if (c4491b.f37586K == choreographerFrameCallbackC4593f.h()) {
                return;
            }
            threadPoolExecutor.execute(sVar);
        }
    }

    public final void e() {
        i iVar = this.f3746n;
        if (iVar == null) {
            return;
        }
        F f6 = this.f3735O;
        int i = Build.VERSION.SDK_INT;
        boolean z8 = iVar.f3682o;
        int i4 = iVar.f3683p;
        int ordinal = f6.ordinal();
        boolean z9 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z8 && i < 28) || i4 > 4 || i <= 25))) {
            z9 = true;
        }
        this.f3736P = z9;
    }

    public final void g(Canvas canvas) {
        C4491b c4491b = this.f3729H;
        i iVar = this.f3746n;
        if (c4491b == null || iVar == null) {
            return;
        }
        Matrix matrix = this.f3737Q;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / iVar.f3678k.width(), r3.height() / iVar.f3678k.height());
        }
        c4491b.h(canvas, matrix, this.f3730I, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3730I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        i iVar = this.f3746n;
        if (iVar == null) {
            return -1;
        }
        return iVar.f3678k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        i iVar = this.f3746n;
        if (iVar == null) {
            return -1;
        }
        return iVar.f3678k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final N i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f3723B == null) {
            N n9 = new N(getCallback());
            this.f3723B = n9;
            String str = this.f3725D;
            if (str != null) {
                n9.f200y = str;
            }
        }
        return this.f3723B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f3750q0) {
            return;
        }
        this.f3750q0 = true;
        if ((!f3720y0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = this.f3754u;
        if (choreographerFrameCallbackC4593f == null) {
            return false;
        }
        return choreographerFrameCallbackC4593f.f38495F;
    }

    public final void k() {
        this.f3762y.clear();
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = this.f3754u;
        choreographerFrameCallbackC4593f.n(true);
        Iterator it = choreographerFrameCallbackC4593f.f38499v.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC4593f);
        }
        if (isVisible()) {
            return;
        }
        this.f3761x0 = 1;
    }

    public final void l() {
        if (this.f3729H == null) {
            this.f3762y.add(new t(this, 1));
            return;
        }
        e();
        boolean b9 = b(h());
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = this.f3754u;
        if (b9 || choreographerFrameCallbackC4593f.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC4593f.f38495F = true;
                boolean k6 = choreographerFrameCallbackC4593f.k();
                Iterator it = choreographerFrameCallbackC4593f.f38498u.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC4593f, k6);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC4593f);
                    }
                }
                choreographerFrameCallbackC4593f.o((int) (choreographerFrameCallbackC4593f.k() ? choreographerFrameCallbackC4593f.i() : choreographerFrameCallbackC4593f.j()));
                choreographerFrameCallbackC4593f.f38502y = 0L;
                choreographerFrameCallbackC4593f.f38491B = 0;
                if (choreographerFrameCallbackC4593f.f38495F) {
                    choreographerFrameCallbackC4593f.n(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC4593f);
                }
                this.f3761x0 = 1;
            } else {
                this.f3761x0 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it2 = f3721z0.iterator();
        c1.h hVar = null;
        while (it2.hasNext()) {
            hVar = this.f3746n.d((String) it2.next());
            if (hVar != null) {
                break;
            }
        }
        if (hVar != null) {
            o((int) hVar.f5684b);
        } else {
            o((int) (choreographerFrameCallbackC4593f.f38500w < 0.0f ? choreographerFrameCallbackC4593f.j() : choreographerFrameCallbackC4593f.i()));
        }
        choreographerFrameCallbackC4593f.n(true);
        choreographerFrameCallbackC4593f.l(choreographerFrameCallbackC4593f.k());
        if (isVisible()) {
            return;
        }
        this.f3761x0 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Canvas canvas, C4491b c4491b) {
        boolean z8;
        RectF rectF;
        if (this.f3746n == null || c4491b == null) {
            return;
        }
        if (this.f3739S == null) {
            this.f3739S = new Canvas();
            this.f3745Z = new RectF();
            this.f3747n0 = new Matrix();
            this.f3749p0 = new Matrix();
            this.f3740T = new Rect();
            this.f3741U = new RectF();
            this.f3742V = new Y0.a();
            this.f3743W = new Rect();
            this.f3744X = new Rect();
            this.Y = new RectF();
        }
        canvas.getMatrix(this.f3747n0);
        canvas.getClipBounds(this.f3740T);
        Rect rect = this.f3740T;
        this.f3741U.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f3747n0.mapRect(this.f3741U);
        f(this.f3740T, this.f3741U);
        if (this.f3728G) {
            this.f3745Z.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c4491b.d(this.f3745Z, null, false);
        }
        this.f3747n0.mapRect(this.f3745Z);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.f3745Z;
        rectF2.set(rectF2.left * width, rectF2.top * height, rectF2.right * width, rectF2.bottom * height);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z8 = !((ViewGroup) parent).getClipChildren();
                if (!z8) {
                    RectF rectF3 = this.f3745Z;
                    Rect rect2 = this.f3740T;
                    rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
                rectF = this.f3745Z;
                if (!j(rectF.left) && j(rectF.top) && j(rectF.right) && j(rectF.bottom)) {
                    AbstractC4591d.b("Skipping software rendering: transformed bounds contain non-finite values.");
                    return;
                }
                int ceil = (int) Math.ceil(this.f3745Z.width());
                int ceil2 = (int) Math.ceil(this.f3745Z.height());
                if (ceil <= 0 || ceil2 <= 0) {
                    AbstractC4591d.b("Skipping software rendering: transformed bounds have negative values.");
                    return;
                }
                long j9 = ceil * ceil2;
                if (j9 > 50000000) {
                    AbstractC4591d.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j9 + ")");
                    return;
                }
                Bitmap bitmap = this.f3738R;
                if (bitmap == null || bitmap.getWidth() < ceil || this.f3738R.getHeight() < ceil2) {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    this.f3738R = createBitmap;
                    this.f3739S.setBitmap(createBitmap);
                    this.f3750q0 = true;
                } else if (this.f3738R.getWidth() > ceil || this.f3738R.getHeight() > ceil2) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(this.f3738R, 0, 0, ceil, ceil2);
                    this.f3738R = createBitmap2;
                    this.f3739S.setBitmap(createBitmap2);
                    this.f3750q0 = true;
                }
                if (this.f3750q0) {
                    Matrix matrix = this.f3747n0;
                    float[] fArr = this.f3748o0;
                    matrix.getValues(fArr);
                    float f6 = fArr[0];
                    float f9 = fArr[4];
                    Matrix matrix2 = this.f3737Q;
                    matrix2.set(this.f3747n0);
                    matrix2.preScale(width, height);
                    RectF rectF4 = this.f3745Z;
                    matrix2.postTranslate(-rectF4.left, -rectF4.top);
                    matrix2.postScale(1.0f / f6, 1.0f / f9);
                    this.f3738R.eraseColor(0);
                    this.f3739S.setMatrix(j1.j.f38533a);
                    this.f3739S.scale(f6, f9);
                    c4491b.h(this.f3739S, matrix2, this.f3730I, null);
                    this.f3747n0.invert(this.f3749p0);
                    this.f3749p0.mapRect(this.Y, this.f3745Z);
                    f(this.f3744X, this.Y);
                }
                this.f3743W.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f3738R, this.f3743W, this.f3744X, this.f3742V);
                return;
            }
        }
        z8 = false;
        if (!z8) {
        }
        rectF = this.f3745Z;
        if (!j(rectF.left) && j(rectF.top) && j(rectF.right) && j(rectF.bottom)) {
        }
    }

    public final void n() {
        if (this.f3729H == null) {
            this.f3762y.add(new t(this, 0));
            return;
        }
        e();
        boolean b9 = b(h());
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = this.f3754u;
        if (b9 || choreographerFrameCallbackC4593f.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC4593f.f38495F = true;
                choreographerFrameCallbackC4593f.n(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC4593f);
                choreographerFrameCallbackC4593f.f38502y = 0L;
                if (choreographerFrameCallbackC4593f.k() && choreographerFrameCallbackC4593f.f38490A == choreographerFrameCallbackC4593f.j()) {
                    choreographerFrameCallbackC4593f.o(choreographerFrameCallbackC4593f.i());
                } else if (!choreographerFrameCallbackC4593f.k() && choreographerFrameCallbackC4593f.f38490A == choreographerFrameCallbackC4593f.i()) {
                    choreographerFrameCallbackC4593f.o(choreographerFrameCallbackC4593f.j());
                }
                Iterator it = choreographerFrameCallbackC4593f.f38499v.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC4593f);
                }
                this.f3761x0 = 1;
            } else {
                this.f3761x0 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (choreographerFrameCallbackC4593f.f38500w < 0.0f ? choreographerFrameCallbackC4593f.j() : choreographerFrameCallbackC4593f.i()));
        choreographerFrameCallbackC4593f.n(true);
        choreographerFrameCallbackC4593f.l(choreographerFrameCallbackC4593f.k());
        if (isVisible()) {
            return;
        }
        this.f3761x0 = 1;
    }

    public final void o(int i) {
        if (this.f3746n == null) {
            this.f3762y.add(new o(this, i, 2));
        } else {
            this.f3754u.o(i);
        }
    }

    public final void p(int i) {
        if (this.f3746n == null) {
            this.f3762y.add(new o(this, i, 0));
            return;
        }
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = this.f3754u;
        choreographerFrameCallbackC4593f.p(choreographerFrameCallbackC4593f.f38492C, i + 0.99f);
    }

    public final void q(String str) {
        i iVar = this.f3746n;
        if (iVar == null) {
            this.f3762y.add(new n(this, str, 1));
            return;
        }
        c1.h d2 = iVar.d(str);
        if (d2 == null) {
            throw new IllegalArgumentException(D.y.k("Cannot find marker with name ", str, com.anythink.core.common.d.j.f12535z));
        }
        p((int) (d2.f5684b + d2.f5685c));
    }

    public final void r(String str) {
        i iVar = this.f3746n;
        ArrayList arrayList = this.f3762y;
        if (iVar == null) {
            arrayList.add(new n(this, str, 0));
            return;
        }
        c1.h d2 = iVar.d(str);
        if (d2 == null) {
            throw new IllegalArgumentException(D.y.k("Cannot find marker with name ", str, com.anythink.core.common.d.j.f12535z));
        }
        int i = (int) d2.f5684b;
        int i4 = ((int) d2.f5685c) + i;
        if (this.f3746n == null) {
            arrayList.add(new r(this, i, i4));
        } else {
            this.f3754u.p(i, i4 + 0.99f);
        }
    }

    public final void s(int i) {
        if (this.f3746n == null) {
            this.f3762y.add(new o(this, i, 1));
        } else {
            this.f3754u.p(i, (int) r0.f38493D);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3730I = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC4591d.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z8, z9);
        if (z8) {
            int i = this.f3761x0;
            if (i == 2) {
                l();
                return visible;
            }
            if (i == 3) {
                n();
                return visible;
            }
        } else {
            if (this.f3754u.f38495F) {
                k();
                this.f3761x0 = 3;
                return visible;
            }
            if (isVisible) {
                this.f3761x0 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f3762y.clear();
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = this.f3754u;
        choreographerFrameCallbackC4593f.n(true);
        choreographerFrameCallbackC4593f.l(choreographerFrameCallbackC4593f.k());
        if (isVisible()) {
            return;
        }
        this.f3761x0 = 1;
    }

    public final void t(String str) {
        i iVar = this.f3746n;
        if (iVar == null) {
            this.f3762y.add(new n(this, str, 2));
            return;
        }
        c1.h d2 = iVar.d(str);
        if (d2 == null) {
            throw new IllegalArgumentException(D.y.k("Cannot find marker with name ", str, com.anythink.core.common.d.j.f12535z));
        }
        s((int) d2.f5684b);
    }

    public final void u(float f6) {
        i iVar = this.f3746n;
        if (iVar == null) {
            this.f3762y.add(new q(this, f6, 2));
        } else {
            this.f3754u.o(j1.h.f(iVar.f3679l, iVar.f3680m, f6));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
