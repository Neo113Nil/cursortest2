package I0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f314a;

    /* renamed from: b, reason: collision with root package name */
    public B0.a f315b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f316c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f317e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f318f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f319g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f320j;

    /* renamed from: k, reason: collision with root package name */
    public int f321k;

    /* renamed from: l, reason: collision with root package name */
    public float f322l;

    /* renamed from: m, reason: collision with root package name */
    public float f323m;

    /* renamed from: n, reason: collision with root package name */
    public int f324n;

    /* renamed from: o, reason: collision with root package name */
    public int f325o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f326p;

    public f(k kVar) {
        this.f316c = null;
        this.d = null;
        this.f317e = null;
        this.f318f = PorterDuff.Mode.SRC_IN;
        this.f319g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f321k = 255;
        this.f322l = 0.0f;
        this.f323m = 0.0f;
        this.f324n = 0;
        this.f325o = 0;
        this.f326p = Paint.Style.FILL_AND_STROKE;
        this.f314a = kVar;
        this.f315b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f331e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f316c = null;
        this.d = null;
        this.f317e = null;
        this.f318f = PorterDuff.Mode.SRC_IN;
        this.f319g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f321k = 255;
        this.f322l = 0.0f;
        this.f323m = 0.0f;
        this.f324n = 0;
        this.f325o = 0;
        this.f326p = Paint.Style.FILL_AND_STROKE;
        this.f314a = fVar.f314a;
        this.f315b = fVar.f315b;
        this.f320j = fVar.f320j;
        this.f316c = fVar.f316c;
        this.d = fVar.d;
        this.f318f = fVar.f318f;
        this.f317e = fVar.f317e;
        this.f321k = fVar.f321k;
        this.h = fVar.h;
        this.f325o = fVar.f325o;
        this.i = fVar.i;
        this.f322l = fVar.f322l;
        this.f323m = fVar.f323m;
        this.f324n = fVar.f324n;
        this.f326p = fVar.f326p;
        if (fVar.f319g != null) {
            this.f319g = new Rect(fVar.f319g);
        }
    }
}
