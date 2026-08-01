package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: l0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3143a;

    /* renamed from: b, reason: collision with root package name */
    public C0269m f3144b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3145c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3146e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3147f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3148g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3149j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3150k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3151l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3143a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0272p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0272p(this);
    }
}
