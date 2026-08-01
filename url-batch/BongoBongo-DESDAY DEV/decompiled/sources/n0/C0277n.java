package n0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: n0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3366a;

    /* renamed from: b, reason: collision with root package name */
    public C0276m f3367b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3368c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3369e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3370f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3371g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3372h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3373j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3374k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3375l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3366a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0279p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0279p(this);
    }
}
