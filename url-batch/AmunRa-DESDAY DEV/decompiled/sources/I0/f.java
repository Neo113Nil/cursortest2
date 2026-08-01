package I0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f254a;

    /* renamed from: b, reason: collision with root package name */
    public B0.a f255b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f256c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f257e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f258f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f259g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f260j;

    /* renamed from: k, reason: collision with root package name */
    public int f261k;

    /* renamed from: l, reason: collision with root package name */
    public float f262l;

    /* renamed from: m, reason: collision with root package name */
    public float f263m;

    /* renamed from: n, reason: collision with root package name */
    public int f264n;

    /* renamed from: o, reason: collision with root package name */
    public int f265o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f266p;

    public f(k kVar) {
        this.f256c = null;
        this.d = null;
        this.f257e = null;
        this.f258f = PorterDuff.Mode.SRC_IN;
        this.f259g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f261k = 255;
        this.f262l = 0.0f;
        this.f263m = 0.0f;
        this.f264n = 0;
        this.f265o = 0;
        this.f266p = Paint.Style.FILL_AND_STROKE;
        this.f254a = kVar;
        this.f255b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f271e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f256c = null;
        this.d = null;
        this.f257e = null;
        this.f258f = PorterDuff.Mode.SRC_IN;
        this.f259g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f261k = 255;
        this.f262l = 0.0f;
        this.f263m = 0.0f;
        this.f264n = 0;
        this.f265o = 0;
        this.f266p = Paint.Style.FILL_AND_STROKE;
        this.f254a = fVar.f254a;
        this.f255b = fVar.f255b;
        this.f260j = fVar.f260j;
        this.f256c = fVar.f256c;
        this.d = fVar.d;
        this.f258f = fVar.f258f;
        this.f257e = fVar.f257e;
        this.f261k = fVar.f261k;
        this.h = fVar.h;
        this.f265o = fVar.f265o;
        this.i = fVar.i;
        this.f262l = fVar.f262l;
        this.f263m = fVar.f263m;
        this.f264n = fVar.f264n;
        this.f266p = fVar.f266p;
        if (fVar.f259g != null) {
            this.f259g = new Rect(fVar.f259g);
        }
    }
}
