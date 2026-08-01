package k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: k0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3184a;

    /* renamed from: b, reason: collision with root package name */
    public C0226m f3185b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3186c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f3187d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3188e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3189f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3190g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3191j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3192k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3193l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3184a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0229p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0229p(this);
    }
}
