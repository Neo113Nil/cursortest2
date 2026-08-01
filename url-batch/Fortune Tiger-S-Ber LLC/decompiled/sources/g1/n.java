package g1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f1807a;

    /* renamed from: b, reason: collision with root package name */
    public m f1808b;
    public ColorStateList c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f1809d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1810e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f1811f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public int f1812i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1813j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1814k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f1815l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1807a;
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
