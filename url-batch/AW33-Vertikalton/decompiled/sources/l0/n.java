package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3151a;

    /* renamed from: b, reason: collision with root package name */
    public m f3152b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3153c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3154e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3155f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3156g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3157j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3158k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3159l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3151a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
