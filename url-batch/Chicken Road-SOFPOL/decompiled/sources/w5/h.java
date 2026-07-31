package w5;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public n f8087a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f8088b;

    /* renamed from: c, reason: collision with root package name */
    public q5.a f8089c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f8090d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f8091e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f8092f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f8093g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f8094h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public float f8095j;

    /* renamed from: k, reason: collision with root package name */
    public float f8096k;

    /* renamed from: l, reason: collision with root package name */
    public int f8097l;

    /* renamed from: m, reason: collision with root package name */
    public float f8098m;

    /* renamed from: n, reason: collision with root package name */
    public float f8099n;

    /* renamed from: o, reason: collision with root package name */
    public int f8100o;

    /* renamed from: p, reason: collision with root package name */
    public int f8101p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f8102q;

    public h(n nVar) {
        this.f8090d = null;
        this.f8091e = null;
        this.f8092f = null;
        this.f8093g = PorterDuff.Mode.SRC_IN;
        this.f8094h = null;
        this.i = 1.0f;
        this.f8095j = 1.0f;
        this.f8097l = 255;
        this.f8098m = 0.0f;
        this.f8099n = 0.0f;
        this.f8100o = 0;
        this.f8101p = 0;
        this.f8102q = Paint.Style.FILL_AND_STROKE;
        this.f8087a = nVar;
        this.f8089c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.i = true;
        jVar.f8109j = true;
        return jVar;
    }

    public h(h hVar) {
        this.f8090d = null;
        this.f8091e = null;
        this.f8092f = null;
        this.f8093g = PorterDuff.Mode.SRC_IN;
        this.f8094h = null;
        this.i = 1.0f;
        this.f8095j = 1.0f;
        this.f8097l = 255;
        this.f8098m = 0.0f;
        this.f8099n = 0.0f;
        this.f8100o = 0;
        this.f8101p = 0;
        this.f8102q = Paint.Style.FILL_AND_STROKE;
        this.f8087a = hVar.f8087a;
        this.f8088b = hVar.f8088b;
        this.f8089c = hVar.f8089c;
        this.f8096k = hVar.f8096k;
        this.f8090d = hVar.f8090d;
        this.f8091e = hVar.f8091e;
        this.f8093g = hVar.f8093g;
        this.f8092f = hVar.f8092f;
        this.f8097l = hVar.f8097l;
        this.i = hVar.i;
        this.f8101p = hVar.f8101p;
        this.f8095j = hVar.f8095j;
        this.f8098m = hVar.f8098m;
        this.f8099n = hVar.f8099n;
        this.f8100o = hVar.f8100o;
        this.f8102q = hVar.f8102q;
        if (hVar.f8094h != null) {
            this.f8094h = new Rect(hVar.f8094h);
        }
    }
}
