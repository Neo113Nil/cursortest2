package k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: k0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3188a;

    /* renamed from: b, reason: collision with root package name */
    public C0228m f3189b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3190c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f3191d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3192e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3193f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3194g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3195j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3196k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3197l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3188a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0231p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0231p(this);
    }
}
