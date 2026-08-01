package K0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f382a;

    /* renamed from: b, reason: collision with root package name */
    public D0.a f383b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f384c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f385e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f386f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f387g;

    /* renamed from: h, reason: collision with root package name */
    public final float f388h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f389j;

    /* renamed from: k, reason: collision with root package name */
    public int f390k;

    /* renamed from: l, reason: collision with root package name */
    public float f391l;

    /* renamed from: m, reason: collision with root package name */
    public float f392m;

    /* renamed from: n, reason: collision with root package name */
    public int f393n;

    /* renamed from: o, reason: collision with root package name */
    public int f394o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f395p;

    public f(k kVar) {
        this.f384c = null;
        this.d = null;
        this.f385e = null;
        this.f386f = PorterDuff.Mode.SRC_IN;
        this.f387g = null;
        this.f388h = 1.0f;
        this.i = 1.0f;
        this.f390k = 255;
        this.f391l = RecyclerView.A0;
        this.f392m = RecyclerView.A0;
        this.f393n = 0;
        this.f394o = 0;
        this.f395p = Paint.Style.FILL_AND_STROKE;
        this.f382a = kVar;
        this.f383b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f400e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f384c = null;
        this.d = null;
        this.f385e = null;
        this.f386f = PorterDuff.Mode.SRC_IN;
        this.f387g = null;
        this.f388h = 1.0f;
        this.i = 1.0f;
        this.f390k = 255;
        this.f391l = RecyclerView.A0;
        this.f392m = RecyclerView.A0;
        this.f393n = 0;
        this.f394o = 0;
        this.f395p = Paint.Style.FILL_AND_STROKE;
        this.f382a = fVar.f382a;
        this.f383b = fVar.f383b;
        this.f389j = fVar.f389j;
        this.f384c = fVar.f384c;
        this.d = fVar.d;
        this.f386f = fVar.f386f;
        this.f385e = fVar.f385e;
        this.f390k = fVar.f390k;
        this.f388h = fVar.f388h;
        this.f394o = fVar.f394o;
        this.i = fVar.i;
        this.f391l = fVar.f391l;
        this.f392m = fVar.f392m;
        this.f393n = fVar.f393n;
        this.f395p = fVar.f395p;
        if (fVar.f387g != null) {
            this.f387g = new Rect(fVar.f387g);
        }
    }
}
