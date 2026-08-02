package S;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f1050a;

    /* renamed from: b, reason: collision with root package name */
    public n f1051b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1052c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f1053d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1054e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f1055f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1056g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1057h;

    /* renamed from: i, reason: collision with root package name */
    public int f1058i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1059j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1060k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f1061l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1050a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
