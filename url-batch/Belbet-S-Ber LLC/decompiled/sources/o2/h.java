package o2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public m f2940a;

    /* renamed from: b, reason: collision with root package name */
    public e2.a f2941b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2942c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2943e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f2944f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f2945g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2946j;

    /* renamed from: k, reason: collision with root package name */
    public int f2947k;

    /* renamed from: l, reason: collision with root package name */
    public float f2948l;

    /* renamed from: m, reason: collision with root package name */
    public float f2949m;

    /* renamed from: n, reason: collision with root package name */
    public int f2950n;

    /* renamed from: o, reason: collision with root package name */
    public int f2951o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f2952p;

    public h(m mVar) {
        this.f2942c = null;
        this.d = null;
        this.f2943e = null;
        this.f2944f = PorterDuff.Mode.SRC_IN;
        this.f2945g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f2947k = 255;
        this.f2948l = 0.0f;
        this.f2949m = 0.0f;
        this.f2950n = 0;
        this.f2951o = 0;
        this.f2952p = Paint.Style.FILL_AND_STROKE;
        this.f2940a = mVar;
        this.f2941b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.f2957k = true;
        jVar.f2958l = true;
        return jVar;
    }

    public h(h hVar) {
        this.f2942c = null;
        this.d = null;
        this.f2943e = null;
        this.f2944f = PorterDuff.Mode.SRC_IN;
        this.f2945g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f2947k = 255;
        this.f2948l = 0.0f;
        this.f2949m = 0.0f;
        this.f2950n = 0;
        this.f2951o = 0;
        this.f2952p = Paint.Style.FILL_AND_STROKE;
        this.f2940a = hVar.f2940a;
        this.f2941b = hVar.f2941b;
        this.f2946j = hVar.f2946j;
        this.f2942c = hVar.f2942c;
        this.d = hVar.d;
        this.f2944f = hVar.f2944f;
        this.f2943e = hVar.f2943e;
        this.f2947k = hVar.f2947k;
        this.h = hVar.h;
        this.f2951o = hVar.f2951o;
        this.i = hVar.i;
        this.f2948l = hVar.f2948l;
        this.f2949m = hVar.f2949m;
        this.f2950n = hVar.f2950n;
        this.f2952p = hVar.f2952p;
        if (hVar.f2945g != null) {
            this.f2945g = new Rect(hVar.f2945g);
        }
    }
}
