package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f2682a;

    /* renamed from: b, reason: collision with root package name */
    public l f2683b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2684c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2685e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f2686f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2687g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2688j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2689k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f2690l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2682a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new o(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }
}
