package z1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import g2.b0;
import g2.m;
import g2.o;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public Drawable.ConstantState f3660a;

    /* renamed from: b, reason: collision with root package name */
    public int f3661b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public int f3662d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3663e;

    /* renamed from: f, reason: collision with root package name */
    public int f3664f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3665i;

    /* renamed from: j, reason: collision with root package name */
    public float f3666j;

    /* renamed from: k, reason: collision with root package name */
    public int f3667k;

    /* renamed from: l, reason: collision with root package name */
    public float f3668l;

    /* renamed from: m, reason: collision with root package name */
    public int f3669m;

    /* renamed from: n, reason: collision with root package name */
    public float f3670n;

    /* renamed from: o, reason: collision with root package name */
    public int f3671o;

    /* renamed from: p, reason: collision with root package name */
    public float f3672p;

    /* renamed from: q, reason: collision with root package name */
    public int f3673q;

    /* renamed from: r, reason: collision with root package name */
    public float f3674r;

    /* renamed from: s, reason: collision with root package name */
    public int f3675s;

    /* renamed from: t, reason: collision with root package name */
    public m f3676t;

    /* renamed from: u, reason: collision with root package name */
    public int f3677u;

    /* renamed from: v, reason: collision with root package name */
    public int f3678v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3679w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f3680x;

    public b(b bVar) {
        this.f3661b = 0;
        this.c = false;
        this.f3662d = Integer.MIN_VALUE;
        this.f3663e = false;
        this.f3664f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.f3665i = Integer.MIN_VALUE;
        this.f3666j = Float.NaN;
        this.f3667k = Integer.MIN_VALUE;
        this.f3668l = Float.NaN;
        this.f3669m = Integer.MIN_VALUE;
        this.f3670n = Float.NaN;
        this.f3671o = Integer.MIN_VALUE;
        this.f3672p = Float.NaN;
        this.f3673q = Integer.MIN_VALUE;
        this.f3674r = Float.NaN;
        this.f3675s = Integer.MIN_VALUE;
        this.f3676t = null;
        this.f3677u = Integer.MIN_VALUE;
        this.f3678v = Integer.MIN_VALUE;
        this.f3679w = null;
        this.f3680x = FocusRingDrawable.f1346v;
        if (bVar != null) {
            this.f3660a = bVar.f3660a;
            this.f3661b = bVar.f3661b;
            this.c = bVar.c;
            this.f3662d = bVar.f3662d;
            this.f3663e = bVar.f3663e;
            this.f3664f = bVar.f3664f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.f3665i = bVar.f3665i;
            this.f3666j = bVar.f3666j;
            this.f3667k = bVar.f3667k;
            this.f3668l = bVar.f3668l;
            this.f3669m = bVar.f3669m;
            this.f3670n = bVar.f3670n;
            this.f3671o = bVar.f3671o;
            this.f3672p = bVar.f3672p;
            this.f3673q = bVar.f3673q;
            this.f3674r = bVar.f3674r;
            this.f3675s = bVar.f3675s;
            this.f3677u = bVar.f3677u;
            this.f3678v = bVar.f3678v;
            m mVar = bVar.f3676t;
            if (mVar instanceof o) {
                this.f3676t = ((o) mVar).j().a();
            } else if (mVar instanceof b0) {
                this.f3676t = ((b0) mVar).i().c();
            } else {
                this.f3676t = mVar;
            }
            if (bVar.f3679w != null) {
                this.f3679w = new Rect(bVar.f3679w);
            }
            int[] iArr = bVar.f3680x;
            this.f3680x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f3660a;
        return (constantState != null ? constantState.getChangingConfigurations() : 0) | this.f3661b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
