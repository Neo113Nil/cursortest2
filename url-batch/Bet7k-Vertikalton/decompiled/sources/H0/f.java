package H0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f242a;

    /* renamed from: b, reason: collision with root package name */
    public A0.a f243b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f244c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f245e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f246f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f247g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f248j;

    /* renamed from: k, reason: collision with root package name */
    public int f249k;

    /* renamed from: l, reason: collision with root package name */
    public float f250l;

    /* renamed from: m, reason: collision with root package name */
    public float f251m;

    /* renamed from: n, reason: collision with root package name */
    public int f252n;

    /* renamed from: o, reason: collision with root package name */
    public int f253o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f254p;

    public f(k kVar) {
        this.f244c = null;
        this.d = null;
        this.f245e = null;
        this.f246f = PorterDuff.Mode.SRC_IN;
        this.f247g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f249k = 255;
        this.f250l = 0.0f;
        this.f251m = 0.0f;
        this.f252n = 0;
        this.f253o = 0;
        this.f254p = Paint.Style.FILL_AND_STROKE;
        this.f242a = kVar;
        this.f243b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f259e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f244c = null;
        this.d = null;
        this.f245e = null;
        this.f246f = PorterDuff.Mode.SRC_IN;
        this.f247g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f249k = 255;
        this.f250l = 0.0f;
        this.f251m = 0.0f;
        this.f252n = 0;
        this.f253o = 0;
        this.f254p = Paint.Style.FILL_AND_STROKE;
        this.f242a = fVar.f242a;
        this.f243b = fVar.f243b;
        this.f248j = fVar.f248j;
        this.f244c = fVar.f244c;
        this.d = fVar.d;
        this.f246f = fVar.f246f;
        this.f245e = fVar.f245e;
        this.f249k = fVar.f249k;
        this.h = fVar.h;
        this.f253o = fVar.f253o;
        this.i = fVar.i;
        this.f250l = fVar.f250l;
        this.f251m = fVar.f251m;
        this.f252n = fVar.f252n;
        this.f254p = fVar.f254p;
        if (fVar.f247g != null) {
            this.f247g = new Rect(fVar.f247g);
        }
    }
}
