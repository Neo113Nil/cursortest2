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
    public int f3156a;

    /* renamed from: b, reason: collision with root package name */
    public m f3157b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3158c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3159e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3160f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3161g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3162j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3163k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3164l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3156a;
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
