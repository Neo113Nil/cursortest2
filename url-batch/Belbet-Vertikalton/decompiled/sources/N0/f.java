package N0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f886a;

    /* renamed from: b, reason: collision with root package name */
    public G0.a f887b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f888c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f889d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f890f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f891g;

    /* renamed from: h, reason: collision with root package name */
    public final float f892h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f893k;

    /* renamed from: l, reason: collision with root package name */
    public float f894l;

    /* renamed from: m, reason: collision with root package name */
    public float f895m;

    /* renamed from: n, reason: collision with root package name */
    public int f896n;

    /* renamed from: o, reason: collision with root package name */
    public int f897o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f898p;

    public f(k kVar) {
        this.f888c = null;
        this.f889d = null;
        this.e = null;
        this.f890f = PorterDuff.Mode.SRC_IN;
        this.f891g = null;
        this.f892h = 1.0f;
        this.i = 1.0f;
        this.f893k = 255;
        this.f894l = 0.0f;
        this.f895m = 0.0f;
        this.f896n = 0;
        this.f897o = 0;
        this.f898p = Paint.Style.FILL_AND_STROKE;
        this.f886a = kVar;
        this.f887b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f888c = null;
        this.f889d = null;
        this.e = null;
        this.f890f = PorterDuff.Mode.SRC_IN;
        this.f891g = null;
        this.f892h = 1.0f;
        this.i = 1.0f;
        this.f893k = 255;
        this.f894l = 0.0f;
        this.f895m = 0.0f;
        this.f896n = 0;
        this.f897o = 0;
        this.f898p = Paint.Style.FILL_AND_STROKE;
        this.f886a = fVar.f886a;
        this.f887b = fVar.f887b;
        this.j = fVar.j;
        this.f888c = fVar.f888c;
        this.f889d = fVar.f889d;
        this.f890f = fVar.f890f;
        this.e = fVar.e;
        this.f893k = fVar.f893k;
        this.f892h = fVar.f892h;
        this.f897o = fVar.f897o;
        this.i = fVar.i;
        this.f894l = fVar.f894l;
        this.f895m = fVar.f895m;
        this.f896n = fVar.f896n;
        this.f898p = fVar.f898p;
        if (fVar.f891g != null) {
            this.f891g = new Rect(fVar.f891g);
        }
    }
}
