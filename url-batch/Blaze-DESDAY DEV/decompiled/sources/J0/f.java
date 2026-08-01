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
    public k f338a;

    /* renamed from: b, reason: collision with root package name */
    public C0.a f339b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f340c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f341e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f342f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f343g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f344j;

    /* renamed from: k, reason: collision with root package name */
    public int f345k;

    /* renamed from: l, reason: collision with root package name */
    public float f346l;

    /* renamed from: m, reason: collision with root package name */
    public float f347m;

    /* renamed from: n, reason: collision with root package name */
    public int f348n;

    /* renamed from: o, reason: collision with root package name */
    public int f349o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f350p;

    public f(k kVar) {
        this.f340c = null;
        this.d = null;
        this.f341e = null;
        this.f342f = PorterDuff.Mode.SRC_IN;
        this.f343g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f345k = 255;
        this.f346l = RecyclerView.f1559A0;
        this.f347m = RecyclerView.f1559A0;
        this.f348n = 0;
        this.f349o = 0;
        this.f350p = Paint.Style.FILL_AND_STROKE;
        this.f338a = kVar;
        this.f339b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f355e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f340c = null;
        this.d = null;
        this.f341e = null;
        this.f342f = PorterDuff.Mode.SRC_IN;
        this.f343g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f345k = 255;
        this.f346l = RecyclerView.f1559A0;
        this.f347m = RecyclerView.f1559A0;
        this.f348n = 0;
        this.f349o = 0;
        this.f350p = Paint.Style.FILL_AND_STROKE;
        this.f338a = fVar.f338a;
        this.f339b = fVar.f339b;
        this.f344j = fVar.f344j;
        this.f340c = fVar.f340c;
        this.d = fVar.d;
        this.f342f = fVar.f342f;
        this.f341e = fVar.f341e;
        this.f345k = fVar.f345k;
        this.h = fVar.h;
        this.f349o = fVar.f349o;
        this.i = fVar.i;
        this.f346l = fVar.f346l;
        this.f347m = fVar.f347m;
        this.f348n = fVar.f348n;
        this.f350p = fVar.f350p;
        if (fVar.f343g != null) {
            this.f343g = new Rect(fVar.f343g);
        }
    }
}
