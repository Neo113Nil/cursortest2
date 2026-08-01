package I0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f261a;

    /* renamed from: b, reason: collision with root package name */
    public B0.a f262b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f263c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f264e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f265f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f266g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f267j;

    /* renamed from: k, reason: collision with root package name */
    public int f268k;

    /* renamed from: l, reason: collision with root package name */
    public float f269l;

    /* renamed from: m, reason: collision with root package name */
    public float f270m;

    /* renamed from: n, reason: collision with root package name */
    public int f271n;

    /* renamed from: o, reason: collision with root package name */
    public int f272o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f273p;

    public f(k kVar) {
        this.f263c = null;
        this.d = null;
        this.f264e = null;
        this.f265f = PorterDuff.Mode.SRC_IN;
        this.f266g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f268k = 255;
        this.f269l = 0.0f;
        this.f270m = 0.0f;
        this.f271n = 0;
        this.f272o = 0;
        this.f273p = Paint.Style.FILL_AND_STROKE;
        this.f261a = kVar;
        this.f262b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f278e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f263c = null;
        this.d = null;
        this.f264e = null;
        this.f265f = PorterDuff.Mode.SRC_IN;
        this.f266g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f268k = 255;
        this.f269l = 0.0f;
        this.f270m = 0.0f;
        this.f271n = 0;
        this.f272o = 0;
        this.f273p = Paint.Style.FILL_AND_STROKE;
        this.f261a = fVar.f261a;
        this.f262b = fVar.f262b;
        this.f267j = fVar.f267j;
        this.f263c = fVar.f263c;
        this.d = fVar.d;
        this.f265f = fVar.f265f;
        this.f264e = fVar.f264e;
        this.f268k = fVar.f268k;
        this.h = fVar.h;
        this.f272o = fVar.f272o;
        this.i = fVar.i;
        this.f269l = fVar.f269l;
        this.f270m = fVar.f270m;
        this.f271n = fVar.f271n;
        this.f273p = fVar.f273p;
        if (fVar.f266g != null) {
            this.f266g = new Rect(fVar.f266g);
        }
    }
}
