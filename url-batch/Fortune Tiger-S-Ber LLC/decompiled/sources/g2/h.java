package g2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public m f1843a;

    /* renamed from: b, reason: collision with root package name */
    public y1.a f1844b;
    public ColorStateList c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1845d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1846e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1847f;
    public Rect g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public float f1848i;

    /* renamed from: j, reason: collision with root package name */
    public float f1849j;

    /* renamed from: k, reason: collision with root package name */
    public int f1850k;

    /* renamed from: l, reason: collision with root package name */
    public float f1851l;

    /* renamed from: m, reason: collision with root package name */
    public float f1852m;

    /* renamed from: n, reason: collision with root package name */
    public int f1853n;

    /* renamed from: o, reason: collision with root package name */
    public int f1854o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f1855p;

    public h(m mVar) {
        this.c = null;
        this.f1845d = null;
        this.f1846e = null;
        this.f1847f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.f1848i = 1.0f;
        this.f1850k = 255;
        this.f1851l = 0.0f;
        this.f1852m = 0.0f;
        this.f1853n = 0;
        this.f1854o = 0;
        this.f1855p = Paint.Style.FILL_AND_STROKE;
        this.f1843a = mVar;
        this.f1844b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.f1860k = true;
        jVar.f1861l = true;
        return jVar;
    }

    public h(h hVar) {
        this.c = null;
        this.f1845d = null;
        this.f1846e = null;
        this.f1847f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.f1848i = 1.0f;
        this.f1850k = 255;
        this.f1851l = 0.0f;
        this.f1852m = 0.0f;
        this.f1853n = 0;
        this.f1854o = 0;
        this.f1855p = Paint.Style.FILL_AND_STROKE;
        this.f1843a = hVar.f1843a;
        this.f1844b = hVar.f1844b;
        this.f1849j = hVar.f1849j;
        this.c = hVar.c;
        this.f1845d = hVar.f1845d;
        this.f1847f = hVar.f1847f;
        this.f1846e = hVar.f1846e;
        this.f1850k = hVar.f1850k;
        this.h = hVar.h;
        this.f1854o = hVar.f1854o;
        this.f1848i = hVar.f1848i;
        this.f1851l = hVar.f1851l;
        this.f1852m = hVar.f1852m;
        this.f1853n = hVar.f1853n;
        this.f1855p = hVar.f1855p;
        if (hVar.g != null) {
            this.g = new Rect(hVar.g);
        }
    }
}
