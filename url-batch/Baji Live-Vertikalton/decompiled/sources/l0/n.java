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
    public int f3133a;

    /* renamed from: b, reason: collision with root package name */
    public m f3134b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3135c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3136e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3137f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3138g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3139j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3140k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3141l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3133a;
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
