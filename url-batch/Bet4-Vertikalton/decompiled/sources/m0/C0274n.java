package m0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: m0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3172a;

    /* renamed from: b, reason: collision with root package name */
    public C0273m f3173b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3174c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3175e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3176f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3177g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3178j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3179k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3180l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3172a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0276p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0276p(this);
    }
}
