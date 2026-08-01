package L0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f419a;

    /* renamed from: b, reason: collision with root package name */
    public E0.a f420b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f421c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f422e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f423f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f424g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f425j;

    /* renamed from: k, reason: collision with root package name */
    public int f426k;

    /* renamed from: l, reason: collision with root package name */
    public float f427l;

    /* renamed from: m, reason: collision with root package name */
    public float f428m;

    /* renamed from: n, reason: collision with root package name */
    public int f429n;

    /* renamed from: o, reason: collision with root package name */
    public int f430o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f431p;

    public f(k kVar) {
        this.f421c = null;
        this.d = null;
        this.f422e = null;
        this.f423f = PorterDuff.Mode.SRC_IN;
        this.f424g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f426k = 255;
        this.f427l = 0.0f;
        this.f428m = 0.0f;
        this.f429n = 0;
        this.f430o = 0;
        this.f431p = Paint.Style.FILL_AND_STROKE;
        this.f419a = kVar;
        this.f420b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f436e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f421c = null;
        this.d = null;
        this.f422e = null;
        this.f423f = PorterDuff.Mode.SRC_IN;
        this.f424g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f426k = 255;
        this.f427l = 0.0f;
        this.f428m = 0.0f;
        this.f429n = 0;
        this.f430o = 0;
        this.f431p = Paint.Style.FILL_AND_STROKE;
        this.f419a = fVar.f419a;
        this.f420b = fVar.f420b;
        this.f425j = fVar.f425j;
        this.f421c = fVar.f421c;
        this.d = fVar.d;
        this.f423f = fVar.f423f;
        this.f422e = fVar.f422e;
        this.f426k = fVar.f426k;
        this.h = fVar.h;
        this.f430o = fVar.f430o;
        this.i = fVar.i;
        this.f427l = fVar.f427l;
        this.f428m = fVar.f428m;
        this.f429n = fVar.f429n;
        this.f431p = fVar.f431p;
        if (fVar.f424g != null) {
            this.f424g = new Rect(fVar.f424g);
        }
    }
}
