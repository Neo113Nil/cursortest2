package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: l0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3090a;

    /* renamed from: b, reason: collision with root package name */
    public C0270m f3091b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3092c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3093e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3094f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3095g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3096j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3097k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3098l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3090a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0273p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0273p(this);
    }
}
