package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: l0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3234a;

    /* renamed from: b, reason: collision with root package name */
    public C0267m f3235b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3236c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3237e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3238f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3239g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3240j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3241k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3242l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3234a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0270p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0270p(this);
    }
}
