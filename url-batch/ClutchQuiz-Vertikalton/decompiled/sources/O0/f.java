package O0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f513a;

    /* renamed from: b, reason: collision with root package name */
    public H0.a f514b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f515c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f516e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f517f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f518g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f519j;

    /* renamed from: k, reason: collision with root package name */
    public int f520k;

    /* renamed from: l, reason: collision with root package name */
    public float f521l;

    /* renamed from: m, reason: collision with root package name */
    public float f522m;

    /* renamed from: n, reason: collision with root package name */
    public int f523n;

    /* renamed from: o, reason: collision with root package name */
    public int f524o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f525p;

    public f(k kVar) {
        this.f515c = null;
        this.d = null;
        this.f516e = null;
        this.f517f = PorterDuff.Mode.SRC_IN;
        this.f518g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f520k = 255;
        this.f521l = 0.0f;
        this.f522m = 0.0f;
        this.f523n = 0;
        this.f524o = 0;
        this.f525p = Paint.Style.FILL_AND_STROKE;
        this.f513a = kVar;
        this.f514b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f530e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f515c = null;
        this.d = null;
        this.f516e = null;
        this.f517f = PorterDuff.Mode.SRC_IN;
        this.f518g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f520k = 255;
        this.f521l = 0.0f;
        this.f522m = 0.0f;
        this.f523n = 0;
        this.f524o = 0;
        this.f525p = Paint.Style.FILL_AND_STROKE;
        this.f513a = fVar.f513a;
        this.f514b = fVar.f514b;
        this.f519j = fVar.f519j;
        this.f515c = fVar.f515c;
        this.d = fVar.d;
        this.f517f = fVar.f517f;
        this.f516e = fVar.f516e;
        this.f520k = fVar.f520k;
        this.h = fVar.h;
        this.f524o = fVar.f524o;
        this.i = fVar.i;
        this.f521l = fVar.f521l;
        this.f522m = fVar.f522m;
        this.f523n = fVar.f523n;
        this.f525p = fVar.f525p;
        if (fVar.f518g != null) {
            this.f518g = new Rect(fVar.f518g);
        }
    }
}
