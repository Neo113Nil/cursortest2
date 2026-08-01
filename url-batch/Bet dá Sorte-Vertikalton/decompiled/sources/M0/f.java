package M0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f481a;

    /* renamed from: b, reason: collision with root package name */
    public F0.a f482b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f483c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f484e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f485f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f486g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f487j;

    /* renamed from: k, reason: collision with root package name */
    public int f488k;

    /* renamed from: l, reason: collision with root package name */
    public float f489l;

    /* renamed from: m, reason: collision with root package name */
    public float f490m;

    /* renamed from: n, reason: collision with root package name */
    public int f491n;

    /* renamed from: o, reason: collision with root package name */
    public int f492o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f493p;

    public f(k kVar) {
        this.f483c = null;
        this.d = null;
        this.f484e = null;
        this.f485f = PorterDuff.Mode.SRC_IN;
        this.f486g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f488k = 255;
        this.f489l = 0.0f;
        this.f490m = 0.0f;
        this.f491n = 0;
        this.f492o = 0;
        this.f493p = Paint.Style.FILL_AND_STROKE;
        this.f481a = kVar;
        this.f482b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f498e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f483c = null;
        this.d = null;
        this.f484e = null;
        this.f485f = PorterDuff.Mode.SRC_IN;
        this.f486g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f488k = 255;
        this.f489l = 0.0f;
        this.f490m = 0.0f;
        this.f491n = 0;
        this.f492o = 0;
        this.f493p = Paint.Style.FILL_AND_STROKE;
        this.f481a = fVar.f481a;
        this.f482b = fVar.f482b;
        this.f487j = fVar.f487j;
        this.f483c = fVar.f483c;
        this.d = fVar.d;
        this.f485f = fVar.f485f;
        this.f484e = fVar.f484e;
        this.f488k = fVar.f488k;
        this.h = fVar.h;
        this.f492o = fVar.f492o;
        this.i = fVar.i;
        this.f489l = fVar.f489l;
        this.f490m = fVar.f490m;
        this.f491n = fVar.f491n;
        this.f493p = fVar.f493p;
        if (fVar.f486g != null) {
            this.f486g = new Rect(fVar.f486g);
        }
    }
}
