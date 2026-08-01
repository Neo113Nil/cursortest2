package q0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: q0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3979a;

    /* renamed from: b, reason: collision with root package name */
    public C0344m f3980b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3981c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f3982d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3983f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3984g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3985h;
    public int i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3986k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3987l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3979a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0347p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0347p(this);
    }
}
