package J0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f321a;

    /* renamed from: b, reason: collision with root package name */
    public C0.a f322b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f323c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f324e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f325f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f326g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f327j;

    /* renamed from: k, reason: collision with root package name */
    public int f328k;

    /* renamed from: l, reason: collision with root package name */
    public float f329l;

    /* renamed from: m, reason: collision with root package name */
    public float f330m;

    /* renamed from: n, reason: collision with root package name */
    public int f331n;

    /* renamed from: o, reason: collision with root package name */
    public int f332o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f333p;

    public f(k kVar) {
        this.f323c = null;
        this.d = null;
        this.f324e = null;
        this.f325f = PorterDuff.Mode.SRC_IN;
        this.f326g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f328k = 255;
        this.f329l = RecyclerView.f1530C0;
        this.f330m = RecyclerView.f1530C0;
        this.f331n = 0;
        this.f332o = 0;
        this.f333p = Paint.Style.FILL_AND_STROKE;
        this.f321a = kVar;
        this.f322b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f338e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f323c = null;
        this.d = null;
        this.f324e = null;
        this.f325f = PorterDuff.Mode.SRC_IN;
        this.f326g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f328k = 255;
        this.f329l = RecyclerView.f1530C0;
        this.f330m = RecyclerView.f1530C0;
        this.f331n = 0;
        this.f332o = 0;
        this.f333p = Paint.Style.FILL_AND_STROKE;
        this.f321a = fVar.f321a;
        this.f322b = fVar.f322b;
        this.f327j = fVar.f327j;
        this.f323c = fVar.f323c;
        this.d = fVar.d;
        this.f325f = fVar.f325f;
        this.f324e = fVar.f324e;
        this.f328k = fVar.f328k;
        this.h = fVar.h;
        this.f332o = fVar.f332o;
        this.i = fVar.i;
        this.f329l = fVar.f329l;
        this.f330m = fVar.f330m;
        this.f331n = fVar.f331n;
        this.f333p = fVar.f333p;
        if (fVar.f326g != null) {
            this.f326g = new Rect(fVar.f326g);
        }
    }
}
