package l2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public n f2581a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f2582b;

    /* renamed from: c, reason: collision with root package name */
    public d2.a f2583c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2584e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f2585f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2586g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f2587h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2588j;

    /* renamed from: k, reason: collision with root package name */
    public float f2589k;

    /* renamed from: l, reason: collision with root package name */
    public int f2590l;

    /* renamed from: m, reason: collision with root package name */
    public float f2591m;

    /* renamed from: n, reason: collision with root package name */
    public float f2592n;

    /* renamed from: o, reason: collision with root package name */
    public int f2593o;

    /* renamed from: p, reason: collision with root package name */
    public int f2594p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f2595q;

    public h(n nVar) {
        this.d = null;
        this.f2584e = null;
        this.f2585f = null;
        this.f2586g = PorterDuff.Mode.SRC_IN;
        this.f2587h = null;
        this.i = 1.0f;
        this.f2588j = 1.0f;
        this.f2590l = 255;
        this.f2591m = 0.0f;
        this.f2592n = 0.0f;
        this.f2593o = 0;
        this.f2594p = 0;
        this.f2595q = Paint.Style.FILL_AND_STROKE;
        this.f2581a = nVar;
        this.f2583c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.f2601k = true;
        jVar.f2602l = true;
        return jVar;
    }

    public h(h hVar) {
        this.d = null;
        this.f2584e = null;
        this.f2585f = null;
        this.f2586g = PorterDuff.Mode.SRC_IN;
        this.f2587h = null;
        this.i = 1.0f;
        this.f2588j = 1.0f;
        this.f2590l = 255;
        this.f2591m = 0.0f;
        this.f2592n = 0.0f;
        this.f2593o = 0;
        this.f2594p = 0;
        this.f2595q = Paint.Style.FILL_AND_STROKE;
        this.f2581a = hVar.f2581a;
        this.f2582b = hVar.f2582b;
        this.f2583c = hVar.f2583c;
        this.f2589k = hVar.f2589k;
        this.d = hVar.d;
        this.f2584e = hVar.f2584e;
        this.f2586g = hVar.f2586g;
        this.f2585f = hVar.f2585f;
        this.f2590l = hVar.f2590l;
        this.i = hVar.i;
        this.f2594p = hVar.f2594p;
        this.f2588j = hVar.f2588j;
        this.f2591m = hVar.f2591m;
        this.f2592n = hVar.f2592n;
        this.f2593o = hVar.f2593o;
        this.f2595q = hVar.f2595q;
        if (hVar.f2587h != null) {
            this.f2587h = new Rect(hVar.f2587h);
        }
    }
}
