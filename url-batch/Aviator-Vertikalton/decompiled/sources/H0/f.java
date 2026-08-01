package H0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f258a;

    /* renamed from: b, reason: collision with root package name */
    public A0.a f259b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f260c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f261d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f262e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f263f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f264g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f265j;

    /* renamed from: k, reason: collision with root package name */
    public int f266k;

    /* renamed from: l, reason: collision with root package name */
    public float f267l;

    /* renamed from: m, reason: collision with root package name */
    public float f268m;

    /* renamed from: n, reason: collision with root package name */
    public int f269n;

    /* renamed from: o, reason: collision with root package name */
    public int f270o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f271p;

    public f(k kVar) {
        this.f260c = null;
        this.f261d = null;
        this.f262e = null;
        this.f263f = PorterDuff.Mode.SRC_IN;
        this.f264g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f266k = 255;
        this.f267l = 0.0f;
        this.f268m = 0.0f;
        this.f269n = 0;
        this.f270o = 0;
        this.f271p = Paint.Style.FILL_AND_STROKE;
        this.f258a = kVar;
        this.f259b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f277e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f260c = null;
        this.f261d = null;
        this.f262e = null;
        this.f263f = PorterDuff.Mode.SRC_IN;
        this.f264g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f266k = 255;
        this.f267l = 0.0f;
        this.f268m = 0.0f;
        this.f269n = 0;
        this.f270o = 0;
        this.f271p = Paint.Style.FILL_AND_STROKE;
        this.f258a = fVar.f258a;
        this.f259b = fVar.f259b;
        this.f265j = fVar.f265j;
        this.f260c = fVar.f260c;
        this.f261d = fVar.f261d;
        this.f263f = fVar.f263f;
        this.f262e = fVar.f262e;
        this.f266k = fVar.f266k;
        this.h = fVar.h;
        this.f270o = fVar.f270o;
        this.i = fVar.i;
        this.f267l = fVar.f267l;
        this.f268m = fVar.f268m;
        this.f269n = fVar.f269n;
        this.f271p = fVar.f271p;
        if (fVar.f264g != null) {
            this.f264g = new Rect(fVar.f264g);
        }
    }
}
