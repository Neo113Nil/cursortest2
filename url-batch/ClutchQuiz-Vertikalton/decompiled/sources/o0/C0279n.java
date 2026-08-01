package o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: o0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3289a;

    /* renamed from: b, reason: collision with root package name */
    public C0278m f3290b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3291c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3292e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3293f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3294g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3295j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3296k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3297l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3289a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0281p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0281p(this);
    }
}
