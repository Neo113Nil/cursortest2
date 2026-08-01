package H0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f257a;

    /* renamed from: b, reason: collision with root package name */
    public A0.a f258b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f259c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f260d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f261e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f262f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f263g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f264j;

    /* renamed from: k, reason: collision with root package name */
    public int f265k;

    /* renamed from: l, reason: collision with root package name */
    public float f266l;

    /* renamed from: m, reason: collision with root package name */
    public float f267m;

    /* renamed from: n, reason: collision with root package name */
    public int f268n;

    /* renamed from: o, reason: collision with root package name */
    public int f269o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f270p;

    public f(k kVar) {
        this.f259c = null;
        this.f260d = null;
        this.f261e = null;
        this.f262f = PorterDuff.Mode.SRC_IN;
        this.f263g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f265k = 255;
        this.f266l = 0.0f;
        this.f267m = 0.0f;
        this.f268n = 0;
        this.f269o = 0;
        this.f270p = Paint.Style.FILL_AND_STROKE;
        this.f257a = kVar;
        this.f258b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f276e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f259c = null;
        this.f260d = null;
        this.f261e = null;
        this.f262f = PorterDuff.Mode.SRC_IN;
        this.f263g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f265k = 255;
        this.f266l = 0.0f;
        this.f267m = 0.0f;
        this.f268n = 0;
        this.f269o = 0;
        this.f270p = Paint.Style.FILL_AND_STROKE;
        this.f257a = fVar.f257a;
        this.f258b = fVar.f258b;
        this.f264j = fVar.f264j;
        this.f259c = fVar.f259c;
        this.f260d = fVar.f260d;
        this.f262f = fVar.f262f;
        this.f261e = fVar.f261e;
        this.f265k = fVar.f265k;
        this.h = fVar.h;
        this.f269o = fVar.f269o;
        this.i = fVar.i;
        this.f266l = fVar.f266l;
        this.f267m = fVar.f267m;
        this.f268n = fVar.f268n;
        this.f270p = fVar.f270p;
        if (fVar.f263g != null) {
            this.f263g = new Rect(fVar.f263g);
        }
    }
}
