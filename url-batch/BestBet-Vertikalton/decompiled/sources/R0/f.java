package R0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f903a;

    /* renamed from: b, reason: collision with root package name */
    public K0.a f904b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f905c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f906e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f907f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f908g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f909j;

    /* renamed from: k, reason: collision with root package name */
    public int f910k;

    /* renamed from: l, reason: collision with root package name */
    public float f911l;

    /* renamed from: m, reason: collision with root package name */
    public float f912m;

    /* renamed from: n, reason: collision with root package name */
    public int f913n;

    /* renamed from: o, reason: collision with root package name */
    public int f914o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f915p;

    public f(k kVar) {
        this.f905c = null;
        this.d = null;
        this.f906e = null;
        this.f907f = PorterDuff.Mode.SRC_IN;
        this.f908g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f910k = 255;
        this.f911l = RecyclerView.f1937A0;
        this.f912m = RecyclerView.f1937A0;
        this.f913n = 0;
        this.f914o = 0;
        this.f915p = Paint.Style.FILL_AND_STROKE;
        this.f903a = kVar;
        this.f904b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f920e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f905c = null;
        this.d = null;
        this.f906e = null;
        this.f907f = PorterDuff.Mode.SRC_IN;
        this.f908g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f910k = 255;
        this.f911l = RecyclerView.f1937A0;
        this.f912m = RecyclerView.f1937A0;
        this.f913n = 0;
        this.f914o = 0;
        this.f915p = Paint.Style.FILL_AND_STROKE;
        this.f903a = fVar.f903a;
        this.f904b = fVar.f904b;
        this.f909j = fVar.f909j;
        this.f905c = fVar.f905c;
        this.d = fVar.d;
        this.f907f = fVar.f907f;
        this.f906e = fVar.f906e;
        this.f910k = fVar.f910k;
        this.h = fVar.h;
        this.f914o = fVar.f914o;
        this.i = fVar.i;
        this.f911l = fVar.f911l;
        this.f912m = fVar.f912m;
        this.f913n = fVar.f913n;
        this.f915p = fVar.f915p;
        if (fVar.f908g != null) {
            this.f908g = new Rect(fVar.f908g);
        }
    }
}
